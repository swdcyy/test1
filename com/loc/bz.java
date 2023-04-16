package com.loc.bz;
import com.loc.ca;
import java.lang.StringBuffer;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.util.Date;
import java.util.UUID;
import com.loc.x;
import java.lang.Object;
import java.lang.System;

public final class bz extends ca	// class@0013b0
{

    public void bz(){
       super();
    }
    public void bz(ca p0){
       super(p0);
    }
    public final byte[] a(byte[] p0){
       StringBuffer str = new SimpleDateFormat("yyyyMMdd HHmmss").format(new Date())+" "+UUID.randomUUID().toString()+" ";
       if (str.length() != 53) {
          p0 = new byte[0];
          return p0;
       }else {
          byte[] uobyteArray = x.a(str);
          byte[] uobyteArray1 = new byte[(uobyteArray.length + p0.length)];
          System.arraycopy(uobyteArray, 0, uobyteArray1, 0, uobyteArray.length);
          System.arraycopy(p0, 0, uobyteArray1, uobyteArray.length, p0.length);
          return uobyteArray1;
       }
    }
}
