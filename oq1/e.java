package oq1.e;
import oq1.b;
import xp5.i;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.common.core.component.multiline.model.a;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Long;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Map;
import com.kuaishou.live.common.core.component.multiline.log.LiveMultiLineLogType;
import com.kuaishou.live.common.core.component.multiline.log.a$a;
import qrd.l1;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import oq1.g;

public final class e	// class@003557
{
    public final HashMap a;
    public final b b;
    public final i c;
    public final l d;

    public void e(b p0,i p1,l p2){
       a.p(p0, "lineLogParamsProvider");
       a.p(p1, "liveLogProvider");
       a.p(p2, "getUserTag");
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.a = new HashMap();
    }
    public final void a(String p0){
       Long longx;
       String str2;
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       List list = this.b.b();
       HashMap hashMap = new HashMap();
       String str = null;
       if (list != null) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa != null) {
                uoa = uoa.h;
                if (uoa != null) {
                   longx = Long.valueOf(uoa.userId);
                label_0037 :
                   String str1 = String.valueOf(longx.longValue());
                   str2 = this.d.invoke(str1);
                   if (str2 != null && !TextUtils.n(str2, this.a.get(str1))) {
                      hashMap.put(str1, str2);
                      this.a.put(str1, str2);
                   }
                }
             }
             longx = str;
             goto label_0037 ;
          }
       }
       if (hashMap.size() > 0) {
          LiveMultiLineLogType sHOW = LiveMultiLineLogType.SHOW;
          a$a uoa1 = new a$a();
          e tb = this.b;
          str2 = (tb != null)? tb.c(): str;
          uoa1.a = str2;
          tb = this.b;
          str2 = (tb != null)? tb.f(): str;
          uoa1.b = str2;
          tb = this.b;
          if (tb != null) {
             str = tb.d();
          }
          uoa1.c = str;
          uoa1.d = p0;
          e0 page = this.c.getPage();
          a.o(page, "liveLogProvider.page");
          ClientContent$LiveStreamPackage liveStreamPa = this.c.a();
          a.o(liveStreamPa, "liveLogProvider.liveStreamPackage");
          g.a(sHOW, uoa1, page, liveStreamPa, hashMap);
       }
       return;
    }
}
