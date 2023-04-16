package com.kuaishou.webkit.ParseException;
import java.lang.RuntimeException;
import java.lang.String;

public class ParseException extends RuntimeException	// class@001254
{
    public String response;

    public void ParseException(String p0){
       super();
       this.response = p0;
    }
}
