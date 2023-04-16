package cud.a;
import okio.ByteString;
import java.lang.String;
import okio.ByteString$a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import cud.b;

public final class a	// class@000c83
{
    public static final byte[] a;
    public static final byte[] b;

    static {
       ByteString$a companion = ByteString.Companion;
       a.a = companion.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData$jvm();
       a.b = companion.b("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData$jvm();
    }
    public static final String a(byte[] p0,byte[] p1){
       int i4;
       byte b;
       a.q(p0, "$receiver");
       a.q(p1, "map");
       int i = 2;
       byte[] uobyteArray = new byte[(((p0.length + i) / 3) * 4)];
       int i1 = p0.length - (p0.length % 3);
       int i3 = 0;
       for (int i2 = 0; i2 < i1; i2 = i6) {
          i4 = i2 + 1;
          i2 = p0[i2];
          byte i5 = i4 + 1;
          i4 = p0[i4];
          int i6 = i5 + 1;
          i5 = p0[i5];
          int i7 = i3 + 1;
          int i8 = i2 & 0x00ff;
          i8 = i8 >> i;
          uobyteArray[i3] = p1[i8];
          i3 = i7 + 1;
          i2 = i2 & 0x03;
          i2 = i2 << 4;
          i8 = i4 & 0x00ff;
          i8 = i8 >> 4;
          i2 = i2 | i8;
          uobyteArray[i7] = p1[i2];
          i2 = i3 + 1;
          i4 = i4 & 0x0f;
          i4 = i4 << i;
          i7 = i5 & 0x00ff;
          i7 = i7 >> 6;
          i4 = i4 | i7;
          uobyteArray[i3] = p1[i4];
          i3 = i2 + 1;
          i4 = i5 & 0x3f;
          uobyteArray[i2] = p1[i4];
       }
       i4 = p0.length - i1;
       if (i4 != 1) {
          if (i4 == i) {
             i2 = p0[i2];
             b = p0[(i2 + 1)];
             i4 = i3 + 1;
             uobyteArray[i3] = p1[((i2 & 0x00ff) >> i)];
             i3 = i4 + 1;
             uobyteArray[i4] = p1[(((i2 & 0x03) << 4) | ((b & 0x00ff) >> 4))];
             uobyteArray[i3] = p1[((b & 0x0f) << i)];
             uobyteArray[(i3 + 1)] = (byte)61;
          }
       }else {
          b = p0[i2];
          i2 = i3 + 1;
          uobyteArray[i3] = p1[((b & 0x00ff) >> 2)];
          i = i2 + 1;
          uobyteArray[i2] = p1[((b & 0x03) << 4)];
          byte b1 = (byte)61;
          uobyteArray[i] = b1;
          uobyteArray[(i + 1)] = b1;
       }
       return b.b(uobyteArray);
    }
}
