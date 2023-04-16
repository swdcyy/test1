package androidx.core.app.f;
import androidx.core.app.f$a;
import java.lang.Object;
import android.app.Person;
import java.lang.CharSequence;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.String;
import android.os.Bundle;
import java.lang.StringBuilder;
import android.app.Person$Builder;
import android.os.PersistableBundle;

public class f	// class@000706
{
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    public void f(f$a p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
    }
    public static f a(Person p0){
       f$a uoa = new f$a();
       uoa.f(p0.getName());
       IconCompat iconCompat = (p0.getIcon() != null)? IconCompat.i(p0.getIcon()): null;
       uoa.c(iconCompat);
       uoa.g(p0.getUri());
       uoa.e(p0.getKey());
       uoa.b(p0.isBot());
       uoa.d(p0.isImportant());
       return uoa.a();
    }
    public static f b(Bundle p0){
       Bundle bundle = p0.getBundle("icon");
       f$a uoa = new f$a();
       uoa.f(p0.getCharSequence("name"));
       IconCompat iconCompat = (bundle != null)? IconCompat.h(bundle): null;
       uoa.c(iconCompat);
       uoa.g(p0.getString("uri"));
       uoa.e(p0.getString("key"));
       uoa.b(p0.getBoolean("isBot"));
       uoa.d(p0.getBoolean("isImportant"));
       return uoa.a();
    }
    public IconCompat c(){
       return this.b;
    }
    public String d(){
       return this.d;
    }
    public CharSequence e(){
       return this.a;
    }
    public String f(){
       return this.c;
    }
    public boolean g(){
       return this.e;
    }
    public boolean h(){
       return this.f;
    }
    public String i(){
       f tc = this.c;
       if (tc != null) {
          return tc;
       }
       if (this.a != null) {
          return "name:"+this.a;
       }
       return "";
    }
    public Person j(){
       Person$Builder uBuilder = new Person$Builder().setName(this.e());
       Icon icon = (this.c() != null)? this.c().I(): null;
       return uBuilder.setIcon(icon).setUri(this.f()).setKey(this.d()).setBot(this.g()).setImportant(this.h()).build();
    }
    public Bundle k(){
       Bundle uBundle = new Bundle();
       uBundle.putCharSequence("name", this.a);
       f tb = this.b;
       Bundle uBundle1 = (tb != null)? tb.H(): null;
       uBundle.putBundle("icon", uBundle1);
       uBundle.putString("uri", this.c);
       uBundle.putString("key", this.d);
       uBundle.putBoolean("isBot", this.e);
       uBundle.putBoolean("isImportant", this.f);
       return uBundle;
    }
    public PersistableBundle l(){
       PersistableBundle persistableB = new PersistableBundle();
       f ta = this.a;
       String str = (ta != null)? ta.toString(): null;
       persistableB.putString("name", str);
       persistableB.putString("uri", this.c);
       persistableB.putString("key", this.d);
       persistableB.putBoolean("isBot", this.e);
       persistableB.putBoolean("isImportant", this.f);
       return persistableB;
    }
}
