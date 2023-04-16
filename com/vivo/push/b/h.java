package com.vivo.push.b.h;
import com.vivo.push.o;
import java.lang.String;
import com.vivo.push.a;

public final class h extends o	// class@001037
{
    public String a;

    public void h(){
       super(2013);
    }
    public void h(String p0){
       super();
       this.a = p0;
    }
    public final void c(a p0){
       p0.a("MsgArriveCommand.MSG_TAG", this.a);
    }
    public final void d(a p0){
       this.a = p0.a("MsgArriveCommand.MSG_TAG");
    }
}
