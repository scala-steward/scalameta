package scala.meta
package interactive

import org.scalameta.annotations._
import scala.{Seq => _}
import scala.collection.immutable.Seq
import scala.meta.taxonomic.Artifact

private[meta] trait InteractiveApi {
  type InteractiveContext = scala.meta.interactive.Context

  implicit class XtensionInteractiveContextLoadArtifacts(c: InteractiveContext) {
    def load(artifact: Artifact): Artifact = {
      val Seq(artifact1) = c.load(List(artifact))
      artifact1
    }

    def load(artifacts: Artifact*): Seq[Artifact] = {
      c.load(artifacts.toList)
    }
  }

  implicit class XtensionInteractiveContextLoadSources(c: InteractiveContext) {
    def load(source: Source): Source = {
      val artifact = Artifact.Adhoc(List(source))
      val Seq(scala.meta.taxonomic.Artifact.Adhoc(Seq(source1), _, _)) = c.load(List(artifact))
      source1
    }

    def load(sources: Source*): Seq[Source] = {
      val artifact = Artifact.Adhoc(sources.toList)
      val Seq(scala.meta.taxonomic.Artifact.Adhoc(sources1, _, _)) = c.load(List(artifact))
      sources1
    }
  }
}

object api extends InteractiveApi