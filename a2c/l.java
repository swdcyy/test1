package a2c.l;
import erd.g;
import com.yxcorp.gifshow.profile.background.ProfileBackgroundPublishManager;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import exc.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import fjd.b;
import jb6.d;
import com.yxcorp.retrofit.idc.models.Host;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.ArrayList;
import ekd.j;
import a2c.j;
import a2c.k;
import exc.l$e;
import exc.l$a;
import exc.l$c;

public final class l implements g	// class@000049
{
    public final ProfileBackgroundPublishManager b;
    public final File c;
    public final String d;

    public void l(ProfileBackgroundPublishManager p0,File p1,String p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, l.class, "1")) {
       }else {
          a.p(obj, "publishPlugin");
          this.b.e();
          String[] stringArray = new String[]{"https://"+d.a().c("zhongtai")};
          p0 = new String[]{this.c.getAbsolutePath()};
          p0 = j.a(p0);
          a.o(p0, "ArrayUtil.asArrayList\(background.absolutePath\)");
          l td = this.d;
          a.o(td, "bizCustomParam");
          obj.DF("USER_BACKGROUND", CollectionsKt__CollectionsKt.P(stringArray), 0x300000, p0, td, new j(), new k(this), null, null, null).onStart();
       }
       return;
    }
}
