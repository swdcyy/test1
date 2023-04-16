package j0a.a;
import bf5.e;
import j0a.q;
import android.app.Activity;
import androidx.fragment.app.c;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import java.lang.Object;
import j0a.f;
import c95.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e0a.j;
import ekd.i;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import brd.a0;
import android.view.ViewGroup;
import bf5.d;
import i0a.y;
import j0a.e;
import java.util.Map;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.i;
import com.kwai.sdk.switchconfig.a;
import zqb.a;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import w0a.k;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.f;
import k0a.b;
import com.yxcorp.gifshow.model.response.HotChannelColumn;
import k0a.c;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import v0a.n0;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.g;
import of5.c;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.nasa.NasaTagInfo;
import x0a.n;
import x0a.s;
import com.yxcorp.gifshow.nasa.NasaTagInfo$MusicTagInfo;
import x0a.o;
import x0a.t;
import v0a.h;

public class a extends e	// class@0028de
{
    public f m;
    public a n;

    public void a(q p0,Activity p1,c p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       this.m = new f();
       this.n = p0.l;
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.e = false;
       boolean b = true;
       obj.k = b;
       obj.l = b;
       obj.n = b;
       obj.m = false;
       obj.p = j.n();
       obj.o = j.p();
       if (i.c()) {
          obj.o = obj.o + n.A(a.B);
       }
       return obj;
    }
    public View b(Context p0){
       return null;
    }
    public a0 e(){
       return null;
    }
    public d f(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.z(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(a.class, new e());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d01a5);
    }
    public void j(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       p0.U7(new i());
       String str = "2";
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, str)) {
          boolean b1 = true;
          boolean b2 = a.t().d("enableDetailSearchBoxTKMode", b1);
          if (this.d.j == null) {
             this.n.l(b);
             if (b2) {
                this.n.o(b1);
             }else {
                this.n.n(b1);
             }
             c.a(p0, this.n.d());
          }
          p0.U7(new k(this.n));
          PatchProxy.onMethodExit(a.class, str);
       }
       p0.U7(new f());
       e td = this.d;
       p0.U7(new b(td.h, td.f));
       e td1 = this.d;
       if (td1.h != null && td1.h.mRepositionPCursor != null) {
          p0.U7(new c(td1.h));
       }
       td = this.d;
       p0.U7(new d(td.c, td.a, td.b, td.k));
       td1 = this.d;
       if (td1.k != -1) {
          p0.U7(new c(b, td1.k));
       }
       if (this.d.d != null) {
          p0.U7(new n0());
          p0.U7(new g());
          p0.U7(new c());
       }
       td1 = this.d;
       if (td1.e != null) {
          if (td1.e.getMagicFace() != null) {
             p0.U7(new n(this.d.e));
             td = this.d;
             p0.U7(new s(td.e, td.c));
          }else if(this.d.e.getMusicInfo() != null){
             p0.U7(new o(this.d.e));
             td = this.d;
             p0.U7(new t(td.e, td.c));
          }
       }
       p0.U7(new h());
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
