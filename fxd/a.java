package fxd.a;
import exd.c;
import gxd.b;
import java.util.Queue;
import java.lang.Object;
import java.lang.String;
import org.slf4j.event.Level;
import java.lang.Throwable;
import org.slf4j.Marker;
import fxd.c;
import java.lang.System;
import java.lang.Thread;

public class a implements c	// class@000ef1
{
    public String b;
    public b c;
    public Queue d;

    public void a(b p0,Queue p1){
       super();
       this.c = p0;
       this.b = p0.getName();
       this.d = p1;
    }
    public final void b(Level p0,String p1,Object[] p2,Throwable p3){
       this.c(p0, null, p1, p2, p3);
    }
    public final void c(Level p0,Marker p1,String p2,Object[] p3,Throwable p4){
       c uoc = new c();
       uoc.h = System.currentTimeMillis();
       uoc.a = p0;
       uoc.d = this.c;
       uoc.c = this.b;
       uoc.b = p1;
       uoc.f = p2;
       uoc.g = p3;
       uoc.i = p4;
       uoc.e = Thread.currentThread().getName();
       this.d.add(uoc);
    }
    public void debug(String p0){
       this.b(Level.TRACE, p0, null, null);
    }
    public void debug(String p0,Object p1){
       Object[] objArray = new Object[]{p1};
       this.b(Level.DEBUG, p0, objArray, null);
    }
    public void debug(String p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       this.b(Level.DEBUG, p0, objArray, null);
    }
    public void debug(String p0,Throwable p1){
       this.b(Level.DEBUG, p0, null, p1);
    }
    public void debug(String p0,Object[] p1){
       this.b(Level.DEBUG, p0, p1, null);
    }
    public void debug(Marker p0,String p1){
       this.c(Level.DEBUG, p0, p1, null, null);
    }
    public void debug(Marker p0,String p1,Object p2){
       Object[] objArray = new Object[]{p2};
       this.c(Level.DEBUG, p0, p1, objArray, null);
    }
    public void debug(Marker p0,String p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p2,p3};
       this.c(Level.DEBUG, p0, p1, objArray, null);
    }
    public void debug(Marker p0,String p1,Throwable p2){
       this.c(Level.DEBUG, p0, p1, null, p2);
    }
    public void debug(Marker p0,String p1,Object[] p2){
       this.c(Level.DEBUG, p0, p1, p2, null);
    }
    public void error(String p0){
       this.b(Level.ERROR, p0, null, null);
    }
    public void error(String p0,Object p1){
       Object[] objArray = new Object[]{p1};
       this.b(Level.ERROR, p0, objArray, null);
    }
    public void error(String p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       this.b(Level.ERROR, p0, objArray, null);
    }
    public void error(String p0,Throwable p1){
       this.b(Level.ERROR, p0, null, p1);
    }
    public void error(String p0,Object[] p1){
       this.b(Level.ERROR, p0, p1, null);
    }
    public void error(Marker p0,String p1){
       this.c(Level.ERROR, p0, p1, null, null);
    }
    public void error(Marker p0,String p1,Object p2){
       Object[] objArray = new Object[]{p2};
       this.c(Level.ERROR, p0, p1, objArray, null);
    }
    public void error(Marker p0,String p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p2,p3};
       this.c(Level.ERROR, p0, p1, objArray, null);
    }
    public void error(Marker p0,String p1,Throwable p2){
       this.c(Level.ERROR, p0, p1, null, p2);
    }
    public void error(Marker p0,String p1,Object[] p2){
       this.c(Level.ERROR, p0, p1, p2, null);
    }
    public String getName(){
       return this.b;
    }
    public void info(String p0){
       this.b(Level.INFO, p0, null, null);
    }
    public void info(String p0,Object p1){
       Object[] objArray = new Object[]{p1};
       this.b(Level.INFO, p0, objArray, null);
    }
    public void info(String p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       this.b(Level.INFO, p0, objArray, null);
    }
    public void info(String p0,Throwable p1){
       this.b(Level.INFO, p0, null, p1);
    }
    public void info(String p0,Object[] p1){
       this.b(Level.INFO, p0, p1, null);
    }
    public void info(Marker p0,String p1){
       this.c(Level.INFO, p0, p1, null, null);
    }
    public void info(Marker p0,String p1,Object p2){
       Object[] objArray = new Object[]{p2};
       this.c(Level.INFO, p0, p1, objArray, null);
    }
    public void info(Marker p0,String p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p2,p3};
       this.c(Level.INFO, p0, p1, objArray, null);
    }
    public void info(Marker p0,String p1,Throwable p2){
       this.c(Level.INFO, p0, p1, null, p2);
    }
    public void info(Marker p0,String p1,Object[] p2){
       this.c(Level.INFO, p0, p1, p2, null);
    }
    public boolean isDebugEnabled(){
       return true;
    }
    public boolean isDebugEnabled(Marker p0){
       return true;
    }
    public boolean isErrorEnabled(){
       return true;
    }
    public boolean isErrorEnabled(Marker p0){
       return true;
    }
    public boolean isInfoEnabled(){
       return true;
    }
    public boolean isInfoEnabled(Marker p0){
       return true;
    }
    public boolean isTraceEnabled(){
       return true;
    }
    public boolean isTraceEnabled(Marker p0){
       return true;
    }
    public boolean isWarnEnabled(){
       return true;
    }
    public boolean isWarnEnabled(Marker p0){
       return true;
    }
    public void trace(String p0){
       this.b(Level.TRACE, p0, null, null);
    }
    public void trace(String p0,Object p1){
       Object[] objArray = new Object[]{p1};
       this.b(Level.TRACE, p0, objArray, null);
    }
    public void trace(String p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       this.b(Level.TRACE, p0, objArray, null);
    }
    public void trace(String p0,Throwable p1){
       this.b(Level.TRACE, p0, null, p1);
    }
    public void trace(String p0,Object[] p1){
       this.b(Level.TRACE, p0, p1, null);
    }
    public void trace(Marker p0,String p1){
       this.c(Level.TRACE, p0, p1, null, null);
    }
    public void trace(Marker p0,String p1,Object p2){
       Object[] objArray = new Object[]{p2};
       this.c(Level.TRACE, p0, p1, objArray, null);
    }
    public void trace(Marker p0,String p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p2,p3};
       this.c(Level.TRACE, p0, p1, objArray, null);
    }
    public void trace(Marker p0,String p1,Throwable p2){
       this.c(Level.TRACE, p0, p1, null, p2);
    }
    public void trace(Marker p0,String p1,Object[] p2){
       this.c(Level.TRACE, p0, p1, p2, null);
    }
    public void warn(String p0){
       this.b(Level.WARN, p0, null, null);
    }
    public void warn(String p0,Object p1){
       Object[] objArray = new Object[]{p1};
       this.b(Level.WARN, p0, objArray, null);
    }
    public void warn(String p0,Object p1,Object p2){
       Object[] objArray = new Object[]{p1,p2};
       this.b(Level.WARN, p0, objArray, null);
    }
    public void warn(String p0,Throwable p1){
       this.b(Level.WARN, p0, null, p1);
    }
    public void warn(String p0,Object[] p1){
       this.b(Level.WARN, p0, p1, null);
    }
    public void warn(Marker p0,String p1){
       this.b(Level.WARN, p1, null, null);
    }
    public void warn(Marker p0,String p1,Object p2){
       Object[] objArray = new Object[]{p2};
       this.b(Level.WARN, p1, objArray, null);
    }
    public void warn(Marker p0,String p1,Object p2,Object p3){
       Object[] objArray = new Object[]{p2,p3};
       this.c(Level.WARN, p0, p1, objArray, null);
    }
    public void warn(Marker p0,String p1,Throwable p2){
       this.c(Level.WARN, p0, p1, null, p2);
    }
    public void warn(Marker p0,String p1,Object[] p2){
       this.c(Level.WARN, p0, p1, p2, null);
    }
}
