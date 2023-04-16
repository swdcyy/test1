package mwd.a$a;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import mwd.a;
import java.io.IOException;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Integer;

public class a$a extends FilterOutputStream	// class@001d5d
{
    public boolean b;
    public int c;
    public byte[] d;
    public int e;
    public int f;
    public boolean g;
    public byte[] h;
    public boolean i;
    public int j;
    public byte[] k;

    public void a$a(OutputStream p0){
       super(p0, 1);
    }
    public void a$a(OutputStream p0,int p1){
       super(p0);
       int b = true;
       int b1 = (p1 & 0x08)? true: false;
       this.g = b1;
       if (!(p1 & 0x01)) {
          b = false;
       }
       this.b = b;
       b1 = 4;
       b = (b)? 3: 4;
       this.e = b;
       byte[] uobyteArray = new byte[b];
       this.d = uobyteArray;
       this.c = 0;
       this.f = 0;
       this.i = false;
       byte[] uobyteArray1 = new byte[b1];
       this.h = uobyteArray1;
       this.j = p1;
       this.k = a.e(p1);
       return;
    }
    public void close(){
       a$a tc = this.c;
       if (tc > null) {
          if (this.b != null) {
             a$a th = this.h;
             a.b(th, this.d, tc, this.j);
             this.out.write(th);
             this.c = 0;
          }else {
             throw new IOException("Base64 input not properly padded.");
          }
       }
       super.close();
       this.d = null;
       this.out = null;
       return;
    }
    public void write(int p0){
       a$a td;
       a$a tc;
       int i;
       a$a te;
       int i3;
       Object[] objArray;
       if (this.i != null) {
          this.out.write(p0);
          return;
       }else if(this.b != null){
          td = this.d;
          tc = this.c;
          i = tc + 1;
          this.c = i;
          td[tc] = (byte)p0;
          te = this.e;
          if (i >= te) {
             a$a th = this.h;
             a.b(th, td, te, this.j);
             this.out.write(th);
             te = this.f + 4;
             this.f = te;
             if (this.g != null && te >= 76) {
                this.out.write(10);
                this.f = 0;
             }
             this.c = 0;
          }
       }else {
          td = this.k;
          int i1 = p0 & 0x7f;
          int i2 = -5;
          if (td[i1] > i2) {
             td = this.d;
             tc = this.c;
             i = tc + 1;
             this.c = i;
             td[tc] = (byte)p0;
             if (i >= this.e) {
                te = this.h;
                tc = this.j;
                if (td != null) {
                   if (te != null) {
                      i2 = 3;
                      if (i2 < td.length) {
                         if (2 < te.length) {
                            byte[] uobyteArray = a.e(tc);
                            byte b = 61;
                            if (td[2] == b) {
                               te[0] = (byte)((((uobyteArray[td[1]] & 0x00ff) << 12) | ((uobyteArray[td[0]] & 0x00ff) << 18)) >> 16);
                               i2 = 1;
                            }else if(td[i2] == b){
                               i3 = ((uobyteArray[td[2]] & 0x00ff) << 6) | (((uobyteArray[td[0]] & 0x00ff) << 18) | ((uobyteArray[td[1]] & 0x00ff) << 12));
                               te[0] = (byte)(i3 >> 16);
                               te[1] = (byte)(i3 >> 8);
                               i2 = 2;
                            }else {
                               i3 = (uobyteArray[td[i2]] & 0x00ff) | ((((uobyteArray[td[0]] & 0x00ff) << 18) | ((uobyteArray[td[1]] & 0x00ff) << 12)) | ((uobyteArray[td[2]] & 0x00ff) << 6));
                               te[0] = (byte)(i3 >> 16);
                               te[1] = (byte)(i3 >> 8);
                               te[2] = (byte)i3;
                            }
                            this.out.write(this.h, 0, i2);
                            this.c = 0;
                         }else {
                            objArray = new Object[]{Integer.valueOf(te.length),Integer.valueOf(0)};
                            throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", objArray));
                         }
                      }else {
                         objArray = new Object[]{Integer.valueOf(td.length),Integer.valueOf(0)};
                         throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", objArray));
                      }
                   }else {
                      throw new IllegalArgumentException("Destination array was null.");
                   }
                }else {
                   throw new IllegalArgumentException("Source array was null.");
                }
             }
          }else if(td[i1] == i2){
             throw new IOException("Invalid character in Base64 data.");
          }
       }
       return;
    }
    public void write(byte[] p0,int p1,int p2){
       if (this.i != null) {
          this.out.write(p0, p1, p2);
          return;
       }else {
          for (int i = 0; i < p2; i = i + 1) {
             int i1 = p1 + i;
             this.write(p0[i1]);
          }
          return;
       }
    }
}
