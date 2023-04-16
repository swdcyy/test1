package io.reactivex.internal.util.h;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class h	// class@0014da
{
    public final int b;
    public Object[] c;
    public Object[] d;
    public int e;
    public int f;

    public void h(int p0){
       super();
       this.b = p0;
    }
    public void a(Object p0){
       Object[] objArray;
       int i = 0;
       if (this.e == null) {
          objArray = new Object[(this.b + 1)];
          this.c = objArray;
          this.d = objArray;
          objArray[i] = p0;
          this.f = 1;
          this.e = 1;
       }else {
          h tf = this.f;
          h tb = this.b;
          if (tf == tb) {
             objArray = new Object[(tb + 1)];
             objArray[i] = p0;
             p0[tb] = objArray;
             this.d = objArray;
             this.f = 1;
             this.e = this.e + 1;
          }else {
             this.d[tf] = p0;
             this.f = tf + 1;
             this.e = this.e + 1;
          }
       }
       return;
    }
    public Object[] b(){
       return this.c;
    }
    public String toString(){
       int i1;
       h tb = this.b;
       h te = this.e;
       ArrayList uArrayList = new ArrayList((te + 1));
       Object[] objArray = this.b();
       int i = 0;
       while (true) {
          i1 = 0;
          break ;
       }
       while (i < te) {
          uArrayList.add(objArray[i1]);
          i = i + 1;
          i1 = i1 + 1;
          if (i1 == tb) {
             objArray = objArray[tb];
          }
       }
       return uArrayList.toString();
    }
}
