package fwd.a$a;
import java.util.TimerTask;
import fwd.a;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.System;
import java.util.Iterator;
import java.lang.Object;
import fwd.b;

public class a$a extends TimerTask	// class@000eec
{
    public ArrayList b;
    public final a c;

    public void a$a(a p0){
       this.c = p0;
       super();
       this.b = new ArrayList();
    }
    public void run(){
       a$a tb = this.b;
       try{
          tb.clear();
          this.b.addAll(this.c.getConnections());
          long l = System.currentTimeMillis() - (long)(this.c.connectionLostTimeout * 1500);
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             this.c.executeConnectionLostDetection(iterator.next(), l);
          }
          this.b.clear();
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
