package com.facebook.react.devsupport.RedBoxHandler$ErrorType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RedBoxHandler$ErrorType extends Enum	// class@00125d
{
    public final String name;
    public static final RedBoxHandler$ErrorType[] $VALUES;
    public static final RedBoxHandler$ErrorType JS;
    public static final RedBoxHandler$ErrorType NATIVE;

    static {
       RedBoxHandler$ErrorType uErrorType = new RedBoxHandler$ErrorType("JS", 0, "JS");
       RedBoxHandler$ErrorType.JS = uErrorType;
       RedBoxHandler$ErrorType uErrorType1 = new RedBoxHandler$ErrorType("NATIVE", 1, "Native");
       RedBoxHandler$ErrorType.NATIVE = uErrorType1;
       RedBoxHandler$ErrorType[] uErrorTypeAr = new RedBoxHandler$ErrorType[]{uErrorType,uErrorType1};
       RedBoxHandler$ErrorType.$VALUES = uErrorTypeAr;
    }
    public void RedBoxHandler$ErrorType(String p0,int p1,String p2){
       super(p0, p1);
       this.name = p2;
    }
    public static RedBoxHandler$ErrorType valueOf(String p0){
       return Enum.valueOf(RedBoxHandler$ErrorType.class, p0);
    }
    public static RedBoxHandler$ErrorType[] values(){
       return RedBoxHandler$ErrorType.$VALUES.clone();
    }
    public String getName(){
       return this.name;
    }
}
