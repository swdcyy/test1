package c24.q;
import cb4.e;
import com.kuaishou.merchant.live.basic.router.c;
import java.lang.Object;
import cb4.d;
import com.kuaishou.merchant.router.base.RouterRequest;
import android.net.Uri;
import java.lang.String;
import android.app.Activity;
import android.content.Context;
import vq5.d;

public final class q implements e	// class@000494
{
    public final c a;

    public void q(c p0){
       this.a = p0;
    }
    public boolean a(){
       return d.a(this);
    }
    public final boolean b(RouterRequest p0){
       this.a.p.r4(p0.d().toString(), p0.a());
       return true;
    }
    public String getName(){
       return d.b(this);
    }
}
