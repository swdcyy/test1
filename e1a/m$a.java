package e1a.m$a;
import fr6.e;
import e1a.l$a;
import java.lang.Object;
import wq6.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;

public class m$a implements e	// class@00204f
{
    public final l$a a;

    public void m$a(l$a p0){
       super();
       this.a = p0;
    }
    public void a(h p0,float p1,int p2){
       if (PatchProxy.isSupport(m$a.class) && PatchProxy.applyVoidThreeRefs(p0, Float.valueOf(p1), Integer.valueOf(p2), this, m$a.class, "1")) {
          return;
       }
       m$a ta = this.a;
       int i = (!p1 - 0x3f800000)? 0: 1;
       ta.onPageScrollStateChanged(i);
       return;
    }
}
