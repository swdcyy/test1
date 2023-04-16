package ar6.f;
import zq6.v;
import ar6.f$a;
import nsd.u;
import java.lang.Object;
import msd.a;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;

public final class f implements v	// class@0003a3
{
    public Object a;
    public boolean b;
    public long c;
    public final a d;
    public final String e;
    public String f;
    public boolean g;
    public static final f$a h;

    static {
       f.h = new f$a(null);
    }
    public void f(){
       super(null, null, null, null, false, 31, null);
    }
    public void f(Object p0,a p1,String p2,String p3,boolean p4,int p5,u p6){
       if (p5 & 0x01) {
          p0 = null;
       }
       if (p5 & 0x02) {
          p1 = null;
       }
       if (p5 & 0x04) {
          p2 = "";
       }
       if (p5 & 0x08) {
          p3 = "Init";
       }
       if (p5 & 0x10) {
          p4 = false;
       }
       a.p(p2, "ownerInfo");
       a.p(p3, "reason");
       super();
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.a = p0;
       this.b = true;
       if (true ^ a.g(p3, "Def")) {
          this.c = System.currentTimeMillis();
       }
       return;
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.g(this.f, "Def");
    }
    public final long b(){
       return this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "v="+this.a;
    }
    public Object value(){
       f obj = PatchProxy.apply(null, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          obj = this.d;
          if (obj != null) {
             this.a = obj.invoke();
          }
       }
       obj = this.a;
       if (obj != null) {
          a.m(obj);
          return obj;
       }else {
          throw new IllegalArgumentException("data or lazyValue is null!!!");
       }
    }
}
