package com.kwai.library.widget.icon.b$b;
import android.util.LongSparseArray;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.utility.Log;
import com.kwai.library.widget.icon.b;
import android.graphics.drawable.Drawable$ConstantState;

public class b$b extends LongSparseArray	// class@000946
{
    public final long[] b;
    public int c;
    public boolean d;
    public int e;

    public void b$b(LongSparseArray p0,long[] p1){
       super();
       int i = 0;
       this.c = i;
       this.d = i;
       this.e = -2;
       this.b = p1;
       if (p0 != null && p0.size() > 0) {
          for (; i < p0.size(); i = i + 1) {
             this.put(p0.keyAt(i), p0.valueAt(i));
          }
       }
       return;
    }
    public void clear(){
       boolean b = (this.c == this.size())? true: false;
       Log.g("KwaiIconHookHelper", "System preload drawable cleared is same size: "+b);
       if (b) {
          return;
       }else {
          super.clear();
          b.a();
          return;
       }
    }
    public Object get(long p0,Object p1){
       if (this.d != null) {
          if (this.e == -2) {
             this.e = -1;
          }
          int i = 0;
          b$b tb = this.b;
          while (i < tb.length) {
             if (!tb[i] - p0) {
                this.e = i;
                Log.b("KwaiIconHookHelper", "Kid icon drawable loader get rule: "+this.e);
                this.d = false;
                break ;
             }
             i = i + 1;
          }
       }
       return super.get(p0, p1);
    }
}
