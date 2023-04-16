package b14.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f14.g;
import bq5.h;
import fp3.d;
import com.kuaishou.merchant.live.basic.LiveBasicLogBiz;
import java.lang.Integer;
import p74.a;
import o74.a;
import f14.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import bq5.f;
import f14.h;
import f14.c$a;
import bq5.f$a;
import f14.c;
import b14.c;

public class d	// class@0002ff
{
    public h a;
    public d b;
    public g c;
    public g d;

    public void d(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       d tc = this.c;
       if (tc != null && tc.e() != 13) {
          this.c.d();
       }
       tc = this.d;
       if (tc != null) {
          tc.d();
       }
       return;
    }
    public void b(h p0,d p1){
       this.a = p0;
       this.b = p1;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tc = this.c;
       if (tc != null) {
          tc.v();
          this.c = null;
       }
       tc = this.d;
       if (tc != null) {
          tc.v();
          this.d = null;
       }
       return;
    }
    public final void d(g p0){
       d td;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       a.t(LiveBasicLogBiz.BUBBLE, "LiveBubbleManagerV2", "show bubble", "bubbleType", Integer.valueOf(p0.e()));
       if (p0.m()) {
          td = this.d;
          if (td != null) {
             td.d();
          }
       }else {
          td = this.c;
          if (td != null && !td.m()) {
             this.c.d();
          }
       }
       this.c = p0;
       if (p0.m()) {
          this.d = p0;
       }
       if (!PatchProxy.applyVoid(null, p0, g.class, "5") && !p0.n()) {
          g m = p0.m;
          if (m != null) {
             m.b(p0);
          }
       }
       return;
    }
    public boolean e(int p0,g p1){
       Object obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uod, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = PatchProxy.applyOneRefs(p1, this, uod, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p1 != null && (p1.e() == 13 || p1.e() == 12)){
          b = true;
       }else {
          b = false;
       }
       if (b && p1 == this.c) {
          a.s(LiveBasicLogBiz.BUBBLE, "LiveBubbleManagerV2", "show same bubble");
          return true;
       }else {
          c uoc = PatchProxy.applyOneRefs(p1, this, uod, "6");
          if (uoc != patchProxyRe) {
          }else {
             h oh = new h(p1);
             c$a uoa = new c$a();
             uoa.c(Long.MAX_VALUE);
             uoa.e(oh);
             uoa.f(p1.i());
             uoc = uoa.g();
             p1.m = new c(this, uoc, oh);
          }
          f uof = this.a.t3();
          if (uof == null) {
             this.d(p1);
             return true;
          }else if(uoc.getPriority() >= uof.getPriority()){
             this.d(p1);
             this.a.m0();
             return true;
          }else if(p1.m()){
             d td = this.d;
             if (td == null || td.i() <= p1.i()) {
                this.d(p1);
                return true;
             }
          }
          a.t(LiveBasicLogBiz.BUBBLE, "LiveBubbleManagerV2", "bubble show fail", "bubbleScene", Integer.valueOf(p0));
          return false;
       }
    }
}
