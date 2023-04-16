package fk.a;
import android.content.res.ColorStateList;
import android.util.StateSet;
import android.graphics.Color;
import java.lang.Math;
import p1.a;

public class a	// class@00200b
{
    public static final boolean a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    public static final int[] j;

    static {
       a.a = true;
       int[] ointArray = new int[true];
       ointArray[0] = 0x10100a7;
       a.b = ointArray;
       a.c = new int[2]{0x1010367,0x101009c};
       int[] ointArray1 = new int[true];
       ointArray1[0] = 0x101009c;
       a.d = ointArray1;
       ointArray1 = new int[true];
       ointArray1[0] = 0x1010367;
       a.e = ointArray1;
       a.f = new int[2]{0x10100a1,0x10100a7};
       a.g = new int[3]{0x10100a1,0x1010367,0x101009c};
       a.h = new int[2]{0x10100a1,0x101009c};
       a.i = new int[2]{0x10100a1,0x1010367};
       int[] ointArray2 = new int[true];
       ointArray2[0] = 0x10100a1;
       a.j = ointArray2;
    }
    public static ColorStateList a(ColorStateList p0){
       int[] f;
       int[] h;
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       if (a.a) {
          int[][] ointArray = new int[][i];
          int[] ointArray1 = new int[i];
          ointArray[i2] = a.j;
          ointArray1[i2] = a.c(p0, a.f);
          ointArray[i1] = StateSet.NOTHING;
          ointArray1[i1] = a.c(p0, a.b);
          return new ColorStateList(ointArray, ointArray1);
       }else {
          int[][] ointArray2 = new int[][10];
          int[] ointArray3 = new int[]{a.c(p0, f),a.c(p0, f),a.c(p0, h),a.c(p0, h),i2,a.c(p0, h),a.c(p0, h),a.c(p0, h),a.c(p0, h),i2};
          f = a.f;
          ointArray2[i2] = f;
          f = a.g;
          ointArray2[i1] = f;
          h = a.h;
          ointArray2[i] = h;
          h = a.i;
          ointArray2[3] = h;
          ointArray2[4] = a.j;
          h = a.b;
          ointArray2[5] = h;
          h = a.c;
          ointArray2[6] = h;
          h = a.d;
          ointArray2[7] = h;
          h = a.e;
          ointArray2[8] = h;
          ointArray2[9] = StateSet.NOTHING;
          return new ColorStateList(ointArray2, ointArray3);
       }
    }
    public static int b(int p0){
       return a.d(p0, Math.min((Color.alpha(p0) * 2), 255));
    }
    public static int c(ColorStateList p0,int[] p1){
       int colorForStat = (p0 != null)? p0.getColorForState(p1, p0.getDefaultColor()): 0;
       if (a.a) {
          colorForStat = a.b(colorForStat);
       }
       return colorForStat;
    }
}
