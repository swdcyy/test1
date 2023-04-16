package ck8.e;
import ck8.c;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import ck8.e$a;
import nsd.u;
import java.lang.Object;
import com.pagemanager.util.Weak;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.ref.WeakReference;
import java.lang.StringBuilder;

public final class e implements c	// class@00052f
{
    public final Weak a;
    public boolean b;
    public Map c;
    public final List d;
    public final Weak e;
    public static final n[] f;
    public static final e$a g;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(e.class, "realPage", "getRealPage\(\)Ljava/lang/Object;", 0)),m0.j(new MutablePropertyReference1Impl(e.class, "parentPage", "getParentPage\(\)Lcom/pagemanager/Page;", 0))};
       e.f = onArray;
       e.g = new e$a(null);
    }
    public void e(){
       super();
       this.a = new Weak();
       this.c = new HashMap();
       this.d = new ArrayList();
       this.e = new Weak();
    }
    public List a(){
       return this.d;
    }
    public final e b(){
       return this.e.a(this, e.f[1]);
    }
    public final Object c(){
       return this.a.a(this, e.f[0]);
    }
    public final String d(){
       return String.valueOf(this.c());
    }
    public final List e(){
       return this.d;
    }
    public boolean equals(Object p0){
       if (!p0 instanceof e) {
          return false;
       }
       if (a.g(this.c(), p0.c())) {
          return true;
       }
       return super.equals(p0);
    }
    public final boolean f(){
       return this.b;
    }
    public final void g(Object p0){
       e ta = this.a;
       Objects.requireNonNull(ta);
       a.p(e.f[0], "property");
       ta.a = new WeakReference(p0);
    }
    public final void h(boolean p0){
       this.b = p0;
    }
    public String toString(){
       return "Page\(nativePage="+this.c()+", isTargetPage="+this.b+", backParam="+this.c+", parentPage="+this.b()+')';
    }
}
