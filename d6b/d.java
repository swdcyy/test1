package d6b.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d6b.d$a;
import nsd.u;
import d6b.d$d;
import d6b.d$e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import tw5.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.view.View;
import i2b.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import tw5.f;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.image.KwaiImageView;
import zf6.k;
import vrb.a;
import com.kwai.nearby.startup.local.model.NearbyMapConfig;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.util.Objects;
import android.widget.TextView;
import java.lang.CharSequence;
import d6b.h;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.map.MapLogger;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import xl8.b;
import brd.t;
import d6b.d$f;
import d6b.d$g;
import erd.g;
import crd.b;
import qvb.q;
import qvb.j;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.m;
import d6b.d$h;
import d6b.d$i;
import io.reactivex.internal.functions.Functions;
import qvb.i;
import com.airbnb.lottie.LottieAnimationView;
import android.view.View$OnTouchListener;
import com.yxcorp.utility.n;
import android.app.Activity;
import android.view.Window;
import android.view.ViewGroup;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import d6b.c;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import x5b.a;
import t45.d;
import brd.z;
import cjd.e;
import erd.o;
import d6b.d$b;
import d6b.d$c;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.lang.Integer;
import rm8.b;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import d6b.g;
import w4.j;
import ekd.m1;

public final class d extends PresenterV2	// class@00245f
{
    public String A;
    public String B;
    public boolean C;
    public boolean D;
    public a E;
    public boolean F;
    public final q G;
    public final RefreshLayout$h H;
    public boolean I;
    public boolean J;
    public final String p;
    public final int q;
    public f r;
    public d s;
    public ConstraintLayout t;
    public LottieAnimationView u;
    public c v;
    public BaseFragment w;
    public i x;
    public RefreshLayout y;
    public LocalDelegateType z;
    public static final d$a K;

