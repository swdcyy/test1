package fna.d;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.growth.cleaner.impl.CleanerWhiteListItem;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class d implements Comparator	// class@002977
{

    public void d(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.version), Integer.valueOf(p1.version));
    }
}
