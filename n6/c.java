package n6.c;
import javax.crypto.Cipher;
import java.lang.String;
import java.security.SecureRandom;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Object;
import java.lang.System;

public class c	// class@0026c7
{

    public static byte[] a(Cipher p0,String p1){
       SecureRandom secureRandom = new SecureRandom();
       int blockSize = p0.getBlockSize();
       if (TextUtils.isEmpty(p1)) {
          p1 = String.valueOf(secureRandom.nextDouble());
       }
       int i = blockSize * 2;
       byte[] uobyteArray = new byte[i];
       byte[] uobyteArray1 = new byte[blockSize];
       secureRandom.nextBytes(uobyteArray1);
       int i1 = 1;
       int i2 = 0;
       while (i1 < i) {
          int i3 = i1 % p1.length();
          i3 = p1.codePointAt(i3) & 0x7f;
          uobyteArray[i1] = (byte)i3;
          if (i1 >= blockSize) {
             i2 = uobyteArray[i2] & uobyteArray[i1];
             uobyteArray[i1] = (byte)i2;
          }
          i1 = i1 + 1;
       }
       System.arraycopy(uobyteArray, blockSize, uobyteArray1, i2, blockSize);
       return uobyteArray1;
    }
}
