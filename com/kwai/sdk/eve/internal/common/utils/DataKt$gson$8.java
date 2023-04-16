package com.kwai.sdk.eve.internal.common.utils.DataKt$gson$8;
import zk.i;
import java.lang.Object;
import java.lang.reflect.Type;
import zk.h;
import com.google.gson.JsonElement;
import ml5.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.eve.typevalue.Type;
import en7.e;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import zk.g;
import com.kwai.eve.blockdata.BlockData;
import cn.vimfung.luascriptcore.LuaValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.AbstractMessageLite;
import android.util.Base64;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import com.google.gson.JsonArray;
import java.util.List;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;

public final class DataKt$gson$8 implements i	// class@00149f
{

    public void DataKt$gson$8(){
       super();
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       g og1;
       g og = PatchProxy.applyThreeRefs(p0, p1, p2, this, DataKt$gson$8.class, "1");
       if (og != PatchProxyResult.class) {
       }else {
          a.p(p0, "src");
          a.p(p1, "typeOfSrc");
          a.p(p2, "context");
          double d = Double.MIN_VALUE;
          Object[] objArray = null;
          switch (e.a[p0.i().ordinal()]){
              case 1:
                p2 = PatchProxy.apply(objArray, p0, a.class, "7");
                float f = (p2 != PatchProxyResult.class)? p2.floatValue(): p0.a.toFloat();
                og1 = new g(Float.valueOf(f));
                break;
              case 2:
                og1 = new g(Double.valueOf(p0.a()));
                break;
              case 3:
                if (!p0.b()) {
                   d = false;
                }
                og1 = new g(Boolean.valueOf(d));
                break;
              case 4:
                og1 = new g(p0.g());
                break;
              case 5:
                og1 = new JsonArray();
                p0 = p0.c();
                a.m(p0);
                p0 = p0.iterator();
                while (p0.hasNext()) {
                   og1.G(p2.a(p0.next()));
                }
             label_0145 :
                og = og1;
                break;
              case 6:
                og1 = new JsonObject();
                p0 = p0.d();
                a.m(p0);
                p0 = p0.entrySet().iterator();
                while (p0.hasNext()) {
                   Map$Entry uEntry = p0.next();
                   String key = uEntry.getKey();
                   og1.G(key, p2.a(uEntry.getValue()));
                }
                break;
              case 7:
                og1 = new g(Integer.valueOf(p0.b()));
                goto label_0145 ;
                break;
              case 8:
                byte[] uobyteArray = PatchProxy.apply(objArray, p0, a.class, "11");
                if (uobyteArray != PatchProxyResult.class) {
                }else {
                   uobyteArray = p0.a.toByteArray();
                }
                og1 = new g(Base64.encodeToString(uobyteArray, d));
                goto label_0145 ;
                break;
              case 9:
                p0 = p0.f();
                if (p0 != null) {
                   objArray = p0.toByteArray();
                }
                og1 = new g(Base64.encodeToString(objArray, d));
                goto label_0145 ;
                break;
              case 10:
                BlockData uBlockData = PatchProxy.apply(objArray, p0, a.class, "10");
                if (uBlockData != PatchProxyResult.class) {
                }else {
                   uBlockData = p0.a.asBlockData();
                   a.o(uBlockData, "typeValue.asBlockData\(\)");
                }
                og1 = new g(uBlockData.getMetaInfo());
                goto label_0145 ;
                break;
              case 11:
                og = new g("com.kwai.eve.typevalue.Type.UnSupported");
                break;
              default:
                throw new NoWhenBranchMatchedException();
          }
       }
       return og;
    }
}
