package io.netty.channel.c$a;
import io.netty.channel.x$a;
import io.netty.channel.c;
import io.netty.channel.x;
import java.lang.Math;

public final class c$a extends x$a	// class@001089
{
    public final int h;
    public final int i;
    public int j;
    public int k;
    public boolean l;
    public final c m;

    public void c$a(c p0,int p1,int p2,int p3){
       this.m = p0;
       super(p0);
       this.h = p1;
       this.i = p2;
       int i = c.j(p3);
       this.j = i;
       this.k = c.e[i];
    }
    public int c(){
       return this.k;
    }
    public void i(){
       int i;
       x$a td = this.d;
       int[] e = c.e;
       if (td <= e[Math.max(0, ((this.j - 1) - 1))]) {
          if (this.l != null) {
             i = Math.max((this.j - 1), this.h);
             this.j = i;
             this.k = e[i];
             this.l = false;
          }else {
             this.l = true;
          }
       }else if(td >= this.k){
          i = Math.min((this.j + 4), this.i);
          this.j = i;
          this.k = e[i];
          this.l = false;
       }
       return;
    }
}
