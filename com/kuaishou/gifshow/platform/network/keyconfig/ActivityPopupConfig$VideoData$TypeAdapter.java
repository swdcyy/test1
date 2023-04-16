package com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$VideoData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.gifshow.platform.network.keyconfig.ActivityPopupConfig$VideoData;
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
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class ActivityPopupConfig$VideoData$TypeAdapter extends TypeAdapter	// class@000854
{
    public final Gson a;
    public static final a b;

    static {
       ActivityPopupConfig$VideoData$TypeAdapter.b = a.get(ActivityPopupConfig$VideoData.class);
    }
    public void ActivityPopupConfig$VideoData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ActivityPopupConfig$VideoData$TypeAdapter.class, "2");
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
             obj = new ActivityPopupConfig$VideoData();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x89444d94:
                      if (str.equals("duration")) {
                         i = 0;
                      }
                      break;
                    case 0xc77df815:
                      if (str.equals("repeatSeekEndTime")) {
                         i = 1;
                      }
                      break;
                    case 0xfff3d8dc:
                      if (str.equals("repeatSeekStartTime")) {
                         i = 2;
                      }
                      break;
                    case 0x1c56f:
                      if (str.equals("url")) {
                         i = 3;
                      }
                      break;
                    case 0x49953f71:
                      if (str.equals("resourceKey")) {
                         i = 4;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mTotalDuration = KnownTypeAdapters$n.a(p0, obj.mTotalDuration);
                      break;
                    case 1:
                      obj.mRepeatSeekEndTime = KnownTypeAdapters$n.a(p0, obj.mRepeatSeekEndTime);
                      break;
                    case 2:
                      obj.mRepeatSeekStartTime = KnownTypeAdapters$n.a(p0, obj.mRepeatSeekStartTime);
                      break;
                    case 3:
                      obj.mVideoUrl = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mVideoResourceKey = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ActivityPopupConfig$VideoData$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mVideoUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mVideoUrl);
          }
          if (p1.mVideoResourceKey != null) {
             p0.r("resourceKey");
             TypeAdapters.A.write(p0, p1.mVideoResourceKey);
          }
          p0.r("repeatSeekStartTime");
          p0.K(p1.mRepeatSeekStartTime);
          p0.r("repeatSeekEndTime");
          p0.K(p1.mRepeatSeekEndTime);
          p0.r("duration");
          p0.K(p1.mTotalDuration);
          p0.j();
       }
       return;
    }
}
