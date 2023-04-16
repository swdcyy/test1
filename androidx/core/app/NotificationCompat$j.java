package androidx.core.app.NotificationCompat$j;
import java.lang.Object;
import java.lang.String;
import androidx.core.app.NotificationCompat$i;
import androidx.core.app.NotificationCompat$d;
import androidx.core.app.NotificationCompat$h;
import androidx.core.app.NotificationCompat$c;
import androidx.core.app.NotificationCompat$f;
import android.os.Build$VERSION;
import android.app.Notification$BigPictureStyle;
import java.lang.Class;
import android.app.Notification$BigTextStyle;
import android.app.Notification$InboxStyle;
import android.app.Notification$MessagingStyle;
import android.app.Notification$DecoratedCustomViewStyle;
import android.os.Bundle;
import android.app.Notification;
import androidx.core.app.NotificationCompat;
import java.lang.CharSequence;
import l1.e;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat$Builder;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.Bitmap;
import cw9.c;
import java.text.NumberFormat;
import android.os.SystemClock;
import java.lang.System;
import android.content.res.Configuration;
import java.lang.Math;
import androidx.core.graphics.drawable.IconCompat;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap$Config;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.ColorFilter;
import android.graphics.Canvas;

public abstract class NotificationCompat$j	// class@0006ef
{
    public NotificationCompat$Builder a;
    public CharSequence b;
    public CharSequence c;
    public boolean d;

