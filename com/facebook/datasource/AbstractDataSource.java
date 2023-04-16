package com.facebook.datasource.AbstractDataSource;
import kb.c;
import java.lang.Object;
import com.facebook.datasource.AbstractDataSource$DataSourceStatus;
import java.util.concurrent.ConcurrentLinkedQueue;
import kb.h$b;
import java.lang.Throwable;
import kb.e;
import java.util.concurrent.Executor;
import ab.e;
import android.util.Pair;
import java.util.Map;
import com.facebook.datasource.AbstractDataSource$a;
import java.lang.Runnable;
import java.lang.String;
import com.facebook.datasource.AbstractDataSource$b;
import java.util.Iterator;
import kb.a;

public abstract class AbstractDataSource implements c	// class@001078
{
    public Map a;
    public AbstractDataSource$DataSourceStatus b;
    public boolean c;
    public Object d;
    public Throwable e;
    public float f;
    public final ConcurrentLinkedQueue g;
    public static AbstractDataSource$b h;

    public void AbstractDataSource(){
       super();
       this.d = null;
       this.e = null;
       this.f = 0;
       this.c = false;
       this.b = AbstractDataSource$DataSourceStatus.IN_PROGRESS;
       this.g = new ConcurrentLinkedQueue();
    }
    public synchronized boolean a(){
       boolean b = (this.b != AbstractDataSource$DataSourceStatus.IN_PROGRESS)? true: false;
       return b;
    }
    public boolean c(){
       return this instanceof h$b;
    }
    public boolean close(){
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return false;
       }else {
          this.c = true;
          AbstractDataSource td = this.d;
          this.d = null;
          _monitor_exit(this);
          if (td != null) {
             this.g(td);
          }
          if (!this.a()) {
             this.i();
          }
          _monitor_enter(this);
          this.g.clear();
          _monitor_exit(this);
          return true;
       }
    }
    public synchronized boolean d(){
       boolean b = (this.b == AbstractDataSource$DataSourceStatus.FAILURE)? true: false;
       return b;
    }
    public synchronized Throwable e(){
       return this.e;
    }
    public void f(e p0,Executor p1){
       e.d(p0);
       e.d(p1);
       _monitor_enter(this);
       if (this.c != null) {
          _monitor_exit(this);
          return;
       }else if(this.b == AbstractDataSource$DataSourceStatus.IN_PROGRESS){
          this.g.add(Pair.create(p0, p1));
       }
       boolean b = (!this.hasResult() && (this.a() || this.o()))? true: false;
       _monitor_exit(this);
       if (b) {
          this.h(p0, p1, this.d(), this.o());
       }
       return;
    }
    public void g(Object p0){
    }
    public Map getExtras(){
       return this.a;
    }
    public synchronized float getProgress(){
       return this.f;
    }
    public synchronized Object getResult(){
       return this.d;
    }
    public void h(e p0,Executor p1,boolean p2,boolean p3){
       AbstractDataSource$a uoa = new AbstractDataSource$a(this, p2, p0, p3);
       AbstractDataSource$b h = AbstractDataSource.h;
       if (h != null) {
          uoa = h.a(uoa, "AbstractDataSource_notifyDataSubscriber");
       }
       p1.execute(uoa);
       return;
    }
    public synchronized boolean hasResult(){
       boolean b = (this.d != null)? true: false;
       return b;
    }
    public final void i(){
       boolean b = this.d();
       boolean b1 = this.o();
       Iterator iterator = this.g.iterator();
       while (iterator.hasNext()) {
          Pair pair = iterator.next();
          this.h(pair.first, pair.second, b, b1);
       }
       return;
    }
    public synchronized boolean isClosed(){
       return this.c;
    }
    public void j(Map p0){
       this.a = p0;
    }
    public boolean k(Throwable p0){
       return this.l(p0, null);
    }
    public boolean l(Throwable p0,Map p1){
       boolean b;
       _monitor_enter(this);
       if (this.c != null || this.b != AbstractDataSource$DataSourceStatus.IN_PROGRESS) {
          b = false;
          _monitor_exit(this);
       }else {
          this.b = AbstractDataSource$DataSourceStatus.FAILURE;
          this.e = p0;
          this.a = p1;
          _monitor_exit(this);
       }
       if (b) {
          this.i();
       }
       return b;
    }
    public boolean m(float p0){
       _monitor_enter(this);
       boolean b = false;
       if (this.c != null || this.b != AbstractDataSource$DataSourceStatus.IN_PROGRESS) {
          _monitor_exit(this);
       }else if(p0 - this.f < 0){
          _monitor_exit(this);
       }else {
          this.f = p0;
          b = true;
          _monitor_exit(this);
       }
       if (b) {
          Iterator iterator = this.g.iterator();
          while (iterator.hasNext()) {
             Pair pair = iterator.next();
             pair.second.execute(new a(this, pair.first));
          }
       }
       return b;
    }
    public boolean n(Object p0,boolean p1,Map p2){
       this.j(p2);
       _monitor_enter(this);
       if (this.c != null || this.b != AbstractDataSource$DataSourceStatus.IN_PROGRESS) {
          p1 = false;
          _monitor_exit(this);
          if (p0 != null) {
          label_0029 :
             this.g(p0);
          }
       }else if(p1){
          this.b = AbstractDataSource$DataSourceStatus.SUCCESS;
          this.f = 0x3f800000;
       }
       AbstractDataSource td = this.d;
       if (td != p0) {
          this.d = p0;
          p0 = td;
       }else {
          p0 = null;
       }
       _monitor_exit(this);
       if (p0 != null) {
          goto label_0029 ;
       }
       if (p1) {
          this.i();
       }
       return p1;
    }
    public synchronized final boolean o(){
       boolean b = (this.isClosed() && !this.a())? true: false;
       return b;
    }
}
