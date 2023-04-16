package ej9.c;
import erd.g;
import ej9.g$a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.utility.Log;

public final class c implements g	// class@002163
{
    public final g$a b;

    public void c(g$a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       tb.i = 3;
       tb.a();
       if (tb.h != null) {
          i.d(R.style.arg_RES_7f11066a, "资源ID 为 "+tb.a+"的资源加载失败,err="+p0.getMessage());
       }
       Log.j("FeedResourceManagerImpl", p0);
       return;
    }
}
