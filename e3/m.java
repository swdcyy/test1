package e3.m;
import e3.b0;
import android.view.ViewGroup;
import androidx.transition.Transition;
import e3.o;
import android.graphics.Rect;
import java.lang.Math;
import android.view.View;
import a2.i0;

public class m extends b0	// class@001eeb
{
    public float b;
    public int c;

    public void m(){
       super();
       this.b = 3.00f;
       this.c = 80;
    }
    public long c(ViewGroup p0,Transition p1,o p2,o p3){
       int i1;
       int i9;
       int i10;
       b0 uob0 = this;
       o oo = p2;
       if (!oo && p3 == null) {
          return 0;
       }
       Rect rect = p1.s();
       int i = 1;
       if (p3 == null || !uob0.e(oo)) {
          i1 = -1;
       }else {
          oo = p3;
          i1 = 1;
       }
       int i2 = uob0.f(oo);
       int i3 = uob0.g(oo);
       int i4 = 2;
       int[] ointArray = new int[i4];
       p0.getLocationOnScreen(ointArray);
       int i5 = ointArray[0] + Math.round(p0.getTranslationX());
       int i6 = ointArray[i] + Math.round(p0.getTranslationY());
       int i7 = i5 + p0.getWidth();
       int i8 = i6 + p0.getHeight();
       if (rect != null) {
          i9 = rect.centerX();
          i10 = rect.centerY();
       }else {
          i9 = (i5 + i7) / i4;
          i10 = (i6 + i8) / i4;
       }
       float f = (float)this.h(p0, i2, i3, i9, i10, i5, i6, i7, i8) / (float)this.i(p0);
       long l = p1.r();
       if (l < 0) {
          l = 300;
       }
       return (long)Math.round((((float)(l * (long)i1) / uob0.b) * f));
    }
    public final int h(View p0,int p1,int p2,int p3,int p4,int p5,int p6,int p7,int p8){
       m tc = this.c;
       int i = 0;
       int i1 = 1;
       if (tc == 0x800003) {
          if (i0.B(p0) != i1) {
             i1 = 0;
          }
          if (i1) {
          label_0027 :
             tc = 5;
          }else {
          label_0025 :
             tc = 3;
          }
       }else if(tc == 0x800005){
          if (i0.B(p0) != i1) {
             i1 = 0;
          }
          if (i1) {
             goto label_0025 ;
          }else {
             goto label_0027 ;
          }
       }
       if (tc != 3) {
          if (tc != 5) {
             if (tc != 48) {
                if (tc == 80) {
                   i = (p2 - p6) + Math.abs((p3 - p1));
                }
             }else {
                i = (p8 - p2) + Math.abs((p3 - p1));
             }
          }else {
             i = (p1 - p5) + Math.abs((p4 - p2));
          }
       }else {
          i = (p7 - p1) + Math.abs((p4 - p2));
       }
       return i;
    }
    public final int i(ViewGroup p0){
       m tc = this.c;
       if (tc != 3 && (tc != 5 && (tc != 0x800003 && tc != 0x800005))) {
          return p0.getHeight();
       }
       return p0.getWidth();
    }
    public void j(int p0){
       this.c = p0;
    }
}
