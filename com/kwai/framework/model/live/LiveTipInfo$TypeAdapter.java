package com.kwai.framework.model.live.LiveTipInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.framework.model.live.LiveTipInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class LiveTipInfo$TypeAdapter extends TypeAdapter	// class@0016c2
{
    public final Gson a;
    public static final a b;

    static {
       LiveTipInfo$TypeAdapter.b = a.get(LiveTipInfo.class);
    }
    public void LiveTipInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, LiveTipInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          int i = 0;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new LiveTipInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xb1f22278:
                      if (str.equals("exp_tag")) {
                         i = 0;
                      }
                      break;
                    case 0xd832e1c7:
                      if (str.equals("liveStreamId")) {
                         i = 1;
                      }
                      break;
                    case 0x5a320960:
                      if (str.equals("serverExpTag")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mExptag = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.mLiveStreamId = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.mServerExpTag = TypeAdapters.A.read(p0);
                      break;
                    default:
                      p0.Q();
                }
             }
             p0.j();
          }
          obj = i;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveTipInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mLiveStreamId != null) {
             p0.r("liveStreamId");
             TypeAdapters.A.write(p0, p1.mLiveStreamId);
          }
          if (p1.mExptag != null) {
             p0.r("exp_tag");
             TypeAdapters.A.write(p0, p1.mExptag);
          }
          if (p1.mServerExpTag != null) {
             p0.r("serverExpTag");
             TypeAdapters.A.write(p0, p1.mServerExpTag);
          }
          p0.j();
       }
       return;
    }
}
