package com.google.gson.JsonParseException;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;

public class JsonParseException extends RuntimeException	// class@000558
{
    public static final long serialVersionUID = 0xc74904bdb8787122;

    public void JsonParseException(String p0){
       super(p0);
    }
    public void JsonParseException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void JsonParseException(Throwable p0){
       super(p0);
    }
}
