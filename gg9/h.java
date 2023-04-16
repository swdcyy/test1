package gg9.h;
import com.yxcorp.gifshow.bubble.b$c;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.camera.record.base.d;
import com.kwai.feature.post.api.util.PostPermission;
import android.content.Context;
import com.kwai.feature.post.api.util.PostPermissionUtils;

public final class h implements b$c	// class@00247a
{
    public final b a;

    public void h(b p0){
       this.a = p0;
    }
    public final boolean c(){
       h ta = this.a;
       b o = ta.o;
       boolean b = (o != null && (o.c() && (!ta.m2() && !PostPermissionUtils.c(ta.e, PostPermission.ALBUM))))? true: false;
       return b;
    }
}
