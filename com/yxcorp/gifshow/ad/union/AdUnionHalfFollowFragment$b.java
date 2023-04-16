package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$b;
import java.lang.Runnable;
import android.view.Window;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class AdUnionHalfFollowFragment$b implements Runnable	// class@00185d
{
    public final Window b;
    public final ViewGroup c;

    public void AdUnionHalfFollowFragment$b(Window p0,ViewGroup p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, AdUnionHalfFollowFragment$b.class, "1")) {
          return;
       }
       if (this.c.getHeight() > 0) {
          this.b.setLayout(-1, this.c.getHeight());
       }
       PatchProxy.onMethodExit(AdUnionHalfFollowFragment$b.class, "1");
       return;
    }
}
