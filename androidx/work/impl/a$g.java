package androidx.work.impl.a$g;
import w2.c;
import android.content.Context;
import a3.b;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import android.content.SharedPreferences;
import oe6.o;
import android.content.SharedPreferences$Editor;
import oe6.g;

public class a$g extends c	// class@000a6e
{
    public final Context c;

    public void a$g(Context p0,int p1,int p2){
       super(p1, p2);
       this.c = p0;
    }
    public void a(b p0){
       String str = "reschedule_needed";
       if (this.b >= 10) {
          Object[] objArray = new Object[]{str,Integer.valueOf(1)};
          p0.execSQL("INSERT OR REPLACE INTO `Preference` \(`key`, `long_value`\) VALUES \(@key, @long_value\)", objArray);
       }else {
          g.a(o.c(this.c, "androidx.work.util.preferences", 0).edit().putBoolean(str, 1));
       }
       return;
    }
}
