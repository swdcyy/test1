package com.kwai.component.photo.reduce.e$b;
import android.animation.AnimatorListenerAdapter;
import com.kwai.component.photo.reduce.e;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class e$b extends AnimatorListenerAdapter	// class@000ae1
{
    public final int a;
    public final e b;

    public void e$b(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onAnimationCancel(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "2")) {
          return;
       }
       p0.height = this.a;
       this.b.p.requestLayout();
       return;
    }
    public void onAnimationEnd(Animator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       p0.height = this.a;
       this.b.p.requestLayout();
       return;
    }
}
