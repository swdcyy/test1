package ad.a;
import android.graphics.Bitmap;
import java.lang.Math;
import java.lang.Object;
import java.lang.System;

public abstract class a	// class@00011d
{

    public static int a(int p0,int p1,int p2){
       if (p0 < p1) {
          p0 = p1;
       }else if(p0 > p2){
          p0 = p2;
       }
       return p0;
    }
    public static void b(Bitmap p0,int p1,int p2){
       int i4;
       int i7;
       int i8;
       int i9;
       int i10;
       int i11;
       int i12;
       int i13;
       int i14;
       int i15;
       int width = p0.getWidth();
       int height = p0.getHeight();
       int[] ointArray = new int[(width * height)];
       p0.getPixels(ointArray, 0, width, 0, 0, width, height);
       int i = p2 + 1;
       int i1 = i + p2;
       int[] ointArray1 = new int[(i1 * 256)];
       int i2 = 1;
       int i3 = 255;
       while (i2 <= i3) {
          for (i4 = 0; i4 < i1; i4 = i4 + 1) {
             ointArray1[i] = i2;
             i = i + 1;
          }
          i2 = i2 + 1;
       }
       int[] ointArray2 = new int[Math.max(width, height)];
       i2 = p1;
       for (int i5 = 0; i5 < i2; i2 = p1) {
          int i6 = 0;
          while (i6 < height) {
             i7 = width * i6;
             i6 = i6 + 1;
             i8 = i6 * width;
             i8 = i8 - 1;
             i9 = i1 >> 1;
             i10 = - i9;
             i11 = 0;
             i12 = 0;
             i13 = 0;
             i14 = 0;
             i4 = width + i9;
             while (i10 < i4) {
                i4 = i7 + i10;
                i4 = ointArray[a.a(i4, i7, i8)];
                i2 = i4 >> 16;
                i2 = i2 & i3;
                i11 = i11 + i2;
                i2 = i4 >> 8;
                i2 = i2 & i3;
                i12 = i12 + i2;
                i2 = i4 & 0x00ff;
                i13 = i13 + i2;
                i2 = i4 >> 24;
                i14 = i14 + i2;
                if (i10 >= i9) {
                   i2 = i10 - i9;
                   i4 = ointArray1[i14] << 24;
                   i15 = ointArray1[i11] << 16;
                   i4 = i4 | i15;
                   i15 = ointArray1[i12] << 8;
                   i4 = i4 | i15;
                   i4 = i4 | ointArray1[i13];
                   ointArray2[i2] = i4;
                   i2 = i1 - 1;
                   i2 = i10 - i2;
                   i2 = i2 + i7;
                   i2 = ointArray[a.a(i2, i7, i8)];
                   i4 = i2 >> 16;
                   i4 = i4 & i3;
                   i11 = i11 - i4;
                   i4 = i2 >> 8;
                   i4 = i4 & i3;
                   i12 = i12 - i4;
                   i4 = i2 & 0x00ff;
                   i13 = i13 - i4;
                   i2 = i2 >> 24;
                   i14 = i14 - i2;
                }
                i10 = i10 + 1;
                i2 = p1;
             }
             System.arraycopy(ointArray2, 0, ointArray, i7, width);
             i2 = p1;
          }
          i4 = 0;
          while (i4 < width) {
             i6 = height - 1;
             i6 = i6 * width;
             i6 = i6 + i4;
             i7 = i1 >> 1;
             i7 = i7 * width;
             i8 = i1 - 1;
             i8 = i8 * width;
             i9 = i4 - i7;
             i10 = 0;
             i11 = 0;
             i12 = 0;
             i13 = 0;
             i14 = 0;
             i2 = i6 + i7;
             while (i9 <= i2) {
                i2 = ointArray[a.a(i9, i4, i6)];
                i15 = i1;
                i1 = i2 >> 16;
                i1 = i1 & i3;
                i10 = i10 + i1;
                i1 = i2 >> 8;
                i1 = i1 & i3;
                i11 = i11 + i1;
                i1 = i2 & 0x00ff;
                i12 = i12 + i1;
                i1 = i2 >> 24;
                i13 = i13 + i1;
                i1 = i9 - i7;
                if (i1 >= i4) {
                   i1 = ointArray1[i13] << 24;
                   i2 = ointArray1[i10] << 16;
                   i1 = i1 | i2;
                   i2 = ointArray1[i11] << 8;
                   i1 = i1 | i2;
                   i1 = i1 | ointArray1[i12];
                   ointArray2[i14] = i1;
                   i14 = i14 + 1;
                   i1 = i9 - i8;
                   i1 = ointArray[a.a(i1, i4, i6)];
                   i2 = i1 >> 16;
                   i2 = i2 & i3;
                   i10 = i10 - i2;
                   i2 = i1 >> 8;
                   i2 = i2 & i3;
                   i11 = i11 - i2;
                   i2 = i1 & 0x00ff;
                   i12 = i12 - i2;
                   i1 = i1 >> 24;
                   i13 = i13 - i1;
                }
                i9 = i9 + width;
                i1 = i15;
             }
             i15 = i1;
             i2 = i4;
             for (i1 = 0; i1 < height; i1 = i1 + 1) {
                ointArray[i2] = ointArray2[i1];
                i2 = i2 + width;
             }
             i4 = i4 + 1;
             i1 = i15;
             i2 = 0;
          }
          i5 = i5 + 1;
       }
       p0.setPixels(ointArray, 0, width, 0, 0, width, height);
       return;
    }
}
