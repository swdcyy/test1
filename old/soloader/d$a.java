package old.soloader.d$a;
import old.soloader.i$f;
import old.soloader.d;
import old.soloader.i;
import java.io.File;
import java.lang.StringBuilder;
import java.lang.String;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import old.soloader.h;
import android.os.Build;
import java.lang.Object;
import java.util.Set;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import old.soloader.d$b;
import old.soloader.i$b;
import java.lang.RuntimeException;
import java.lang.Throwable;
import old.soloader.i$c;
import old.soloader.i$e;
import old.soloader.d$a$a;

public final class d$a extends i$f	// class@00200d
{
    public final d$b[] b;
    public final d c;

    public void d$a(d p0,i p1){
       String str;
       String str2;
       int i = this;
       d uod = p0;
       i.c = uod;
       super();
       File uFile = new File("/data/local/tmp/exopackage/"+uod.c.getPackageName()+"/native-libs/");
       ArrayList uArrayList = new ArrayList();
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       h.c();
       String[] sUPPORTED_AB = Build.SUPPORTED_ABIS;
       int len = sUPPORTED_AB.length;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          if (i2 < len) {
             object oobject = sUPPORTED_AB[i2];
             File uFile1 = new File(uFile, oobject);
             if (uFile1.isDirectory()) {
                linkedHashSe.add(oobject);
                File uFile2 = new File(uFile1, "metadata.txt");
                if (uFile2.isFile()) {
                   FileReader uFileReader = new FileReader(uFile2);
                   BufferedReader uBufferedRea = new BufferedReader(uFileReader);
                   while (true) {
                      str = uBufferedRea.readLine();
                      if (str != null) {
                         if (!str.length()) {
                            continue ;
                         }else {
                            int i3 = str.indexOf(32);
                            if (i3 != -1) {
                               String str1 = str.substring(i1, i3)+".so";
                               int i4 = uArrayList.size();
                               int i5 = 0;
                               while (true) {
                                  if (i5 < i4) {
                                     if ((uArrayList.get(i5).b).equals(str1)) {
                                        str2 = 1;
                                     label_00b2 :
                                        if (!str2) {
                                           i3 = i3 + 1;
                                           str2 = str.substring(i3);
                                           uArrayList.add(new d$b(str1, str2, new File(uFile1, str2)));
                                        }
                                        i1 = 0;
                                     }else {
                                        i5 = i5 + 1;
                                        Object obj = null;
                                     }
                                  }else {
                                     str2 = null;
                                     goto label_00b2 ;
                                  }
                               }
                            }else {
                               break ;
                            }
                         }
                      }else {
                         uBufferedRea.close();
                         uFileReader.close();
                      }
                   }
                   throw new RuntimeException("illegal line in exopackage metadata: ["+str+"]");
                }
             }
             i2 = i2 + 1;
             i1 = 0;
          }else {
             String[] stringArray = new String[linkedHashSe.size()];
             p1.l(linkedHashSe.toArray(stringArray));
             d$b[] uobArray = new d$b[uArrayList.size()];
             i.b = uArrayList.toArray(uobArray);
             return;
          }
       }
    }
    public i$c a(){
       return new i$c(this.b);
    }
    public i$e c(){
       return new d$a$a(this);
    }
}
