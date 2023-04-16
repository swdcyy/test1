package androidx.fragment.app.e;
import java.lang.Object;
import java.util.ArrayList;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import androidx.fragment.app.e$a;
import java.lang.String;
import java.lang.IllegalStateException;
import java.lang.Class;
import java.lang.reflect.Modifier;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import java.lang.Runnable;

public abstract class e	// class@0007a9
{
    public ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public String j;
    public int k;
    public CharSequence l;
    public int m;
    public CharSequence n;
    public ArrayList o;
    public ArrayList p;
    public boolean q;
    public ArrayList r;

    public void e(){
       super();
       this.a = new ArrayList();
       this.i = true;
       this.q = false;
    }
    public e A(Fragment p0,Lifecycle$State p1){
       this.i(new e$a(10, p0, p1));
       return this;
    }
    public e B(Fragment p0){
       this.i(new e$a(8, p0));
       return this;
    }
    public e C(boolean p0){
       this.q = p0;
       return this;
    }
    public e D(int p0){
       this.f = p0;
       return this;
    }
    public e E(Fragment p0){
       this.i(new e$a(5, p0));
       return this;
    }
    public e f(int p0,Fragment p1){
       this.r(p0, p1, null, 1);
       return this;
    }
    public e g(int p0,Fragment p1,String p2){
       this.r(p0, p1, p2, 1);
       return this;
    }
    public e h(Fragment p0,String p1){
       this.r(0, p0, p1, 1);
       return this;
    }
    public void i(e$a p0){
       this.a.add(p0);
       p0.c = this.b;
       p0.d = this.c;
       p0.e = this.d;
       p0.f = this.e;
    }
    public e j(String p0){
       if (this.i == null) {
          throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
       }
       this.h = true;
       this.j = p0;
       return this;
    }
    public e k(Fragment p0){
       this.i(new e$a(7, p0));
       return this;
    }
    public abstract int l();
    public abstract int m();
    public abstract void n();
    public abstract void o();
    public e p(Fragment p0){
       this.i(new e$a(6, p0));
       return this;
    }
    public e q(){
       if (this.h != null) {
          throw new IllegalStateException("This transaction is already being added to the back stack");
       }
       this.i = false;
       return this;
    }
    public void r(int p0,Fragment p1,String p2,int p3){
       Class class = p1.getClass();
       int modifiers = class.getModifiers();
       if (class.isAnonymousClass() || (!Modifier.isPublic(modifiers) || (class.isMemberClass() && !Modifier.isStatic(modifiers)))) {
          throw new IllegalStateException("Fragment "+class.getCanonicalName()+" must be a public static class to be  properly recreated from instance state.");
       }
       String str = " now ";
       if (p2 != null) {
          Fragment mTag = p1.mTag;
          if (mTag == null || p2.equals(mTag)) {
             p1.mTag = p2;
          }else {
             throw new IllegalStateException("Can\'t change tag of fragment "+p1+": was "+p1.mTag+str+p2);
          }
       }
       if (p0) {
          if (p0 != -1) {
             Fragment mFragmentId = p1.mFragmentId;
             if (mFragmentId == null || mFragmentId == p0) {
                p1.mFragmentId = p0;
                p1.mContainerId = p0;
             }else {
                throw new IllegalStateException("Can\'t change container ID of fragment "+p1+": was "+p1.mFragmentId+str+p0);
             }
          }else {
             throw new IllegalArgumentException("Can\'t add fragment "+p1+" with tag "+p2+" to container view with no id");
          }
       }
       this.i(new e$a(p3, p1));
       return;
    }
    public e s(Fragment p0){
       this.i(new e$a(4, p0));
       return this;
    }
    public boolean t(){
       return this.a.isEmpty();
    }
    public e u(Fragment p0){
       this.i(new e$a(3, p0));
       return this;
    }
    public e v(int p0,Fragment p1){
       this.w(p0, p1, null);
       return this;
    }
    public e w(int p0,Fragment p1,String p2){
       if (!p0) {
          throw new IllegalArgumentException("Must use non-zero containerViewId");
       }
       this.r(p0, p1, p2, 2);
       return this;
    }
    public e x(Runnable p0){
       this.q();
       if (this.r == null) {
          this.r = new ArrayList();
       }
       this.r.add(p0);
       return this;
    }
    public e y(int p0,int p1){
       this.z(p0, p1, 0, 0);
       return this;
    }
    public e z(int p0,int p1,int p2,int p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       return this;
    }
}
