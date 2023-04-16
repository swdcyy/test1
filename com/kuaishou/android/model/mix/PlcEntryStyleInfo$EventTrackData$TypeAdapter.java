package com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdEventTrackData;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$EventTrackData$TypeAdapter extends TypeAdapter	// class@000d89
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PlcEntryStyleInfo$EventTrackData$TypeAdapter.c = a.get(PlcEntryStyleInfo$EventTrackData.class);
    }
    public void PlcEntryStyleInfo$EventTrackData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PlcEntryStyleInfo$AdEventTrackData$TypeAdapter.f);
    }
    public PlcEntryStyleInfo$EventTrackData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$EventTrackData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$EventTrackData uEventTrackD = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uEventTrackD;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uEventTrackD;
       }else {
          p0.c();
          PlcEntryStyleInfo$EventTrackData uEventTrackD1 = new PlcEntryStyleInfo$EventTrackData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbab4111e:
                   if (str.equals("adEventTrackData")) {
                      i = 0;
                   }
                   break;
                 case 0xcd72abe1:
                   if (str.equals("photoPage")) {
                      i = 1;
                   }
                   break;
                 case 0x50024b3c:
                   if (str.equals("kuaishouOrderId")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uEventTrackD1.mAdEventTrackData = this.b.read(p0);
                   break;
                 case 1:
                   uEventTrackD1.mPhotoPage = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uEventTrackD1.mKsOrderId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uEventTrackD1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$EventTrackData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$EventTrackData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mKsOrderId != null) {
             p0.r("kuaishouOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
          }
          if (p1.mPhotoPage != null) {
             p0.r("photoPage");
             TypeAdapters.A.write(p0, p1.mPhotoPage);
          }
          if (p1.mAdEventTrackData != null) {
             p0.r("adEventTrackData");
             this.b.write(p0, p1.mAdEventTrackData);
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
