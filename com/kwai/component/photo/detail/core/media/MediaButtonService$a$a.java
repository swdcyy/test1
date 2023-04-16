package com.kwai.component.photo.detail.core.media.MediaButtonService$a$a;
import android.support.v4.media.session.MediaSessionCompat$b;
import com.kwai.component.photo.detail.core.media.MediaButtonService$a;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.yxcorp.gifshow.util.rx.RxBus;
import be5.a;

public class MediaButtonService$a$a extends MediaSessionCompat$b	// class@000a31
{
    public final MediaButtonService$a f;

    public void MediaButtonService$a$a(MediaButtonService$a p0){
       this.f = p0;
       super();
    }
    public boolean b(Intent p0){
       KeyEvent obj = PatchProxy.applyOneRefs(p0, this, MediaButtonService$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = p0.getParcelableExtra("android.intent.extra.KEY_EVENT");
       if (obj == null) {
          return super.b(p0);
       }
       RxBus.f.b(new a(obj));
       return true;
    }
}
