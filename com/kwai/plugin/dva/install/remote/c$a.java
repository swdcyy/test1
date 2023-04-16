package com.kwai.plugin.dva.install.remote.c$a;
import gj7.a;
import android.content.Context;
import java.lang.Object;
import jj7.e;
import java.lang.String;
import gj7.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import android.os.IBinder;

public class c$a implements a	// class@00136a
{
    public final e a;

    public void c$a(Context p0){
       super();
       this.a = e.a(p0);
    }
    public void H1(String p0,int p1,b p2){
       if (PatchProxy.isSupport(c$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, c$a.class, "3")) {
          return;
       }
       this.a.e(p0, p1, p2);
       return;
    }
    public void N0(String p0,int p1,String p2,String p3,b p4){
       if (PatchProxy.isSupport(c$a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, c$a.class, "2")) {
             return;
          }
       }
       this.a.d(p0, p1, p2, p3, p4);
       return;
    }
    public IBinder asBinder(){
       return null;
    }
    public void z1(String p0,int p1,String p2,String p3,b p4){
       if (PatchProxy.isSupport(c$a.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, c$a.class, "1")) {
             return;
          }
       }
       this.a.c(p0, p1, p2, p3, p4);
       return;
    }
}
