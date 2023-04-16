package gx9.l$a;
import java.util.Comparator;
import java.lang.Object;
import com.kwai.component.tabs.panel.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class l$a implements Comparator	// class@0024fd
{

    public void l$a(){
       super();
    }
    public int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, l$a.class, "1");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): p0.f() - p1.f();
       return i;
    }
}
