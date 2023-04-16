package com.ta.utdid2.a.a.b$b;
import com.ta.utdid2.a.a.b$a;

public class b$b extends b$a	// class@000cbd
{
    public final int[] c;
    public int state;
    public int value;
    public static final int[] a;
    public static final int[] b;

    static {
       b$b.a = new int[256]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'>',-1,-1,-1,'?','4','5','6','7','8','9',':',';','<','=',-1,-1,-1,-2,-1,-1,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,-1,-1,-1,-1,-1,-1,26,27,28,29,30,31,32,'!','"','#','$','%','&',39,'(',')','*','+',',','-','.','/','0','1','2','3',-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
       b$b.b = new int[256]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,'>',-1,-1,'4','5','6','7','8','9',':',';','<','=',-1,-1,-1,-2,-1,-1,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,-1,-1,-1,-1,'?',-1,26,27,28,29,30,31,32,'!','"','#','$','%','&',39,'(',')','*','+',',','-','.','/','0','1','2','3',-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
    }
    public void b$b(int p0,byte[] p1){
       super();
       this.a = p1;
       int[] a = (!(p0 & 0x08))? b$b.a: b$b.b;
       this.c = a;
       this.state = 0;
       this.value = 0;
       return;
    }
    public boolean a(byte[] p0,int p1,int p2,boolean p3){
       int i4;
       int i5;
       int i6;
       int i7;
       b$b uob = this;
       b$b state = uob.state;
       int b = false;
       if (state == 6) {
          return b;
       }
       int i = p2 + p1;
       b$a a = uob.a;
       b$b c = uob.c;
       b$b uob1 = uob.value;
       int i1 = 0;
       b$b uob2 = state;
       int i2 = p1;
       while (true) {
          boolean i3 = 3;
          boolean b1 = true;
          if (i2 < i) {
             if (!uob2) {
                i4 = i2 + 4;
                while (i4 <= i) {
                   i5 = p0[i2] & 0x00ff;
                   i5 = c[i5] << 18;
                   i6 = i2 + 1;
                   i6 = p0[i6] & 0x00ff;
                   i6 = c[i6] << 12;
                   i5 = i5 | i6;
                   i6 = i2 + 2;
                   i6 = p0[i6] & 0x00ff;
                   i6 = c[i6] << 6;
                   i5 = i5 | i6;
                   i6 = i2 + 3;
                   i6 = p0[i6] & 0x00ff;
                   i5 = i5 | c[i6];
                   if (i5 >= 0) {
                      i2 = i1 + 2;
                      a[i2] = (byte)i5;
                      i2 = i1 + 1;
                      i6 = i5 >> 8;
                      a[i2] = (byte)i6;
                      i2 = i5 >> 16;
                      a[i1] = (byte)i2;
                      i1 = i1 + 3;
                      i2 = i4;
                   }else if(i2 >= i){
                   label_00f0 :
                      if (!p3) {
                         uob.state = uob2;
                         uob.value = i5;
                         uob.a = i1;
                         return b1;
                      }else if(uob2 != b1){
                         if (uob2 != 2) {
                            if (uob2 != i3) {
                               if (uob2 == 4) {
                                  uob.state = 6;
                               label_00bf :
                                  return false;
                               }
                            }else {
                               i2 = i1 + 1;
                               a[i1] = (byte)(i5 >> 10);
                               i1 = i2 + 1;
                               a[i2] = (byte)(i5 >> 2);
                            }
                         }else {
                            a[i1] = (byte)(i5 >> 4);
                            i1 = i1 + 1;
                         }
                         uob.state = uob2;
                         uob.a = i1;
                         return b1;
                      }else {
                         uob.state = 6;
                         goto label_00bf ;
                      }
                   }
                }
             }
             i4 = i2 + 1;
             i2 = p0[i2] & 0x00ff;
             i2 = c[i2];
             i6 = 5;
             b = -1;
             if (uob2) {
                if (uob2 != b1) {
                   b1 = -2;
                   if (uob2 != 2) {
                      if (uob2 != i3) {
                         if (uob2 != 4) {
                            if (uob2 == i6 && i2 != b) {
                               uob.state = 6;
                               break ;
                            }
                         }else {
                            i3 = false;
                            if (i2 == b1) {
                               uob2 = uob2 + 1;
                            }else if(i2 != b){
                               uob.state = 6;
                               return i3;
                            }
                         }
                      }else if(i2 >= 0){
                         b = i5 << 6;
                         i2 = i2 | b;
                         b = i1 + 2;
                         a[b] = (byte)i2;
                         b = i1 + 1;
                         i7 = i2 >> 8;
                         a[b] = (byte)i7;
                         b = i2 >> 16;
                         a[i1] = (byte)b;
                         i1 = i1 + 3;
                         i5 = i2;
                         i7 = 0;
                      }else if(i2 == b1){
                         i2 = i1 + 1;
                         b = i5 >> 2;
                         a[i2] = (byte)b;
                         i2 = i5 >> 10;
                         a[i1] = (byte)i2;
                         i1 = i1 + 2;
                         i7 = 5;
                      }else if(i2 != b){
                         uob.state = 6;
                         goto label_00bf ;
                      }
                   }else if(i2 >= 0){
                      if (i2 == b1) {
                         i2 = i1 + 1;
                         b = i5 >> 4;
                         a[i1] = (byte)b;
                         i1 = i2;
                         i7 = 4;
                      }else if(i2 != b){
                         uob.state = 6;
                         goto label_00bf ;
                      }
                   }
                }else if(i2 >= 0){
                   if (i2 != b) {
                      uob.state = 6;
                      break ;
                   }
                }
                b = i5 << 6;
                i2 = i2 | b;
             label_00e3 :
                i7 = uob2 + 1;
                i5 = i2;
             }else {
                i3 = false;
                if (i2 >= 0) {
                   goto label_00e3 ;
                }else if(i2 != b){
                   uob.state = 6;
                   return i3;
                }
             }
          label_00ec :
             i2 = i4;
             b = 0;
          }else {
             goto label_00f0 ;
          }
       }
       return false;
    }
}
