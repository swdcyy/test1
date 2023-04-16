package com.yxcorp.gifshow.init.module.PltHackInitModule$2;
import com.kwai.performance.stability.hack.b$b;
import com.yxcorp.gifshow.init.module.PltHackInitModule;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.util.ArrayList;
import java.io.RandomAccessFile;
import java.lang.CharSequence;
import java.lang.Throwable;
import java.lang.Long;
import java.io.IOException;

public class PltHackInitModule$2 implements b$b	// class@001994
{
    public final PltHackInitModule a;

    public void PltHackInitModule$2(PltHackInitModule p0){
       this.a = p0;
       super();
    }
    public long a(){
       return 0x3000000;
    }
    public long b(){
       long l;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       PltHackInitModule$2 obj = PatchProxy.applyWithListener(objArray, this, PltHackInitModule$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       try{
          obj = this.a;
          Objects.requireNonNull(obj);
          RandomAccessFile obj1 = PatchProxy.applyWithListener(objArray, obj, PltHackInitModule.class, "7");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else {
             ArrayList uArrayList = new ArrayList();
             l = 0;
             obj1 = new RandomAccessFile("/proc/self/maps", "r");
             int i = 4;
             while (true) {
                int i1 = 0;
                if (i > 0) {
                   String str = obj1.readLine();
                   if (str != null) {
                      if (str.contains("dalvik-LinearAlloc")) {
                         uArrayList.add(str.split("\\s+")[i1]);
                         i = i - 1;
                      }
                   }else {
                   label_006a :
                      obj1.close();
                      if (!uArrayList.size()) {
                         PatchProxy.onMethodExit(PltHackInitModule.class, "7");
                         break ;
                      }else {
                         l = Long.parseLong((uArrayList.get((uArrayList.size() - 1))).split("-")[1], 16) - Long.parseLong((uArrayList.get(i1)).split("-")[i1], 16);
                         PatchProxy.onMethodExit(PltHackInitModule.class, "7");
                         break ;
                      }
                   }
                }else {
                   goto label_006a ;
                }
             }
          }
       }catch(java.io.IOException e0){
          e0.printStackTrace();
          PatchProxy.onMethodExit(PltHackInitModule.class, "7");
       }
       PatchProxy.onMethodExit(PltHackInitModule$2.class, "1");
       return l;
    }
}
