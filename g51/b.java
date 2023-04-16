package g51.b;
import tw6.a;
import ix6.e;
import com.kuaishou.live.basic.liveslide.view.LiveSlideViewPager;
import java.lang.Object;
import com.kwai.library.groot.framework.viewitem.constant.GrootViewItemSwitchType;
import android.content.Context;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import ix6.d;
import java.lang.Boolean;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import java.lang.Math;
import cw6.b;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.Fragment;
import pw6.a;
import cw6.c;
import org.json.JSONObject;
import com.yxcorp.gifshow.log.model.CommonParams;
import g51.a;
import java.lang.Runnable;
import k2b.u1;
import yy6.a;
import k2b.e0;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public class b implements a, e	// class@002422
{
    public final Context b;
    public final LiveSlideViewPager c;
    public GrootViewItemSwitchType d;
    public b e;
    public boolean f;
    public int g;
    public int h;
    public float i;
    public float j;

    public void b(LiveSlideViewPager p0){
       super();
       this.d = GrootViewItemSwitchType.PULL;
       this.f = false;
       this.g = -1;
       this.h = 0;
       this.c = p0;
       this.b = p0.getContext();
       p0.j0(this);
       p0.setGrootViewPagerInterceptor(this);
    }
    public void a(int p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, b.class, "3")) {
          return;
       }
       this.d = GrootViewItemSwitchType.PULL;
       return;
    }
    public boolean b(){
       return d.a(this);
    }
    public void c(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(b.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, b.class, "6")) {
             return;
          }
       }
       if (this.f == null) {
          this.j(this.c.getCurrentItem());
       }
       return;
    }
    public void d(int p0){
       if (this.h == p0) {
          return;
       }
       this.h = p0;
       return;
    }
    public boolean e(MotionEvent p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       b obj = PatchProxy.applyOneRefs(p0, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       if (action) {
          if (action == 1) {
             obj = this.i;
             b tj = this.j;
             if (PatchProxy.isSupport(uob)) {
                Object obj1 = PatchProxy.applyThreeRefs(p0, Float.valueOf(obj), Float.valueOf(tj), this, b.class, "4");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else if(Math.abs((tj - p0.getY())) - Math.abs((obj - p0.getX())) >= 0){
                   b = true;
                }else {
                   b = false;
                }
             }else {
                goto label_0043 ;
             }
             if (b && (this.j - p0.getY()) - 0x42c80000 > 0) {
                b te = this.e;
                if (te != null && te.g0() == this.c.getCurrentItem()) {
                   BaseFeed uBaseFeed = null;
                   SlidePlayLogger slidePlayLog = this.f();
                   if (slidePlayLog != null) {
                      slidePlayLog.isLiveStream();
                      uBaseFeed = slidePlayLog.getBaseFeed();
                   }
                   if (uBaseFeed != null) {
                      this.i(uBaseFeed, "manual", this.g, true);
                   }
                }
             }
          }
       }else {
          this.i = p0.getX();
          this.j = p0.getY();
       }
    label_009f :
       return true;
    }
    public final SlidePlayLogger f(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayLogger.getLogger(this.g());
    }
    public final Fragment g(){
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, b.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.e == null) {
          return objArray;
       }
       obj = this.h(this.c.getCurrentItem());
       if (obj == null) {
          a uoa = this.e.z();
          if (uoa != null) {
             obj = uoa.a();
          }
       }
       return obj;
    }
    public final Fragment h(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uob = this.e;
       if (uob == null) {
          return null;
       }else {
          a uoa = uob.C(p0);
          if (uoa != null) {
             return uoa.a();
          }else {
             return null;
          }
       }
    }
    public final void i(BaseFeed p0,String p1,int p2,boolean p3){
       int this;
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Boolean.valueOf(p3), this, b.class, "2")) {
          return;
       }
       SlidePlayLogger logger = SlidePlayLogger.getLogger(this.h(p2));
       if (logger != null) {
          this = (this.g < this.c.getCurrentItem())? 1: 2;
          JSONObject jSONObject = new JSONObject();
          String str = (p3)? "TRUE": "FALSE";
          try{
             jSONObject.put("is_done", str);
             e0.onButtonClicked(p0, p1, 1, 1, this, 317, jSONObject.toString(), null);
          }catch(org.json.JSONException e0){
          }
       }
    }
    public final void j(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "11")) {
          return;
       }
       this.f = true;
       this.g = p0;
       this.c.post(new a(this, p0));
       return;
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       int i;
       BaseFeed baseFeed;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "5")) {
          return;
       }
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "8")) {
          b tg = this.g;
          b uob1 = -1;
          if (tg == uob1) {
             i = 1;
          }else if(tg < p0){
             i = 5;
          }else {
             i = 6;
          }
          u1.K0(i);
          Fragment uFragment = this.g();
          SlidePlayLogger logger = SlidePlayLogger.getLogger(uFragment);
          if (logger != null) {
             logger.setShowType(i);
          }
          tg = this.g;
          if (tg != uob1) {
             Fragment uFragment1 = this.h(tg);
             if (uFragment != null && (uFragment1 != null && this.g != p0)) {
                if (uFragment1 instanceof a) {
                   SlidePlayLogger slidePlayLog = uFragment1.d1();
                   if (slidePlayLog != null) {
                      slidePlayLog.isLiveStream();
                      baseFeed = slidePlayLog.getBaseFeed();
                   label_006b :
                      uob1 = this.g;
                      if (!PatchProxy.isSupport(uob) || (PatchProxy.applyVoidOneRefs(Integer.valueOf(uob1), this, uob, "9") || (this.h(uob1) instanceof e0 && !PatchProxy.applyVoid(null, this, uob, "13")))) {
                         SlidePlayLogger logger1 = SlidePlayLogger.getLogger(this.h(this.g));
                         if (logger1 != null) {
                            int i1 = (this.g < this.c.getCurrentItem())? 8: 7;
                            logger1.setLeaveAction(i1);
                         }
                      }
                      if (baseFeed != null) {
                         this.i(baseFeed, "manual", this.g, false);
                      }
                      if (!PatchProxy.applyVoid(null, this, uob, "10") && this.b instanceof Activity) {
                         ClientEvent$UrlPackage urlPackage = u1.k();
                         if (urlPackage != null) {
                            slidePlayLog = this.f();
                            if (slidePlayLog != null) {
                               slidePlayLog.setReferUrlPackage(urlPackage);
                            }
                         }
                      }
                   }
                }
                baseFeed = null;
                goto label_006b ;
             }
          }
       label_00d6 :
          this.j(p0);
       }
       return;
    }
}
