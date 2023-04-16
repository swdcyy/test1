package nz9.j;
import erd.g;
import nz9.z0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import o56.a;
import uw9.c;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;

public final class j implements g	// class@00322b
{
    public final z0 b;

    public void j(z0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, z0.class, "30")) {
       }else {
          p0 = new ClientEvent$ElementPackage();
          p0.action2 = "RECOMMEND_FAVORITE_BUBBLE";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tb.u.mEntity);
          u1.u0(7, p0, uContentPack);
       }
       SharedPreferences$Editor uEditor = c.a.edit();
       uEditor.putInt("specialFocusBubbleShowVersion", a.q);
       g.a(uEditor);
       return;
    }
}
