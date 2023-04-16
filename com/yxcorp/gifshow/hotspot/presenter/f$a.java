package com.yxcorp.gifshow.hotspot.presenter.f$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.hotspot.presenter.f;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class f$a extends RecyclerView$r	// class@0018ea
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f$a.class, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       this.a.P8();
       return;
    }
}
