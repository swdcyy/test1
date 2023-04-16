package io.reactivex.internal.util.ErrorMode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ErrorMode extends Enum	// class@001950
{
    public static final ErrorMode[] $VALUES;
    public static final ErrorMode BOUNDARY;
    public static final ErrorMode END;
    public static final ErrorMode IMMEDIATE;

    static {
       ErrorMode uErrorMode = new ErrorMode("IMMEDIATE", 0);
       ErrorMode.IMMEDIATE = uErrorMode;
       ErrorMode uErrorMode1 = new ErrorMode("BOUNDARY", 1);
       ErrorMode.BOUNDARY = uErrorMode1;
       ErrorMode uErrorMode2 = new ErrorMode("END", 2);
       ErrorMode.END = uErrorMode2;
       ErrorMode[] uErrorModeAr = new ErrorMode[]{uErrorMode,uErrorMode1,uErrorMode2};
       ErrorMode.$VALUES = uErrorModeAr;
    }
    public void ErrorMode(String p0,int p1){
       super(p0, p1);
    }
    public static ErrorMode valueOf(String p0){
       return Enum.valueOf(ErrorMode.class, p0);
    }
    public static ErrorMode[] values(){
       return ErrorMode.$VALUES.clone();
    }
}
