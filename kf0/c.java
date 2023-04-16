package kf0.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import gf0.a;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import qrd.l1;
import k2b.u1;

public final class c implements PopupInterface$h	// class@002d06
{
    public final TaskCommonParams b;

    public void c(TaskCommonParams p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       a a;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       a = a.a;
       String mActivityId = this.b.getMActivityId();
       String mTaskTypeId = this.b.getMTaskTypeId();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(mActivityId, mTaskTypeId, a, a.class, "6")) {
          ShowMetaData showMetaData = new ShowMetaData();
          showMetaData.setType(4);
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OP_ACTIVITY_NEW_TASK_PENDANT_POPUP";
          i3 oi3 = i3.f();
          oi3.d("activity_id", mActivityId);
          oi3.d("task_token", mTaskTypeId);
          uElementPack.params = oi3.e();
          showMetaData.setElementPackage(uElementPack);
          u1.B0(showMetaData);
       }
       return;
    }
    public void H(c p0,int p1){
       o.b(this, p0, p1);
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
