package com.kuaishou.live.lite.adapter.component.multipk.LiveLiteMultiPkPresenter$a;
import ic3.a;
import com.kuaishou.live.lite.adapter.component.multipk.LiveLiteMultiPkPresenter;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.t0;
import k83.c;
import rs1.h;
import kotlin.Pair;
import java.lang.Integer;
import qrd.r0;
import java.lang.Long;
import ic3.a$a;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.pk.MultiPkGameState;
import java.lang.Boolean;
import com.kwai.framework.model.user.UserInfo;
import lp3.e;
import lp3.c;
import lp3.b;

public final class LiveLiteMultiPkPresenter$a implements a	// class@001e13
{
    public final LiveLiteMultiPkPresenter b;

    public void LiveLiteMultiPkPresenter$a(LiveLiteMultiPkPresenter p0){
       this.b = p0;
       super();
    }
    public boolean Aa(){
       return this.b.L;
    }
    public Map E8(){
       LiveLiteMultiPkPresenter$a obj = PatchProxy.apply(null, this, LiveLiteMultiPkPresenter$a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj.K == null) {
          return t0.z();
       }
       h oh = LiveLiteMultiPkPresenter.h9(obj).V2();
       if (oh == null) {
          return t0.z();
       }
       int i = oh.a3();
       long l = oh.Y2();
       if (!i) {
          return t0.z();
       }
       Pair[] pairArray = new Pair[]{r0.a("play_type", Integer.valueOf(i)),r0.a("pk_time", Long.valueOf(l))};
       return t0.j0(pairArray);
    }
    public void Fe(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiPkPresenter$a.class, "6")) {
          return;
       }
       a.p(p0, "multiPKListener");
       return;
    }
    public void I8(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteMultiPkPresenter$a.class, "5")) {
          return;
       }
       a.p(p0, "multiPKListener");
       return;
    }
    public String M9(){
       Object[] objArray = null;
       LiveLiteMultiPkPresenter$a obj = PatchProxy.apply(objArray, this, LiveLiteMultiPkPresenter$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.b;
       if (obj.K == null) {
          return objArray;
       }
       h oh = LiveLiteMultiPkPresenter.h9(obj).V2();
       if (oh != null) {
          objArray = oh.Z2();
       }
       return objArray;
    }
    public MultiPkGameState Si(){
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, LiveLiteMultiPkPresenter$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveLiteMultiPkPresenter.h9(this.b).V2();
       if (obj != null) {
          objArray = obj.X2();
       }
       return objArray;
    }
    public boolean Vf(){
       h obj = PatchProxy.apply(null, this, LiveLiteMultiPkPresenter$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = LiveLiteMultiPkPresenter.h9(this.b).V2();
       boolean b = (obj != null)? obj.c3(): false;
       return b;
    }
    public UserInfo Y6(){
       Object[] objArray = null;
       h obj = PatchProxy.apply(objArray, this, LiveLiteMultiPkPresenter$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveLiteMultiPkPresenter.h9(this.b).V2();
       if (obj != null) {
          objArray = obj.W2();
       }
       return objArray;
    }
    public void create(e p0){
       b.a(this, p0);
    }
    public void destroy(){
       b.b(this);
    }
}
