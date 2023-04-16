package a43.d;
import erd.g;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import a43.b;
import com.yxcorp.gifshow.entity.QPhoto;
import yf5.p;
import org.greenrobot.eventbus.a;
import cda.i;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lnc.a1;
import e17.i;

public final class d implements g	// class@00003c
{
    public final BaseFeed b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;

    public void d(BaseFeed p0,String p1,String p2,int p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       d tb = this.b;
       d tc = this.c;
       b.a(tb, tc, this.d, this.e);
       p.b(new QPhoto(tb));
       a.d().k(new i(true, r1.n1(tb), tc));
       if (this.f != null) {
          if (TextUtils.n(tc, "11")) {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100a65));
          }else {
             i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f100a66));
          }
       }
       return;
    }
}
