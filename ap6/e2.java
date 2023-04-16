package ap6.e2;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import hp6.b;
import com.kwai.chat.kwailink.data.PacketData;
import lh0.a$j1;
import java.lang.Class;
import qo6.a;

public final class e2 implements Callable	// class@000329
{
    public final b b;
    public final String c;
    public final List d;

    public void e2(b p0,String p1,List p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object call(){
       e2 tc = this.c;
       e2 td = this.d;
       b uob = b.i(this.b.b);
       Objects.requireNonNull(uob);
       if (TextUtils.isEmpty(tc)) {
          uob = new b(1004);
          uob.e("group id is empty");
       }else {
          uob = a.h(uob.m(tc, true, td), a$j1.class);
       }
       return uob;
    }
}
