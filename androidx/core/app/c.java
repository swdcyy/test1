package androidx.core.app.c;
import l1.e;
import androidx.core.app.NotificationCompat$Builder;
import java.lang.Object;
import java.util.ArrayList;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.app.Notification$Builder;
import android.content.Context;
import java.lang.String;
import android.app.Notification;
import android.widget.RemoteViews;
import java.lang.CharSequence;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import java.util.Iterator;
import androidx.core.app.NotificationCompat$b;
import android.net.Uri;
import android.media.AudioAttributes;
import java.util.List;
import java.lang.Integer;
import androidx.core.app.d;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.core.app.f;
import android.app.Person;
import androidx.core.app.NotificationCompat$e;
import android.app.Notification$BubbleMetadata;
import android.content.LocusId;
import m1.a;
import androidx.collection.ArraySet;
import java.util.Collection;
import androidx.core.graphics.drawable.IconCompat;
import android.app.Notification$Action$Builder;
import l1.f;
import android.app.RemoteInput;
import android.app.Notification$Action;
import androidx.core.app.NotificationCompat$j;
import androidx.core.app.NotificationCompat;

public class c implements e	// class@000228
{
    public final Context a;
    public final Notification$Builder b;
    public final NotificationCompat$Builder c;
    public RemoteViews d;
    public RemoteViews e;
    public final List f;
    public final Bundle g;
    public int h;
    public RemoteViews i;

