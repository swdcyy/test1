package com.kwai.feature.api.feed.home.a;
import q87.c;
import java.lang.String;
import com.kwai.feature.api.feed.home.a$a;
import com.kwai.feature.api.feed.home.a$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import hn5.w;
import java.lang.Runnable;
import t45.c;

public class a extends c	// class@000eec
{

    public void a(){
       super("KCubeHome", false);
    }
    public void a(a$a p0){
       super("KCubeHome", false);
    }
    public static a D(){
       return a$b.a;
    }
    public void B(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       this.w("KCubeHome_Data", p0, objArray);
       return;
    }
    public void C(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "2")) {
          return;
       }
       w ow = new w(this, System.currentTimeMillis(), p0, p1);
       c.a(v0);
       return;
    }
}
