package com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleItem;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$TagPackage;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$StrongStyleItem$TypeAdapter extends TypeAdapter	// class@000d96
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PlcEntryStyleInfo$StrongStyleItem$TypeAdapter.c = a.get(PlcEntryStyleInfo$StrongStyleItem.class);
    }
    public void PlcEntryStyleInfo$StrongStyleItem$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PlcEntryStyleInfo$TagPackage$TypeAdapter.b);
    }
    public PlcEntryStyleInfo$StrongStyleItem a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$StrongStyleItem$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo$StrongStyleItem strongStyleI = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return strongStyleI;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return strongStyleI;
       }else {
          p0.c();
          PlcEntryStyleInfo$StrongStyleItem strongStyleI1 = new PlcEntryStyleInfo$StrongStyleItem();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0x852f4c18:
                   if (str.equals("subtitle")) {
                      i = 0;
                   }
                   break;
                 case 0xddec2b4c:
                   if (str.equals("tagPackage")) {
                      i = 1;
                   }
                   break;
                 case 0x6942258:
                   if (str.equals("title")) {
                      i = 2;
                   }
                   break;
                 case 0x44086d3e:
                   if (str.equals("topLeftCornerText")) {
                      i = 3;
                   }
                   break;
                 case 0x61ad9236:
                   if (str.equals("iconUrl")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   strongStyleI1.mSubTitle = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   strongStyleI1.mTagPackage = this.b.read(p0);
                   break;
                 case 2:
                   strongStyleI1.mTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   strongStyleI1.mTopLeftCornerText = TypeAdapters.A.read(p0);
                   break;
                 case 4:
                   strongStyleI1.mIconUrl = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return strongStyleI1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo$StrongStyleItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$StrongStyleItem$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mTitle != null) {
             p0.r("title");
             TypeAdapters.A.write(p0, p1.mTitle);
          }
          if (p1.mSubTitle != null) {
             p0.r("subtitle");
             TypeAdapters.A.write(p0, p1.mSubTitle);
          }
          if (p1.mIconUrl != null) {
             p0.r("iconUrl");
             TypeAdapters.A.write(p0, p1.mIconUrl);
          }
          if (p1.mTopLeftCornerText != null) {
             p0.r("topLeftCornerText");
             TypeAdapters.A.write(p0, p1.mTopLeftCornerText);
          }
          if (p1.mTagPackage != null) {
             p0.r("tagPackage");
             this.b.write(p0, p1.mTagPackage);
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
