package io.netty.util.internal.chmv8.CountedCompleter;
import io.netty.util.internal.chmv8.ForkJoinTask;
import sun.misc.Unsafe;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import java.lang.Error;
import java.lang.Throwable;
import io.netty.util.internal.chmv8.CountedCompleter$a;
import java.security.PrivilegedExceptionAction;
import java.lang.Object;
import java.security.AccessController;
import java.lang.RuntimeException;
import java.security.PrivilegedActionException;

public abstract class CountedCompleter extends ForkJoinTask	// class@00116a
{
    public final CountedCompleter completer;
    public int pending;
    public static final Unsafe f;
    public static final long g;
    public static final long serialVersionUID;

    static {
       try{
          Unsafe unsafe = CountedCompleter.D();
          CountedCompleter.f = unsafe;
          CountedCompleter.g = unsafe.objectFieldOffset(CountedCompleter.class.getDeclaredField("pending"));
       }catch(java.lang.Exception e0){
          throw new Error(e0);
       }
    }
    public void CountedCompleter(){
       super();
       this.completer = null;
    }
    public void CountedCompleter(CountedCompleter p0){
       super();
       this.completer = p0;
    }
    public void CountedCompleter(CountedCompleter p0,int p1){
       super();
       this.completer = p0;
       this.pending = p1;
    }
    public static Unsafe D(){
       try{
          return Unsafe.getUnsafe();
       }catch(java.lang.SecurityException e0){
          try{
             return AccessController.doPrivileged(new CountedCompleter$a());
          }catch(java.security.PrivilegedActionException e0){
             throw new RuntimeException("Could not initialize intrinsics", e0.getCause());
          }
       }
    }
    public final void addToPendingCount(int p0){
       CountedCompleter tpending;
       int i;
       do {
          tpending = this.pending;
          i = tpending + p0;
       } while (CountedCompleter.f.compareAndSwapInt(this, CountedCompleter.g, tpending, i));
       return;
    }
    public final boolean compareAndSetPendingCount(int p0,int p1){
       return CountedCompleter.f.compareAndSwapInt(this, CountedCompleter.g, p0, p1);
    }
    public void complete(Object p0){
       this.setRawResult(p0);
       this.onCompletion(this);
       this.quietlyComplete();
       p0 = this.completer;
       if (p0 != null) {
          p0.tryComplete();
       }
       return;
    }
    public abstract void compute();
    public final int decrementPendingCountUnlessZero(){
       CountedCompleter tpending = this.pending;
       while (tpending != null) {
          int i = tpending - 1;
          if (CountedCompleter.f.compareAndSwapInt(this, CountedCompleter.g, tpending, i)) {
             break ;
          }
       }
       return tpending;
    }
    public final boolean exec(){
       this.compute();
       return false;
    }
    public final CountedCompleter firstComplete(){
       while (true) {
          CountedCompleter tpending = this.pending;
          if (tpending == null) {
             return this;
          }
          int i = tpending - 1;
          if (CountedCompleter.f.compareAndSwapInt(this, CountedCompleter.g, tpending, i)) {
             break ;
          }
       }
       return null;
    }
    public final CountedCompleter getCompleter(){
       return this.completer;
    }
    public final int getPendingCount(){
       return this.pending;
    }
    public Object getRawResult(){
       return null;
    }
    public final CountedCompleter getRoot(){
       CountedCompleter uCountedComp = this;
       CountedCompleter completer = uCountedComp.completer;
       while (completer != null) {
          uCountedComp = completer;
       }
       return uCountedComp;
    }
    public void internalPropagateException(Throwable p0){
       CountedCompleter uCountedComp = this;
       CountedCompleter uCountedComp1 = uCountedComp;
       while (uCountedComp.onExceptionalCompletion(p0, uCountedComp1)) {
          uCountedComp1 = uCountedComp.completer;
          if (uCountedComp1 != null && (uCountedComp1.status >= null && uCountedComp1.recordExceptionalCompletion(p0) == Integer.MIN_VALUE)) {
             uCountedComp1 = uCountedComp;
             uCountedComp = uCountedComp1;
          }else {
             break ;
          }
       }
    label_001c :
       return;
    }
    public final CountedCompleter nextComplete(){
       CountedCompleter tcompleter = this.completer;
       if (tcompleter != null) {
          return tcompleter.firstComplete();
       }
       this.quietlyComplete();
       return null;
    }
    public void onCompletion(CountedCompleter p0){
    }
    public boolean onExceptionalCompletion(Throwable p0,CountedCompleter p1){
       return true;
    }
    public final void propagateCompletion(){
       CountedCompleter uCountedComp = this;
       while (true) {
          CountedCompleter pending = uCountedComp.pending;
          if (pending == null) {
             CountedCompleter completer = uCountedComp.completer;
             if (completer == null) {
                break ;
             }else {
                uCountedComp = completer;
             }
          }else {
             int i = pending - 1;
             if (CountedCompleter.f.compareAndSwapInt(uCountedComp, CountedCompleter.g, pending, i)) {
                return;
             }
             continue ;
          }
       }
       uCountedComp.quietlyComplete();
       return;
    }
    public final void quietlyCompleteRoot(){
       CountedCompleter uCountedComp = this;
       CountedCompleter completer = uCountedComp.completer;
       while (completer != null) {
          uCountedComp = completer;
       }
       uCountedComp.quietlyComplete();
       return;
    }
    public final void setPendingCount(int p0){
       this.pending = p0;
    }
    public void setRawResult(Object p0){
    }
    public final void tryComplete(){
       CountedCompleter uCountedComp = this;
       CountedCompleter uCountedComp1 = uCountedComp;
       while (true) {
          CountedCompleter pending = uCountedComp.pending;
          if (pending == null) {
             uCountedComp.onCompletion(uCountedComp1);
             CountedCompleter completer = uCountedComp.completer;
             if (completer == null) {
                break ;
             }else {
                uCountedComp1 = uCountedComp;
                uCountedComp = completer;
             }
          }else {
             int i = pending - 1;
             if (CountedCompleter.f.compareAndSwapInt(uCountedComp, CountedCompleter.g, pending, i)) {
                return;
             }
             continue ;
          }
       }
       uCountedComp.quietlyComplete();
       return;
    }
}
