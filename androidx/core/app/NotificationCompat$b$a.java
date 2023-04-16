package androidx.core.app.NotificationCompat$b$a;
import java.lang.CharSequence;
import android.app.PendingIntent;
import android.content.res.Resources;
import java.lang.String;
import androidx.core.graphics.drawable.IconCompat;
import android.os.Bundle;
import l1.f;
import androidx.core.app.NotificationCompat$b;
import java.lang.Object;
import androidx.core.app.NotificationCompat$Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.app.Notification$Action;
import android.os.Build$VERSION;
import android.graphics.drawable.Icon;
import android.app.RemoteInput;
import java.util.Iterator;
import java.util.Objects;

public final class NotificationCompat$b$a	// class@0006df
{
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;
    public boolean i;

    public void NotificationCompat$b$a(int p0,CharSequence p1,PendingIntent p2){
       Resources resources = null;
       if (!p0) {
       }else {
          resources = IconCompat.r(resources, "", p0);
       }
       super(resources, p1, p2, new Bundle(), null, true, 0, true, false);
       return;
    }
    public void NotificationCompat$b$a(NotificationCompat$b p0){
       super(p0.d(), p0.j, p0.k, new Bundle(p0.a), p0.e(), p0.b(), p0.f(), p0.f, p0.i());
    }
    public void NotificationCompat$b$a(IconCompat p0,CharSequence p1,PendingIntent p2){
       super(p0, p1, p2, new Bundle(), null, true, 0, true, false);
    }
    public void NotificationCompat$b$a(IconCompat p0,CharSequence p1,PendingIntent p2,Bundle p3,f[] p4,boolean p5,int p6,boolean p7,boolean p8){
       super();
       this.d = true;
       this.h = true;
       this.a = p0;
       this.b = NotificationCompat$Builder.limitCharSequenceLength(p1);
       this.c = p2;
       this.e = p3;
       ArrayList uArrayList = (p4 == null)? null: new ArrayList(Arrays.asList(p4));
       this.f = uArrayList;
       this.d = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       return;
    }
    public static NotificationCompat$b$a d(Notification$Action p0){
       NotificationCompat$b$a uob$a = (Build$VERSION.SDK_INT >= 23 && p0.getIcon() != null)? new NotificationCompat$b$a(IconCompat.i(p0.getIcon()), p0.title, p0.actionIntent): new NotificationCompat$b$a(p0.icon, p0.title, p0.actionIntent);
       RemoteInput[] remoteInputs = p0.getRemoteInputs();
       if (remoteInputs != null && remoteInputs.length) {
          int len = remoteInputs.length;
          for (int i = 0; i < len; i = i + 1) {
             uob$a.a(f.c(remoteInputs[i]));
          }
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 24) {
          uob$a.d = p0.getAllowGeneratedReplies();
       }
       if (sDK_INT >= 28) {
          uob$a.f(p0.getSemanticAction());
       }
       if (sDK_INT >= 29) {
          uob$a.e(p0.isContextual());
       }
       return uob$a;
    }
    public NotificationCompat$b$a a(f p0){
       if (this.f == null) {
          this.f = new ArrayList();
       }
       this.f.add(p0);
       return this;
    }
    public NotificationCompat$b b(){
       f uof;
       f[] uofArray;
       this.c();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       NotificationCompat$b$a tf = this.f;
       if (tf != null) {
          Iterator iterator = tf.iterator();
          while (iterator.hasNext()) {
             uof = iterator.next();
             if (uof.k()) {
                uArrayList.add(uof);
             }else {
                uArrayList1.add(uof);
             }
          }
       }
       uof = 0;
       if (uArrayList.isEmpty()) {
          uofArray = uof;
       }else {
          f[] uofArray2 = new f[uArrayList.size()];
          uofArray = uArrayList.toArray(uofArray2);
       }
       if (!uArrayList1.isEmpty()) {
          f[] uofArray1 = new f[uArrayList1.size()];
          Object[] objArray = uArrayList1.toArray(uofArray1);
       }
       NotificationCompat$b uob = new NotificationCompat$b(this.a, this.b, this.c, this.e, uof, uofArray, this.d, this.g, this.h, this.i);
       return uArrayList;
    }
    public final void c(){
       if (this.i == null) {
          return;
       }
       Objects.requireNonNull(this.c, "Contextual Actions must contain a valid PendingIntent");
       return;
    }
    public NotificationCompat$b$a e(boolean p0){
       this.i = p0;
       return this;
    }
    public NotificationCompat$b$a f(int p0){
       this.g = p0;
       return this;
    }
}
