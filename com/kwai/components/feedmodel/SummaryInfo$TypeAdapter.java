package com.kwai.components.feedmodel.SummaryInfo$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kwai.components.feedmodel.SummaryInfo;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kwai.components.feedmodel.SummaryInfo$SummaryExtInfo;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.google.gson.stream.b;

public final class SummaryInfo$TypeAdapter extends TypeAdapter	// class@000c44
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       SummaryInfo$TypeAdapter.c = a.get(SummaryInfo.class);
    }
    public void SummaryInfo$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = p0.j(a.get(SummaryInfo$SummaryExtInfo.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SummaryInfo$TypeAdapter.class, "2");
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
             obj = new SummaryInfo();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x81158a4f:
                      if (str.equals("startTime")) {
                         i = 0;
                      }
                      break;
                    case 0xb2206a6f:
                      if (str.equals("extInfo")) {
                         i = 1;
                      }
                      break;
                    case 0xb8e61df3:
                      if (str.equals("summaryText")) {
                         i = 2;
                      }
                      break;
                    case 0xd3e57dfe:
                      if (str.equals("resultPagePrefix")) {
                         i = 3;
                      }
                      break;
                    case 0xdba1e9d0:
                      if (str.equals("maxRowNum")) {
                         i = 4;
                      }
                      break;
                    case 0xfe90abc2:
                      if (str.equals("playerPagePrefix")) {
                         i = 5;
                      }
                      break;
                    case 0xbbc39c0:
                      if (str.equals("commentPagePrefix")) {
                         i = 6;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mSummaryPosition = KnownTypeAdapters$n.a(p0, obj.mSummaryPosition);
                      break;
                    case 1:
                      obj.mExtInfo = this.b.read(p0);
                      break;
                    case 2:
                      obj.mSummaryNote = TypeAdapters.A.read(p0);
                      break;
                    case 3:
                      obj.mResultTitle = TypeAdapters.A.read(p0);
                      break;
                    case 4:
                      obj.mMaxLines = KnownTypeAdapters$k.a(p0, obj.mMaxLines);
                      break;
                    case 5:
                      obj.mSlideTitle = TypeAdapters.A.read(p0);
                      break;
                    case 6:
                      obj.mCommentTitle = TypeAdapters.A.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SummaryInfo$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("startTime");
          p0.K(p1.mSummaryPosition);
          p0.r("maxRowNum");
          p0.K((long)p1.mMaxLines);
          if (p1.mResultTitle != null) {
             p0.r("resultPagePrefix");
             TypeAdapters.A.write(p0, p1.mResultTitle);
          }
          if (p1.mSlideTitle != null) {
             p0.r("playerPagePrefix");
             TypeAdapters.A.write(p0, p1.mSlideTitle);
          }
          if (p1.mCommentTitle != null) {
             p0.r("commentPagePrefix");
             TypeAdapters.A.write(p0, p1.mCommentTitle);
          }
          if (p1.mSummaryNote != null) {
             p0.r("summaryText");
             TypeAdapters.A.write(p0, p1.mSummaryNote);
          }
          if (p1.mExtInfo != null) {
             p0.r("extInfo");
             this.b.write(p0, p1.mExtInfo);
          }
          p0.j();
       }
       return;
    }
}
