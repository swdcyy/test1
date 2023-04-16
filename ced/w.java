package ced.w;
import n3d.a;
import com.yxcorp.plugin.search.result.hashtag.presenters.m;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;

public final class w implements a	// class@00058c
{
    public final m b;

    public void w(m p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       w tb = this.b;
       Objects.requireNonNull(tb);
       if (QCurrentUser.ME.isLogined()) {
          tb.V8();
       }
       return;
    }
}
