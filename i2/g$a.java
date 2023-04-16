package i2.g$a;
import i2.g$b;
import android.widget.TextView;
import i2.e;
import android.text.InputFilter;
import java.lang.Object;
import java.lang.System;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import i2.i;

public class g$a extends g$b	// class@00216c
{
    public final TextView a;
    public final e b;

    public void g$a(TextView p0){
       super();
       this.a = p0;
       this.b = new e(p0);
    }
    public InputFilter[] a(InputFilter[] p0){
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i < len) {
             if (p0[i] instanceof e) {
                break ;
             }else {
                i = i + 1;
             }
          }else {
             InputFilter[] inputFilterA = new InputFilter[(p0.length + 1)];
             System.arraycopy(p0, 0, inputFilterA, 0, len);
             inputFilterA[len] = this.b;
             return inputFilterA;
          }
       }
       return p0;
    }
    public void b(boolean p0){
       if (p0) {
          this.c();
       }
       return;
    }
    public void c(){
       TransformationMethod transformati = this.a.getTransformationMethod();
       if (transformati != null && !transformati instanceof PasswordTransformationMethod) {
          this.a.setTransformationMethod(this.d(transformati));
       }
       return;
    }
    public TransformationMethod d(TransformationMethod p0){
       if (p0 instanceof i) {
          return p0;
       }
       return new i(p0);
    }
}
