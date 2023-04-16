package ced.c;
import n3d.a;
import com.yxcorp.plugin.search.result.hashtag.presenters.b;
import java.lang.String;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class c implements a	// class@000545
{
    public final b b;
    public final String c;
    public final int d;

    public void c(b p0,String p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       c tb = this.b;
       c tc = this.c;
       c td = this.d;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          tb.b9(tc, td);
       }
       return;
    }
}
