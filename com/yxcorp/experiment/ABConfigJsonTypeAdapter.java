package com.yxcorp.experiment.ABConfigJsonTypeAdapter;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import com.yxcorp.experiment.ABConfig;
import java.lang.Long;
import com.google.gson.JsonElement;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.experiment.ABConfigJsonTypeAdapter$a;
import com.google.gson.stream.JsonToken;
import java.lang.Enum;
import wu8.a;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import java.lang.CharSequence;
import zk.g;
import java.lang.Number;
import java.lang.Double;
import java.lang.Boolean;
import java.lang.Integer;
import com.google.gson.stream.b;

public class ABConfigJsonTypeAdapter extends TypeAdapter	// class@00100e
{

    public void ABConfigJsonTypeAdapter(){
       super();
    }
    public Object read(a p0){
       boolean b;
       ABConfig uABConfig = new ABConfig();
       uABConfig.setDynamicFlag(0);
       uABConfig.setGroupId(null);
       uABConfig.setValueJsonElement(null);
       uABConfig.setLogPolicy(0);
       uABConfig.setWorldType(0);
       uABConfig.setPolicyType(0);
       p0.c();
       Long longx = null;
       Long longx1 = longx;
       JsonToken jsonToken = 1;
       while (p0.l()) {
          String str = p0.y();
          Objects.requireNonNull(str);
          switch (str.hashCode()){
              case 0xc56da532:
                if (!str.equals("policy")) {
                label_007a :
                   b = -1;
                }else {
                   b = false;
                }
                break;
              case 3202:
                if (!str.equals("df")) {
                   goto label_007a ;
                }else {
                   b = true;
                }
                break;
              case 0x18fc2:
                if (!str.equals("gid")) {
                   goto label_007a ;
                }else {
                   b = 2;
                }
                break;
              case 0x1be7f:
                if (!str.equals("swc")) {
                   goto label_007a ;
                }else {
                   b = 3;
                }
                break;
              case 0x30c10e:
                if (!str.equals("hash")) {
                   goto label_007a ;
                }else {
                   b = 4;
                }
                break;
              case 0x6ac9171:
                if (!str.equals("value")) {
                   goto label_007a ;
                }else {
                   b = 5;
                }
                break;
              default:
                goto label_007a ;
          }
          if (b) {
             if (b != jsonToken) {
                if (b != 2) {
                   if (b != 3) {
                      if (b != 4) {
                         if (b != 5) {
                            p0.Q();
                         }else {
                            switch (ABConfigJsonTypeAdapter$a.a[p0.J().ordinal()]){
                                case 1:
                                  uABConfig.setValueJsonElement(new g(Boolean.valueOf(p0.s())));
                                  break;
                                case 2:
                                  uABConfig.setValueJsonElement(new g(p0.E()));
                                  break;
                                case 3:
                                  str = p0.E();
                                  if (!str.contains(".") && (str.contains("e") || str.contains("E"))) {
                                     uABConfig.setValueJsonElement(new g(Double.valueOf(Double.parseDouble(str))));
                                  }else {
                                     uABConfig.setValueJsonElement(new g(Long.valueOf(Long.parseLong(str))));
                                  }
                                  break;
                                case 4:
                                  uABConfig.setValueJsonElement(null);
                                  break;
                                case 5:
                                case 6:
                                  uABConfig.setValueJsonElement(a.a.e(p0, JsonElement.class));
                                  break;
                                default:
                            }
                         }
                      }else {
                         uABConfig.setWorldType(p0.v());
                      }
                   }else {
                      longx1 = Integer.valueOf(p0.v());
                   }
                }else {
                   longx = Long.valueOf(p0.x());
                   uABConfig.setGroupId(longx);
                }
             }else {
                uABConfig.setDynamicFlag(p0.v());
             }
          }else {
             uABConfig.setPolicyType(p0.v());
          }
       }
       p0.j();
       if (longx == null) {
          uABConfig.setLogPolicy(0);
       }else if(longx1 == null){
          uABConfig.setLogPolicy(jsonToken);
       }else {
          uABConfig.setLogPolicy(longx1.intValue());
       }
       return uABConfig;
    }
    public void write(b p0,Object p1){
       p0.e();
       p0.r("hash").K((long)p1.getWorldType());
       p0.r("policy").K((long)p1.getPolicyType());
       b uob = p0.r("value");
       String str = (p1.getValueJsonElement() == null)? null: p1.getValueJsonElement().toString();
       uob.p(str);
       p0.r("gid").M(p1.getGroupId());
       p0.r("swc").K((long)p1.getLogPolicy());
       p0.r("df").K((long)p1.getDynamicFlag());
       p0.j();
       return;
    }
}
