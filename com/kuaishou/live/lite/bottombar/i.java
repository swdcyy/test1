package com.kuaishou.live.lite.bottombar.i;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.lite.bottombar.LiveLiteBottomBarService;
import com.kuaishou.live.lite.sidebar.e;
import xp5.i;
import com.kuaishou.live.lite.bottombar.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z1.a;

public class i extends ViewController	// class@001ed5
{
    public final LiveLiteBottomBarService j;
    public final e k;
    public final a l;
    public final i m;
    public LiveLiteBottomBarService$a n;
    public boolean o;

    public void i(LiveLiteBottomBarService p0,e p1,i p2){
       super();
       this.l = new h(this);
       this.j = p0;
       this.k = p1;
       this.m = p2;
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.k.e(this.l);
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, i.class, "2")) {
          return;
       }
       this.k.c(this.l);
       this.o = false;
       return;
    }
}
