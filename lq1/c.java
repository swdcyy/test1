package lq1.c;
import lq1.a;
import oh3.a;
import sz1.e;
import hf3.a;
import lq1.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lq1.c$d;
import lq1.c$a;
import lq1.c$f;
import lq1.g;
import uz1.b;
import uz1.a;
import lh3.b;
import lh3.i0;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import lf3.g;
import gq1.l$a;
import com.kwai.robust.PatchProxy;
import lq1.d;
import java.util.List;
import com.kuaishou.android.live.log.b;
import brd.t;
import lq1.c$b;
import lq1.c$c;
import erd.g;
import crd.b;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig;
import com.kuaishou.protobuf.livestream.nano.LiveRevenueDeliverySellingChatInfo;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lq1.c$g;
import lq1.c$h;
import java.lang.StringBuilder;
import o56.a;
import com.yxcorp.utility.SystemUtil;
import e17.i;
import lq1.c$e;
import z1.a;
import lq1.c$i;
import lq1.c$j;

public final class c extends a implements a	// class@003001
{
    public String b;
    public long c;
    public SCLiveMultiLineChatOpened d;
    public final i0 e;
    public final a f;
    public final g g;
    public final g h;
    public final e i;
    public final a j;
    public final b k;

    public void c(e p0,a p1,b p2){
       a.p(p0, "multiInteractManager");
       a.p(p1, "longConnection");
       super();
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.b = "";
       this.c = -1;
       c$d uod = new c$d(this);
       this.e = uod;
       c$a uoa = new c$a(this);
       this.f = uoa;
       c$f uof = new c$f(this);
       this.g = uof;
       this.h = new g(p1);
       p0.Wi().M(uoa);
       p0.gc().m(uod);
       p1.u0(1008, SCLiveMultiLineChatOpened.class, uof);
    }
    public void K(String p0,String p1,l$a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "7")) {
          return;
       }
       a.p(p0, "liveStreamId");
       c td = this.d;
       if (td == null) {
          b.r(d.a, "endChatMode error, open signal is invalid.");
          return;
       }else {
          c tk = this.k;
          if (tk != null) {
             SCLiveMultiLineChatOpened multiLineCha = td.multiLineChatId;
             a.o(multiLineCha, "openedSignal.multiLineChatId");
             t ot = tk.c(multiLineCha, td.chatMode, p0, p1);
             if (ot != null) {
                ot.subscribe(new c$b(this, p2), new c$c(p2));
             }
          }
          return;
       }
    }
    public final Integer S(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       if (obj != null) {
          objArray = Integer.valueOf(obj.chatMode);
       }
       return objArray;
    }
    public final String T(){
       c td = this.d;
       SCLiveMultiLineChatOpened disableInvit = (td != null)? td.disableInviteOtherUserToastText: null;
       return disableInvit;
    }
    public final String U(){
       SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig wishGiftPane;
       c td = this.d;
       if (td != null) {
          SCLiveMultiLineChatOpened scoreLineCha = td.scoreLineChatEntranceConfig;
          if (scoreLineCha != null) {
             wishGiftPane = scoreLineCha.wishGiftPanelUrl;
          label_000c :
             return wishGiftPane;
          }
       }
       wishGiftPane = null;
       goto label_000c ;
    }
    public final String V(){
       c td = this.d;
       SCLiveMultiLineChatOpened multiLineCha = (td != null)? td.multiLineChatId: null;
       return multiLineCha;
    }
    public final SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig W(){
       c td = this.d;
       SCLiveMultiLineChatOpened scoreLineCha = (td != null)? td.scoreLineChatEntranceConfig: null;
       return scoreLineCha;
    }
    public final LiveRevenueDeliverySellingChatInfo X(){
       c td = this.d;
       SCLiveMultiLineChatOpened sellingChatI = (td != null)? td.sellingChatInfo: null;
       return sellingChatI;
    }
    public final String Y(){
       c td = this.d;
       SCLiveMultiLineChatOpened subModeId = (td != null)? td.subModeId: null;
       return subModeId;
    }
    public final boolean Z(SCLiveMultiLineChatOpened p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null && !TextUtils.x(p0.multiLineChatId)) {
          SCLiveMultiLineChatOpened chatMode = p0.chatMode;
          if (chatMode != null && (chatMode == b || !TextUtils.x(p0.subModeId))) {
             b = false;
          }
       }
       return b;
    }
    public final boolean a0(){
       c td = this.d;
       boolean b = true;
       if (td == null || td.disableInviteOtherUser != b) {
          b = false;
       }
       return b;
    }
    public t b(int p0,int p1,String p2,String p3,String p4){
       t ot;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, uoc, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "multiLineChatId");
       a.p(p3, "liveStreamId");
       c tk = this.k;
       if (tk != null) {
          ot = tk.b(p0, p1, p2, p3, p4);
          if (ot != null) {
             ot = ot.doOnNext(new c$g(this));
             if (ot != null) {
                ot = ot.doOnError(c$h.b);
             label_005b :
                return ot;
             }
          }
       }
       ot = null;
       goto label_005b ;
    }
    public final void b0(SCLiveMultiLineChatOpened p0,String p1){
       boolean b;
       c uoc = c.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uoc, "8")) {
          return;
       }
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.Z(p0)){
          b.r(d.a, "isValidSignal, scLineOpened is illegal");
       }else {
          a.m(p0);
          if ((this.b).equals(p0.multiLineChatId)) {
             b.r(d.a, "isValidSignal, lastVersion:"+this.c+", server version:"+p0.version);
             if (p0.version - this.c >= 0) {
                b = true;
             }
          }
       }
       b = false;
       if (!b) {
          b.P(d.a, "receive openedSignal from "+p1+", but invalid, passed,\n"+p0);
          if (a.d() && SystemUtil.I()) {
             i.d(R.style.arg_RES_7f11066a, "server返回open信令非法！！！");
          }
          return;
       }else {
          b.S(d.a, "onReceiveOpenedSignal", "from source", p1);
          a.m(p0);
          this.d = p0;
          this.c = p0.version;
          this.Q(new c$e(p0));
          return;
       }
    }
    public final void c0(){
       this.b = "";
       this.c = -1;
       this.d = null;
    }
    public void d(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, c.class, "5")) {
          return;
       }
       a.p(p0, "multiLineChatId");
       a.p(p1, "liveStreamId");
       c tk = this.k;
       if (tk != null) {
          t ot = tk.d(p0, p1, p2);
          if (ot != null) {
             ot.subscribe(new c$i(this), c$j.b);
          }
       }
       return;
    }
}
