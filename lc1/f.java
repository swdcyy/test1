package lc1.f;
import java.util.concurrent.ConcurrentHashMap;
import lc1.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.handler.LiveCommentNoticeChannelType;
import java.lang.Boolean;

public final class f	// class@002ebf
{
    public final int a;
    public final int b;
    public final d c;
    public static final Map d;

    static {
       f.d = new ConcurrentHashMap();
    }
    public void f(int p0,int p1,d p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static f a(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uof = f.d.get(Integer.valueOf(p0));
       if (uof == null) {
          b.c0(LiveLogTag.LIVE_COMMENT_NOTICE, "未找到该消息类型对应的实例，请先使用另一个重载方法创建出对应实例！", "noticeType", p0);
       }
       return uof;
    }
    public static f b(int p0,int p1,d p2){
       Map obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, null, f.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = f.d;
       f uof = obj.get(Integer.valueOf(p0));
       if (uof == null) {
          uof = new f(p0, p1, p2);
          obj.put(Integer.valueOf(p0), uof);
       }
       return uof;
    }
    public int c(){
       return this.a;
    }
    public boolean d(LiveCommentNoticeChannelType p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return p0.isSupportedBy(this.b);
    }
    public boolean equals(Object p0){
       f uof = f.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uof, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null || uof != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return this.a;
    }
}
