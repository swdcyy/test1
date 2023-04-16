package com.yxcorp.plugin.search.startup.StagFactoryksfeaturesftsearchsearchbase;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.plugin.search.startup.SearchStartupCommonPojo;
import com.yxcorp.plugin.search.startup.SearchStartupCommonPojo$TypeAdapter;

public final class StagFactoryksfeaturesftsearchsearchbase implements j	// class@00076a
{

    public void StagFactoryksfeaturesftsearchsearchbase(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, StagFactoryksfeaturesftsearchsearchbase.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == SearchStartupCommonPojo.class) {
          return new SearchStartupCommonPojo$TypeAdapter(p0);
       }
       return null;
    }
}
