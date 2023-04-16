package im1.e;
import k51.c;
import lnc.a1;
import im1.e$a;
import im1.e$b;
import im1.c;
import im1.b;
import im1.d;
import im1.e$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import hf3.a;
import p91.m;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeInfo;
import lf3.g;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import ekd.k1;
import e3.l;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import androidx.transition.ChangeBounds;
import android.graphics.drawable.Drawable;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.graphics.Color;
import java.util.Arrays;
import android.graphics.drawable.GradientDrawable$Orientation;
import va1.n0;
import java.lang.Integer;
import ekd.j;
import android.graphics.drawable.LayerDrawable;
import java.lang.Number;
import s81.a;
import android.content.SharedPreferences;
import android.view.View;
import i2b.a;
import im1.e$d;
import android.view.View$OnClickListener;
import androidx.transition.e;
import ab1.g;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.a;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import ekd.m1;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import com.yxcorp.utility.SystemUtil;
import o56.a;
import java.lang.RuntimeException;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.core.show.wishlist.LiveWishListResourcePathConstant;
import l12.d;
import va1.f0;
import android.widget.ProgressBar;
import com.kuaishou.livestream.message.nano.LiveRampageTimeMessage$LiveRampageTimeTextInfo;
import com.yxcorp.gifshow.models.Gift;
import cm1.a;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import vq5.d;
import lp3.i;
import qx1.a;
import lp3.c;

public class e extends c	// class@00294e
{
    public KwaiImageView A;
    public LottieAnimationView B;
    public ProgressBar C;
    public View D;
    public Drawable E;
    public ValueAnimator F;
    public final int[] G;
    public final int H;
    public final int[] I;
    public final int[] J;
    public Transition K;
    public Transition L;
    public ViewGroup M;
    public l N;
    public l O;
    public int P;
    public int Q;
    public int R;
    public l S;
    public long T;
    public LiveRampageTimeMessage$LiveRampageTimeInfo U;
    public final Runnable U0;
    public i V;
    public final c V0;
    public g W;
    public final Transition$f X;
    public final Runnable Y;
    public final Runnable Z;
    public long p;
    public int q;
    public m r;
    public b s;
    public d t;
    public LiveSlidePlayService u;
    public g v;
    public a w;
    public ViewGroup x;
    public TextView y;
    public TextView z;
    public static String sLivePresenterClassName = "LiveGiftRampagePendantPresenter";

