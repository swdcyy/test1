package ej9.b;
import erd.r;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class b implements r	// class@002162
{
    public final String b;

    public void b(String p0){
       this.b = p0;
    }
    public final boolean test(Object p0){
       return TextUtils.n(this.b, p0);
    }
}
