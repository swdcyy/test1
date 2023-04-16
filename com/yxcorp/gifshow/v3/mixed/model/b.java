package com.yxcorp.gifshow.v3.mixed.model.b;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import fwc.j;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect;
import com.yxcorp.gifshow.v3.editor.transition.TransitionEffect$a;
import com.yxcorp.gifshow.v3.mixed.model.PlayStatus;
import com.yxcorp.gifshow.v3.mixed.model.DragStatus;
import androidx.lifecycle.MutableLiveData;
import com.yxcorp.gifshow.v3.mixed.model.MixStatus;
import java.lang.Object;
import com.yxcorp.gifshow.v3.mixed.model.a;
import androidx.lifecycle.LiveData;
import z0.a;
import androidx.lifecycle.Transformations;
import com.yxcorp.gifshow.v3.mixed.timeline.MixTimePositionLookups;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.mixed.editor.frame.MixFrameAdjustInfo;
import com.yxcorp.gifshow.v3.mixed.model.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.v3.mixed.model.MixVideoTrack;
import java.lang.Double;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.video.minecraft.model.EditorSdk2V2$TrackAsset;
import w46.b;
import com.kwai.video.minecraft.model.EditorSdk2V2$TimeRangeV2;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import wba.e0;
import fwc.f;
import t36.f$a;
import t36.f;
import fwc.k;
import com.kwai.video.minecraft.model.nano.Minecraft$TransitionParam;
import java.lang.Number;
import com.kuaishou.edit.TimeLineGenerator;
import java.lang.RuntimeException;

public class b extends ViewModel	// class@001558
{
    public final List a;
    public final j b;
    public TransitionEffect c;
    public PlayStatus d;
    public DragStatus e;
    public p f;
    public String g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public MixTimePositionLookups n;
    public MutableLiveData o;
    public MutableLiveData p;
    public MutableLiveData q;
    public MutableLiveData r;
    public PublishSubject s;
    public MutableLiveData t;
    public MixFrameAdjustInfo u;
    public boolean v;
    public final b w;

