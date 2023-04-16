package b1a.a;
import bf5.e;
import b1a.o;
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
import b1a.e;
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
import b1a.d;
import java.util.Map;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.i;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.f;
import com.yxcorp.gifshow.nasa.NasaSlideSerialParam;
import com.yxcorp.gifshow.detail.slidev2.serial.presenter.a;
import com.yxcorp.gifshow.detail.slidev2.serial.bottombar.NasaSerialPhotoBottomBarPresenter;
import w0a.d0;
import t8a.h;
import o8a.a;
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

public class a extends e	// class@000344
{
    public e m;

    public void a(o p0,Activity p1,c p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       this.m = new e();
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.e = false;
       obj.k = true;
       obj.l = true;
       obj.n = true;
       obj.m = true;
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
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.z(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d1511);
    }
    public void j(PresenterV2 p0){
       e td1;
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a.class, "1")) {
          return;
       }
       p0.U7(new i());
       p0.U7(new f());
       if (this.d.l.mIsFromScheme == null) {
          p0.U7(new a());
          p0.U7(new NasaSerialPhotoBottomBarPresenter(this.d));
          p0.U7(new d0());
          p0.U7(new h());
       }else {
          p0.U7(new a(this.d));
          p0.U7(new d0());
       }
       if (this.d.j != null) {
          p0.U7(new n0());
          p0.U7(new g());
          p0.U7(new c());
       }
       e td = this.d;
       if (td.k != null) {
          if (td.k.getMagicFace() != null) {
             p0.U7(new n(this.d.k));
             td1 = this.d;
             p0.U7(new s(td1.k, td1.i));
          }else if(this.d.k.getMusicInfo() != null){
             p0.U7(new o(this.d.k));
             td1 = this.d;
             p0.U7(new t(td1.k, td1.i));
          }
       }
       p0.U7(new h());
       PatchProxy.onMethodExit(a.class, "1");
       return;
    }
}
