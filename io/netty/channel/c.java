package io.netty.channel.c;
import io.netty.channel.x;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.Object;
import io.netty.channel.d0$a;
import io.netty.channel.c$a;

public class c extends x	// class@00108b
{
    public final int b;
    public final int c;
    public final int d;
    public static final int[] e;
    public static final c f;

    static {
       ArrayList uArrayList = new ArrayList();
       int i = 16;
       Integer integer = 512;
       while (i < integer) {
          uArrayList.add(Integer.valueOf(i));
          i = i + 16;
       }
       while (integer > 0) {
          uArrayList.add(Integer.valueOf(integer));
          integer = integer << 1;
       }
       int[] ointArray = new int[uArrayList.size()];
       c.e = ointArray;
       i = 0;
       int[] e = c.e;
       while (i < e.length) {
          e[i] = uArrayList.get(i).intValue();
          i = i + 1;
       }
       c.f = new c();
    }
    public void c(){
       int i = 1;
       super(i);
       int i1 = 64;
       int i2 = c.j(i1);
       int[] e = c.e;
       this.b = (e[i2] < i1)? i2 + i: i2;
       i2 = c.j(0x10000);
       this.c = (e[i2] > 0x10000)? i2 - i: i2;
       this.d = 1024;
       return;
    }
    public static int j(int p0){
       int i4;
       int i = c.e.length - 1;
       int i1 = 0;
       while (true) {
          if (i < i1) {
             return i1;
          }
          if (i == i1) {
             return i;
          }
          int i2 = i1 + i;
          i2 = i2 >> 1;
          int[] e = c.e;
          int i3 = e[i2];
          i4 = i2 + 1;
          if (p0 > e[i4]) {
             i1 = i4;
          }else if(p0 < i3){
             i2 = i2 - 1;
             i = i2;
          }else if(p0 == i3){
             return i2;
          }else {
             break ;
          }
       }
       return i4;
    }
    public d0$a a(){
       return new c$a(this, this.b, this.c, this.d);
    }
}
