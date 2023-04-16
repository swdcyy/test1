package com.kuaishou.android.model.mix.PlcEntryStyleInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData$TypeAdapter;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData$TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$EventTrackData;
import com.vimeo.stag.KnownTypeAdapters$g;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$BizData;
import com.google.gson.internal.bind.TypeAdapters;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$AdData;
import com.google.gson.stream.b;

public final class PlcEntryStyleInfo$TypeAdapter extends TypeAdapter	// class@000dae
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public final TypeAdapter e;
    public static final a f;

    static {
       PlcEntryStyleInfo$TypeAdapter.f = a.get(PlcEntryStyleInfo.class);
    }
    public void PlcEntryStyleInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(PlcEntryStyleInfo$StyleInfo$TypeAdapter.g);
       this.c = p0.j(PlcEntryStyleInfo$EventTrackData$TypeAdapter.c);
       this.d = p0.j(PlcEntryStyleInfo$AdData$TypeAdapter.b);
       this.e = p0.j(PlcEntryStyleInfo$BizData$TypeAdapter.b);
    }
    public PlcEntryStyleInfo a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PlcEntryStyleInfo$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       PlcEntryStyleInfo plcEntryStyl = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return plcEntryStyl;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return plcEntryStyl;
       }else {
          p0.c();
          PlcEntryStyleInfo plcEntryStyl1 = new PlcEntryStyleInfo();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xab27a66d:
                   if (str.equals("adData")) {
                      i = 0;
                   }
                   break;
                 case 0xcd72abe1:
                   if (str.equals("photoPage")) {
                      i = 1;
                   }
                   break;
                 case 0xfa271f5d:
                   if (str.equals("bizData")) {
                      i = 2;
                   }
                   break;
                 case 0xfa2ebeed:
                   if (str.equals("bizType")) {
                      i = 3;
                   }
                   break;
                 case 0x727886:
                   if (str.equals("showPageType")) {
                      i = 4;
                   }
                   break;
                 case 0x19681158:
                   if (str.equals("categoryType")) {
                      i = 5;
                   }
                   break;
                 case 0x4048d680:
                   if (str.equals("slideStyle")) {
                      i = 6;
                   }
                   break;
                 case 0x4a4d0872:
                   if (str.equals("forceShowOldStyle")) {
                      i = 7;
                   }
                   break;
                 case 0x6472b21b:
                   if (str.equals("eventTrackData")) {
                      i = 8;
                   }
                   break;
                 case 0x6b95b5ff:
                   if (str.equals("styleInfo")) {
                      i = 9;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   plcEntryStyl1.mAdData = this.d.read(p0);
                   break;
                 case 1:
                   plcEntryStyl1.photoPage = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   plcEntryStyl1.mBizData = this.e.read(p0);
                   break;
                 case 3:
                   plcEntryStyl1.mBizType = KnownTypeAdapters$k.a(p0, plcEntryStyl1.mBizType);
                   break;
                 case 4:
                   plcEntryStyl1.showPageType = KnownTypeAdapters$k.a(p0, plcEntryStyl1.showPageType);
                   break;
                 case 5:
                   plcEntryStyl1.mCategoryType = KnownTypeAdapters$k.a(p0, plcEntryStyl1.mCategoryType);
                   break;
                 case 6:
                   plcEntryStyl1.mPageType = KnownTypeAdapters$k.a(p0, plcEntryStyl1.mPageType);
                   break;
                 case 7:
                   plcEntryStyl1.mForceShowOldKuaixiang = KnownTypeAdapters$g.a(p0, plcEntryStyl1.mForceShowOldKuaixiang);
                   break;
                 case 8:
                   plcEntryStyl1.mEventTrackData = this.c.read(p0);
                   break;
                 case 9:
                   plcEntryStyl1.mStyleInfo = this.b.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return plcEntryStyl1;
       }
    }
    public void b(b p0,PlcEntryStyleInfo p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PlcEntryStyleInfo$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          p0.r("bizType");
          p0.K((long)p1.mBizType);
          p0.r("categoryType");
          p0.K((long)p1.mCategoryType);
          p0.r("forceShowOldStyle");
          p0.P(p1.mForceShowOldKuaixiang);
          p0.r("showPageType");
          p0.K((long)p1.showPageType);
          if (p1.photoPage != null) {
             p0.r("photoPage");
             TypeAdapters.A.write(p0, p1.photoPage);
          }
          if (p1.mStyleInfo != null) {
             p0.r("styleInfo");
             this.b.write(p0, p1.mStyleInfo);
          }
          if (p1.mEventTrackData != null) {
             p0.r("eventTrackData");
             this.c.write(p0, p1.mEventTrackData);
          }
          if (p1.mAdData != null) {
             p0.r("adData");
             this.d.write(p0, p1.mAdData);
          }
          p0.r("slideStyle");
          p0.K((long)p1.mPageType);
          if (p1.mBizData != null) {
             p0.r("bizData");
             this.e.write(p0, p1.mBizData);
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
