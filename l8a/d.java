package l8a.d;
import im8.g;
import com.kwai.component.photo.detail.slide.presenter.c;
import com.kwai.feature.api.feed.detail.router.biz.thanos.MerchantSlidePlayModel;
import l8a.d$a;
import l8a.d$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Intent;
import qvb.i;
import com.yxcorp.gifshow.detail.slideplay.b;
import qvb.q;
import qvb.j;
import com.kwai.robust.PatchProxyResult;
import l8a.c;
import java.lang.Exception;
import java.lang.StringBuilder;
import qvb.f;
import androidx.fragment.app.Fragment;
import d6a.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.detail.slideplay.c;
import d6a.i;
import d6a.j;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import java.lang.Runnable;
import l8a.h;
import java.util.Map;
import java.util.HashMap;

public class d extends c implements g	// class@002d66
{
    public MerchantSlidePlayModel E;
    public a F;
    public b G;
    public PresenterV2 H;
    public final q I;

    public void d(){
       super();
       this.E = new MerchantSlidePlayModel();
       this.F = new d$a(this);
       this.I = new d$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       super.E8();
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Activity activity = this.getActivity();
       if (activity != null) {
          d tE = this.E;
          Intent intent = activity.getIntent();
          try{
             tE.init(intent);
             PresenterV2 presenterV2 = this.Y8(this.E.getActionType());
             this.H = presenterV2;
             this.U7(presenterV2);
          }catch(java.lang.Exception e0){
             e0.finish();
          }
       }
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, d.class, "4");
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       super.J8();
       d tG = this.G;
       if (tG != null) {
          tG.q().f(this.I);
       }
       return;
    }
    public final PresenterV2 Y8(String p0){
       Object obj = PatchProxy.applyOneRefsWithListener(p0, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (("cardCollection").equals(p0)) {
          PatchProxy.onMethodExit(d.class, "6");
          return new c();
       }else {
          PatchProxy.onMethodExit(d.class, "6");
          throw new Exception("actionType:"+p0+"≤ª∆•≈‰");
       }
    }
    public void Z8(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       if (this.G != null) {
          return;
       }
       String str = f.b(null);
       this.G = b.g(j.e(p0, str, c.i(0, new QPhoto())));
       this.u.setSlidePlayId(str);
       this.u.getSlidePlayConfig().setEnablePullRefresh(0);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       d tG = this.G;
       if (tG != null && tG.q().getCount()) {
          this.G.q().f(this.I);
          this.u.mPhoto = this.G.w2(0);
          this.v.run();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new h());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
}
