package a66.a;
import com.kwai.framework.config.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o33.b;
import com.kwai.framework.config.heartbeat.d;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import com.kwai.framework.switchs.e;
import vf6.c;
import mu7.g;
import com.yxcorp.gifshow.follow.init.plugin.reddot.heartbeat.c;
import bub.b;
import com.yxcorp.gifshow.reminder.friend.heartbeat.d;

public class a	// class@00002a
{
    public static b a;

    static {
       a.a = new b();
       if (PatchProxy.applyVoid(null, null, a.class, "1")) {
       }else {
          b.d();
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.a(new d());
          }
          if (!PatchProxy.applyVoid(null, null, e.class, "2")) {
             a.a(e.d());
          }
          if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
             a.a(c.e);
          }
          if (!PatchProxy.applyVoid(null, null, g.class, "1")) {
             a.a(new g());
          }
          if (!PatchProxy.applyVoid(null, null, c.class, "1")) {
             a.a(c.f);
          }
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             a.a(new b());
          }
          if (!PatchProxy.applyVoid(null, null, d.class, "1")) {
             a.a(new d());
          }
       }
    }
    public void a(){
       super();
    }
    public static void a(ConfigAutoParseJsonConsumer p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "2")) {
          return;
       }
       a.a.a(p0);
       return;
    }
}
