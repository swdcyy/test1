package com.google.common.primitives.Longs$a;
import java.util.Arrays;

public final class Longs$a	// class@0018ef
{
    public static final byte[] a;

    static {
       byte i2;
       byte[] uobyteArray = new byte[128];
       Arrays.fill(uobyteArray, -1);
       int i = 0;
       for (int i1 = 0; i1 <= 9; i1 = i1 + 1) {
          i2 = i1 + 48;
          uobyteArray[i2] = (byte)i1;
       }
       for (; i <= 26; i = i + 1) {
          i1 = i + 65;
          i2 = i + 10;
          i2 = (byte)i2;
          uobyteArray[i1] = i2;
          i1 = i + 97;
          uobyteArray[i1] = i2;
       }
       Longs$a.a = uobyteArray;
    }
    public static int a(char p0){
       byte b = (p0 < 128)? Longs$a.a[p0]: -1;
       return b;
    }
}
