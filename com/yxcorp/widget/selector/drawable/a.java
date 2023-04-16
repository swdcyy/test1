package com.yxcorp.widget.selector.drawable.a;
import com.kuaishou.ax2c.IAttrHost;
import android.graphics.drawable.Drawable;
import com.yxcorp.widget.selector.drawable.b;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import ald.c;

public final class a	// class@0009e1
{

    public static Drawable a(IAttrHost p0,IAttrHost p1,IAttrHost p2,boolean p3){
       GradientDrawable gradientDraw;
       GradientDrawable gradientDraw1;
       int[] ointArray;
       int[] ointArray2;
       b uob = new b(p0, p1, p2, p3);
       if (uob.d == null) {
          gradientDraw = uob.a();
       }else {
          gradientDraw = uob.a();
          int i = 0;
          uob.e = i;
          StateListDrawable stateListDra = new StateListDrawable();
          int i1 = 0;
          int i2 = 0x10100a7;
          if (uob.A != null) {
             gradientDraw1 = uob.a();
             b f = uob.f;
             float f1 = 0x3f000000;
             if (f != null) {
                gradientDraw1.setColor(c.b(f, f1));
             }
             f = uob.g;
             if (f != null) {
                b m = uob.m;
                if (m - i1 > 0) {
                   gradientDraw1.setStroke((int)m, c.b(f, f1), uob.n, uob.q);
                }
             }
             ointArray = new int[]{i2};
             stateListDra.addState(ointArray, gradientDraw1);
             uob.e = uob.e + 1;
          }else {
             ointArray2 = new int[]{i2};
             uob.b(stateListDra, 21, 22, ointArray2);
          }
          uob.b(stateListDra, 24, 25, new int[2]{0x10100a1,0xfefeff59});
          uob.b(stateListDra, 45, 46, new int[2]{0xfefeff5f,0xfefeff59});
          int[] ointArray1 = new int[]{0x101009f};
          uob.b(stateListDra, i, 1, ointArray1);
          ointArray2 = new int[]{-16842911};
          uob.b(stateListDra, 35, 36, ointArray2);
          int[] ointArray3 = new int[]{0x10100a0};
          uob.b(stateListDra, 2, 3, ointArray3);
          ointArray = new int[]{-16842912};
          uob.b(stateListDra, 37, 38, ointArray);
          ointArray = new int[]{0x101009e};
          uob.b(stateListDra, 4, 5, ointArray);
          ointArray = new int[]{-16842910};
          uob.b(stateListDra, 39, 40, ointArray);
          ointArray = new int[]{0x101009c};
          uob.b(stateListDra, 6, 7, ointArray);
          ointArray = new int[]{-16842908};
          uob.b(stateListDra, 41, 42, ointArray);
          gradientDraw1 = (uob.e > null)? 1: null;
          if (uob.f != null || (uob.g == null || (uob.m - i1 > 0 || gradientDraw1))) {
             int[] ointArray4 = new int[i];
             stateListDra.addState(ointArray4, uob.a());
             uob.e = uob.e + 1;
          }
          if (uob.e > 1) {
             gradientDraw = stateListDra;
          }
       }
       return gradientDraw;
    }
}
