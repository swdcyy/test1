package b8a.v;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.v$a;
import nsd.u;
import b8a.v$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import b8a.v$c;
import erd.g;
import crd.b;
import brd.t;
import lnc.u1;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.utility.Log;
import xx9.a;
import rf5.u;
import java.lang.StringBuilder;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import mhc.y1;

public final class v extends PresenterV2	// class@00040f
{
    public BaseFragment p;
    public QPhoto q;
    public a r;
    public SlidePlayViewModel s;
    public t t;
    public u u;
    public boolean v;
    public boolean w;
    public final a x;
    public static final v$a y;

    static {
       v.y = new v$a(null);
    }
    public void v(){
       super();
       this.x = new v$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, v.class, "2")) {
          return;
       }
       v tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
       this.s = slidePlayVie;
       if (slidePlayVie != null) {
          v tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          slidePlayVie.P(tp1, this.x);
       }
       tp = this.t;
       if (tp == null) {
          a.S("mMoreOperationPanelShowObservable");
       }
       this.X7(tp.subscribe(new v$c(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, v.class, "3")) {
          return;
       }
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, v.class, "4")) {
          return;
       }
       u1.b(this);
       return;
    }
    public final void P8(boolean p0,String p1){
       v tr1;
       v ov = v.class;
       if (PatchProxy.isSupport(ov) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ov, "6")) {
          return;
       }
       boolean b = true;
       String str = "NasaPanelClearScreen";
       if (p0) {
          Activity activity = this.getActivity();
          if (!activity instanceof GifshowActivity) {
             activity = null;
          }
          if (activity != null) {
             Lifecycle lifecycle = activity.getLifecycle();
             if (lifecycle != null) {
                Lifecycle$State currentState = lifecycle.getCurrentState();
                if (currentState != null && currentState.isAtLeast(Lifecycle$State.RESUMED) == b) {
                label_0041 :
                   v tr = this.r;
                   if (tr == null) {
                      a.S("mScreenCleanStatusCombination");
                   }
                   if (tr.c()) {
                      Log.g(str, "clearScreen failed: isInClearStatus");
                      return;
                   }else {
                      tr = this.u;
                      if (tr == null) {
                         a.S("mSwipeToProfileFeedMovement");
                      }
                      if (tr.w()) {
                         Log.g(str, "clearScreen failed: sideBarExpand");
                         return;
                      }else {
                         Log.g(str, "clearScreen: "+p0+" by "+p1);
                         if (p0) {
                            this.v = b;
                            tr1 = this.r;
                            if (tr1 == null) {
                               a.S("mScreenCleanStatusCombination");
                            }
                            tr1.f(new j(ChangeScreenVisibilityCause.SHARE_PANEL, false, false));
                         }else {
                            this.v = false;
                            tr1 = this.r;
                            if (tr1 == null) {
                               a.S("mScreenCleanStatusCombination");
                            }
                            tr1.f(new j(ChangeScreenVisibilityCause.SHARE_PANEL, b, false));
                         }
                         return;
                      }
                   }
                }
             }
          }
          Log.g(str, "clearScreen failed: activityNotResumed");
          return;
       }else {
          goto label_0041 ;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, v.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       a.o(obj, "inject\(DetailAccessIds.DETAIL_SCREEN_CLEAN_STATUS\)");
       this.r = obj;
       obj = this.r8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       a.o(obj, "inject\(AccessIds.MORE_OP¡­ON_PANEL_SHOW_OBSERVABLE\)");
       this.t = obj;
       obj = this.q8(u.class);
       a.o(obj, "inject\(SwipeToProfileFeedMovement::class.java\)");
       this.u = obj;
       return;
    }
    public final void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v.class, "5")) {
          return;
       }
       a.p(p0, "shownEvent");
       if (this.w == null) {
          return;
       }
       Log.g("NasaPanelClearScreen", "clearScreen for sharePanel");
       this.P8(p0.a, "SharePanel");
       return;
    }
}
