package a78.d;
import ok.o;
import java.lang.String;
import java.lang.Object;
import a78.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class d implements o	// class@000044
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       d tb = this.b;
       boolean b = (p0 != null && TextUtils.equals(tb, p0.a))? true: false;
       return b;
    }
}