    public void e(){
       super();
       int[] ointArray = new int[4];
       this.G = ointArray;
       this.H = a1.d(0x7f070334);
       int[] ointArray1 = new int[]{a1.a(0x7f060846),a1.a(0x7f060846)};
       this.I = ointArray1;
       ointArray = new int[2];
       this.J = ointArray;
       this.Q = 0;
       this.R = 0;
       this.W = new e$a(this);
       this.X = new e$b(this);
       this.Y = new c(this);
       this.Z = new b(this);
       this.U0 = new d(this);
       this.V0 = new e$c(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.r.u().u0(790, LiveRampageTimeMessage$LiveRampageTimeInfo.class, this.W);
       e tu = this.u;
       if (tu != null) {
          tu.P4(this.V0);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.r.u().o(790, this.W);
       e tu = this.u;
       if (tu != null) {
          tu.d5(this.V0);
       }
       this.c9();
       this.b9();
       k1.n(this);
       return;
    }
    public final l P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.O == null) {
          this.Z8();
          this.O = l.d(this.M, 0x7f0d0d7b, this.getContext());
       }
       return this.O;
    }
    public final Transition R8(){
       TransitionSet obj = PatchProxy.apply(null, this, e.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.L == null) {
          obj = new TransitionSet();
          obj.l0(new ChangeBounds());
          obj.r0(200);
          this.L = obj;
       }
       return this.L;
    }
    public final Drawable S8(){
       e j;
       int[] ointArray;
       int a;
       Drawable uDrawable = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, uDrawable, uoe, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (uDrawable.E == null) {
          obj = uDrawable.U;
          if (obj != null && !TextUtils.x(obj.backColor)) {
             int i = 0;
             j = uDrawable.J;
             while (i < j.length) {
                j[i] = Color.parseColor(uDrawable.U.backColor);
                i = i + 1;
             }
          }
          if (!PatchProxy.applyVoid(objArray, uDrawable, uoe, "14")) {
             Arrays.fill(uDrawable.G, uDrawable.H);
          }
          uoe = uDrawable.J;
          obj = uDrawable.I;
          j = uDrawable.G;
          GradientDrawable$Orientation bOTTOM_TOP = GradientDrawable$Orientation.BOTTOM_TOP;
          n0 on0 = n0.class;
          if (PatchProxy.isSupport(on0)) {
             Object[] objArray1 = new Object[]{uoe,obj,j,objArray,bOTTOM_TOP,Integer.valueOf(80),Integer.valueOf(2)};
             Object obj1 = PatchProxy.apply(objArray1, objArray, on0, "9");
             if (obj1 != patchProxyRe) {
                objArray = obj1;
             }else if(j.g(j)){
                ointArray = new int[]{a,a,a,a};
                a = n0.a;
             }
             if (ointArray.length == 4) {
                Drawable[] uDrawableArr = new Drawable[]{n0.b(obj, ointArray, bOTTOM_TOP),n0.c(uoe, ointArray, bOTTOM_TOP, 80, 2)};
                objArray = new LayerDrawable(uDrawableArr);
                objArray.setId(0, 0x1020000);
                objArray.setId(1, 0x102000d);
             }
          }else {
             goto label_0085 ;
          }
          uDrawable.E = objArray;
       }
       return uDrawable.E;
    }
    public final int V8(){
       Object obj = PatchProxy.apply(null, this, e.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.a.getInt("liveRampageShowedTimes", 0);
    }
    public final View W8(){
       ViewGroup obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x == null) {
          obj = a.a(this.getContext(), R.layout.arg_RES_7f0d0d79);
          this.x = obj;
          obj.setOnClickListener(new e$d(this));
       }
       return this.x;
    }
    public final void X8(l p0,Transition p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "12")) {
          return;
       }
       this.S = p0;
       e.f(p0, p1);
       return;
    }
    public void Y8(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "5")) {
          return;
       }
       if (this.P == null) {
          return;
       }
       this.b9();
       this.v.c(this.x, 1);
       this.d9(0);
       this.Q = 0;
       if (!PatchProxy.applyVoid(objArray, this, uoe, "29")) {
          if (this.r.e()) {
             this.s.yj(AnchorBizRelation.LIVE_GIFT_RAMPAGE);
          }else {
             this.s.yj(AudienceBizRelation.LIVE_GIFT_RAMPAGE);
          }
       }
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       if (this.M == null) {
          this.M = m1.f(this.W8(), 0x7f0a33e6);
       }
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, e.class, "18")) {
          return;
       }
       e tB = this.B;
       if (tB == null) {
          return;
       }
       tB.setAnimation(R.raw.arg_RES_7f0f003c);
       this.B.setProgress(0);
       this.B.setRepeatCount(-1);
       this.B.setRepeatMode(1);
       this.B.setVisibility(0);
       this.B.s();
       this.e9();
       return;
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, e.class, "27")) {
          return;
       }
       e tB = this.B;
       if (tB != null) {
          tB.f();
          this.B.t();
       }
       tB = this.M;
       if (tB != null) {
          try{
             e.d(tB);
          }catch(java.lang.Exception e0){
             b.y(LiveLogTag.GIFT.appendTag("LiveGiftRampage"), "LiveGiftRampagePendantPresenter releaseAnimation, TransitionManager.endTransitions", e0);
             if (SystemUtil.I() || a.d()) {
                throw new RuntimeException("LiveGiftRampagePendantPresenter releaseAnimation, TransitionManager.endTransitions", e0);
             }
          }
       }
       return;
    }
    public void c9(){
       if (PatchProxy.applyVoid(null, this, e.class, "26")) {
          return;
       }
       e tF = this.F;
       if (tF != null) {
          tF.cancel();
          this.F = null;
       }
       return;
    }
    public void d9(int p0){
       this.P = p0;
    }
    public final void e9(){
       e uoe = e.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoe, "17")) {
          return;
       }
       if (this.U != null && this.S != null) {
          if (!PatchProxy.applyVoid(objArray, this, uoe, "15")) {
             uoe = this.S;
             if (uoe != null) {
                this.y = m1.f(uoe.e(), 0x7f0a2481);
                this.z = m1.f(this.S.e(), 0x7f0a247d);
                KwaiImageView kwaiImageVie = m1.f(this.S.e(), R.id.live_rampage_gift_image_view);
                this.A = kwaiImageVie;
                f0.a(kwaiImageVie, LiveWishListResourcePathConstant.LIVE_WISH_LIST_DEFAULT_ICON);
                this.C = m1.f(this.S.e(), 0x7f0a2480);
                View view = m1.f(this.S.e(), R.id.live_wish_list_gift_container);
                this.D = view;
                view.setBackground(this.S8());
                this.B = m1.f(this.S.e(), 0x7f0a247e);
             }
          }
          this.C.setProgress((int)(this.U.progress * 100.00f));
          this.S8().setLevel(0);
          e uoe1 = 1;
          if (this.Q == 2 && this.P != uoe1) {
             this.C.setVisibility(8);
          }
          uoe = this.P;
          if (uoe == uoe1 || uoe == 2) {
             this.y.setText(this.U.textInfo.openMsg1);
             this.z.setText(this.U.textInfo.openMsg2);
          }else {
             this.y.setText(this.U.textInfo.closeMsg1);
             this.z.setText(this.U.textInfo.closeMsg2);
          }
          Gift gift = a.a(this.U.giftId);
          if (gift != null) {
             this.A.P(gift.mImageUrl);
          }
       }
    label_00fd :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.r8("LIVE_ROUTER_SERVICE");
       this.s = this.r8("LIVE_BIZ_RELATION_SERVICE");
       this.u = this.t8("LIVE_SLIDE_PLAY_SERVICE");
       this.v = this.r8("LIVE_SERVICE_WISH_AND_RAMGGE_SERVICE");
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.V = oi;
       this.w = oi.a(a.class);
       return;
    }
}
