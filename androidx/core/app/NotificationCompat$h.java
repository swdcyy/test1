package androidx.core.app.NotificationCompat$h;
import androidx.core.app.NotificationCompat$j;
import java.util.ArrayList;
import androidx.core.app.NotificationCompat$Builder;
import l1.e;
import android.app.Notification$InboxStyle;
import androidx.core.app.c;
import android.app.Notification$Builder;
import java.lang.CharSequence;
import java.util.Iterator;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.util.Collection;
import java.util.Collections;

public class NotificationCompat$h extends NotificationCompat$j	// class@0006ec
{
    public ArrayList e;

    public void NotificationCompat$h(){
       super();
       this.e = new ArrayList();
    }
    public void NotificationCompat$h(NotificationCompat$Builder p0){
       super();
       this.e = new ArrayList();
       this.x(p0);
    }
    public void b(e p0){
       Notification$InboxStyle inboxStyle = new Notification$InboxStyle(p0.getBuilder()).setBigContentTitle(this.b);
       if (this.d != null) {
          inboxStyle.setSummaryText(this.c);
       }
       Iterator iterator = this.e.iterator();
       while (iterator.hasNext()) {
          inboxStyle.addLine(iterator.next());
       }
       return;
    }
    public void f(Bundle p0){
       super.f(p0);
       p0.remove("android.textLines");
    }
    public String r(){
       return "androidx.core.app.NotificationCompat$InboxStyle";
    }
    public void w(Bundle p0){
       super.w(p0);
       this.e.clear();
       if (p0.containsKey("android.textLines")) {
          Collections.addAll(this.e, p0.getCharSequenceArray("android.textLines"));
       }
       return;
    }
    public NotificationCompat$h y(CharSequence p0){
       if (p0 != null) {
          this.e.add(NotificationCompat$Builder.limitCharSequenceLength(p0));
       }
       return this;
    }
    public NotificationCompat$h z(CharSequence p0){
       this.b = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
}
