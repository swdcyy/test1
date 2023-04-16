package com.oplus.ocs.base.task.Tasks$a;
import com.oplus.ocs.base.task.Tasks$c;
import com.oplus.ocs.base.task.TaskImpl;
import java.lang.Object;
import java.util.concurrent.ExecutionException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Exception;
import com.oplus.ocs.base.utils.d;

public final class Tasks$a implements Tasks$c	// class@000b09
{
    public final Object a;
    public TaskImpl b;
    public Exception c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;

    public void Tasks$a(int p0,TaskImpl p1){
       super();
       this.a = new Object();
       this.d = p0;
       this.b = p1;
    }
    public final void a(){
       Tasks$a ta = this.a;
       _monitor_enter(ta);
       if (((this.e + this.f) + this.g) != this.d) {
          _monitor_exit(ta);
          return;
       }else if(this.c != null){
          this.b.setException(new ExecutionException(this.f+" out of "+this.d+" underlying tasks failed", this.c));
       }else if(this.h != null){
          this.b.tryCancel();
       }else {
          this.b.setResult(null);
       }
       _monitor_exit(ta);
       return;
    }
    public final void onCanceled(){
       Tasks$a ta = this.a;
       _monitor_enter(ta);
       this.g = this.g + 1;
       this.h = true;
       this.a();
       _monitor_exit(ta);
    }
    public final void onFailure(Exception p0){
       d.a(p0);
       Tasks$a ta = this.a;
       _monitor_enter(ta);
       this.f = this.f + 1;
       this.c = p0;
       this.a();
       _monitor_exit(ta);
    }
    public final void onSuccess(Object p0){
       p0 = this.a;
       _monitor_enter(p0);
       this.e = this.e + 1;
       this.a();
       _monitor_exit(p0);
    }
}
