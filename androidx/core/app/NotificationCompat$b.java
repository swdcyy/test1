package androidx.core.app.NotificationCompat$b;
import java.lang.CharSequence;
import android.app.PendingIntent;
import android.content.res.Resources;
import java.lang.String;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Bundle;
import l1.f;
import java.lang.Object;
import androidx.core.app.NotificationCompat$Builder;

public class NotificationCompat$b	// class@0006e1
{
    public final Bundle a;
    public IconCompat b;
    public final f[] c;
    public final f[] d;
    public boolean e;
    public boolean f;
    public final int g;
    public final boolean h;
    public int i;
    public CharSequence j;
    public PendingIntent k;

    public void NotificationCompat$b(int p0,CharSequence p1,PendingIntent p2){
       IconCompat iconCompat = null;
       if (!p0) {
       }else {
          iconCompat = IconCompat.r(iconCompat, "", p0);
       }
       super(iconCompat, p1, p2);
       return;
    }
    public void NotificationCompat$b(int p0,CharSequence p1,PendingIntent p2,Bundle p3,f[] p4,f[] p5,boolean p6,int p7,boolean p8,boolean p9){
       Resources resources = null;
       if (!p0) {
       }else {
          resources = IconCompat.r(resources, "", p0);
       }
       super(resources, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return;
    }
    public void NotificationCompat$b(IconCompat p0,CharSequence p1,PendingIntent p2){
       super(p0, p1, p2, new Bundle(), null, null, true, 0, true, false);
    }
    public void NotificationCompat$b(IconCompat p0,CharSequence p1,PendingIntent p2,Bundle p3,f[] p4,f[] p5,boolean p6,int p7,boolean p8,boolean p9){
       super();
       this.f = true;
       this.b = p0;
       if (p0 != null && p0.y() == 2) {
          this.i = p0.t();
       }
       this.j = NotificationCompat$Builder.limitCharSequenceLength(p1);
       this.k = p2;
       if (p3 == null) {
          p3 = new Bundle();
       }
       this.a = p3;
       this.c = p4;
       this.d = p5;
       this.e = p6;
       this.g = p7;
       this.f = p8;
       this.h = p9;
       return;
    }
    public PendingIntent a(){
       return this.k;
    }
    public boolean b(){
       return this.e;
    }
    public Bundle c(){
       return this.a;
    }
    public IconCompat d(){
       if (this.b == null) {
          NotificationCompat$b ti = this.i;
          if (ti != null) {
             this.b = IconCompat.r(null, "", ti);
          }
       }
       return this.b;
    }
    public f[] e(){
       return this.c;
    }
    public int f(){
       return this.g;
    }
    public boolean g(){
       return this.f;
    }
    public CharSequence h(){
       return this.j;
    }
    public boolean i(){
       return this.h;
    }
}
