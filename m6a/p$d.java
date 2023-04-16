package m6a.p$d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class p$d	// class@002f5b
{
    public RecyclerView$ViewHolder a;
    public RecyclerView$ViewHolder b;
    public int c;
    public int d;
    public int e;
    public int f;

    public void p$d(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public String toString(){
       Object obj = PatchProxy.applyWithListener(null, this, p$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(p$d.class, "1");
       return "ChangeInfo{oldHolder="+this.a+", newHolder="+this.b+", fromX="+this.c+", fromY="+this.d+", toX="+this.e+", toY="+this.f+'}';
    }
}
