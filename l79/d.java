package l79.d;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.album.selected.AlbumSelectedContainer;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o79.d;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import java.lang.StringBuilder;
import g79.a;
import w69.x;
import q79.d;
import androidx.fragment.app.Fragment;
import kotlin.Pair;
import r79.a;
import w69.b;
import java.util.List;
import w69.f;
import java.util.Objects;
import com.yxcorp.gifshow.album.home.AlbumFragment;
import com.yxcorp.gifshow.album.IAlbumMainFragment$h;

public final class d extends m	// class@002cb9
{
    public final AlbumSelectedContainer c;

    public void d(AlbumSelectedContainer p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       ClientEvent$ElementPackage first;
       ClientEvent$UrlPackage obj1;
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.q(p0, "v");
       AlbumSelectedContainer h = this.c.H;
       d uod = d.class;
       String str = null;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(h), str, uod, "42")) {
          ClientEvent$ClickEvent uClickEvent = new ClientEvent$ClickEvent();
          first = new ClientEvent$ElementPackage();
          first.action2 = "CLICK_TO_PUBLISH";
          first.type = 1;
          obj1 = new ClientEvent$UrlPackage();
          uClickEvent.type = 1;
          uClickEvent.elementPackage = first;
          uClickEvent.contentPackage = new ClientContent$ContentPackage();
          uClickEvent.urlPackage = obj1;
          obj1.params = "task_id="+d.a;
          ClientEvent$ClickEvent urlPackage = uClickEvent.urlPackage;
          int i = (h != null)? 187: 313;
          urlPackage.page = i;
          a.c.f().e(uClickEvent);
       }
       Pair pair = AlbumSelectedContainer.g(this.c).U0(this.c.U);
       if (pair.getFirst() == null) {
          return;
       }else {
          String str1 = AlbumSelectedContainer.g(this.c).s0().b().a();
          if (str1 != null) {
             if (this.c.U.isAdded()) {
                str = str1;
             }
             if (str != null) {
             label_00af :
                Object obj = str;
                AlbumSelectedContainer u = this.c.U;
                first = pair.getFirst();
                if (first == null) {
                   a.L();
                }
                obj1 = first;
                boolean b = pair.getSecond().booleanValue();
                String str2 = AlbumSelectedContainer.g(this.c).s0().d().l();
                String str3 = AlbumSelectedContainer.g(this.c).s0().b().e();
                Objects.requireNonNull(u);
                if (PatchProxy.isSupport(AlbumFragment.class)) {
                   Object[] objArray = new Object[]{obj1,Boolean.valueOf(b),str2,str3,obj};
                   if (!PatchProxy.applyVoid(objArray, u, AlbumFragment.class, "49")) {
                   label_0119 :
                      a.q(obj1, "selectedList");
                      AlbumFragment j = u.J;
                      if (j != null) {
                         j.b(obj1, b, str2, str3, obj);
                      }
                   }
                }else {
                   goto label_0119 ;
                }
                return;
             }
          }
          str = "";
          goto label_00af ;
       }
    }
}
