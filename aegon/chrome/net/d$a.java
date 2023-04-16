package aegon.chrome.net.d$a;
import aegon.chrome.net.i;
import java.lang.Object;
import android.content.Context;
import java.util.ArrayList;
import aegon.chrome.net.e;
import java.util.LinkedHashSet;
import android.content.res.Resources;
import java.lang.String;
import java.util.Set;
import java.util.Collection;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import aegon.chrome.net.c;
import java.util.Comparator;
import aegon.chrome.net.d;
import android.util.Log;
import java.lang.RuntimeException;

public class d$a	// class@0001af
{
    public final i a;

    public void d$a(i p0){
       super();
       this.a = p0;
    }
    public void d$a(Context p0){
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       int identifier = p0.getResources().getIdentifier("CronetProviderClassName", "string", p0.getPackageName());
       if (!identifier) {
       }else {
          String str = p0.getResources().getString(identifier);
          if (str == null || (str.equals("com.google.android.gms.net.PlayServicesCronetProvider") || (str.equals("com.google.android.gms.net.GmsCoreCronetProvider") || (!str.equals("aegon.chrome.net.impl.JavaCronetProvider") && !str.equals("aegon.chrome.net.impl.NativeCronetProvider"))))) {
             e.a(p0, str, linkedHashSe, 1);
          }
       }
    label_004b :
       e.a(p0, "com.google.android.gms.net.PlayServicesCronetProvider", linkedHashSe, false);
       e.a(p0, "com.google.android.gms.net.GmsCoreCronetProvider", linkedHashSe, false);
       e.a(p0, "aegon.chrome.net.impl.NativeCronetProvider", linkedHashSe, false);
       e.a(p0, "aegon.chrome.net.impl.JavaCronetProvider", linkedHashSe, false);
       ArrayList uArrayList = new ArrayList(Collections.unmodifiableList(new ArrayList(linkedHashSe)));
       if (uArrayList.size()) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             if (!iterator.next().e()) {
                iterator.remove();
             }
          }
          if (uArrayList.size()) {
             Collections.sort(uArrayList, new c());
             e uoe = uArrayList.get(false);
             if (Log.isLoggable(d.a, 3)) {
                Object[] objArray = new Object[]{uoe};
                String.format("Using \'%s\' provider for creating CronetEngine.Builder.", objArray);
             }
             super(uoe.b().a);
             return;
          }else {
             throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
          }
       }else {
          throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
       }
    }
}
