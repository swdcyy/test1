package ga.k;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import ga.i;
import java.util.ArrayList;
import android.content.res.Resources;
import cw9.c;
import android.view.ViewGroup;
import ga.k$b;
import da.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import ekd.k1;
import java.util.Locale;
import java.io.InputStream;
import java.util.HashMap;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import ga.j;
import java.lang.reflect.Type;
import el.a;
import java.io.Reader;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import ga.k$a;
import java.util.Map$Entry;
import java.util.Comparator;
import java.util.Collections;
import ekd.p;
import com.yxcorp.utility.TextUtils;
import hyb.d;
import sid.e0;
import android.view.Window;
import android.view.View;
import android.content.Context;
import zf6.l;
import ba.a;
import ga.h;
import ea.e;
import ga.e;
import ea.a;
import zf6.j;
import ga.g;
import ea.d;
import lnc.a1;
import ca.a;
import fa.e;
import ga.o;
import ga.f;
import ea.c;
import ga.l;

public class k	// class@00206d
{
    public final Comparator a;
    public final List b;
    public final List c;
    public Activity d;
    public String e;
    public o f;
    public k$b g;
    public a h;
    public ViewGroup i;
    public a j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public int w;
    public static final String[] x;

    static {
       String[] stringArray = new String[]{"11","12","50","31","81","82"};
       k.x = stringArray;
    }
    public void k(Activity p0){
       super();
       this.a = i.b;
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.k = 0;
       this.p = true;
       this.q = true;
       this.t = true;
       this.d = p0;
       this.u = c.b(p0.getResources(), 0x7f07110d);
    }
    public final String a(String p0){
       String[] stringArray = p0.split("#");
       if (stringArray.length >= 2) {
          return stringArray[1];
       }
       return null;
    }
    public void b(String p0){
       this.e = p0;
    }
    public void c(ViewGroup p0){
       this.i = p0;
    }
    public void d(k$b p0){
       this.g = p0;
    }
    public void e(boolean p0){
       this.q = p0;
    }
    public void f(a p0){
       this.j = p0;
    }
    public void g(String p0){
       if (!TextUtils.isEmpty(p0)) {
          this.o = p0;
       }
       return;
    }
    public void h(){
       k ok;
       Iterator iterator1;
       int i2;
       k$a c;
       k ok1;
       String address;
       String str2;
       if (this.f == null) {
          Locale locale = 0x7f0f0007;
          int i = 2;
          int i1 = 1;
          try{
             if (this.v != null) {
             label_0033 :
                i2 = 0x7f0f0008;
             }else if(k1.f()){
                address = (Locale.getDefault().getCountry()).toUpperCase();
                if (address.contains("TW") || address.contains("HK")) {
                   i2 = 0x7f0f0009;
                }else {
                   goto label_0033 ;
                }
             }
             InputStream inputStream = this.d.getResources().openRawResource(i2);
             HashMap hashMap = new HashMap();
             Map map = new Gson().g(new InputStreamReader(inputStream), new j(this).getType());
             iterator1 = map.keySet().iterator();
             while (iterator1.hasNext()) {
                String str3 = iterator1.next();
                List list3 = map.get(str3);
                String str4 = list3.get(0);
                k$a uoa2 = new k$a(list3.get(i1), str3);
                List list4 = hashMap.get(str4);
                if (list4 == null) {
                   list4 = new ArrayList();
                   hashMap.put(str4, list4);
                }
                list4.add(uoa2);
             }
             Iterator iterator2 = hashMap.entrySet().iterator();
             while (iterator2.hasNext()) {
                Map$Entry uEntry = iterator2.next();
                this.b.add(new k$a(uEntry.getKey(), (uEntry.getValue().get(0).c).substring(0, i)));
                Collections.sort(uEntry.getValue(), this.a);
             }
             Collections.sort(this.b, this.a);
             iterator2 = this.b.iterator();
             while (iterator2.hasNext()) {
                this.c.add(hashMap.get(iterator2.next().b));
             }
             if (inputStream != null) {
                p.c(inputStream);
             }
             ok = 1;
          }catch(java.lang.Exception e0){
             if (null) {
                p.c(null);
             }
             ok = null;
          }
          if (ok) {
             if (this.p == null) {
                Iterator iterator = this.b.iterator();
                String str = "--";
                while (iterator.hasNext()) {
                   if (TextUtils.n(this.a(iterator.next().b), str)) {
                      iterator.remove();
                   }
                }
                iterator = this.c.iterator();
                while (iterator.hasNext()) {
                   List list = iterator.next();
                   iterator1 = list.iterator();
                   while (iterator1.hasNext()) {
                      if (TextUtils.n(this.a(iterator1.next().b), str)) {
                         iterator1.remove();
                      }
                   }
                   if (list.isEmpty()) {
                      iterator.remove();
                   }
                }
             }
             if (this.t == null) {
                i2 = 0;
                while (i2 < this.b.size()) {
                   k$a uoa = this.b.get(i2);
                   c = uoa.c;
                   String[] x = k.x;
                   int len = x.length;
                   int i3 = 0;
                   while (true) {
                      if (i3 < len) {
                         if (TextUtils.n(x[i3], c)) {
                            ok1 = 1;
                         label_01ad :
                            if (ok1) {
                               List list1 = this.c.get(i2);
                               list1.clear();
                               list1.add(uoa);
                            }
                            i2 = i2 + 1;
                         }else {
                            i3 = i3 + 1;
                         }
                      }else {
                         ok1 = null;
                         goto label_01ad ;
                      }
                   }
                }
             }
             String str1 = "";
             if (TextUtils.x(this.e)) {
                d uod = e0.d();
                if (uod != null && !TextUtils.x(uod.mProvince)) {
                   d mProvince = uod.mProvince;
                   int i4 = 0;
                   while (i4 < this.b.size()) {
                      if (mProvince.contains((this.b.get(i4).b).split("#")[i1])) {
                         this.l = i4;
                         break ;
                      }
                      i4 = i4 + 1;
                   }
                   if (this.l != null && !TextUtils.x(uod.getAddress())) {
                      List list2 = this.c.get(this.l);
                      address = ((uod.mCity).equals("NULL"))? uod.getAddress(): uod.mCity;
                      i4 = 0;
                      while (i4 < list2.size()) {
                         if (address.contains((list2.get(i4).b).split("#")[i1])) {
                            this.m = i4;
                            break ;
                         }
                         i4 = i4 + 1;
                      }
                   }
                }
                if (this.l == null || this.m == null) {
                   i2 = this.b.indexOf(new k$a(str1, "11"));
                   this.l = i2;
                   this.m = this.c.get(i2).indexOf(new k$a(str1, "110108"));
                }
             }else if((this.e).length() > i1){
                str2 = (this.e).substring(0, i);
             }else {
                str2 = str1;
             }
             i2 = this.b.indexOf(new k$a(str1, str2));
             this.l = i2;
             if (i2 >= 0) {
                this.m = this.c.get(i2).indexOf(new k$a(str1, this.e));
             }else {
                this.l = 0;
                this.m = 0;
             }
             ok = this.i;
             if (ok == null) {
                ViewGroup decorView = this.d.getWindow().getDecorView();
             }
             k td = this.d;
             k tk = this.k;
             if (tk != null) {
                td = l.h(td, tk);
             }
             a uoa1 = new a(td, new h(this));
             uoa1.h(R.layout.arg_RES_7f0d114b, new e(this));
             uoa1.o(j.c(td, R.color.arg_RES_7f060c33, this.k));
             uoa1.p(j.c(td, R.color.arg_RES_7f060c33, this.k));
             uoa1.f(j.c(td, R.color.arg_RES_7f060c27, this.k));
             uoa1.g(this.u);
             uoa1.q(0, 0, 0);
             uoa1.i(2.60f);
             uoa1.e(ok);
             uoa1.l(this.l, this.m);
             uoa1.j(new g(this));
             uoa1.b.j0 = a1.a(0x7f060c25);
             uoa1.c(this.r);
             uoa1.b(this.s);
             uoa1.k(this.q);
             uoa1.s(c.b(this.d.getResources(), R.dimen.arg_RES_7f0710ef));
             uoa1.n(c.b(this.d.getResources(), R.dimen.arg_RES_7f0710e9));
             ok = this.w;
             if (ok != null) {
                e.a(ok, uoa1.b);
             }
             o oo = uoa1.a();
             this.f = oo;
             oo.s(this.b, this.c);
             this.f.m(new f(this));
          }
       }
       ok = this.f;
       if (ok != null) {
          ok.o();
       }
       return;
    }
}
