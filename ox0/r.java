package ox0.r;
import erd.g;
import ox0.x;
import java.lang.Object;
import com.kuaishou.live.common.core.component.chat.multi.model.AcceptResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.common.core.component.chat.model.ChatInfo;
import be1.j;
import java.util.Iterator;
import java.util.Set;
import rd1.i;
import com.kwai.robust.PatchProxyResult;
import op1.b;
import op1.c;
import lp3.e;
import lp3.a;
import xp5.i;
import lp3.c;
import java.util.Map;
import c21.a;
import ox0.v;
import ox0.w;
import dp1.b;
import msd.a;
import u71.c;
import rd1.e0;
import com.kuaishou.live.core.show.chat.model.LiveMultiChatGuestWidgetConfig;
import u71.a;
import u71.d;
import o91.c;
import ox0.y;
import ex1.b;
import v71.b;
import x71.c;

public final class r implements g	// class@0035cd
{
    public final x b;
    public final int c;

    public void r(x p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       d b;
       d uod;
       d uod1;
       r tb = this.b;
       r tc = this.c;
       if (tb.m != null && (!PatchProxy.isSupport(x.class) || (!PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(tc), tb, x.class, "12") && (!PatchProxy.isSupport(x.class) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(tc), tb, x.class, "11"))))) {
          b.e0(LiveLogTag.MULTI_CHAT, "onEnterResult", "mMultiChatInfo", tb.m, "response", p0, "mediaType", Integer.valueOf(tc));
          if (!TextUtils.x(p0.sessionId)) {
             tb.m.d = p0.sessionId;
          }
          Iterator iterator = tb.g.iterator();
          while (iterator.hasNext()) {
             iterator.next().Q7();
          }
          if (tb.gp(p0.aryaConfig)) {
             if (tc == 2) {
                p0 = PatchProxyResult.class;
                Object[] objArray = null;
                if (!PatchProxy.applyVoid(objArray, tb, x.class, "13")) {
                   if (tb.r == null) {
                      a uoa = PatchProxy.apply(objArray, tb, x.class, "33");
                      if (uoa != p0) {
                      }else {
                         uoa = new a(new v(tb), new w(new c(tb.Po().a(i.class), tb.ep())));
                      }
                      tb.r = uoa;
                   }
                   x r = tb.r;
                   c uoc = PatchProxy.applyOneRefs(r, tb, x.class, "31");
                   if (uoc != p0) {
                   }else if(r == null){
                      uoc = e0.a(false);
                   }else {
                      uoc = r.e();
                   }
                   p0 = tb.g.iterator();
                   while (p0.hasNext()) {
                      objArray = p0.next().bi(uoc, tb.m.c());
                      if (objArray != null) {
                         break ;
                      }
                   }
                   p0 = objArray;
                   if (p0 != null) {
                      x r1 = tb.r;
                      if (r1 != null) {
                         r1.d(p0);
                      }
                      if (tb.s != null) {
                         d a = uoc.getResolution().a;
                         b = uoc.getResolution().b;
                         b.d0(LiveLogTag.MULTI_CHAT, "startCamera enableOldMultiChatGuestUpCameraFrame", "outputMaxWidth", Integer.valueOf(a), "outputMaxHeight", Integer.valueOf(b));
                         uod = a;
                         uod1 = b;
                      }else {
                         uod = 180;
                         uod1 = 320;
                      }
                      tb.Po().a(c.class).d7(tb, new y(tb), p0, b.b(), uod, uod1);
                   }
                }
             }
          }else {
             tb.close(12);
          }
       }
    label_0148 :
       return;
    }
}
