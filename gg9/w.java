package gg9.w;
import erd.o;
import com.yxcorp.gifshow.camera.record.permission.c;
import java.lang.Object;
import lnc.s6;
import com.kwai.feature.post.api.util.PostPermission;
import android.app.Activity;
import brd.t;
import com.kwai.feature.post.api.util.PostPermissionUtils;
import com.tbruyelle.rxpermissions2.g;
import java.lang.String;
import com.yxcorp.gifshow.util.PermissionUtils;

public final class w implements o	// class@002489
{
    public final c b;

    public void w(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = this.b;
       p0.b(949);
       if (s6.x() == 2) {
          p0.i = true;
          p0 = PostPermissionUtils.d(p0.l, PostPermission.CAMERA);
       }else {
          p0 = PermissionUtils.g(p0.k, p0.l, "android.permission.CAMERA");
       }
       return p0;
    }
}
