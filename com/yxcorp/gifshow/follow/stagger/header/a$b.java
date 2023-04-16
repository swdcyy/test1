package com.yxcorp.gifshow.follow.stagger.header.a$b;
import erd.g;
import com.yxcorp.gifshow.follow.stagger.header.a;
import java.util.List;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aha.c;
import g9c.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import z0b.b;
import nl8.a;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.follow.stagger.header.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class a$b implements g	// class@0011ad
{
    public final a b;
    public final List c;

    public void a$b(a p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$b.class, "1")) {
       }else {
          this.b.F.a();
          p0 = this.b.z;
          if (p0 != null) {
             p0.W0(this.c);
          }
          p0 = this.b.z;
          if (p0 != null) {
             p0.k0();
          }
          p0 = this.b.P8();
          a.o(p0, "fragment");
          p0.h0().post(new b(this));
       }
       return;
    }
}
