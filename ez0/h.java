package ez0.h;
import java.lang.Object;
import java.util.concurrent.ConcurrentMap;
import com.google.common.collect.Maps;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;

public class h	// class@00224b
{
    public final Map a;
    public final Map b;

    public void h(){
       super();
       this.a = Maps.q();
       this.b = Maps.q();
    }
    public void a(GiftTab p0,String p1,boolean p2){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, h.class, "1")) {
          return;
       }
       if (TextUtils.x(p1)) {
          b.Z(LiveLogTag.GIFT, "[GiftLlisdCache] [putGiftLlsid]: value is null");
          return;
       }else if(p2){
          this.a.put(p0, p1);
       }else {
          this.b.put(p0, p1);
       }
       return;
    }
}
