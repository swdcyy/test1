package a78.e;
import ok.o;
import java.lang.String;
import java.lang.Object;
import a78.a;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class e implements o	// class@000045
{
    public final String b;

    public void e(String p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       e tb = this.b;
       boolean b = (p0 != null && TextUtils.equals(tb, p0.b))? true: false;
       return b;
    }
}