    public void b(){
       super();
       this.a = Lists.b();
       this.b = new j();
       this.c = TransitionEffect.Companion.b();
       this.d = new PlayStatus();
       this.e = new DragStatus();
       this.h = new MutableLiveData(MixStatus.EDITING);
       this.i = new MutableLiveData();
       this.j = new MutableLiveData();
       this.k = new MutableLiveData();
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.l = mutableLiveD;
       this.m = Transformations.map(mutableLiveD, a.a);
       this.n = new MixTimePositionLookups();
       this.o = new MutableLiveData();
       this.p = new MutableLiveData();
       this.q = new MutableLiveData();
       this.r = new MutableLiveData();
       this.s = PublishSubject.g();
       MixFrameAdjustInfo oRIGIN_PRESE = MixFrameAdjustInfo.ORIGIN_PRESET_INFO;
       this.t = new MutableLiveData(oRIGIN_PRESE);
       this.u = oRIGIN_PRESE;
       this.v = false;
       this.w = new b$a(this);
    }
    public final void A0(MixStatus p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (this.h.getValue() != p0) {
          this.h.setValue(p0);
          Object[] objArray = new Object[0];
          a.D().w("MixedViewModel", "enter mode "+p0, objArray);
       }
       return;
    }
    public void C0(){
       if (PatchProxy.applyVoid(null, this, b.class, "10")) {
          return;
       }
       Iterator iterator = this.a.iterator();
       double d = 0;
       double d1 = d;
       while (iterator.hasNext()) {
          MixVideoTrack mixVideoTrac = iterator.next();
          mixVideoTrac.mBaseOffsetIgnoreSpeed = d;
          d = d + mixVideoTrac.getDurationIgnoreSpeed();
          mixVideoTrac.mBaseOffsetWithSpeed = d1;
          d1 = d1 + mixVideoTrac.getDurationWithSpeed();
       }
       this.o.setValue(Double.valueOf(this.p0()));
       return;
    }
    public void D0(int p0){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "27")) {
          return;
       }
       if (p0 >= 0 && p0 < this.a.size()) {
          int i = 0;
          if (PatchProxy.isSupport(uob)) {
             Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "28");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(this.l.getValue() != null && this.l.getValue().mIndex == p0){
                b = true;
             }else {
                b = false;
             }
          }else {
             goto label_003c ;
          }
          if (b) {
             return;
          }else {
             this.l.setValue(this.a.get(p0));
             Object[] objArray = new Object[i];
             a.D().s("MixedViewModel", "select: select getCurrent\(\)="+this.s0(), objArray);
          }
       }
       return;
    }
    public void E0(int p0,double p1,double p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), this, b.class, "39")) {
          return;
       }
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), tb, j.class, "13")) {
          Object[] objArray = new Object[0];
          a.D().s("MixProject", "setClip\(\) called with: index = ["+p0+"], start = ["+p1+"], end = ["+p2+"]", objArray);
          EditorSdk2V2$TrackAsset trackAsset = tb.u0(p0);
          if (trackAsset == null) {
             Object[] objArray1 = new Object[0];
             a.D().t("MixProject", "setClip: cant find index="+p0, objArray1);
          }else if(p1 < 0 || p2 < 0){
             trackAsset.setClippedRange(null);
          }else {
             trackAsset.setClippedRange(EditorSdk2UtilsV2.createTimeRange(p1, p2));
          }
       }
       return;
    }
    public MixStatus F0(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final void G0(MixFrameAdjustInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "15")) {
          return;
       }
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, j.class, "8") && tb.g != p0.mVideoRatioPreset) {
          Object[] objArray = new Object[0];
          a.D().s("MixProject", "setFrameRatio\(\) called with: ratio = ["+p0.mVideoRatioPreset+"]", objArray);
          MixFrameAdjustInfo mVideoRatioP = p0.mVideoRatioPreset;
          tb.g = mVideoRatioP;
          e0.k(mVideoRatioP, tb.e, true);
          tb.s0(new f(p0));
       }
       return;
    }
    public final void o0(TransitionEffect p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       b tb = this.b;
       int mSdkId = p0.getMSdkId();
       double mAnimationTi = p0.getMAnimationTime();
       Objects.requireNonNull(tb);
       j oj = j.class;
       int i = 0;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(mSdkId), Double.valueOf(mAnimationTi), tb, oj, "2")) {
          Object[] objArray = new Object[i];
          a.D().s("MixProject", "setTransition\(\) called with: type = ["+mSdkId+"], duration = ["+mAnimationTi+"]", objArray);
          Iterator iterator = tb.d.iterator();
          while (iterator.hasNext()) {
             k ok = iterator.next();
             Objects.requireNonNull(ok);
             k ok1 = k.class;
             if (PatchProxy.isSupport(ok1) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(mSdkId), Double.valueOf(mAnimationTi), ok, ok1, "2")) {
                continue ;
             }else if(!mSdkId){
                ok.c.setTransitionParam(null);
             }else if(ok.c.transitionParam() == null){
                ok.c.setTransitionParam(new Minecraft$TransitionParam());
             }
             ok.c.transitionParam().setType(mSdkId);
             ok.c.transitionParam().setDuration(mAnimationTi);
          }
          tb.v0();
       }
       int i1 = this.a.size() - 1;
       while (i < i1) {
          this.a.get(i).mTranslation = p0;
          i = i + 1;
       }
       MixVideoTrack.updateMinDuration(p0);
       return;
    }
    public void onCleared(){
       b uob = b.class;
       if (PatchProxy.applyVoid(null, this, uob, "36")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("MixedViewModel", "onCleared: ", objArray);
       if (!PatchProxy.applyVoid(null, this, uob, "30")) {
          this.b.b();
       }
       return;
    }
    public final double p0(){
       Iterator obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.a.iterator();
       double d = 0;
       while (obj.hasNext()) {
          d = d + obj.next().getDurationWithSpeed();
       }
       b tc = this.c;
       if (tc != null && tc.getMCostTime() > 0) {
          d = d - ((double)(this.a.size() - 1) * this.c.getMCostTime());
       }
       return d;
    }
    public void q0(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.A0(MixStatus.EDITING);
       return;
    }
    public void r0(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       this.A0(MixStatus.PREVIEWING);
       return;
    }
    public final MixVideoTrack s0(){
       Object obj = PatchProxy.apply(null, this, b.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.l.getValue();
    }
    public TimeLineGenerator t0(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       j oj = PatchProxy.apply(objArray, obj, j.class, "9");
       if (oj != patchProxyRe) {
       }else {
          oj = obj.f;
          if (oj == null) {
             throw new RuntimeException("mThumbnailGenerator is null");
          }
       }
       return oj;
    }
    public double u0(){
       Object obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       double d = (this.o.getValue() == null)? this.p0(): this.o.getValue().doubleValue();
       return d;
    }
    public boolean v0(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.F0() == MixStatus.EDITING)? true: false;
       return b;
    }
    public boolean w0(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = true;
       if (this.a.size() <= b) {
          b = false;
       }
       return b;
    }
    public boolean x0(double p0){
       Iterator obj;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Double.valueOf(p0), this, uob, "22");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.a.iterator();
       while (true) {
          if (!obj.hasNext()) {
             return true;
          }
          if (obj.next().getDurationIgnoreSpeed() - p0 < 0) {
             break ;
          }
       }
       return false;
    }
    public boolean y0(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.s0() == null)? true: false;
       return b;
    }
    public void z0(MixFrameAdjustInfo p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "13")) {
          return;
       }
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          MixFrameAdjustInfo mixFrameAdju = iterator.next();
          mixFrameAdju.mIsSelected = mixFrameAdju.equals(p0);
       }
       return;
    }
}
