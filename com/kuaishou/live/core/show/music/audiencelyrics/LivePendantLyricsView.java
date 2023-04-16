package com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView$b;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Typeface;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import com.kuaishou.live.core.show.music.audiencelyrics.LivePendantLyricsView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Math;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import qc2.v;
import com.kwai.feature.api.live.musicstation.MusicStationLyricsLineView;
import com.yxcorp.gifshow.model.Lyrics$Line;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class LivePendantLyricsView extends FlattenLyricView	// class@000d2b
{
    public int L;
    public int M;
    public boolean N;
    public ValueAnimator O;
    public int P;
    public float Q;
    public float R;
    public int S;
    public float T;
    public LivePendantLyricsView$b U;
    public int U0;
    public LivePendantLyricsView$b V;
    public float V0;
    public int W;
    public static final LivePendantLyricsView$b W0;

    static {
       LivePendantLyricsView.W0 = new LivePendantLyricsView$b(0x3f800000, 0x3f800000, 0x3f800000, a1.a(0x7f062040));
    }
    public void LivePendantLyricsView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.M = 0;
       this.Q = 2.00f;
       this.R = 0x3f800000;
       this.S = 3;
       this.T = 0x3f88f5c3;
       LivePendantLyricsView$b w0 = LivePendantLyricsView.W0;
       this.U = w0;
       this.V = w0;
       this.setEnabled(0);
       this.a();
       this.setClickable(0);
    }
    public int A(int p0){
       if (PatchProxy.isSupport(LivePendantLyricsView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LivePendantLyricsView.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else {
          View childAt = this.E.getChildAt(p0);
          if (childAt != null) {
             return childAt.getTop();
          }else {
             return 0;
          }
       }
    }
    public final void B(int p0){
       if (PatchProxy.isSupport(LivePendantLyricsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePendantLyricsView.class, "12")) {
          return;
       }
       TextView textView = this.u(this.M);
       TextView textView1 = this.u(p0);
       if (textView != null && this.N != null) {
          boolean b = false;
          textView.setSelected(b);
          textView.setTypeface(textView.getTypeface(), b);
          this.C(textView, b, p0);
       }
       if (textView1 != null) {
          textView1.setSelected(true);
          textView1.setTypeface(textView1.getTypeface(), true);
          this.C(textView1, true, p0);
       }
       return;
    }
    public final void C(TextView p0,boolean p1,int p2){
       ValueAnimator valueAnimato;
       if (PatchProxy.isSupport(LivePendantLyricsView.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), this, LivePendantLyricsView.class, "13")) {
          return;
       }
       LivePendantLyricsView livePendantL = (this.S == 3)? 1: null;
       int i = 2;
       if (p1) {
          valueAnimato = ValueAnimator.ofFloat(new float[i]{0,0x3f800000});
          this.y(p0, this.V);
          if (livePendantL) {
             p0.setPadding(this.U0, p0.getPaddingTop(), 0, p0.getPaddingBottom());
          }else {
             p0.setPadding(0, p0.getPaddingTop(), this.U0, p0.getPaddingBottom());
          }
       }else {
          valueAnimato = ValueAnimator.ofFloat(new float[i]{0x3f800000,0});
          this.y(p0, this.U);
          if (livePendantL != null) {
             p0.setPadding(this.W, p0.getPaddingTop(), 0, p0.getPaddingBottom());
          }else {
             p0.setPadding(0, p0.getPaddingTop(), this.W, p0.getPaddingBottom());
          }
       }
       valueAnimato.setDuration(200);
       valueAnimato.addUpdateListener(new LivePendantLyricsView$a(this, p0));
       valueAnimato.start();
       return;
    }
    public final void D(int p0,boolean p1){
       if (PatchProxy.isSupport(LivePendantLyricsView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LivePendantLyricsView.class, "10")) {
          return;
       }
       int i = this.A(p0);
       if (i == this.getScrollY()) {
          return;
       }
       if (p1) {
          if (!PatchProxy.isSupport(LivePendantLyricsView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePendantLyricsView.class, "11")) {
             int i1 = 400;
             i = this.q(p0);
             if (i > 0) {
                i1 = Math.min(i1, i);
             }
             LivePendantLyricsView tO = this.O;
             if (tO != null) {
                tO.cancel();
             }
             this.O = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
             this.O.setDuration((long)i1);
             this.O.setInterpolator(new AccelerateDecelerateInterpolator());
             this.O.addUpdateListener(new v(this, p0, this.getScrollY()));
             this.O.start();
          }
       }else {
          this.scrollTo(0, i);
       }
       return;
    }
    public final MusicStationLyricsLineView getCurrentLineView(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, LivePendantLyricsView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u(this.M);
       if (obj instanceof MusicStationLyricsLineView) {
          objArray = obj;
       }
       return objArray;
    }
    public int getCurrentPosition(){
       return this.L;
    }
    public TextView n(Lyrics$Line p0){
       MusicStationLyricsLineView obj = PatchProxy.applyOneRefs(p0, this, LivePendantLyricsView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MusicStationLyricsLineView(this.getContext());
       if (!PatchProxy.applyVoidOneRefs(p0, obj, MusicStationLyricsLineView.class, "1")) {
          obj.f = p0;
          obj.setWillNotDraw(false);
          obj.q();
       }
       return obj;
    }
    public void setCurrentLineScale(float p0){
       this.T = p0;
    }
    public void setHeight(int p0){
       if (PatchProxy.isSupport(LivePendantLyricsView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LivePendantLyricsView.class, "6")) {
          return;
       }
       this.getLayoutParams().height = Math.max(1, p0);
       this.requestLayout();
       return;
    }
    public void setLineGravity(int p0){
       this.S = p0;
    }
    public void v(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePendantLyricsView.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LivePendantLyricsView.class, "16")) {
          View view = this.u(0);
          if (view != null) {
             this.N = false;
             this.M = 0;
             this.D(0, true);
             view.setSelected(true);
          }
       }
       this.B(0);
       this.N = true;
       return;
    }
    public void w(TextView p0,Lyrics$Line p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePendantLyricsView.class, "3")) {
          return;
       }
       p0.setGravity(this.S);
       p0.setLineSpacing(this.Q, this.R);
       this.V0 = p0.getTextSize();
       this.y(p0, this.U);
       LivePendantLyricsView tS = this.S;
       if (tS == 3) {
          p0.setPadding(this.W, p0.getPaddingTop(), 0, p0.getPaddingBottom());
       }else if(tS == 5){
          p0.setPadding(0, p0.getPaddingTop(), this.W, p0.getPaddingBottom());
       }
       return;
    }
    public final void y(TextView p0,LivePendantLyricsView$b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LivePendantLyricsView.class, "9")) {
          return;
       }
       p0.setShadowLayer(p1.a, p1.b, p1.c, p1.d);
       return;
    }
    public void z(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePendantLyricsView.class, "4")) {
          return;
       }
       Lyrics$Line line = new Lyrics$Line();
       line.mDuration = 0x186a0;
       line.mStart = 0;
       line.mText = p0;
       Lyrics$Line line1 = new Lyrics$Line();
       line1.mDuration = 500;
       line1.mStart = 0x186a1;
       line1.mText = a1.p(0x7f102829);
       ArrayList uArrayList = new ArrayList();
       uArrayList.add(line);
       uArrayList.add(line1);
       this.i(0x186a0, uArrayList);
       return;
    }
}
