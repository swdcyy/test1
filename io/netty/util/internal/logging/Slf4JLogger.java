package io.netty.util.internal.logging.Slf4JLogger;
import io.netty.util.internal.logging.AbstractInternalLogger;
import exd.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;

public class Slf4JLogger extends AbstractInternalLogger	// class@00118c
{
    public final c b;
    public static final long serialVersionUID = 0x17fd4df8ccb9c49;

    public void Slf4JLogger(c p0){
       super(p0.getName());
       this.b = p0;
    }
    public void debug(String p0){
       this.b.debug(p0);
    }
    public void debug(String p0,Object p1){
       this.b.debug(p0, p1);
    }
    public void debug(String p0,Object p1,Object p2){
       this.b.debug(p0, p1, p2);
    }
    public void debug(String p0,Throwable p1){
       this.b.debug(p0, p1);
    }
    public void debug(String p0,Object[] p1){
       this.b.debug(p0, p1);
    }
    public void error(String p0){
       this.b.error(p0);
    }
    public void error(String p0,Object p1){
       this.b.error(p0, p1);
    }
    public void error(String p0,Object p1,Object p2){
       this.b.error(p0, p1, p2);
    }
    public void error(String p0,Throwable p1){
       this.b.error(p0, p1);
    }
    public void error(String p0,Object[] p1){
       this.b.error(p0, p1);
    }
    public void info(String p0){
       this.b.info(p0);
    }
    public void info(String p0,Object p1){
       this.b.info(p0, p1);
    }
    public void info(String p0,Object p1,Object p2){
       this.b.info(p0, p1, p2);
    }
    public void info(String p0,Throwable p1){
       this.b.info(p0, p1);
    }
    public void info(String p0,Object[] p1){
       this.b.info(p0, p1);
    }
    public boolean isDebugEnabled(){
       return this.b.isDebugEnabled();
    }
    public boolean isErrorEnabled(){
       return this.b.isErrorEnabled();
    }
    public boolean isInfoEnabled(){
       return this.b.isInfoEnabled();
    }
    public boolean isTraceEnabled(){
       return this.b.isTraceEnabled();
    }
    public boolean isWarnEnabled(){
       return this.b.isWarnEnabled();
    }
    public void trace(String p0){
       this.b.trace(p0);
    }
    public void trace(String p0,Object p1){
       this.b.trace(p0, p1);
    }
    public void trace(String p0,Object p1,Object p2){
       this.b.trace(p0, p1, p2);
    }
    public void trace(String p0,Throwable p1){
       this.b.trace(p0, p1);
    }
    public void trace(String p0,Object[] p1){
       this.b.trace(p0, p1);
    }
    public void warn(String p0){
       this.b.warn(p0);
    }
    public void warn(String p0,Object p1){
       this.b.warn(p0, p1);
    }
    public void warn(String p0,Object p1,Object p2){
       this.b.warn(p0, p1, p2);
    }
    public void warn(String p0,Throwable p1){
       this.b.warn(p0, p1);
    }
    public void warn(String p0,Object[] p1){
       this.b.warn(p0, p1);
    }
}
