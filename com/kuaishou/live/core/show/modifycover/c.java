package com.kuaishou.live.core.show.modifycover.c;
import erd.g;
import com.kuaishou.live.core.show.modifycover.b;
import java.lang.Object;
import com.kuaishou.live.core.show.model.LiveFreshAuthorResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.app.Activity;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import d61.z;
import lc2.k;

public class c implements g	// class@000d1d
{
    public final b b;

    public void c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(p0.mFreshAuthor != null && (PermissionUtils.a(this.b.f.getApplicationContext(), "android.permission.CAMERA") && (PermissionUtils.a(this.b.f.getApplicationContext(), "android.permission.RECORD_AUDIO") && (z.a() != LiveStreamStatus.LOCKED && z.a() != LiveStreamStatus.FORCE_REQUEST_PERMISSION)))){
          this.b.e.a(p0);
       }
    label_0048 :
       return;
    }
}
