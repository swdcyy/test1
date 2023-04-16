package androidx.core.app.NotificationCompat$Builder;
import android.content.Context;
import java.lang.String;
import android.app.Notification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationCompat$j;
import java.lang.CharSequence;
import android.app.PendingIntent;
import m1.a;
import android.graphics.Bitmap;
import androidx.core.app.NotificationCompat$e;
import android.net.Uri;
import android.os.Bundle;
import android.os.Build$VERSION;
import android.graphics.drawable.Icon;
import android.app.Notification$Action;
import androidx.core.app.NotificationCompat$b$a;
import androidx.core.app.NotificationCompat$b;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;
import android.app.Person;
import androidx.core.app.f;
import java.lang.System;
import androidx.core.app.c;
import android.widget.RemoteViews;
import l1.e;
import android.app.Notification$Builder;
import androidx.core.app.NotificationCompat$g;
import android.content.res.Resources;
import cw9.c;
import java.lang.Math;
import androidx.core.content.pm.a;
import androidx.core.graphics.drawable.IconCompat;
import android.media.AudioAttributes$Builder;
import android.media.AudioAttributes;

public class NotificationCompat$Builder	// class@000218
{
    public ArrayList mActions;
    public boolean mAllowSystemGeneratedContextualActions;
    public int mBadgeIcon;
    public RemoteViews mBigContentView;
    public NotificationCompat$e mBubbleMetadata;
    public String mCategory;
    public String mChannelId;
    public boolean mChronometerCountDown;
    public int mColor;
    public boolean mColorized;
    public boolean mColorizedSet;
    public CharSequence mContentInfo;
    public PendingIntent mContentIntent;
    public CharSequence mContentText;
    public CharSequence mContentTitle;
    public RemoteViews mContentView;
    public Context mContext;
    public Bundle mExtras;
    public PendingIntent mFullScreenIntent;
    public int mGroupAlertBehavior;
    public String mGroupKey;
    public boolean mGroupSummary;
    public RemoteViews mHeadsUpContentView;
    public ArrayList mInvisibleActions;
    public Bitmap mLargeIcon;
    public boolean mLocalOnly;
    public a mLocusId;
    public Notification mNotification;
    public int mNumber;
    public ArrayList mPeople;
    public ArrayList mPersonList;
    public int mPriority;
    public int mProgress;
    public boolean mProgressIndeterminate;
    public int mProgressMax;
    public Notification mPublicVersion;
    public CharSequence[] mRemoteInputHistory;
    public CharSequence mSettingsText;
    public String mShortcutId;
    public boolean mShowWhen;
    public boolean mSilent;
    public Icon mSmallIcon;
    public String mSortKey;
    public NotificationCompat$j mStyle;
    public CharSequence mSubText;
    public RemoteViews mTickerView;
    public long mTimeout;
    public boolean mUseChronometer;
    public int mVisibility;

