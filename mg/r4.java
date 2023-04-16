package mg.r4;
import erd.g;
import android.app.Activity;
import n3d.a;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.kwai.gifshow.post.api.core.model.TakePictureType;
import java.lang.String;
import android.content.Intent;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class r4 implements g	// class@002659
{
    public final Activity b;
    public final a c;

    public void r4(Activity p0,a p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       r4 tb = this.b;
       r4 tc = this.c;
       p0 = p0.iz(tb, TakePictureType.SHOOT_IMAGE, null);
       if (tb instanceof GifshowActivity) {
          tb.t1(p0, 6, tc);
       }
       return;
    }
}
