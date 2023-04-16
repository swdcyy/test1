package bg8.f;
import java.lang.Runnable;
import com.mini.packagemanager.PackageUpdateManagerImpl;
import java.lang.Object;
import ph8.c;
import java.lang.String;
import java.util.Objects;
import com.mini.packagemanager.model.BaseFileModel;
import z1.e;
import og8.c;
import com.mini.packagemanager.model.PackageLifecycleItem;
import java.util.List;
import java.util.Collections;
import og8.a;

public final class f implements Runnable	// class@000351
{
    public final PackageUpdateManagerImpl b;
    public final Object c;
    public final c d;
    public final String e;

    public void f(PackageUpdateManagerImpl p0,Object p1,c p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void run(){
       f tb = this.b;
       f tc = this.c;
       Objects.requireNonNull(tb);
       e uoe = c.a(tc);
       PackageLifecycleItem packageLifec = new PackageLifecycleItem(this.d.r, tc.versionCode, tc.versionName, uoe.a, uoe.b, "Download", this.e);
       tb.s.a(Collections.singletonList(v11));
    }
}
