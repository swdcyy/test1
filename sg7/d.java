package sg7.d;
import android.os.Build$VERSION;
import android.os.Build;
import sg7.b;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Locale;
import java.lang.Exception;

public abstract class d	// class@002420
{
    public final int a;
    public final int b;
    public final String c;
    public static final int d;
    public static final String e;

    static {
       d.d = Build$VERSION.SDK_INT;
       d.e = Build.MANUFACTURER;
    }
    public void d(b p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
    }
    public static String c(String p0){
       if (TextUtils.isEmpty(p0)) {
          return p0;
       }
       return p0.toUpperCase(Locale.US);
    }
    public boolean a(){
       boolean b = true;
       d ta = this.a;
       if (ta == null || ta <= d.d) {
          ta = this.b;
          if (ta != null && (ta >= d.d && (this.c == null || (d.c(d.e)).equals(d.c(this.c))))) {
             b = false;
          }
       }
       return b;
    }
    public abstract boolean b(Exception p0);
    public abstract void d();
}
