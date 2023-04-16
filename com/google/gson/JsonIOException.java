package com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import java.lang.String;
import java.lang.Throwable;

public final class JsonIOException extends JsonParseException	// class@000556
{
    public static final long serialVersionUID = 0x1;

    public void JsonIOException(String p0){
       super(p0);
    }
    public void JsonIOException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void JsonIOException(Throwable p0){
       super(p0);
    }
}
