package fg0.d;
import java.lang.Object;
import m56.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import wkd.b;
import fg0.l;
import hg0.b;
import gg0.j;
import m56.g;
import zt5.c;
import zt5.d;

public final class d	// class@002320
{
    public static boolean a;
    public static boolean b;
    public static final d c;

    static {
       d.c = new d();
    }
    public void d(){
       super();
    }
    public final void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       a.p(p0, "e");
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onBackground", false, 4, null);
       d.a = false;
       if (!d.b) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob instanceof j) {
          TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onBackground BrowsePageTask pauseTimer", false, 4, null);
          uob.u();
       }
       return;
    }
    public final void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       a.p(p0, "e");
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onForeground", false, 4, null);
       d.a = true;
       if (!d.b) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob instanceof j) {
          TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onForeground BrowsePageTask startTimer", false, 4, null);
          uob.v();
       }
       return;
    }
    public final void onTaskPendantHideEvent(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "3")) {
          return;
       }
       if (!d.b) {
          return;
       }
       d.b = false;
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onTaskPendantHideEvent", false, 4, null);
       b uob = b.a(-1524711258).D();
       if (uob instanceof j) {
          TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onTaskPendantHideEvent BrowsePageTask pauseTimer", false, 4, null);
          uob.u();
       }
       return;
    }
    public final void onTaskPendantShowEvent(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       if (d.b) {
          return;
       }
       d.b = true;
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onTaskPendantShowEvent", false, 4, null);
       if (!d.a) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob instanceof j) {
          TaskCenterLogUtil.d(b, "BrowsePageTaskManagerImpl", "onTaskPendantShowEvent BrowsePageTask startTimer", false, 4, null);
          uob.v();
       }
       return;
    }
}
