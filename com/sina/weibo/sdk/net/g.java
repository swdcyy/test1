package com.sina.weibo.sdk.net.g;
import com.sina.weibo.sdk.net.f;
import java.io.InputStream;
import java.lang.Object;
import java.lang.String;
import java.io.ByteArrayOutputStream;

public final class g implements f	// class@000bc6
{
    public int code;
    public InputStream p;

    public void g(int p0,InputStream p1){
       super();
       this.code = p0;
       this.p = p1;
    }
    public final String f(){
       try{
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          byte[] uobyteArray = new byte[1024];
          int i = this.p.read(uobyteArray);
          while (i != -1) {
             uByteArrayOu.write(uobyteArray, 0, i);
          }
          uByteArrayOu.close();
          return uByteArrayOu.toString();
       }catch(java.io.IOException e0){
          throw e0;
       }
    }
}
