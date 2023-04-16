package com.facebook.imagepipeline.memory.c;
import com.facebook.imagepipeline.memory.BasePool;
import eb.c;
import ed.w;
import ed.x;
import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.b;
import java.lang.Object;
import ab.e;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;
import java.lang.Integer;

public abstract class c extends BasePool	// class@00048a
{
    public final int[] k;

    public void c(c p0,w p1,x p2){
       super(p0, p1, p2);
       w c = p1.c;
       int[] ointArray = new int[c.size()];
       this.k = ointArray;
       int i = 0;
       c tk = this.k;
       while (i < tk.length) {
          tk[i] = c.keyAt(i);
          i++;
       }
       this.x();
       return;
    }
    public abstract b F(int p0);
    public Object d(int p0){
       return this.F(p0);
    }
    public void r(Object p0){
       e.d(p0);
       p0.close();
    }
    public int t(int p0){
       int i1;
       if (p0 <= 0) {
          throw new BasePool$InvalidSizeException(Integer.valueOf(p0));
       }
       c tk = this.k;
       int len = tk.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return p0;
          }
          i1 = tk[i];
          if (i1 >= p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i1;
    }
    public int u(Object p0){
       e.d(p0);
       return p0.getSize();
    }
    public int v(int p0){
       return p0;
    }
    public boolean z(Object p0){
       e.d(p0);
       return (p0.isClosed() ^ 0x01);
    }
}
