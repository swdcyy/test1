package com.yxcorp.gifshow.growth.publicdomainguide.c$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.growth.publicdomainguide.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Runnable;

public class c$a extends RecyclerView$r	// class@00148b
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       c$a uoa = c$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p1) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          if (layoutManage instanceof LinearLayoutManager) {
             uoa = this.a;
             if ((layoutManage.c() - uoa.C) >= uoa.A) {
                uoa.G.run();
                p0.removeOnScrollListener(this);
             }
          }
       }
       return;
    }
}
