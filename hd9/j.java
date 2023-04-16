package hd9.j;
import erd.g;
import com.yxcorp.gifshow.camera.record.followshoot.b;
import java.lang.Object;
import ed9.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import u8c.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public final class j implements g	// class@002617
{
    public final b b;

    public void j(b p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       if (!TextUtils.x(tb.J)) {
          p0 = tb.I;
          if (!PatchProxy.applyVoidOneRefs(p0, null, a.class, "1")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$PhotoPackage photoPackage = w1.f(p0);
             photoPackage.type = r1.S1(p0).toInt();
             uContentPack.referPhotoPackage = photoPackage;
             p0 = new ClientEvent$ElementPackage();
             p0.action = 476;
             p0.name = "small_content";
             u1.u(1, p0, uContentPack);
          }
       }
       return;
    }
}
