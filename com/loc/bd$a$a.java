package com.loc.bd$a$a;
import java.io.FilterOutputStream;
import com.loc.bd$a;
import java.io.OutputStream;

public final class bd$a$a extends FilterOutputStream	// class@001386
{
    public final bd$a a;

    public void bd$a$a(bd$a p0,OutputStream p1){
       this.a = p0;
       super(p1);
    }
    public void bd$a$a(bd$a p0,OutputStream p1,byte p2){
       super(p0, p1);
    }
    public final void close(){
       try{
          this.out.close();
          return;
       }catch(java.io.IOException e0){
          bd$a.c(this.a);
          return;
       }
    }
    public final void flush(){
       try{
          this.out.flush();
          return;
       }catch(java.io.IOException e0){
          bd$a.c(this.a);
          return;
       }
    }
    public final void write(int p0){
       try{
          this.out.write(p0);
          return;
       }catch(java.io.IOException e0){
          bd$a.c(this.a);
          return;
       }
    }
    public final void write(byte[] p0,int p1,int p2){
       try{
          this.out.write(p0, p1, p2);
          return;
       }catch(java.io.IOException e0){
          bd$a.c(this.a);
          return;
       }
    }
}
