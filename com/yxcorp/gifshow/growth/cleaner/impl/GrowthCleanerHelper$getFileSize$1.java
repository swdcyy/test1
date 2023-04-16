package com.yxcorp.gifshow.growth.cleaner.impl.GrowthCleanerHelper$getFileSize$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.io.File;
import java.lang.Number;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class GrowthCleanerHelper$getFileSize$1 extends Lambda implements p	// class@001332
{
    public static final GrowthCleanerHelper$getFileSize$1 INSTANCE;

    static {
       GrowthCleanerHelper$getFileSize$1.INSTANCE = new GrowthCleanerHelper$getFileSize$1();
    }
    public void GrowthCleanerHelper$getFileSize$1(){
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return Boolean.valueOf(this.invoke(p0, p1.intValue()));
    }
    public final boolean invoke(File p0,int p1){
       if (PatchProxy.isSupport(GrowthCleanerHelper$getFileSize$1.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, GrowthCleanerHelper$getFileSize$1.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "<anonymous parameter 0>");
       return true;
    }
}
