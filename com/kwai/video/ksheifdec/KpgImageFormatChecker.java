package com.kwai.video.ksheifdec.KpgImageFormatChecker;
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
import com.kwai.video.ksheifdec.KpgImageFormat;

public class KpgImageFormatChecker implements a$a	// class@000fa0
{

    public void KpgImageFormatChecker(){
       super();
    }
    public static boolean isKpgHeader(byte[] p0,int p1){
       KpgImageFormatChecker kpgImageForm = KpgImageFormatChecker.class;
       if (PatchProxy.isSupport(kpgImageForm)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, kpgImageForm, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       int i = 0;
       if (p1 >= 12 && (KpgImageFormatChecker.matchBytePattern(p0, i, b.a("RIFF")) && KpgImageFormatChecker.matchBytePattern(p0, 8, b.a("KPGB")))) {
          i = true;
       }
    label_003e :
       return i;
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
       KpgImageFormatChecker kpgImageForm = KpgImageFormatChecker.class;
       if (PatchProxy.isSupport(kpgImageForm)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, kpgImageForm, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (KpgImageFormatChecker.isKpgHeader(p0, p1)) {
          return KpgImageFormat.KPG;
       }else {
          return null;
       }
    }
    public int getHeaderSize(){
       return 12;
    }
}
