package com.yxcorp.gifshow.follow.stagger.selector.presenter.c$b;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import rja.c;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import o17.i;

public class c$b implements RefreshLayout$h	// class@00123f
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(float p0,float p1,boolean p2){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Boolean.valueOf(p2), this, c$b.class, "1")) {
          return;
       }
       c$b ta = this.a;
       ta.w = p0;
       if (!p0 && (ta.r.g() && this.a.q.Ac().isEnabled())) {
          this.a.q.Ac().setEnabled(false);
       }
    label_004b :
       return;
    }
    public void b(){
       i.d(this);
    }
    public void pullToRefresh(){
       i.b(this);
    }
    public void refreshComplete(){
       i.c(this);
    }
    public void releaseToRefresh(){
       i.e(this);
    }
}
