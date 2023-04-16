package g22.d;
import androidx.viewpager.widget.ViewPager$l;
import com.kuaishou.live.core.show.activitydialog.LiveActivityBottomDialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.live.core.show.activitydialog.c;
import androidx.fragment.app.Fragment;
import com.kwai.kds.krn.api.page.KwaiRnFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import js6.a;
import g22.f;

public class d extends ViewPager$l	// class@002a46
{
    public final LiveActivityBottomDialog b;

    public void d(LiveActivityBottomDialog p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uod, "1")) {
          return;
       }
       uod = this.b;
       uod.J = p0;
       uod.Eh(p0);
       d tb = this.b;
       LiveActivityBottomDialog j = tb.J;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(LiveActivityBottomDialog.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(j), tb, LiveActivityBottomDialog.class, "4")) {
          int i = 0;
          while (i < tb.I.j()) {
             Fragment uFragment = tb.I.z(i);
             if (uFragment instanceof KwaiRnFragment) {
                b.B(LiveLogTag.LIVE_ACTIVITY_DIALOG, "postPageSelectedEvent index is "+j+" , fragment index is "+i);
                a.b.X8(uFragment, "LiveActivityDialogPageSelectedEvent", new f(j));
             }
             i = i + 1;
          }
       }
       return;
    }
}
