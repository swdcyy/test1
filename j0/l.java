package j0.l;
import aegon.chrome.net.n;
import java.lang.String;
import java.util.Collection;
import aegon.chrome.net.n$b;
import aegon.chrome.net.r;
import aegon.chrome.net.CronetException;
import java.util.List;
import java.util.Collections;

public class l extends n	// class@00199b
{
    public final String a;
    public final Collection b;
    public final n$b c;
    public final int d;
    public final r e;
    public final CronetException f;

    public void l(String p0,Collection p1,n$b p2,int p3,r p4,CronetException p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
    }
    public Collection a(){
       l tb = this.b;
       if (tb == null) {
          tb = Collections.emptyList();
       }
       return tb;
    }
    public CronetException b(){
       return this.f;
    }
    public int c(){
       return this.d;
    }
    public n$b d(){
       return this.c;
    }
    public r e(){
       return this.e;
    }
    public String f(){
       return this.a;
    }
}
