package scala.meta

import scala.meta.internal.hosts.scalac.contexts.{Compiler => Compiler}
import scala.meta.internal.hosts.scalac.contexts.{Proxy => ProxyImpl}

object Toolbox {
  def apply(artifacts: Artifact*)(implicit taxonomy: TaxonomicContext): Toolbox = {
    new ProxyImpl(Compiler(), Domain(artifacts: _*)) {
      override def toString = s"Toolbox(${artifacts.mkString(", ")})"
    }
  }

  def apply(options: String, artifacts: Artifact*)(implicit taxonomy: TaxonomicContext): Toolbox = {
    new ProxyImpl(Compiler(options), Domain(artifacts: _*)) {
      override def toString = s"Toolbox(${artifacts.mkString(", ")})"
    }
  }
}

trait Toolbox extends Mirror with SemanticContext with InteractiveContext