    public void NotificationCompat$j(){
       super();
       this.d = false;
    }
    public static float g(float p0,float p1,float p2){
       if (p0 - p1 < 0) {
          p0 = p1;
       }else if(p0 - p2 > 0){
          p0 = p2;
       }
       return p0;
    }
    public static NotificationCompat$j h(String p0){
       if (p0 != null) {
          int i = -1;
          switch (p0.hashCode()){
              case 0xd547f264:
                if (p0.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                   i = 0;
                }
                break;
              case 0xf5c04fb3:
                if (p0.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                   i = 1;
                }
                break;
              case 0x366a678b:
                if (p0.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                   i = 2;
                }
                break;
              case 0x36cfe824:
                if (p0.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                   i = 3;
                }
                break;
              case 0x7c9f11cd:
                if (p0.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                   i = 4;
                }
                break;
              default:
          }
          switch (i){
              case 0:
                return new NotificationCompat$f();
              case 1:
                return new NotificationCompat$c();
              case 2:
                return new NotificationCompat$h();
              case 3:
                return new NotificationCompat$d();
              case 4:
                return new NotificationCompat$i();
              default:
          }
       }
       return null;
    }
    public static NotificationCompat$j i(String p0){
       if (p0 == null) {
          return null;
       }
       int sDK_INT = Build$VERSION.SDK_INT;
       if (p0.equals(Notification$BigPictureStyle.class.getName())) {
          return new NotificationCompat$c();
       }
       if (p0.equals(Notification$BigTextStyle.class.getName())) {
          return new NotificationCompat$d();
       }
       if (p0.equals(Notification$InboxStyle.class.getName())) {
          return new NotificationCompat$h();
       }
       if (sDK_INT >= 24) {
          if (p0.equals(Notification$MessagingStyle.class.getName())) {
             return new NotificationCompat$i();
          }else if(p0.equals(Notification$DecoratedCustomViewStyle.class.getName())){
             return new NotificationCompat$f();
          }
       }
       return null;
    }
    public static NotificationCompat$j j(Bundle p0){
       NotificationCompat$j oj = NotificationCompat$j.h(p0.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
       if (oj != null) {
          return oj;
       }
       if (p0.containsKey("android.selfDisplayName") || p0.containsKey("android.messagingStyleUser")) {
          return new NotificationCompat$i();
       }
       if (p0.containsKey("android.picture")) {
          return new NotificationCompat$c();
       }
       if (p0.containsKey("android.bigText")) {
          return new NotificationCompat$d();
       }
       if (p0.containsKey("android.textLines")) {
          return new NotificationCompat$h();
       }
       return NotificationCompat$j.i(p0.getString("android.template"));
    }
    public static NotificationCompat$j k(Bundle p0){
       NotificationCompat$j oj = NotificationCompat$j.j(p0);
       if (oj == null) {
          return null;
       }
       try{
          oj.w(p0);
          return oj;
       }catch(java.lang.ClassCastException e0){
          return v1;
       }
    }
    public static NotificationCompat$j q(Notification p0){
       Bundle uBundle = NotificationCompat.k(p0);
       if (uBundle == null) {
          return null;
       }
       return NotificationCompat$j.k(uBundle);
    }
    public void a(Bundle p0){
       if (this.d != null) {
          p0.putCharSequence("android.summaryText", this.c);
       }
       NotificationCompat$j tb = this.b;
       if (tb != null) {
          p0.putCharSequence("android.title.big", tb);
       }
       String str = this.r();
       if (str != null) {
          p0.putString("androidx.core.app.extra.COMPAT_TEMPLATE", str);
       }
       return;
    }
    public void b(e p0){
    }
    public RemoteViews c(boolean p0,int p1,boolean p2){
       NotificationCompat$j ta1;
       int i3;
       int i5;
       int i6;
       Resources resources = this.a.mContext.getResources();
       RemoteViews remoteViews = new RemoteViews(this.a.mContext.getPackageName(), p1);
       this.a.getPriority();
       p1 = Build$VERSION.SDK_INT;
       NotificationCompat$j ta = this.a;
       int i = 0x7f0a130c;
       int i1 = 0;
       if (ta.mLargeIcon != null) {
          remoteViews.setViewVisibility(i, i1);
          remoteViews.setImageViewBitmap(i, this.a.mLargeIcon);
          if (p0 && this.a.mNotification.icon != null) {
             int i2 = c.b(resources, R.dimen.arg_RES_7f070c2d);
             ta1 = this.a;
             i3 = 0x7f0a3653;
             remoteViews.setImageViewBitmap(i3, this.o(ta1.mNotification.icon, i2, (i2 - (c.b(resources, R.dimen.arg_RES_7f070c2f) * 2)), ta1.getColor()));
             remoteViews.setViewVisibility(i3, i1);
          }
       }else if(p0 && ta.mNotification.icon != null){
          remoteViews.setViewVisibility(i, i1);
          ta1 = this.a;
          remoteViews.setImageViewBitmap(i, this.o(ta1.mNotification.icon, (c.b(resources, R.dimen.arg_RES_7f070c2a) - c.b(resources, R.dimen.arg_RES_7f070c27)), c.b(resources, R.dimen.arg_RES_7f070c30), ta1.getColor()));
       }
       NotificationCompat$Builder mContentTitl = this.a.mContentTitle;
       if (mContentTitl != null) {
          remoteViews.setTextViewText(R.id.title, mContentTitl);
       }
       mContentTitl = this.a.mContentText;
       i3 = 0x7f0a3deb;
       boolean b = true;
       if (mContentTitl != null) {
          remoteViews.setTextViewText(i3, mContentTitl);
          mContentTitl = 1;
       }else {
          mContentTitl = 0;
       }
       ta1 = this.a;
       NotificationCompat$Builder mContentInfo = ta1.mContentInfo;
       int i4 = 0x7f0a13e9;
       if (mContentInfo != null) {
          remoteViews.setTextViewText(i4, mContentInfo);
          remoteViews.setViewVisibility(i4, i1);
       }else if(ta1.mNumber > null){
          if (this.a.mNumber > resources.getInteger(0x7f0b0042)) {
             remoteViews.setTextViewText(i4, resources.getString(R.string.arg_RES_7f104aa0));
          }else {
             remoteViews.setTextViewText(i4, NumberFormat.getIntegerInstance().format((long)this.a.mNumber));
          }
          remoteViews.setViewVisibility(i4, i1);
       }else {
          remoteViews.setViewVisibility(i4, 8);
          i5 = 0;
       label_00fa :
          NotificationCompat$Builder mSubText = this.a.mSubText;
          if (mSubText != null) {
             remoteViews.setTextViewText(i3, mSubText);
             mSubText = this.a.mContentText;
             i = 0x7f0a3ded;
             if (mSubText != null) {
                remoteViews.setTextViewText(i, mSubText);
                remoteViews.setViewVisibility(i, i1);
                mSubText = 1;
             label_0118 :
                if (mSubText) {
                   if (p2) {
                      remoteViews.setTextViewTextSize(i3, i1, (float)c.b(resources, R.dimen.arg_RES_7f070c31));
                   }
                   remoteViews.setViewPadding(R.id.line1, 0, 0, 0, 0);
                }
                if (this.a.getWhenIfShowing()) {
                   if (this.a.mUseChronometer != null) {
                      i6 = 0x7f0a06f4;
                      remoteViews.setViewVisibility(i6, i1);
                      remoteViews.setLong(i6, "setBase", (this.a.getWhenIfShowing() + (SystemClock.elapsedRealtime() - System.currentTimeMillis())));
                      remoteViews.setBoolean(i6, "setStarted", b);
                      NotificationCompat$Builder mChronometer = this.a.mChronometerCountDown;
                      if (mChronometer != null && p1 >= 24) {
                         remoteViews.setChronometerCountDown(i6, mChronometer);
                      }
                   }else {
                      p1 = 0x7f0a3ee1;
                      remoteViews.setViewVisibility(p1, i1);
                      remoteViews.setLong(p1, "setTime", this.a.getWhenIfShowing());
                   }
                }else {
                   b = i5;
                }
                p1 = 0x7f0a3664;
                i6 = (b)? 0: 8;
                remoteViews.setViewVisibility(p1, i6);
                if (!mContentTitl) {
                   i1 = 8;
                }
                remoteViews.setViewVisibility(R.id.line3, i1);
                return remoteViews;
             }else {
                remoteViews.setViewVisibility(i, 8);
             }
          }
          mSubText = 0;
          goto label_0118 ;
       }
       mContentTitl = 1;
       i5 = 1;
       goto label_00fa ;
    }
    public void d(RemoteViews p0,RemoteViews p1){
       this.s(p0);
       p0.removeAllViews(R.id.notification_main_column);
       p0.addView(R.id.notification_main_column, p1.clone());
       p0.setViewVisibility(R.id.notification_main_column, 0);
       p0.setViewPadding(R.id.notification_main_column_container, 0, this.e(), 0, 0);
    }
    public final int e(){
       Resources resources = this.a.mContext.getResources();
       int i = c.b(resources, R.dimen.arg_RES_7f070c32);
       int i1 = c.b(resources, R.dimen.arg_RES_7f070c33);
       float f = (NotificationCompat$j.g(resources.getConfiguration().fontScale, 0x3f800000, 0x3fa66666) - 0x3f800000) / 0.30f;
       return Math.round((((0x3f800000 - f) * (float)i) + (f * (float)i1)));
    }
    public void f(Bundle p0){
       p0.remove("android.summaryText");
       p0.remove("android.title.big");
       p0.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }
    public final Bitmap l(int p0,int p1,int p2){
       return this.n(IconCompat.q(this.a.mContext, p0), p1, p2);
    }
    public Bitmap m(IconCompat p0,int p1){
       return this.n(p0, p1, 0);
    }
    public final Bitmap n(IconCompat p0,int p1,int p2){
       Drawable uDrawable = p0.D(this.a.mContext);
       int intrinsicWid = (!p2)? uDrawable.getIntrinsicWidth(): p2;
       if (!p2) {
          p2 = uDrawable.getIntrinsicHeight();
       }
       Bitmap uBitmap = Bitmap.createBitmap(intrinsicWid, p2, Bitmap$Config.ARGB_8888);
       uDrawable.setBounds(0, 0, intrinsicWid, p2);
       if (p1) {
          uDrawable.mutate().setColorFilter(new PorterDuffColorFilter(p1, PorterDuff$Mode.SRC_IN));
       }
       uDrawable.draw(new Canvas(uBitmap));
       return uBitmap;
    }
    public final Bitmap o(int p0,int p1,int p2,int p3){
       if (!p3) {
          p3 = 0;
       }
       Bitmap uBitmap = this.l(R.drawable.arg_RES_7f081a33, p3, p1);
       Drawable uDrawable = this.a.mContext.getResources().getDrawable(p0).mutate();
       uDrawable.setFilterBitmap(true);
       p1 = (p1 - p2) / 2;
       uDrawable.setBounds(p1, p1, (p2 + p1), (p2 + p1));
       uDrawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff$Mode.SRC_ATOP));
       uDrawable.draw(new Canvas(uBitmap));
       return uBitmap;
    }
    public boolean p(){
       return this instanceof NotificationCompat$f;
    }
    public String r(){
       return null;
    }
    public final void s(RemoteViews p0){
       p0.setViewVisibility(R.id.title, 8);
       p0.setViewVisibility(R.id.text2, 8);
       p0.setViewVisibility(R.id.text, 8);
    }
    public RemoteViews t(e p0){
       return null;
    }
    public RemoteViews u(e p0){
       return null;
    }
    public RemoteViews v(e p0){
       return null;
    }
    public void w(Bundle p0){
       String str = "android.summaryText";
       if (p0.containsKey(str)) {
          this.c = p0.getCharSequence(str);
          this.d = true;
       }
       this.b = p0.getCharSequence("android.title.big");
       return;
    }
    public void x(NotificationCompat$Builder p0){
       if (this.a != p0) {
          this.a = p0;
          if (p0 != null) {
             p0.setStyle(this);
          }
       }
       return;
    }
}
