package nz9.g0;
import java.lang.Runnable;
import nz9.z0;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import e95.e;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.kwai.component.fansgroup.FansGroupParams;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.component.fansgroup.FansGroupSourceType;
import com.kwai.component.fansgroup.FansGroupHelper;

public final class g0 implements Runnable	// class@003220
{
    public final z0 b;

    public void g0(z0 p0){
       this.b = p0;
    }
    public final void run(){
       e a;
       g0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, z0.class, "24")) {
       }else {
          boolean fansGroupV2J = tb.u.getUser().getFansGroupV2JoinedState();
          z0 u = tb.u;
          if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidThreeRefs(Boolean.TRUE, Boolean.valueOf(fansGroupV2J), u, null, e.class, "7")) {
             a.p(u, "photo");
             a = e.a;
             ClientEvent$ElementPackage uElementPack = a.d(true, fansGroupV2J);
             uElementPack.action2 = "FANS_GROUP_ICON_CLICK";
             u1.u(true, uElementPack, a.c(u));
          }
          FansGroupHelper.e(new FansGroupParams().setHasJoinedFansGroup(tb.u.getUser().getFansGroupV2JoinedState()).setActivity(tb.C).setAuthorUser(tb.u.getUser()).setExpTag(tb.u.getExpTag()).setPhoto(tb.u).setSource(FansGroupSourceType.FEED));
       }
       return;
    }
}
