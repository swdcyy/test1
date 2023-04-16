package i6a.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import i6a.o$a;
import nsd.u;
import i6a.o$b;
import i6a.o$c;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.util.List;
import com.yxcorp.gifshow.detail.slideplay.nasa.interest.InterestLabelsGroup;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Feed;
import tl8.d;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta;
import vy6.a;
import java.lang.CharSequence;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.d2;
import lnc.a1;
import android.content.Context;
import com.yxcorp.utility.n;
import usd.q;
import java.util.Objects;
import i6a.o$d;
import android.view.View$OnClickListener;
import i6a.o$e;
import com.yxcorp.gifshow.util.rx.RxBus;
import ve5.b;
import brd.t;
import t45.d;
import brd.z;
import i6a.o$f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import tkd.b;
import tkd.d;
import vo5.l;
import java.util.Map;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.detail.model.meta.InterestManagementV3Meta$InterestV3Entity;
import java.lang.Integer;
import java.lang.Boolean;
import android.view.View;
import ekd.m1;

public final class o extends PresenterV2	// class@0027a6
{
    public int A;
    public int B;
    public int C;
    public int D;
    public boolean E;
    public final o$b F;
    public final o$c G;
    public TextView p;
    public TextView q;
    public TextView r;
    public InterestLabelsGroup s;
    public TextView t;
    public TextView u;
    public PhotoDetailParam v;
    public BaseFragment w;
    public InterestManagementV3Meta x;
    public List y;
    public SlidePlayViewModel z;
    public static final o$a H;

