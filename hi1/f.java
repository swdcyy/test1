package hi1.f;
import hi1.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import java.util.Map;
import gi1.a;
import g03.a;
import hi1.i;
import hi1.a;
import oz2.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pz2.c;
import hi1.e;
import lnc.c3$a;
import lnc.c3;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import java.lang.Iterable;
import qk.m;
import hi1.c;
import ok.h;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.LiveEffectKissFrogData;
import com.kuaishou.live.common.core.component.gift.domain.effect.bean.MagicSdkProtocol;
import java.lang.System;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import pz2.b;
import hi1.d;

public class f extends b	// class@0026d8
{
    public final a z;
    public static final List A;

    static {
       f.A = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectKissFrogTask");
    }
    public void f(LiveCommonEffectInfo p0,long p1,Map p2,a p3,a p4,i p5,a p6){
       super(p0, p1, p2, p3, p4, p5, p6);
       this.z = p4;
    }
    public boolean F(int p0,e p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!super.F(p0, p1)) {
          return b;
       }else {
          e c = p1.c;
          c uoc = p1.b();
          if (!uoc instanceof f) {
             return b;
          }else {
             int i = uoc.M().size();
             c3.c(c, new e(this, i));
             b.S(f.A, "[onHandlePlayStep] task resolved. SendStreamRenderMessage", "giftNum", Integer.valueOf(i));
             return true;
          }
       }
    }
    public List L(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, f.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(p0)) {
          b.P(f.A, "[createResultEffectTasks], effectInfoList is empty");
          return null;
       }else {
          b.S(f.A, "[createResultEffectTasks]", "effectInfoList", Integer.valueOf(p0.size()));
          obj = new ArrayList();
          m.s(p0).F(new c(this)).n(obj);
          return obj;
       }
    }
    public final String Q(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 <= 1) {
          return "";
       }else {
          LiveEffectKissFrogData liveEffectKi = new LiveEffectKissFrogData(p0);
          long l = System.currentTimeMillis();
          MagicSdkProtocol magicSdkProt = p0;
          try{
             magicSdkProt = new MagicSdkProtocol("", 2400, liveEffectKi, l);
             return a.a.q(p0);
          }catch(java.lang.Exception e9){
             b.y(f.A, "[getGiftNumJsonString] toJson fail.", e9);
             return v1;
          }
       }
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       b.h(this);
       this.P(true);
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.m();
       b.P(f.A, "[onEffectRenderStart]");
       c3.c(this.u, new d(this));
       return;
    }
    public void q(boolean p0,String p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uof, "4")) {
          return;
       }
       b.i(this, p0, p1);
       this.P(false);
       return;
    }
}
