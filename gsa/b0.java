package gsa.b0;
import gsa.b0$a;
import nsd.u;
import java.lang.String;
import java.lang.Class;
import com.kwai.kcube.TabIdentifier;
import java.lang.Object;
import on5.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.app.Activity;
import jb5.d;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import tkd.b;
import tkd.d;
import lv5.c;
import android.content.Intent;
import qvb.i;
import lv5.b;
import hn5.n;
import com.kwai.component.homepage_interface.pagelist.model.PhotoPage;

public final class b0	// class@002be0
{
    public final List a;
    public b0$b b;
    public final TabIdentifier c;
    public static final String d;
    public static final b0$a e;

    static {
       b0.e = new b0$a(null);
       b0.d = b0.class.getSimpleName();
    }
    public void b0(TabIdentifier p0){
       super();
       this.c = p0;
       TabIdentifier[] tabIdentifie = new TabIdentifier[]{b.b,b.c,b.d};
       this.a = CollectionsKt__CollectionsKt.L(tabIdentifie);
    }
    public final d a(int p0,Activity p1){
       i oi;
       b0 uob0 = b0.class;
       if (PatchProxy.isSupport(uob0)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob0, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       d uod = null;
       if (p0 == 2) {
          oi = d.a(-242212848).ua(p1.getIntent());
          if (oi instanceof d) {
             uod = oi;
          }
       }else {
          oi = d.a(-1883158055).c9(p0);
          if (oi instanceof d) {
             uod = oi;
          }
       }
       return uod;
    }
    public final PhotoPage b(int p0){
       PhotoPage photoPage;
       if (p0 != 2) {
          if (p0 != 3) {
             photoPage = (p0 != 4)? null: PhotoPage.CITY;
          }else {
             photoPage = PhotoPage.FOUND;
          }
       }else {
          photoPage = PhotoPage.FOLLOW;
       }
       return photoPage;
    }
}
