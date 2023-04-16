package l7a.a;
import vy6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import l7a.a$a;
import l7a.a$b;
import l7a.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.RecreationSettingInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uc6.c;
import sd5.d;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper;
import android.app.Activity;
import android.view.ViewGroup;
import xx9.a;
import java.util.Objects;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.util.ArrayList;
import java.util.List;
import com.kuaishou.android.model.mix.HotAreaInfo;
import m7a.d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import m7a.a;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.helper.RecreationHotAreaHelper$RecreationClickActionType;
import m7a.b;
import m7a.c;
import com.yxcorp.gifshow.detail.slideplay.presenter.recreation.view.VideoHotAreaMaskView;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnLayoutChangeListener;
import jta.c;
import r7a.f;
import java.lang.Boolean;
import ekd.m1;
import sd5.c;
import im8.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class a extends PresenterV2 implements a	// class@002d5e
{
    public List A;
    public boolean B;
    public final c C;
    public final t0 D;
    public final View$OnLayoutChangeListener E;
    public ViewGroup p;
    public View q;
    public QPhoto r;
    public RecreationHotAreaHelper s;
    public d t;
    public SlidePlayViewModel u;
    public BaseFragment v;
    public boolean w;
    public f x;
    public a y;
    public List z;

    public void a(){
       super();
       this.C = new a$a(this);
       this.D = new a$b(this);
       this.E = new a$c(this);
    }
    public void B0(){
    }
    public void E8(){
       b uob;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, this, a.class, str)) {
          return;
       }
       if (this.p != null) {
          a tr = this.r;
          if (tr != null && tr.getRecreationSettingInfo() != null) {
             SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.v.getParentFragment());
             this.u = slidePlayVie;
             if (slidePlayVie == null) {
                return;
             }else {
                slidePlayVie.P(this.v, this);
                if (this.r.isVideoType() && this.r.isRecreationPhoto()) {
                   View view = this.t.N().m();
                   this.q = view;
                   if (view == null) {
                      return;
                   }else {
                      RecreationHotAreaHelper recreationHo = new RecreationHotAreaHelper(this.getActivity(), this.p, this.q, this.r, this.y);
                      this.s = view;
                      Objects.requireNonNull(view);
                      recreationHo = RecreationHotAreaHelper.class;
                      if (!PatchProxy.applyVoid(objArray, view, recreationHo, "1")) {
                         Object[] objArray1 = new Object[0];
                         o.C().w("RecreationHotAreaHelper", "attachMaskViewToRoot, photo: "+view.c, objArray1);
                         if (view.b != null) {
                            if (!PatchProxy.applyVoid(objArray, view, recreationHo, "4")) {
                               objArray1 = new Object[0];
                               o.C().w("RecreationHotAreaHelper", "init DataSet, photo: "+view.c, objArray1);
                               if (view.i == null) {
                                  view.i = new ArrayList();
                               }
                               RecreationHotAreaHelper d = view.d;
                               if (d != null) {
                                  RecreationSettingInfo mHotAreaInfo = d.mHotAreaInfos;
                                  if (mHotAreaInfo != null) {
                                     for (int i = 0; i < mHotAreaInfo.size(); i = i + 1) {
                                        HotAreaInfo hotAreaInfo = mHotAreaInfo.get(i);
                                        d uod = new d();
                                        uod.b = hotAreaInfo.mPriority;
                                        HotAreaInfo mTaskId = hotAreaInfo.mTaskId;
                                        if (PatchProxy.isSupport(recreationHo)) {
                                           uob = PatchProxy.applyOneRefs(Integer.valueOf(mTaskId), view, recreationHo, "6");
                                           if (uob != PatchProxyResult.class) {
                                           }else if(mTaskId == RecreationHotAreaHelper$RecreationClickActionType.PROFILE.mValue){
                                              uob = new b(view);
                                           }else if(mTaskId == RecreationHotAreaHelper$RecreationClickActionType.PHOTO_DETAIL.mValue){
                                              uob = new c(view);
                                           }else {
                                              uob = objArray;
                                           }
                                        }else {
                                           goto label_0100 ;
                                        }
                                        uod.c = uob;
                                        uod.d = hotAreaInfo.mKwaiLink;
                                        view.i.add(uod);
                                     }
                                  }
                               }
                            }
                            if (view.g == null && !PatchProxy.applyVoid(objArray, view, recreationHo, str)) {
                               Object[] objArray2 = new Object[0];
                               o.C().w("RecreationHotAreaHelper", "Create image mask View, photo: "+view.c, objArray2);
                               VideoHotAreaMaskView videoHotArea = new VideoHotAreaMaskView(view.a);
                               view.g = videoHotArea;
                               videoHotArea.c = view.i;
                               videoHotArea.g = view.f;
                               videoHotArea.h = view.d.mHotAreaInfos;
                            }
                            view.b.addView(view.g, new ViewGroup$LayoutParams(-1, -1));
                         }
                      }
                      this.q.removeOnLayoutChangeListener(this.E);
                      this.q.addOnLayoutChangeListener(this.E);
                   }
                }
                this.x.a(this.C);
                this.z.add(this.D);
                this.A.add(this.D);
             }
          }
       }
       return;
    }
    public void F1(){
       this.w = false;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       this.x.c(this.C);
       this.z.remove(this.D);
       this.A.remove(this.D);
       a ts = this.s;
       if (ts != null) {
          Objects.requireNonNull(ts);
          if (!PatchProxy.applyVoid(objArray, ts, RecreationHotAreaHelper.class, "2")) {
             Object[] objArray1 = new Object[0];
             o.C().w("RecreationHotAreaHelper", "detachMaskViewToRoot, photo: "+ts.c, objArray1);
             RecreationHotAreaHelper b = ts.b;
             if (b != null) {
                b.removeView(ts.g);
             }
             if (ts.i != null) {
                ts.i = objArray;
             }
          }
          this.s = objArray;
       }
       ts = this.u;
       if (ts != null) {
          ts.D(this.v, this);
       }
       ts = this.q;
       if (ts != null) {
          ts.removeOnLayoutChangeListener(this.E);
       }
       return;
    }
    public boolean P8(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = (obj != null && obj.r())? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a30f6);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.t = uod;
       this.W7(uod);
       return;
    }
    public void i2(){
       this.w = true;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.r = this.q8(QPhoto.class);
       this.v = this.r8("DETAIL_FRAGMENT");
       this.x = this.r8("NASA_SIDEBAR_STATUS");
       this.z = this.r8("SLIDE_PLAY_COMMENT_PANEL_STATE_LISTENER_LIST");
       this.A = this.r8("SLIDE_PLAY_AI_TEXT_PANEL_STATE_LISTENER_LIST");
       this.y = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       return;
    }
    public void k1(){
    }
}
