package androidx.core.app.NotificationCompat$i$a;
import java.lang.CharSequence;
import androidx.core.app.f;
import java.lang.Object;
import android.os.Bundle;
import java.util.List;
import java.lang.String;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.app.Person;
import androidx.core.app.f$a;
import android.net.Uri;
import java.util.ArrayList;
import android.app.Notification$MessagingStyle$Message;

public final class NotificationCompat$i$a	// class@0006ed
{
    public final CharSequence a;
    public final long b;
    public final f c;
    public Bundle d;
    public String e;
    public Uri f;

    public void NotificationCompat$i$a(CharSequence p0,long p1,f p2){
       super();
       this.d = new Bundle();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static Bundle[] a(List p0){
       Bundle[] uBundleArray = new Bundle[p0.size()];
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uBundleArray[i1] = p0.get(i1).l();
       }
       return uBundleArray;
    }
    public static NotificationCompat$i$a e(Bundle p0){
       f uof;
       String str = "uri";
       String str1 = "type";
       String str2 = "sender";
       String str3 = "sender_person";
       String str4 = "person";
       String str5 = "time";
       NotificationCompat$i$a oi$a = null;
       try{
          if (!p0.containsKey("text") || !p0.containsKey(str5)) {
             return oi$a;
          }
          if (p0.containsKey(str4)) {
             uof = f.b(p0.getBundle(str4));
          }else if(p0.containsKey(str3) && Build$VERSION.SDK_INT >= 28){
             uof = f.a(p0.getParcelable(str3));
          }else if(p0.containsKey(str2)){
             f$a uoa = new f$a();
             uoa.f(p0.getCharSequence(str2));
             uof = uoa.a();
          }else {
             uof = oi$a;
          }
          NotificationCompat$i$a oi$a1 = new NotificationCompat$i$a(p0.getCharSequence("text"), p0.getLong(str5), uof);
          if (p0.containsKey(str1) && p0.containsKey(str)) {
             oi$a1.j(p0.getString(str1), p0.getParcelable(str));
          }
          if (p0.containsKey("extras")) {
             oi$a1.d().putAll(p0.getBundle("extras"));
          }
          return oi$a1;
       }catch(java.lang.ClassCastException e0){
       }
    }
    public static List f(Parcelable[] p0){
       ArrayList uArrayList = new ArrayList(p0.length);
       int i = 0;
       while (i < p0.length) {
          if (p0[i] instanceof Bundle) {
             NotificationCompat$i$a oi$a = NotificationCompat$i$a.e(p0[i]);
             if (oi$a != null) {
                uArrayList.add(oi$a);
             }
          }
          i = i + 1;
       }
       return uArrayList;
    }
    public String b(){
       return this.e;
    }
    public Uri c(){
       return this.f;
    }
    public Bundle d(){
       return this.d;
    }
    public f g(){
       return this.c;
    }
    public CharSequence h(){
       return this.a;
    }
    public long i(){
       return this.b;
    }
    public NotificationCompat$i$a j(String p0,Uri p1){
       this.e = p0;
       this.f = p1;
       return this;
    }
    public Notification$MessagingStyle$Message k(){
       CharSequence uCharSequenc;
       long l;
       Notification$MessagingStyle$Message messagingSty;
       f uof = this.g();
       Person person = null;
       if (Build$VERSION.SDK_INT >= 28) {
          uCharSequenc = this.h();
          l = this.i();
          if (uof != null) {
             person = uof.j();
          }
          messagingSty = new Notification$MessagingStyle$Message(uCharSequenc, l, person);
       }else {
          uCharSequenc = this.h();
          l = this.i();
          if (uof != null) {
             person = uof.e();
          }
          messagingSty = new Notification$MessagingStyle$Message(uCharSequenc, l, person);
       }
       if (this.b() != null) {
          messagingSty.setData(this.b(), this.c());
       }
       return messagingSty;
    }
    public final Bundle l(){
       Bundle uBundle = new Bundle();
       NotificationCompat$i$a ta = this.a;
       if (ta != null) {
          uBundle.putCharSequence("text", ta);
       }
       uBundle.putLong("time", this.b);
       ta = this.c;
       if (ta != null) {
          uBundle.putCharSequence("sender", ta.e());
          if (Build$VERSION.SDK_INT >= 28) {
             uBundle.putParcelable("sender_person", this.c.j());
          }else {
             uBundle.putBundle("person", this.c.k());
          }
       }
       ta = this.e;
       if (ta != null) {
          uBundle.putString("type", ta);
       }
       ta = this.f;
       if (ta != null) {
          uBundle.putParcelable("uri", ta);
       }
       ta = this.d;
       if (ta != null) {
          uBundle.putBundle("extras", ta);
       }
       return uBundle;
    }
}
