package io.netty.util.internal.logging.AbstractInternalLogger;
import ard.b;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import java.lang.Throwable;
import io.netty.util.internal.logging.InternalLogLevel;
import io.netty.util.internal.logging.AbstractInternalLogger$a;
import java.lang.Enum;
import java.lang.Error;
import ard.c;
import java.lang.StringBuilder;
import zqd.w;

public abstract class AbstractInternalLogger implements b, Serializable	// class@001188
{
    public final String name;
    public static final long serialVersionUID = 0xa76b204e3686f702;

    public void AbstractInternalLogger(String p0){
       super();
       Objects.requireNonNull(p0, "name");
       this.name = p0;
    }
    public void debug(Throwable p0){
       this.debug("Unexpected exception:", p0);
    }
    public void error(Throwable p0){
       this.error("Unexpected exception:", p0);
    }
    public void info(Throwable p0){
       this.info("Unexpected exception:", p0);
    }
    public boolean isEnabled(InternalLogLevel p0){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i == 1) {
          return this.isTraceEnabled();
       }
       if (i == 2) {
          return this.isDebugEnabled();
       }
       if (i == 3) {
          return this.isInfoEnabled();
       }
       if (i == 4) {
          return this.isWarnEnabled();
       }
       if (i == 5) {
          return this.isErrorEnabled();
       }
       throw new Error();
    }
    public void log(InternalLogLevel p0,String p1){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.error(p1);
                   }else {
                      throw new Error();
                   }
                }else {
                   this.warn(p1);
                }
             }else {
                this.info(p1);
             }
          }else {
             this.debug(p1);
          }
       }else {
          this.trace(p1);
       }
       return;
    }
    public void log(InternalLogLevel p0,String p1,Object p2){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.error(p1, p2);
                   }else {
                      throw new Error();
                   }
                }else {
                   this.warn(p1, p2);
                }
             }else {
                this.info(p1, p2);
             }
          }else {
             this.debug(p1, p2);
          }
       }else {
          this.trace(p1, p2);
       }
       return;
    }
    public void log(InternalLogLevel p0,String p1,Object p2,Object p3){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.error(p1, p2, p3);
                   }else {
                      throw new Error();
                   }
                }else {
                   this.warn(p1, p2, p3);
                }
             }else {
                this.info(p1, p2, p3);
             }
          }else {
             this.debug(p1, p2, p3);
          }
       }else {
          this.trace(p1, p2, p3);
       }
       return;
    }
    public void log(InternalLogLevel p0,String p1,Throwable p2){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.error(p1, p2);
                   }else {
                      throw new Error();
                   }
                }else {
                   this.warn(p1, p2);
                }
             }else {
                this.info(p1, p2);
             }
          }else {
             this.debug(p1, p2);
          }
       }else {
          this.trace(p1, p2);
       }
       return;
    }
    public void log(InternalLogLevel p0,String p1,Object[] p2){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.error(p1, p2);
                   }else {
                      throw new Error();
                   }
                }else {
                   this.warn(p1, p2);
                }
             }else {
                this.info(p1, p2);
             }
          }else {
             this.debug(p1, p2);
          }
       }else {
          this.trace(p1, p2);
       }
       return;
    }
    public void log(InternalLogLevel p0,Throwable p1){
       int i = AbstractInternalLogger$a.a[p0.ordinal()];
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      this.error(p1);
                   }else {
                      throw new Error();
                   }
                }else {
                   this.warn(p1);
                }
             }else {
                this.info(p1);
             }
          }else {
             this.debug(p1);
          }
       }else {
          this.trace(p1);
       }
       return;
    }
    public String name(){
       return this.name;
    }
    public Object readResolve(){
       return c.b(this.name());
    }
    public String toString(){
       return w.b(this)+'('+this.name()+')';
    }
    public void trace(Throwable p0){
       this.trace("Unexpected exception:", p0);
    }
    public void warn(Throwable p0){
       this.warn("Unexpected exception:", p0);
    }
}
