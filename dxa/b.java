package dxa.b;
import java.lang.Object;
import java.lang.String;
import dxa.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dxa.e;
import java.util.Iterator;
import java.util.List;
import java.lang.CharSequence;
import android.text.TextUtils;
import dxa.d;
import java.lang.StringBuilder;

public class b	// class@0025a1
{
    public String a;
    public String b;
    public String c;
    public String d;
    public d e;
    public List f;
    public int g;
    public int h;
    public int i;
    public long j;
    public long k;
    public int l;
    public byte[] m;
    public long n;
    public boolean o;

    public void b(){
       super();
    }
    public c a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uob, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       c uoc = PatchProxy.applyOneRefs(p0, this, uob, "2");
       if (uoc != patchProxyRe) {
       }else {
          b tf = this.f;
          if (tf != null) {
             Iterator iterator = tf.iterator();
             do {
                if (iterator.hasNext()) {
                }
                uoc = iterator.next();
             } while (TextUtils.equals(uoc.b(), p0));
          }
          uoc = null;
       }
       if (uoc == null) {
          return null;
       }else {
          return uoc.a();
       }
    }
    public int b(){
       return this.h;
    }
    public int c(){
       return this.g;
    }
    public int d(){
       return this.i;
    }
    public String e(){
       return this.d;
    }
    public String f(){
       return this.a;
    }
    public long g(){
       return this.j;
    }
    public String h(){
       Object[] objArray = null;
       b obj = PatchProxy.apply(objArray, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj != null) {
          objArray = obj.b;
       }
       return objArray;
    }
    public int i(){
       b te = this.e;
       int i = (te == null)? 0: te.a;
       return i;
    }
    public List j(){
       return this.f;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "{roomId="+this.a+", fromUserId="+this.d+", target="+this.e+", callType="+this.g+", callStatus="+this.h+", }";
    }
}
