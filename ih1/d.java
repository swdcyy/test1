package ih1.d;
import yg1.d;
import java.lang.Object;
import java.lang.String;
import yg1.e;
import yg1.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveAudienceGiftConfig;
import java.lang.reflect.Type;
import wg3.a;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveGiftBatchConfig;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem;
import yg1.f;

public final class d implements d	// class@0028d7
{
    public List a;

    public void d(){
       super();
    }
    public void a(String p0,e p1,a p2){
       ArrayList uArrayList;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       if (this.a == null) {
          LiveConfigStartupResponse$LiveAudienceGiftConfig liveAudience = a.s(LiveConfigStartupResponse$LiveAudienceGiftConfig.class);
          if (liveAudience != null && !q.f(liveAudience.mGiftBatchConfigs)) {
             liveAudience = liveAudience.mGiftBatchConfigs;
             if (liveAudience != null) {
                uArrayList = new ArrayList(u.Y(liveAudience, 10));
                Iterator iterator = liveAudience.iterator();
                while (iterator.hasNext()) {
                   uArrayList.add(LiveGiftNumberSelectDialog$LiveGiftBatchNumberItem.parseFromLiveGiftBatchConfig(iterator.next()));
                }
             }else {
                uArrayList = null;
             }
             this.a = uArrayList;
          }
       }
       p2.a(p0, new f(1, "[LiveGifBoxConfigRepository][fetch]", this.a));
       return;
    }
    public void b(String p0,e p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "2")) {
          return;
       }
       a.p(p0, "source");
       a.p(p1, "request");
       a.p(p2, "callback");
       this.a(p0, p1, p2);
       return;
    }
    public void clear(){
       this.a = null;
    }
}
