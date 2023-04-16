package com.yxcorp.gifshow.activity.share.presenter.m2$f;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.activity.share.presenter.m2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.yxcorp.gifshow.activity.share.widget.DragPreviewContainer;

public class m2$f extends RecyclerView$r	// class@001408
{
    public final RecyclerView a;
    public final m2 b;

    public void m2$f(m2 p0,RecyclerView p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(m2$f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, m2$f.class, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       if (this.a.canScrollVertically(-1)) {
          this.b.s.setCanIntercept(false);
       }else {
          this.b.s.setCanIntercept(true);
       }
       return;
    }
}
