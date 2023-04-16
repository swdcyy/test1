package com.kuaishou.android.model.mix.AnalysisEntranceModel$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.android.model.mix.AnalysisEntranceModel;
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

public final class AnalysisEntranceModel$TypeAdapter extends TypeAdapter	// class@000bbf
{
    public final Gson a;
    public static final a b;

    static {
       AnalysisEntranceModel$TypeAdapter.b = a.get(AnalysisEntranceModel.class);
    }
    public void AnalysisEntranceModel$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public AnalysisEntranceModel a(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, AnalysisEntranceModel$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.J();
       AnalysisEntranceModel uAnalysisEnt = null;
       if (JsonToken.NULL == obj) {
          p0.A();
          return uAnalysisEnt;
       }else if(JsonToken.BEGIN_OBJECT != obj){
          p0.Q();
          return uAnalysisEnt;
       }else {
          p0.c();
          AnalysisEntranceModel uAnalysisEnt1 = new AnalysisEntranceModel();
          while (p0.l()) {
             String str = p0.y();
             Objects.requireNonNull(str);
             int i = -1;
             switch (str.hashCode()){
                 case 0xf9ca8b46:
                   if (str.equals("showPosition")) {
                      i = 0;
                   }
                   break;
                 case 0x1c56f:
                   if (str.equals("url")) {
                      i = 1;
                   }
                   break;
                 case 0x36452d:
                   if (str.equals("text")) {
                      i = 2;
                   }
                   break;
                 default:
             }
             switch (i){
                 case 0:
                   uAnalysisEnt1.mPosition = KnownTypeAdapters$k.a(p0, uAnalysisEnt1.mPosition);
                   break;
                 case 1:
                   uAnalysisEnt1.mUrl = TypeAdapters.A.read(p0);
                   break;
                 case 2:
                   uAnalysisEnt1.mText = TypeAdapters.A.read(p0);
                   break;
                 default:
                   p0.Q();
             }
          }
          p0.j();
          return uAnalysisEnt1;
       }
    }
    public void b(b p0,AnalysisEntranceModel p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AnalysisEntranceModel$TypeAdapter.class, "1")) {
          return;
       }
       if (p1 == null) {
          p0.u();
          return;
       }else {
          p0.e();
          if (p1.mUrl != null) {
             p0.r("url");
             TypeAdapters.A.write(p0, p1.mUrl);
          }
          if (p1.mText != null) {
             p0.r("text");
             TypeAdapters.A.write(p0, p1.mText);
          }
          p0.r("showPosition");
          p0.K((long)p1.mPosition);
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
