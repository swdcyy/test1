package com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData;
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

public final class PlcEntryStyleInfo$BizData$TypeAdapter extends TypeAdapter	// class@000d7b
{
    public final Gson a;
    public static final a b;

    static {
       PlcEntryStyleInfo$BizData$TypeAdapter.b = a.get(PlcEntryStyleInfo$BizData.class);
    }
    public void PlcEntryStyleInfo$BizData$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PlcEntryStyleInfo$BizData a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$BizData$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$BizData uBizData = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uBizData;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uBizData;
       }else {
          p0.c();
          PlcEntryStyleInfo$BizData uBizData1 = new PlcEntryStyleInfo$BizData();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("liveSubscribeInfo")) {
                p0.Q();
             }else {
                uBizData1.mLiveSubscribeInfo = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return uBizData1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$BizData p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$BizData$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mLiveSubscribeInfo != null) {
             p0.r("liveSubscribeInfo");
             TypeAdapters.A.write(p0, p1.mLiveSubscribeInfo);
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