    public void NotificationCompat$Builder(Context p0){
       super(p0, null);
    }
    public void NotificationCompat$Builder(Context p0,Notification p1){
       int len;
       super(p0, NotificationCompat.f(p1));
       Notification extras = p1.extras;
       NotificationCompat$j oj = NotificationCompat$j.q(p1);
       this.setContentTitle(NotificationCompat.j(p1)).setContentText(NotificationCompat.i(p1)).setContentInfo(NotificationCompat.h(p1)).setSubText(NotificationCompat.x(p1)).setSettingsText(NotificationCompat.t(p1)).setStyle(oj).setContentIntent(p1.contentIntent).setGroup(NotificationCompat.l(p1)).setGroupSummary(NotificationCompat.B(p1)).setLocusId(NotificationCompat.p(p1)).setWhen(p1.when).setShowWhen(NotificationCompat.v(p1)).setUsesChronometer(NotificationCompat.z(p1)).setAutoCancel(NotificationCompat.b(p1)).setOnlyAlertOnce(NotificationCompat.r(p1)).setOngoing(NotificationCompat.q(p1)).setLocalOnly(NotificationCompat.o(p1)).setLargeIcon(p1.largeIcon).setBadgeIconType(NotificationCompat.c(p1)).setCategory(NotificationCompat.e(p1)).setBubbleMetadata(NotificationCompat.d(p1)).setNumber(p1.number).setTicker(p1.tickerText).setContentIntent(p1.contentIntent).setDeleteIntent(p1.deleteIntent).setFullScreenIntent(p1.fullScreenIntent, NotificationCompat.m(p1)).setSound(p1.sound, p1.audioStreamType).setVibrate(p1.vibrate).setLights(p1.ledARGB, p1.ledOnMS, p1.ledOffMS).setDefaults(p1.defaults).setPriority(p1.priority@000177).setColor@000875(NotificationCompat.g@0008da(p1)).setVisibility@0008a5(NotificationCompat.A@0008d2(p1)).setPublicVersion@000891(NotificationCompat.s@0008e6(p1)).setSortKey@00089b(NotificationCompat.w@0008ea(p1)).setTimeoutAfter@0008a2(NotificationCompat.y@0008ec(p1)).setShortcutId@000894(NotificationCompat.u@0008e8(p1)).setProgress@000890(extras.getInt@000687("android.progressMax"), extras.getInt@000687("android.progress"), extras.getBoolean@000684("android.progressIndeterminate")).setAllowSystemGeneratedContextualActions@00086e(NotificationCompat.a@0008d4(p1)).setSmallIcon@000899(p1.icon@000170, p1.iconLevel@000171).addExtras@000855(NotificationCompat$Builder.getExtrasWithoutDuplicateData@000867(p1, oj));
       if (Build$VERSION.SDK_INT >= 23) {
          this.mSmallIcon = p1.getSmallIcon();
       }
       Notification actions = p1.actions;
       int i = 0;
       if (actions != null && actions.length) {
          len = actions.length;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             this.addAction(NotificationCompat$b$a.d(actions[i1]).b());
          }
       }
       ArrayList uArrayList = NotificationCompat.n(p1);
       if (!uArrayList.isEmpty()) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             this.addInvisibleAction(iterator.next());
          }
       }
       String[] stringArray = p1.extras.getStringArray("android.people");
       if (stringArray != null && stringArray.length) {
          len = stringArray.length;
          for (; i < len; i = i + 1) {
             this.addPerson(stringArray[i]);
          }
       }
       if (Build$VERSION.SDK_INT >= 28) {
          ArrayList parcelableAr = p1.extras.getParcelableArrayList("android.people.list");
          if (parcelableAr != null && !parcelableAr.isEmpty()) {
             Iterator iterator1 = parcelableAr.iterator();
             while (iterator1.hasNext()) {
                this.addPerson(f.a(iterator1.next()));
             }
          }
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 24) {
          String str = "android.chronometerCountDown";
          if (extras.containsKey(str)) {
             this.setChronometerCountDown(extras.getBoolean(str));
          }
       }
       if (sDK_INT >= 26 && extras.containsKey("android.colorized")) {
          this.setColorized(extras.getBoolean("android.colorized"));
       }
       return;
    }
    public void NotificationCompat$Builder(Context p0,String p1){
       super();
       this.mActions = new ArrayList();
       this.mPersonList = new ArrayList();
       this.mInvisibleActions = new ArrayList();
       this.mShowWhen = true;
       this.mLocalOnly = false;
       this.mColor = 0;
       this.mVisibility = 0;
       this.mBadgeIcon = 0;
       this.mGroupAlertBehavior = 0;
       Notification notification = new Notification();
       this.mNotification = notification;
       this.mContext = p0;
       this.mChannelId = p1;
       notification.when = System.currentTimeMillis();
       p0.audioStreamType = -1;
       this.mPriority = 0;
       this.mPeople = new ArrayList();
       this.mAllowSystemGeneratedContextualActions = true;
    }
    public static Bundle getExtrasWithoutDuplicateData(Notification p0,NotificationCompat$j p1){
       if (p0.extras == null) {
          return null;
       }
       Bundle uBundle = new Bundle(p0.extras);
       uBundle.remove("android.title");
       uBundle.remove("android.text");
       uBundle.remove("android.infoText");
       uBundle.remove("android.subText");
       uBundle.remove("android.intent.extra.CHANNEL_ID");
       uBundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
       uBundle.remove("android.showWhen");
       uBundle.remove("android.progress");
       uBundle.remove("android.progressMax");
       uBundle.remove("android.progressIndeterminate");
       uBundle.remove("android.chronometerCountDown");
       uBundle.remove("android.colorized");
       uBundle.remove("android.people.list");
       uBundle.remove("android.people");
       uBundle.remove("android.support.sortKey");
       uBundle.remove("android.support.groupKey");
       uBundle.remove("android.support.isGroupSummary");
       uBundle.remove("android.support.localOnly");
       uBundle.remove("android.support.actionExtras");
       Bundle bundle = uBundle.getBundle("android.car.EXTENSIONS");
       if (bundle != null) {
          Bundle uBundle1 = new Bundle(bundle);
          uBundle1.remove("invisible_actions");
          uBundle.putBundle("android.car.EXTENSIONS", uBundle1);
       }
       if (p1 != null) {
          p1.f(uBundle);
       }
       return uBundle;
    }
    public static CharSequence limitCharSequenceLength(CharSequence p0){
       if (p0 == null) {
          return p0;
       }
       if (p0.length() > 5120) {
          p0 = p0.subSequence(0, 5120);
       }
       return p0;
    }
    public NotificationCompat$Builder addAction(int p0,CharSequence p1,PendingIntent p2){
       this.mActions.add(new NotificationCompat$b(p0, p1, p2));
       return this;
    }
    public NotificationCompat$Builder addAction(NotificationCompat$b p0){
       if (p0 != null) {
          this.mActions.add(p0);
       }
       return this;
    }
    public NotificationCompat$Builder addExtras(Bundle p0){
       if (p0 != null) {
          NotificationCompat$Builder tmExtras = this.mExtras;
          if (tmExtras == null) {
             this.mExtras = new Bundle(p0);
          }else {
             tmExtras.putAll(p0);
          }
       }
       return this;
    }
    public NotificationCompat$Builder addInvisibleAction(int p0,CharSequence p1,PendingIntent p2){
       this.mInvisibleActions.add(new NotificationCompat$b(p0, p1, p2));
       return this;
    }
    public NotificationCompat$Builder addInvisibleAction(NotificationCompat$b p0){
       if (p0 != null) {
          this.mInvisibleActions.add(p0);
       }
       return this;
    }
    public NotificationCompat$Builder addPerson(f p0){
       if (p0 != null) {
          this.mPersonList.add(p0);
       }
       return this;
    }
    public NotificationCompat$Builder addPerson(String p0){
       if (p0 != null && !p0.isEmpty()) {
          this.mPeople.add(p0);
       }
       return this;
    }
    public Notification build(){
       return new c(this).b();
    }
    public NotificationCompat$Builder clearActions(){
       this.mActions.clear();
       return this;
    }
    public NotificationCompat$Builder clearInvisibleActions(){
       this.mInvisibleActions.clear();
       Bundle bundle = this.mExtras.getBundle("android.car.EXTENSIONS");
       if (bundle != null) {
          Bundle uBundle = new Bundle(bundle);
          uBundle.remove("invisible_actions");
          this.mExtras.putBundle("android.car.EXTENSIONS", uBundle);
       }
       return this;
    }
    public NotificationCompat$Builder clearPeople(){
       this.mPersonList.clear();
       this.mPeople.clear();
       return this;
    }
    public RemoteViews createBigContentView(){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (this.mBigContentView != null && this.useExistingRemoteView()) {
          return this.mBigContentView;
       }
       c uoc = new c(this);
       NotificationCompat$Builder tmStyle = this.mStyle;
       if (tmStyle != null) {
          RemoteViews remoteViews = tmStyle.t(uoc);
          if (remoteViews != null) {
             return remoteViews;
          }
       }
       Notification notification = uoc.b();
       if (sDK_INT >= 24) {
          return Notification$Builder.recoverBuilder(this.mContext, notification).createBigContentView();
       }else {
          return notification.bigContentView;
       }
    }
    public RemoteViews createContentView(){
       if (this.mContentView != null && this.useExistingRemoteView()) {
          return this.mContentView;
       }
       c uoc = new c(this);
       NotificationCompat$Builder tmStyle = this.mStyle;
       if (tmStyle != null) {
          RemoteViews remoteViews = tmStyle.u(uoc);
          if (remoteViews != null) {
             return remoteViews;
          }
       }
       Notification notification = uoc.b();
       if (Build$VERSION.SDK_INT >= 24) {
          return Notification$Builder.recoverBuilder(this.mContext, notification).createContentView();
       }else {
          return notification.contentView;
       }
    }
    public RemoteViews createHeadsUpContentView(){
       int sDK_INT = Build$VERSION.SDK_INT;
       if (this.mHeadsUpContentView != null && this.useExistingRemoteView()) {
          return this.mHeadsUpContentView;
       }
       c uoc = new c(this);
       NotificationCompat$Builder tmStyle = this.mStyle;
       if (tmStyle != null) {
          RemoteViews remoteViews = tmStyle.v(uoc);
          if (remoteViews != null) {
             return remoteViews;
          }
       }
       Notification notification = uoc.b();
       if (sDK_INT >= 24) {
          return Notification$Builder.recoverBuilder(this.mContext, notification).createHeadsUpContentView();
       }else {
          return notification.headsUpContentView;
       }
    }
    public NotificationCompat$Builder extend(NotificationCompat$g p0){
       p0.a(this);
       return this;
    }
    public RemoteViews getBigContentView(){
       return this.mBigContentView;
    }
    public NotificationCompat$e getBubbleMetadata(){
       return this.mBubbleMetadata;
    }
    public int getColor(){
       return this.mColor;
    }
    public RemoteViews getContentView(){
       return this.mContentView;
    }
    public Bundle getExtras(){
       if (this.mExtras == null) {
          this.mExtras = new Bundle();
       }
       return this.mExtras;
    }
    public RemoteViews getHeadsUpContentView(){
       return this.mHeadsUpContentView;
    }
    public Notification getNotification(){
       return this.build();
    }
    public int getPriority(){
       return this.mPriority;
    }
    public long getWhenIfShowing(){
       Notification when = (this.mShowWhen != null)? this.mNotification.when: 0;
       return when;
    }
    public final Bitmap reduceLargeIconSize(Bitmap p0){
       if (p0 != null && Build$VERSION.SDK_INT < 27) {
          Resources resources = this.mContext.getResources();
          int i = c.b(resources, R.dimen.arg_RES_7f07017a);
          int i1 = c.b(resources, R.dimen.arg_RES_7f070179);
          if (p0.getWidth() <= i && p0.getHeight() <= i1) {
             return p0;
          }else {
             double d = Math.min(((double)i / (double)Math.max(1, p0.getWidth())), ((double)i1 / (double)Math.max(1, p0.getHeight())));
             p0 = Bitmap.createScaledBitmap(p0, (int)Math.ceil(((double)p0.getWidth() * d)), (int)Math.ceil(((double)p0.getHeight() * d)), 1);
          }
       }
       return p0;
    }
    public NotificationCompat$Builder setAllowSystemGeneratedContextualActions(boolean p0){
       this.mAllowSystemGeneratedContextualActions = p0;
       return this;
    }
    public NotificationCompat$Builder setAutoCancel(boolean p0){
       this.setFlag(16, p0);
       return this;
    }
    public NotificationCompat$Builder setBadgeIconType(int p0){
       this.mBadgeIcon = p0;
       return this;
    }
    public NotificationCompat$Builder setBubbleMetadata(NotificationCompat$e p0){
       this.mBubbleMetadata = p0;
       return this;
    }
    public NotificationCompat$Builder setCategory(String p0){
       this.mCategory = p0;
       return this;
    }
    public NotificationCompat$Builder setChannelId(String p0){
       this.mChannelId = p0;
       return this;
    }
    public NotificationCompat$Builder setChronometerCountDown(boolean p0){
       this.mChronometerCountDown = p0;
       this.getExtras().putBoolean("android.chronometerCountDown", p0);
       return this;
    }
    public NotificationCompat$Builder setColor(int p0){
       this.mColor = p0;
       return this;
    }
    public NotificationCompat$Builder setColorized(boolean p0){
       this.mColorized = p0;
       this.mColorizedSet = true;
       return this;
    }
    public NotificationCompat$Builder setContent(RemoteViews p0){
       this.mNotification.contentView = p0;
       return this;
    }
    public NotificationCompat$Builder setContentInfo(CharSequence p0){
       this.mContentInfo = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$Builder setContentIntent(PendingIntent p0){
       this.mContentIntent = p0;
       return this;
    }
    public NotificationCompat$Builder setContentText(CharSequence p0){
       this.mContentText = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$Builder setContentTitle(CharSequence p0){
       this.mContentTitle = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$Builder setCustomBigContentView(RemoteViews p0){
       this.mBigContentView = p0;
       return this;
    }
    public NotificationCompat$Builder setCustomContentView(RemoteViews p0){
       this.mContentView = p0;
       return this;
    }
    public NotificationCompat$Builder setCustomHeadsUpContentView(RemoteViews p0){
       this.mHeadsUpContentView = p0;
       return this;
    }
    public NotificationCompat$Builder setDefaults(int p0){
       NotificationCompat$Builder tmNotificati = this.mNotification;
       tmNotificati.defaults = p0;
       if (p0 & 0x04) {
          tmNotificati.flags = tmNotificati.flags | 0x01;
       }
       return this;
    }
    public NotificationCompat$Builder setDeleteIntent(PendingIntent p0){
       this.mNotification.deleteIntent = p0;
       return this;
    }
    public NotificationCompat$Builder setExtras(Bundle p0){
       this.mExtras = p0;
       return this;
    }
    public final void setFlag(int p0,boolean p1){
       NotificationCompat$Builder tmNotificati;
       if (p1) {
          tmNotificati = this.mNotification;
          tmNotificati.flags = p0 | tmNotificati.flags;
       }else {
          tmNotificati = this.mNotification;
          tmNotificati.flags = (~ p0) & tmNotificati.flags;
       }
       return;
    }
    public NotificationCompat$Builder setFullScreenIntent(PendingIntent p0,boolean p1){
       this.mFullScreenIntent = p0;
       this.setFlag(128, p1);
       return this;
    }
    public NotificationCompat$Builder setGroup(String p0){
       this.mGroupKey = p0;
       return this;
    }
    public NotificationCompat$Builder setGroupAlertBehavior(int p0){
       this.mGroupAlertBehavior = p0;
       return this;
    }
    public NotificationCompat$Builder setGroupSummary(boolean p0){
       this.mGroupSummary = p0;
       return this;
    }
    public NotificationCompat$Builder setLargeIcon(Bitmap p0){
       this.mLargeIcon = this.reduceLargeIconSize(p0);
       return this;
    }
    public NotificationCompat$Builder setLights(int p0,int p1,int p2){
       NotificationCompat$Builder tmNotificati = this.mNotification;
       tmNotificati.ledARGB = p0;
       tmNotificati.ledOnMS = p1;
       tmNotificati.ledOffMS = p2;
       p0 = (p1 && p2)? 1: 0;
       tmNotificati.flags = p0 | (tmNotificati.flags & 0xfe);
       return this;
    }
    public NotificationCompat$Builder setLocalOnly(boolean p0){
       this.mLocalOnly = p0;
       return this;
    }
    public NotificationCompat$Builder setLocusId(a p0){
       this.mLocusId = p0;
       return this;
    }
    public NotificationCompat$Builder setNotificationSilent(){
       this.mSilent = true;
       return this;
    }
    public NotificationCompat$Builder setNumber(int p0){
       this.mNumber = p0;
       return this;
    }
    public NotificationCompat$Builder setOngoing(boolean p0){
       this.setFlag(2, p0);
       return this;
    }
    public NotificationCompat$Builder setOnlyAlertOnce(boolean p0){
       this.setFlag(8, p0);
       return this;
    }
    public NotificationCompat$Builder setPriority(int p0){
       this.mPriority = p0;
       return this;
    }
    public NotificationCompat$Builder setProgress(int p0,int p1,boolean p2){
       this.mProgressMax = p0;
       this.mProgress = p1;
       this.mProgressIndeterminate = p2;
       return this;
    }
    public NotificationCompat$Builder setPublicVersion(Notification p0){
       this.mPublicVersion = p0;
       return this;
    }
    public NotificationCompat$Builder setRemoteInputHistory(CharSequence[] p0){
       this.mRemoteInputHistory = p0;
       return this;
    }
    public NotificationCompat$Builder setSettingsText(CharSequence p0){
       this.mSettingsText = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$Builder setShortcutId(String p0){
       this.mShortcutId = p0;
       return this;
    }
    public NotificationCompat$Builder setShortcutInfo(a p0){
       if (p0 == null) {
          return this;
       }
       this.mShortcutId = p0.c();
       if (this.mLocusId == null) {
          if (p0.d() != null) {
             this.mLocusId = p0.d();
          }else if(p0.c() != null){
             this.mLocusId = new a(p0.c());
          }
       }
       if (this.mContentTitle == null) {
          this.setContentTitle(p0.e());
       }
       return this;
    }
    public NotificationCompat$Builder setShowWhen(boolean p0){
       this.mShowWhen = p0;
       return this;
    }
    public NotificationCompat$Builder setSilent(boolean p0){
       this.mSilent = p0;
       return this;
    }
    public NotificationCompat$Builder setSmallIcon(int p0){
       this.mNotification.icon = p0;
       return this;
    }
    public NotificationCompat$Builder setSmallIcon(int p0,int p1){
       NotificationCompat$Builder tmNotificati = this.mNotification;
       tmNotificati.icon = p0;
       tmNotificati.iconLevel = p1;
       return this;
    }
    public NotificationCompat$Builder setSmallIcon(IconCompat p0){
       this.mSmallIcon = p0.J(this.mContext);
       return this;
    }
    public NotificationCompat$Builder setSortKey(String p0){
       this.mSortKey = p0;
       return this;
    }
    public NotificationCompat$Builder setSound(Uri p0){
       NotificationCompat$Builder tmNotificati = this.mNotification;
       tmNotificati.sound = p0;
       tmNotificati.audioStreamType = -1;
       tmNotificati.audioAttributes = new AudioAttributes$Builder().setContentType(4).setUsage(5).build();
       return this;
    }
    public NotificationCompat$Builder setSound(Uri p0,int p1){
       NotificationCompat$Builder tmNotificati = this.mNotification;
       tmNotificati.sound = p0;
       tmNotificati.audioStreamType = p1;
       tmNotificati.audioAttributes = new AudioAttributes$Builder().setContentType(4).setLegacyStreamType(p1).build();
       return this;
    }
    public NotificationCompat$Builder setStyle(NotificationCompat$j p0){
       if (this.mStyle != p0) {
          this.mStyle = p0;
          if (p0 != null) {
             p0.x(this);
          }
       }
       return this;
    }
    public NotificationCompat$Builder setSubText(CharSequence p0){
       this.mSubText = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$Builder setTicker(CharSequence p0){
       this.mNotification.tickerText = NotificationCompat$Builder.limitCharSequenceLength(p0);
       return this;
    }
    public NotificationCompat$Builder setTicker(CharSequence p0,RemoteViews p1){
       this.mNotification.tickerText = NotificationCompat$Builder.limitCharSequenceLength(p0);
       this.mTickerView = p1;
       return this;
    }
    public NotificationCompat$Builder setTimeoutAfter(long p0){
       this.mTimeout = p0;
       return this;
    }
    public NotificationCompat$Builder setUsesChronometer(boolean p0){
       this.mUseChronometer = p0;
       return this;
    }
    public NotificationCompat$Builder setVibrate(long[] p0){
       this.mNotification.vibrate = p0;
       return this;
    }
    public NotificationCompat$Builder setVisibility(int p0){
       this.mVisibility = p0;
       return this;
    }
    public NotificationCompat$Builder setWhen(long p0){
       this.mNotification.when = p0;
       return this;
    }
    public final boolean useExistingRemoteView(){
       NotificationCompat$Builder tmStyle = this.mStyle;
       boolean b = (tmStyle == null || !tmStyle.p())? true: false;
       return b;
    }
}
