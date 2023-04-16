package com.kwai.video.ksheifdec.HeifImageFormatChecker;
import com.facebook.imageformat.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import nc.b;
import com.facebook.imageformat.a;
import com.kwai.video.ksheifdec.HeifImageFormat;

public class HeifImageFormatChecker implements a$a	// class@0008da
{

    public void HeifImageFormatChecker(){
       super();
    }
    public static boolean isHeifHeader(byte[] p0,int p1){
       HeifImageFormatChecker heifImageFor = HeifImageFormatChecker.class;
       if (PatchProxy.isSupport(heifImageFor)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, heifImageFor, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (p1 >= 12 && (HeifImageFormatChecker.matchBytePattern(p0, 4, b.a("ftyp")) && (!HeifImageFormatChecker.matchBytePattern(p0, 8, b.a("heic")) && (!HeifImageFormatChecker.matchBytePattern(p0, 8, b.a("heif")) && (HeifImageFormatChecker.matchBytePattern(p0, 8, b.a("msf1")) || HeifImageFormatChecker.matchBytePattern(p0, 8, b.a("mif1")))))))? true: false;
       return b;
    }
    public static boolean matchBytePattern(byte[] p0,int p1,byte[] p2){
       if (p2 == null || p0 == null) {
          return false;
       }
       if ((p2.length + p1) > p0.length) {
          return false;
       }
       int i = 0;
       while (true) {
          if (i >= p2.length) {
             return true;
          }
          int i1 = i + p1;
          if (p0[i1] != p2[i]) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return false;
    }
    public a determineFormat(byte[] p0,int p1){
       HeifImageFormatChecker heifImageFor = HeifImageFormatChecker.class;
       if (PatchProxy.isSupport(heifImageFor)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, heifImageFor, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (HeifImageFormatChecker.isHeifHeader(p0, p1)) {
          return HeifImageFormat.HEIF;
       }else {
          return null;
       }
    }
    public int getHeaderSize(){
       return 12;
    }
}