    public void c(NotificationCompat$Builder p0){
       NotificationCompat$Builder mSmallIcon;
       super();
       this.f = new ArrayList();
       this.g = new Bundle();
       this.c = p0;
       this.a = p0.mContext;
       this.b = (Build$VERSION.SDK_INT >= 26)? new Notification$Builder(p0.mContext, p0.mChannelId): new Notification$Builder(p0.mContext);
       NotificationCompat$Builder mNotificatio = p0.mNotification;
       Notification$Builder uBuilder = this.b.setWhen(mNotificatio.when).setSmallIcon(mNotificatio.icon, mNotificatio.iconLevel).setContent(mNotificatio.contentView).setTicker(mNotificatio.tickerText, p0.mTickerView).setVibrate(mNotificatio.vibrate).setLights(mNotificatio.ledARGB, mNotificatio.ledOnMS, mNotificatio.ledOffMS);
       int i = 0;
       boolean b = (mNotificatio.flags & 2)? true: false;
       uBuilder = uBuilder.setOngoing(b);
       b = (mNotificatio.flags & 0x08)? true: false;
       uBuilder = uBuilder.setOnlyAlertOnce(b);
       b = (mNotificatio.flags & 0x10)? true: false;
       uBuilder = uBuilder.setAutoCancel(b).setDefaults(mNotificatio.defaults).setContentTitle(p0.mContentTitle).setContentText(p0.mContentText).setContentInfo(p0.mContentInfo).setContentIntent(p0.mContentIntent).setDeleteIntent(mNotificatio.deleteIntent);
       NotificationCompat$Builder mFullScreenI = p0.mFullScreenIntent;
       boolean b1 = (mNotificatio.flags & 0x0080)? true: false;
       uBuilder.setFullScreenIntent(mFullScreenI, b1).setLargeIcon(p0.mLargeIcon).setNumber(p0.mNumber).setProgress(p0.mProgressMax, p0.mProgress, p0.mProgressIndeterminate);
       this.b.setSubText(p0.mSubText).setUsesChronometer(p0.mUseChronometer).setPriority(p0.mPriority);
       Iterator iterator = p0.mActions.iterator();
       while (iterator.hasNext()) {
          this.a(iterator.next());
       }
       NotificationCompat$Builder mExtras = p0.mExtras;
       if (mExtras != null) {
          this.g.putAll(mExtras);
       }
       this.d = p0.mContentView;
       this.e = p0.mBigContentView;
       this.b.setShowWhen(p0.mShowWhen);
       this.b.setLocalOnly(p0.mLocalOnly).setGroup(p0.mGroupKey).setGroupSummary(p0.mGroupSummary).setSortKey(p0.mSortKey);
       this.h = p0.mGroupAlertBehavior;
       this.b.setCategory(p0.mCategory).setColor(p0.mColor).setVisibility(p0.mVisibility).setPublicVersion(p0.mPublicVersion).setSound(mNotificatio.sound, mNotificatio.audioAttributes);
       b = 28;
       List list = (Build$VERSION.SDK_INT < b)? c.d(c.f(p0.mPersonList), p0.mPeople): p0.mPeople;
       if (list != null && !list.isEmpty()) {
          iterator = list.iterator();
          while (iterator.hasNext()) {
             this.b.addPerson(iterator.next());
          }
       }
       this.i = p0.mHeadsUpContentView;
       if (p0.mInvisibleActions.size() > 0) {
          String str = "android.car.EXTENSIONS";
          Bundle bundle = p0.getExtras().getBundle(str);
          if (bundle == null) {
             bundle = new Bundle();
          }
          Bundle uBundle = new Bundle(bundle);
          Bundle uBundle1 = new Bundle();
          for (int i1 = 0; i1 < p0.mInvisibleActions.size(); i1 = i1 + 1) {
             uBundle1.putBundle(Integer.toString(i1), d.e(p0.mInvisibleActions.get(i1)));
          }
          bundle.putBundle("invisible_actions", uBundle1);
          uBundle.putBundle("invisible_actions", uBundle1);
          p0.getExtras().putBundle(str, bundle);
          this.g.putBundle(str, uBundle);
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 23) {
          mSmallIcon = p0.mSmallIcon;
          if (mSmallIcon != null) {
             this.b.setSmallIcon(mSmallIcon);
          }
       }
       if (sDK_INT >= 24) {
          this.b.setExtras(p0.mExtras).setRemoteInputHistory(p0.mRemoteInputHistory);
          mSmallIcon = p0.mContentView;
          if (mSmallIcon != null) {
             this.b.setCustomContentView(mSmallIcon);
          }
          mSmallIcon = p0.mBigContentView;
          if (mSmallIcon != null) {
             this.b.setCustomBigContentView(mSmallIcon);
          }
          mSmallIcon = p0.mHeadsUpContentView;
          if (mSmallIcon != null) {
             this.b.setCustomHeadsUpContentView(mSmallIcon);
          }
       }
       if (sDK_INT >= 26) {
          this.b.setBadgeIconType(p0.mBadgeIcon).setSettingsText(p0.mSettingsText).setShortcutId(p0.mShortcutId).setTimeoutAfter(p0.mTimeout).setGroupAlertBehavior(p0.mGroupAlertBehavior);
          if (p0.mColorizedSet != null) {
             this.b.setColorized(p0.mColorized);
          }
          if (!TextUtils.isEmpty(p0.mChannelId)) {
             this.b.setSound(null).setDefaults(i).setLights(i, i, i).setVibrate(null);
          }
       }
       if (sDK_INT >= b) {
          iterator = p0.mPersonList.iterator();
          while (iterator.hasNext()) {
             this.b.addPerson(iterator.next().j());
          }
       }
       sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 29) {
          this.b.setAllowSystemGeneratedContextualActions(p0.mAllowSystemGeneratedContextualActions);
          this.b.setBubbleMetadata(NotificationCompat$e.k(p0.mBubbleMetadata));
          mFullScreenI = p0.mLocusId;
          if (mFullScreenI != null) {
             this.b.setLocusId(mFullScreenI.c());
          }
       }
       if (p0.mSilent != null) {
          this.h = (this.c.mGroupSummary != null)? 2: 1;
          this.b.setVibrate(null);
          this.b.setSound(null);
          int i2 = mNotificatio.defaults & 0xfe;
          mNotificatio.defaults = i2;
          i2 = i2 & 0xfd;
          mNotificatio.defaults = i2;
          this.b.setDefaults(i2);
          if (sDK_INT >= 26) {
             if (TextUtils.isEmpty(this.c.mGroupKey)) {
                this.b.setGroup("silent");
             }
             this.b.setGroupAlertBehavior(this.h);
          }
       }
       return;
    }
    public static List d(List p0,List p1){
       if (p0 == null) {
          return p1;
       }
       if (p1 == null) {
          return p0;
       }
       ArraySet uArraySet = new ArraySet((p0.size() + p1.size()));
       uArraySet.addAll(p0);
       uArraySet.addAll(p1);
       return new ArrayList(uArraySet);
    }
    public static List f(List p0){
       if (p0 == null) {
          return null;
       }
       ArrayList uArrayList = new ArrayList(p0.size());
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().i());
       }
       return uArrayList;
    }
    public final void a(NotificationCompat$b p0){
       Notification$Action$Builder uAction$Buil;
       int len;
       int i1;
       IconCompat iconCompat = p0.d();
       int i = 0;
       if (Build$VERSION.SDK_INT >= 23) {
          Icon icon = (iconCompat != null)? iconCompat.I(): null;
          uAction$Buil = new Notification$Action$Builder(icon, p0.h(), p0.a());
       }else if(iconCompat != null){
          i1 = iconCompat.t();
       }else {
          i1 = 0;
       }
       uAction$Buil = new Notification$Action$Builder(i1, p0.h(), p0.a());
       if (p0.e() != null) {
          RemoteInput[] remoteInputA = f.b(p0.e());
          len = remoteInputA.length;
          for (; i < len; i = i + 1) {
             uAction$Buil.addRemoteInput(remoteInputA[i]);
          }
       }
       Bundle uBundle = (p0.c() != null)? new Bundle(p0.c()): new Bundle();
       uBundle.putBoolean("android.support.allowGeneratedReplies", p0.b());
       len = Build$VERSION.SDK_INT;
       if (len >= 24) {
          uAction$Buil.setAllowGeneratedReplies(p0.b());
       }
       uBundle.putInt("android.support.action.semanticAction", p0.f());
       if (len >= 28) {
          uAction$Buil.setSemanticAction(p0.f());
       }
       if (len >= 29) {
          uAction$Buil.setContextual(p0.i());
       }
       uBundle.putBoolean("android.support.action.showsUserInterface", p0.g());
       uAction$Buil.addExtras(uBundle);
       this.b.addAction(uAction$Buil.build());
       return;
    }
    public Notification b(){
       NotificationCompat$Builder mStyle = this.c.mStyle;
       if (mStyle != null) {
          mStyle.b(this);
       }
       RemoteViews remoteViews = (mStyle != null)? mStyle.u(this): null;
       Notification notification = this.c();
       if (remoteViews != null) {
          notification.contentView = remoteViews;
       }else {
          NotificationCompat$Builder mContentView = this.c.mContentView;
          if (mContentView != null) {
             notification.contentView = mContentView;
          }
       }
       if (mStyle != null) {
          remoteViews = mStyle.t(this);
          if (remoteViews != null) {
             notification.bigContentView = remoteViews;
          }
       }
       if (mStyle != null) {
          remoteViews = this.c.mStyle.v(this);
          if (remoteViews != null) {
             notification.headsUpContentView = remoteViews;
          }
       }
       if (mStyle != null) {
          Bundle uBundle = NotificationCompat.k(notification);
          if (uBundle != null) {
             mStyle.a(uBundle);
          }
       }
       return notification;
    }
    public Notification c(){
       Notification notification;
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 26) {
          return this.b.build();
       }
       if (sDK_INT >= 24) {
          notification = this.b.build();
          if (this.h != null) {
             if (notification.getGroup() != null && ((notification.flags & 0x0200) && this.h == 2)) {
                this.g(notification);
             }
          label_0030 :
             if (notification.getGroup() != null && (!(notification.flags & 0x0200) && this.h == 1)) {
                this.g(notification);
             }
          }
       label_0043 :
          return notification;
       }else {
          this.b.setExtras(this.g);
          notification = this.b.build();
          c td = this.d;
          if (td != null) {
             notification.contentView = td;
          }
          td = this.e;
          if (td != null) {
             notification.bigContentView = td;
          }
          td = this.i;
          if (td != null) {
             notification.headsUpContentView = td;
          }
          if (this.h != null) {
             if (notification.getGroup() != null && ((notification.flags & 0x0200) && this.h == 2)) {
                this.g(notification);
             }
          label_007a :
             if (notification.getGroup() != null && (!(notification.flags & 0x0200) && this.h == 1)) {
                this.g(notification);
             }
          }
       label_008d :
          return notification;
       }
    }
    public Context e(){
       return this.a;
    }
    public final void g(Notification p0){
       p0.sound = null;
       p0.vibrate = null;
       int i = p0.defaults & 0xfe;
       p0.defaults = i;
       p0.defaults = i & 0xfd;
    }
    public Notification$Builder getBuilder(){
       return this.b;
    }
}
