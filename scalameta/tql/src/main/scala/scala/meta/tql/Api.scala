package scala.meta
package tql

import org.scalameta.algebra._
import scala.language.implicitConversions
import scala.meta.internal.tql._
import scala.meta.internal.{ast => impl}

// TODO: The current incarnation of the traversal/transformation API is very generic (that is interesting)
// but also contains a lot of moving parts, e.g. see things like EvaluatorMetaCollector (that is daunting).
// We need to study how accessible this is for the users and see where to go from there.
private[meta] trait BasicTqlApi {
  implicit def collectionLikeUI[V <: Tree](v: V): Evaluator[V] = new Evaluator[V](v)
  implicit def forceResultUI[V, A : Monoid, R](x: EvaluatorAndThen[V, A]): ForceResult[V, A, R] = new ForceResult[V, A, R](x)
}

object basicApi extends BasicTqlApi