package com.kuaishou.bizmonitor.framework.funnel.collector.kwai.c0;
import mn.d;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage;
import java.lang.String;
import mn.b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.util.Objects;
import java.util.List;
import android.content.SharedPreferences;
import fg6.a;
import com.kuaishou.bizmonitor.framework.funnel.collector.kwai.PersistentStorage$b;
import com.google.gson.Gson;
import java.lang.System;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.util.Arrays;

public class c0 extends d	// class@001164
{
    public final PersistentStorage B0;

    public void c0(PersistentStorage p0,String p1,int p2){
       this.B0 = p0;
       super(p1, p2);
    }
    public Object b(b p0,Object[] p1){
       PersistentStorage$b uob;
       PersistentStorage$b[] uobArray;
       PersistentStorage$b[] uobArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, c0.class, "1");
       if (p0 != patchProxyRe) {
          return p0;
       }
       int i = 0;
       object oobject = p1[i];
       int i1 = 1;
       object oobject1 = p1[i1];
       int i2 = 2;
       int i3 = p1[i2].intValue();
       int i4 = 3;
       int i5 = p1[i4].intValue();
       int i6 = 4;
       int i7 = p1[i6].intValue();
       c0 tB0 = this.B0;
       Objects.requireNonNull(tB0);
       PersistentStorage persistentSt = PersistentStorage.class;
       if (PatchProxy.isSupport(persistentSt)) {
          Object[] objArray = new Object[]{oobject,oobject1,Integer.valueOf(i3),Integer.valueOf(i5),Integer.valueOf(i7)};
          List list = PatchProxy.apply(objArray, tB0, persistentSt, "4");
          if (list != patchProxyRe) {
          label_00b3 :
             return PersistentStorage.a(list);
          }
       }
       PersistentStorage$b[] c = PersistentStorage.c;
       String str = tB0.a.getString(oobject, null);
       if (str != null) {
          try{
             c = a.a.h(str, PersistentStorage$b[].class);
          }catch(java.lang.Exception e0){
          }
       }
    }
}
