package n1a.d;
import ok.o;
import java.lang.String;
import java.lang.Object;
import l1a.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class d implements o	// class@0030b5
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return TextUtils.n(p0.mText, this.b);
    }
}
