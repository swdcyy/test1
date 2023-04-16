package com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.live.model.LiveStreamFeedPlusNearByInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.live.model.LiveStreamFeedRecruitCardInfo;
import com.google.gson.stream.b;

public final class LiveStreamFeedPlusNearByInfo$TypeAdapter extends TypeAdapter	// class@000804
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       LiveStreamFeedPlusNearByInfo$TypeAdapter.c = a.get(LiveStreamFeedPlusNearByInfo.class);
    }
    public void LiveStreamFeedPlusNearByInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(LiveStreamFeedRecruitCardInfo$TypeAdapter.c);
    }
    public LiveStreamFeedPlusNearByInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveStreamFeedPlusNearByInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       LiveStreamFeedPlusNearByInfo liveStreamFe = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return liveStreamFe;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return liveStreamFe;
       }else {
          p0.c();
          LiveStreamFeedPlusNearByInfo liveStreamFe1 = new LiveStreamFeedPlusNearByInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("recruitCard")) {
                p0.Q();
             }else {
                liveStreamFe1.mRecruitCardInfo = this.b.read(p0);
             }
          }
          p0.j();
          return liveStreamFe1;
       }
    }
    public void b(b p0,LiveStreamFeedPlusNearByInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveStreamFeedPlusNearByInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mRecruitCardInfo != null) {
             p0.r("recruitCard");
             this.b.write(p0, p1.mRecruitCardInfo);
          }
          p0.j();
          return;
       }
    }
    public Object read(a p0){
       return this.a(p0);
    }
    public void write(b p0,Object p1){
       this.b(p0, p1);
    }
}
