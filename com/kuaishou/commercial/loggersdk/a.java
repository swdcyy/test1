package com.kuaishou.commercial.loggersdk.a;
import java.lang.Object;
import m66.a;
import java.lang.Integer;
import java.util.List;
import java.util.Arrays;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import mxb.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ay.b;
import erd.g;

public class a	// class@00150b
{

    public void a(){
       super();
    }
    public static boolean a(a p0,Integer[] p1){
       return Arrays.asList(p1).contains(Integer.valueOf(p0.b));
    }
    public static void b(PlcEntryStyleInfo p0,j p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       p1.a(new b(p0));
       return;
    }
}
