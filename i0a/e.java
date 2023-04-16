package i0a.e;
import bf5.e;
import i0a.x;
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
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import brd.a0;
import android.view.ViewGroup;
import bf5.d;
import i0a.y;
import i0a.j;
import java.util.Map;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wh5.c;
import v0a.k0;
import zqb.a;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.i;
import com.kwai.feature.component.entry.a;
import xf6.d;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.plugin.impl.search.util.c;
import w0a.k;
import tkd.b;
import tkd.d;
import rx5.c;
import android.content.Intent;
import java.lang.Integer;
import java.util.List;
import java.util.Collection;
import com.kwai.imsdk.internal.util.b;
import com.yxcorp.gifshow.detail.post.bubble.NasaDetailPostBubblePresenter;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.f;
import yqb.l;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.d;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.c;
import v0a.h0;
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
import com.yxcorp.gifshow.nasa.NasaTagInfo$KuaiShanTemplateInfo;
import x0a.m;
import x0a.r;
import wa5.e;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.NasaLivePhotoDuplicatedPresenter;
import v0a.h;
import com.kwai.feature.api.feed.home.HomePageExperimentManager;
import com.yxcorp.gifshow.detail.fragments.milano.presenter.h;
import zy5.e;
import com.kwai.feature.component.photofeatures.filter.info.BrowsePage;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import r7a.e;
import zw5.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaSlidePlayRecordPresenter;
import y0a.a;

public class e extends e	// class@00274a
{
    public k m;
    public String n;
    public a o;

    public void e(x p0,Activity p1,c p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       this.m = new k();
       this.n = p0.A;
       this.o = p0.C;
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.e = this.d.m;
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
       e td = this.d;
       if (td.u != null) {
          obj.m = b;
       }
       if (!TextUtils.x(td.v)) {
          obj.v = this.d.v;
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
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y.z(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(e.class, new j());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d106e);
    }
    public void j(PresenterV2 p0){
       e d;
       e o;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefsWithListener(obj1, obj, e.class, "1")) {
          return;
       }
       if (c.b()) {
          if (!PatchProxy.applyVoidOneRefsWithListener(obj1, obj, e.class, "2")) {
             obj1.U7(new k0(obj.o.e()));
             PatchProxy.onMethodExit(e.class, "2");
          }
       }else if(PatchProxy.applyVoidOneRefsWithListener(obj1, obj, e.class, "3")){
          obj1.U7(new i());
          int i = a.n(obj.o.d());
          if (d.v() >= 0) {
             i = d.v();
          }
          boolean b = a.t().d("enableDetailSearchBoxTKMode", true);
          d = obj.d;
          boolean b1 = false;
          if (d.q != null) {
             o = obj.o;
             o.c = true;
             o.m(b1);
             obj.o.k(b1);
          }else if(d.p != null){
             obj.o.m(b1);
             obj.o.k(b1);
          }else if(!i){
             obj.o.n(b1);
             obj.o.o(b1);
          }else if(d.o == null){
             obj.o.l(b1);
             if (b) {
                obj.o.o(true);
             }else {
                obj.o.n(true);
             }
             c.a(obj1, obj.o.d());
          }
          obj1.U7(new k(obj.o));
          if (obj.d.w != null && (obj.c != null && d.a(0x77cfa10c).j10(obj.c.getIntent()))) {
             obj.d.B.add(Integer.valueOf(true));
          }
       label_00ec :
          if (!b.c(obj.d.B)) {
             obj1.U7(new NasaDetailPostBubblePresenter(obj.d.B));
          }
          obj1.U7(new f(obj.d.x));
          e d1 = obj.d;
          d uod = new d(d1.i, d1.d, d1.e, d1.h, d1.s);
          obj1.U7(o);
          o = obj.d;
          x s = o.s;
          if (s != -1) {
             obj1.U7(new c(o.h, o.i, s));
          }
          if (obj.d.h != null) {
             obj1.U7(new h0());
          }
          o = obj.d;
          if (o.j != null) {
             obj1.U7(new n0());
             obj1.U7(new g());
             obj1.U7(new c());
          }else if(o.k != null){
             obj1.U7(new n0(b1));
          }
          x n = obj.d.n;
          if (n != null) {
             if (n.getMagicFace() != null) {
                obj1.U7(new n(obj.d.n));
                d1 = obj.d;
                obj1.U7(new s(d1.n, d1.i, d1.h));
             }else if(obj.d.n.getMusicInfo() != null){
                obj1.U7(new o(obj.d.n));
                d1 = obj.d;
                obj1.U7(new t(d1.n, d1.i, d1.h));
             }else if(obj.d.n.getKuaishanInfo() != null){
                obj1.U7(new m(obj.d.n));
                d1 = obj.d;
                obj1.U7(new r(d1.n, d1.i, d1.h));
             }
          }
          if (obj.d.d != null && e.d() > 0) {
             obj1.U7(new NasaLivePhotoDuplicatedPresenter());
          }
          obj1.U7(new h());
          if (obj.d.d != null && HomePageExperimentManager.b()) {
             obj1.U7(new h(e.Y));
          }
          if (obj.d.d != null && (!NasaExperimentUtils.j() && obj.d.t == null)) {
             obj1.U7(new e());
          }
       label_025f :
          if (obj.d.f != null) {
             obj1.U7(d.a(0x7948eb5d).Jf(true));
          }
          if (obj.d.y != null) {
             obj1.U7(new NasaSlidePlayRecordPresenter());
          }
          if (obj.d.z != null) {
             obj1.U7(new a());
          }
          PatchProxy.onMethodExit(e.class, "3");
       }
       PatchProxy.onMethodExit(e.class, "1");
       return;
    }
}
