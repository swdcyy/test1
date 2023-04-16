package com.kuaishou.android.model.mix.HotAreaInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.HotAreaInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.HotAreaInfo$Location$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.HotAreaInfo$Location;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class HotAreaInfo$TypeAdapter extends TypeAdapter	// class@000ca4
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       HotAreaInfo$TypeAdapter.c = a.get(HotAreaInfo.class);
    }
    public void HotAreaInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(HotAreaInfo$Location$TypeAdapter.b);
    }
    public HotAreaInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, HotAreaInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       HotAreaInfo hotAreaInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return hotAreaInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return hotAreaInfo;
       }else {
          p0.c();
          HotAreaInfo hotAreaInfo1 = new HotAreaInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x9bb2a0d2:
                   if (str.equals("bottomLeft")) {
                      i = 0;
                   }
                   break;
                 case 0xad9528ae:
                   if (str.equals("kwaiLink")) {
                      i = 1;
                   }
                   break;
                 case 0xba8879a4:
                   if (str.equals("priority")) {
                      i = 2;
                   }
                   break;
                 case 0xbc0b22fc:
                   if (str.equals("topLeft")) {
                      i = 3;
                   }
                   break;
                 case 0xc5af9dc7:
                   if (str.equals("topRight")) {
                      i = 4;
                   }
                   break;
                 case 0xcb7ef180:
                   if (str.equals("taskId")) {
                      i = 5;
                   }
                   break;
                 case 0xdaf7dab1:
                   if (str.equals("bottomRight")) {
                      i = 6;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   hotAreaInfo1.mBottomLeft = this.b.read(p0);
                   break;
                 case 1:
                   hotAreaInfo1.mKwaiLink = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   hotAreaInfo1.mPriority = KnownTypeAdapters$k.a(p0, hotAreaInfo1.mPriority);
                   break;
                 case 3:
                   hotAreaInfo1.mTopLeft = this.b.read(p0);
                   break;
                 case 4:
                   hotAreaInfo1.mTopRight = this.b.read(p0);
                   break;
                 case 5:
                   hotAreaInfo1.mTaskId = KnownTypeAdapters$k.a(p0, hotAreaInfo1.mTaskId);
                   break;
                 case 6:
                   hotAreaInfo1.mBottomRight = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return hotAreaInfo1;
       }
    }
    public void b(b p0,HotAreaInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotAreaInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTopLeft != null) {
             p0.r("topLeft");
             this.b.write(p0, p1.mTopLeft);
          }
          if (p1.mTopRight != null) {
             p0.r("topRight");
             this.b.write(p0, p1.mTopRight);
          }
          if (p1.mBottomLeft != null) {
             p0.r("bottomLeft");
             this.b.write(p0, p1.mBottomLeft);
          }
          if (p1.mBottomRight != null) {
             p0.r("bottomRight");
             this.b.write(p0, p1.mBottomRight);
          }
          if (p1.mKwaiLink != null) {
             p0.r("kwaiLink");
             TypeAdapters.A.write(p0, p1.mKwaiLink);
          }
          p0.r("priority");
          p0.K((long)p1.mPriority);
          p0.r("taskId");
          p0.K((long)p1.mTaskId);
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
