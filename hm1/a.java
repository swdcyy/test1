package hm1.a;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.a;
import lp3.e;
import android.content.Context;
import n91.f;
import lp3.i;
import java.lang.Class;
import lp3.c;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lc1.f;
import java.util.Collections;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import lc1.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.router.LiveRouterNoticeInfo;
import lc1.d;
import java.lang.Boolean;
import java.lang.Long;
import s81.a;
import android.content.SharedPreferences;

public class a extends a	// class@002701
{
    public long k;
    public final f l;

    public void a(e p0,Context p1){
       super(p0, p1);
       this.l = p0.a(f.class);
    }
    public List b(){
       f obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c();
       if (obj != null) {
          return Collections.singletonList(obj);
       }
       return Collections.emptyList();
    }
    public f c(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveCommentNoticeChannelType[] liveCommentN = new LiveCommentNoticeChannelType[]{LiveCommentNoticeChannelType.LONG_CONNECTION};
       return f.b(203, LiveCommentNoticeChannelType.combineChannels(liveCommentN), new e(LiveRouterNoticeInfo.class));
    }
    public boolean d(LiveRouterNoticeInfo p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       LiveRouterNoticeInfo obj = PatchProxy.applyOneRefs(p0, this, uoa, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = p0.mNextShowTimeStampMs;
       if (PatchProxy.isSupport(uoa)) {
          Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(obj), this, uoa, "4");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
          label_002f :
             long l = this.l.s();
             long l1 = 0;
             if (obj - l1 > 0) {
                long longx = a.a.getLong("liveLimitShowTimeNoticeNextTimeStamp", l1);
                if (longx - l1 <= 0) {
                   a.M(obj);
                }else if(l - longx > 0){
                   a.M(obj);
                }else {
                   b = false;
                }
             }
             b = true;
          }
       }else {
          goto label_002f ;
       }
       if (!b) {
          return false;
       }else {
          return super.d(p0);
       }
    }
}
