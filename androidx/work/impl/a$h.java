package androidx.work.impl.a$h;
import w2.c;
import android.content.Context;
import a3.b;
import java.lang.String;
import v3.f;
import v3.c;

public class a$h extends c	// class@000a6f
{
    public final Context c;

    public void a$h(Context p0){
       super(9, 10);
       this.c = p0;
    }
    public void a(b p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS `Preference` \(`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY\(`key`\)\)");
       f.d(this.c, p0);
       c.a(this.c, p0);
    }
}
