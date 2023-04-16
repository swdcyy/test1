package hl9.f0;
import java.lang.Runnable;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.Object;
import java.util.Objects;
import o56.a;
import java.lang.String;
import android.app.Application;
import tkd.b;
import tkd.d;
import ou5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;

public final class f0 implements Runnable	// class@0026cb
{
    public final e b;

    public void f0(e p0){
       this.b = p0;
    }
    public final void run(){
       f0 tb = this.b;
       Objects.requireNonNull(tb);
       GifshowActivity gifshowActiv = tb.c();
       d.a(-1712118428).ne(gifshowActiv, tb.b.getFullSource(), "photo_comment", 10, a.B.getString(R.string.arg_RES_7f103077), tb.b.mEntity, null, null, null).h();
    }
}
