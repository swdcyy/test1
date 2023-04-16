package com.kuaishou.live.livestage.videopipe.renderarea.ui.OverlayBackgroundDecoration;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.drawable.Drawable;
import se3.e;
import com.kuaishou.live.livestage.videopipe.renderarea.ui.OverlayBackgroundDecoration$helper$1;
import msd.q;
import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup;

public class OverlayBackgroundDecoration extends RecyclerView$n	// class@000c10
{
    public final e a;
    public Drawable b;

    public void OverlayBackgroundDecoration(Drawable p0){
       super();
       this.b = p0;
       this.a = new e(new OverlayBackgroundDecoration$helper$1(this));
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, OverlayBackgroundDecoration.class, "1")) {
          return;
       }
       a.p(p0, "c");
       a.p(p1, "parent");
       a.p(p2, "state");
       this.a.a(p0, p1);
       return;
    }
}
