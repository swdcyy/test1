package f69.e;
import erd.g;
import f69.s;
import java.lang.Object;
import com.yxcorp.gifshow.data.FriendPhotoClapResponse;
import java.util.Objects;
import e17.i;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.FriendClap;

public final class e implements g	// class@0022b4
{
    public final s b;

    public void e(s p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       i.a(R.style.arg_RES_7f11066a, 0x7f1048cd);
       p0.mCanClap = true;
       tb.b9();
    }
}
