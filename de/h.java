package de.h;
import de.f;
import java.lang.Object;
import ce.b;
import java.lang.String;
import java.lang.StringBuilder;

public class h implements f	// class@001e41
{
    public int[] a;

    public void h(int[] p0){
       super();
       this.a = p0;
    }
    public void a(b p0){
       int i = 0;
       int i1 = 0;
       h ta = this.a;
       while (i1 < ta.length) {
          int i2 = i1 + 3;
          i2 = ta[i2] & 0x01;
          if (i2) {
             i2 = i1 + 1;
             int i3 = i1 + 2;
             p0.h(ta[i2], ta[i3]);
          }
          i1 = i1 + 4;
       }
       h ta1 = this.a;
       while (i < ta1.length) {
          int i4 = i + 3;
          i4 = ta1[i4] & 0x02;
          if (i4) {
             i4 = i + 0;
             p0.b(ta1[i4]);
          }
          i = i + 4;
       }
       return;
    }
    public String toString(){
       StringBuilder str = "";
       for (int i = 0; i < this.a.length; i = i + 4) {
          if (str.length() > 0) {
             str = str+"\n";
          }
          int i1 = i / 4;
          i1 = i1 + 1;
          str = str+"RemoveDeleteMultiMountItem \("+i1;
          i1 = this.a.length / 4;
          str = str+"/"+i1;
          int i2 = i + 0;
          i2 = i + 1;
          i2 = i + 2;
          i2 = i + 3;
          str = str+"\): ["+this.a[i2]+"] parent ["+this.a[i2]+"] idx "+this.a[i2]+" "+this.a[i2];
       }
       return str;
    }
}
