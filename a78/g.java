package a78.g;
import a78.f;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import zi8.p;
import a78.a;
import a78.c;
import android.content.Context;
import a78.b;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import com.kwai.robust.PatchProxyResult;
import ok.o;
import com.google.common.collect.e;
import com.google.common.collect.e$a;
import a78.d;
import a78.e;

public class g	// class@000047
{
    public List a;
    public static x b;

    static {
       g.b = Suppliers.a(f.b);
    }
    public void g(){
       c uoc;
       c uoc1;
       b uob;
       List list = this;
       super();
       list.a = new ArrayList();
       if (PatchProxy.applyVoid(null, list, g.class, "2")) {
       }else {
          Application uApplication = p.a();
          a[] uoaArray = new a[]{v10,uoc,uoc1,uob,uob,uoc1,uoc1};
          uoc = new c("scope.userInfo", "scope.us.profile", uApplication.getString(0x7f103628), true, false);
          uoc1 = new c("scope.phone", "scope.us.phone", uApplication.getString(0x7f1035d9), true, true);
          uob = new b("scope.record", "scope.ul.record", uApplication.getString(0x7f103626), uApplication.getString(0x7f103627), false, false);
          b uob1 = new b("scope.camera", "scope.ul.camera", uApplication.getString(0x7f103624), uApplication.getString(0x7f10362e), false, false);
          b uob2 = new b("scope.userLocation", "scope.ul.location", uApplication.getString(0x7f103569), uApplication.getString(0x7f103625), true, false);
          uob = new b("scope.userLocationBackground", "scope.ul.locationBackground", "", "", false, true);
          uob = new b("scope.writePhotosAlbum", "scope.ul.album", uApplication.getString(0x7f103623), uApplication.getString(0x7f1035fe), 0, false);
          list.a.addAll(Arrays.asList(uoaArray));
       }
       return;
    }
    public static g a(){
       Object obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.b.get();
    }
    public final a b(o p0){
       a e;
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Collection uCollection = e.c(this.a, p0);
       e = (uCollection.isEmpty())? a.e: new ArrayList(uCollection).get(0);
       return e;
    }
    public a c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(new d(p0));
    }
    public a d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, g.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b(new e(p0));
    }
}
