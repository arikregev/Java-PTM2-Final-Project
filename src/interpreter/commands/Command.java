package interpreter.commands;

import interpreter.symboles.SymbolTable;
import interpreter.symboles.SymbolTable.SymbolException;
/**
 * This interface is being Inherited by every Command
 * that will be able to use in our newly invented Language.

 * @author Arik Regev
 */
public interface Command {
	@SuppressWarnings("serial")
	public static class ParseErrorException extends Exception {}
	
	public void doCommand(SymbolTable symTable) throws SymbolException; 
	
}
