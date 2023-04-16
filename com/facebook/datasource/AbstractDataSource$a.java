package com.facebook.datasource.AbstractDataSource$a;
import java.lang.Runnable;
import com.facebook.datasource.AbstractDataSource;
import kb.e;
import java.lang.Object;
import kb.c;

public class AbstractDataSource$a implements Runnable	// class@001076
{
    public final boolean b;
    public final e c;
    public final boolean d;
    public final AbstractDataSource e;

    public void AbstractDataSource$a(AbstractDataSource p0,boolean p1,e p2,boolean p3){
       this.e = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void run(){
       if (this.b != null) {
          this.c.onFailure(this.e);
       }else if(this.d != null){
          this.c.onCancellation(this.e);
       }else {
          this.c.onNewResult(this.e);
       }
       return;
    }
}
