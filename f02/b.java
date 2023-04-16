package f02.b;
import ke3.d;
import java.lang.Object;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.j;
import fe3.a;
import java.util.ArrayList;
import fe3.g;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import fe3.e;
import fe3.f;
import fe3.c;
import fe3.c$d;
import fe3.c$a;
import fe3.d;
import com.kuaishou.live.livestage.VideoScaleMode;
import fe3.b;
import java.lang.Integer;
import fe3.b$a;
import java.util.List;
import nsd.u;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Collection;
import ekd.q;
import java.lang.StringBuilder;

public class b implements d	// class@002264
{
    public int a;
    public int b;

    public void b(){
       super();
       this.a = 720;
       this.b = 640;
    }
    public LayoutConfig a(LiveFlvStream$LiveFlvStreamMessage p0){
       b b;
       int i1;
       LayoutConfig obj2;
       b uob1;
       b uob = this;
       LiveFlvStream$LiveFlvStreamMessage obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "1";
       b obj1 = PatchProxy.applyOneRefs(obj, uob, b.class, str);
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (obj.messageType != 17 || j.h(obj.participantViewPosition)) {
          return null;
       }
       a uoa = new a(uob.a, uob.b);
       ArrayList uArrayList = new ArrayList();
       obj = obj.participantViewPosition;
       int len = obj.length;
       int i = 0;
       LiveFlvStream$LiveChatViewPostionMessage liveChatView = null;
       while (i < len) {
          object oobject = obj[i];
          b a = uob.a;
          float f = oobject.chatViewPositionLeft * (float)a;
          double d = 0x3fe0000000000000;
          double d1 = (double)f + d;
          b = uob.b;
          float f1 = oobject.chatViewPositionTop * (float)b;
          LiveFlvStream$LiveFlvStreamMessage liveFlvStrea = obj;
          double d2 = (double)f1 + d;
          float f2 = oobject.chatViewPositionWidth * (float)a;
          double d3 = (double)f2 + d;
          f1 = oobject.chatViewPositionHeight * (float)b;
          double d4 = (double)f1 + d;
          g og = new g((int)d1, (int)d2, (int)d3, (int)d4);
          i1 = liveChatView;
          f uof = new f(i1);
          LiveFlvStream$LiveChatViewPostionMessage chatGuestId = oobject.chatGuestId;
          obj2 = PatchProxy.applyOneRefs(chatGuestId, null, c.class, str);
          c$d uod = (obj2 != patchProxyRe)? obj2: c.a.a(chatGuestId);
          e uoe = new e(uof, uod, og, new d(oobject.chatGuestId), VideoScaleMode.NONE);
          uArrayList.add(d2);
          liveChatView = i1 + 1;
          i = i + 1;
          uob = this;
          obj = liveFlvStrea;
       }
       i1 = 2;
       obj1 = b.class;
       if (PatchProxy.isSupport(obj1)) {
          Object obj3 = PatchProxy.applyOneRefs(Integer.valueOf(i1), null, obj1, "3");
          if (obj3 != patchProxyRe) {
             uob1 = obj3;
          label_00c8 :
             obj2 = new LayoutConfig(uob1, uoa, uArrayList, 0, 8, null);
             return uob;
          }
       }
       uob1 = b.c.a(i1);
       goto label_00c8 ;
    }
    public void b(LayoutConfig p0,LiveFlvStream$LiveFlvStreamMessage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "2")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_MULTI_LINE, "serialize", "serialize layoutConfig = ", p0);
       List list = p0.e();
       if (q.f(list)) {
          return;
       }
       p1.messageType = 17;
       a uoa = p0.d();
       int i = list.size();
       LiveFlvStream$LiveChatViewPostionMessage[] liveChatView = new LiveFlvStream$LiveChatViewPostionMessage[i];
       p1.participantViewPosition = liveChatView;
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return;
          }
          LiveFlvStream$LiveChatViewPostionMessage liveChatView1 = new LiveFlvStream$LiveChatViewPostionMessage();
          e uoe = list.get(i1);
          d uod = uoe.h();
          if (uod == null) {
             break ;
          }else {
             liveChatView1.chatGuestId = uod.b();
             float f = (float)uoe.e().c() / (float)uoa.d();
             liveChatView1.chatViewPositionLeft = f;
             f = (float)uoe.e().d() / (float)uoa.c();
             liveChatView1.chatViewPositionTop = f;
             f = (float)uoe.e().b() / (float)uoa.d();
             liveChatView1.chatViewPositionWidth = f;
             float f1 = (float)uoe.e().a() / (float)uoa.c();
             liveChatView1.chatViewPositionHeight = f1;
             p1.participantViewPosition[i1] = liveChatView1;
             b.c0(LiveLogTag.LIVE_MULTI_LINE, "serialize", "serialize user id = ", liveChatView1.chatGuestId+"left = "+liveChatView1.chatViewPositionLeft+"top = "+liveChatView1.chatViewPositionTop+"width = "+liveChatView1.chatViewPositionWidth+"height = "+liveChatView1.chatViewPositionHeight);
             i1 = i1 + 1;
          }
       }
       return;
    }
    public boolean c(){
       return false;
    }
    public void d(int p0,int p1){
       this.a = p0;
       this.b = p1;
    }
}
