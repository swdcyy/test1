package h19.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h19.e$a;
import h19.e$b;
import h19.e$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import ge5.d;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import vy6.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import rf5.u;
import joc.q;
import java.lang.Boolean;
import com.kwai.framework.activitycontext.ActivityContext;
import tkd.b;
import tkd.d;
import yxb.b;
import hn5.n;
import hn5.m;
import android.content.Context;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import im8.f;
import brd.y;
import joc.b0;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;

public class e extends PresenterV2	// class@00253e
{
    public Activity A;
    public g B;
    public boolean C;
    public SlidePlayViewModel D;
    public boolean E;
    public d F;
    public final d G;
    public final a H;
    public final m$d I;
    public QPhoto p;
    public PhotoDetailParam q;
    public BaseFragment r;
    public List s;
    public f t;
    public y u;
    public b0 v;
    public f w;
    public NormalDetailBizParam x;
    public u y;
    public List z;

    public void e(){
       super();
       this.G = new e$a(this);
       this.H = new e$b(this);
       this.I = new e$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.A = this.getActivity();
       e tF = this.F;
       if (tF != null) {
          this.B = tF.c;
       }
       this.D = SlidePlayViewModel.S0(this.r.getParentFragment());
       this.P8();
       this.E = this.q.enableSlidePlay();
       tF = this.D;
       if (tF != null) {
          tF.P(this.r, this.H);
       }else {
          tF = this.s;
          if (tF != null && !tF.contains(this.H)) {
             this.s.add(this.H);
          }
       }
       tF = this.z;
       if (tF != null) {
          tF.add(this.G);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       e tz = this.z;
       if (tz != null) {
          tz.remove(this.G);
       }
       tz = this.D;
       if (tz != null) {
          tz.D(this.r, this.H);
       }else {
          tz = this.s;
          if (tz != null) {
             tz.remove(this.H);
          }
       }
       return;
    }
    public void P8(){
       int i;
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "6")) {
          return;
       }
       if (this.E != null) {
          e obj = PatchProxy.apply(objArray, this, uoe, "12");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             obj = this.D;
             i = (obj != null)? obj.a0(): 0;
          }
          if (!i) {
             obj = this.y;
             if (obj == null || !obj.w()) {
                if (!PatchProxy.applyVoid(objArray, this, uoe, "7")) {
                   uoe = this.B;
                   if (uoe != null) {
                      uoe.f(false);
                   }
                }
             }
          }
          if (!PatchProxy.applyVoid(objArray, this, uoe, "8")) {
             uoe = this.B;
             if (uoe != null) {
                uoe.f(true);
             }
          }
       }
    label_005b :
       return;
    }
    public final boolean R8(){
       Activity obj = PatchProxy.apply(null, this, e.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = ActivityContext.g().e();
       boolean b = (d.a(-430326918).cR(obj) || m.a().U3(obj))? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.r8("DETAIL_FRAGMENT");
       this.s = this.t8("DETAIL_ATTACH_LISTENERS");
       this.t = this.x8("DETAIL_LOGGER");
       this.u = this.r8("PAGE_SMOOTH_SWIPE_OBSERVER");
       this.v = this.t8("DETAIL_VERTICAL_SWIPE");
       this.w = this.w8("DETAIL_FOLLOW_CARD_BITMAP");
       this.x = this.s8(NormalDetailBizParam.class);
       this.y = this.s8(u.class);
       this.z = this.t8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.F = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       return;
    }
}
