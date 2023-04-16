package r87.v;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;
import java.lang.System;
import java.lang.IllegalArgumentException;

public class v	// class@002331
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public char[] h;
    public int i;
    public static final char[][] j;
    public static final char[][] k;
    public static final char[][] l;
    public static final char[][] m;
    public static final char[] n;
    public static final char[] o;

    static {
       char[][] uocharArray = new char[][12];
       uocharArray[0] = new char[2]{'0','1'};
       uocharArray[1] = new char[2]{'0','2'};
       uocharArray[2] = new char[2]{'0','3'};
       uocharArray[3] = new char[2]{'0','4'};
       uocharArray[4] = new char[2]{'0','5'};
       uocharArray[5] = new char[2]{'0','6'};
       uocharArray[6] = new char[2]{'0','7'};
       uocharArray[7] = new char[2]{'0','8'};
       uocharArray[8] = new char[2]{'0','9'};
       uocharArray[9] = new char[2]{'1','0'};
       uocharArray[10] = new char[2]{'1','1'};
       uocharArray[11] = new char[2]{'1','2'};
       v.j = uocharArray;
       uocharArray = new char[][31];
       uocharArray[0] = new char[2]{'0','1'};
       uocharArray[1] = new char[2]{'0','2'};
       uocharArray[2] = new char[2]{'0','3'};
       uocharArray[3] = new char[2]{'0','4'};
       uocharArray[4] = new char[2]{'0','5'};
       uocharArray[5] = new char[2]{'0','6'};
       uocharArray[6] = new char[2]{'0','7'};
       uocharArray[7] = new char[2]{'0','8'};
       uocharArray[8] = new char[2]{'0','9'};
       uocharArray[9] = new char[2]{'1','0'};
       uocharArray[10] = new char[2]{'1','1'};
       uocharArray[11] = new char[2]{'1','2'};
       uocharArray[12] = new char[2]{'1','3'};
       uocharArray[13] = new char[2]{'1','4'};
       uocharArray[14] = new char[2]{'1','5'};
       uocharArray[15] = new char[2]{'1','6'};
       uocharArray[16] = new char[2]{'1','7'};
       uocharArray[17] = new char[2]{'1','8'};
       uocharArray[18] = new char[2]{'1','9'};
       uocharArray[19] = new char[2]{'2','0'};
       uocharArray[20] = new char[2]{'2','1'};
       uocharArray[21] = new char[2]{'2','2'};
       uocharArray[22] = new char[2]{'2','3'};
       uocharArray[23] = new char[2]{'2','4'};
       uocharArray[24] = new char[2]{'2','5'};
       uocharArray[25] = new char[2]{'2','6'};
       uocharArray[26] = new char[2]{'2','7'};
       uocharArray[27] = new char[2]{'2','8'};
       uocharArray[28] = new char[2]{'2','9'};
       uocharArray[29] = new char[2]{'3','0'};
       uocharArray[30] = new char[2]{'3','1'};
       v.k = uocharArray;
       uocharArray = new char[][24];
       uocharArray[0] = new char[2]{'0','0'};
       uocharArray[1] = new char[2]{'0','1'};
       uocharArray[2] = new char[2]{'0','2'};
       uocharArray[3] = new char[2]{'0','3'};
       uocharArray[4] = new char[2]{'0','4'};
       uocharArray[5] = new char[2]{'0','5'};
       uocharArray[6] = new char[2]{'0','6'};
       uocharArray[7] = new char[2]{'0','7'};
       uocharArray[8] = new char[2]{'0','8'};
       uocharArray[9] = new char[2]{'0','9'};
       uocharArray[10] = new char[2]{'1','0'};
       uocharArray[11] = new char[2]{'1','1'};
       uocharArray[12] = new char[2]{'1','2'};
       uocharArray[13] = new char[2]{'1','3'};
       uocharArray[14] = new char[2]{'1','4'};
       uocharArray[15] = new char[2]{'1','5'};
       uocharArray[16] = new char[2]{'1','6'};
       uocharArray[17] = new char[2]{'1','7'};
       uocharArray[18] = new char[2]{'1','8'};
       uocharArray[19] = new char[2]{'1','9'};
       uocharArray[20] = new char[2]{'2','0'};
       uocharArray[21] = new char[2]{'2','1'};
       uocharArray[22] = new char[2]{'2','2'};
       uocharArray[23] = new char[2]{'2','3'};
       v.l = uocharArray;
       uocharArray = new char[][60];
       uocharArray[0] = new char[2]{'0','0'};
       uocharArray[1] = new char[2]{'0','1'};
       uocharArray[2] = new char[2]{'0','2'};
       uocharArray[3] = new char[2]{'0','3'};
       uocharArray[4] = new char[2]{'0','4'};
       uocharArray[5] = new char[2]{'0','5'};
       uocharArray[6] = new char[2]{'0','6'};
       uocharArray[7] = new char[2]{'0','7'};
       uocharArray[8] = new char[2]{'0','8'};
       uocharArray[9] = new char[2]{'0','9'};
       uocharArray[10] = new char[2]{'1','0'};
       uocharArray[11] = new char[2]{'1','1'};
       uocharArray[12] = new char[2]{'1','2'};
       uocharArray[13] = new char[2]{'1','3'};
       uocharArray[14] = new char[2]{'1','4'};
       uocharArray[15] = new char[2]{'1','5'};
       uocharArray[16] = new char[2]{'1','6'};
       uocharArray[17] = new char[2]{'1','7'};
       uocharArray[18] = new char[2]{'1','8'};
       uocharArray[19] = new char[2]{'1','9'};
       uocharArray[20] = new char[2]{'2','0'};
       uocharArray[21] = new char[2]{'2','1'};
       uocharArray[22] = new char[2]{'2','2'};
       uocharArray[23] = new char[2]{'2','3'};
       uocharArray[24] = new char[2]{'2','4'};
       uocharArray[25] = new char[2]{'2','5'};
       uocharArray[26] = new char[2]{'2','6'};
       uocharArray[27] = new char[2]{'2','7'};
       uocharArray[28] = new char[2]{'2','8'};
       uocharArray[29] = new char[2]{'2','9'};
       uocharArray[30] = new char[2]{'3','0'};
       uocharArray[31] = new char[2]{'3','1'};
       uocharArray[32] = new char[2]{'3','2'};
       uocharArray[33] = new char[2]{'3','3'};
       uocharArray[34] = new char[2]{'3','4'};
       uocharArray[35] = new char[2]{'3','5'};
       uocharArray[36] = new char[2]{'3','6'};
       uocharArray[37] = new char[2]{'3','7'};
       uocharArray[38] = new char[2]{'3','8'};
       uocharArray[39] = new char[2]{'3','9'};
       uocharArray[40] = new char[2]{'4','0'};
       uocharArray[41] = new char[2]{'4','1'};
       uocharArray[42] = new char[2]{'4','2'};
       uocharArray[43] = new char[2]{'4','3'};
       uocharArray[44] = new char[2]{'4','4'};
       uocharArray[45] = new char[2]{'4','5'};
       uocharArray[46] = new char[2]{'4','6'};
       uocharArray[47] = new char[2]{'4','7'};
       uocharArray[48] = new char[2]{'4','8'};
       uocharArray[49] = new char[2]{'4','9'};
       uocharArray[50] = new char[2]{'5','0'};
       uocharArray[51] = new char[2]{'5','1'};
       uocharArray[52] = new char[2]{'5','2'};
       uocharArray[53] = new char[2]{'5','3'};
       uocharArray[54] = new char[2]{'5','4'};
       uocharArray[55] = new char[2]{'5','5'};
       uocharArray[56] = new char[2]{'5','6'};
       uocharArray[57] = new char[2]{'5','7'};
       uocharArray[58] = new char[2]{'5','8'};
       uocharArray[59] = new char[2]{'5','9'};
       v.m = uocharArray;
       v.n = new char[100]{'0','0','0','0','0','0','0','0','0','0','1','1','1','1','1','1','1','1','1','1','2','2','2','2','2','2','2','2','2','2','3','3','3','3','3','3','3','3','3','3','4','4','4','4','4','4','4','4','4','4','5','5','5','5','5','5','5','5','5','5','6','6','6','6','6','6','6','6','6','6','7','7','7','7','7','7','7','7','7','7','8','8','8','8','8','8','8','8','8','8','9','9','9','9','9','9','9','9','9','9'};
       v.o = new char[100]{'0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9','0','1','2','3','4','5','6','7','8','9'};
    }
    public void v(){
       super();
       this.a = -1;
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.f = -1;
       this.g = -1;
    }
    public final void a(int p0){
       if (p0 == this.c) {
          this.i = this.i + 3;
          return;
       }else {
          v th = this.h;
          v ti = this.i;
          int i = ti + 1;
          this.i = i;
          char[][] k = v.k;
          int i1 = p0 - 1;
          th[ti] = k[i1][0];
          int i2 = i + 1;
          this.i = i2;
          th[i] = k[i1][1];
          this.i = i2 + 1;
          th[i2] = ' ';
          this.c = p0;
          return;
       }
    }
    public final void b(int p0){
       if (p0 == this.d) {
          this.i = this.i + 3;
          return;
       }else {
          v th = this.h;
          v ti = this.i;
          int i = ti + 1;
          this.i = i;
          char[][] l = v.l;
          th[ti] = l[p0][0];
          int i1 = i + 1;
          this.i = i1;
          th[i] = l[p0][1];
          this.i = i1 + 1;
          th[i1] = ':';
          this.d = p0;
          return;
       }
    }
    public final void c(int p0){
       v ti;
       if (p0 == this.g) {
          return;
       }
       int i = p0 / 100;
       char c = '0';
       if (!i) {
          ti = this.i;
          this.i = ti + 1;
          this.h[ti] = c;
       }else {
          ti = this.i;
          this.i = ti + 1;
          this.h[ti] = v.o[i];
       }
       i = p0 - (i * 100);
       if (i > 9) {
          v ti1 = this.i;
          this.i = ti1 + 1;
          this.h[ti1] = v.n[i];
       }else {
          ti = this.i;
          this.i = ti + 1;
          this.h[ti] = c;
       }
       this.h[this.i] = v.o[i];
       this.g = p0;
       return;
    }
    public final void d(int p0){
       if (p0 == this.e) {
          this.i = this.i + 3;
          return;
       }else {
          v th = this.h;
          v ti = this.i;
          int i = ti + 1;
          this.i = i;
          char[][] m = v.m;
          th[ti] = m[p0][0];
          int i1 = i + 1;
          this.i = i1;
          th[i] = m[p0][1];
          this.i = i1 + 1;
          th[i1] = ':';
          this.e = p0;
          return;
       }
    }
    public final void e(int p0){
       if (p0 == this.b) {
          this.i = this.i + 3;
          return;
       }else {
          v th = this.h;
          v ti = this.i;
          int i = ti + 1;
          this.i = i;
          char[][] j = v.j;
          int i1 = p0 - 1;
          th[ti] = j[i1][0];
          int i2 = i + 1;
          this.i = i2;
          th[i] = j[i1][1];
          this.i = i2 + 1;
          th[i2] = '-';
          this.b = p0;
          return;
       }
    }
    public final void f(int p0){
       if (p0 == this.f) {
          this.i = this.i + 3;
          return;
       }else {
          v th = this.h;
          v ti = this.i;
          int i = ti + 1;
          this.i = i;
          char[][] m = v.m;
          th[ti] = m[p0][0];
          int i1 = i + 1;
          this.i = i1;
          th[i] = m[p0][1];
          this.i = i1 + 1;
          th[i1] = '.';
          this.f = p0;
          return;
       }
    }
    public final void g(int p0){
       int i;
       v ti;
       if (p0 == this.a) {
          this.i = this.i + 5;
          return;
       }else if(p0 < 2000 || p0 >= 2100){
          char[] uocharArray = (Integer.toString(p0)).toCharArray();
          i = 4;
          if (uocharArray.length >= i) {
             System.arraycopy(uocharArray, (uocharArray.length - i), this.h, 0, i);
             this.i = this.i + i;
          }else {
             throw new IllegalArgumentException("year is not right!");
          }
       }else {
          v th = this.h;
          ti = this.i;
          i = ti + 1;
          this.i = i;
          th[ti] = '2';
          int i1 = i + 1;
          this.i = i1;
          th[i] = '0';
          i = p0 - 2000;
          int i2 = i1 + 1;
          this.i = i2;
          th[i1] = v.n[i];
          this.i = i2 + 1;
          th[i2] = v.o[i];
       }
       ti = this.i;
       this.i = ti + 1;
       this.h[ti] = '-';
       this.a = p0;
       return;
    }
}
