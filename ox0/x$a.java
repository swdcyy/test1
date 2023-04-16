package ox0.x$a;
import xv4.i;
import ox0.x;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import be1.j;
import java.util.Iterator;
import java.util.Set;
import rd1.i;
import java.nio.ByteBuffer;
import java.util.Map;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import ae1.a;
import rd1.g0;
import com.kwai.framework.model.user.User;
import xp5.g;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.Float;
import lp3.e;
import lp3.a;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService;
import lp3.c;
import com.kuaishou.live.common.core.component.chat.LiveAudienceChatService$ChatState;

public class x$a extends i	// class@0035d3
{
    public final x a;

    public void x$a(x p0){
       this.a = p0;
       super();
    }
    public void e(int p0,String p1){
       x$a uoa = x$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       Iterator iterator = this.a.g.iterator();
       while (iterator.hasNext()) {
          iterator.next().J2(p0, p1);
       }
       return;
    }
    public void f(String p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, x$a.class, "1")) {
          return;
       }
       this.a.D7(p1);
       return;
    }
    public void j(String p0,ByteBuffer p1,int p2,int p3,int p4,int p5){
       float f1;
       x$a uoa = this;
       object oobject = p0;
       int i = p2;
       int i1 = p3;
       x$a uoa1 = x$a.class;
       int i2 = 4;
       boolean i3 = 1;
       int i4 = 2;
       if (PatchProxy.isSupport(uoa1)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa1, "3")) {
             return;
          }
       }
       uoa1 = uoa.a;
       if (uoa1.n == i4) {
          a uoa2 = uoa1.m.b().get(oobject);
          if (uoa2 != null && uoa2.d == i2) {
             Iterator iterator = uoa.a.g.iterator();
             while (iterator.hasNext()) {
                iterator.next().pe(uoa2, p1, p2, p3, p4);
             }
          }
          if ((uoa.a.e.I().getId()).equals(oobject)) {
             uoa1 = uoa.a;
             int i5 = uoa1.p + i3;
             uoa1.p = i5;
             if (i5 == i4) {
                LiveLogTag mULTI_CHAT = LiveLogTag.MULTI_CHAT;
                b.d0(mULTI_CHAT, "onRTCReceiveVideoData", "mMultiChatInfo", uoa1.m, "userId", p0);
                float f = 0x3f800000;
                if (p4 % 180) {
                   f1 = (float)i1 * f;
                   f = (float)i;
                }else {
                   f1 = (float)i * f;
                   f = (float)i1;
                }
                f1 = f1 / f;
                a uoa3 = uoa.a.m.i();
                if (uoa3 == null) {
                   b.Z(mULTI_CHAT, "onRTCReceiveVideoData: selfGuest is null");
                   return;
                }else {
                   x$a a = uoa.a;
                   i3 = uoa3.b();
                   Objects.requireNonNull(a);
                   if (!PatchProxy.isSupport(x.class) || !PatchProxy.applyVoidThreeRefs(Boolean.valueOf(i3), Float.valueOf(f1), uoa3, a, x.class, "30")) {
                      a.Po().a(LiveAudienceChatService.class).Gj(LiveAudienceChatService$ChatState.CONNECTED);
                      Iterator iterator1 = a.g.iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().En(i3, f1, uoa3);
                         if (a.m != null) {
                         }
                      }
                   }
                }
             }
          }
       }
    label_011e :
       return;
    }
}
