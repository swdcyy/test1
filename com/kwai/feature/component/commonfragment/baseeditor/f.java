package com.kwai.feature.component.commonfragment.baseeditor.f;
import y8c.g;
import android.util.SparseBooleanArray;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import android.view.ViewGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.kwai.feature.component.commonfragment.baseeditor.f$a;
import ml8.c;
import g9c.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;

public class f extends g	// class@001200
{
    public BaseEditorFragment$b w;
    public SparseBooleanArray x;
    public boolean y;
    public static final int[] z;

    static {
       f.z = new int[5]{0x7f080deb,0x7f080dec,0x7f080ded,0x7f080dee,0x7f080def};
    }
    public void f(){
       super();
       this.x = new SparseBooleanArray();
       this.y = false;
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.k1(p0);
    }
    public f h1(ViewGroup p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d091f), new f$a(this));
    }
    public void k1(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.k1(p0);
       int adapterPosit = p0.getAdapterPosition();
       if (this.w != null && !this.x.get(adapterPosit)) {
          this.x.put(adapterPosit, true);
          this.w.b(adapterPosit, this.N0(adapterPosit));
       }
       return;
    }
    public void r1(BaseEditorFragment$b p0){
       this.w = p0;
    }
}
