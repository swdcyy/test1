package com.kwai.dva.dex2oat.util.b;
import java.io.Closeable;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.util.HashMap;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import com.kwai.dva.dex2oat.util.b$b;
import java.nio.ByteBuffer;
import java.nio.Buffer;
import java.nio.ByteOrder;
import com.kwai.dva.dex2oat.util.b$c;
import java.lang.String;
import com.kwai.dva.dex2oat.util.b$a;
import com.kwai.dva.dex2oat.util.b$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import java.util.Map;
import java.lang.Integer;
import java.io.IOException;

public class b implements Closeable	// class@000d23
{
    public final FileInputStream b;
    public final Map c;
    public b$b d;
    public b$c[] e;
    public b$d[] f;

    public void b(File p0){
       int i4;
       super();
       this.c = new HashMap();
       FileInputStream uFileInputSt = new FileInputStream(p0);
       this.b = uFileInputSt;
       FileChannel channel = uFileInputSt.getChannel();
       this.d = new b$b(channel);
       ByteBuffer uByteBuffer = ByteBuffer.allocate(128);
       uByteBuffer.limit(this.d.j);
       ByteOrder lITTLE_ENDIA = (this.d.a[5] == 1)? ByteOrder.LITTLE_ENDIAN: ByteOrder.BIG_ENDIAN;
       uByteBuffer.order(lITTLE_ENDIA);
       channel.position(this.d.f);
       b$c[] uocArray = new b$c[this.d.k];
       this.e = uocArray;
       int i = 0;
       int i1 = 0;
       int i2 = 4;
       while (i1 < this.e.length) {
          b.b(channel, uByteBuffer, "failed to read phdr.");
          this.e[i1] = new b$c(uByteBuffer, this.d.a[i2], null);
          i1 = i1 + 1;
       }
       channel.position(this.d.g);
       uByteBuffer.limit(this.d.l);
       b$d[] uodArray = new b$d[this.d.m];
       this.f = uodArray;
       i1 = 0;
       b tf = this.f;
       while (i1 < tf.length) {
          b.b(channel, uByteBuffer, "failed to read shdr.");
          this.f[i1] = new b$d(uByteBuffer, this.d.a[i2], null);
          i1 = i1 + 1;
       }
       b$b n = this.d.n;
       if (n > null) {
          object oobject = tf[n];
          uByteBuffer = PatchProxy.applyOneRefs(oobject, this, b.class, "7");
          if (uByteBuffer != PatchProxyResult.class) {
          }else {
             uByteBuffer = ByteBuffer.allocate((int)oobject.f);
             this.b.getChannel().position(oobject.e);
             b.b(this.b.getChannel(), uByteBuffer, "failed to read section: "+oobject.k);
          }
          b tf1 = this.f;
          i1 = tf1.length;
          for (; i < i1; i = i + 1) {
             object oobject1 = tf1[i];
             uByteBuffer.position(oobject1.a);
             String str = PatchProxy.applyOneRefs(uByteBuffer, null, b.class, "4");
             if (str != PatchProxyResult.class) {
             }else {
                byte[] uobyteArray = uByteBuffer.array();
                int i3 = uByteBuffer.position();
                while (uByteBuffer.hasRemaining() && uobyteArray[uByteBuffer.position()]) {
                   i4 = uByteBuffer.position() + 1;
                   uByteBuffer.position(i4);
                }
                i4 = uByteBuffer.position() + 1;
                uByteBuffer.position(i4);
                int i5 = uByteBuffer.position() - i3;
                i5 = i5 - 1;
                str = new String(uobyteArray, i3, i5, Charset.forName("ASCII"));
             }
             oobject1.k = str;
             this.c.put(str, oobject1);
          }
       }
       return;
    }
    public static void a(int p0,int p1,int p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), p3, null, b.class, "1")) {
          return;
       }
       if (p0 >= p1 && p0 <= p2) {
          return;
       }
       throw new IOException(p3);
    }
    public static void b(FileChannel p0,ByteBuffer p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, b.class, "3")) {
          return;
       }
       p1.rewind();
       int i = p0.read(p1);
       if (i != p1.limit()) {
          throw new IOException(p2+" Rest bytes insufficient, expect to read "+p1.limit()+" bytes but only "+i+" bytes were read.");
       }
       p1.flip();
       return;
    }
    public void close(){
       if (PatchProxy.applyVoid(null, this, b.class, "9")) {
          return;
       }
       this.b.close();
       this.c.clear();
       this.e = null;
       this.f = null;
       return;
    }
}
