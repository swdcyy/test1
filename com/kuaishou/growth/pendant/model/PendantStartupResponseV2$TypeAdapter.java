package com.kuaishou.growth.pendant.model.PendantStartupResponseV2$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.pendant.model.PendantStartupResponseV2;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.growth.pendant.model.TaskParamsV2;
import com.kuaishou.growth.pendant.model.BalanceTipBubbleConfigV2;
import com.vimeo.stag.KnownTypeAdapters$ListTypeAdapter;
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
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PendantStartupResponseV2$TypeAdapter extends TypeAdapter	// class@000683
{
    public final Gson a;
    public final TypeAdapter b;
    public final TypeAdapter c;
    public final TypeAdapter d;
    public static final a e;

    static {
       PendantStartupResponseV2$TypeAdapter.e = a.get(PendantStartupResponseV2.class);
    }
    public void PendantStartupResponseV2$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       TypeAdapter typeAdapter = p0.j(a.get(TaskParamsV2.class));
       this.b = typeAdapter;
       this.c = new KnownTypeAdapters$ListTypeAdapter(typeAdapter, new KnownTypeAdapters$d());
       this.d = p0.j(a.get(BalanceTipBubbleConfigV2.class));
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PendantStartupResponseV2$TypeAdapter.class, "2");
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
             obj = new PendantStartupResponseV2();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x844cc4ad:
                      if (str.equals("balanceTipBubbleConfig")) {
                         i = 0;
                      }
                      break;
                    case 0x1588df4e:
                      if (str.equals("lowActiveSwitch")) {
                         i = 1;
                      }
                      break;
                    case 0x4bf6cade:
                      if (str.equals("autoTaskWidgetParams")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.mBalanceTipBubbleConfigV2 = this.d.read(p0);
                      break;
                    case 1:
                      obj.mLowActiveSwitch = KnownTypeAdapters$k.a(p0, obj.mLowActiveSwitch);
                      break;
                    case 2:
                      obj.mAutoTaskWidgetParams = this.c.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantStartupResponseV2$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          if (p1.mAutoTaskWidgetParams != null) {
             p0.r("autoTaskWidgetParams");
             this.c.write(p0, p1.mAutoTaskWidgetParams);
          }
          if (p1.mBalanceTipBubbleConfigV2 != null) {
             p0.r("balanceTipBubbleConfig");
             this.d.write(p0, p1.mBalanceTipBubbleConfigV2);
          }
          p0.r("lowActiveSwitch");
          p0.K((long)p1.mLowActiveSwitch);
          p0.j();
       }
       return;
    }
}
