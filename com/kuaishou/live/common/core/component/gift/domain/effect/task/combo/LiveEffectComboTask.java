package com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectComboTask;
import kz2.a;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.util.Map;
import hi1.a;
import g03.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.domain.effect.task.combo.LiveEffectComboTask$BizExtraInfo;
import fg6.a;
import com.google.gson.Gson;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;
import oz2.e;
import java.lang.Integer;
import java.lang.Boolean;
import pz2.c;
import pz2.b;

public class LiveEffectComboTask extends a	// class@0011c1
{
    public boolean q;
    public LiveEffectComboTask$BizExtraInfo r;
    public boolean s;
    public boolean t;
    public final a u;
    public static final List v;

    static {
       LiveEffectComboTask.v = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectComboTask");
    }
    public void LiveEffectComboTask(LiveCommonEffectInfo p0,long p1,Map p2,a p3,a p4,int p5){
       super(p0, p1, p2, p4);
       this.q = false;
       this.s = false;
       this.t = false;
       p0 = p0.bizExtraInfo;
       LiveEffectComboTask$BizExtraInfo uBizExtraInf = PatchProxy.applyOneRefs(p0, this, LiveEffectComboTask.class, "6");
       if (uBizExtraInf != PatchProxyResult.class) {
       }else {
          try{
             uBizExtraInf = a.a.h(p0, LiveEffectComboTask$BizExtraInfo.class);
          }catch(java.lang.Exception e8){
             b.y(LiveEffectComboTask.v, "[parseBizExtraInfo] toBizExtraInfo fail. bizExtraInfo = "+p0, e8);
             uBizExtraInf = null;
          }
       }
    }
    public boolean F(int p0,e p1){
       c obj;
       LiveEffectComboTask liveEffectCo = LiveEffectComboTask.class;
       if (PatchProxy.isSupport(liveEffectCo)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveEffectCo, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p1.b();
       if (!obj instanceof LiveEffectComboTask) {
          b.S(LiveEffectComboTask.v, "[onHandlePlayStep] cannot merge. renderingTask is not LiveEffectComboTask", "renderingTask", obj);
          return false;
       }else {
          return obj.t;
       }
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, LiveEffectComboTask.class, "3")) {
          return;
       }
       b.h(this);
       this.t = true;
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, LiveEffectComboTask.class, "4")) {
          return;
       }
       b.j(this);
       this.s = true;
       this.q = true;
       return;
    }
    public boolean o(int p0,e p1){
       c obj;
       LiveEffectComboTask liveEffectCo = LiveEffectComboTask.class;
       if (PatchProxy.isSupport(liveEffectCo)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, liveEffectCo, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = p1.a();
       if (!obj instanceof LiveEffectComboTask) {
          b.S(LiveEffectComboTask.v, "[onHandlePreEnqueueStep] cannot merge. inQueueTask is not LiveEffectComboTask", "inQueueTask", obj);
          return false;
       }else {
          return true;
       }
    }
}
