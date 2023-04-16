package com.kwai.plugin.dva.feature.core.loader.classloader.multidex.c;
import java.lang.Object;
import java.io.RandomAccessFile;
import com.kwai.plugin.dva.feature.core.loader.classloader.multidex.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.zip.CRC32;
import java.lang.Math;
import java.lang.Integer;
import java.util.zip.ZipException;
import java.lang.StringBuilder;

public final class c	// class@00131c
{

    public void c(){
       super();
    }
    public static long a(RandomAccessFile p0,c$a p1){
       CRC32 obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = new CRC32();
       c$a b = p1.b;
       p0.seek(p1.a);
       byte[] uobyteArray = new byte[0x4000];
       for (int i = p0.read(uobyteArray, 0, (int)Math.min(0x4000, b)); i != -1; i = p0.read(uobyteArray, 0, (int)Math.min(0x4000, l))) {
          obj.update(uobyteArray, 0, i);
          long l = b - (long)i;
          if (!l) {
             break ;
          }else {
          }
       }
       return obj.getValue();
    }
    public static c$a b(RandomAccessFile p0){
       c$a obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       long l = p0.length() - 22;
       String str = null;
       if (l - str < 0) {
          throw new ZipException("File too short to be a zip file: "+p0.length());
       }
       long l1 = l - 0x10000;
       if (l1 - str >= 0) {
          str = l1;
       }
       int i = Integer.reverseBytes(0x6054b50);
       while (true) {
          p0.seek(l);
          if (p0.readInt() == i) {
             p0.skipBytes(2);
             p0.skipBytes(2);
             p0.skipBytes(2);
             p0.skipBytes(2);
             obj = new c$a();
             obj.b = (long)Integer.reverseBytes(p0.readInt()) & 0xffffffff;
             obj.a = (long)Integer.reverseBytes(p0.readInt()) & 0xffffffff;
             return obj;
          }else {
             l = l - 1;
             if (l - str >= 0) {
             }else {
                break ;
             }
          }
       }
       throw new ZipException("End Of Central Directory signature not found");
    }
}
