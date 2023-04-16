package fg0.j;
import yt5.f;
import fg0.j$a;
import nsd.u;
import java.lang.Object;
import fg0.j$b;
import ok.x;
import com.google.common.base.Suppliers;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import wkd.b;
import fg0.l;
import hg0.b;
import gg0.l;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import tkd.b;
import tkd.d;
import yt5.j;

public final class j implements f	// class@00232a
{
    public final x a;
    public static final j$a b;

    static {
       j.b = new j$a(null);
    }
    public void j(){
       super();
       this.a = Suppliers.a(j$b.b);
    }
    public void a(Activity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "feed");
       TaskCenterLogUtil b = TaskCenterLogUtil.b;
       TaskCenterLogUtil.d(b, "PhotoDetailTaskManagerImpl", "onPhotoPlay:"+p1.getId(), false, 4, null);
       b uob = b.a(-1524711258).D();
       if (!uob instanceof l) {
          return;
       }
       if (uob.j()) {
          TaskCenterLogUtil.e(b, "PhotoDetailTaskManagerImpl", "onPhotoPlay start timer failed, task is complete", false, 4, null);
          return;
       }else {
          uob.b(p1);
          return;
       }
    }
    public void b(Activity p0,BaseFeed p1){
       boolean b;
       j oj = j.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, oj, "3")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "feed");
       Object obj = this.a.get();
       a.o(obj, "mDisablePendantShowByGRVideo.get\(\)");
       if (obj.booleanValue()) {
          CommonMeta obj1 = PatchProxy.applyOneRefs(p1, this, oj, "4");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else {
             obj1 = p1.a(CommonMeta.class);
             b = (obj1 != null && obj1.mShowGrDetailPage != null)? true: false;
          }
          String str = "onPhotoPageSelected: ";
          if (b) {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "PhotoDetailTaskManagerImpl", str+p1.getId()+", isGrVideo true", false, 4, null);
             this.c(p0, p1);
             d.a(-1573231572).B3(p0, "isGrVideo");
          }else {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "PhotoDetailTaskManagerImpl", str+p1.getId()+", isGrVideo false", false, 4, null);
             d.a(-1573231572).P0(p0, "isGrVideo");
          }
       }
       return;
    }
    public void c(Activity p0,BaseFeed p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       a.p(p1, "feed");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "PhotoDetailTaskManagerImpl", "onPhotoPause:"+p1.getId(), false, 4, null);
       b uob = b.a(-1524711258).D();
       if (!uob instanceof l) {
          return;
       }
       uob.a(p1);
       return;
    }
}
