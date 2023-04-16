package eob.l;
import qw5.a;
import java.lang.Object;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import eob.t;
import androidx.fragment.app.FragmentActivity;
import eob.f;
import erd.o;
import t45.d;
import brd.z;
import eob.h;
import com.yxcorp.gifshow.entity.QPhoto;
import eob.d;
import eob.j;
import eob.e;
import java.util.Map;
import java.util.HashMap;
import io.reactivex.subjects.PublishSubject;
import m01.a;
import k2b.e0;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import tkd.b;
import tkd.d;
import qw5.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gob.b;
import ow5.a;
import eob.c;
import com.kwai.feature.post.api.feature.upload.interfaces.IUploadInfo;
import eob.b;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.kwai.live.gzone.accompanyplay.audience.a0;
import crd.b;
import eob.k;
import eob.g;
import eob.i;

public class l implements a	// class@002794
{

    public void l(){
       super();
    }
    public t Hl(GifshowActivity p0,boolean p1,boolean p2,int p3){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Integer.valueOf(p3), this, l.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(new f(p2, p3)).subscribeOn(d.c).observeOn(d.a);
    }
    public t Q8(FragmentActivity p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ol, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(h.b).observeOn(d.a);
    }
    public t QB(GifshowActivity p0,boolean p1,QPhoto p2,int p3){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, l.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).observeOn(d.a).flatMap(new d(p0, p2, p3));
    }
    public t Rc(FragmentActivity p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ol, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(j.b).observeOn(d.a);
    }
    public t Rk(GifshowActivity p0,boolean p1,String p2){
       if (PatchProxy.isSupport(l.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, l.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(new e(p2)).subscribeOn(d.c).observeOn(d.a);
    }
    public void Wf(GifshowActivity p0,boolean p1,Map p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, l.class, "2")) {
          return;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("PUBLISH_BUTTON_EVENT", PublishSubject.g());
       hashMap.put("MOMENT_PUBLISH_CLICK", a.b);
       p2.putAll(hashMap);
       return;
    }
    public void c1(e0 p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "11")) {
          return;
       }
       String obj = PatchProxy.apply(null, null, t.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = "moment";
          b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       }
       if (b) {
          d.a(0x62409668).c1(p0);
       }
       return;
    }
    public PresenterV2 cC(){
       Object obj = PatchProxy.applyWithListener(null, this, l.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(l.class, "10");
       return new b();
    }
    public t iU(GifshowActivity p0,a p1){
       Object obj = PatchProxy.applyTwoRefsWithListener(p0, p1, this, l.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(l.class, "13");
       return b.a(-992634779).a(p0, false).map(new c(p1)).subscribeOn(d.c).observeOn(d.a);
    }
    public boolean isAvailable(){
       return true;
    }
    public void qg(GifshowActivity p0,boolean p1,IUploadInfo p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, l.class, "6")) {
          return;
       }
       b.a(-992634779).a(p0, p1).doOnNext(new b(p0, p2)).subscribe(Functions.d(), a0.b);
       return;
    }
    public t rU(GifshowActivity p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ol, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(k.b).subscribeOn(d.c).observeOn(d.a);
    }
    public t wF(GifshowActivity p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ol, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(g.b).subscribeOn(d.c).observeOn(d.a);
    }
    public t x6(FragmentActivity p0,boolean p1){
       l ol = l.class;
       if (PatchProxy.isSupport(ol)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ol, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return b.a(-992634779).a(p0, p1).map(i.b).observeOn(d.a);
    }
}
