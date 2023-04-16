package com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2;
import ka2.a;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import ba2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.AnimatorSet;
import java.lang.Runnable;
import ekd.k1;
import android.view.View;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.basic.degrade.j;
import th0.d;
import android.animation.TimeInterpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import java.lang.Boolean;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$b;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$c;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$d;
import com.kuaishou.livestream.message.nano.TopDistrictRank;
import android.view.ViewGroup;
import i2b.a;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import crd.b;
import lnc.b9;
import ekd.j;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import uc.d;
import brd.t;
import com.kuaishou.live.common.core.basic.tools.l;
import ba2.a;
import com.kuaishou.live.core.show.hourlytrank.b;
import erd.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.res.Resources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import k17.b;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import ba2.f;
import java.util.ArrayList;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import java.util.List;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Number;
import com.kuaishou.live.core.show.hourlytrank.LiveFancyRankResultViewV2$e;
import java.lang.Math;
import ka2.a$a;

public class LiveFancyRankResultViewV2 extends FrameLayout implements a	// class@000bf1
{
    public View b;
    public TextView c;
    public View d;
    public TextView e;
    public TextView f;
    public RecyclerView g;
    public View h;
    public View i;
    public AnimatorSet j;
    public AnimatorSet k;
    public final Runnable l;
    public LiveFancyRankResultViewV2$e m;
    public f n;
    public a$a o;
    public b p;
    public static final int q;

