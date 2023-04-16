package c9c.a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.c;
import java.util.List;
import java.util.Iterator;

public final class a	// class@000560
{

    public void a(){
       super();
    }
    public void a(Fragment p0,int p1,int p2,Intent p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, a.class, "2")) {
          return;
       }
       c childFragmen = p0.getChildFragmentManager();
       if (childFragmen != null) {
          List fragments = childFragmen.getFragments();
          if (fragments != null && !fragments.isEmpty()) {
             Iterator iterator = fragments.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (uFragment != null && (uFragment.isAdded() && !uFragment.isRemoving())) {
                   uFragment.onActivityResult(p1, p2, p3);
                }
             }
          }
       }
       return;
    }
    public void b(Fragment p0,int p1,String[] p2,int[] p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a.class, "1")) {
          return;
       }
       List fragments = p0.getChildFragmentManager().getFragments();
       if (fragments != null) {
          Iterator iterator = fragments.iterator();
          while (iterator.hasNext()) {
             Fragment uFragment = iterator.next();
             if (uFragment != null) {
                uFragment.onRequestPermissionsResult(p1, p2, p3);
             }
          }
       }
       return;
    }
}
