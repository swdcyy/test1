package androidx.core.app.NotificationCompat$c;
import androidx.core.app.NotificationCompat$j;
import androidx.core.app.NotificationCompat$Builder;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Build$VERSION;
import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import l1.e;
import android.app.Notification$BigPictureStyle;
import androidx.core.app.c;
import android.app.Notification$Builder;
import androidx.core.app.NotificationCompat$c$a;
import android.content.Context;
import androidx.core.app.NotificationCompat$c$b;
import android.os.Bundle;
import java.lang.String;

public class NotificationCompat$c extends NotificationCompat$j	// class@0006e4
{
    public Bitmap e;
    public IconCompat f;
    public boolean g;

    public void NotificationCompat$c(){
       super();
    }
    public void NotificationCompat$c(NotificationCompat$Builder p0){
       super();
       this.x(p0);
    }
    public static IconCompat y(Parcelable p0){
       if (p0 != null) {
          if (Build$VERSION.SDK_INT >= 23 && p0 instanceof Icon) {
             return IconCompat.i(p0);
          }else if(p0 instanceof Bitmap){
             return IconCompat.n(p0);
          }
       }
       return null;
    }
    public NotificationCompat$c A(CharSequence p0){
       this.b = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$c B(CharSequence p0){
       this.c = NotificationCompat$Builder.limitCharSequenceLength(p0);
       this.d = true;
       return this;
    }
    public void b(e p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       Notification$BigPictureStyle uBigPictureS = new Notification$BigPictureStyle(p0.getBuilder()).setBigContentTitle(this.b).bigPicture(this.e);
       if (this.g != null) {
          NotificationCompat$c tf = this.f;
          if (tf == null) {
             NotificationCompat$c$a.a(uBigPictureS, null);
          }else if(sDK_INT >= 23){
             NotificationCompat$c$b.a(uBigPictureS, this.f.J(p0.e()));
          }else if(tf.y() == 1){
             NotificationCompat$c$a.a(uBigPictureS, this.f.s());
          }else {
             NotificationCompat$c$a.a(uBigPictureS, null);
          }
       }
       if (this.d != null) {
          NotificationCompat$c$a.b(uBigPictureS, this.c);
       }
       return;
    }
    public void f(Bundle p0){
       super.f(p0);
       p0.remove("android.largeIcon.big");
       p0.remove("android.picture");
    }
    public String r(){
       return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
    public void w(Bundle p0){
       super.w(p0);
       String str = "android.largeIcon.big";
       if (p0.containsKey(str)) {
          this.f = NotificationCompat$c.y(p0.getParcelable(str));
          this.g = true;
       }
       this.e = p0.getParcelable("android.picture");
       return;
    }
    public NotificationCompat$c z(Bitmap p0){
       this.e = p0;
       return this;
    }
}