    public void LiveFancyRankResultViewV2(Context p0){
       super(p0, null);
    }
    public void LiveFancyRankResultViewV2(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveFancyRankResultViewV2(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.l = new b(this);
       this.f();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveFancyRankResultViewV2.class, "8")) {
          return;
       }
       LiveFancyRankResultViewV2 tj = this.j;
       if (tj != null && tj.isRunning()) {
          this.j.cancel();
          this.j = null;
       }
       tj = this.k;
       if (tj != null && tj.isRunning()) {
          this.k.cancel();
          this.k = null;
       }
       k1.m(this.l);
       return;
    }
    public ObjectAnimator b(View p0,int p1,int p2,AnimatorListenerAdapter p3){
       float[] obj;
       if (PatchProxy.isSupport(LiveFancyRankResultViewV2.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, LiveFancyRankResultViewV2.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new float[]{(float)p1,(float)p2};
       ObjectAnimator objectAnimat = j.a(p0, obj);
       objectAnimat.setDuration(300);
       objectAnimat.setInterpolator(new d());
       if (p3 != null) {
          objectAnimat.addListener(p3);
       }
       return objectAnimat;
    }
    public ValueAnimator c(View p0,int p1,int p2,boolean p3){
       int[] obj;
       if (PatchProxy.isSupport(LiveFancyRankResultViewV2.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, LiveFancyRankResultViewV2.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new int[]{p1,p2};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.addUpdateListener(new LiveFancyRankResultViewV2$a(this, p0));
       valueAnimato.addListener(new LiveFancyRankResultViewV2$b(this, p3, p0));
       valueAnimato.setDuration(400);
       valueAnimato.setInterpolator(new d());
       return valueAnimato;
    }
    public ValueAnimator d(View p0,int p1,int p2,boolean p3){
       int[] obj;
       if (PatchProxy.isSupport(LiveFancyRankResultViewV2.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Boolean.valueOf(p3), this, LiveFancyRankResultViewV2.class, "12");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new int[]{p1,p2};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(obj);
       valueAnimato.addUpdateListener(new LiveFancyRankResultViewV2$c(this, p0));
       valueAnimato.addListener(new LiveFancyRankResultViewV2$d(this, p3, p0));
       valueAnimato.setDuration(300);
       valueAnimato.setInterpolator(new d());
       return valueAnimato;
    }
    public String e(TopDistrictRank p0){
       return "";
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LiveFancyRankResultViewV2.class, "1")) {
          return;
       }
       a.c(this.getContext(), this.getResourceLayout(), this);
       this.b = this.findViewById(0x7f0a1c67);
       this.i = this.findViewById(0x7f0a1c68);
       this.c = this.findViewById(0x7f0a1c75);
       this.d = this.findViewById(0x7f0a1c6a);
       this.e = this.findViewById(0x7f0a1c6b);
       this.f = this.findViewById(0x7f0a1c70);
       this.g = this.findViewById(0x7f0a1c6f);
       this.h = this.findViewById(0x7f0a1c76);
       return;
    }
    public void g(TopDistrictRank p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV2.class, "4")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV2.class, "5")) {
          b9.a(this.p);
          if (!j.h(p0.globalTopBackgroundPicUrls)) {
             this.p = l.e(e0.i(p0.globalTopBackgroundPicUrls), null).subscribe(new a(this), b.b);
          }
       }
       this.c.setText(p0.strikingRankPeriod);
       TopDistrictRank strikingDesc = p0.strikingDescription;
       int i = 8;
       int i1 = 0;
       if (!PatchProxy.applyVoidOneRefs(strikingDesc, this, LiveFancyRankResultViewV2.class, "6")) {
          if (TextUtils.x(strikingDesc)) {
             this.d.setVisibility(i);
          }else {
             this.d.setVisibility(i1);
          }
          String[] stringArray = strikingDesc.split(" ");
          if (stringArray == null || stringArray.length <= 0) {
             this.d.setVisibility(i);
          }else {
             this.e.setText(strikingDesc);
          }
       }
       this.f.setText(this.getContext().getResources().getText(R.string.arg_RES_7f1024ea));
       this.b.setVisibility(4);
       strikingDesc = p0.strikingGuardInfo;
       if (strikingDesc == null || strikingDesc.length <= 0) {
          this.g.setVisibility(i);
          this.f.setVisibility(i);
       }else {
          this.g.setVisibility(i1);
          this.f.setVisibility(i1);
          this.g.setLayoutManager(new LinearLayoutManager(this.getContext(), i1, i1));
          while (this.g.getItemDecorationCount() > 0) {
             this.g.removeItemDecorationAt(i1);
          }
          this.g.addItemDecoration(new b(i1, i1, a1.e(4.00f)));
          LiveFancyRankResultViewV2 tn = this.n;
          tn.x = p0.rank;
          tn.y = 1;
          tn.z = p0.strikingDescription;
          tn.A = p0.noticeType;
          tn.B = this.e(p0);
          ArrayList uArrayList = new ArrayList(p0.strikingGuardInfo.length);
          TopDistrictRank strikingGuar = p0.strikingGuardInfo;
          while (i1 < strikingGuar.length) {
             uArrayList.add(UserInfo.convertFromProto(strikingGuar[i1]));
             i1 = i1 + 1;
          }
          this.n.W0(uArrayList);
          this.n.k0();
       }
       return;
    }
    public int getExpandAnimatorStartPosition(){
       Object obj = PatchProxy.apply(null, this, LiveFancyRankResultViewV2.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 0;
       LiveFancyRankResultViewV2 tm = this.m;
       if (tm != null) {
          i = tm.a();
       }
       int width = this.getWidth();
       if (width > 0) {
          i = Math.min(i, width);
       }
       return i;
    }
    public int getResourceLayout(){
       return 0x7f0d0afe;
    }
    public View getView(){
       return this;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveFancyRankResultViewV2.class, "15")) {
          return;
       }
       this.a();
       b9.a(this.p);
       return;
    }
    public void setDismissListener(a$a p0){
       this.o = p0;
    }
    public void setFancyRankDelegate(LiveFancyRankResultViewV2$e p0){
       this.m = p0;
    }
    public void setGuardAdapter(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveFancyRankResultViewV2.class, "2")) {
          return;
       }
       this.n = p0;
       this.g.setAdapter(p0);
       return;
    }
}
