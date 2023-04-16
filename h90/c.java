package h90.c;
import java.util.Comparator;
import h90.d;
import java.lang.Object;
import com.kwai.video.clipkit.mv.EditorSdk2MvAsset;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$TimeRange;

public class c implements Comparator	// class@002110
{
    public final d b;

    public void c(d p0){
       this.b = p0;
       super();
    }
    public int compare(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          p0 = p0.getVisibleTimeRanges();
          p1 = p1.getVisibleTimeRanges();
          if (p0.size() <= 0 || p1.size() <= 0) {
             i = 0;
          }else if(p0.get(0).start() - p1.get(0).start() >= 0){
             i = 1;
          }else {
             i = -1;
          }
       }
       return i;
    }
}
