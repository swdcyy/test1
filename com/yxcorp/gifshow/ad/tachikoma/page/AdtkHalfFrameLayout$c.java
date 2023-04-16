package com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$c;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$e;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AdtkHalfFrameLayout$c extends AdtkHalfFrameLayout$e	// class@001840
{
    public final AdtkHalfFrameLayout b;

    public void AdtkHalfFrameLayout$c(AdtkHalfFrameLayout p0){
       this.b = p0;
       super(null);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$c.class, "2")) {
          return;
       }
       super.a(p0);
       this.b.setDragStatus(5);
       this.b.g(8);
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$c.class, "1")) {
          return;
       }
       super.b(p0);
       this.b.g(7);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$c.class, "3")) {
          return;
       }
       super.c(p0);
       this.b.setDragStatus(5);
       this.b.g(9);
       return;
    }
}
