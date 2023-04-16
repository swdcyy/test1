package com.kwai.dva.dex2oat.util.b$b;
import java.nio.channels.FileChannel;
import java.lang.Object;
import java.nio.ByteBuffer;
import java.lang.StringBuilder;
import java.lang.String;
import com.kwai.dva.dex2oat.util.b;
import java.nio.ByteOrder;
import java.io.IOException;
import java.lang.Byte;

public class b$b	// class@000d20
{
    public final byte[] a;
    public final short b;
    public final short c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final short i;
    public final short j;
    public final short k;
    public final short l;
    public final short m;
    public final short n;

    public void b$b(FileChannel p0){
       super();
       byte[] uobyteArray = new byte[16];
       this.a = uobyteArray;
       p0.position(0);
       p0.read(ByteBuffer.wrap(uobyteArray));
       int i = 0;
       int i1 = 3;
       int i2 = 4;
       if (uobyteArray[i] == 127 && (uobyteArray[1] == 69 && (uobyteArray[2] == 76 && uobyteArray[i1] == 70))) {
          b.a(uobyteArray[i2], 1, 2, "bad elf class: "+uobyteArray[i2]);
          i = 5;
          b.a(uobyteArray[i], 1, 2, "bad elf data encoding: "+uobyteArray[i]);
          int i3 = (uobyteArray[i2] == 1)? 36: 48;
          ByteBuffer uByteBuffer = ByteBuffer.allocate(i3);
          ByteOrder lITTLE_ENDIA = (uobyteArray[i] == 1)? ByteOrder.LITTLE_ENDIAN: ByteOrder.BIG_ENDIAN;
          uByteBuffer.order(lITTLE_ENDIA);
          b.b(p0, uByteBuffer, "failed to read rest part of ehdr.");
          this.b = uByteBuffer.getShort();
          this.c = uByteBuffer.getShort();
          byte intx = uByteBuffer.getInt();
          this.d = intx;
          b.a(intx, 1, 1, "bad elf version: "+intx);
          intx = uobyteArray[i2];
          if (intx != 1) {
             if (intx == 2) {
                this.e = uByteBuffer.getLong();
                this.f = uByteBuffer.getLong();
                this.g = uByteBuffer.getLong();
             }else {
                throw new IOException("Unexpected elf class: "+uobyteArray[i2]);
             }
          }else {
             this.e = (long)uByteBuffer.getInt();
             this.f = (long)uByteBuffer.getInt();
             this.g = (long)uByteBuffer.getInt();
          }
          this.h = uByteBuffer.getInt();
          this.i = uByteBuffer.getShort();
          this.j = uByteBuffer.getShort();
          this.k = uByteBuffer.getShort();
          this.l = uByteBuffer.getShort();
          this.m = uByteBuffer.getShort();
          this.n = uByteBuffer.getShort();
          return;
       }else {
          Object[] objArray = new Object[i2];
          objArray[i] = Byte.valueOf(uobyteArray[i]);
          objArray[1] = Byte.valueOf(uobyteArray[1]);
          objArray[2] = Byte.valueOf(uobyteArray[2]);
          objArray[i1] = Byte.valueOf(uobyteArray[i1]);
          throw new IOException(String.format("bad elf magic: %x %x %x %x.", objArray));
       }
    }
}
