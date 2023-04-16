package com.yxcorp.gifshow.ad.rerank.AdRankConfig$mAdAvoidMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.experiment.c;
import kotlin.jvm.internal.a;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;
import java.util.LinkedHashMap;
import java.lang.CharSequence;
import com.google.gson.Gson;
import java.lang.Throwable;
import yx.j0;

public final class AdRankConfig$mAdAvoidMap$2 extends Lambda implements a	// class@0017be
{
    public static final AdRankConfig$mAdAvoidMap$2 INSTANCE;

    static {
       AdRankConfig$mAdAvoidMap$2.INSTANCE = new AdRankConfig$mAdAvoidMap$2();
    }
    public void AdRankConfig$mAdAvoidMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final Map invoke(){
       c obj = PatchProxy.apply(null, this, AdRankConfig$mAdAvoidMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.h();
       a.o(obj, "ABManager.getInstance\(\)");
       String str = "{ \"1\":{\"1\":6,\"2\":1,\"3\":1,\"99\":1},\"2\":{\"1\":1,\"2\":6,\"3\":1,\"99\":1},\"3\":{\"1\":1,\"2\":1,\"3\":14,\"99\":1}}";
       if (obj.k()) {
          str = f.b("adRankAvoidMap", String.class, str);
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       int i = 0;
       Gson gson = (str == null || !str.length())? 1: null;
       if (!gson) {
          try{
             Object obj1 = new Gson().h(str, linkedHashMa.getClass());
             a.o(obj1, "Gson\(\).fromJson\(text, map.javaClass\)");
             linkedHashMa = obj1;
          }catch(java.lang.Exception e1){
             Object[] objArray = new Object[]{"getConfigAvoidException"};
             j0.d("AdRankManager", e1, objArray);
          }
       }
    }
}
