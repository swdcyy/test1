package com.vivo.push.b.u;
import com.vivo.push.b.v;
import com.vivo.push.a;
import java.lang.String;

public final class u extends v	// class@001044
{
    public long a;
    public int b;

    public void u(){
       super(20);
       this.a = -1;
    }
    public final void c(a p0){
       super.c(p0);
       p0.a("undo_msg_v1", this.a);
       p0.a("undo_msg_type_v1", this.b);
    }
    public final long d(){
       return this.a;
    }
    public final void d(a p0){
       super.d(p0);
       this.a = p0.b("undo_msg_v1", this.a);
       this.b = p0.b("undo_msg_type_v1", 0);
    }
    public final String e(){
       u ta = this.a;
       if (ta - -1) {
          return String.valueOf(ta);
       }
       return null;
    }
    public final String toString(){
       return "OnUndoMsgCommand";
    }
}
