package com.google.protobuf.CodedOutputStream$AbstractBufferedEncoder;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.CodedOutputStream$1;
import java.lang.Math;
import java.lang.IllegalArgumentException;
import java.lang.String;
import com.google.protobuf.WireFormat;
import com.google.protobuf.UnsafeUtil;
import java.lang.UnsupportedOperationException;

public abstract class CodedOutputStream$AbstractBufferedEncoder extends CodedOutputStream	// class@0003e6
{
    public final byte[] buffer;
    public final int limit;
    public int position;
    public int totalBytesWritten;

    public void CodedOutputStream$AbstractBufferedEncoder(int p0){
       super(null);
       if (p0 < 0) {
          throw new IllegalArgumentException("bufferSize must be >= 0");
       }
       byte[] uobyteArray = new byte[Math.max(p0, 20)];
       this.buffer = uobyteArray;
       this.limit = uobyteArray.length;
       return;
    }
    public final void buffer(byte p0){
       CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
       this.position = tposition + 1;
       this.buffer[tposition] = p0;
       this.totalBytesWritten = this.totalBytesWritten + 1;
    }
    public final void bufferFixed32NoTag(int p0){
       CodedOutputStream$AbstractBufferedEncoder tbuffer = this.buffer;
       CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
       int i = tposition + 1;
       this.position = i;
       tbuffer[tposition] = (byte)(p0 & 0x00ff);
       int i1 = i + 1;
       this.position = i1;
       tbuffer[i] = (byte)((p0 >> 8) & 0x00ff);
       i = i1 + 1;
       this.position = i;
       tbuffer[i1] = (byte)((p0 >> 16) & 0x00ff);
       this.position = i + 1;
       tbuffer[i] = (byte)((p0 >> 24) & 0x00ff);
       this.totalBytesWritten = this.totalBytesWritten + 4;
    }
    public final void bufferFixed64NoTag(long p0){
       CodedOutputStream$AbstractBufferedEncoder tbuffer = this.buffer;
       CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
       int i = tposition + 1;
       this.position = i;
       tbuffer[tposition] = (byte)(int)(p0 & 255);
       int i1 = i + 1;
       this.position = i1;
       tbuffer[i] = (byte)(int)((p0 >> 8) & 255);
       i = i1 + 1;
       this.position = i;
       tbuffer[i1] = (byte)(int)((p0 >> 16) & 255);
       i1 = i + 1;
       this.position = i1;
       tbuffer[i] = (byte)(int)(255 & (p0 >> 24));
       i = i1 + 1;
       this.position = i;
       tbuffer[i1] = (byte)((int)(p0 >> 32) & 0x00ff);
       i1 = i + 1;
       this.position = i1;
       tbuffer[i] = (byte)((int)(p0 >> 40) & 0x00ff);
       i = i1 + 1;
       this.position = i;
       tbuffer[i1] = (byte)((int)(p0 >> 48) & 0x00ff);
       this.position = i + 1;
       tbuffer[i] = (byte)((int)(p0 >> 56) & 0x00ff);
       this.totalBytesWritten = this.totalBytesWritten + 8;
    }
    public final void bufferInt32NoTag(int p0){
       if (p0 >= 0) {
          this.bufferUInt32NoTag(p0);
       }else {
          this.bufferUInt64NoTag((long)p0);
       }
       return;
    }
    public final void bufferTag(int p0,int p1){
       this.bufferUInt32NoTag(WireFormat.makeTag(p0, p1));
    }
    public final void bufferUInt32NoTag(int p0){
       int i;
       CodedOutputStream$AbstractBufferedEncoder tposition;
       CodedOutputStream$AbstractBufferedEncoder tposition1;
       if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
          long l = (long)this.position;
          i = p0 & 0x80;
          while (i) {
             tposition = this.position;
             int i1 = tposition + 1;
             this.position = i1;
             int i2 = p0 & 0x7f;
             i2 = i2 | 0x0080;
             UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)i2);
             p0 = p0 >> 7;
          }
          tposition = this.position;
          this.position = tposition + 1;
          UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)p0);
          this.totalBytesWritten = this.totalBytesWritten + (int)((long)this.position - l);
          return;
       }else {
          int i3 = p0 & 0x80;
          while (i3) {
             tposition1 = this.position;
             i = tposition1 + 1;
             this.position = i;
             i = p0 & 0x7f;
             i = i | 0x0080;
             this.buffer[tposition1] = (byte)i;
             i3 = this.totalBytesWritten + 1;
             this.totalBytesWritten = i3;
             p0 = p0 >> 7;
          }
          tposition1 = this.position;
          this.position = tposition1 + 1;
          this.buffer[tposition1] = (byte)p0;
          this.totalBytesWritten = this.totalBytesWritten + 1;
          return;
       }
    }
    public final void bufferUInt64NoTag(long p0){
       long l;
       CodedOutputStream$AbstractBufferedEncoder uAbstractBuf = 7;
       int i = 0;
       if (CodedOutputStream.HAS_UNSAFE_ARRAY_OPERATIONS) {
          l = (long)this.position;
          long l1 = p0 & -128;
          while (l1 - i) {
             CodedOutputStream$AbstractBufferedEncoder tposition = this.position;
             int i1 = tposition + 1;
             this.position = i1;
             int i2 = (int)p0 & 0x7f;
             i2 = i2 | 0x0080;
             UnsafeUtil.putByte(this.buffer, (long)tposition, (byte)i2);
             p0 = p0 >> uAbstractBuf;
          }
          uAbstractBuf = this.position;
          this.position = uAbstractBuf + 1;
          UnsafeUtil.putByte(this.buffer, (long)uAbstractBuf, (byte)(int)p0);
          this.totalBytesWritten = this.totalBytesWritten + (int)((long)this.position - l);
          return;
       }else {
          l = p0 & -128;
          while (l - i) {
             CodedOutputStream$AbstractBufferedEncoder tposition1 = this.position;
             int i3 = tposition1 + 1;
             this.position = i3;
             i3 = (int)p0 & 0x7f;
             i3 = i3 | 0x0080;
             this.buffer[tposition1] = (byte)i3;
             int i4 = this.totalBytesWritten + 1;
             this.totalBytesWritten = i4;
             p0 = p0 >> uAbstractBuf;
          }
          uAbstractBuf = this.position;
          this.position = uAbstractBuf + 1;
          this.buffer[uAbstractBuf] = (byte)(int)p0;
          this.totalBytesWritten = this.totalBytesWritten + 1;
          return;
       }
    }
    public final int getTotalBytesWritten(){
       return this.totalBytesWritten;
    }
    public final int spaceLeft(){
       throw new UnsupportedOperationException("spaceLeft\(\) can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
