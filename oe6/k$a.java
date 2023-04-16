package oe6.k$a;
import vid.d$a;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import z1.e;

public class k$a implements d$a	// class@002019
{
    public List a;

    public void k$a(){
       super();
       this.a = Collections.synchronizedList(new ArrayList());
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a.class, "1")) {
          return;
       }
       this.a.add(new e(p0, p1));
       return;
    }
}
