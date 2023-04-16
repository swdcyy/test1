package com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$b;
import nkc.a;
import android.view.ViewGroup;
import nkc.d;
import java.lang.Throwable;
import java.lang.Boolean;
import java.util.List;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$c;
import java.lang.Number;
import android.os.Bundle;
import java.util.Map;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kwai.live.gzone.accompanyplay.anchor.LiveGzoneAnchorAccompanyFleetStateFragment$a;
import sfc.a;
import erd.g;
import brd.t;
import qvb.i;
import h37.s;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import java.lang.System;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import h37.e0;
import com.kwai.live.gzone.accompanyplay.anchor.t;
import com.kwai.live.gzone.accompanyplay.anchor.y;
import com.kwai.live.gzone.accompanyplay.anchor.e0;
import com.kwai.live.gzone.accompanyplay.anchor.m;
import com.kwai.live.gzone.accompanyplay.anchor.b0;
import h37.u0;
import y8c.g;
import com.kwai.live.gzone.accompanyplay.anchor.r;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public class LiveGzoneAnchorAccompanyFleetStateFragment extends RecyclerFragment	// class@000af4
{
    public String F;
    public String G;
    public String H;
    public LiveGzoneAccompanyFleetInfo I;
    public LiveGzoneAnchorAccompanyFleetStateFragment$c J;
    public PresenterV2 K;
    public a L;
    public a M;
    public p1 N;
    public b O;
    public d P;
    public c Q;
    public View R;

    public void LiveGzoneAnchorAccompanyFleetStateFragment(){
       super();
    }
    public t Bh(){
       View obj = PatchProxy.apply(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getView();
       if (obj == null) {
          return super.Bh();
       }
       return new LiveGzoneAnchorAccompanyFleetStateFragment$b(this, new a(obj.findViewById(0x7f0a3f11)));
    }
    public boolean Eh(){
       return true;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(LiveGzoneAnchorAccompanyFleetStateFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "9")) {
          return;
       }
       super.M1(p0, p1);
       return;
    }
    public boolean S1(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       LiveGzoneAnchorAccompanyFleetStateFragment$c uoc = new LiveGzoneAnchorAccompanyFleetStateFragment$c();
       this.J = uoc;
       uoc.c = this.F;
       uoc.b = this;
       uoc.i = this.P;
       uoc.d = this.G;
       uoc.f = this.L;
       uoc.g = this.M;
       uoc.e = this.H;
       uoc.h = this.N;
       obj.add(uoc);
       return obj;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getArguments().getInt("arg_layout_id");
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveGzoneAnchorAccompanyFleetStateFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          this.F = p0.getString("arg_accompany_id");
          this.G = p0.getString("arg_fleet_title");
          this.H = p0.getString("arg_live_stream_id");
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "10")) {
          return;
       }
       super.onDestroy();
       b9.a(this.O);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "2")) {
          return;
       }
       this.R = p0.findViewById(0x7f0a1dea);
       super.onViewCreated(p0, p1);
       b9.a(this.O);
       this.O = this.M.subscribe(new LiveGzoneAnchorAccompanyFleetStateFragment$a(this), new a());
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(LiveGzoneAnchorAccompanyFleetStateFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "8")) {
          return;
       }
       super.v2(p0, p1);
       s r = this.q().r;
       this.I = r;
       this.G = r.mFleetTitle;
       r.mLocalTimeDiff = System.currentTimeMillis() - this.I.mTimestamp;
       String str = "7";
       if (PatchProxy.applyWithListener(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, str) != PatchProxyResult.class) {
       }else if(this.K == null){
          PresenterV2 presenterV2 = new PresenterV2();
          this.K = presenterV2;
          presenterV2.U7(new e0());
          this.K.U7(new t());
          this.K.U7(new y());
          if (this.I.mEnableOneClick != null) {
             this.K.U7(new e0());
             this.K.U7(new m());
          }else {
             this.K.U7(new b0());
          }
          this.K.U7(new u0());
       }
       PatchProxy.onMethodExit(LiveGzoneAnchorAccompanyFleetStateFragment.class, str);
       LiveGzoneAnchorAccompanyFleetStateFragment tK = this.K;
       if (tK != null) {
          if (!tK.R1()) {
             this.K.f(this.getView());
          }
          Object[] objArray = new Object[]{this.I,this.J};
          this.K.i(objArray);
       }
       tK.w = this.I;
       this.g7().k0();
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new r(this);
    }
    public i yh(){
       s os = PatchProxy.apply(null, this, LiveGzoneAnchorAccompanyFleetStateFragment.class, "4");
       if (os != PatchProxyResult.class) {
       }else {
          os = new s(this.F, this.H);
       }
       return os;
    }
}
