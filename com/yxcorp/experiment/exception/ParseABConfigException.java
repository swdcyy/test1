package com.yxcorp.experiment.exception.ParseABConfigException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class ParseABConfigException extends Exception	// class@001016
{
    public final Throwable mCause;
    public final String mConfigJson;
    public final String mKey;

    public void ParseABConfigException(String p0,String p1,Throwable p2){
       super(p2);
       this.mKey = p0;
       this.mConfigJson = p1;
       this.mCause = p2;
    }
    public String toString(){
       return super.toString()+"; Key:"+this.mKey+"; configJson: "+this.mConfigJson;
    }
}
