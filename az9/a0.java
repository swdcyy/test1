package az9.a0;
import n3d.a;
import az9.i0;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import android.content.Intent;
import java.util.Objects;
import com.kwai.framework.model.user.QCurrentUser;
import tkd.b;
import tkd.d;
import cm5.a;
import android.app.Activity;
import k2b.e0;
import cm5.c;

public final class a0 implements a	// class@00031a
{
    public final i0 b;
    public final QPhoto c;

    public void a0(i0 p0,QPhoto p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       a0 tb = this.b;
       a0 tc = this.c;
       Objects.requireNonNull(tb);
       if (QCurrentUser.me().isLogined()) {
          d.a(0x5f78d73).dw(tc, tb.v, tb.x, true);
       }
       return;
    }
}
