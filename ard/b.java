package ard.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import io.netty.util.internal.logging.InternalLogLevel;

public interface abstract b	// class@000227
{

    void debug(String p0);
    void debug(String p0,Object p1);
    void debug(String p0,Object p1,Object p2);
    void debug(String p0,Throwable p1);
    void debug(String p0,Object[] p1);
    void debug(Throwable p0);
    void error(String p0);
    void error(String p0,Object p1);
    void error(String p0,Object p1,Object p2);
    void error(String p0,Throwable p1);
    void error(String p0,Object[] p1);
    void error(Throwable p0);
    void info(String p0);
    void info(String p0,Object p1);
    void info(String p0,Object p1,Object p2);
    void info(String p0,Throwable p1);
    void info(String p0,Object[] p1);
    void info(Throwable p0);
    boolean isDebugEnabled();
    boolean isEnabled(InternalLogLevel p0);
    boolean isErrorEnabled();
    boolean isInfoEnabled();
    boolean isTraceEnabled();
    boolean isWarnEnabled();
    void log(InternalLogLevel p0,String p1);
    void log(InternalLogLevel p0,String p1,Object p2);
    void log(InternalLogLevel p0,String p1,Object p2,Object p3);
    void log(InternalLogLevel p0,String p1,Throwable p2);
    void log(InternalLogLevel p0,String p1,Object[] p2);
    void log(InternalLogLevel p0,Throwable p1);
    String name();
    void trace(String p0);
    void trace(String p0,Object p1);
    void trace(String p0,Object p1,Object p2);
    void trace(String p0,Throwable p1);
    void trace(String p0,Object[] p1);
    void trace(Throwable p0);
    void warn(String p0);
    void warn(String p0,Object p1);
    void warn(String p0,Object p1,Object p2);
    void warn(String p0,Throwable p1);
    void warn(String p0,Object[] p1);
    void warn(Throwable p0);
}
