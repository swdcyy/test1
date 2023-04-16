package com.kwai.framework.debuglog.c;
import com.yxcorp.utility.Log$b;
import java.lang.Object;
import com.yxcorp.utility.Log$LEVEL;
import java.lang.String;
import java.lang.Throwable;
import f66.d;
import f66.d$a;
import java.lang.Enum;
import android.util.Log;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public final class c implements Log$b	// class@000b25
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void a(Log$LEVEL p0,String p1,String p2,Throwable p3){
       Object[] objArray1;
       d uod = d.class;
       int i = d$a.a[p0.ordinal()];
       int i1 = 2;
       int i2 = 1;
       if (i != i2) {
          Object obj = null;
          if (i != i1) {
             if (i != 3) {
                String levelString = p0.getLevelString();
                Object[] objArray = new Object[i1];
                objArray[0] = p2;
                objArray[i2] = Log.getStackTraceString(p3);
                if (!PatchProxy.applyVoidThreeRefs(levelString, p1, objArray, null, d.class, "5") && d.e()) {
                   d.a("D", "DebugLogger", levelString+" "+p1, objArray);
                }
             }else {
                objArray1 = new Object[i1];
                objArray1[0] = p2;
                objArray1[i2] = Log.getStackTraceString(p3);
                if (!PatchProxy.applyVoidTwoRefs(p1, objArray1, obj, uod, "8")) {
                   d.a("I", "DebugLogger", p1, objArray1);
                }
             }
          }else {
             objArray1 = new Object[i1];
             objArray1[0] = p2;
             objArray1[i2] = Log.getStackTraceString(p3);
             if (!PatchProxy.applyVoidTwoRefs(p1, objArray1, obj, uod, "7")) {
                d.a("W", "DebugLogger", p1, objArray1);
             }
          }
       }else {
          Object[] objArray2 = new Object[i2];
          objArray2[0] = p2;
          if (!PatchProxy.applyVoidThreeRefs(p1, p3, objArray2, null, d.class, "6")) {
             if (p3 != null) {
                ArrayList uArrayList = new ArrayList(i1);
                uArrayList.add(Log.getStackTraceString(p3));
                uArrayList.addAll(Arrays.asList(objArray2));
                Object[] objArray3 = new Object[0];
                d.a("E", "DebugLogger", p1, uArrayList.toArray(objArray3));
             }else {
                d.a("E", "DebugLogger", p1, objArray2);
             }
          }
       }
       return;
    }
}
