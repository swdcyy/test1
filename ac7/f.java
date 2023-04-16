package ac7.f;
import erd.o;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;
import brd.t;
import com.kwai.moved.components.util.KsAlbumPermissionUtils;
import zq8.a;

public final class f implements o	// class@0000a5
{
    public final FragmentActivity b;
    public final String c;

    public void f(FragmentActivity p0,String p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       f tc = this.c;
       p0 = (!p0.intValue())? KsAlbumPermissionUtils.d(tb, tc): t.just(new a("permissionString", false));
       return p0;
    }
}
