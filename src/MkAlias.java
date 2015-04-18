import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;


/**
 * CommandLineTools
 * @author samtebbs, 16:14:11 - 18 Apr 2015
 */
public class MkAlias {
    
    public static String aliasFilePath = "~/.bash_profile", command = "";

    public static void main(String[] args) {
	
	Options options = new Options();
	options.addOption("p", true, "Specifiy an alias file path");
	options.addOption("c", true, "Specify a command to run after the dirtag has been made");
	
	CommandLineParser parser  = new GnuParser();
	CommandLine cmd = null;
	try {
	    cmd = parser.parse(options, args);
	} catch (ParseException e) {
	    System.err.println("Invalid argument: " + e.getMessage());
	    return;
	}
	String arg;
	if((arg = cmd.getOptionValue("p")) != null) aliasFilePath = arg;
	if((arg = cmd.getOptionValue("c")) != null) command = arg;
	
	if(cmd.getArgList().size() > 1){
	    String alias = cmd.getArgList().get(0).toString(), aliasCommand = cmd.getArgList().get(1).toString();
	    try {
		Environment.makeSystemAlias(aliasFilePath, alias, aliasCommand, command);
	    } catch (IOException e) {
		System.err.println(String.format("Could not create alias (%s) in %s; %s", alias, aliasFilePath, e.getMessage()));
	    }
	}else{
	    System.err.println("Expected alias name and command");
	}

    }

}
