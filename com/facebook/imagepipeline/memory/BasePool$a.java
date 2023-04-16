package com.facebook.imagepipeline.memory.BasePool$a;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import cb.a;

public class BasePool$a	// class@000482
{
    public int a;
    public int b;

    public void BasePool$a(){
       super();
    }
    public void a(int p0){
       BasePool$a tb = this.b;
       int i = 1;
       if (tb >= p0) {
          BasePool$a ta = this.a;
          if (ta > null) {
             this.a = ta - i;
             this.b = tb - p0;
          label_0032 :
             return;
          }
       }
       Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(this.b),Integer.valueOf(this.a)};
       a.B("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", objArray);
       goto label_0032 ;
    }
    public void b(int p0){
       this.a = this.a + 1;
       this.b = this.b + p0;
    }
}
