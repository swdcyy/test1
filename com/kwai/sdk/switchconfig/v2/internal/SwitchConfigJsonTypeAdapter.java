package com.kwai.sdk.switchconfig.v2.internal.SwitchConfigJsonTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.stream.a;
import com.kwai.sdk.switchconfig.v2.SwitchConfig;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import com.kwai.sdk.switchconfig.v2.internal.SwitchConfigJsonTypeAdapter$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import zk.f;
import java.lang.CharSequence;
import java.lang.Long;
import zk.g;
import java.lang.Number;
import java.lang.Double;
import java.lang.Boolean;
import com.google.gson.stream.b;

public class SwitchConfigJsonTypeAdapter extends TypeAdapter	// class@00167c
{
    public static final Gson GSON;
    public static final c JSON_PARSER;

    static {
       SwitchConfigJsonTypeAdapter.GSON = new Gson();
       SwitchConfigJsonTypeAdapter.JSON_PARSER = new c();
    }
    public void SwitchConfigJsonTypeAdapter(){
       super();
    }
    public SwitchConfig read(a p0){
       SwitchConfig switchConfig = new SwitchConfig();
       p0.c();
       while (p0.l()) {
          String str = p0.y();
          Objects.requireNonNull(str);
          int i = -1;
          switch (str.hashCode()){
              case 0xc56da532:
                if (str.equals("policy")) {
                   i = 0;
                }
                break;
              case 0xcee85313:
                if (str.equals("vartag")) {
                   i = 1;
                }
                break;
              case 0xcee85b1c:
                if (str.equals("varver")) {
                   i = 2;
                }
                break;
              case 0x30c10e:
                if (str.equals("hash")) {
                   i = 3;
                }
                break;
              case 0x6ac9171:
                if (str.equals("value")) {
                   i = 4;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                switchConfig.setPolicyType(p0.v());
                break;
              case 1:
                switchConfig.setVarTag(p0.E());
                break;
              case 2:
                switchConfig.setVersion(p0.E());
                break;
              case 3:
                switchConfig.setWorldType(p0.v());
                break;
              case 4:
                switch (SwitchConfigJsonTypeAdapter$a.a[p0.J().ordinal()]){
                    case 1:
                      switchConfig.setValueJsonElement(new g(Boolean.valueOf(p0.s())));
                      break;
                    case 2:
                      switchConfig.setValueJsonElement(new g(p0.E()));
                      break;
                    case 3:
                      str = p0.E();
                      if (!str.contains(".") && (str.contains("e") || str.contains("E"))) {
                         switchConfig.setValueJsonElement(new g(Double.valueOf(Double.parseDouble(str))));
                      }else {
                         switchConfig.setValueJsonElement(new g(Long.valueOf(Long.parseLong(str))));
                      }
                      break;
                    case 4:
                      switchConfig.setValueJsonElement(f.a);
                      break;
                    case 5:
                    case 6:
                      switchConfig.setValueJsonElement(SwitchConfigJsonTypeAdapter.GSON.e(p0, JsonElement.class));
                      break;
                    default:
                }
                break;
              default:
                p0.Q();
          }
       }
       p0.j();
       return switchConfig;
    }
    public Object read(a p0){
       return this.read(p0);
    }
    public void write(b p0,SwitchConfig p1){
       p0.e();
       p0.r("hash").K((long)p1.getWorldType());
       p0.r("policy").K((long)p1.getPolicyType());
       p0.r("vartag").O(p1.getVarTag());
       p0.r("varver").O(p1.getVersion());
       if (p1.getValue() == null) {
          p0.r("value").p(null);
       }else {
          p0.r("value").p(p1.getValue().toString());
       }
       p0.j();
       return;
    }
    public void write(b p0,Object p1){
       this.write(p0, p1);
    }
}
