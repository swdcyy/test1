package m02.c1;
import java.lang.Runnable;
import com.kuaishou.live.core.basic.activity.LivePlayLoader;
import java.util.List;
import com.kwai.feature.api.live.base.model.LiveAudienceParam;
import java.lang.Object;
import com.kuaishou.live.core.basic.activity.LivePlayLoader$b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import d61.g;
import com.kuaishou.android.live.model.LiveStreamModel;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.basic.utils.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.google.gson.JsonArray;
import java.util.Iterator;
import xj3.e;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.lang.Long;
import java.lang.Number;
import k2b.u1;

public final class c1 implements Runnable	// class@0030af
{
    public final LivePlayLoader b;
    public final List c;
    public final boolean d;
    public final LiveAudienceParam e;

    public void c1(LivePlayLoader p0,List p1,boolean p2,LiveAudienceParam p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       c1 tb = this.b;
       c1 tc = this.c;
       c1 td = this.d;
       c1 te = this.e;
       LivePlayLoader j = tb.j;
       boolean b = tb.g.l();
       boolean b1 = g.j(te.mPhoto);
       boolean b2 = d0.q(te.mPhoto.mLiveStreamModel);
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object[] objArray = new Object[]{tc,j,Boolean.valueOf(td),Boolean.valueOf(b),Boolean.valueOf(b1),Boolean.valueOf(b2)};
          if (!PatchProxy.applyVoid(objArray, null, uoe, "42")) {
          label_0055 :
             if (tc != null && !tc.isEmpty()) {
                JsonArray jsonArray = new JsonArray();
                long l = 0;
                Iterator iterator = tc.iterator();
                while (iterator.hasNext()) {
                   e uoe1 = iterator.next();
                   jsonArray.G(a.a.x(uoe1));
                   l = l + uoe1.a();
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.G("tasks", jsonArray);
                jsonObject.a0("totalNs", Long.valueOf(l));
                jsonObject.c0("liveStreamId", j);
                jsonObject.H("isFirstEnter", Boolean.valueOf(td));
                jsonObject.H("isMultiTabStyle", Boolean.valueOf(b));
                jsonObject.H("isProfessionalMerchant", Boolean.valueOf(b1));
                jsonObject.H("isVoicePartyVerticalType", Boolean.valueOf(b2));
                String str = jsonObject.toString();
                u1.R("LIVE_PLAY_BIZ_PRESENTER_TASK_COST_TIME", str, 3);
             }
          }
       }else {
          goto label_0055 ;
       }
       return;
    }
}
