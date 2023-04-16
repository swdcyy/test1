package c.t.m.g.co;
import java.lang.Object;
import java.util.List;
import java.lang.Float;
import java.util.Arrays;

public class co	// class@000c19
{
    public float a;
    public float b;
    public float c;
    public boolean d;
    public boolean e;
    public static co f;

    public void co(){
       super();
       this.a = 0;
       this.b = 0;
       this.c = 100.00f;
       this.d = false;
       this.e = false;
    }
    public static co a(){
       if (co.f == null) {
          co uoco = co.class;
          _monitor_enter(uoco);
          if (co.f == null) {
             co.f = new co();
          }
          _monitor_exit(uoco);
       }
       return co.f;
    }
    public boolean a(List p0,int p1){
       int i = 5;
       if (p0.size() < i) {
       }else {
          p1 = p0.size();
          float[] uofloatArray = new float[p1];
          int i1 = 0;
          int i2 = 0;
          while (i1 < p1) {
             Float uFloat = p0.get(i1);
             if (uFloat != null) {
                i2 = uFloat.floatValue();
             }
             uofloatArray[i1] = i2;
             i1 = i1 + 1;
          }
          Arrays.sort(uofloatArray);
          float[] uofloatArray1 = new float[i];
          i1 = 0;
          int i3 = 1;
          while (i1 < i) {
             i3 = p1 - 1;
             i3 = i3 - i1;
             uofloatArray1[i1] = uofloatArray[i3];
             i2 = i2 + uofloatArray1[i1];
             i1 = i1 + 1;
          }
          float f = i2 / 5.00f;
          if (uofloatArray1[0] - 0x420c0000 > 0) {
             this.d = i3;
          }else if(f - 0x41f00000 > 0){
             this.d = i3;
          }
          uofloatArray1 = f - 0x41b00000;
          if (uofloatArray1 < 0) {
             this.d = false;
          }
          if (this.b - f < 0) {
             this.b = f;
          }
          if (this.c - f > 0) {
             this.c = f;
          }
          this.a = f;
          if ((f - f) - 2.00f > 0) {
             this.e = false;
          }
          if (f - ((this.b + this.c) / 2.00f) > 0) {
             this.e = i3;
          }else if(uofloatArray1 < 0){
             this.e = false;
          }
       }
       return this.e;
    }
}
