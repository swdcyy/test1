package old.soloader.e$b;
import old.soloader.i$f;
import old.soloader.e;
import old.soloader.i;
import java.util.zip.ZipFile;
import java.io.File;
import old.soloader.i$c;
import old.soloader.e$a;
import old.soloader.i$b;
import old.soloader.i$e;
import old.soloader.e$b$a;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.lang.String;
import java.util.regex.Pattern;
import old.soloader.h;
import android.os.Build;
import java.util.Enumeration;
import java.lang.Object;
import java.util.zip.ZipEntry;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.Set;
import java.util.Collection;
import java.util.Arrays;

public class e$b extends i$f	// class@002012
{
    public e$a[] b;
    public final ZipFile c;
    public final i d;
    public final e e;

    public void e$b(e p0,i p1){
       this.e = p0;
       super();
       this.c = new ZipFile(p0.g);
       this.d = p1;
    }
    public final i$c a(){
       return new i$c(this.e());
    }
    public final i$e c(){
       return new e$b$a(this);
    }
    public void close(){
       this.c.close();
    }
    public final e$a[] e(){
       object oobject;
       if (this.b == null) {
          LinkedHashSet linkedHashSe = new LinkedHashSet();
          HashMap hashMap = new HashMap();
          Pattern pattern = Pattern.compile(this.e.h);
          h.c();
          String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
          Enumeration uEnumeration = this.c.entries();
          while (true) {
             int i = 0;
             if (uEnumeration.hasMoreElements()) {
                ZipEntry zipEntry = uEnumeration.nextElement();
                Matcher matcher = pattern.matcher(zipEntry.getName());
                if (matcher.matches()) {
                   String str = matcher.group(1);
                   String str1 = matcher.group(2);
                   while (true) {
                      if (i < sUPPORTED_AB.length) {
                         if (sUPPORTED_AB[i] != null && str.equals(sUPPORTED_AB[i])) {
                         label_005a :
                            if (i >= 0) {
                               linkedHashSe.add(str);
                               e$a uoa = hashMap.get(str1);
                               if (uoa == null || i < uoa.e) {
                                  hashMap.put(str1, new e$a(str1, zipEntry, i));
                               }
                            }
                         }else {
                            i = i + 1;
                         }
                      }else {
                         i = -1;
                         goto label_005a ;
                      }
                   }
                }
             }else {
                sUPPORTED_AB = new String[linkedHashSe.size()];
                this.d.l(linkedHashSe.toArray(sUPPORTED_AB));
                e$a[] uoaArray = new e$a[hashMap.size()];
                e$a[] uoaArray1 = hashMap.values().toArray(uoaArray);
                Arrays.sort(uoaArray1);
                int i1 = 0;
                int i2 = 0;
                while (i1 < uoaArray1.length) {
                   oobject = uoaArray1[i1];
                   if (this.f(oobject.d, oobject.b)) {
                      i2 = i2 + 1;
                   }else {
                      uoaArray1[i1] = null;
                   }
                   i1 = i1 + 1;
                }
                uoaArray = new e$a[i2];
                i2 = 0;
                while (i < uoaArray1.length) {
                   oobject = uoaArray1[i];
                   if (oobject != null) {
                      int i3 = i2 + 1;
                      uoaArray[i2] = oobject;
                      i2 = i3;
                   }
                   i = i + 1;
                }
                this.b = uoaArray;
             }
          }
       }
       return this.b;
    }
    public boolean f(ZipEntry p0,String p1){
       return true;
    }
}
