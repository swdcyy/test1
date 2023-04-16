package com.facebook.react.common.JavascriptException;
import vd.b;
import java.lang.RuntimeException;
import java.lang.String;

public class JavascriptException extends RuntimeException implements b	// class@001259
{
    public String extraDataAsJson;

    public void JavascriptException(String p0){
       super(p0);
    }
    public String getExtraDataAsJson(){
       return this.extraDataAsJson;
    }
    public JavascriptException setExtraDataAsJson(String p0){
       this.extraDataAsJson = p0;
       return this;
    }
}
