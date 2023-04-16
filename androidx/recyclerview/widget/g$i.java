package androidx.recyclerview.widget.g$i;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public class g$i	// class@000906
{
    public RecyclerView$ViewHolder a;
    public RecyclerView$ViewHolder b;
    public int c;
    public int d;
    public int e;
    public int f;

    public void g$i(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void g$i(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5){
       super(p0, p1);
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public String toString(){
       return "ChangeInfo{oldHolder="+this.a+", newHolder="+this.b+", fromX="+this.c+", fromY="+this.d+", toX="+this.e+", toY="+this.f+'}';
    }
}
