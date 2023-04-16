package qe.h;
import java.nio.charset.Charset;
import java.lang.Object;
import java.nio.charset.CharsetDecoder;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import cb.a;

public class h	// class@0029cc
{
    public final CharsetDecoder a;
    public byte[] b;

    public void h(Charset p0){
       super();
       this.b = null;
       this.a = p0.newDecoder();
    }
    public String a(byte[] p0,int p1){
       ByteBuffer obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       oh = this.b;
       if (oh != null) {
          byte[] uobyteArray = new byte[(oh.length + p1)];
          System.arraycopy(oh, 0, uobyteArray, 0, oh.length);
          System.arraycopy(p0, 0, uobyteArray, this.b.length, p1);
          p1 = p1 + this.b.length;
          p0 = uobyteArray;
       }
       obj = ByteBuffer.wrap(p0, 0, p1);
       int i = 1;
       CharBuffer uCharBuffer = null;
       int i1 = 0;
       int i2 = 0;
       while (!i1 && i2 < 4) {
          try{
             uCharBuffer = this.a.decode(obj);
             i1 = 1;
          }catch(java.nio.charset.CharacterCodingException e0){
             i2 = i2 + 1;
             int i3 = p1 - i2;
             obj = ByteBuffer.wrap(p0, 0, i3);
             goto label_003a ;
          }
       }
       if (!i1 || i2 <= 0) {
          i = 0;
       }
       if (i) {
          byte[] uobyteArray1 = new byte[i2];
          this.b = uobyteArray1;
          System.arraycopy(p0, (p1 - i2), uobyteArray1, 0, i2);
       }else {
          this.b = null;
       }
       if (!i1) {
          a.x("ReactNative", "failed to decode string from byte array");
          return "";
       }else {
          return new String(uCharBuffer.array(), 0, uCharBuffer.length());
       }
    }
}
