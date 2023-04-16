package com.yxcorp.gifshow.growth.test.GrowthTestInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import kotlin.jvm.internal.a;

public final class GrowthTestInitModule extends a	// class@0014f8
{

    public void GrowthTestInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, GrowthTestInitModule.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       ArrayList uArrayList = Lists.e(obj);
       a.o(uArrayList, "Lists.newArrayList\(CoreInitModule::class.java\)");
       return uArrayList;
    }
    public void n(){
    }
}
