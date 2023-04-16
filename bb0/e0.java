package bb0.e0;
import erd.g;
import com.kuaishou.gifshow.smartalbum.ui.horizontal.e;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sa0.c;
import com.kuaishou.gifshow.smartalbum.logic.SmartAlbumManager;
import xa0.b;
import ra0.b;
import java.lang.StringBuilder;
import w46.b;
import java.lang.NullPointerException;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import fb0.l;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.u1;

public final class e0 implements g	// class@00025a
{
    public final e b;

    public void e0(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "4")) {
       }else {
          b uob = SmartAlbumManager.w0().n0(p0.longValue());
          if (uob == null) {
             Object[] objArray = new Object[0];
             b.D().t("SmartAlbumHorizontalListLoggerPresenter", "onClickItem: cant find this item maybe has been remove "+p0, objArray);
             ExceptionHandler.handleCaughtException(new NullPointerException("SmartAlbumHorizontalListLoggerPresenter onClickItem  cant find this "+p0));
          }else {
             p0 = l.b(uob);
             String str = l.n(tb.P8());
             if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(1), "CLICK_INTELLIGENT_ALBUM", str, p0, null, l.class, "4")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "CLICK_INTELLIGENT_ALBUM";
                uElementPack.params = str;
                u1.u(1, uElementPack, p0);
             }
          }
       }
       return;
    }
}
