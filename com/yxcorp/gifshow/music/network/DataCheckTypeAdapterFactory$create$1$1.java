package com.yxcorp.gifshow.music.network.DataCheckTypeAdapterFactory$create$1$1;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.music.network.DataCheckTypeAdapterFactory;
import java.util.Objects;
import lc7.a;
import java.util.Map;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.HashMap;
import java.lang.reflect.Field;
import java.util.List;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.music.network.model.response.DataCheckErrorType;
import java.lang.Enum;
import com.google.gson.Gson;
import k2b.u1;
import com.kwai.music.plugin.exception.DataCheckException;
import com.google.gson.stream.b;

public final class DataCheckTypeAdapterFactory$create$1$1 extends TypeAdapter	// class@00205c
{
    public final TypeAdapter a;

    public void DataCheckTypeAdapterFactory$create$1$1(TypeAdapter p0){
       this.a = p0;
       super();
    }
    public Object read(a p0){
       DataCheckTypeAdapterFactory$create$1$1 obj = PatchProxy.applyOneRefs(p0, this, DataCheckTypeAdapterFactory$create$1$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       p0 = (obj != null)? obj.read(p0): null;
       DataCheckTypeAdapterFactory b = DataCheckTypeAdapterFactory.b;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, DataCheckTypeAdapterFactory.class, "4") && p0 instanceof a) {
          Map map = p0.a();
          String str = (map == null || map.isEmpty())? 1: null;
          String name = p0.getClass().getName();
          if (!str) {
             if (map != null) {
                a.o(name, "className");
                Objects.requireNonNull(b);
                if (!PatchProxy.applyVoidThreeRefs(p0, map, name, b, DataCheckTypeAdapterFactory.class, "5")) {
                   ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
                   ClientStat$CustomStatEvent uCustomStatE = new ClientStat$CustomStatEvent();
                   uCustomStatE.key = "X3_API_RESP_STAT_EVENT";
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = map.entrySet().iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      HashMap hashMap = new HashMap();
                      hashMap.put("objRespField", uEntry.getKey());
                      Object value = uEntry.getValue();
                      String str1 = "ramRespField";
                      try{
                         hashMap.put(str1, value);
                         value = p0.getClass().getField(uEntry.getKey()).get(p0);
                         if (value instanceof List) {
                            hashMap.put("errorInfo", "data check exception: "+name+".field "+uEntry.getKey()+" size"+'('+value.size()+"\) less than legal value");
                            hashMap.put("errorType", DataCheckErrorType.INVALID_FIELD_SIZE.toString());
                         }
                      }catch(java.lang.NoSuchFieldException e0){
                         hashMap.put("errorInfo", "data check exception: "+name+".field "+uEntry.getKey()+" is null");
                         hashMap.put("errorType", DataCheckErrorType.FIELD_NOT_FOUND.toString());
                      }
                      uArrayList.add(hashMap);
                   }
                   uCustomStatE.value = new Gson().q(uArrayList);
                   statPackage.customStatEvent = uCustomStatE;
                   u1.j0(statPackage);
                }
             }
             throw new DataCheckException(name+"\'s field which add \'RequestParamCheck/RequestListParamCheck\' annotation might be null");
          }
       }
    label_015a :
       return p0;
    }
    public void write(b p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, DataCheckTypeAdapterFactory$create$1$1.class, "1")) {
          return;
       }
       DataCheckTypeAdapterFactory$create$1$1 ta = this.a;
       if (ta != null) {
          ta.write(p0, p1);
       }
       return;
    }
}
