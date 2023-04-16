package com.yxcorp.gifshow.follow.stagger.header.a$d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.stagger.header.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class a$d extends RecyclerView$r	// class@0011af
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$d uod = a$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1) {
          return;
       }
       this.a.b9();
       return;
    }
}
