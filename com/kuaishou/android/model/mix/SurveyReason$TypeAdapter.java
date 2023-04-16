package com.kuaishou.android.model.mix.SurveyReason$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.SurveyReason;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class SurveyReason$TypeAdapter extends TypeAdapter	// class@000e0f
{
    public final Gson a;
    public static final a b;

    static {
       SurveyReason$TypeAdapter.b = a.get(SurveyReason.class);
    }
    public void SurveyReason$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public SurveyReason a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, SurveyReason$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       SurveyReason surveyReason = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return surveyReason;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return surveyReason;
       }else {
          p0.c();
          SurveyReason surveyReason1 = new SurveyReason();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 3355:
                   if (str.equals("id")) {
                      i = 0;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 1;
                   }
                   break;
                 case 0x6833e92:
                   if (str.equals("score")) {
                      i = 2;
                   }
                   break;
                 case 0x6969627:
                   if (str.equals("toast")) {
                      i = 3;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   surveyReason1.mScoreId = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   surveyReason1.mText = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   surveyReason1.mScore = KnownTypeAdapters$k.a(p0, surveyReason1.mScore);
                   break;
                 case 3:
                   surveyReason1.mToast = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return surveyReason1;
       }
    }
    public void b(b p0,SurveyReason p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SurveyReason$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mScoreId != null) {
             p0.r("id");
             TypeAdapters.A.write(p0, p1.mScoreId);
          }
          p0.r("score");
          p0.K((long)p1.mScore);
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          if (p1.mToast != null) {
             p0.r("toast");
             TypeAdapters.A.write(p0, p1.mToast);
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
