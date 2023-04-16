package gg9.b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.permission.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.feature.post.api.util.PostPermission;

public final class b implements View$OnClickListener	// class@002474
{
    public final b b;

    public void b(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       tb.p2(PostPermission.CAMERA);
    }
}