    static {
       o.H = new o$a(null);
    }
    public void o(){
       super();
       this.A = 6;
       this.E = true;
       this.F = new o$b(this);
       this.G = new o$c(this);
    }
    public static final PhotoDetailParam P8(o p0){
       p0 = p0.v;
       if (p0 == null) {
          a.S("mDetailParam");
       }
       return p0;
    }
    public static final BaseFragment R8(o p0){
       p0 = p0.w;
       if (p0 == null) {
          a.S("mFragment");
       }
       return p0;
    }
    public static final List S8(o p0){
       p0 = p0.y;
       if (p0 == null) {
          a.S("mInterestList");
       }
       return p0;
    }
    public static final InterestLabelsGroup V8(o p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mLabelsGroup");
       }
       return p0;
    }
    public static final TextView W8(o p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mLeftBtn");
       }
       return p0;
    }
    public void E8(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, o.class, "3")) {
          return;
       }
       o tw = this.w;
       String str = "mFragment";
       if (tw == null) {
          a.S(str);
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tw.getParentFragment());
       a.o(slidePlayVie, "SlidePlayViewModel.get\(mFragment.parentFragment\)");
       this.z = slidePlayVie;
       tw = this.v;
       if (tw == null) {
          a.S("mDetailParam");
       }
       PhotoDetailParam mPhoto = tw.mPhoto;
       a.o(mPhoto, "mDetailParam.mPhoto");
       InterestManagementV3Feed interestMana = mPhoto.getEntity().a(InterestManagementV3Feed.class);
       InterestManagementV3Feed mInterestMan = (interestMana != null)? interestMana.mInterestManagementV3Meta: objArray;
       if (mInterestMan != null) {
          InterestManagementV3Meta mInterestEnt = interestMana.mInterestManagementV3Meta.mInterestEntityList;
          if (mInterestEnt != null && mInterestEnt.size() >= 2) {
             o tt = this.t;
             if (tt == null) {
                a.S("mLeftBtn");
             }
             tt.setClickable(true);
             tt = this.t;
             if (tt == null) {
                a.S("mLeftBtn");
             }
             boolean b = false;
             tt.setSelected(b);
             tt = this.z;
             if (tt == null) {
                a.S("mSlidePlayViewModel");
             }
             o tw1 = this.w;
             if (tw1 == null) {
                a.S(str);
             }
             tt.P(tw1, this.F);
             interestMana = interestMana.mInterestManagementV3Meta;
             a.o(interestMana, "feed.mInterestManagementV3Meta");
             this.x = interestMana;
             str = "mInterestMeta";
             if (interestMana == null) {
                a.S(str);
             }
             InterestManagementV3Meta mInterestEnt1 = interestMana.mInterestEntityList;
             a.o(mInterestEnt1, "mInterestMeta.mInterestEntityList");
             this.y = mInterestEnt1;
             this.X8();
             tw = this.q;
             if (tw == null) {
                a.S("mMainTitle");
             }
             tt = this.x;
             if (tt == null) {
                a.S(str);
             }
             tw.setText(tt.mTitle);
             tw = this.r;
             if (tw == null) {
                a.S("mSubTitle");
             }
             tt = this.x;
             if (tt == null) {
                a.S(str);
             }
             tw.setText(tt.mSubtitle);
             String str1 = "6";
             o obj = PatchProxy.applyWithListener(objArray, this, o.class, str1);
             if (obj != PatchProxyResult.class) {
                i = obj.intValue();
             }else {
                Context context = this.getContext();
                a.m(context);
                i = (((d2.e() - a1.d(0x7f070fdf)) - a1.e(262.00f)) - n.A(context)) - a1.d(0x7f070bf1);
                PatchProxy.onMethodExit(o.class, str1);
             }
             this.A = q.u((i / a1.e(66.00f)), 6);
             obj = this.s;
             str1 = "mLabelsGroup";
             if (obj == null) {
                a.S(str1);
             }
             tt = this.x;
             if (tt == null) {
                a.S(str);
             }
             tw1 = this.G;
             Objects.requireNonNull(obj);
             if (!PatchProxy.applyVoidTwoRefsWithListener(tt, tw1, obj, InterestLabelsGroup.class, "1")) {
                a.p(tt, "managementV3Meta");
                a.p(tw1, "progressChangeListener");
                obj.b = tt;
                obj.c = tw1;
                PatchProxy.onMethodExit(InterestLabelsGroup.class, "1");
             }
             this.Y8(b);
             obj = this.s;
             if (obj == null) {
                a.S(str1);
             }
             tw = this.y;
             if (tw == null) {
                a.S("mInterestList");
             }
             obj.a(tw.subList(this.B, this.C));
             obj = this.t;
             if (obj == null) {
                a.S("mLeftBtn");
             }
             tw = this.x;
             if (tw == null) {
                a.S(str);
             }
             obj.setText(tw.mChangeButtonText);
             obj = this.t;
             if (obj == null) {
                a.S("mLeftBtn");
             }
             obj.setOnClickListener(new o$d(this));
             obj = this.u;
             str1 = "mRightBtn";
             if (obj == null) {
                a.S(str1);
             }
             tt = this.x;
             if (tt == null) {
                a.S(str);
             }
             obj.setText(tt.mJumpButtonText);
             obj = this.u;
             if (obj == null) {
                a.S(str1);
             }
             obj.setOnClickListener(new o$e(this));
             obj = this.p;
             if (obj == null) {
                a.S("mSlideMoreText");
             }
             tw = this.x;
             if (tw == null) {
                a.S(str);
             }
             obj.setText(tw.mSlideMoreText);
             this.X7(RxBus.f.f(b.class).observeOn(d.a).subscribe(new o$f(this), Functions.d()));
             PatchProxy.onMethodExit(o.class, "3");
             return;
          }
       }
       PatchProxy.onMethodExit(o.class, "3");
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoidWithListener(null, this, o.class, "10")) {
          return;
       }
       o ts = this.s;
       if (ts == null) {
          a.S("mLabelsGroup");
       }
       ts.animate().cancel();
       ts = this.z;
       if (ts == null) {
          a.S("mSlidePlayViewModel");
       }
       o tw = this.w;
       if (tw == null) {
          a.S("mFragment");
       }
       ts.D(tw, this.F);
       PatchProxy.onMethodExit(o.class, "10");
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoidWithListener(null, this, o.class, "9")) {
          return;
       }
       int i = -1820879758;
       b uob = d.a(i);
       a.o(uob, "PluginManager.get\(InterestEditPlugin::class.java\)");
       Map map = uob.K10();
       if (map != null) {
          if (map.isEmpty()) {
             PatchProxy.onMethodExit(o.class, "9");
             return;
          }else {
             o ty = this.y;
             if (ty == null) {
                a.S("mInterestList");
             }
             Iterator iterator = ty.iterator();
             while (iterator.hasNext()) {
                InterestManagementV3Meta$InterestV3Entity interestV3En = iterator.next();
                if (map.get(interestV3En.mId) != null) {
                   interestV3En.mUpdatedWeight = map.get(interestV3En.mId);
                }
             }
             d.a(i).clearCache();
          }
       }
       PatchProxy.onMethodExit(o.class, "9");
       return;
    }
    public final void Y8(boolean p0){
       if (PatchProxy.isSupport2(o.class, "5") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), this, o.class, "5")) {
          return;
       }
       boolean b = false;
       this.B = (p0)? this.B + this.A: b;
       int i = this.B + this.A;
       this.C = i;
       o ty = this.y;
       if (ty == null) {
          a.S("mInterestList");
       }
       if (i >= ty.size()) {
          o ty1 = this.y;
          if (ty1 == null) {
             a.S("mInterestList");
          }
          this.C = ty1.size();
          this.E = b;
          ty1 = this.t;
          if (ty1 == null) {
             a.S("mLeftBtn");
          }
          ty1.setSelected(true);
       }
       PatchProxy.onMethodExit(o.class, "5");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, o.class, "2")) {
          return;
       }
       View view = m1.f(p0, R.id.interest_main_title);
       a.o(view, "bindWidget\(rootView, R.id.interest_main_title\)");
       this.q = view;
       view = m1.f(p0, R.id.interest_sub_title);
       a.o(view, "bindWidget\(rootView, R.id.interest_sub_title\)");
       this.r = view;
       view = m1.f(p0, R.id.interest_card_label_container);
       a.o(view, "bindWidget\(rootView, R.i¡­est_card_label_container\)");
       this.s = view;
       view = m1.f(p0, R.id.interest_left_button);
       a.o(view, "bindWidget\(rootView, R.id.interest_left_button\)");
       this.t = view;
       view = m1.f(p0, R.id.interest_right_button);
       a.o(view, "bindWidget\(rootView, R.id.interest_right_button\)");
       this.u = view;
       p0 = m1.f(p0, R.id.interest_slide_up_more);
       a.o(p0, "bindWidget\(rootView, R.id.interest_slide_up_more\)");
       this.p = p0;
       PatchProxy.onMethodExit(o.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, o.class, "1")) {
          return;
       }
       Object obj = this.q8(PhotoDetailParam.class);
       a.o(obj, "inject\(PhotoDetailParam::class.java\)");
       this.v = obj;
       obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.w = obj;
       PatchProxy.onMethodExit(o.class, "1");
       return;
    }
}
