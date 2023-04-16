package ced.b;
import n3d.a;
import com.yxcorp.plugin.search.result.hashtag.presenters.b;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class b implements a	// class@000541
{
    public final b b;
    public final String c;
    public final int d;

    public void b(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       b tb = this.b;
       b tc = this.c;
       b td = this.d;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.S8(tc, td);
       }
       return;
    }
}
