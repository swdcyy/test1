package com.google.gson.JsonSyntaxException;
import com.google.gson.JsonParseException;
import java.lang.String;
import java.lang.Throwable;

public final class JsonSyntaxException extends JsonParseException	// class@000559
{
    public static final long serialVersionUID = 0x1;

    public void JsonSyntaxException(String p0){
       super(p0);
    }
    public void JsonSyntaxException(String p0,Throwable p1){
       super(p0, p1);
    }
    public void JsonSyntaxException(Throwable p0){
       super(p0);
    }
}
