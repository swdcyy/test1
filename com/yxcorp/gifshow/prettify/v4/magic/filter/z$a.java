package com.yxcorp.gifshow.prettify.v4.magic.filter.z$a;
import androidx.recyclerview.widget.RecyclerView$i;
import com.yxcorp.gifshow.prettify.v4.magic.filter.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import android.view.View;
import com.yxcorp.utility.n;

public class z$a extends RecyclerView$i	// class@0011d7
{
    public final z a;

    public void z$a(z p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, z$a.class, "1")) {
          return;
       }
       this.n();
       return;
    }
    public void l(int p0,int p1){
       if (PatchProxy.isSupport(z$a.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, z$a.class, "2")) {
          return;
       }
       this.n();
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, z$a.class, "3")) {
          return;
       }
       z$a ta = this.a;
       z b = ta.B;
       int i = (ta.a9() && !this.a.F.getItemCount())? 0: 8;
       n.Y(b, i, false);
       return;
    }
}
