package com.yxcorp.gifshow.detail.fragments.milano.profile.l$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.fragments.milano.profile.l;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;

public class l$a extends RecyclerView$r	// class@001554
{
    public final l a;

    public void l$a(l p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       l$a uoa = l$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!p1) {
          LinearLayoutManager layoutManage = this.a.q.getLayoutManager();
          if (!layoutManage.i0()) {
             View view = layoutManage.findViewByPosition(0);
             if (view != null) {
                uoa = this.a;
                if ((- view.getTop()) != uoa.t) {
                   uoa.t = - view.getTop();
                   this.a.Y8();
                }
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(l$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, l$a.class, "1")) {
          return;
       }
       l$a ta = this.a;
       ta.t = ta.t + p2;
       ta.Y8();
       return;
    }
}
