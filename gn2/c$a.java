package gn2.c$a;
import in2.a;
import gn2.c;
import java.lang.Object;
import oq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kuaishou.android.live.log.b;
import jv1.b;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import androidx.fragment.app.Fragment;
import dt5.c;
import dt5.b;
import java.util.Objects;
import xp5.g;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.c;
import lp3.i;
import w91.a;
import java.util.Map;
import com.kwai.feature.api.live.service.basic.bizrelation.LiveBizParam;
import com.kuaishou.live.common.core.component.recharge.d;
import com.kuaishou.live.core.show.wishlight.spring.view.WishLightGiftBoxComboTextAnimationView;
import ekd.k1;
import android.util.SparseArray;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import android.view.animation.Animation;
import java.lang.Integer;
import gn2.i;
import android.view.View;
import gn2.l;
import com.kuaishou.live.core.show.wishlight.spring.view.LiveBottomBarWishLightGiftView;
import d61.h;
import java.lang.Long;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.ValueAnimator;
import kn2.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.widget.ImageView;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Runnable;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.feature.api.social.login.model.LoginParams;
import n3d.a;

public class c$a implements a	// class@002b4e
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void Q0(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "10")) {
          return;
       }
       c n = this.a.N;
       if (n == null) {
          b.P(c.U, "unregisterLivePlayConfigurationListener, mLiveConfigurationService == null");
          return;
       }else {
          n.Q0(p0);
          return;
       }
    }
    public void W0(c p0,boolean p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "9")) {
          return;
       }
       c n = this.a.N;
       if (n == null) {
          b.P(c.U, "registerLivePlayConfigurationListener, mLiveConfigurationService == null");
          return;
       }else {
          n.W0(p0, p1);
          return;
       }
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return QCurrentUser.me().isLogined();
    }
    public c b(){
       Object[] objArray = null;
       BaseFragment obj = PatchProxy.apply(objArray, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.P.b();
       if (obj == null) {
          b.P(c.U, "getFragmentManager, baseFragment == null");
          return objArray;
       }else {
          c fragmentMana = obj.getFragmentManager();
          if (fragmentMana == null) {
             b.P(c.U, "getFragmentManager, fragmentManager == null");
          }
          return fragmentMana;
       }
    }
    public boolean c(){
       c obj = PatchProxy.apply(null, this, c$a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.M;
       if (obj != null) {
          return obj.c();
       }
       b.P(c.U, "mLivePlayClearScreenService, mLivePlayClearScreenService == null");
       return false;
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "12")) {
          return;
       }
       c m = this.a.M;
       if (m == null) {
          b.P(c.U, "removeClearScreenListener, mLivePlayClearScreenService == null");
          return;
       }else {
          m.d(p0);
          return;
       }
    }
    public void e(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "11")) {
          return;
       }
       c m = this.a.M;
       if (m == null) {
          b.P(c.U, "addClearScreenListener, mLivePlayClearScreenService == null");
          return;
       }else {
          m.e(p0);
          return;
       }
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "2")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "10")) {
          i.d(R.style.arg_RES_7f110668, a1.p(R.string.arg_RES_7f104257));
          if (ta.getActivity() == null) {
             b.P(c.U, "getActivity\(\) == null");
          }else {
             String liveStreamId = ta.L.a(g.class).getLiveStreamId();
             String str = (liveStreamId == null)? "": liveStreamId;
             liveStreamId = ta.L.a(g.class).d();
             String str1 = (liveStreamId == null)? "": liveStreamId;
             d.f("LIVE_ROOM_SEND_GIFT", ta.getActivity(), str, str1, ta.O, ta.P.i(), ta.L.a(a.class).d6());
          }
       }
       return;
    }
    public boolean g(){
       c obj = PatchProxy.apply(null, this, c$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a.N;
       if (obj != null) {
          return obj.H2();
       }
       b.P(c.U, "isLandSpace, mLiveConfigurationService == null");
       return false;
    }
    public void h(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c$a.class, "4")) {
          return;
       }
       c$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(objArray, ta, c.class, "12")) {
          c q = ta.Q;
          if (q != null && !PatchProxy.applyVoid(objArray, q, WishLightGiftBoxComboTextAnimationView.class, "8")) {
             k1.n(q);
             q.e();
             q.f.clear();
             q.e.clear();
             for (int i = 0; i < q.d.size(); i = i + 1) {
                q.d.valueAt(i).recycle();
             }
             q.d.clear();
             q.g.removeAllViews();
             Animation animation = q.getAnimation();
             if (animation != null) {
                animation.cancel();
             }
          }
       }
       return;
    }
    public void i(int p0,int p1){
       long l;
       int i;
       int i3;
       int i4;
       int i6;
       ValueAnimator obj2;
       Object obj = this;
       c$a uoa = c$a.class;
       String str = "3";
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), obj, uoa, str)) {
          return;
       }
       uoa = obj.a;
       Objects.requireNonNull(uoa);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), uoa, uoc, "11")) {
          uoc = uoa.R;
          Objects.requireNonNull(uoc);
          Object[] objArray = null;
          Activity obj1 = PatchProxy.apply(objArray, uoc, i.class, str);
          String str1 = "5";
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             i a = uoc.a;
             if (a != null) {
                Object obj3 = PatchProxy.apply(objArray, a, l.class, str1);
                if (obj3 != patchProxyRe) {
                   objArray = obj3;
                }else {
                   l m = a.m;
                   if (m != null) {
                      objArray = m.getComboView();
                   }
                }
             }
          }
          if (objArray == null) {
             b.P(c.U, "itemView == null");
          }else if(uoa.Q == null){
             uoa.Q = h.f(uoa.m8(), 0x7f0a1ac3, 0x7f0a283f);
          }
          c q = uoa.Q;
          Objects.requireNonNull(q);
          l = 3000;
          if (!PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), objArray, Long.valueOf(l), q, WishLightGiftBoxComboTextAnimationView.class, "2")) {
             float f = 2.00f;
             i = 2;
             int i1 = 1;
             boolean i2 = 0;
             if (q.getVisibility() == 8) {
                q.setVisibility(i2);
                if (!PatchProxy.applyVoidOneRefs(objArray, q, WishLightGiftBoxComboTextAnimationView.class, "4")) {
                   int[] ointArray1 = new int[i];
                   objArray.getLocationInWindow(ointArray1);
                   i3 = ointArray1[i1];
                   if (!PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), q, WishLightGiftBoxComboTextAnimationView.class, "13")) {
                      obj2 = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
                      obj2.addUpdateListener(new f(q, i3));
                      AnimatorSet uAnimatorSet = new AnimatorSet();
                      Animator[] uAnimatorArr = new Animator[i];
                      uAnimatorArr[i2] = j.a(q, new float[i]{0,0x3f800000});
                      uAnimatorArr[i1] = obj2;
                      uAnimatorSet.playTogether(uAnimatorArr);
                      uAnimatorSet.setDuration(800);
                      uAnimatorSet.setInterpolator(new DecelerateInterpolator(f));
                      uAnimatorSet.start();
                   }
                }
             }
             if (!PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), q, WishLightGiftBoxComboTextAnimationView.class, str)) {
                q.setComboTextVisibility(i2);
                List list = q.c(p0);
                List list1 = q.c(p1);
                i4 = list.size() + list1.size();
                int i9 = i4 + 1;
                if (i9 > q.e.size()) {
                   i9 = i9 - q.e.size();
                   for (i4 = 0; i4 < i9; i4 = i4 + 1) {
                      q.e.add(q.getComboNumberImageView());
                   }
                }else if(i9 < q.e.size()){
                   i9 = q.e.size();
                   i9 = i9 - 1;
                   while (i9 > i4) {
                      ImageView imageView = q.e.remove(i9);
                      q.g.removeView(imageView);
                      q.f.add(imageView);
                   }
                }
                for (i4 = 0; i4 < list.size(); i4 = i4 + 1) {
                   q.e.get(i4).setImageBitmap(q.b(q.d(list.get(i4).intValue())));
                }
                q.e.get(list.size()).setImageBitmap(q.b(WishLightGiftBoxComboTextAnimationView.n[10]));
                for (i4 = 0; i4 < list1.size(); i4 = i4 + 1) {
                   int i10 = list.size() + 1;
                   i10 = i10 + i4;
                   q.e.get(i10).setImageBitmap(q.b(q.d(list1.get(i4).intValue())));
                }
             }
             if (!PatchProxy.applyVoidOneRefs(objArray, q, WishLightGiftBoxComboTextAnimationView.class, str1)) {
                int[] ointArray = new int[i];
                objArray.getLocationInWindow(ointArray);
                i3 = (q.e.size() * WishLightGiftBoxComboTextAnimationView.j) + a1.d(0x7f070a36);
                if (q.c != i3 || q.b != ointArray[i2]) {
                   q.c = i3;
                   q.b = ointArray[i2];
                   obj1 = n.d(q);
                   if (obj1 != null) {
                      i4 = n.k(obj1);
                      RelativeLayout$LayoutParams layoutParams = q.getLayoutParams();
                      int i5 = ointArray[i2];
                      if (PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class)) {
                         i6 = 0;
                         obj2 = PatchProxy.applyFourRefs(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3), objArray, q, WishLightGiftBoxComboTextAnimationView.class, "6");
                         if (obj2 != patchProxyRe) {
                            i2 = obj2.booleanValue();
                         }else if(i4 && (i5 + (objArray.getWidth() / 2)) < ((i3 / 2) + WishLightGiftBoxComboTextAnimationView.l)){
                            i2 = true;
                         }else {
                            i2 = false;
                         }
                      }else {
                         i6 = 0;
                         int i8 = 2;
                         goto label_0284 ;
                      }
                      i = 21;
                      int i7 = 20;
                      if (i2) {
                         layoutParams.addRule(i7);
                         layoutParams.removeRule(i);
                         layoutParams.leftMargin = WishLightGiftBoxComboTextAnimationView.l;
                         layoutParams.rightMargin = i6;
                         i4 = 0;
                      }else {
                         i5 = ointArray[i6];
                         if (PatchProxy.isSupport(WishLightGiftBoxComboTextAnimationView.class)) {
                            obj2 = PatchProxy.applyFourRefs(Integer.valueOf(i5), Integer.valueOf(i4), Integer.valueOf(i3), objArray, q, WishLightGiftBoxComboTextAnimationView.class, "7");
                            if (obj2 != patchProxyRe) {
                               i2 = obj2.booleanValue();
                            }else if(!i4){
                               i2 = false;
                            }else if((i4 - (i5 + (objArray.getWidth() / 2))) < ((i3 / 2) + WishLightGiftBoxComboTextAnimationView.l)){
                               i1 = 0;
                            }
                            i2 = i1;
                         }else {
                            i6 = 21;
                            goto label_02de ;
                         }
                         if (i2) {
                            layoutParams.addRule(21);
                            layoutParams.removeRule(20);
                            layoutParams.leftMargin = 0;
                            layoutParams.rightMargin = WishLightGiftBoxComboTextAnimationView.l;
                         }else {
                            layoutParams.removeRule(20);
                            layoutParams.removeRule(21);
                            i2 = (int)((float)ointArray[0] + ((float)objArray.getWidth() / 2.00f)) - (i3 / 2);
                         label_0325 :
                            q.setLayoutParams(layoutParams);
                            q.setTranslationX((float)i2);
                         }
                      }
                      i2 = 0;
                      goto label_0325 ;
                   }
                }
             }
             k1.m(q.i);
             k1.s(q.i, q, 3000);
          }
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, c$a.class, "6")) {
          return;
       }
       d.a(-1712118428).x00(this.a.getActivity(), 44, null, null);
       return;
    }
}
