package ch2.f;
import ok.o;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.core.show.redpacket.krn.f;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class f implements o	// class@000537
{
    public final String b;

    public void f(String p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       f tb = this.b;
       boolean b = (p0 != null && TextUtils.equals(p0.c(), tb))? true: false;
       return b;
    }
}
