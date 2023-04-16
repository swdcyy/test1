package gxd.b;
import exd.c;
import java.lang.String;
import java.util.Queue;
import java.lang.Object;
import org.slf4j.helpers.NOPLogger;
import fxd.a;
import java.lang.Boolean;
import java.lang.Class;
import fxd.b;
import java.lang.reflect.Method;
import java.lang.Throwable;
import org.slf4j.Marker;

public class b implements c	// class@000f6b
{
    public final String b;
    public c c;
    public Boolean d;
    public Method e;
    public a f;
    public Queue g;
    public final boolean h;

    public void b(String p0,Queue p1,boolean p2){
       super();
       this.b = p0;
       this.g = p1;
       this.h = p2;
    }
    public c b(){
       if (this.c != null) {
          return this.c;
       }
       if (this.h != null) {
          return NOPLogger.NOP_LOGGER;
       }
       if (this.f == null) {
          this.f = new a(this, this.g);
       }
       return this.f;
    }
    public boolean c(){
       b td = this.d;
       if (td != null) {
          return td.booleanValue();
       }
       try{
          Class[] uClassArray = new Class[]{b.class};
          this.e = this.c.getClass().getMethod("log", uClassArray);
          this.d = Boolean.TRUE;
       }catch(java.lang.NoSuchMethodException e0){
          this.d = Boolean.FALSE;
       }
       return this.d.booleanValue();
    }
    public boolean d(){
       return this.c instanceof NOPLogger;
    }
    public void debug(String p0){
       this.b().debug(p0);
    }
    public void debug(String p0,Object p1){
       this.b().debug(p0, p1);
    }
    public void debug(String p0,Object p1,Object p2){
       this.b().debug(p0, p1, p2);
    }
    public void debug(String p0,Throwable p1){
       this.b().debug(p0, p1);
    }
    public void debug(String p0,Object[] p1){
       this.b().debug(p0, p1);
    }
    public void debug(Marker p0,String p1){
       this.b().debug(p0, p1);
    }
    public void debug(Marker p0,String p1,Object p2){
       this.b().debug(p0, p1, p2);
    }
    public void debug(Marker p0,String p1,Object p2,Object p3){
       this.b().debug(p0, p1, p2, p3);
    }
    public void debug(Marker p0,String p1,Throwable p2){
       this.b().debug(p0, p1, p2);
    }
    public void debug(Marker p0,String p1,Object[] p2){
       this.b().debug(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || b.class != p0.getClass()) {
          return false;
       }
       if (!(this.b).equals(p0.b)) {
          return false;
       }
       return true;
    }
    public void error(String p0){
       this.b().error(p0);
    }
    public void error(String p0,Object p1){
       this.b().error(p0, p1);
    }
    public void error(String p0,Object p1,Object p2){
       this.b().error(p0, p1, p2);
    }
    public void error(String p0,Throwable p1){
       this.b().error(p0, p1);
    }
    public void error(String p0,Object[] p1){
       this.b().error(p0, p1);
    }
    public void error(Marker p0,String p1){
       this.b().error(p0, p1);
    }
    public void error(Marker p0,String p1,Object p2){
       this.b().error(p0, p1, p2);
    }
    public void error(Marker p0,String p1,Object p2,Object p3){
       this.b().error(p0, p1, p2, p3);
    }
    public void error(Marker p0,String p1,Throwable p2){
       this.b().error(p0, p1, p2);
    }
    public void error(Marker p0,String p1,Object[] p2){
       this.b().error(p0, p1, p2);
    }
    public String getName(){
       return this.b;
    }
    public int hashCode(){
       return (this.b).hashCode();
    }
    public void info(String p0){
       this.b().info(p0);
    }
    public void info(String p0,Object p1){
       this.b().info(p0, p1);
    }
    public void info(String p0,Object p1,Object p2){
       this.b().info(p0, p1, p2);
    }
    public void info(String p0,Throwable p1){
       this.b().info(p0, p1);
    }
    public void info(String p0,Object[] p1){
       this.b().info(p0, p1);
    }
    public void info(Marker p0,String p1){
       this.b().info(p0, p1);
    }
    public void info(Marker p0,String p1,Object p2){
       this.b().info(p0, p1, p2);
    }
    public void info(Marker p0,String p1,Object p2,Object p3){
       this.b().info(p0, p1, p2, p3);
    }
    public void info(Marker p0,String p1,Throwable p2){
       this.b().info(p0, p1, p2);
    }
    public void info(Marker p0,String p1,Object[] p2){
       this.b().info(p0, p1, p2);
    }
    public boolean isDebugEnabled(){
       return this.b().isDebugEnabled();
    }
    public boolean isDebugEnabled(Marker p0){
       return this.b().isDebugEnabled(p0);
    }
    public boolean isErrorEnabled(){
       return this.b().isErrorEnabled();
    }
    public boolean isErrorEnabled(Marker p0){
       return this.b().isErrorEnabled(p0);
    }
    public boolean isInfoEnabled(){
       return this.b().isInfoEnabled();
    }
    public boolean isInfoEnabled(Marker p0){
       return this.b().isInfoEnabled(p0);
    }
    public boolean isTraceEnabled(){
       return this.b().isTraceEnabled();
    }
    public boolean isTraceEnabled(Marker p0){
       return this.b().isTraceEnabled(p0);
    }
    public boolean isWarnEnabled(){
       return this.b().isWarnEnabled();
    }
    public boolean isWarnEnabled(Marker p0){
       return this.b().isWarnEnabled(p0);
    }
    public void trace(String p0){
       this.b().trace(p0);
    }
    public void trace(String p0,Object p1){
       this.b().trace(p0, p1);
    }
    public void trace(String p0,Object p1,Object p2){
       this.b().trace(p0, p1, p2);
    }
    public void trace(String p0,Throwable p1){
       this.b().trace(p0, p1);
    }
    public void trace(String p0,Object[] p1){
       this.b().trace(p0, p1);
    }
    public void trace(Marker p0,String p1){
       this.b().trace(p0, p1);
    }
    public void trace(Marker p0,String p1,Object p2){
       this.b().trace(p0, p1, p2);
    }
    public void trace(Marker p0,String p1,Object p2,Object p3){
       this.b().trace(p0, p1, p2, p3);
    }
    public void trace(Marker p0,String p1,Throwable p2){
       this.b().trace(p0, p1, p2);
    }
    public void trace(Marker p0,String p1,Object[] p2){
       this.b().trace(p0, p1, p2);
    }
    public void warn(String p0){
       this.b().warn(p0);
    }
    public void warn(String p0,Object p1){
       this.b().warn(p0, p1);
    }
    public void warn(String p0,Object p1,Object p2){
       this.b().warn(p0, p1, p2);
    }
    public void warn(String p0,Throwable p1){
       this.b().warn(p0, p1);
    }
    public void warn(String p0,Object[] p1){
       this.b().warn(p0, p1);
    }
    public void warn(Marker p0,String p1){
       this.b().warn(p0, p1);
    }
    public void warn(Marker p0,String p1,Object p2){
       this.b().warn(p0, p1, p2);
    }
    public void warn(Marker p0,String p1,Object p2,Object p3){
       this.b().warn(p0, p1, p2, p3);
    }
    public void warn(Marker p0,String p1,Throwable p2){
       this.b().warn(p0, p1, p2);
    }
    public void warn(Marker p0,String p1,Object[] p2){
       this.b().warn(p0, p1, p2);
    }
}
