package a62.c;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import a62.c$a;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import com.kwai.framework.model.user.UserInfo;
import b61.b;
import com.kwai.framework.model.user.User;
import u52.t;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import p91.m;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.m;
import androidx.lifecycle.LiveData;
import java.lang.Integer;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelValueInfoView;
import java.util.Map;
import mrd.c;
import j62.a;

public final class c extends i	// class@00004e
{
    public t F;
    public c G;
    public a H;
    public static String sLivePresenterClassName = "LiveConditionRedPacketArrowCurrentInfoTopLayoutPresenter";

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.E8();
       c tG = this.G;
       if (tG == null) {
          a.S("redPacketInfoSubject");
       }
       this.X7(tG.subscribe(new c$a(this)));
       return;
    }
    public String R8(){
       LiveConditionRedPacketInfo obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W8();
       String str = "";
       if (obj != null) {
          a.o(obj, "redPacketInfoOrNull ?: r\x20\x02rn TextUtils.EMPTY_STRING\x00");
          obj = obj.e;
          if (obj != null) {
             String str1 = b.c(obj);
             a.o(str1, "LiveUsernameUtils.getUse¡­veDisplayName\(senderInfo\)");
             return str1;
          }
       }
       return str;
    }
    public int S8(){
       return 0;
    }
    public User V8(){
       LiveConditionRedPacketInfo obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.W8();
       if (obj != null) {
          a.o(obj, "redPacketInfoOrNull ?: return null");
          obj = obj.e;
          if (obj != null) {
             return UserInfo.convertToQUser(obj);
          }
       }
       return null;
    }
    public boolean X8(){
       return false;
    }
    public void Y8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "5")) {
          return;
       }
       User user = this.V8();
       i tv = this.v;
       t a = this.p.a;
       if (user != null) {
          objArray = UserInfo.convertFromQUser(user);
       }
       m.b(tv, a, objArray, 45);
       return;
    }
    public void b9(LiveConditionRedPacketInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       a.p(p0, "redPacketValueInfo");
       p0 = p0.w;
       a.o(p0, "redPacketValueInfo.mRedPacketTotalValue");
       Integer value = p0.getValue();
       if (value != null) {
          a.o(value, "it");
          this.x.L(value.intValue());
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(c.class, null);
       return objectsByTag;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.j8();
       Object obj = this.q8(t.class);
       a.o(obj, "inject\(LiveConditionRedPacketContext::class.java\)");
       this.F = obj;
       obj = this.r8("CONDITION_RED_PACKET_FETCH_CURRENT_INFO_ID");
       a.o(obj, "inject\(LiveConditionRedP¡­ET_FETCH_CURRENT_INFO_ID\)");
       this.G = obj;
       obj = this.q8(a.class);
       a.o(obj, "inject\(LiveConditionRedPacketKey::class.java\)");
       this.H = obj;
       return;
    }
}
