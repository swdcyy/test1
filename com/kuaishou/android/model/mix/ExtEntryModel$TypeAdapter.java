package com.kuaishou.android.model.mix.ExtEntryModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ExtEntryModel;
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
import com.vimeo.stag.KnownTypeAdapters$g;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class ExtEntryModel$TypeAdapter extends TypeAdapter	// class@000c62
{
    public final Gson a;
    public static final a b;

    static {
       ExtEntryModel$TypeAdapter.b = a.get(ExtEntryModel.class);
    }
    public void ExtEntryModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ExtEntryModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ExtEntryModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ExtEntryModel uExtEntryMod = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uExtEntryMod;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uExtEntryMod;
       }else {
          p0.c();
          ExtEntryModel uExtEntryMod1 = new ExtEntryModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x8335179d:
                   if (str.equals("entryUrl")) {
                      i = 0;
                   }
                   break;
                 case 0xbe071a81:
                   if (str.equals("ksOrderId")) {
                      i = 1;
                   }
                   break;
                 case 0xe36d82cc:
                   if (str.equals("entryType")) {
                      i = 2;
                   }
                   break;
                 case 3355:
                   if (str.equals("id")) {
                      i = 3;
                   }
                   break;
                 case 0x337a8b:
                   if (str.equals("name")) {
                      i = 4;
                   }
                   break;
                 case 0x3568dc:
                   if (str.equals("rich")) {
                      i = 5;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uExtEntryMod1.mEntryUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   uExtEntryMod1.mKsOrderId = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uExtEntryMod1.mEntryType = KnownTypeAdapters$k.a(p0, uExtEntryMod1.mEntryType);
                   break;
                 case 3:
                   uExtEntryMod1.mId = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   uExtEntryMod1.mName = TypeAdapters.A.read(p0);
                   break;
                 case 5:
                   uExtEntryMod1.mRich = KnownTypeAdapters$g.a(p0, uExtEntryMod1.mRich);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uExtEntryMod1;
       }
    }
    public void b(b p0,ExtEntryModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ExtEntryModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mName != null) {
             p0.r("name");
             TypeAdapters.A.write(p0, p1.mName);
          }
          p0.r("rich");
          p0.P(p1.mRich);
          if (p1.mEntryUrl != null) {
             p0.r("entryUrl");
             TypeAdapters.A.write(p0, p1.mEntryUrl);
          }
          p0.r("entryType");
          p0.K((long)p1.mEntryType);
          if (p1.mKsOrderId != null) {
             p0.r("ksOrderId");
             TypeAdapters.A.write(p0, p1.mKsOrderId);
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
