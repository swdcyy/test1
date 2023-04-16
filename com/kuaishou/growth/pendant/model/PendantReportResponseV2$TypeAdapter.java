package com.kuaishou.growth.pendant.model.PendantReportResponseV2$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.model.PendantReportResponseV2;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$d;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import java.util.List;
import com.google.gson.stream.b;

public final class PendantReportResponseV2$TypeAdapter extends TypeAdapter	// class@00067b
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PendantReportResponseV2$TypeAdapter.c = a.get(PendantReportResponseV2.class);
    }
    public void PendantReportResponseV2$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$d());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PendantReportResponseV2$TypeAdapter.class, "2");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = p0.J();
          String str = null;
          if (JsonToken.NULL == obj) {
             p0.A();
          }else if(JsonToken.BEGIN_OBJECT != obj){
             p0.Q();
          }else {
             p0.c();
             obj = new PendantReportResponseV2();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("timerOffBizIdList")) {
                   p0.Q();
                }else {
                   obj.mTimerOffBizIdList = this.b.read(p0);
                }
             }
             p0.j();
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantReportResponseV2$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mTimerOffBizIdList != null) {
             p0.r("timerOffBizIdList");
             this.b.write(p0, p1.mTimerOffBizIdList);
          }
          p0.j();
       }
       return;
    }
}
