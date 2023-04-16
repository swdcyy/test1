package com.frog.engine.view.vconsole.VConsoleEnum;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;

public class VConsoleEnum	// class@0015a9
{

    public void VConsoleEnum(){
       super();
    }
    public static int parse(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, VConsoleEnum.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (p0 == null) {
          p0 = "";
       }
       p0 = p0.toUpperCase();
       Objects.requireNonNull(p0);
       int i = -1;
       int i1 = 3;
       switch (p0.hashCode()){
           case 0x225cae:
             if (p0.equals("INFO")) {
                i = 0;
             }
             break;
           case 0x3de9e33:
             if (p0.equals("DEBUG")) {
                i = 1;
             }
             break;
           case 0x3f2d9e8:
             if (p0.equals("ERROR")) {
                i = 2;
             }
             break;
           case 0x6dd13b7c:
             if (p0.equals("WARNING")) {
                i = 3;
             }
             break;
           default:
       }
       switch (i){
           case 0:
             i1 = 2;
             break;
           case 1:
             i1 = 1;
             break;
           case 2:
             i1 = 4;
             break;
           case 3:
           default:
             i1 = 0;
       }
       return i1;
    }
}
