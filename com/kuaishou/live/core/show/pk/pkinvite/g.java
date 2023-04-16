package com.kuaishou.live.core.show.pk.pkinvite.g;
import java.lang.Object;
import java.util.ArrayList;
import wd2.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionCpcInfoV2;
import com.yxcorp.utility.TextUtils;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.show.pk.LiveLineSendInviteSource;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LivePkFlowDiversionPayInfo;
import com.kuaishou.live.core.show.flowdiversion.pay.model.LiveFlowDiversionPaySellingChatInfo;
import com.kuaishou.live.core.show.pk.pkinvite.f;
import com.kuaishou.live.core.show.pk.pkinvite.c;
import d61.k0$a;
import com.google.common.base.Optional;
import d61.k0;
import com.kuaishou.live.core.show.pk.MatchType;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.pk.pkinvite.d;
import com.kuaishou.live.core.show.pk.pkinvite.a;
import com.kuaishou.live.core.show.pk.pkinvite.e;
import com.kuaishou.live.core.show.pk.pkinvite.b;
import com.kuaishou.live.core.show.pk.pkinvite.g$a;
import java.lang.Iterable;
import ok.h;
import qk.y;
import com.google.common.collect.Lists;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.pk.pkinvite.g$b;

public class g	// class@000daa
{
    public final List a;
    public Runnable b;
    public g$b c;
    public MatchType d;
    public LiveFlowDiversionCpcInfoV2 e;
    public LiveLineSendInviteSource f;
    public String g;
    public LivePkFlowDiversionPayInfo h;
    public boolean i;

    public void g(){
       super();
       this.a = new ArrayList();
    }
    public g a(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.add(p0);
       return this;
    }
    public String b(){
       g te = this.e;
       if (te != null) {
          return te.mPayEncrypted;
       }
       return null;
    }
    public String c(){
       Object obj = PatchProxy.apply(null, this, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return TextUtils.k(this.g);
    }
    public int d(){
       Object obj = PatchProxy.apply(null, this, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (q.f(this.a)) {
          return 0;
       }
       if (this.a.get(0) != null) {
          return this.a.get(0).b;
       }
       return 0;
    }
    public LiveLineSendInviteSource e(){
       return this.f;
    }
    public LivePkFlowDiversionPayInfo f(){
       LivePkFlowDiversionPayInfo livePkFlowDi;
       g obj = PatchProxy.apply(null, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          livePkFlowDi = new LivePkFlowDiversionPayInfo();
       }
       return livePkFlowDi;
    }
    public LiveFlowDiversionPaySellingChatInfo g(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.a)) {
          return objArray;
       }
       return k0.b(this.a, f.a, c.a).orNull();
    }
    public MatchType h(){
       return this.d;
    }
    public UserInfo i(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.a)) {
          return objArray;
       }
       return k0.b(this.a, d.a, a.a).orNull();
    }
    public String j(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.a)) {
          return objArray;
       }
       return k0.b(this.a, e.a, b.a).or("");
    }
    public LiveFlowDiversionCpcInfoV2 k(){
       return this.e;
    }
    public List l(){
       Object obj = PatchProxy.apply(null, this, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Lists.c(y.x(this.a, new g$a(this)));
    }
    public boolean m(){
       return this.i;
    }
    public void n(LiveFlowDiversionPaySellingChatInfo p0){
       if (q.f(this.a)) {
          return;
       }
       if (this.a.get(0) != null) {
          this.a.get(0).g = p0;
       }
       return;
    }
    public void o(String p0){
       this.g = p0;
    }
    public void p(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, og, "6")) {
          return;
       }
       if (!q.f(this.a)) {
          int i = 0;
          if (this.a.get(i) != null) {
             this.a.get(i).c = p0;
          label_003c :
             return;
          }
       }
       b.c0(LiveLogTag.LIVE_FLOW_DIVERSION, "[InviteParams] [setInvitationSource]: mInviteUserInformationList is error", "mInviteUserInformationList", this.a);
       goto label_003c ;
    }
    public g q(g$b p0){
       this.c = p0;
       return this;
    }
    public g r(LiveLineSendInviteSource p0){
       this.f = p0;
       return this;
    }
    public g s(LivePkFlowDiversionPayInfo p0){
       this.h = p0;
       return this;
    }
    public g t(MatchType p0){
       this.d = p0;
       return this;
    }
    public g u(LiveFlowDiversionCpcInfoV2 p0){
       this.e = p0;
       return this;
    }
    public g v(boolean p0){
       this.i = p0;
       return this;
    }
}
