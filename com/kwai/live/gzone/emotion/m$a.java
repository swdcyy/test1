package com.kwai.live.gzone.emotion.m$a;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kwai.live.gzone.emotion.m;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.live.gzone.emotion.k;
import lnc.a1;

public class m$a extends RecyclerView$n	// class@000cea
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, m$a.class, "1")) {
          return;
       }
       if (this.a.x.f0(p2.getChildAdapterPosition(p1)) == 2) {
          p0.bottom = a1.e(9.00f);
          p0.top = a1.e(16.00f);
          p0.left = a1.e(16.00f);
          return;
       }else {
          p0.bottom = a1.e(10.00f);
          return;
       }
    }
}
