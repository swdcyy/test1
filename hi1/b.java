package hi1.b;
import kz2.a;
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
import java.util.ArrayList;
import hi1.b$a;
import ekd.q;
import java.lang.Object;
import java.util.Set;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.lang.Integer;
import oz2.e;
import java.lang.Boolean;
import pz2.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import li1.a;
import hi1.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import hi1.h;
import java.lang.Long;
import com.google.common.collect.ImmutableMap;
import q2b.h$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import wy2.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import k2b.u1;
import fg6.a;
import com.google.gson.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import ekd.k0;
import com.google.gson.Gson;
import java.lang.Throwable;
import pz2.b;

public class b extends a	// class@0026d4
{
    public final List q;
    public boolean r;
    public boolean s;
    public String t;
    public final a u;
    public final i v;
    public final a w;
    public final g x;
    public static final List y;

    static {
       b.y = LiveLogTag.LIVE_EFFECT.appendTag("LiveEffectInteractiveComboTask");
    }
    public void b(LiveCommonEffectInfo p0,long p1,Map p2,a p3,a p4,i p5,a p6){
       super(p0, p1, p2, p4);
       ArrayList uArrayList = new ArrayList();
       this.q = uArrayList;
       this.x = new b$a(this);
       this.u = p3;
       this.v = p5;
       this.w = p6;
       if (q.h(p2)) {
          return;
       }
       String str = "ORDER_NO_EXTRA_INFO_KEY";
       if (p2.containsKey(str)) {
          this.t = p2.get(str);
          uArrayList.add(p2.get(str));
       }
       return;
    }
    public Set C(){
       HashSet obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       obj.add(Integer.valueOf(2402));
       obj.add(Integer.valueOf(2403));
       return obj;
    }
    public boolean F(int p0,e p1){
       c obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = p1.b();
       p1 = PatchProxy.applyOneRefs(obj, this, uob, "8");
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else if(!obj instanceof b){
          b.S(b.y, "[tryMergeRenderingEffectTasks] cannot merge. renderingTask is not interactiveComboTask", "renderingTask", obj);
       }else if(obj.r == null){
          b.P(b.y, "[tryMergeRenderingEffectTasks] not in combo, merge fail");
       }else {
          b.S(b.y, "[tryMergeRenderingEffectTasks] merge success", "extraInfo", this.t);
          obj.M().add(TextUtils.k(this.t));
          b = true;
       }
       b = false;
       b.P(b.y, "[onHandlePlayStep] is task resolved="+b);
       return b;
    }
    public int G(){
       return 1;
    }
    public List L(List p0){
       return null;
    }
    public List M(){
       return this.q;
    }
    public final boolean N(){
       return this.s;
    }
    public final void O(int p0,a p1){
       boolean b;
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "6")) {
          return;
       }
       if (p0 == 2402) {
          b = false;
          boolean b1 = (p1.mInteractComboEffectFinishInteractType == 2)? true: false;
          int i = (b1)? 2: 1;
          this.P(b);
          this.s = b1;
          this.v.a(TextUtils.k(this.w.getLiveStreamId()), this.M(), this.N(), this.x);
          b.T(b.y, "[resolveInteractiveComboEffectSdkMessage] receive reqType=2402, report server", "giftNum", this.M(), "isInteracted", Boolean.valueOf(this.N()));
          h.a(this.w.a(), this.w.getLiveStreamId(), i, TextUtils.k(this.w.d()), this.b());
          ClientContent$LiveStreamPackage liveStreamPa = this.w.a();
          String str = TextUtils.k(this.w.d());
          int i1 = this.q.size();
          long l = this.b();
          if (!PatchProxy.isSupport(h.class) || !PatchProxy.applyVoidFourRefs(liveStreamPa, str, Integer.valueOf(i1), Long.valueOf(l), null, h.class, "2")) {
             h$b uob1 = h$b.e(10, "CONTINUE_SEND_GIFT_TASK");
             uob1.h(a.a(liveStreamPa, l));
             uob1.k(a.b("CONTINUE_SEND_GIFT_TASK", ImmutableMap.of("number", String.valueOf(i1))));
             uob1.u(a.c(ImmutableMap.of("live_streamid", liveStreamPa.liveStreamId, "author_id", str)));
             u1.r0(uob1);
          }
          this.M().clear();
          return;
       }else if(p0 == 2403){
          this.u.D();
          b.P(b.y, "[resolveInteractiveComboEffectSdkMessage] receive reqType=2403, clear rendering effect task");
          return;
       }else {
          b.r(b.y, "[resolveInteractiveComboEffectSdkMessage] cannot resolve this reqType="+p0);
          return;
       }
    }
    public void P(boolean p0){
       this.r = p0;
    }
    public void g(String p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       try{
          a uoa = a.a.c(k0.e(new c().a(TextUtils.k(p0)).r(), "data"), a.class);
          if (uoa == null) {
             b.r(b.y, "[receiveMagicFaceMessage] effectData is null");
             return;
          }else {
             this.O(p1, uoa);
          }
       }catch(java.lang.Exception e4){
          b.y(b.y, "[receiveMagicFaceMessage] resolve sdk effect msg error", e4);
       }
       return;
    }
    public String getExtraInfo(){
       return "";
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b.j(this);
       h.a(this.w.a(), this.w.getLiveStreamId(), 0, this.w.d(), this.b());
       return;
    }
    public boolean o(int p0,e p1){
       c obj;
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = p1.a();
       p1 = PatchProxy.applyOneRefs(obj, this, uob, "9");
       if (p1 != patchProxyRe) {
          b = p1.booleanValue();
       }else if(!obj instanceof b){
          b.S(b.y, "[tryMergeInQueueEffectTasks] cannot merge. inQueueTask is not interactiveComboTask", "inQueueTask", obj);
          b = false;
       }else {
          b.S(b.y, "[tryMergeInQueueEffectTasks] merge success", "extraInfo", this.t);
          obj.M().add(TextUtils.k(this.t));
          b = true;
       }
       b.P(b.y, "[onHandlePreEnqueueStep] is task resolved="+b);
       return b;
    }
    public int x(){
       return 1;
    }
}
