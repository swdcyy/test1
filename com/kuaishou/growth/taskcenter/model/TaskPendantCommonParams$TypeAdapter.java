package com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.growth.taskcenter.model.TaskPendantCommonParams;
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
import com.vimeo.stag.KnownTypeAdapters$j;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class TaskPendantCommonParams$TypeAdapter extends TypeAdapter	// class@00074a
{
    public final Gson a;
    public static final a b;

    static {
       TaskPendantCommonParams$TypeAdapter.b = a.get(TaskPendantCommonParams.class);
    }
    public void TaskPendantCommonParams$TypeAdapter(Gson p0){
       super();
       this.a = p0;
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, TaskPendantCommonParams$TypeAdapter.class, "2");
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
             obj = new TaskPendantCommonParams();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 0x12bd083c:
                      if (str.equals("pendantX")) {
                         i = 0;
                      }
                      break;
                    case 0x12bd083d:
                      if (str.equals("pendantY")) {
                         i = 1;
                      }
                      break;
                    case 0x2ef0f5ce:
                      if (str.equals("pendantYRatio")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.setMPendantX(KnownTypeAdapters$k.a(p0, obj.getMPendantX()));
                      break;
                    case 1:
                      obj.setMPendantY(KnownTypeAdapters$k.a(p0, obj.getMPendantY()));
                      break;
                    case 2:
                      obj.setMPendantYRatio(KnownTypeAdapters$j.a(p0, obj.getMPendantYRatio()));
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TaskPendantCommonParams$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("pendantX");
          p0.K((long)p1.getMPendantX());
          p0.r("pendantY");
          p0.K((long)p1.getMPendantY());
          p0.r("pendantYRatio");
          p0.J((double)p1.getMPendantYRatio());
          p0.j();
       }
       return;
    }
}
