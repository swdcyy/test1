package hq9.d;
import erd.g;
import hq9.i;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import org.greenrobot.eventbus.a;
import cda.b;

public final class d implements g	// class@002705
{
    public final i b;

    public void d(i p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (tb.a.getPhotoMeta() != null) {
          tb.e(tb.a.getPhotoMeta(), false);
       }
       a.d().k(new b(tb.a, 2));
       return;
    }
}
