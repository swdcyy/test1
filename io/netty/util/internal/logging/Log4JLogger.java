package io.netty.util.internal.logging.Log4JLogger;
import io.netty.util.internal.logging.AbstractInternalLogger;
import java.lang.String;
import java.lang.Class;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.Priority;
import java.lang.Object;
import java.lang.Throwable;
import ard.a;
import ard.e;

public class Log4JLogger extends AbstractInternalLogger	// class@00118b
{
    public final Logger logger;
    public final boolean traceCapable;
    public static final String FQCN;
    public static final long serialVersionUID;

    static {
       Log4JLogger.FQCN = Log4JLogger.class.getName();
    }
    public void Log4JLogger(Logger p0){
       super(p0.getName());
       this.logger = p0;
       this.traceCapable = this.a();
    }
    public final boolean a(){
       try{
          this.logger.isTraceEnabled();
          return true;
       }catch(java.lang.NoSuchMethodError e0){
          return false;
       }
    }
    public void debug(String p0){
       this.logger.log(Log4JLogger.FQCN, Level.DEBUG, p0, null);
    }
    public void debug(String p0,Object p1){
       if (this.logger.isDebugEnabled()) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.DEBUG, str, uoa.b());
       }
       return;
    }
    public void debug(String p0,Object p1,Object p2){
       if (this.logger.isDebugEnabled()) {
          a uoa = e.d(p0, p1, p2);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.DEBUG, str, uoa.b());
       }
       return;
    }
    public void debug(String p0,Throwable p1){
       this.logger.log(Log4JLogger.FQCN, Level.DEBUG, p0, p1);
    }
    public void debug(String p0,Object[] p1){
       if (this.logger.isDebugEnabled()) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.DEBUG, str, uoa.b());
       }
       return;
    }
    public void error(String p0){
       this.logger.log(Log4JLogger.FQCN, Level.ERROR, p0, null);
    }
    public void error(String p0,Object p1){
       if (this.logger.isEnabledFor(Level.ERROR)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.ERROR, str, uoa.b());
       }
       return;
    }
    public void error(String p0,Object p1,Object p2){
       if (this.logger.isEnabledFor(Level.ERROR)) {
          a uoa = e.d(p0, p1, p2);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.ERROR, str, uoa.b());
       }
       return;
    }
    public void error(String p0,Throwable p1){
       this.logger.log(Log4JLogger.FQCN, Level.ERROR, p0, p1);
    }
    public void error(String p0,Object[] p1){
       if (this.logger.isEnabledFor(Level.ERROR)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.ERROR, str, uoa.b());
       }
       return;
    }
    public void info(String p0){
       this.logger.log(Log4JLogger.FQCN, Level.INFO, p0, null);
    }
    public void info(String p0,Object p1){
       if (this.logger.isInfoEnabled()) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.INFO, str, uoa.b());
       }
       return;
    }
    public void info(String p0,Object p1,Object p2){
       if (this.logger.isInfoEnabled()) {
          a uoa = e.d(p0, p1, p2);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.INFO, str, uoa.b());
       }
       return;
    }
    public void info(String p0,Throwable p1){
       this.logger.log(Log4JLogger.FQCN, Level.INFO, p0, p1);
    }
    public void info(String p0,Object[] p1){
       if (this.logger.isInfoEnabled()) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.INFO, str, uoa.b());
       }
       return;
    }
    public boolean isDebugEnabled(){
       return this.logger.isDebugEnabled();
    }
    public boolean isErrorEnabled(){
       return this.logger.isEnabledFor(Level.ERROR);
    }
    public boolean isInfoEnabled(){
       return this.logger.isInfoEnabled();
    }
    public boolean isTraceEnabled(){
       if (this.traceCapable != null) {
          return this.logger.isTraceEnabled();
       }
       return this.logger.isDebugEnabled();
    }
    public boolean isWarnEnabled(){
       return this.logger.isEnabledFor(Level.WARN);
    }
    public void trace(String p0){
       Log4JLogger tlogger = this.logger;
       String fQCN = Log4JLogger.FQCN;
       Level tRACE = (this.traceCapable != null)? Level.TRACE: Level.DEBUG;
       tlogger.log(fQCN, tRACE, p0, null);
       return;
    }
    public void trace(String p0,Object p1){
       if (this.isTraceEnabled()) {
          a uoa = e.c(p0, p1);
          p1 = this.logger;
          String fQCN = Log4JLogger.FQCN;
          Level tRACE = (this.traceCapable != null)? Level.TRACE: Level.DEBUG;
          p1.log(fQCN, tRACE, uoa.a(), uoa.b());
       }
       return;
    }
    public void trace(String p0,Object p1,Object p2){
       if (this.isTraceEnabled()) {
          a uoa = e.d(p0, p1, p2);
          p1 = this.logger;
          p2 = Log4JLogger.FQCN;
          Level tRACE = (this.traceCapable != null)? Level.TRACE: Level.DEBUG;
          p1.log(p2, tRACE, uoa.a(), uoa.b());
       }
       return;
    }
    public void trace(String p0,Throwable p1){
       Log4JLogger tlogger = this.logger;
       String fQCN = Log4JLogger.FQCN;
       Level tRACE = (this.traceCapable != null)? Level.TRACE: Level.DEBUG;
       tlogger.log(fQCN, tRACE, p0, p1);
       return;
    }
    public void trace(String p0,Object[] p1){
       if (this.isTraceEnabled()) {
          a uoa = e.a(p0, p1);
          Log4JLogger tlogger = this.logger;
          String fQCN = Log4JLogger.FQCN;
          Level tRACE = (this.traceCapable != null)? Level.TRACE: Level.DEBUG;
          tlogger.log(fQCN, tRACE, uoa.a(), uoa.b());
       }
       return;
    }
    public void warn(String p0){
       this.logger.log(Log4JLogger.FQCN, Level.WARN, p0, null);
    }
    public void warn(String p0,Object p1){
       if (this.logger.isEnabledFor(Level.WARN)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.WARN, str, uoa.b());
       }
       return;
    }
    public void warn(String p0,Object p1,Object p2){
       if (this.logger.isEnabledFor(Level.WARN)) {
          a uoa = e.d(p0, p1, p2);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.WARN, str, uoa.b());
       }
       return;
    }
    public void warn(String p0,Throwable p1){
       this.logger.log(Log4JLogger.FQCN, Level.WARN, p0, p1);
    }
    public void warn(String p0,Object[] p1){
       if (this.logger.isEnabledFor(Level.WARN)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.logger.log(Log4JLogger.FQCN, Level.WARN, str, uoa.b());
       }
       return;
    }
}
