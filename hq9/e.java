package hq9.e;
import erd.g;
import hq9.i;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import org.greenrobot.eventbus.a;
import cda.b;
import com.yxcorp.gifshow.entity.QPhoto;
import e17.i;

public final class e implements g	// class@002706
{
    public final i b;
    public final PhotoMeta c;

    public void e(i p0,PhotoMeta p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       tb.e(this.c, true);
       a.d().k(new b(tb.a, true));
       i.a(R.style.arg_RES_7f11066a, 0x7f10073a);
    }
}
