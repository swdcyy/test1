package com.yxcorp.gifshow.camera.record.sidebar.j$b;
import android.animation.AnimatorListenerAdapter;
import com.yxcorp.gifshow.camera.record.sidebar.j;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.sidebar.HalfScrollView;
import com.yxcorp.gifshow.camera.record.sidebar.SidebarShaderLinearLayout;
import android.widget.ScrollView;

public class j$b extends AnimatorListenerAdapter	// class@000f1b
{
    public final int a;
    public final float b;
    public final j c;

    public void j$b(j p0,int p1,float p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("SidebarController", "foldAnimation onAnimationEnd iconNum:"+this.a, objArray);
       this.c.v2(true);
       j$b tc = this.c;
       if (tc.o != null) {
          tc.v.setHeight((((int)this.b - tc.F) + j.L));
          j b = this.c.B;
          if (b != null) {
             b.a(0);
          }
          this.c.v.requestLayout();
       }
       this.c.w2();
       return;
    }
    public void onAnimationStart(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j$b.class, "1")) {
          return;
       }
       this.c.v2(false);
       return;
    }
}
