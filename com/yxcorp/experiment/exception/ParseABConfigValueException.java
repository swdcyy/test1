package com.yxcorp.experiment.exception.ParseABConfigValueException;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class ParseABConfigValueException extends Exception	// class@0011e5
{
    public final Throwable mCause;
    public final String mConfigJson;
    public final String mKey;
    public final String mTypeString;

    public void ParseABConfigValueException(String p0,String p1,String p2,Throwable p3){
       super(p3);
       this.mKey = p0;
       this.mConfigJson = p1;
       this.mTypeString = p2;
       this.mCause = p3;
    }
    public String toString(){
       return super.toString()+"; Key:"+this.mKey+"; configJson: "+this.mConfigJson+"; typeString:"+this.mTypeString;
    }
}
