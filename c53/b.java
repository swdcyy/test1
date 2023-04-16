package c53.b;
import v32.a;
import com.kuaishou.live.bottombar.component.widget.view.LiveBottomBarPanelLandscapeBackgroundDrawable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import java.util.List;
import java.util.ArrayList;
import java.lang.Integer;
import ekd.j;

public class b extends a	// class@0004ce
{

    public void b(){
       super();
    }
    public LiveBottomBarPanelLandscapeBackgroundDrawable b(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int[] ointArray = new int[]{a1.a(0x7f06142e),a1.a(0x7f06142f),a1.a(0x7f061430),a1.a(0x7f061431),a1.a(0x7f061432)};
       return new LiveBottomBarPanelLandscapeBackgroundDrawable(ointArray, new float[5]{0,0x3da3d70a,0x3e2e147b,0x3e947ae1,0x3f800000});
    }
    public List k(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1015)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       obj.add(this.c());
       integerArray = new Integer[]{Integer.valueOf(1010)};
       obj.add(j.a(integerArray));
       obj.add(this.g());
       integerArray = new Integer[]{Integer.valueOf(1005)};
       obj.add(j.a(integerArray));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(1004)};
       obj.add(j.a(integerArray1));
       return obj;
    }
    public List l(){
       ArrayList obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       Integer[] integerArray = new Integer[]{Integer.valueOf(1013)};
       obj.add(j.a(integerArray));
       integerArray = new Integer[]{Integer.valueOf(1003)};
       obj.add(j.a(integerArray));
       obj.add(this.c());
       integerArray = new Integer[]{Integer.valueOf(1010)};
       obj.add(j.a(integerArray));
       obj.add(this.g());
       integerArray = new Integer[]{Integer.valueOf(1005)};
       obj.add(j.a(integerArray));
       Integer[] integerArray1 = new Integer[]{Integer.valueOf(1004)};
       obj.add(j.a(integerArray1));
       return obj;
    }
}
