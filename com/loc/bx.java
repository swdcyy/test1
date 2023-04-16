package com.loc.bx;
import com.loc.ca;
import java.lang.StringBuilder;
import java.lang.String;
import com.loc.x;

public final class bx extends ca	// class@0013ae
{
    public StringBuilder a;
    public boolean b;

    public void bx(){
       super();
       this.a = "";
       this.b = true;
    }
    public void bx(ca p0){
       super(p0);
       this.a = "";
       this.b = true;
    }
    public final byte[] a(byte[] p0){
       p0 = x.a(this.a);
       this.d = p0;
       this.b = true;
       bx ta = this.a;
       ta.delete(0, ta.length());
       return p0;
    }
    public final void b(byte[] p0){
       String str = x.a(p0);
       if (this.b != null) {
          this.b = false;
       }else {
          StringBuilder str1 = this.a+",";
       }
       this.a+"{\"log\":\""+str+"\"}";
       return;
    }
}
