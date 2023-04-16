package com.yxcorp.gifshow.homepage.personal.log.LocalPolicyLogData;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.a;

public final class LocalPolicyLogData	// class@00178b
{
    public int bottomLocalCache;
    public int default;
    public String interface;
    public Integer page;
    public int[] predictData;
    public int[] startupData;
    public int topLocalCache;

    public void LocalPolicyLogData(){
       super();
    }
    public String toString(){
       String str;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, LocalPolicyLogData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "LocalPolicyLogData\(page="+this.page+", `interface`="+this.interface+", startupData=";
       LocalPolicyLogData tstartupData = this.startupData;
       if (tstartupData != null) {
          str = Arrays.toString(tstartupData);
          a.o(str, "java.util.Arrays.toString\(this\)");
       }else {
          str = objArray;
       }
       obj = obj+str+", predictData=";
       tstartupData = this.predictData;
       if (tstartupData != null) {
          objArray = Arrays.toString(tstartupData);
          a.o(objArray, "java.util.Arrays.toString\(this\)");
       }
       return obj+objArray+" topLocalCache="+this.topLocalCache+", bottomLocalCache="+this.bottomLocalCache+", default="+this.default+')';
    }
}
