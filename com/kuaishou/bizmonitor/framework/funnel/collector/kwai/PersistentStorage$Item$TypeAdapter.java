package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$Item$TypeAdapter;
import com.google.gson.TypeAdapter;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;
import java.lang.Class;
import el.a;
import com.google.gson.Gson;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$ItemTypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.stream.JsonToken;
import java.util.Objects;
import com.vimeo.stag.KnownTypeAdapters$n;
import com.vimeo.stag.KnownTypeAdapters$k;
import com.google.gson.stream.b;

public final class PersistentStorage$Item$TypeAdapter extends TypeAdapter	// class@00114b
{
    public final Gson a;
    public final TypeAdapter b;
    public static final a c;

    static {
       PersistentStorage$Item$TypeAdapter.c = a.get(PersistentStorage$b.class);
    }
    public void PersistentStorage$Item$TypeAdapter(Gson p0){
       super();
       this.a = p0;
       this.b = new PersistentStorage$ItemTypeAdapter().nullSafe();
    }
    public Object read(a p0){
       JsonToken obj = PatchProxy.applyOneRefs(p0, this, PersistentStorage$Item$TypeAdapter.class, "2");
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
             obj = new PersistentStorage$b();
             while (p0.l()) {
                String str = p0.y();
                Objects.requireNonNull(str);
                i = -1;
                switch (str.hashCode()){
                    case 'l':
                      if (str.equals("l")) {
                         i = 0;
                      }
                      break;
                    case 't':
                      if (str.equals("t")) {
                         i = 1;
                      }
                      break;
                    case 'v':
                      if (str.equals("v")) {
                         i = 2;
                      }
                      break;
                    default:
                }
                switch (i){
                    case 0:
                      obj.launch = KnownTypeAdapters$k.a(p0, obj.launch);
                      break;
                    case 1:
                      obj.time = KnownTypeAdapters$n.a(p0, obj.time);
                      break;
                    case 2:
                      obj.value = this.b.read(p0);
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PersistentStorage$Item$TypeAdapter.class, "1")) {
       }else if(p1 == null){
          p0.u();
       }else {
          p0.e();
          p0.r("t");
          p0.K(p1.time);
          p0.r("l");
          p0.K((long)p1.launch);
          if (p1.value != null) {
             p0.r("v");
             this.b.write(p0, p1.value);
          }
          p0.j();
       }
       return;
    }
}
