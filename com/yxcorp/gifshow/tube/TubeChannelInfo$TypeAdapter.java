package com.yxcorp.gifshow.tube.TubeChannelInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.TubeChannelInfo;
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

public final class TubeChannelInfo$TypeAdapter extends TypeAdapter	// class@001e05
{
    public final Gson a;
    public static final a b;

    static {
       TubeChannelInfo$TypeAdapter.b = a.get(TubeChannelInfo.class);
    }
    public void TubeChannelInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TubeChannelInfo$TypeAdapter.class, "2");
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
             obj = new TubeChannelInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0xf97fd30d:
                      if (str.equals("channelAlias")) {
                         i = 0;
                      }
                      break;
                    case 0xbd19b59:
                      if (str.equals("actionUrl")) {
                         i = 1;
                      }
                      break;
                    case 0x1054322e:
                      if (str.equals("channelName")) {
                         i = 2;
                      }
                      break;
                    case 0x310793b3:
                      if (str.equals("channelIconUrl")) {
                         i = 3;
                      }
                      break;
                    case 0x460b8f65:
                      if (str.equals("parentId")) {
                         i = 4;
                      }
                      break;
                    case 0x5720517e:
                      if (str.equals("channelId")) {
                         i = 5;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.channelAlias = TypeAdapters.A.read(p0);
                      break;
                    case 1:
                      obj.actionUrl = TypeAdapters.A.read(p0);
                      break;
                    case 2:
                      obj.channelName = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.channelIconUrl = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.parentId = TypeAdapters.A.read(p0);
                      break;
                    case 5:
                      obj.channelId = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TubeChannelInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.channelId != null) {
             p0.r("channelId");
             TypeAdapters.A.write(p0, p1.channelId);
          }
          if (p1.channelName != null) {
             p0.r("channelName");
             TypeAdapters.A.write(p0, p1.channelName);
          }
          if (p1.channelAlias != null) {
             p0.r("channelAlias");
             TypeAdapters.A.write(p0, p1.channelAlias);
          }
          if (p1.channelIconUrl != null) {
             p0.r("channelIconUrl");
             TypeAdapters.A.write(p0, p1.channelIconUrl);
          }
          if (p1.parentId != null) {
             p0.r("parentId");
             TypeAdapters.A.write(p0, p1.parentId);
          }
          if (p1.actionUrl != null) {
             p0.r("actionUrl");
             TypeAdapters.A.write(p0, p1.actionUrl);
          }
          p0.j();
       }
       return;
    }
}
