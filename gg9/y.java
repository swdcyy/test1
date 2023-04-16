package gg9.y;
import erd.o;
import com.yxcorp.gifshow.camera.record.permission.c;
import java.lang.Object;
import com.kwai.feature.post.api.util.PostPermission;
import java.util.ArrayList;
import ekd.j;
import android.app.Activity;
import java.util.List;
import brd.t;
import com.kwai.feature.post.api.util.PostPermissionUtils;

public final class y implements o	// class@00248b
{
    public final c b;

    public void y(c p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = this.b;
       p0.b(1669);
       PostPermission[] postPermissi = new PostPermission[]{PostPermission.CAMERA,PostPermission.AUDIO};
       return PostPermissionUtils.e(p0.l, j.a(postPermissi), 1);
    }
}
