package com.yxcorp.gifshow.detail.fragments.milano.profile.i$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.fragments.milano.profile.i;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;

public class i$a extends RecyclerView$r	// class@00154f
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(i$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, i$a.class, "1")) {
          return;
       }
       if (!p1) {
          this.a.P8();
       }
       return;
    }
}
