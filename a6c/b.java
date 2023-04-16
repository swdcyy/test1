package a6c.b;
import erd.g;
import com.yxcorp.gifshow.profile.viewer.ProfilePhotoViewListFragment$a;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import java.lang.String;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class b implements g	// class@000087
{
    public final ProfilePhotoViewListFragment$a b;

    public void b(ProfilePhotoViewListFragment$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       a uoa = new a(null, 0x320ce, null, null, 0, 0);
       tb.k(true, new KwaiException(v11));
       ExceptionHandler.handleException(a.B, p0);
    }
}
