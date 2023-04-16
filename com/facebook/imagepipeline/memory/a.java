package com.facebook.imagepipeline.memory.a;
import eb.a;
import com.facebook.imagepipeline.memory.BasePool;
import eb.c;
import ed.w;
import ed.x;
import android.util.SparseIntArray;
import java.lang.Object;
import ab.e;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;
import java.lang.Integer;

public class a extends BasePool implements a	// class@000488
{
    public final int[] k;

    public void a(c p0,w p1,x p2){
       super(p0, p1, p2);
       w c = p1.c;
       int[] ointArray = new int[c.size()];
       this.k = ointArray;
       for (int i = 0; i < c.size(); i++) {
          p2[i] = c.keyAt(i);
       }
       this.x();
       return;
    }
    public Object d(int p0){
       byte[] uobyteArray = new byte[p0];
       return uobyteArray;
    }
    public void r(Object p0){
       e.d(p0);
    }
    public int t(int p0){
       int i1;
       if (p0 <= 0) {
          throw new BasePool$InvalidSizeException(Integer.valueOf(p0));
       }
       a tk = this.k;
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
       return p0.length;
    }
    public int v(int p0){
       return p0;
    }
}
