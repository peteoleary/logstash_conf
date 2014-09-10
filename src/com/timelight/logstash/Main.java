package com.timelight.logstash;

import com.timelight.logstash.parser.logstash_confLexer;
import com.timelight.logstash.parser.logstash_confParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by Peter O'Leary on 9/9/14.
 */
public class Main {

    static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public static void main(String [] args) throws IOException {
        logstash_confLexer lexer = new logstash_confLexer(new ANTLRInputStream(readFile(args[0], Charset.defaultCharset())));

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        logstash_confParser parser = new logstash_confParser(tokens);

        parser.setTrace(true);
        parser.config();
    }
}
