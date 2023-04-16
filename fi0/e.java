package fi0.e;
import oi0.a;
import com.kuaishou.krn.c;
import java.lang.Object;
import java.lang.String;
import kj0.l;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Throwable;
import ek0.d;

public final class e implements a	// class@002345
{
    public final c a;

    public void e(c p0){
       this.a = p0;
    }
    public final boolean a(int p0){
       String str = this.a.c.K();
       boolean b = true;
       if (!TextUtils.isEmpty(str) && Integer.parseInt(str) > p0) {
          b = false;
       }
    label_0031 :
       return b;
    }
}
