package io.netty.util.internal.logging.InternalLogLevel;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class InternalLogLevel extends Enum	// class@001189
{
    public static final InternalLogLevel[] $VALUES;
    public static final InternalLogLevel DEBUG;
    public static final InternalLogLevel ERROR;
    public static final InternalLogLevel INFO;
    public static final InternalLogLevel TRACE;
    public static final InternalLogLevel WARN;

    static {
       InternalLogLevel internalLogL = new InternalLogLevel("TRACE", 0);
       InternalLogLevel.TRACE = internalLogL;
       InternalLogLevel internalLogL1 = new InternalLogLevel("DEBUG", 1);
       InternalLogLevel.DEBUG = internalLogL1;
       InternalLogLevel internalLogL2 = new InternalLogLevel("INFO", 2);
       InternalLogLevel.INFO = internalLogL2;
       InternalLogLevel internalLogL3 = new InternalLogLevel("WARN", 3);
       InternalLogLevel.WARN = internalLogL3;
       InternalLogLevel internalLogL4 = new InternalLogLevel("ERROR", 4);
       InternalLogLevel.ERROR = internalLogL4;
       InternalLogLevel[] internalLogL5 = new InternalLogLevel[]{internalLogL,internalLogL1,internalLogL2,internalLogL3,internalLogL4};
       InternalLogLevel.$VALUES = internalLogL5;
    }
    public void InternalLogLevel(String p0,int p1){
       super(p0, p1);
    }
    public static InternalLogLevel valueOf(String p0){
       return Enum.valueOf(InternalLogLevel.class, p0);
    }
    public static InternalLogLevel[] values(){
       return InternalLogLevel.$VALUES.clone();
    }
}
