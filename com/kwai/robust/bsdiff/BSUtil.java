package com.kwai.robust.bsdiff.BSUtil;
import java.lang.Object;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;

public class BSUtil	// class@001416
{
    public static final int BUFFER_SIZE = 8192;
    public static final int HEADER_SIZE = 32;

    public void BSUtil(){
       super();
    }
    public static byte[] inputStreamToByte(InputStream p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = new byte[8192];
       int i = p0.read(uobyteArray, 0, 8192);
       while (i != -1) {
          uByteArrayOu.write(uobyteArray, 0, i);
       }
       return uByteArrayOu.toByteArray();
    }
    public static final boolean readFromStream(InputStream p0,byte[] p1,int p2,int p3){
       int i = 0;
       while (true) {
          if (i >= p3) {
             return true;
          }
          int i1 = p2 + i;
          int i2 = p3 - i;
          i1 = p0.read(p1, i1, i2);
          if (i1 < 0) {
             break ;
          }else {
             i = i + i1;
          }
       }
       return false;
    }
}
