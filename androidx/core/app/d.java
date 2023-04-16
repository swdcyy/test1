package androidx.core.app.d;
import java.lang.Object;
import android.os.Bundle;
import l1.f;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.lang.CharSequence;
import java.util.Set;
import androidx.core.app.NotificationCompat$b;
import android.os.Parcelable;
import android.app.PendingIntent;
import java.lang.Class;
import java.util.Arrays;
import androidx.core.graphics.drawable.IconCompat;

public class d	// class@0006fe
{
    public static final Object a;
    public static Field b;
    public static boolean c;
    public static final Object d;
    public static Field e;
    public static Field f;
    public static Field g;
    public static Field h;
    public static boolean i;

    static {
       d.a = new Object();
       d.d = new Object();
    }
    public static f a(Bundle p0){
       Iterator iterator;
       ArrayList stringArrayL = p0.getStringArrayList("allowedDataTypes");
       HashSet hashSet = new HashSet();
       if (stringArrayL != null) {
          iterator = stringArrayL.iterator();
          while (iterator.hasNext()) {
             hashSet.add(iterator.next());
          }
       }
       f uof = new f(p0.getString("resultKey"), p0.getCharSequence("label"), p0.getCharSequenceArray("choices"), p0.getBoolean("allowFreeFormInput"), 0, p0.getBundle("extras"), hashSet);
       return iterator;
    }
    public static f[] b(Bundle[] p0){
       if (p0 == null) {
          return null;
       }
       f[] uofArray = new f[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uofArray[i] = d.a(p0[i]);
       }
       return uofArray;
    }
    public static NotificationCompat$b c(Bundle p0){
       String str = "extras";
       Bundle bundle = p0.getBundle(str);
       boolean b = false;
       boolean b1 = (bundle != null)? bundle.getBoolean("android.support.allowGeneratedReplies", b): false;
       NotificationCompat$b uob = new NotificationCompat$b(p0.getInt("icon"), p0.getCharSequence("title"), p0.getParcelable("actionIntent"), p0.getBundle(str), d.b(d.d(p0, "remoteInputs")), d.b(d.d(p0, "dataOnlyRemoteInputs")), b1, p0.getInt("semanticAction"), p0.getBoolean("showsUserInterface"), false);
       return bundle;
    }
    public static Bundle[] d(Bundle p0,String p1){
       Parcelable[] parcelableAr = p0.getParcelableArray(p1);
       if (parcelableAr instanceof Bundle[] || parcelableAr == null) {
          return parcelableAr;
       }
       Bundle[] uBundleArray = Arrays.copyOf(parcelableAr, parcelableAr.length, Bundle[].class);
       p0.putParcelableArray(p1, uBundleArray);
       return uBundleArray;
    }
    public static Bundle e(NotificationCompat$b p0){
       Bundle uBundle = new Bundle();
       IconCompat iconCompat = p0.d();
       int i = (iconCompat != null)? iconCompat.t(): 0;
       uBundle.putInt("icon", i);
       uBundle.putCharSequence("title", p0.h());
       uBundle.putParcelable("actionIntent", p0.a());
       Bundle uBundle1 = (p0.c() != null)? new Bundle(p0.c()): new Bundle();
       uBundle1.putBoolean("android.support.allowGeneratedReplies", p0.b());
       uBundle.putBundle("extras", uBundle1);
       uBundle.putParcelableArray("remoteInputs", d.g(p0.e()));
       uBundle.putBoolean("showsUserInterface", p0.g());
       uBundle.putInt("semanticAction", p0.f());
       return uBundle;
    }
    public static Bundle f(f p0){
       Bundle uBundle = new Bundle();
       uBundle.putString("resultKey", p0.j());
       uBundle.putCharSequence("label", p0.i());
       uBundle.putCharSequenceArray("choices", p0.f());
       uBundle.putBoolean("allowFreeFormInput", p0.d());
       uBundle.putBundle("extras", p0.h());
       Set set = p0.e();
       if (set != null && !set.isEmpty()) {
          ArrayList uArrayList = new ArrayList(set.size());
          Iterator iterator = set.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(iterator.next());
          }
          uBundle.putStringArrayList("allowedDataTypes", uArrayList);
       }
       return uBundle;
    }
    public static Bundle[] g(f[] p0){
       if (p0 == null) {
          return null;
       }
       Bundle[] uBundleArray = new Bundle[p0.length];
       for (int i = 0; i < p0.length; i = i + 1) {
          uBundleArray[i] = d.f(p0[i]);
       }
       return uBundleArray;
    }
}
