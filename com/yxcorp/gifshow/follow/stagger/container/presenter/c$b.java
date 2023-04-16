package com.yxcorp.gifshow.follow.stagger.container.presenter.c$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.stagger.container.presenter.c;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.content.Context;
import android.view.ViewGroup;
import com.kwai.component.photo.reduce.g;
import java.util.Iterator;
import java.util.Set;

public class c$b extends RecyclerView$r	// class@00115f
{
    public final c a;

    public void c$b(c p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       if (!PatchProxy.applyVoidOneRefs(p0, uob, c.class, "2")) {
          g.a(p0.getContext());
       }
       Iterator iterator = this.a.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, c$b.class, "2")) {
          return;
       }
       Iterator iterator = this.a.t.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(p0, p1, p2);
       }
       return;
    }
}
