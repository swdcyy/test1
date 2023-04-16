package androidx.core.app.NotificationCompat$e;
import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.String;
import java.lang.Object;
import androidx.core.app.NotificationCompat$a;
import android.app.Notification$BubbleMetadata;
import android.os.Build$VERSION;
import androidx.core.app.NotificationCompat$e$b;
import androidx.core.app.NotificationCompat$e$a;

public final class NotificationCompat$e	// class@000220
{
    public PendingIntent a;
    public PendingIntent b;
    public IconCompat c;
    public int d;
    public int e;
    public int f;
    public String g;

    public void NotificationCompat$e(PendingIntent p0,PendingIntent p1,IconCompat p2,int p3,int p4,int p5,String p6){
       super();
       this.a = p0;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.b = p1;
       this.f = p5;
       this.g = p6;
    }
    public void NotificationCompat$e(PendingIntent p0,PendingIntent p1,IconCompat p2,int p3,int p4,int p5,String p6,NotificationCompat$a p7){
       super(p0, p1, p2, p3, p4, p5, p6);
    }
    public static NotificationCompat$e a(Notification$BubbleMetadata p0){
       if (p0 == null) {
          return null;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          return NotificationCompat$e$b.a(p0);
       }
       if (sDK_INT == 29) {
          return NotificationCompat$e$a.a(p0);
       }
       return null;
    }
    public static Notification$BubbleMetadata k(NotificationCompat$e p0){
       if (p0 == null) {
          return null;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 30) {
          return NotificationCompat$e$b.b(p0);
       }
       if (sDK_INT == 29) {
          return NotificationCompat$e$a.b(p0);
       }
       return null;
    }
    public boolean b(){
       int i = 1;
       if (this.f & i) {
       }else {
          i = false;
       }
       return i;
    }
    public PendingIntent c(){
       return this.b;
    }
    public int d(){
       return this.d;
    }
    public int e(){
       return this.e;
    }
    public IconCompat f(){
       return this.c;
    }
    public PendingIntent g(){
       return this.a;
    }
    public String h(){
       return this.g;
    }
    public boolean i(){
       boolean b = (this.f & 0x02)? true: false;
       return b;
    }
    public void j(int p0){
       this.f = p0;
    }
}
