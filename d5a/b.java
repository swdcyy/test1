package d5a.b;
import xjd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d5a.b$a;
import nsd.u;
import d5a.b$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import d5a.b$c;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import android.view.View;
import java.util.Set;
import uw9.c;
import android.content.SharedPreferences;
import bm5.e;
import bm5.e$a;
import android.content.SharedPreferences$Editor;
import oe6.g;
import gm5.b;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import d5a.b$d;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import vy6.a;
import xjd.a$a;
import java.lang.Boolean;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import e5a.a;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.LandscapeEntrance;
import com.yxcorp.gifshow.detail.presenter.landscape.entity.SerialOpLandscapeEntrance;
import io.reactivex.subjects.PublishSubject;
import com.kwai.robust.PatchProxyResult;
import android.os.Build$VERSION;
import mrd.c;
import ge5.d;

public final class b extends PresenterV2 implements a	// class@001e7b
{
    public Fragment A;
    public View B;
    public final int[] C;
    public boolean D;
    public boolean E;
    public final k3 F;
    public BaseFragment p;
    public QPhoto q;
    public PublishSubject r;
    public Set s;
    public c t;
    public MilanoContainerEventBus u;
    public PublishSubject v;
    public d w;
    public NasaBizParam x;
    public SlidePlayViewModel y;
    public View z;
    public static final b$a G;

    static {
       b.G = new b$a(null);
    }
    public void b(){
       super();
       this.C = new int[2]{0,0};
       this.F = new b$b(this);
    }
    public void E8(){
       SharedPreferences a;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "3")) {
          return;
       }
       b tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       if (!LandscapeUtil.d(tq)) {
          return;
       }else {
          tq = this.p;
          String str = "mFragment";
          if (tq == null) {
             a.S(str);
          }
          this.y = SlidePlayViewModel.B0(tq.getParentFragment());
          tq = this.t;
          if (tq == null) {
             a.S("mRotationSubject");
          }
          this.X7(tq.distinctUntilChanged().observeOn(a.c()).subscribe(new b$c(this), Functions.e));
          tq = this.p;
          if (tq == null) {
             a.S(str);
          }
          View view = tq.getView();
          if (view != null) {
             objArray = view.findViewById(R.id.group_bottom_panel_root_layout);
          }
          this.B = objArray;
          tq = this.s;
          if (tq == null) {
             a.S("mDispatchListeners");
          }
          tq.add(this.F);
          a = c.a;
          String str1 = "gravityEnterLandscapeReset";
          b = false;
          if (!a.getBoolean(str1, b)) {
             e.a.b(b);
             SharedPreferences$Editor uEditor = a.edit();
             uEditor.putBoolean(str1, true);
             g.a(uEditor);
          }
          tq = this.q;
          if (tq == null) {
             a.S("mPhoto");
          }
          if (b.t(tq)) {
             tq = this.u;
             if (tq == null) {
                a.S("mMilanoContainerEventBus");
             }
             this.X7(tq.D.subscribe(new b$d(this)));
          }
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       Activity activity = this.getActivity();
       a.m(activity);
       this.z = activity.findViewById(0x7f0a39d5);
       return;
    }
    public boolean G(){
       return false;
    }
    public void J7(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "16")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.b(this, p0, p1, p2);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b ts = this.s;
       if (ts == null) {
          a.S("mDispatchListeners");
       }
       ts.remove(this.F);
       return;
    }
    public final void P8(boolean p0){
       boolean b;
       a uoa;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "6")) {
          return;
       }
       if (this.getActivity() != null && !n.I(this.getActivity())) {
          uob = this.x;
          if (uob != null) {
             NasaSlideParam nasaSlidePar = uob.getNasaSlideParam();
             if (nasaSlidePar != null) {
                b = nasaSlidePar.isSerialStyle();
             label_0036 :
                if (b) {
                   uoa = new a(LandscapeEntrance.GRAVITY, p0, true, SerialOpLandscapeEntrance.COLLECTION_DETAIL_PAGE);
                }else {
                   a uoa1 = new a(LandscapeEntrance.GRAVITY, p0, false, null, 12, null);
                }
                b tr = this.r;
                if (tr == null) {
                   a.S("mLandScapeEntranceClickObserver");
                }
                tr.onNext(uoa);
             }
          }
          b = false;
          goto label_0036 ;
       }
       return;
    }
    public final boolean R8(){
       boolean b;
       Activity obj = PatchProxy.apply(null, this, b.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = false;
       if (Build$VERSION.SDK_INT >= 24) {
          obj = this.getActivity();
          if (obj == null || obj.isInPictureInPictureMode() != true) {
             obj = this.getActivity();
             if (obj == null || obj.isInMultiWindowMode() != true) {
             label_0035 :
                return b;
             }
          }
          b = true;
          goto label_0035 ;
       }else {
          goto label_0035 ;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       obj = this.r8("SENSOR_LANDSCAPE_SUBJECT");
       a.o(obj, "inject\(LandscapeAccessId¡­SENSOR_LANDSCAPE_SUBJECT\)");
       this.t = obj;
       obj = this.r8("LANDSCAPE_ENTRANCE_CLICK_OBSERVER");
       a.o(obj, "inject\(AccessIds.LANDSCA¡­_ENTRANCE_CLICK_OBSERVER\)");
       this.r = obj;
       obj = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       a.o(obj, "inject\(AccessIds.DETAIL_SCREEN_TOUCH_LISTENER\)");
       this.s = obj;
       this.w = this.t8("PHOTO_ROOTVIEW_TOUCH_MANAGER");
       this.x = this.s8(NasaBizParam.class);
       this.v = this.t8("LANDSCAPE_EXIT_OBSERVER");
       obj = this.q8(MilanoContainerEventBus.class);
       a.o(obj, "inject\(MilanoContainerEventBus::class.java\)");
       this.u = obj;
       return;
    }
    public void s5(BaseFragment p0,SlidePlayViewModel p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, b.class, "15")) {
          return;
       }
       a.p(p0, "fragment");
       a.p(p2, "listener");
       a$a.a(this, p0, p1, p2);
       return;
    }
}
