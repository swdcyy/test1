package fy8.c;
import androidx.lifecycle.ViewModelProvider$Factory;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import fy8.c$a;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import androidx.lifecycle.ViewModel;
import java.lang.IllegalArgumentException;

public class c implements ViewModelProvider$Factory	// class@0023a1
{
    public Map a;

    public void c(){
       super();
       this.a = new HashMap();
    }
    public c a(Class p0,c$a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.put(p0, p1);
       return this;
    }
    public ViewModel create(Class p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.containsKey(p0)) {
          return this.a.get(p0).create();
       }
       throw new IllegalArgumentException("Donot Use AwardVideoViewModelFactory to create");
    }
}
