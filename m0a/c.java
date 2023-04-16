package m0a.c;
import bf5.e;
import m0a.h;
import androidx.fragment.app.c;
import android.app.Activity;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import java.lang.Object;
import i0a.k;
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
import m0a.g;
import java.util.Map;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.i;
import w0a.k;
import zqb.a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.f;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.social.config.utils.HoldoutConfigUtilKt;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.b;
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
import p0a.f;
import p0a.c;

public class c extends e	// class@002ef4
{
    public k m;
    public a n;

    public void c(h p0,c p1,Activity p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       int i = this;
       super(p0, p2, p1, p3, p4, p5, p6, p7, p8, p9);
       i.m = super();
       i.n = p0.j;
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.e = this.d.e;
       obj.k = true;
       obj.l = true;
       obj.n = true;
       obj.m = true;
       obj.p = j.n();
       obj.o = j.p();
       if (i.c()) {
          obj.o = obj.o + n.A(a.B);
       }
       obj.t = true;
       return obj;
    }
    public View b(Context p0){
       return null;
    }
    public a0 e(){
       return null;
    }
    public d f(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.z(p0);
    }
    public void g(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(c.class, new g());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void h(){
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d106e);
    }
    public void j(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       p0.U7(new i());
       p0.U7(new k(this.n));
       p0.U7(new f());
       e td = this.d;
       p0.U7(new d(td.c, td.a, td.b, td.g));
       e td1 = this.d;
       if (td1.g != -1) {
          p0.U7(new c(false, td1.g));
       }
       if (QCurrentUser.ME.isLogined() && (!TextUtils.x(this.d.h) && (!TextUtils.x(this.d.i) && !HoldoutConfigUtilKt.a()))) {
          td = this.d;
          p0.U7(new b(td.h, td.i));
       }
    label_0092 :
       if (this.d.d != null) {
          p0.U7(new n0());
          p0.U7(new g());
          p0.U7(new c());
       }
       td1 = this.d;
       if (td1.f != null) {
          if (td1.f.getMagicFace() != null) {
             p0.U7(new n(this.d.f));
             td = this.d;
             p0.U7(new s(td.f, td.c));
          }else if(this.d.f.getMusicInfo() != null){
             p0.U7(new o(this.d.f));
             td = this.d;
             p0.U7(new t(td.f, td.c));
          }
       }
       p0.U7(new h());
       p0.U7(new f());
       p0.U7(new c());
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
