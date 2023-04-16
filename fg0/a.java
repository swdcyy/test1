package fg0.a;
import yt5.a;
import fg0.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import fg0.l;
import hg0.b;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import gg0.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import yt5.i;
import android.app.Activity;
import java.lang.Integer;
import java.lang.StringBuilder;
import ig0.e;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;

public final class a implements a	// class@00231d
{
    public TaskCommonParams a;
    public boolean b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(){
       super();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "5")) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob != null && this.a != null) {
          a ta = this.a;
          a.m(ta);
          if (!TextUtils.n(uob.g().getMTaskToken(), ta.getMTaskToken())) {
             return;
          }else if(!uob instanceof a){
             return;
          }else {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BehindTaskManagerImpl", "forceCompleteTask\(\) called", false, 4, null);
             if (!PatchProxy.applyVoid(objArray, uob, a.class, "4")) {
                uob.n = true;
                uob.v();
             }
          }
       }
       return;
    }
    public void b(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob != null) {
          uob.o = p0;
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BehindTaskManagerImpl", "stopTask\(\) called", false, 4, null);
       a ta = this.a;
       a.m(ta);
       b.a(-1524711258).k2(ta);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob != null && this.a != null) {
          a ta = this.a;
          a.m(ta);
          if (!TextUtils.n(uob.g().getMTaskToken(), ta.getMTaskToken())) {
             return;
          }else if(!uob instanceof a){
             return;
          }else {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BehindTaskManagerImpl", "pauseTimer\(\) called", false, 4, null);
             uob.u();
          }
       }
       return;
    }
    public void e(Activity p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BehindTaskManagerImpl", "initTask\(\) called with: activity = [ "+p0+" ], page = [ "+p1+" ], page2 = [ "+p2+" ], "+"taskParams = [ "+p3+" ]", false, 4, null);
       TaskCommonParams taskCommonPa = (TextUtils.x(p3))? e.c(p0): e.d(p3);
       this.a = taskCommonPa;
       if (taskCommonPa == null) {
          return;
       }else {
          a.m(taskCommonPa);
          if (!taskCommonPa.getMActivityTask()) {
             return;
          }else if(this.b != null){
             return;
          }else {
             a ta = this.a;
             a.m(ta);
             ta.setMIsUseBehind(true);
             ta = this.a;
             a.m(ta);
             ta.setMIsMiniGame(true);
             this.b = true;
             int i = -1524711258;
             a ta1 = this.a;
             a.m(ta1);
             b.a(i).h2(ta1);
             if (p0 instanceof RxFragmentActivity) {
                b.a(i).C(p0, p1, p2, null);
             }
             return;
          }
       }
    }
    public void startTimer(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       b uob = b.a(-1524711258).D();
       if (uob != null && this.a != null) {
          a ta = this.a;
          a.m(ta);
          if (!TextUtils.n(uob.g().getMTaskToken(), ta.getMTaskToken())) {
             return;
          }else if(!uob instanceof a){
             return;
          }else if(uob.j()){
             TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BehindTaskManagerImpl", "start timer failed, task is complete", false, 4, null);
             return;
          }else {
             TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BehindTaskManagerImpl", "startTimer\(\) called", false, 4, null);
             uob.w();
          }
       }
       return;
    }
}
