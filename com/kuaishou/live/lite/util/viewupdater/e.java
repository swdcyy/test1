package com.kuaishou.live.lite.util.viewupdater.e;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.kuaishou.live.lite.util.viewupdater.f;
import com.kuaishou.live.lite.util.viewupdater.d$b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import vd3.f;
import java.lang.Runnable;
import vd3.g;

public class e implements ViewGroup$OnHierarchyChangeListener	// class@000bae
{
    public final d$b b;
    public final f c;

    public void e(f p0,d$b p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onChildViewAdded(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "1")) {
          return;
       }
       this.b.b(new f(this, p1), this.c.d);
       return;
    }
    public void onChildViewRemoved(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, e.class, "2")) {
          return;
       }
       this.b.b(new g(this, p1), this.c.d);
       return;
    }
}
