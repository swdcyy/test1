package gg9.t;
import erd.g;
import com.yxcorp.gifshow.camera.record.permission.c;
import java.lang.Object;
import zq8.a;
import java.util.Objects;
import com.kwai.feature.post.api.util.PostPermission;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class t implements g	// class@002486
{
    public final c b;

    public void t(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (TextUtils.n(PostPermission.CAMERA.mName, p0.a)) {
          tb.i = true;
       }else if(TextUtils.n(PostPermission.AUDIO.mName, p0.a)){
          tb.j = true;
       }
       tb.d(false, false);
       return;
    }
}
