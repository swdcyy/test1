package jg9.i0;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$c;
import java.lang.Double;
import java.lang.Comparable;
import xrd.b;

public final class i0 implements Comparator	// class@002a9c
{

    public void i0(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, i0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return b.f(Double.valueOf(p1.a()), Double.valueOf(p0.a()));
    }
}
