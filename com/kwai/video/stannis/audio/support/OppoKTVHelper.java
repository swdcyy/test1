package com.kwai.video.stannis.audio.support.OppoKTVHelper;
import java.util.HashSet;
import java.lang.Object;
import java.util.Set;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import android.os.Build;
import java.lang.Boolean;

public class OppoKTVHelper	// class@000c47
{
    public static Set blackList;

    static {
       HashSet hashSet = new HashSet();
       OppoKTVHelper.blackList = hashSet;
       hashSet.add("OPPO~PDBM00");
       OppoKTVHelper.blackList.add("OPPO~OPPO A83");
       OppoKTVHelper.blackList.add("OPPO~PDAM10");
       OppoKTVHelper.blackList.add("OPPO~OPPO R9tm");
       OppoKTVHelper.blackList.add("OPPO~PCDT10");
       OppoKTVHelper.blackList.add("OPPO~PDBM00");
       OppoKTVHelper.blackList.add("OPPO~PDBM00");
    }
    public void OppoKTVHelper(){
       super();
    }
    public static void addToBlackList(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, OppoKTVHelper.class, "3")) {
          return;
       }
       OppoKTVHelper.blackList.add(p0+"~"+p1);
       return;
    }
    public static String configKey(){
       Object obj = PatchProxy.apply(null, null, OppoKTVHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Build.MANUFACTURER+"~"+Build.MODEL;
    }
    public static boolean isNotInBlackList(){
       Object obj = PatchProxy.apply(null, null, OppoKTVHelper.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if ((Build.MANUFACTURER).equalsIgnoreCase("OPPO") && !OppoKTVHelper.blackList.contains(OppoKTVHelper.configKey())) {
          return true;
       }
       return false;
    }
}
