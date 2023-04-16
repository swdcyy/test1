package kotlinx.coroutines.JobSupport$c;
import ftd.t1;
import ftd.k2;
import java.lang.Throwable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;
import ftd.g2;
import java.util.List;
import kotlin.jvm.internal.a;

public final class JobSupport$c implements t1	// class@001928
{
    public Object _exceptionsHolder;
    public int _isCompleting;
    public Object _rootCause;
    public final k2 b;

    public void JobSupport$c(k2 p0,boolean p1,Throwable p2){
       super();
       this.b = p0;
       this._isCompleting = p1;
       this._rootCause = p2;
       this._exceptionsHolder = null;
    }
    public boolean E(){
       boolean b = (this.e() == null)? true: false;
       return b;
    }
    public final void a(Throwable p0){
       Throwable throwable = this.e();
       if (throwable == null) {
          this.l(p0);
          return;
       }else if(p0 == throwable){
          return;
       }else {
          Object obj = this.d();
          if (obj == null) {
             this.k(p0);
          }else if(obj instanceof Throwable){
             if (p0 == obj) {
                return;
             }else {
                ArrayList uArrayList = this.c();
                uArrayList.add(obj);
                uArrayList.add(p0);
                this.k(uArrayList);
             }
          }else if(obj instanceof ArrayList){
             obj.add(p0);
          }else {
             throw new IllegalStateException("State is "+obj.toString());
          }
          return;
       }
    }
    public k2 b(){
       return this.b;
    }
    public final ArrayList c(){
       return new ArrayList(4);
    }
    public final Object d(){
       return this._exceptionsHolder;
    }
    public final Throwable e(){
       return this._rootCause;
    }
    public final boolean f(){
       boolean b = (this.e() != null)? true: false;
       return b;
    }
    public final boolean g(){
       return this._isCompleting;
    }
    public final boolean h(){
       boolean b = (this.d() == g2.e)? true: false;
       return b;
    }
    public final List i(Throwable p0){
       ArrayList uArrayList = this.d();
       if (uArrayList == null) {
          uArrayList = this.c();
       }else if(uArrayList instanceof Throwable){
          ArrayList uArrayList1 = this.c();
          uArrayList1.add(uArrayList);
          uArrayList = uArrayList1;
       }else if(uArrayList instanceof ArrayList){
       }else {
          throw new IllegalStateException("State is "+uArrayList.toString());
       }
       Throwable throwable = this.e();
       if (throwable != null) {
          uArrayList.add(0, throwable);
       }
       if (p0 != null && (a.g(p0, throwable) ^ 0x01)) {
          uArrayList.add(p0);
       }
       this.k(g2.e);
       return uArrayList;
    }
    public final void j(boolean p0){
       this._isCompleting = p0;
    }
    public final void k(Object p0){
       this._exceptionsHolder = p0;
    }
    public final void l(Throwable p0){
       this._rootCause = p0;
    }
    public String toString(){
       return "Finishing[cancelling="+this.f()+", completing="+this.g()+", rootCause="+this.e()+", exceptions="+this.d()+", list="+this.b()+']';
    }
}
