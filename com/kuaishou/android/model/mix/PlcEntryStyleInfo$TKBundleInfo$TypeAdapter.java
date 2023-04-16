package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TKBundleInfo;
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

public final class PlcEntryStyleInfo$TKBundleInfo$TypeAdapter extends TypeAdapter	// class@000d9e
{
    public final Gson a;
    public static final a b;

    static {
       PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.b = a.get(PlcEntryStyleInfo$TKBundleInfo.class);
    }
    public void PlcEntryStyleInfo$TKBundleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PlcEntryStyleInfo$TKBundleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$TKBundleInfo tKBundleInfo = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tKBundleInfo;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tKBundleInfo;
       }else {
          p0.c();
          PlcEntryStyleInfo$TKBundleInfo tKBundleInfo1 = new PlcEntryStyleInfo$TKBundleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             if (!str.equals("bundleId")) {
                p0.Q();
             }else {
                tKBundleInfo1.mTKBundleId = TypeAdapters.A.read(p0);
             }
          }
          p0.j();
          return tKBundleInfo1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$TKBundleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$TKBundleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTKBundleId != null) {
             p0.r("bundleId");
             TypeAdapters.A.write(p0, p1.mTKBundleId);
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
