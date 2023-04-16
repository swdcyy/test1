package com.kuaishou.live.core.show.conditionredpacket.grab.base.m;
import java.lang.Object;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView;
import p91.m;
import com.kuaishou.live.common.core.component.redpacket.condition.LiveConditionRedPacketInfo;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.User;
import b61.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import b62.r0;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketPanelOwnerInfoView$b;
import u52.y;
import com.kwai.robust.PatchProxyResult;

public class m	// class@000a92
{

    public void m(){
       super();
    }
    public static void a(LiveConditionRedPacketPanelOwnerInfoView p0,m p1,LiveConditionRedPacketInfo p2,int p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, m.class, "1")) {
          return;
       }
       UserInfo userInfo = (p2 == null)? null: p2.e;
       m.b(p0, p1, userInfo, p3);
       return;
    }
    public static void b(LiveConditionRedPacketPanelOwnerInfoView p0,m p1,UserInfo p2,int p3){
       String str1;
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), null, m.class, "2")) {
          return;
       }
       if (p2 != null && p3 == 45) {
          p0.a(UserInfo.convertToQUser(p2));
          String str = b.b(UserInfo.convertToQUser(p2));
          if (str.length() > 8) {
             str = TextUtils.A(p2.mName, 8)+"...";
          }
          p0.b(a1.r(R.string.arg_RES_7f102879, str));
          p0.setLiveConditionRedPacketPanelOwnerInfoClickListener(new r0(p1, p2));
       }else {
          p0.a(p1.I());
          y oy = y.class;
          if (PatchProxy.isSupport(oy)) {
             str1 = PatchProxy.applyOneRefs(Integer.valueOf(p3), null, oy, "1");
             if (str1 != PatchProxyResult.class) {
             }else if(p3 != 39){
                switch (p3){
                    case 14:
                      str1 = a1.p(R.string.arg_RES_7f101fc2);
                      break;
                    case 15:
                      str1 = a1.p(R.string.arg_RES_7f101fc6);
                      break;
                    case 16:
                      str1 = a1.p(R.string.arg_RES_7f101fc3);
                      break;
                    default:
                      str1 = "";
                }
             }else {
                str1 = a1.p(R.string.arg_RES_7f101fc5);
             }
          }else {
             goto label_0083 ;
          }
          p0.b(str1);
       }
       return;
    }
}
