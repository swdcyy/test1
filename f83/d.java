package f83.d;
import lp1.d;
import ip1.a;
import com.kuaishou.live.lite.adapter.component.multichat.LiveLiteMultiChatPresenterV2;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.g;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.Number;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import androidx.fragment.app.c;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.RenderAreaView;
import com.kwai.framework.model.user.UserInfo;
import sc3.a$a;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import sc3.a;
import fe3.a;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import android.app.Activity;
import b93.d;
import com.yxcorp.utility.TextUtils;
import k2b.e0;
import java.util.Map;
import lh3.b;
import sz1.e;
import uz1.b;
import kotlin.Pair;
import qrd.r0;
import trd.t0;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import p63.a;
import oa1.a;
import o63.d;
import oa1.b;
import o63.a;
import msd.l;
import mp1.c;
import rd1.d;
import android.view.View;
import java.lang.Boolean;
import d61.l0;
import aq5.a;
import zp1.i;
import zp1.h;

public final class d implements d, a	// class@0028ef
{
    public final a a;
    public final LiveLiteMultiChatPresenterV2 b;
    public final a c;

    public void d(LiveLiteMultiChatPresenterV2 p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
       this.a = p1;
    }
    public User I(){
       Object obj = PatchProxy.apply(null, this, d.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteMultiChatPresenterV2.d9(this.b).I();
    }
    public void S(String p0,int p1){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, d.class, "16")) {
          return;
       }
       a.p(p0, "userId");
       return;
    }
    public int V0(){
       Object obj = PatchProxy.apply(null, this, d.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return LiveLiteMultiChatPresenterV2.d9(this.b).V0();
    }
    public ClientContent$LiveStreamPackage a(){
       ClientContent$LiveStreamPackage obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveLiteMultiChatPresenterV2.e9(this.b).a();
       a.o(obj, "liveLogPackageProvider.liveStreamPackage");
       return obj;
    }
    public c b(){
       return null;
    }
    public void b1(String p0,int p1,boolean p2){
    }
    public RenderAreaView c(){
       Object obj = PatchProxy.apply(null, this, d.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.c();
    }
    public void c1(UserInfo p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "14")) {
          return;
       }
       a.p(p0, "userInfo");
       LiveLiteMultiChatPresenterV2 e = this.b.E;
       if (e == null) {
          a.S("profileCardService");
       }
       e.a(new a$a(new UserProfile(p0), LiveStreamClickType.LIVE_CHAT));
       return;
    }
    public a d(a p0,int p1){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uod, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "canvasSize");
       return this.a.d(p0, p1);
    }
    public ViewGroup e(){
       Object obj = PatchProxy.apply(null, this, d.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.e();
    }
    public LiveData f(){
       Object obj = PatchProxy.apply(null, this, d.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.f();
    }
    public void g(){
    }
    public Activity getActivity(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getActivity();
    }
    public String getLiveStreamId(){
       String obj = PatchProxy.apply(null, this, d.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = TextUtils.k(LiveLiteMultiChatPresenterV2.d9(this.b).getLiveStreamId());
       a.o(obj, "TextUtils.emptyIfNull\(li¡­InfoManager.liveStreamId\)");
       return obj;
    }
    public String h(){
       String obj = PatchProxy.apply(null, this, d.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = TextUtils.k(LiveLiteMultiChatPresenterV2.d9(this.b).d());
       a.o(obj, "TextUtils.emptyIfNull\(li¡­InfoManager.anchorUserId\)");
       return obj;
    }
    public e0 i(){
       e0 obj = PatchProxy.apply(null, this, d.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = LiveLiteMultiChatPresenterV2.e9(this.b).getPage();
       a.o(obj, "liveLogPackageProvider.page");
       return obj;
    }
    public Map j(String p0){
       LiveLiteMultiChatPresenterV2 obj = PatchProxy.applyOneRefs(p0, this, d.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "userId");
       obj = this.b.B;
       if (obj == null) {
          a.S("liveMultiInteractManager");
       }
       b uob = obj.gc();
       String str = "interactService.liveInteractRtcManager";
       a.o(uob, str);
       String bizId = uob.getBizId();
       String str1 = "";
       if (bizId == null) {
          bizId = str1;
       }
       String str2 = "interactService.liveInte\x20\x02?: TextUtils.EMPTY_STRING\x00";
       a.o(bizId, str2);
       b uob1 = obj.Wi();
       a.o(uob1, "interactService.liveInteractBizAdapterProcessor");
       String str3 = String.valueOf(uob1.n());
       b uob2 = obj.gc();
       a.o(uob2, str);
       str = uob2.f();
       if (str == null) {
          str = str1;
       }
       a.o(str, str2);
       p0 = obj.gc().I1(p0);
       if (p0 != null) {
          str1 = p0;
       }
       a.o(str1, str2);
       Pair[] pairArray = new Pair[]{r0.a("biz_id", bizId),r0.a("biz_type", str3),r0.a("chat_id", str),r0.a("session_id", str1)};
       return t0.W(pairArray);
    }
    public d k(LiveKrnPageKey p0,a p1,a p2){
       b a;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pageKey");
       a.p(p1, "param");
       a.p(p2, "style");
       a = b.a;
       LiveLiteMultiChatPresenterV2 j = this.b.J;
       if (j == null) {
          a.S("jsBridgeService");
       }
       return b.d(a, j, p0, p1, p2, null, 16, null);
    }
    public void l(int p0){
    }
    public void m(c p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       a.p(p0, "onInviteExtra");
       a.p(p1, "inviteCallback");
       return;
    }
    public boolean n(){
       return false;
    }
    public int o(){
       return 0;
    }
    public View p(){
       Object obj = PatchProxy.apply(null, this, d.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.p();
    }
    public int q(){
       View obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b.m8();
       a.o(obj, "rootView");
       return obj.getHeight();
    }
    public boolean r(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj == PatchProxyResult.class) {
          obj = l0.d("enable_real_time_qos_log").b(Boolean.FALSE);
          a.o(obj, "SpVariable.ofBool\(\"enabl¡­time_qos_log\"\).get\(false\)");
       }
       return obj.booleanValue();
    }
    public boolean r2(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "bizRelation");
       return false;
    }
    public boolean s(){
       return false;
    }
    public void switchCamera(){
       h.b(this);
    }
    public void u(){
       h.a(this);
    }
    public void v(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       a.p(p0, "userInfo");
       return;
    }
    public void w(UserInfo p0){
    }
    public int y(){
       return 0;
    }
}
