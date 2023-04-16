package androidx.core.app.NotificationCompat$e$b;
import android.app.Notification$BubbleMetadata;
import androidx.core.app.NotificationCompat$e;
import java.lang.String;
import androidx.core.app.NotificationCompat$e$c;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import android.app.Notification$BubbleMetadata$Builder;

public class NotificationCompat$e$b	// class@0006e7
{

    public static NotificationCompat$e a(Notification$BubbleMetadata p0){
       if (p0 == null) {
          return null;
       }
       NotificationCompat$e$c uoe$c = (p0.getShortcutId() != null)? new NotificationCompat$e$c(p0.getShortcutId()): new NotificationCompat$e$c(p0.getIntent(), IconCompat.i(p0.getIcon()));
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
       if (p0 == null) {
          return null;
       }
       Notification$BubbleMetadata$Builder uBubbleMetad = (p0.h() != null)? new Notification$BubbleMetadata$Builder(p0.h()): new Notification$BubbleMetadata$Builder(p0.g(), p0.f().I());
       uBubbleMetad.setDeleteIntent(p0.c()).setAutoExpandBubble(p0.b()).setSuppressNotification(p0.i());
       if (p0.d()) {
          uBubbleMetad.setDesiredHeight(p0.d());
       }
       if (p0.e()) {
          uBubbleMetad.setDesiredHeightResId(p0.e());
       }
       return uBubbleMetad.build();
    }
}
