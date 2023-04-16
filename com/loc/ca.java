package com.loc.ca;
import java.lang.Object;

public abstract class ca	// class@0013b2
{
    public ca c;
    public byte[] d;

    public void ca(){
       this.d = null;
    }
    public void ca(ca p0){
       super();
       this.d = null;
       this.c = p0;
    }
    public final byte[] a(){
       byte[] uobyteArray = this.a(this.d);
       ca tc = this.c;
       if (tc != null) {
          tc.d = uobyteArray;
          uobyteArray = tc.a();
       }
       return uobyteArray;
    }
    public abstract byte[] a(byte[] p0);
    public void b(byte[] p0){
    }
}
