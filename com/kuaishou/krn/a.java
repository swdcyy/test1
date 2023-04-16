package com.kuaishou.krn.a;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.Object;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.bundle.preload.j;
import t45.c;

public final class a implements Runnable	// class@0007ab
{
    public final String b;
    public final List c;
    public final LoadingStateTrack d;

    public void a(String p0,List p1,LoadingStateTrack p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       if (PatchProxy.applyVoidThreeRefs(tb, tc, td, null, KrnReactRootPreloadManager.class, "5")) {
       }else {
          c.a(new j(tb, tc, td));
       }
       return;
    }
}
