package androidx.core.content.pm.a$a;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import androidx.core.content.pm.a;
import java.util.Arrays;
import android.content.Intent;
import androidx.core.app.f;
import java.util.HashSet;
import java.util.Collection;
import java.lang.CharSequence;
import android.text.TextUtils;
import m1.a;
import java.lang.IllegalArgumentException;
import androidx.core.graphics.drawable.IconCompat;

public class a$a	// class@000711
{
    public final a a;
    public boolean b;

    public void a$a(Context p0,String p1){
       super();
       a uoa = new a();
       this.a = uoa;
       uoa.a = p0;
       uoa.b = p1;
    }
    public void a$a(a p0){
       super();
       a uoa = new a();
       this.a = uoa;
       uoa.a = p0.a;
       uoa.b = p0.b;
       uoa.c = p0.c;
       a d = p0.d;
       uoa.d = Arrays.copyOf(d, d.length);
       uoa.e = p0.e;
       uoa.f = p0.f;
       uoa.g = p0.g;
       uoa.h = p0.h;
       uoa.z = p0.z;
       uoa.i = p0.i;
       uoa.j = p0.j;
       uoa.r = p0.r;
       uoa.q = p0.q;
       uoa.s = p0.s;
       uoa.t = p0.t;
       uoa.u = p0.u;
       uoa.v = p0.v;
       uoa.w = p0.w;
       uoa.x = p0.x;
       uoa.m = p0.m;
       uoa.n = p0.n;
       uoa.y = p0.y;
       uoa.o = p0.o;
       d = p0.k;
       if (d != null) {
          uoa.k = Arrays.copyOf(d, d.length);
       }
       if (p0.l != null) {
          uoa.l = new HashSet(p0.l);
       }
       p0 = p0.p;
       if (p0 != null) {
          uoa.p = p0;
       }
       return;
    }
    public a a(){
       if (TextUtils.isEmpty(this.a.f)) {
          throw new IllegalArgumentException("Shortcut must have a non-empty label");
       }
       a$a ta = this.a;
       a d = ta.d;
       if (d == null || !d.length) {
          throw new IllegalArgumentException("Shortcut must have an intent");
       }
       if (this.b != null) {
          if (ta.m == null) {
             ta.m = new a(ta.b);
          }
          this.a.n = true;
       }
       return this.a;
    }
    public a$a b(IconCompat p0){
       this.a.i = p0;
       return this;
    }
    public a$a c(Intent p0){
       Intent[] intentArray = new Intent[]{p0};
       this.d(intentArray);
       return this;
    }
    public a$a d(Intent[] p0){
       this.a.d = p0;
       return this;
    }
    public a$a e(CharSequence p0){
       this.a.g = p0;
       return this;
    }
    public a$a f(CharSequence p0){
       this.a.f = p0;
       return this;
    }
}
