package com.yxcorp.gifshow.homepage.serchcard.e;
import com.yxcorp.gifshow.homepage.serchcard.b;
import lnc.a1;
import com.kwai.component.feedstaggercard.model.CardStyle;
import lua.g;
import java.util.ArrayList;
import com.yxcorp.gifshow.homepage.serchcard.e$a;
import com.yxcorp.gifshow.homepage.serchcard.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import wkd.b;
import com.yxcorp.gifshow.homepage.serchcard.d;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.w;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mua.a;
import ok.x;
import java.lang.Number;
import dsa.b;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.model.HotSurveyActionDetailSurvey;
import com.yxcorp.gifshow.model.d;
import org.greenrobot.eventbus.a;
import jsa.d;
import android.widget.TextView;
import java.lang.Float;
import java.lang.Integer;
import com.yxcorp.gifshow.homepage.serchcard.model.SearchCardMeta$RelateSearchWord;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.homepage.serchcard.e$d;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.lang.CharSequence;
import lua.f;
import android.view.View$OnClickListener;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.GridLayoutManager;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import nua.a;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kwai.feature.component.entry.SearchEntryActionRecorder;
import com.kwai.feature.component.entry.SearchEntryActionRecorder$SignalType;
import android.view.ViewStub;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import java.lang.Long;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet$Builder;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.View$MeasureSpec;
import com.yxcorp.gifshow.homepage.serchcard.e$c;
import ekd.m1;

public class e extends b	// class@001801
{
    public ViewStub A;
    public View B;
    public View C;
    public View D;
    public View E;
    public CardStyle F;
    public SearchCardMeta G;
    public int H;
    public boolean I;
    public final g J;
    public final List K;
    public final GridLayoutManager$b L;
    public final RecyclerView$o M;
    public TextView y;
    public RecyclerView z;
    public static final int N;
    public static final int O;
    public static final int P;