    static {
       d.K = new d$a(null);
    }
    public void d(){
       super();
       this.p = "fromSource";
       this.q = 12;
       this.A = "";
       this.B = "";
       this.G = new d$d(this);
       this.H = new d$e(this);
    }
    public static final BaseFragment P8(d p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final d R8(d p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mLocalCurrentCity");
       }
       return p0;
    }
    public void E8(){
       Object[] objArray1;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "3")) {
          return;
       }
       View view = a.a(this.getContext(), R.layout.arg_RES_7f0d1122);
       a.o(view, "KwaiLayoutInflater.infla¡­ayout.photo_map_entrance\)");
       this.t = view;
       d tr = this.r;
       String str = "headerViewProvider";
       if (tr == null) {
          a.S(str);
       }
       view = tr.b(R.id.photo_map_entrance);
       if (!view instanceof RelativeLayout) {
          objArray1 = objArray;
       }
       d tr1 = this.r;
       if (tr1 == null) {
          a.S(str);
       }
       View view1 = tr1.b(R.id.photo_map_no_permission_entrance);
       if (!view1 instanceof RelativeLayout) {
          view1 = objArray;
       }
       d tt = this.t;
       if (tt == null) {
          a.S("mPhotoMapEntranceView");
       }
       if (!PatchProxy.applyVoidOneRefs(tt, this, uod, "13")) {
          View view2 = tt.findViewById(R.id.photo_map_entrance_icon);
          a.o(view2, "view.findViewById\(R.id.photo_map_entrance_icon\)");
          NearbyMapConfig mEntryDarkIc = (k.d())? a.b.b().mEntryDarkIcon: a.b.b().mEntryLightIcon;
          view2.L(mEntryDarkIc);
          view2 = tt.findViewById(R.id.photo_map_entrance_title);
          Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.TextView");
          view2.setText(a.b.b().mEntryMessage);
          tt.setOnClickListener(new h(this));
          d tw = this.w;
          if (tw == null) {
             a.S("mFragment");
          }
          if (!PatchProxy.applyVoidOneRefs(tw, objArray, MapLogger.class, "1")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             i3 oi3 = i3.f();
             oi3.d("has_third_tab", "FALSE");
             uElementPack.params = oi3.e();
             uElementPack.action2 = "NEARBY_TOP_BAR_ROAMING_BUTTON";
             uElementPack.action = 0;
             u1.D0("3332447", tw, 3, uElementPack, null, null);
          }
       }
       uod = this.r;
       if (uod == null) {
          a.S(str);
       }
       this.X7(uod.a().b().distinctUntilChanged().subscribe(new d$f(this, objArray1, view1), d$g.b));
       uod = this.x;
       if (uod == null) {
          a.S("mPageList");
       }
       uod.h(this.G);
       uod = this.y;
       if (uod == null) {
          a.S("mRefreshLayout");
       }
       uod.c(this.H);
       uod = this.w;
       if (uod == null) {
          a.S("mFragment");
       }
       this.X7(uod.Vg().f().firstElement().x(new d$h(this)));
       uod = this.w;
       if (uod == null) {
          a.S("mFragment");
       }
       this.X7(uod.Vg().j().subscribe(new d$i(this), Functions.d()));
       uod = this.x;
       if (uod == null) {
          a.S("mPageList");
       }
       if (uod.L0() != null) {
          this.X8();
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tx = this.x;
       if (tx == null) {
          a.S("mPageList");
       }
       tx.f(this.G);
       tx = this.y;
       if (tx == null) {
          a.S("mRefreshLayout");
       }
       tx.E(this.H);
       return;
    }
    public final void S8(LottieAnimationView p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "9")) {
          return;
       }
       if (p0 != null && p1 != null) {
          p0.t();
          p1.setOnTouchListener(null);
          View[] viewArray = new View[]{p1};
          n.Z(8, viewArray);
          Activity activity = this.getActivity();
          if (activity != null) {
             a.o(activity, "activity ?: return");
             activity.getWindow().findViewById(0x1020002).removeView(p1);
          }
       }
       return;
    }
    public final void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "10")) {
          return;
       }
       d tz = this.z;
       if (tz == null) {
          a.S("mLocalDelegateType");
       }
       if (tz != LocalDelegateType.ACTIVITY_LOCAL && this.I != null) {
          tz = this.v;
          if (tz == null) {
             a.S("bubbleHelper");
          }
          Objects.requireNonNull(tz);
          t ot = PatchProxy.applyOneRefs(p0, tz, c.class, "2");
          if (ot != PatchProxyResult.class) {
          }else {
             a.p(p0, "roamingCityId");
             ot = b.a(0x42d90323).e(p0).observeOn(d.c).map(new e()).observeOn(d.a);
             a.o(ot, "Singleton.get\(PhotoMapAp¡­veOn\(KwaiSchedulers.MAIN\)");
          }
          this.X7(ot.subscribe(new d$b(this), d$c.b));
       }
       return;
    }
    public final void W8(View p0,ViewGroup p1,ViewGroup$LayoutParams p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "6")) {
          return;
       }
       if (p0.getParent() != null) {
          ViewParent parent = p0.getParent();
          Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
          parent.removeView(p0);
       }
       p1.setVisibility(0);
       p1.addView(p0, p2);
       return;
    }
    public final void X8(){
       a b;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "7")) {
          return;
       }
       d tw = this.w;
       String str = "mFragment";
       if (tw == null) {
          a.S(str);
       }
       Bundle arguments = tw.getArguments();
       if (arguments != null) {
          String str1 = arguments.getString(this.p);
          if (str1 == null || (Integer.parseInt(str1) == this.q && this.F == null)) {
             long longx = b.a.getLong(b.d("user")+"message_local_map_entrance_guide_shown_num", 0);
             b = a.b;
             int i = (b.b().mLocalMapEntranceGuideCount == null)? 20: b.b().mLocalMapEntranceGuideCount;
             if (longx - (long)i >= 0) {
                return;
             }else {
                b.d((longx + 1));
                this.F = true;
                tw = this.w;
                if (tw == null) {
                   a.S(str);
                }
                Fragment parentFragme = tw.getParentFragment();
                View view = (parentFragme != null)? parentFragme.getView(): objArray;
                if (view instanceof ViewGroup) {
                   View view1 = a.d(this.getContext(), R.layout.arg_RES_7f0d0eac, objArray, false);
                   ConstraintLayout$LayoutParams layoutParams = new ConstraintLayout$LayoutParams(false, false);
                   layoutParams.h = 0;
                   layoutParams.k = 0;
                   layoutParams.d = 0;
                   layoutParams.g = 0;
                   view.addView(view1, layoutParams);
                   a.o(view1, "maskView");
                   if (!PatchProxy.applyVoidOneRefs(view1, this, uod, "8")) {
                      this.u = view1.findViewById(0x7f0a0d5e);
                      a.i(this.getContext(), "https://static.yximgs.com/udata/pkg/kwai-client-image/nearby_map/lottie_refresh_guide.json").addListener(new g(this, view1));
                   }
                }
             }
          }
       }
    label_00d2 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       p0 = m1.f(p0, R.id.refresh_layout);
       a.o(p0, "ViewBindUtils.bindWidget¡­iew, R.id.refresh_layout\)");
       this.y = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       Object obj = this.r8("NearbyHeaderProvider");
       a.o(obj, "inject\(NearbyHeaderViewProvider.ACCESSID\)");
       this.r = obj;
       obj = this.r8("local_current_city");
       a.o(obj, "inject\(AccessIds.LOCAL_CURRENT_CITY\)");
       this.s = obj;
       Object obj1 = this.r8("FRAGMENT");
       a.o(obj1, "inject\(AccessIds.FRAGMENT\)");
       this.w = obj1;
       obj1 = this.r8("PAGE_LIST");
       a.o(obj1, "inject\(AccessIds.PAGE_LIST\)");
       this.x = obj1;
       obj1 = this.q8(LocalDelegateType.class);
       a.o(obj1, "inject\(LocalDelegateType::class.java\)");
       this.z = obj1;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.v = new c(obj);
       return;
    }
}
