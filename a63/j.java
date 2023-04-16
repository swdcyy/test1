package a63.j;
import erd.o;
import com.kuaishou.live.gzone.v2.imagepreview.n;
import java.lang.String;
import java.lang.Object;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Boolean;

public final class j implements o	// class@00005a
{
    public final n b;

    public void j(n p0,String p1){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Boolean.valueOf(PermissionUtils.a(this.b.x, "android.permission.WRITE_EXTERNAL_STORAGE"));
    }
}
