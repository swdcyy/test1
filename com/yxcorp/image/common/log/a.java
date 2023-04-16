package com.yxcorp.image.common.log.a;
import cb.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.image.common.log.Log$LEVEL;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.image.common.log.Log;
import java.lang.Integer;

public class a implements c	// class@001376
{
    public String a;
    public int b;

    public void a(){
       super();
       this.a = "Fresco";
       this.b = 5;
    }
    public int a(){
       return this.b;
    }
    public void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       this.g(Log$LEVEL.ERROR, p0, p1);
       return;
    }
    public void c(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "12")) {
          return;
       }
       this.h(Log$LEVEL.ERROR, p0, p1, p2);
       return;
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       this.g(Log$LEVEL.DEBUG, p0, p1);
       return;
    }
    public void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "4")) {
          return;
       }
       this.h(Log$LEVEL.DEBUG, p0, p1, p2);
       return;
    }
    public boolean d(int p0){
       boolean b = (this.b <= p0)? true: false;
       return b;
    }
    public void e(int p0){
       this.b = p0;
    }
    public void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "9")) {
          return;
       }
       this.g(Log$LEVEL.ERROR, p0, p1);
       return;
    }
    public void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "10")) {
          return;
       }
       this.h(Log$LEVEL.ERROR, p0, p1, p2);
       return;
    }
    public final String f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a != null) {
          p0 = this.a+":"+p0;
       }
       return p0;
    }
    public final void g(Log$LEVEL p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "14")) {
          return;
       }
       Log.d(p0, this.f(p1), p2, null);
       return;
    }
    public final void h(Log$LEVEL p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "15")) {
          return;
       }
       Log.d(p0, this.f(p1), p2, p3);
       return;
    }
    public void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "5")) {
          return;
       }
       this.g(Log$LEVEL.INFO, p0, p1);
       return;
    }
    public void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "6")) {
          return;
       }
       this.h(Log$LEVEL.INFO, p0, p1, p2);
       return;
    }
    public void log(int p0,String p1,String p2){
       object oobject;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a.class, "13")) {
          return;
       }
       Log log = Log.class;
       if (PatchProxy.isSupport(log)) {
          oobject = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, log, "22");
          if (oobject != PatchProxyResult.class) {
          }else {
          label_0036 :
             Log$LEVEL[] lEVELArray = Log$LEVEL.values();
             int len = lEVELArray.length;
             int i = 0;
             while (true) {
                if (i < len) {
                   object oobject1 = lEVELArray[i];
                   if (oobject1.level == p0) {
                      oobject = oobject1;
                      break ;
                   }else {
                      i = i + 1;
                   }
                }else {
                   oobject = Log$LEVEL.VERBOSE;
                   break ;
                }
             }
          }
       }else {
          goto label_0036 ;
       }
       this.g(oobject, p1, p2);
       return;
    }
    public void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       this.g(Log$LEVEL.VERBOSE, p0, p1);
       return;
    }
    public void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "2")) {
          return;
       }
       this.h(Log$LEVEL.VERBOSE, p0, p1, p2);
       return;
    }
    public void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       this.g(Log$LEVEL.WARN, p0, p1);
       return;
    }
    public void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "8")) {
          return;
       }
       this.h(Log$LEVEL.WARN, p0, p1, p2);
       return;
    }
}
