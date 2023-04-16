package androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.ConcatAdapter$Config;
import java.util.List;
import androidx.recyclerview.widget.e;
import java.util.Iterator;
import java.lang.Object;
import java.util.Arrays;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

public final class ConcatAdapter extends RecyclerView$Adapter	// class@00086c
{
    public final e e;

    public void ConcatAdapter(ConcatAdapter$Config p0,List p1){
       super();
       this.e = new e(this, p0);
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          this.J0(iterator.next());
       }
       this.G0(this.e.t());
       return;
    }
    public void ConcatAdapter(ConcatAdapter$Config p0,RecyclerView$Adapter[] p1){
       super(p0, Arrays.asList(p1));
    }
    public void ConcatAdapter(List p0){
       super(ConcatAdapter$Config.c, p0);
    }
    public void ConcatAdapter(RecyclerView$Adapter[] p0){
       super(ConcatAdapter$Config.c, p0);
    }
    public boolean A0(RecyclerView$ViewHolder p0){
       return this.e.A(p0);
    }
    public void B0(RecyclerView$ViewHolder p0){
       this.e.B(p0);
    }
    public void D0(RecyclerView$ViewHolder p0){
       this.e.C(p0);
    }
    public void E0(RecyclerView$ViewHolder p0){
       this.e.D(p0);
    }
    public boolean J0(RecyclerView$Adapter p0){
       return this.e.i(p0);
    }
    public void K0(RecyclerView$Adapter$StateRestorationPolicy p0){
       this.H0(p0);
    }
    public int c0(RecyclerView$Adapter p0,RecyclerView$ViewHolder p1,int p2){
       return this.e.q(p0, p1, p2);
    }
    public long d0(int p0){
       return this.e.o(p0);
    }
    public int f0(int p0){
       return this.e.p(p0);
    }
    public int getItemCount(){
       return this.e.r();
    }
    public void u0(RecyclerView p0){
       this.e.w(p0);
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       this.e.x(p0, p1);
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       return this.e.y(p0, p1);
    }
    public void z0(RecyclerView p0){
       this.e.z(p0);
    }
}
