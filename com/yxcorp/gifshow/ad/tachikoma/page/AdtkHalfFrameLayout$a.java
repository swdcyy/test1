package com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$a;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout$e;
import com.yxcorp.gifshow.ad.tachikoma.page.AdtkHalfFrameLayout;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class AdtkHalfFrameLayout$a extends AdtkHalfFrameLayout$e	// class@00183e
{
    public final AdtkHalfFrameLayout b;

    public void AdtkHalfFrameLayout$a(AdtkHalfFrameLayout p0){
       this.b = p0;
       super(null);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$a.class, "2")) {
          return;
       }
       super.a(p0);
       this.b.setDragStatus(1);
       this.b.g(2);
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$a.class, "1")) {
          return;
       }
       super.b(p0);
       this.b.g(1);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdtkHalfFrameLayout$a.class, "3")) {
          return;
       }
       super.c(p0);
       this.b.setDragStatus(1);
       this.b.g(3);
       return;
    }
}
