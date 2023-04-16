package pn9.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import pn9.g$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nn9.b;
import java.util.List;

public abstract class a extends RecyclerView$ViewHolder	// class@003531
{
    public View a;
    public View b;
    public View c;
    public g$a d;
    public final View e;

    public void a(View p0){
       a.p(p0, "mItemView");
       super(p0);
       this.e = p0;
    }
    public void a(g$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.d = p0;
       this.a = this.e.findViewById(this.c());
       this.b = this.e.findViewById(this.d());
       this.c = this.e.findViewById(this.b());
       return;
    }
    public int b(){
       return -1;
    }
    public int c(){
       return -1;
    }
    public int d(){
       return -1;
    }
    public void e(View p0,int p1){
    }
    public abstract void f(b p0,b p1);
    public void g(b p0,b p1,List p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "3")) {
          return;
       }
       a.p(p1, "newState");
       a.p(p2, "payloads");
       this.f(p0, p1);
       return;
    }
}
