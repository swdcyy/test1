package com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$b;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$e;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AdtkHalfFrameLayout$b extends AdtkHalfFrameLayout$e	// class@00183f
{
    public final AdtkHalfFrameLayout b;

    public void AdtkHalfFrameLayout$b(AdtkHalfFrameLayout p0){
       this.b = p0;
       super(null);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$b.class, "2")) {
          return;
       }
       super.a(p0);
       this.b.setDragStatus(3);
       this.b.g(5);
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$b.class, "1")) {
          return;
       }
       super.b(p0);
       this.b.g(4);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$b.class, "3")) {
          return;
       }
       super.c(p0);
       this.b.setDragStatus(3);
       this.b.g(6);
       return;
    }
}
