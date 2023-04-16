package androidx.core.app.NotificationCompat$i;
import androidx.core.app.NotificationCompat$j;
import java.util.ArrayList;
import androidx.core.app.f;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import java.lang.String;
import androidx.core.app.f$a;
import androidx.core.app.NotificationCompat$Builder;
import android.content.pm.ApplicationInfo;
import android.content.Context;
import java.lang.Boolean;
import android.text.style.TextAppearanceSpan;
import android.content.res.ColorStateList;
import androidx.core.app.NotificationCompat$i$a;
import y1.a;
import android.text.SpannableStringBuilder;
import java.lang.Object;
import android.os.Bundle;
import java.util.List;
import android.os.Parcelable;
import l1.e;
import android.os.Build$VERSION;
import android.app.Notification$MessagingStyle;
import android.app.Person;
import java.util.Iterator;
import android.app.Notification$MessagingStyle$Message;
import androidx.core.app.c;
import android.app.Notification$Builder;
import android.app.Notification$BigTextStyle;
import java.util.Collection;

public class NotificationCompat$i extends NotificationCompat$j	// class@0006ee
{
    public final List e;
    public final List f;
    public f g;
    public CharSequence h;
    public Boolean i;

    public void NotificationCompat$i(){
       super();
       this.e = new ArrayList();
       this.f = new ArrayList();
    }
    public void NotificationCompat$i(f p0){
       super();
       this.e = new ArrayList();
       this.f = new ArrayList();
       if (TextUtils.isEmpty(p0.e())) {
          throw new IllegalArgumentException("User\'s name must not be empty.");
       }
       this.g = p0;
       return;
    }
    public void NotificationCompat$i(CharSequence p0){
       super();
       this.e = new ArrayList();
       this.f = new ArrayList();
       f$a uoa = new f$a();
       uoa.f(p0);
       this.g = uoa.a();
    }
    public boolean A(){
       NotificationCompat$j ta = this.a;
       boolean b = false;
       if (ta != null && (ta.mContext.getApplicationInfo().targetSdkVersion < 28 && this.i == null)) {
          if (this.h != null) {
             b = true;
          }
          return b;
       }else {
          NotificationCompat$i ti = this.i;
          if (ti != null) {
             b = ti.booleanValue();
          }
          return b;
       }
    }
    public final TextAppearanceSpan B(int p0){
       TextAppearanceSpan textAppearan = new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(p0), null);
       return v6;
    }
    public final CharSequence C(NotificationCompat$i$a p0){
       a uoa = a.c();
       SpannableStringBuilder spannableStr = new SpannableStringBuilder();
       NotificationCompat$j oj = 0xff000000;
       String str = "";
       String str1 = (p0.g() == null)? str: p0.g().e();
       if (TextUtils.isEmpty(str1)) {
          str1 = this.g.e();
          if (this.a.getColor()) {
             oj = this.a.getColor();
          }
       }
       CharSequence uCharSequenc = uoa.i(str1);
       spannableStr.append(uCharSequenc);
       spannableStr.setSpan(this.B(oj), (spannableStr.length() - uCharSequenc.length()), spannableStr.length(), 33);
       if (p0.h() != null) {
          str = p0.h();
       }
       spannableStr.append("  ");
       spannableStr.append(uoa.i(str));
       return spannableStr;
    }
    public NotificationCompat$i D(boolean p0){
       this.i = Boolean.valueOf(p0);
       return this;
    }
    public void a(Bundle p0){
       super.a(p0);
       p0.putCharSequence("android.selfDisplayName", this.g.e());
       p0.putBundle("android.messagingStyleUser", this.g.k());
       p0.putCharSequence("android.hiddenConversationTitle", this.h);
       if (this.h != null && this.i.booleanValue()) {
          p0.putCharSequence("android.conversationTitle", this.h);
       }
       if (!this.e.isEmpty()) {
          p0.putParcelableArray("android.messages", NotificationCompat$i$a.a(this.e));
       }
       if (!this.f.isEmpty()) {
          p0.putParcelableArray("android.messages.historic", NotificationCompat$i$a.a(this.f));
       }
       NotificationCompat$i ti = this.i;
       if (ti != null) {
          p0.putBoolean("android.isGroupConversation", ti.booleanValue());
       }
       return;
    }
    public void b(e p0){
       this.D(this.A());
       int sDK_INT = Build$VERSION.SDK_INT;
       if (sDK_INT >= 24) {
          NotificationCompat$i oi = 28;
          Notification$MessagingStyle messagingSty = (sDK_INT >= oi)? new Notification$MessagingStyle(this.g.j()): new Notification$MessagingStyle(this.g.e());
          Iterator iterator = this.e.iterator();
          while (iterator.hasNext()) {
             messagingSty.addMessage(iterator.next().k());
          }
          if (Build$VERSION.SDK_INT >= 26) {
             iterator = this.f.iterator();
             while (iterator.hasNext()) {
                messagingSty.addHistoricMessage(iterator.next().k());
             }
          }
          if (this.i.booleanValue() || Build$VERSION.SDK_INT >= oi) {
             messagingSty.setConversationTitle(this.h);
          }
          if (Build$VERSION.SDK_INT >= oi) {
             messagingSty.setGroupConversation(this.i.booleanValue());
          }
          messagingSty.setBuilder(p0.getBuilder());
       }else {
          NotificationCompat$i$a oi$a = this.y();
          if (this.h != null && this.i.booleanValue()) {
             p0.getBuilder().setContentTitle(this.h);
          }else if(oi$a != null){
             c uoc = p0;
             uoc.getBuilder().setContentTitle("");
             if (oi$a.g() != null) {
                uoc.getBuilder().setContentTitle(oi$a.g().e());
             }
          }
          if (oi$a != null) {
             Notification$Builder builder = p0.getBuilder();
             CharSequence uCharSequenc = (this.h != null)? this.C(oi$a): oi$a.h();
             builder.setContentText(uCharSequenc);
          }
          SpannableStringBuilder spannableStr = new SpannableStringBuilder();
          Notification$BigTextStyle uBigTextStyl = (this.h != null || this.z())? 1: null;
          for (int i = this.e.size() - 1; i >= 0; i = i - 1) {
             NotificationCompat$i$a oi$a1 = this.e.get(i);
             CharSequence uCharSequenc1 = (uBigTextStyl)? this.C(oi$a1): oi$a1.h();
             int i1 = this.e.size() - 1;
             if (i != i1) {
                spannableStr.insert(0, "\n");
             }
             spannableStr.insert(0, uCharSequenc1);
          }
          new Notification$BigTextStyle(p0.getBuilder()).setBigContentTitle(null).bigText(spannableStr);
       }
       return;
    }
    public void f(Bundle p0){
       super.f(p0);
       p0.remove("android.messagingStyleUser");
       p0.remove("android.selfDisplayName");
       p0.remove("android.conversationTitle");
       p0.remove("android.hiddenConversationTitle");
       p0.remove("android.messages");
       p0.remove("android.messages.historic");
       p0.remove("android.isGroupConversation");
    }
    public String r(){
       return "androidx.core.app.NotificationCompat$MessagingStyle";
    }
    public void w(Bundle p0){
       super.w(p0);
       this.e.clear();
       String str = "android.messagingStyleUser";
       if (p0.containsKey(str)) {
          this.g = f.b(p0.getBundle(str));
       }else {
          f$a uoa = new f$a();
          uoa.f(p0.getString("android.selfDisplayName"));
          this.g = uoa.a();
       }
       CharSequence charSequence = p0.getCharSequence("android.conversationTitle");
       this.h = charSequence;
       if (charSequence == null) {
          this.h = p0.getCharSequence("android.hiddenConversationTitle");
       }
       Parcelable[] parcelableAr = p0.getParcelableArray("android.messages");
       if (parcelableAr != null) {
          this.e.addAll(NotificationCompat$i$a.f(parcelableAr));
       }
       parcelableAr = p0.getParcelableArray("android.messages.historic");
       if (parcelableAr != null) {
          this.f.addAll(NotificationCompat$i$a.f(parcelableAr));
       }
       if (p0.containsKey("android.isGroupConversation")) {
          this.i = Boolean.valueOf(p0.getBoolean("android.isGroupConversation"));
       }
       return;
    }
    public final NotificationCompat$i$a y(){
       NotificationCompat$i$a oi$a;
       int i = this.e.size() - 1;
       while (true) {
          if (i >= 0) {
             oi$a = this.e.get(i);
             if (oi$a.g() != null && !TextUtils.isEmpty(oi$a.g().e())) {
                break ;
             }else {
                i = i - 1;
             }
          }else if(!this.e.isEmpty()){
             NotificationCompat$i te = this.e;
             return te.get((te.size() - 1));
          }else {
             return null;
          }
       }
       return oi$a;
    }
    public final boolean z(){
       int i = this.e.size() - 1;
       while (true) {
          if (i < 0) {
             return false;
          }
          NotificationCompat$i$a oi$a = this.e.get(i);
          if (oi$a.g() != null && oi$a.g().e() == null) {
             break ;
          }else {
             i = i - 1;
          }
       }
       return 1;
    }
}
