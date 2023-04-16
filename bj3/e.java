package bj3.e;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.android.model.mix.LivePlaybackMeta;
import bj3.b;
import tl8.d;
import ok.h;
import tl8.e;
import bj3.c;
import bj3.d;
import java.lang.Math;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.i;
import java.lang.CharSequence;
import android.text.TextUtils;

public class e	// class@0003db
{

    public void e(){
       super();
    }
    public static long a(long p0,QPhoto p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), p1, null, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       long l = (e.b(p1))? e.i(p1.mEntity, LivePlaybackMeta.class, b.b, Long.valueOf(0)).longValue(): e.i(p1.mEntity, LivePlaybackMeta.class, c.b, Long.valueOf(0)).longValue();
       return Math.max(0, ((l - e.i(p1.mEntity, LivePlaybackMeta.class, d.b, Long.valueOf(0)).longValue()) + p0));
    }
    public static boolean b(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.isEmpty(i.o(p0.mEntity)) ^ 0x01);
    }
}
