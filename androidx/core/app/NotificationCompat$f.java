package androidx.core.app.NotificationCompat$f;
import androidx.core.app.NotificationCompat$j;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import androidx.core.app.NotificationCompat$b;
import l1.e;
import android.os.Build$VERSION;
import androidx.core.app.c;
import android.app.Notification$Builder;
import android.app.Notification$DecoratedCustomViewStyle;
import android.app.Notification$Style;
import java.lang.String;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$Builder;
import java.lang.Math;
import android.content.Context;
import androidx.core.graphics.drawable.IconCompat;
import android.content.res.Resources;
import android.graphics.Bitmap;
import java.lang.CharSequence;
import android.app.PendingIntent;

public class NotificationCompat$f extends NotificationCompat$j	// class@0006ea
{

    public void NotificationCompat$f(){
       super();
    }
    public static List A(List p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          NotificationCompat$b uob = iterator.next();
          if (!uob.i()) {
             uArrayList.add(uob);
          }
       }
       return uArrayList;
    }
    public void b(e p0){
       if (Build$VERSION.SDK_INT >= 24) {
          p0.getBuilder().setStyle(new Notification$DecoratedCustomViewStyle());
       }
       return;
    }
    public String r(){
       return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }
    public RemoteViews t(e p0){
       RemoteViews remoteViews = null;
       if (Build$VERSION.SDK_INT >= 24) {
          return remoteViews;
       }
       RemoteViews bigContentVi = this.a.getBigContentView();
       if (bigContentVi == null) {
          bigContentVi = this.a.getContentView();
       }
       if (bigContentVi == null) {
          return remoteViews;
       }else {
          return this.y(bigContentVi, true);
       }
    }
    public RemoteViews u(e p0){
       RemoteViews remoteViews = null;
       if (Build$VERSION.SDK_INT >= 24) {
          return remoteViews;
       }
       if (this.a.getContentView() == null) {
          return remoteViews;
       }
       return this.y(this.a.getContentView(), false);
    }
    public RemoteViews v(e p0){
       if (Build$VERSION.SDK_INT >= 24) {
          return null;
       }
       RemoteViews headsUpConte = this.a.getHeadsUpContentView();
       RemoteViews remoteViews = (headsUpConte != null)? headsUpConte: this.a.getContentView();
       if (headsUpConte == null) {
          return null;
       }else {
          return this.y(remoteViews, true);
       }
    }
    public final RemoteViews y(RemoteViews p0,boolean p1){
       boolean b = true;
       boolean b1 = false;
       RemoteViews remoteViews = this.c(b, R.layout.arg_RES_7f0d10d4, b1);
       remoteViews.removeAllViews(R.id.actions);
       List list = NotificationCompat$f.A(this.a.mActions);
       if (p1 && list != null) {
          int i = Math.min(list.size(), 3);
          if (i > 0) {
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                remoteViews.addView(R.id.actions, this.z(list.get(i1)));
             }
             if (!b) {
                b1 = 8;
             }
             remoteViews.setViewVisibility(R.id.actions, b1);
             remoteViews.setViewVisibility(R.id.action_divider, b1);
             this.d(remoteViews, p0);
             return remoteViews;
          }
       }
       b = false;
       goto label_003a ;
    }
    public final RemoteViews z(NotificationCompat$b p0){
       NotificationCompat$b uob = (p0.k == null)? 1: null;
       String packageName = this.a.mContext.getPackageName();
       int i = (uob)? 0x7f0d10c3: 0x7f0d10c2;
       RemoteViews remoteViews = new RemoteViews(packageName, i);
       IconCompat iconCompat = p0.d();
       if (iconCompat != null) {
          remoteViews.setImageViewBitmap(R.id.action_image, this.m(iconCompat, this.a.mContext.getResources().getColor(R.color.arg_RES_7f061979)));
       }
       remoteViews.setTextViewText(R.id.action_text, p0.j);
       if (!uob) {
          remoteViews.setOnClickPendingIntent(R.id.action_container, p0.k);
       }
       remoteViews.setContentDescription(R.id.action_container, p0.j);
       return remoteViews;
    }
}
