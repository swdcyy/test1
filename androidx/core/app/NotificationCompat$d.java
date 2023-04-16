package androidx.core.app.NotificationCompat$d;
import androidx.core.app.NotificationCompat$j;
import androidx.core.app.NotificationCompat$Builder;
import android.os.Bundle;
import l1.e;
import android.app.Notification$BigTextStyle;
import androidx.core.app.c;
import android.app.Notification$Builder;
import java.lang.CharSequence;
import java.lang.String;

public class NotificationCompat$d extends NotificationCompat$j	// class@0006e5
{
    public CharSequence e;

    public void NotificationCompat$d(){
       super();
    }
    public void NotificationCompat$d(NotificationCompat$Builder p0){
       super();
       this.x(p0);
    }
    public void a(Bundle p0){
       super.a(p0);
    }
    public void b(e p0){
       Notification$BigTextStyle uBigTextStyl = new Notification$BigTextStyle(p0.getBuilder()).setBigContentTitle(this.b).bigText(this.e);
       if (this.d != null) {
          uBigTextStyl.setSummaryText(this.c);
       }
       return;
    }
    public void f(Bundle p0){
       super.f(p0);
       p0.remove("android.bigText");
    }
    public String r(){
       return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
    public void w(Bundle p0){
       super.w(p0);
       this.e = p0.getCharSequence("android.bigText");
    }
    public NotificationCompat$d y(CharSequence p0){
       this.e = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$d z(CharSequence p0){
       this.b = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
}
