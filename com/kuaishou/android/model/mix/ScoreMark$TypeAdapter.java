package com.kuaishou.android.model.mix.ScoreMark$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.ScoreMark;
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

public final class ScoreMark$TypeAdapter extends TypeAdapter	// class@000df2
{
    public final Gson a;
    public static final a b;

    static {
       ScoreMark$TypeAdapter.b = a.get(ScoreMark.class);
    }
    public void ScoreMark$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public ScoreMark a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, ScoreMark$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       ScoreMark scoreMark = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return scoreMark;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return scoreMark;
       }else {
          p0.c();
          ScoreMark scoreMark1 = new ScoreMark();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xbc4cc344:
                   if (str.equals("scoreIconUrl")) {
                      i = 0;
                   }
                   break;
                 case 0x6969627:
                   if (str.equals("toast")) {
                      i = 1;
                   }
                   break;
                 case 0x5dc83ee6:
                   if (str.equals("scoreTitle")) {
                      i = 2;
                   }
                   break;
                 case 0x5de0adff:
                   if (str.equals("scoreValue")) {
                      i = 3;
                   }
                   break;
                 case 0x72adeb4d:
                   if (str.equals("scoreId")) {
                      i = 4;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   scoreMark1.mScoreIconUrl = TypeAdapters.A.read(p0);
                   break;
                 case 1:
                   scoreMark1.mToastContent = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   scoreMark1.mScoreTitle = TypeAdapters.A.read(p0);
                   break;
                 case 3:
                   scoreMark1.mScoreValue = KnownTypeAdapters$k.a(p0, scoreMark1.mScoreValue);
                   break;
                 case 4:
                   scoreMark1.mId = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return scoreMark1;
       }
    }
    public void b(b p0,ScoreMark p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScoreMark$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mId != null) {
             p0.r("scoreId");
             TypeAdapters.A.write(p0, p1.mId);
          }
          if (p1.mScoreTitle != null) {
             p0.r("scoreTitle");
             TypeAdapters.A.write(p0, p1.mScoreTitle);
          }
          p0.r("scoreValue");
          p0.K((long)p1.mScoreValue);
          if (p1.mScoreIconUrl != null) {
             p0.r("scoreIconUrl");
             TypeAdapters.A.write(p0, p1.mScoreIconUrl);
          }
          if (p1.mToastContent != null) {
             p0.r("toast");
             TypeAdapters.A.write(p0, p1.mToastContent);
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
