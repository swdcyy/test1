package j2.a$b;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import j2.a;
import java.nio.charset.Charset;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import j2.a$d;
import java.lang.Double;
import java.lang.NumberFormatException;
import java.lang.Integer;
import j2.a$a;
import java.io.InputStream;

public class a$b	// class@00221b
{
    public final int a;
    public final int b;
    public final byte[] c;

    public void a$b(int p0,int p1,byte[] p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static a$b a(String p0){
       byte[] bytes = (p0+0).getBytes(a.Y);
       return new a$b(2, bytes.length, bytes);
    }
    public static a$b b(long p0,ByteOrder p1){
       long[] olongArray = new long[]{p0};
       return a$b.c(olongArray, p1);
    }
    public static a$b c(long[] p0,ByteOrder p1){
       byte[] uobyteArray = new byte[(a.E[4] * p0.length)];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.order(p1);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uByteBuffer.putInt((int)p0[i]);
       }
       return new a$b(4, p0.length, uByteBuffer.array());
    }
    public static a$b d(a$d p0,ByteOrder p1){
       a$d[] uodArray = new a$d[]{p0};
       return a$b.e(uodArray, p1);
    }
    public static a$b e(a$d[] p0,ByteOrder p1){
       byte[] uobyteArray = new byte[(a.E[5] * p0.length)];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.order(p1);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          uByteBuffer.putInt((int)oobject.a);
          uByteBuffer.putInt((int)oobject.b);
       }
       return new a$b(5, p0.length, uByteBuffer.array());
    }
    public static a$b f(int p0,ByteOrder p1){
       int[] ointArray = new int[]{p0};
       return a$b.g(ointArray, p1);
    }
    public static a$b g(int[] p0,ByteOrder p1){
       byte[] uobyteArray = new byte[(a.E[3] * p0.length)];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.order(p1);
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          uByteBuffer.putShort((short)p0[i]);
       }
       return new a$b(3, p0.length, uByteBuffer.array());
    }
    public double h(ByteOrder p0){
       p0 = this.k(p0);
       if (p0 == null) {
          throw new NumberFormatException("NULL can\'t be converted to a double value");
       }
       if (p0 instanceof String) {
          return Double.parseDouble(p0);
       }
       if (p0 instanceof long[]) {
          if (p0.length == 1) {
             return (double)p0[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else if(p0 instanceof int[]){
          if (p0.length == 1) {
             return (double)p0[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else if(p0 instanceof double[]){
          if (p0.length == 1) {
             return p0[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else if(p0 instanceof a$d[]){
          if (p0.length == 1) {
             return p0[0].a();
          }
          throw new NumberFormatException("There are more than one component");
       }else {
          throw new NumberFormatException("Couldn\'t find a double value");
       }
    }
    public int i(ByteOrder p0){
       p0 = this.k(p0);
       if (p0 == null) {
          throw new NumberFormatException("NULL can\'t be converted to a integer value");
       }
       if (p0 instanceof String) {
          return Integer.parseInt(p0);
       }
       if (p0 instanceof long[]) {
          if (p0.length == 1) {
             return (int)p0[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else if(p0 instanceof int[]){
          if (p0.length == 1) {
             return p0[0];
          }
          throw new NumberFormatException("There are more than one component");
       }else {
          throw new NumberFormatException("Couldn\'t find a integer value");
       }
    }
    public String j(ByteOrder p0){
       p0 = this.k(p0);
       String str = null;
       if (p0 == null) {
          return str;
       }
       if (p0 instanceof String) {
          return p0;
       }
       StringBuilder str1 = "";
       int i = 0;
       if (p0 instanceof long[]) {
          while (i < p0.length) {
             str1 = str1+p0[i];
             i = i + 1;
             if (i != p0.length) {
                str1 = str1+",";
             }
          }
          return str1;
       }else if(p0 instanceof int[]){
          while (i < p0.length) {
             str1 = str1+p0[i];
             i = i + 1;
             if (i != p0.length) {
                str1 = str1+",";
             }
          }
          return str1;
       }else if(p0 instanceof double[]){
          while (i < p0.length) {
             str1 = str1+p0[i];
             i = i + 1;
             if (i != p0.length) {
                str1 = str1+",";
             }
          }
          return str1;
       }else if(p0 instanceof a$d[]){
          while (i < p0.length) {
             str1 = str1+p0[i].a+'/'+p0[i].b;
             i = i + 1;
             if (i != p0.length) {
                str1 = str1+",";
             }
          }
          return str1;
       }else {
          return str;
       }
    }
    public Object k(ByteOrder p0){
       InputStream inputStream;
       int[] ointArray;
       a$d[] uodArray;
       double[] uodoubleArra;
       Object obj = null;
       try{
          a$b tc = this.c;
          try{
             a$a uoa = new a$a(tc);
             uoa.e(p0);
             byte i = 1;
             int i1 = 0;
             switch (this.a){
                 case 1:
                 case 6:
                   break;
                 case 2:
                 case 7:
                   if (this.b >= a.F.length) {
                      int i2 = 0;
                      byte[] f = a.F;
                      while (i2 < f.length) {
                         if (this.c[i2] != f[i2]) {
                            i = 0;
                            break ;
                         }
                         i2++;
                      }
                      if (i) {
                         i1 = f.length;
                      }
                   }
                   String str2 = "";
                   while (i1 < this.b) {
                      i = this.c[i1];
                      if (!i) {
                         break ;
                      }else if(i >= 32){
                         str2 = str2+(char)i;
                      }else {
                         str2 = str2+'?';
                      }
                      i1 = i1 + 1;
                   }
                   str2 = str2;
                   try{
                      uoa.close();
                      return str2;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 3:
                   ointArray = new int[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      ointArray[i1] = uoa.readUnsignedShort();
                   }
                   try{
                      uoa.close();
                      return ointArray;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 4:
                   long[] olongArray = new long[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      olongArray[i1] = uoa.c();
                   }
                   try{
                      uoa.close();
                      return olongArray;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 5:
                   uodArray = new a$d[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      uodArray[i1] = new a$d(uoa.c(), uoa.c());
                   }
                   try{
                      uoa.close();
                      return uodArray;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 8:
                   ointArray = new int[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      ointArray[i1] = uoa.readShort();
                   }
                   try{
                      uoa.close();
                      return ointArray;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 9:
                   ointArray = new int[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      ointArray[i1] = uoa.readInt();
                   }
                   try{
                      uoa.close();
                      return ointArray;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 10:
                   uodArray = new a$d[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      uodArray[i1] = new a$d((long)uoa.readInt(), (long)uoa.readInt());
                   }
                   try{
                      uoa.close();
                      return uodArray;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 11:
                   uodoubleArra = new double[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      uodoubleArra[i1] = (double)uoa.readFloat();
                   }
                   try{
                      uoa.close();
                      return uodoubleArra;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 case 12:
                   uodoubleArra = new double[this.b];
                   for (; i1 < this.b; i1 = i1 + 1) {
                      uodoubleArra[i1] = uoa.readDouble();
                   }
                   try{
                      uoa.close();
                      return uodoubleArra;
                   }catch(java.io.IOException e0){
                   }
                   break;
                 default:
                   try{
                      uoa.close();
                      return e0;
                   }catch(java.io.IOException e0){
                   }
             }
             a$b tc1 = this.c;
             if (tc1.length == i && (tc1[i1] >= 0 && tc1[i1] <= i)) {
                char[] uocharArray = new char[i];
                uocharArray[i1] = (char)(tc1[i1] + 48);
                try{
                   String str = new String(uocharArray);
                   uoa.close();
                   return str;
                }catch(java.io.IOException e0){
                }
             }else {
                try{
                   Charset y = a.Y;
                   try{
                      String str1 = new String(tc1, y);
                      uoa.close();
                      return str1;
                   }catch(java.io.IOException e0){
                   }
                }catch(java.io.IOException e0){
                label_0150 :
                   if (inputStream) {
                      inputStream.close();
                   }
                   return e0;
                }
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
          inputStream = e0;
          goto label_0150 ;
       }
    }
    public String toString(){
       return "\("+a.D[this.a]+", data length:"+this.c.length+"\)";
    }
}
