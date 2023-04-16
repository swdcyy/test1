package androidx.core.app.NotificationCompat$e$a;
import android.app.Notification$BubbleMetadata;
import androidx.core.app.NotificationCompat$e;
import android.app.PendingIntent;
import androidx.core.app.NotificationCompat$e$c;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import android.app.Notification$BubbleMetadata$Builder;

public class NotificationCompat$e$a	// class@0006e6
{

    public static NotificationCompat$e a(Notification$BubbleMetadata p0){
       NotificationCompat$e uoe = null;
       if (p0 == null) {
          return uoe;
       }
       if (p0.getIntent() == null) {
          return uoe;
       }
       NotificationCompat$e$c uoe$c = new NotificationCompat$e$c(p0.getIntent(), IconCompat.i(p0.getIcon()));
       uoe$c.b(p0.getAutoExpandBubble());
       uoe$c.c(p0.getDeleteIntent());
       uoe$c.g(p0.isNotificationSuppressed());
       if (p0.getDesiredHeight()) {
          uoe$c.d(p0.getDesiredHeight());
       }
       if (p0.getDesiredHeightResId()) {
          uoe$c.e(p0.getDesiredHeightResId());
       }
       return uoe$c.a();
    }
    public static Notification$BubbleMetadata b(NotificationCompat$e p0){
       Notification$BubbleMetadata uBubbleMetad = null;
       if (p0 == null) {
          return uBubbleMetad;
       }
       if (p0.g() == null) {
          return uBubbleMetad;
       }
       Notification$BubbleMetadata$Builder uBubbleMetad1 = new Notification$BubbleMetadata$Builder().setIcon(p0.f().I()).setIntent(p0.g()).setDeleteIntent(p0.c()).setAutoExpandBubble(p0.b()).setSuppressNotification(p0.i());
       if (p0.d()) {
          uBubbleMetad1.setDesiredHeight(p0.d());
       }
       if (p0.e()) {
          uBubbleMetad1.setDesiredHeightResId(p0.e());
       }
       return uBubbleMetad1.build();
    }
}
