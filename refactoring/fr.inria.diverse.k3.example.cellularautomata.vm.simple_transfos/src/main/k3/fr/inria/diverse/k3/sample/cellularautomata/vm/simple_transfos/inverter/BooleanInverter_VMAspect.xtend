package fr.inria.diverse.k3.sample.cellularautomata.vm.simple_transfos.inverter

import fr.inria.triskell.k3.Aspect
import vm.Cell
import vm.Universe


import static extension fr.inria.diverse.k3.sample.cellularautomata.vm.simple_transfos.inverter.CellAspect.*

@Aspect(className=typeof(Universe))
class UniverseAspect{
	public def void invert(){
		_self.cells.forEach[cell | cell.invert()]
	}
}

@Aspect(className=typeof(Cell))
class CellAspect{
	public def void invert(){
		if(_self.^val == 0) _self.^val = 1
		else _self.^val = 0
	}
}