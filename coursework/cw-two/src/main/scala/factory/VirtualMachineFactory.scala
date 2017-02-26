package factory

import bc.{ByteCodeFactory, ByteCodeParser}
import vendor.{PublicProgramParser, ProgramParser}
import vm.{PublicVirtualMachine, VirtualMachine, VirtualMachineParser}

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {
  // TODO
  def byteCodeFactory: ByteCodeFactory = ???

  def vendorParser: ProgramParser = new PublicProgramParser

  // TODO
  def byteCodeParser: ByteCodeParser = ???

  // TODO
  def virtualMachineParser: VirtualMachineParser = ???

  def virtualMachine: VirtualMachine = new PublicVirtualMachine(Vector[Int]())

}
