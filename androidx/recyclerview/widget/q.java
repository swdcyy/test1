package androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.q$b;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.a0$d;
import java.lang.Object;
import androidx.recyclerview.widget.q$a;
import androidx.recyclerview.widget.c0$c;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.ViewGroup;

public class q	// class@00092f
{
    public final c0$c a;
    public final a0$d b;
    public final RecyclerView$Adapter c;
    public final q$b d;
    public int e;
    public RecyclerView$i f;

    public void q(RecyclerView$Adapter p0,q$b p1,c0 p2,a0$d p3){
       super();
       this.f = new q$a(this);
       this.c = p0;
       this.d = p1;
       this.a = p2.b(this);
       this.b = p3;
       this.e = p0.getItemCount();
       p0.F0(this.f);
    }
    public int a(){
       return this.e;
    }
    public long b(int p0){
       return this.b.a(this.c.d0(p0));
    }
    public int c(int p0){
       return this.a.a(this.c.f0(p0));
    }
    public void d(RecyclerView$ViewHolder p0,int p1){
       this.c.Z(p0, p1);
    }
    public RecyclerView$ViewHolder e(ViewGroup p0,int p1){
       return this.c.y0(p0, this.a.b(p1));
    }
}
