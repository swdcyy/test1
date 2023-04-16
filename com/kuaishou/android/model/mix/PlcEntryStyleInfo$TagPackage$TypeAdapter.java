package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
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
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$TagPackage$TypeAdapter extends TypeAdapter	// class@000da2
{
    public final Gson a;
    public static final a b;

    static {
       PlcEntryStyleInfo$TagPackage$TypeAdapter.b = a.get(PlcEntryStyleInfo$TagPackage.class);
    }
    public void PlcEntryStyleInfo$TagPackage$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public PlcEntryStyleInfo$TagPackage a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$TagPackage$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$TagPackage tagPackage = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return tagPackage;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return tagPackage;
       }else {
          p0.c();
          PlcEntryStyleInfo$TagPackage tagPackage1 = new PlcEntryStyleInfo$TagPackage();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xc4aaf986:
                   if (str.equals("params")) {
                      i = 0;
                   }
                   break;
                 case 0xcc2e9ace:
                   if (str.equals("secondaryType")) {
                      i = 1;
                   }
                   break;
                 case 0xd0970e1e:
                   if (str.equals("customTraceData")) {
                      i = 2;
                   }
                   break;
                 case 0xf7e870be:
                   if (str.equals("identity")) {
                      i = 3;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 4;
                   }
                   break;
                 case 0x368f3a:
                   if (str.equals("type")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   tagPackage1.mParams = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   tagPackage1.mSecondaryType = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   tagPackage1.mBizEntryTag = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   tagPackage1.mIdentity = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   tagPackage1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   tagPackage1.mType = KnownTypeAdapters$k.a(p0, tagPackage1.mType);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return tagPackage1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$TagPackage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$TagPackage$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          if (p1.mIdentity != null) {
             p0.r("identity");
             TypeAdapters.A.write(p0, p1.mIdentity);
          }
          p0.r("type");
          p0.K((long)p1.mType);
          if (p1.mSecondaryType != null) {
             p0.r("secondaryType");
             TypeAdapters.A.write(p0, p1.mSecondaryType);
          }
          if (p1.mParams != null) {
             p0.r("params");
             TypeAdapters.A.write(p0, p1.mParams);
          }
          if (p1.mBizEntryTag != null) {
             p0.r("customTraceData");
             TypeAdapters.A.write(p0, p1.mBizEntryTag);
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
