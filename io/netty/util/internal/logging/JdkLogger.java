package io.netty.util.internal.logging.JdkLogger;
import io.netty.util.internal.logging.AbstractInternalLogger;
import java.lang.String;
import java.lang.Class;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.lang.Throwable;
import java.util.logging.LogRecord;
import java.lang.StackTraceElement;
import java.lang.Object;
import ard.a;
import ard.e;

public class JdkLogger extends AbstractInternalLogger	// class@00118a
{
    public final Logger logger;
    public static final String SELF;
    public static final String SUPER;
    public static final long serialVersionUID;

    static {
       JdkLogger.SELF = JdkLogger.class.getName();
       JdkLogger.SUPER = AbstractInternalLogger.class.getName();
    }
    public void JdkLogger(Logger p0){
       super(p0.getName());
       this.logger = p0;
    }
    public final void a(String p0,Level p1,String p2,Throwable p3){
       LogRecord logRecord = new LogRecord(p1, p2);
       logRecord.setLoggerName(this.name());
       logRecord.setThrown(p3);
       StackTraceElement[] stackTrace = new Throwable().getStackTrace();
       int i = 0;
       while (true) {
          if (i < stackTrace.length) {
             String className = stackTrace[i].getClassName();
             if (className.equals(p0) || className.equals(JdkLogger.SUPER)) {
                while (true) {
                   i++;
                   if (i < stackTrace.length) {
                      className = stackTrace[i].getClassName();
                      if (className.equals(p0) || className.equals(JdkLogger.SUPER)) {
                         continue ;
                      }
                   }else {
                      i = -1;
                   }
                   if (i != -1) {
                      object oobject = stackTrace[i];
                      logRecord.setSourceClassName(oobject.getClassName());
                      logRecord.setSourceMethodName(oobject.getMethodName());
                      break ;
                   }
                   break ;
                }
                this.logger.log(logRecord);
                return;
             }else {
                i++;
             }
          }else {
             i = -1;
             continue ;
          }
       }
    }
    public void debug(String p0){
       Level fINE = Level.FINE;
       if (this.logger.isLoggable(fINE)) {
          this.a(JdkLogger.SELF, fINE, p0, null);
       }
       return;
    }
    public void debug(String p0,Object p1){
       Level fINE = Level.FINE;
       if (this.logger.isLoggable(fINE)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, fINE, str, uoa.b());
       }
       return;
    }
    public void debug(String p0,Object p1,Object p2){
       Level fINE = Level.FINE;
       if (this.logger.isLoggable(fINE)) {
          a uoa = e.d(p0, p1, p2);
          p2 = uoa.a();
          this.a(JdkLogger.SELF, fINE, p2, uoa.b());
       }
       return;
    }
    public void debug(String p0,Throwable p1){
       Level fINE = Level.FINE;
       if (this.logger.isLoggable(fINE)) {
          this.a(JdkLogger.SELF, fINE, p0, p1);
       }
       return;
    }
    public void debug(String p0,Object[] p1){
       Level fINE = Level.FINE;
       if (this.logger.isLoggable(fINE)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, fINE, str, uoa.b());
       }
       return;
    }
    public void error(String p0){
       Level sEVERE = Level.SEVERE;
       if (this.logger.isLoggable(sEVERE)) {
          this.a(JdkLogger.SELF, sEVERE, p0, null);
       }
       return;
    }
    public void error(String p0,Object p1){
       Level sEVERE = Level.SEVERE;
       if (this.logger.isLoggable(sEVERE)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, sEVERE, str, uoa.b());
       }
       return;
    }
    public void error(String p0,Object p1,Object p2){
       Level sEVERE = Level.SEVERE;
       if (this.logger.isLoggable(sEVERE)) {
          a uoa = e.d(p0, p1, p2);
          p2 = uoa.a();
          this.a(JdkLogger.SELF, sEVERE, p2, uoa.b());
       }
       return;
    }
    public void error(String p0,Throwable p1){
       Level sEVERE = Level.SEVERE;
       if (this.logger.isLoggable(sEVERE)) {
          this.a(JdkLogger.SELF, sEVERE, p0, p1);
       }
       return;
    }
    public void error(String p0,Object[] p1){
       Level sEVERE = Level.SEVERE;
       if (this.logger.isLoggable(sEVERE)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, sEVERE, str, uoa.b());
       }
       return;
    }
    public void info(String p0){
       if (this.logger.isLoggable(Level.INFO)) {
          this.a(JdkLogger.SELF, Level.INFO, p0, null);
       }
       return;
    }
    public void info(String p0,Object p1){
       if (this.logger.isLoggable(Level.INFO)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, Level.INFO, str, uoa.b());
       }
       return;
    }
    public void info(String p0,Object p1,Object p2){
       if (this.logger.isLoggable(Level.INFO)) {
          a uoa = e.d(p0, p1, p2);
          String str = uoa.a();
          this.a(JdkLogger.SELF, Level.INFO, str, uoa.b());
       }
       return;
    }
    public void info(String p0,Throwable p1){
       if (this.logger.isLoggable(Level.INFO)) {
          this.a(JdkLogger.SELF, Level.INFO, p0, p1);
       }
       return;
    }
    public void info(String p0,Object[] p1){
       if (this.logger.isLoggable(Level.INFO)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, Level.INFO, str, uoa.b());
       }
       return;
    }
    public boolean isDebugEnabled(){
       return this.logger.isLoggable(Level.FINE);
    }
    public boolean isErrorEnabled(){
       return this.logger.isLoggable(Level.SEVERE);
    }
    public boolean isInfoEnabled(){
       return this.logger.isLoggable(Level.INFO);
    }
    public boolean isTraceEnabled(){
       return this.logger.isLoggable(Level.FINEST);
    }
    public boolean isWarnEnabled(){
       return this.logger.isLoggable(Level.WARNING);
    }
    public void trace(String p0){
       Level fINEST = Level.FINEST;
       if (this.logger.isLoggable(fINEST)) {
          this.a(JdkLogger.SELF, fINEST, p0, null);
       }
       return;
    }
    public void trace(String p0,Object p1){
       Level fINEST = Level.FINEST;
       if (this.logger.isLoggable(fINEST)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, fINEST, str, uoa.b());
       }
       return;
    }
    public void trace(String p0,Object p1,Object p2){
       Level fINEST = Level.FINEST;
       if (this.logger.isLoggable(fINEST)) {
          a uoa = e.d(p0, p1, p2);
          p2 = uoa.a();
          this.a(JdkLogger.SELF, fINEST, p2, uoa.b());
       }
       return;
    }
    public void trace(String p0,Throwable p1){
       Level fINEST = Level.FINEST;
       if (this.logger.isLoggable(fINEST)) {
          this.a(JdkLogger.SELF, fINEST, p0, p1);
       }
       return;
    }
    public void trace(String p0,Object[] p1){
       Level fINEST = Level.FINEST;
       if (this.logger.isLoggable(fINEST)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, fINEST, str, uoa.b());
       }
       return;
    }
    public void warn(String p0){
       Level wARNING = Level.WARNING;
       if (this.logger.isLoggable(wARNING)) {
          this.a(JdkLogger.SELF, wARNING, p0, null);
       }
       return;
    }
    public void warn(String p0,Object p1){
       Level wARNING = Level.WARNING;
       if (this.logger.isLoggable(wARNING)) {
          a uoa = e.c(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, wARNING, str, uoa.b());
       }
       return;
    }
    public void warn(String p0,Object p1,Object p2){
       Level wARNING = Level.WARNING;
       if (this.logger.isLoggable(wARNING)) {
          a uoa = e.d(p0, p1, p2);
          p2 = uoa.a();
          this.a(JdkLogger.SELF, wARNING, p2, uoa.b());
       }
       return;
    }
    public void warn(String p0,Throwable p1){
       Level wARNING = Level.WARNING;
       if (this.logger.isLoggable(wARNING)) {
          this.a(JdkLogger.SELF, wARNING, p0, p1);
       }
       return;
    }
    public void warn(String p0,Object[] p1){
       Level wARNING = Level.WARNING;
       if (this.logger.isLoggable(wARNING)) {
          a uoa = e.a(p0, p1);
          String str = uoa.a();
          this.a(JdkLogger.SELF, wARNING, str, uoa.b());
       }
       return;
    }
}
