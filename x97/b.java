package x97.b;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Random;
import java.lang.System;
import x97.b$a;
import java.util.List;
import c97.d;
import h97.d;
import java.lang.String;
import java.lang.CharSequence;
import ca7.u;
import com.kwai.middleware.azeroth.Azeroth2;
import com.kwai.middleware.azeroth.AzerothStorage;
import xb7.a;
import android.text.TextUtils;
import ca7.f;
import com.kwai.middleware.azeroth.model.AzerothSDKConfigs;
import java.lang.Class;
import com.google.gson.Gson;
import com.kwai.middleware.azeroth.model.AzerothHosts;
import h97.i;
import x97.n;
import java.util.Iterator;
import java.util.Collection;
import java.lang.IllegalArgumentException;

public final class b	// class@0027c9
{
    public List a;
    public String b;
    public Random c;

    public void b(){
       super();
       this.a = new CopyOnWriteArrayList();
       this.c = new Random(System.currentTimeMillis());
    }
    public static b b(){
       return b$a.a;
    }
    public final void a(){
       if (this.a.isEmpty()) {
          this.e(d.a().c().c("azeroth"));
       }
       return;
    }
    public String c(){
       this.a();
       if (u.c(this.b)) {
          Azeroth2 b = Azeroth2.B;
          String str = b.p().a().b("KEY_CURRENT_HOST");
          if (u.c(str) || (!this.a.contains(str) && !this.a.isEmpty())) {
             b ta = this.a;
             this.b = ta.get(this.c.nextInt(ta.size()));
             b.p().b(this.b);
          }else {
             this.b = str;
          }
       }
       return this.b;
    }
    public String d(){
       this.a();
       if (!this.a.isEmpty()) {
          int i = this.a.indexOf(this.b);
          if (i >= 0 && i < this.a.size()) {
             b ta = this.a;
             this.b = ta.get(((i + 1) % ta.size()));
          }else {
             b ta1 = this.a;
             this.b = ta1.get(this.c.nextInt(ta1.size()));
          }
       }
       Azeroth2.B.p().b(this.b);
       return this.b;
    }
    public final void e(String p0){
       if (TextUtils.isEmpty(p0)) {
          this.f(null);
          return;
       }else {
          AzerothSDKConfigs uAzerothSDKC = f.b.h(p0, AzerothSDKConfigs.class);
          if (uAzerothSDKC != null) {
             uAzerothSDKC = uAzerothSDKC.config;
             if (uAzerothSDKC != null) {
                this.f(uAzerothSDKC.hosts);
             label_0024 :
                return;
             }
          }
          this.f(null);
          goto label_0024 ;
       }
    }
    public void f(List p0){
       List list = d.a().e().b().i();
       if (list == null || list.isEmpty()) {
          throw new IllegalArgumentException("InitApiRequesterParams getHosts\(\) cannot be null or empty. Please set correct host list");
       }
       list = d.a().e().b().i();
       if (p0 == null || p0.isEmpty()) {
          p0 = list;
       }else if(list != null){
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (!p0.contains(str)) {
                p0.add(str);
             }
          }
       }
       this.a = new CopyOnWriteArrayList(p0);
       if (!u.c(this.b) && (!this.a.isEmpty() && !this.a.contains(this.b))) {
          this.d();
       }
    label_0072 :
       return;
    }
}
