package gg9.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.feature.post.api.util.PostPermission;

public final class g implements View$OnClickListener	// class@002479
{
    public final b b;

    public void g(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       tb.p2(PostPermission.AUDIO);
    }
}
