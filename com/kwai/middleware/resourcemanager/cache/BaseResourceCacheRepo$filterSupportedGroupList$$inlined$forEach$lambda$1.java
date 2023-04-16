package com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo$filterSupportedGroupList$$inlined$forEach$lambda$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.middleware.resourcemanager.cache.BaseResourceCacheRepo;
import java.util.List;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.adt.DetailInfo;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import bb7.a;
import java.lang.StringBuilder;
import cb7.a;
import com.yxcorp.utility.Log;

public final class BaseResourceCacheRepo$filterSupportedGroupList$$inlined$forEach$lambda$1 extends Lambda implements l	// class@000f36
{
    public final List $groupInfoList$inlined;
    public final BaseResourceCacheRepo this$0;

    public void BaseResourceCacheRepo$filterSupportedGroupList$$inlined$forEach$lambda$1(BaseResourceCacheRepo p0,List p1){
       this.this$0 = p0;
       this.$groupInfoList$inlined = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(DetailInfo p0){
       a.p(p0, "detailInfo");
       boolean b = true;
       if (!this.this$0.j.c(p0)) {
          Log.d(this.this$0.f(), "detail info is invalid "+p0.getId());
       }else if(!this.this$0.j.b(p0)){
          Log.d(this.this$0.f(), "detail info not supported "+p0.getId());
       }else {
          b = false;
       }
       return b;
    }
}
