package com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.vimeo.stag.KnownTypeAdapters$b;
import bl.p;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import java.util.ArrayList;
import java.io.IOException;
import com.google.gson.stream.b;

public final class PrtpReportSwitchConfig$TypeAdapter extends TypeAdapter	// class@0006ab
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PrtpReportSwitchConfig$TypeAdapter.c = a.get(PrtpReportSwitchConfig.class);
    }
    public void PrtpReportSwitchConfig$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new KnownTypeAdapters$ListTypeAdapter(TypeAdapters.A, new KnownTypeAdapters$b());
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PrtpReportSwitchConfig$TypeAdapter.class, "2");
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
             obj = new PrtpReportSwitchConfig();
             while (p0.l()) {
                String str1 = p0.y();
                Objects.requireNonNull(str1);
                if (!str1.equals("reportMergeKeys")) {
                   if (!str1.equals("reportMerge")) {
                      p0.Q();
                   }else {
                      obj.reportMerge = KnownTypeAdapters$n.a(p0, obj.reportMerge);
                   }
                }else {
                   obj.reportMergeKeys = this.b.read(p0);
                }
             }
             p0.j();
             if (obj.reportMergeKeys == null) {
                throw new IOException("reportMergeKeys cannot be null");
             }
          }
          obj = str;
       }
       return obj;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PrtpReportSwitchConfig$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("reportMerge");
          p0.K(p1.reportMerge);
          PrtpReportSwitchConfig reportMergeK = p1.reportMergeKeys;
          if (reportMergeK != null) {
             p0.r("reportMergeKeys");
             this.b.write(p0, p1.reportMergeKeys);
          }else if(reportMergeK != null){
             throw new IOException("reportMergeKeys cannot be null");
          }
          p0.j();
       }
       return;
    }
}
