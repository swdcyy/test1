package com.kuaishou.live.common.core.component.music.LiveKtvLyricView;
import com.yxcorp.gifshow.widget.FlattenLyricView;
import android.content.Context;
import android.util.AttributeSet;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import android.widget.ScrollView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.kuaishou.live.common.core.component.music.LiveKtvLineView;
import android.widget.TextView;
import lnc.a1;
import com.yxcorp.gifshow.model.Lyrics$Line;
import java.lang.Float;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import ru1.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class LiveKtvLyricView extends FlattenLyricView	// class@0016ae
{
    public int L;
    public int M;
    public boolean N;
    public ValueAnimator O;
    public int P;

    public void LiveKtvLyricView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.M = 0;
       this.a();
       this.setClickable(0);
    }
    public void A(int p0,boolean p1,boolean p2,boolean p3){
       int i;
       if (PatchProxy.isSupport(LiveKtvLyricView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, LiveKtvLyricView.class, "6")) {
          return;
       }
       if (this.N == null && p0 > 100) {
          LiveKtvLyricView tP = this.P;
          if (tP < 10) {
             this.P = tP + 1;
             return;
          }
       }
       this.L = p0;
       if (PatchProxy.isSupport(LiveKtvLyricView.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p2), this, LiveKtvLyricView.class, "11");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else if(p2){
             i = 0;
          }else {
             i = this.M;
          }
          int i1 = (p2)? 0: this.M;
          while (i1 < this.y.size()) {
             if (p0 >= this.y.get(i1).intValue() && p0 < this.z.get(i1).intValue()) {
                i = i1;
                break ;
             }
             i1 = i1 + 1;
          }
       }else {
          goto label_005d ;
       }
       if (i == this.M && (this.N == null || p2)) {
          if (p3) {
             this.z(i, p1);
          }
          if (!PatchProxy.isSupport(LiveKtvLyricView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), this, LiveKtvLyricView.class, "9")) {
             View view = this.u(this.M);
             long l = 400;
             if (view != null) {
                view.setSelected(0);
                float f = 0x3f800000;
                view.animate().scaleX(f).scaleY(f).setDuration(l);
             }
             view = this.u(i);
             if (view != null) {
                view.setSelected(1);
                view.animate().scaleX(0x3f91eb85).scaleY(0x3f91eb85).setDuration(l);
             }
          }
          this.M = i;
          this.N = true;
          this.P = 0;
       }
       LiveKtvLineView currentLineV = this.getCurrentLineView();
       if (currentLineV != null && (!PatchProxy.isSupport(LiveKtvLineView.class) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), currentLineV, LiveKtvLineView.class, "5") && (currentLineV.isSelected() && currentLineV.o == null)))) {
          currentLineV.q = p0;
          currentLineV.invalidate();
       }
    label_0125 :
       return;
    }
    public int getContentPaddingBottom(){
       Object obj = PatchProxy.apply(null, this, LiveKtvLyricView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(100.00f);
    }
    public final LiveKtvLineView getCurrentLineView(){
       Object[] objArray = null;
       View obj = PatchProxy.apply(objArray, this, LiveKtvLyricView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u(this.M);
       if (obj instanceof LiveKtvLineView) {
          objArray = obj;
       }
       return objArray;
    }
    public int getCurrentPosition(){
       return this.L;
    }
    public int getTextViewPadding(){
       Object obj = PatchProxy.apply(null, this, LiveKtvLyricView.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = a1.h();
       return ((i - ((int)((float)i / 0x3f91eb85) - a1.e(10.00f))) / 2);
    }
    public TextView n(Lyrics$Line p0){
       LiveKtvLineView obj = PatchProxy.applyOneRefs(p0, this, LiveKtvLyricView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveKtvLineView(this.getContext());
       if (!PatchProxy.applyVoidOneRefs(p0, obj, LiveKtvLineView.class, "1")) {
          obj.f = p0;
          obj.setWillNotDraw(false);
          obj.p();
       }
       return obj;
    }
    public void v(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveKtvLyricView.class, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveKtvLyricView.class, "12")) {
          int i = 0;
          View view = this.u(i);
          if (view != null) {
             this.N = i;
             this.M = i;
             this.z(i, true);
             view.setSelected(true);
             view.setScaleX(0x3f91eb85);
             view.setScaleY(0x3f91eb85);
          }
       }
       return;
    }
    public int y(float p0){
       if (PatchProxy.isSupport(LiveKtvLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, LiveKtvLyricView.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       while (true) {
          if (i >= this.w.size()) {
             return -1;
          }
          FlattenLyricView uFlattenLyri = (p0 - (float)this.w.get(i).intValue() >= 0 && p0 - (float)this.x.get(i).intValue() <= 0)? 1: null;
          if (uFlattenLyri) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final void z(int p0,boolean p1){
       int i1;
       if (PatchProxy.isSupport(LiveKtvLyricView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, LiveKtvLyricView.class, "7")) {
          return;
       }
       int i = 0;
       if (PatchProxy.isSupport(LiveKtvLyricView.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, LiveKtvLyricView.class, "10");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          }else if(!p0){
             i1 = 0;
          }else {
             i1 = this.t((p0 - 1));
          }
       }else {
          goto label_003b ;
       }
       if (i1 == this.getScrollY()) {
          return;
       }else if(p1){
          if (!PatchProxy.isSupport(LiveKtvLyricView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(i1), this, LiveKtvLyricView.class, "8")) {
             int i2 = 800;
             p0 = this.q(p0);
             if (p0 > 0) {
                i2 = Math.min(i2, p0);
             }
             LiveKtvLyricView tO = this.O;
             if (tO != null) {
                tO.cancel();
             }
             int[] ointArray = new int[]{this.getScrollY(),i1};
             ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
             this.O = valueAnimato;
             valueAnimato.setDuration((long)i2);
             this.O.setInterpolator(new AccelerateDecelerateInterpolator());
             this.O.addUpdateListener(new c(this));
             this.O.start();
          }
       }else {
          this.scrollTo(i, i1);
       }
       return;
    }
}
