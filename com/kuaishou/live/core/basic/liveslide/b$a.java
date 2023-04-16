package com.kuaishou.live.core.basic.liveslide.b$a;
import com.kuaishou.live.core.basic.liveslide.b;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b51.d;
import c51.d;
import c51.i;
import java.lang.Number;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.Boolean;
import c51.b;
import wg3.b;
import java.lang.Integer;
import java.util.Objects;
import c51.h;

public class b$a	// class@00083c
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public List a(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e().p().l();
    }
    public int b(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.e().p().f();
    }
    public int c(LiveStreamFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.e().p().l().indexOf(p0);
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.e().p().P();
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "15")) {
          return;
       }
       this.a.e().p().y(p0);
       return;
    }
    public boolean f(int p0,b p1){
       i obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "7");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       if (p0 < 0 || this.a.e().p().f() <= p0) {
          return false;
       }else {
          obj = this.a.e().p();
          Objects.requireNonNull(obj);
          i oi = i.class;
          if (PatchProxy.isSupport(oi)) {
             Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, obj, oi, "7");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             label_0060 :
                return b;
             }
          }
          b = obj.b.r(p0, p1);
          goto label_0060 ;
       }
    }
    public void g(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "16")) {
          return;
       }
       this.a.e().p().G(p0);
       return;
    }
}