    static {
       e.N = a1.e(8.00f);
       e.O = a1.e(8.00f);
       e.P = a1.e(8.00f);
    }
    public void e(CardStyle p0){
       super();
       this.H = 0;
       this.I = true;
       this.J = new g(a1.e(8.00f), a1.e(8.00f));
       this.K = new ArrayList();
       this.L = new e$a(this);
       this.M = new e$b(this);
       this.F = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       super.E8();
       u1.a(this);
       SearchCardMeta searchCardMe = b.a(0x325d46d9).d();
       if (this.b9(searchCardMe) && !w.t0(this.q.mEntity)) {
          this.G = searchCardMe;
          this.a9();
          this.Z8(searchCardMe);
          this.d9(false, searchCardMe);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       super.J8();
       u1.b(this);
       if (this.I != null) {
          this.Y8(false);
       }
       e tz = this.z;
       if (tz != null) {
          tz.removeOnChildAttachStateChangeListener(this.M);
       }
       return;
    }
    public boolean P8(){
       boolean b1;
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, e.class, "5");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = a.class;
       Object obj1 = PatchProxy.apply(objArray, objArray, obj, "3");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b1 = obj1.booleanValue();
       }else if(a.a.get().booleanValue()){
          Object obj2 = PatchProxy.apply(objArray, objArray, obj, "1");
          if (obj2 != patchProxyRe) {
             l = obj2.longValue();
          }else {
             l = a.b;
             if (l < 0) {
                l = b.a.getLong("lastSearchCardClosedTime", 0);
                a.b = l;
             }
          }
          if (DateUtils.J(l)) {
             b1 = false;
          }
       }
       b1 = true;
       if (b1 && !this.b9(b.a(0x325d46d9).d())) {
          b = true;
       }
       return b;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, e.class, "6")) {
          return;
       }
       this.Y8(false);
       return;
    }
    public void W8(SearchCardMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "4")) {
          return;
       }
       if (p0 == null || (!q.f(p0.mRelateSearchWordList) && (p0.mRelateSearchWordList.size() < 3 || (!w.A0(this.q.mEntity) && d.a(this.q.mEntity) == null)))) {
          b tu = this.u;
          tu.b = p0;
          b tq = this.q;
          tu.d().mQPhoto = tq;
          this.G = p0;
          w.C1(tq.mEntity, false);
          this.a9();
          this.Z8(p0);
          a.d().k(new d());
          this.d9(true, p0);
          this.u.g(-1);
       }
    label_0064 :
       return;
    }
    public final boolean X8(float p0,List p1,int p2,TextView p3){
       if (PatchProxy.isSupport(e.class)) {
          Object obj = PatchProxy.applyFourRefs(Float.valueOf(p0), p1, Integer.valueOf(p2), p3, this, e.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = ((p3.getPaint().measureText(TextUtils.k(p1.get(p2).mKeyWord)) + (float)(e.P * 2)) - p0 <= 0)? true: false;
       return b;
    }
    public final void Y8(boolean p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "13")) {
          return;
       }
       uoe = this.B;
       if (uoe != null) {
          Property property = 8;
          if (uoe.getVisibility() != property) {
             if (p0) {
                e tC = this.C;
                float[] uofloatArray = new float[]{0,(float)tC.getHeight()};
                ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(tC, View.TRANSLATION_Y, uofloatArray);
                this.c9(250, new e$d(this), objectAnimat, ObjectAnimator.ofFloat(this.E, View.ALPHA, new float[2]{0x3f800000,0}));
             }else {
                this.B.setVisibility(property);
             }
             this.K.clear();
             this.H = 0;
          }
       }
       return;
    }
    public final void Z8(SearchCardMeta p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "8")) {
          return;
       }
       if (p0 != null && !q.f(p0.mRelateSearchWordList)) {
          this.y.setText(TextUtils.k(p0.mTitle));
          this.D.setOnClickListener(new f(this));
          this.C.setOnClickListener(null);
          this.z.setItemAnimator(null);
          this.z.removeItemDecoration(this.J);
          GridLayoutManager gridLayoutMa = new GridLayoutManager(this.getContext(), 2);
          gridLayoutMa.m1(this.L);
          this.z.addItemDecoration(this.J);
          this.z.setLayoutManager(gridLayoutMa);
          boolean b = false;
          a uoa = new a(b, p0);
          if (p0.mRelateSearchWordList.size() > 4) {
             p0.mRelateSearchWordList = p0.mRelateSearchWordList.subList(b, 4);
          }
          uoa.W0(p0.mRelateSearchWordList);
          this.z.setAdapter(uoa);
          b.a(0x7fb69d0c).e("search_entrance_findrs", SearchEntryActionRecorder$SignalType.USER_SHOW_COUNT);
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, e.class, "7")) {
          return;
       }
       if (this.z == null) {
          View view = this.A.inflate();
          this.B = view;
          this.C = view.findViewById(0x7f0a376e);
          this.y = this.B.findViewById(0x7f0a377a);
          this.z = this.B.findViewById(0x7f0a0e34);
          this.D = this.B.findViewById(0x7f0a0782);
          this.E = this.B.findViewById(0x7f0a376d);
       }
       RelativeLayout$LayoutParams layoutParams = this.B.getLayoutParams();
       layoutParams.height = -2;
       layoutParams.width = -1;
       layoutParams.addRule(10, -1);
       layoutParams.addRule(8, R.id.photo_cover_container);
       layoutParams.removeRule(12);
       this.B.setLayoutParams(layoutParams);
       this.z.addOnChildAttachStateChangeListener(this.M);
       return;
    }
    public final boolean b9(SearchCardMeta p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 == null) {
          return false;
       }
       return TextUtils.n(p0.mFromPhotoId, this.q.getPhotoId());
    }
    public final void c9(long p0,Animator$AnimatorListener p1,Animator p2,Animator p3){
       if (PatchProxy.isSupport(e.class) && PatchProxy.applyVoidFourRefs(Long.valueOf(p0), p1, p2, p3, this, e.class, "14")) {
          return;
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.play(p2).with(p3);
       uAnimatorSet.setDuration(p0);
       uAnimatorSet.setStartDelay(200);
       uAnimatorSet.setInterpolator(new DecelerateInterpolator(0x3fc00000));
       uAnimatorSet.addListener(p1);
       uAnimatorSet.start();
       return;
    }
    public final void d9(boolean p0,SearchCardMeta p1){
       float f;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uoe, "12")) {
          return;
       }
       uoe = this.B;
       if (uoe != null && uoe.getVisibility()) {
          int i = 0;
          if (p0) {
             int height = this.C.getHeight();
             if (!height) {
                this.C.measure(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
                height = this.C.getMeasuredHeight();
             }
             float[] uofloatArray = new float[]{f,0};
             f = (float)(height + a1.e(28.00f));
             this.c9(250, new e$c(this, f), ObjectAnimator.ofFloat(this.C, View.TRANSLATION_Y, uofloatArray), ObjectAnimator.ofFloat(this.E, View.ALPHA, new float[2]{0,0x3f800000}));
          }else {
             this.B.setVisibility(i);
             this.C.setVisibility(i);
             this.E.setVisibility(i);
          }
          if (p1.mHasShown == null) {
             p1.mHasShown = true;
          }
       }
    label_0085 :
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.A = m1.f(p0, 0x7f0a0e33);
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "11")) {
          return;
       }
       this.Y8(false);
       return;
    }
}
