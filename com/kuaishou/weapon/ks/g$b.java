package com.kuaishou.weapon.ks.g$b;
import com.kuaishou.weapon.ks.g$a;

public class g$b extends g$a	// class@00120d
{
    public int g;
    public int h;
    public final int[] i;
    public static final int[] c;
    public static final int[] d;

    static {
       g$b.c = new int[256]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'>',-1,-1,-1,'?','4','5','6','7','8','9',':',';','<','=',-1,-1,-1,-2,-1,-1,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,-1,-1,-1,-1,-1,-1,26,27,28,29,30,31,32,'!','"','#','$','%','&',39,'(',')','*','+',',','-','.','/','0','1','2','3',-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
       g$b.d = new int[256]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'>',-1,-1,'4','5','6','7','8','9',':',';','<','=',-1,-1,-1,-2,-1,-1,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,-1,-1,-1,-1,'?',-1,26,27,28,29,30,31,32,'!','"','#','$','%','&',39,'(',')','*','+',',','-','.','/','0','1','2','3',-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    }
    public void g$b(int p0,byte[] p1){
       super();
       this.a = p1;
       int[] c = (!(p0 & 0x08))? g$b.c: g$b.d;
       this.i = c;
       this.g = 0;
       this.h = 0;
       return;
    }
    public int a(int p0){
       return (((p0 * 3) / 4) + 10);
    }
    public boolean a(byte[] p0,int p1,int p2,boolean p3){
       int i5;
       int i6;
       int i7;
       int i8;
       g$b uob = this;
       g$b g = uob.g;
       int b = false;
       if (g == 6) {
          return b;
       }
       int i = p2 + p1;
       g$a a = uob.a;
       g$b i1 = uob.i;
       g$b uob1 = uob.h;
       int i2 = 0;
       g$b uob2 = g;
       int i3 = p1;
       while (true) {
          boolean i4 = 3;
          boolean b1 = true;
          if (i3 < i) {
             if (!uob2) {
                i5 = i3 + 4;
                while (i5 <= i) {
                   i6 = p0[i3] & 0x00ff;
                   i6 = i1[i6] << 18;
                   i7 = i3 + 1;
                   i7 = p0[i7] & 0x00ff;
                   i7 = i1[i7] << 12;
                   i6 = i6 | i7;
                   i7 = i3 + 2;
                   i7 = p0[i7] & 0x00ff;
                   i7 = i1[i7] << 6;
                   i6 = i6 | i7;
                   i7 = i3 + 3;
                   i7 = p0[i7] & 0x00ff;
                   i6 = i6 | i1[i7];
                   if (i6 >= 0) {
                      i3 = i2 + 2;
                      a[i3] = (byte)i6;
                      i3 = i2 + 1;
                      i7 = i6 >> 8;
                      a[i3] = (byte)i7;
                      i3 = i6 >> 16;
                      a[i2] = (byte)i3;
                      i2 = i2 + 3;
                      i3 = i5;
                   }else if(i3 >= i){
                   label_00ef :
                      if (!p3) {
                         uob.g = uob2;
                         uob.h = i6;
                      }else if(uob2 != b1){
                         if (uob2 != 2) {
                            if (uob2 != i4) {
                               if (uob2 == 4) {
                               label_00bd :
                                  uob.g = 6;
                                  return false;
                               }
                            }else {
                               i3 = i2 + 1;
                               a[i2] = (byte)(i6 >> 10);
                               i2 = i3 + 1;
                               a[i3] = (byte)(i6 >> 2);
                            }
                         }else {
                            a[i2] = (byte)(i6 >> 4);
                            i2 = i2 + 1;
                         }
                         uob.g = uob2;
                      }else {
                         goto label_00bd ;
                      }
                      uob.b = i2;
                      return b1;
                   }
                }
             }
             i5 = i3 + 1;
             i3 = p0[i3] & 0x00ff;
             i3 = i1[i3];
             i7 = 5;
             b = -1;
             if (uob2) {
                if (uob2 != b1) {
                   b1 = -2;
                   if (uob2 != 2) {
                      if (uob2 != i4) {
                         if (uob2 != 4) {
                            if (uob2 != i7 || i3 == b) {
                            label_00eb :
                               i3 = i5;
                               b = 0;
                            }
                         }else {
                            i4 = false;
                            if (i3 == b1) {
                               uob2 = uob2 + 1;
                               goto label_00eb ;
                            }else if(i3 != b){
                               uob.g = 6;
                               return i4;
                            }else {
                               goto label_00eb ;
                            }
                         }
                      }else if(i3 >= 0){
                         b = i6 << 6;
                         i3 = i3 | b;
                         b = i2 + 2;
                         a[b] = (byte)i3;
                         b = i2 + 1;
                         i8 = i3 >> 8;
                         a[b] = (byte)i8;
                         b = i3 >> 16;
                         a[i2] = (byte)b;
                         i2 = i2 + 3;
                         i6 = i3;
                         i8 = 0;
                         goto label_00eb ;
                      }else if(i3 == b1){
                         i3 = i2 + 1;
                         b = i6 >> 2;
                         a[i3] = (byte)b;
                         i3 = i6 >> 10;
                         a[i2] = (byte)i3;
                         i2 = i2 + 2;
                         i8 = 5;
                         goto label_00eb ;
                      }else if(i3 != b){
                         goto label_00bd ;
                      }else {
                         goto label_00eb ;
                      }
                   }else if(i3 >= 0){
                      if (i3 == b1) {
                         i3 = i2 + 1;
                         b = i6 >> 4;
                         a[i2] = (byte)b;
                         i2 = i3;
                         i8 = 4;
                         goto label_00eb ;
                      }else if(i3 != b){
                      }
                   }
                   break ;
                }else {
                   i4 = false;
                   if (i3 < 0) {
                      if (i3 != b) {
                         uob.g = 6;
                         return i4;
                      }else {
                         goto label_00eb ;
                      }
                   }
                }
                b = i6 << 6;
                i3 = i3 | b;
             label_00e2 :
                i8 = uob2 + 1;
                i6 = i3;
                goto label_00eb ;
             }else {
                i4 = false;
                if (i3 >= 0) {
                   goto label_00e2 ;
                }else if(i3 != b){
                   uob.g = 6;
                   return i4;
                }else {
                   goto label_00eb ;
                }
             }
          }else {
             goto label_00ef ;
          }
       }
       uob.g = 6;
       return false;
    }
}
