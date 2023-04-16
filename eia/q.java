package eia.q;
import bf5.e;
import zm5.b;
import androidx.fragment.app.c;
import android.app.Activity;
import k2b.e0;
import sy6.a;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import hf5.e;
import hf5.b;
import hf5.g;
import hf5.f;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import java.lang.Object;
import eia.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import yxb.c;
import c95.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import ekd.i;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.View;
import i2b.a;
import brd.a0;
import android.view.ViewGroup;
import bf5.d;
import ff5.a;
import eia.v;
import java.util.Map;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wh5.c;
import yxb.b;
import eia.a0;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import yqb.l;
import zqb.a;
import eia.w;

public class q extends e	// class@002699
{
    public final a m;
    public final NasaBizParam n;
    public a o;

    public void q(b p0,c p1,Activity p2,e0 p3,a p4,MilanoContainerEventBus p5,e p6,b p7,g p8,f p9,NasaBizParam p10){
       int i = this;
       super(p0, p2, p1, p3, p4, p5, p6, p7, p8, p9);
       i.n = p10;
       a uoa = new a(p2);
       i.m = uoa;
       uoa.m = d.a(-711666435).Mj();
       i.o = p0.n;
    }
    public c a(){
       c obj = PatchProxy.apply(null, this, q.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new c();
       obj.e = true;
       obj.k = true;
       obj.l = true;
       obj.n = true;
       obj.m = true;
       obj.p = a1.d(0x7f070ee5);
       obj.o = a1.d(0x7f070ee7);
       if (i.c()) {
          obj.o = obj.o + n.A(a.B);
       }
       obj.t = true;
       return obj;
    }
    public View b(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, 0x7f0d10a5);
    }
    public a0 e(){
       return null;
    }
    public d f(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.a(0x19cfac13).eX(p0);
    }
    public void g(){
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new v();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, q.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(q.class, new v());
       }else {
          obj.put(q.class, null);
       }
       return obj;
    }
    public void h(){
    }
    public View i(Context p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, q.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.a(p0, d.a(-711666435).GB());
    }
    public void j(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, "1")) {
          return;
       }
       if (c.b()) {
          String str = "2";
          if (!PatchProxy.applyVoidOneRefsWithListener(p0, this, q.class, str)) {
             p0.U7(d.a(-430326918).cD(this.d.d));
             PatchProxy.onMethodExit(q.class, str);
          }
          p0.U7(new a0(this.n.getNasaSlideParam()));
       }else {
          String str1 = "3";
          PresenterV2 presenterV2 = PatchProxy.applyWithListener(null, this, q.class, str1);
          if (presenterV2 != PatchProxyResult.class) {
          }else {
             e td = this.d;
             presenterV2 = d.a(-711666435).L20(td.m, td.e, td.l, td.f, td.k, this.o);
             PatchProxy.onMethodExit(q.class, str1);
          }
          p0.U7(presenterV2);
          p0.U7(new w(this.n.getNasaSlideParam()));
       }
       PatchProxy.onMethodExit(q.class, "1");
       return;
    }
}
