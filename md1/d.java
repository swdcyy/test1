package md1.d;
import bq5.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.e;
import com.kuaishou.live.common.core.component.bottombubble.notices.subscribe.LiveSubscribeAnchorNoticeInfo;
import java.lang.Object;
import bq5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import xp5.i;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import mc1.a;
import xp5.g;
import java.util.Objects;
import java.util.HashMap;
import java.lang.System;
import java.lang.Long;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import s81.a;

public class d implements d	// class@003153
{
    public final LiveSubscribeAnchorNoticeInfo a;
    public final e b;

    public void d(e p0,LiveSubscribeAnchorNoticeInfo p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public boolean a(){
       return c.d(this);
    }
    public void b(){
       c.b(this);
    }
    public void onDismiss(){
       c.a(this);
    }
    public void onShow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       a.e(this.b.e.a(), String.valueOf(this.a.mNoticeType), this.a.mBizId);
       d tb = this.b;
       String str = tb.d.d();
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(str, tb, e.class, "8")) {
          HashMap hashMap = tb.e();
          if (hashMap == null) {
             hashMap = new HashMap();
          }
          if (hashMap.isEmpty()) {
             hashMap.put(str, Long.valueOf(System.currentTimeMillis()));
          }else {
             Iterator iterator = hashMap.entrySet().iterator();
             if (iterator.hasNext()) {
                objArray = iterator.next();
             }
             long l = (objArray == null || objArray.getValue() == null)? System.currentTimeMillis(): objArray.getValue().longValue();
             hashMap.put(str, Long.valueOf(l));
          }
          a.R(hashMap);
       }
       return;
    }
}
