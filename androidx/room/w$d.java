package androidx.room.w$d;
import androidx.room.w$c;
import java.lang.String;
import java.lang.Object;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
import java.lang.Integer;

public class w$d	// class@000978
{
    public final int[] a;
    public final String[] b;
    public final w$c c;
    public final Set d;

    public void w$d(w$c p0,int[] p1,String[] p2){
       super();
       this.c = p0;
       this.a = p1;
       this.b = p2;
       if (p1.length == 1) {
          HashSet hashSet = new HashSet();
          hashSet.add(p2[0]);
          this.d = Collections.unmodifiableSet(hashSet);
       }else {
          this.d = null;
       }
       return;
    }
    public void a(Set p0){
       int len = this.a.length;
       w$d uod = null;
       int i = 0;
       while (i < len) {
          if (p0.contains(Integer.valueOf(this.a[i]))) {
             if (len == 1) {
                uod = this.d;
             }else if(uod == null){
                uod = new HashSet(len);
             }
             uod.add(this.b[i]);
          }
          i = i + 1;
       }
       if (uod != null) {
          this.c.b(uod);
       }
       return;
    }
    public void b(String[] p0){
       int i;
       w$d uod = null;
       if (this.b.length == 1) {
          int len = p0.length;
          i = 0;
          while (i < len) {
             if ((p0[i]).equalsIgnoreCase(this.b[0])) {
                uod = this.d;
                break ;
             }
             i = i + 1;
          }
       }else {
          HashSet hashSet = new HashSet();
          i = p0.length;
          int i1 = 0;
          while (i1 < i) {
             object oobject = p0[i1];
             w$d tb = this.b;
             int len1 = tb.length;
             int i2 = 0;
             while (i2 < len1) {
                object oobject1 = tb[i2];
                if (oobject1.equalsIgnoreCase(oobject)) {
                   hashSet.add(oobject1);
                   break ;
                }
                i2 = i2 + 1;
             }
             i1 = i1 + 1;
          }
          if (hashSet.size() > 0) {
             uod = hashSet;
          }
       }
       if (uod != null) {
          this.c.b(uod);
       }
       return;
    }
}
