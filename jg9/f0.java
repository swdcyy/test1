package jg9.f0;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class f0 implements Comparator	// class@002a96
{

    public void f0(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Integer.valueOf(p0.b()), Integer.valueOf(p1.b()));
    }
}
