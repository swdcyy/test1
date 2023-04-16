package com.loc.bu;
import com.loc.ca;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.Throwable;

public final class bu extends ca	// class@0013ab
{
    public ByteArrayOutputStream a;

    public void bu(){
       this.a = new ByteArrayOutputStream();
    }
    public void bu(ca p0){
       this.a = new ByteArrayOutputStream();
    }
    public final byte[] a(byte[] p0){
       p0 = this.a.toByteArray();
       try{
          this.a.close();
       }catch(java.io.IOException e0){
          e0.printStackTrace();
       }
       this.a = new ByteArrayOutputStream();
       return p0;
    }
    public final void b(byte[] p0){
       this.a.write(p0);
    }
}
