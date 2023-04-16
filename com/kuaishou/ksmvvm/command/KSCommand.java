package com.kuaishou.ksmvvm.command.KSCommand;
import pk0.b;
import java.lang.Object;
import androidx.lifecycle.MutableLiveData;
import sk0.a;
import pk0.a;
import com.kuaishou.ksmvvm.command.b;
import com.kuaishou.ksmvvm.command.a;
import androidx.lifecycle.LiveData;
import com.kuaishou.ksmvvm.command.KSCommand$Status;
import brd.t;
import pk0.c;
import pk0.d;
import erd.g;
import crd.b;

public class KSCommand	// class@000929
{
    public final a a;
    public final a b;
    public final b c;
    public final b d;
    public final a e;
    public b f;
    public MutableLiveData g;
    public MutableLiveData h;
    public MutableLiveData i;

    public void KSCommand(b p0){
       super();
       this.g = new MutableLiveData();
       this.h = new MutableLiveData();
       this.i = new MutableLiveData();
       this.a = null;
       this.b = null;
       this.c = p0;
       this.d = null;
       this.e = null;
    }
    public void KSCommand(a p0,a p1,b p2,a p3){
       super();
       this.g = new MutableLiveData();
       this.h = new MutableLiveData();
       this.i = new MutableLiveData();
       this.a = p0;
       this.b = p1;
       this.c = null;
       this.d = p2;
       this.e = p3;
    }
    public final void a(){
       this.b(null);
    }
    public final void b(Object p0){
       KSCommand$Status eXECUTING = KSCommand$Status.EXECUTING;
       if (this.g.getValue() == eXECUTING) {
          this.g.setValue(eXECUTING);
          return;
       }else {
          KSCommand tb = this.b;
          if (tb != null) {
             p0 = tb.a(p0);
             if (p0 == null) {
                this.g.setValue(KSCommand$Status.WAITING);
                return;
             }else {
                this.g.setValue(eXECUTING);
                p0 = p0.subscribe(new c(this), new d(this));
                this.f = p0;
                this.a.o0(p0);
             }
          }else if(this.c != null){
             tb = this.g;
             try{
                tb.setValue(eXECUTING);
                this.c.a(p0);
             }catch(java.lang.Exception e3){
                this.i.setValue(e3);
                this.g.setValue(KSCommand$Status.FAILURE);
             }
             this.h.setValue(null);
             this.g.setValue(KSCommand$Status.SUCCESS);
          }
          return;
       }
    }
}
