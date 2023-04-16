package h22.q;
import erd.g;
import com.kuaishou.live.core.show.activityredpacket.o;
import java.lang.String;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import y22.q;
import com.kwai.robust.PatchProxyResult;
import o22.d;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxShow;
import com.kuaishou.livestream.message.nano.LiveRedPackSkinMessage$RedPackSkinTheme;
import z12.x;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kwai.framework.model.user.UserInfo;
import android.view.View;
import u22.w$b;

public final class q implements g	// class@002c0a
{
    public final o b;
    public final String c;

    public void q(o p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       q tb = this.b;
       q tc = this.c;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(tc, tb, o.class, "18")) {
       }else {
          p0 = tb.Y;
          Object obj = null;
          LiveTreasureBoxMessage$LiveTreasureBoxShow obj1 = PatchProxy.applyOneRefs(p0, obj, q.class, "7");
          if (obj1 != PatchProxyResult.class) {
             obj = obj1;
          }else {
             obj1 = p0.skinTheme;
             if (obj1 != null) {
                obj = new d();
                obj.b = true;
                obj.a = obj1.needFollow;
                obj.c = x.z(obj1.bgThemeColor);
                p0 = p0.skinTheme;
                obj.e = p0.bottomContent;
                obj.d = p0.bottomContentLink;
                obj.f = p0.bottomContentLinkType;
             }
          }
          if (obj) {
             obj.g = TextUtils.n(tc, QCurrentUser.me().getId()) ^ 1;
             tb.T.a(tb.w, obj, UserInfo.convertFromProto(tb.Y.userInfo));
          }
       }
       return;
    }
}
