package el9.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.presenter.global.a;
import java.lang.Object;
import java.util.Objects;
import o56.a;
import java.lang.String;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class b implements Runnable	// class@0021dc
{
    public final a b;

    public void b(a p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       Activity activity = tb.getActivity();
       d.a(-1712118428).ne(activity, tb.r.getFullSource(), "photo_comment", 10, a.B.getString(R.string.arg_RES_7f103077), tb.r.mEntity, null, null, null).h();
    }
}
