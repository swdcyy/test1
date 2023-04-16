package acd.h;
import java.lang.Runnable;
import com.yxcorp.plugin.search.module.a;
import com.yxcorp.plugin.search.module.ModuleResponse;
import java.lang.Object;

public final class h implements Runnable	// class@0000d3
{
    public final a b;
    public final ModuleResponse c;

    public void h(a p0,ModuleResponse p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       this.b.r(this.c);
    }
}
