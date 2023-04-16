package gkd.a$c$a;
import java.io.FilterOutputStream;
import gkd.a$c;
import java.io.OutputStream;
import gkd.a$a;

public class a$c$a extends FilterOutputStream	// class@000f46
{
    public final a$c b;

    public void a$c$a(a$c p0,OutputStream p1,a$a p2){
       this.b = p0;
       super(p1);
    }
    public void close(){
       try{
          this.out.close();
       }catch(java.io.IOException e0){
          this.b.c = true;
       }
       return;
    }
    public void flush(){
       try{
          this.out.flush();
       }catch(java.io.IOException e0){
          this.b.c = true;
       }
       return;
    }
    public void write(int p0){
       try{
          this.out.write(p0);
       }catch(java.io.IOException e0){
          p0.c = true;
       }
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       try{
          this.out.write(p0, p1, p2);
       }catch(java.io.IOException e0){
          p0.c = true;
       }
       return;
    }
}
