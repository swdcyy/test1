package androidx.core.app.NotificationCompat$e$c;
import java.lang.Object;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.String;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.NullPointerException;
import androidx.core.app.NotificationCompat$e;
import androidx.core.app.NotificationCompat$a;
import java.lang.Math;

public final class NotificationCompat$e$c	// class@0006e8
{
    public PendingIntent a;
    public IconCompat b;
    public int c;
    public int d;
    public int e;
    public PendingIntent f;
    public String g;

    public void NotificationCompat$e$c(){
       super();
    }
    public void NotificationCompat$e$c(PendingIntent p0,IconCompat p1){
       super();
       Objects.requireNonNull(p0, "Bubble requires non-null pending intent");
       this.a = p0;
       this.b = p1;
    }
    public void NotificationCompat$e$c(String p0){
       super();
       if (TextUtils.isEmpty(p0)) {
          throw new NullPointerException("Bubble requires a non-null shortcut id");
       }
       this.g = p0;
       return;
    }
    public NotificationCompat$e a(){
       NotificationCompat$e$c tg = this.g;
       if (tg == null) {
          Objects.requireNonNull(this.a, "Must supply pending intent or shortcut to bubble");
       }
       if (tg == null) {
          Objects.requireNonNull(this.b, "Must supply an icon or shortcut for the bubble");
       }
       NotificationCompat$e$c te = this.e;
       NotificationCompat$e uoe = new NotificationCompat$e(this.a, this.f, this.b, this.c, this.d, te, tg, null);
       v9.j(te);
       return v9;
    }
    public NotificationCompat$e$c b(boolean p0){
       this.f(1, p0);
       return this;
    }
    public NotificationCompat$e$c c(PendingIntent p0){
       this.f = p0;
       return this;
    }
    public NotificationCompat$e$c d(int p0){
       this.c = Math.max(p0, 0);
       this.d = 0;
       return this;
    }
    public NotificationCompat$e$c e(int p0){
       this.d = p0;
       this.c = 0;
       return this;
    }
    public final NotificationCompat$e$c f(int p0,boolean p1){
       this.e = (p1)? p0 | this.e: (~ p0) & this.e;
       return this;
    }
    public NotificationCompat$e$c g(boolean p0){
       this.f(2, p0);
       return this;
    }
}
