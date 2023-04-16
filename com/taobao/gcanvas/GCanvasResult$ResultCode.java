package com.taobao.gcanvas.GCanvasResult$ResultCode;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class GCanvasResult$ResultCode extends Enum	// class@000dee
{
    public static final GCanvasResult$ResultCode[] $VALUES;
    public static final GCanvasResult$ResultCode ERROR;
    public static final GCanvasResult$ResultCode NO_RESULT;
    public static final GCanvasResult$ResultCode OK;

    static {
       GCanvasResult$ResultCode resultCode = new GCanvasResult$ResultCode("NO_RESULT", 0);
       GCanvasResult$ResultCode.NO_RESULT = resultCode;
       GCanvasResult$ResultCode resultCode1 = new GCanvasResult$ResultCode("OK", 1);
       GCanvasResult$ResultCode.OK = resultCode1;
       GCanvasResult$ResultCode resultCode2 = new GCanvasResult$ResultCode("ERROR", 2);
       GCanvasResult$ResultCode.ERROR = resultCode2;
       GCanvasResult$ResultCode[] resultCodeAr = new GCanvasResult$ResultCode[]{resultCode,resultCode1,resultCode2};
       GCanvasResult$ResultCode.$VALUES = resultCodeAr;
    }
    public void GCanvasResult$ResultCode(String p0,int p1){
       super(p0, p1);
    }
    public static GCanvasResult$ResultCode valueOf(String p0){
       return Enum.valueOf(GCanvasResult$ResultCode.class, p0);
    }
    public static GCanvasResult$ResultCode[] values(){
       return GCanvasResult$ResultCode.$VALUES.clone();
    }
}
