package com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.yxcorp.gifshow.tube.SerialInfo$ClusterSerialCount;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SerialInfo$ClusterSerialCount$TypeAdapter extends TypeAdapter	// class@001de5
{
    public final Gson a;
    public static final a b;

    static {
       SerialInfo$ClusterSerialCount$TypeAdapter.b = a.get(SerialInfo$ClusterSerialCount.class);
    }
    public void SerialInfo$ClusterSerialCount$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SerialInfo$ClusterSerialCount$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new SerialInfo$ClusterSerialCount();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("play")) {
                   if (!str1.equals("danmaku")) {
                      p0.Q();
                   }else {
                      obj.mDanmakuCount = KnownTypeAdapters$k.a(p0, obj.mDanmakuCount);
                   }
                }else {
                   obj.mPlayCount = KnownTypeAdapters$k.a(p0, obj.mPlayCount);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SerialInfo$ClusterSerialCount$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("play");
          p0.K((long)p1.mPlayCount);
          p0.r("danmaku");
          p0.K((long)p1.mDanmakuCount);
          p0.j();
       }
       return;
    }
}
