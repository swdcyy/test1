package com.tkruntime.v8.V8MemBufferFromJS$BufferAbbrev;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Double;

public class V8MemBufferFromJS$BufferAbbrev	// class@000fbe
{
    public boolean bigEndian;
    public int bufferLen;
    public int byteIndex;
    public byte[] bytes;
    public int doubleLen;
    public int intLen;
    public int longLen;

    public void V8MemBufferFromJS$BufferAbbrev(){
       super();
       this.bytes = null;
       this.bufferLen = 0;
       this.byteIndex = 0;
       this.bigEndian = false;
       this.intLen = 0;
       this.longLen = 0;
       this.doubleLen = 0;
    }
    public void clear(){
       this.bufferLen = 0;
       this.byteIndex = 0;
    }
    public byte readByte(){
       V8MemBufferFromJS$BufferAbbrev tbyteIndex = this.byteIndex;
       this.byteIndex = tbyteIndex + 1;
       return this.bytes[tbyteIndex];
    }
    public double readDouble(){
       Object obj = PatchProxy.apply(null, this, V8MemBufferFromJS$BufferAbbrev.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return Double.longBitsToDouble(this.readLong());
    }
    public int readInt(){
       V8MemBufferFromJS$BufferAbbrev tbytes;
       V8MemBufferFromJS$BufferAbbrev tbyteIndex;
       int i;
       int i1;
       int i2;
       int i3;
       if (this.bigEndian == null) {
          tbytes = this.bytes;
          tbyteIndex = this.byteIndex;
          i = tbyteIndex + 1;
          this.byteIndex = i;
          i1 = i + 1;
          this.byteIndex = i1;
          i = i1 + 1;
          this.byteIndex = i;
          i2 = (((tbytes[tbyteIndex] & 0x00ff) << 0) | ((tbytes[i] & 0x00ff) << 8)) | ((tbytes[i1] & 0x00ff) << 16);
          this.byteIndex = i + 1;
          i3 = (tbytes[i] & 0x00ff) << 24;
       }else {
          tbytes = this.bytes;
          tbyteIndex = this.byteIndex;
          i = tbyteIndex + 1;
          this.byteIndex = i;
          i1 = i + 1;
          this.byteIndex = i1;
          i = i1 + 1;
          this.byteIndex = i;
          i2 = (((tbytes[tbyteIndex] & 0x00ff) << 24) | ((tbytes[i] & 0x00ff) << 16)) | ((tbytes[i1] & 0x00ff) << 8);
          this.byteIndex = i + 1;
          i3 = (tbytes[i] & 0x00ff) << 0;
       }
       return (i3 | i2);
    }
    public long readLong(){
       V8MemBufferFromJS$BufferAbbrev tbytes;
       V8MemBufferFromJS$BufferAbbrev tbyteIndex;
       int i;
       int i1;
       int i2;
       long l = 32;
       if (this.bigEndian == null) {
          tbytes = this.bytes;
          tbyteIndex = this.byteIndex;
          i = tbyteIndex + 1;
          this.byteIndex = i;
          i1 = i + 1;
          this.byteIndex = i1;
          i = i1 + 1;
          this.byteIndex = i;
          i1 = i + 1;
          this.byteIndex = i1;
          i = i1 + 1;
          this.byteIndex = i;
          i2 = i + 1;
          this.byteIndex = i2;
          i1 = i2 + 1;
          this.byteIndex = i1;
          this.byteIndex = i1 + 1;
          return (((long)(((((tbytes[tbyteIndex] & 0x00ff) << 0) | ((tbytes[i] & 0x00ff) << 8)) | ((tbytes[i1] & 0x00ff) << 16)) | ((tbytes[i] & 0x00ff) << 24)) & 0xffffffff) | ((long)(((tbytes[i1] & 0x00ff) << 24) | ((((tbytes[i] & 0x00ff) << 8) | ((tbytes[i1] & 0x00ff) << 0)) | ((tbytes[i2] & 0x00ff) << 16))) << l));
       }else {
          tbytes = this.bytes;
          tbyteIndex = this.byteIndex;
          i = tbyteIndex + 1;
          this.byteIndex = i;
          i1 = i + 1;
          this.byteIndex = i1;
          i = i1 + 1;
          this.byteIndex = i;
          i1 = i + 1;
          this.byteIndex = i1;
          i = i1 + 1;
          this.byteIndex = i;
          i2 = i + 1;
          this.byteIndex = i2;
          i1 = i2 + 1;
          this.byteIndex = i1;
          this.byteIndex = i1 + 1;
          return (((long)(((tbytes[i1] & 0x00ff) << 0) | ((((tbytes[i] & 0x00ff) << 16) | ((tbytes[i1] & 0x00ff) << 24)) | ((tbytes[i2] & 0x00ff) << 8))) & 0xffffffff) | ((long)(((((tbytes[tbyteIndex] & 0x00ff) << 24) | ((tbytes[i] & 0x00ff) << 16)) | ((tbytes[i1] & 0x00ff) << 8)) | ((tbytes[i] & 0x00ff) << 0)) << l));
       }
    }
    public short readShort(){
       V8MemBufferFromJS$BufferAbbrev tbytes;
       V8MemBufferFromJS$BufferAbbrev tbyteIndex;
       int i;
       int i1;
       int i2;
       if (this.bigEndian == null) {
          tbytes = this.bytes;
          tbyteIndex = this.byteIndex;
          i = tbyteIndex + 1;
          this.byteIndex = i;
          i1 = (tbytes[tbyteIndex] & 0x00ff) << 0;
          this.byteIndex = i + 1;
          i2 = (tbytes[i] & 0x00ff) << 8;
       }else {
          tbytes = this.bytes;
          tbyteIndex = this.byteIndex;
          i = tbyteIndex + 1;
          this.byteIndex = i;
          i1 = (tbytes[tbyteIndex] & 0x00ff) << 8;
          this.byteIndex = i + 1;
          i2 = (tbytes[i] & 0x00ff) << 0;
       }
       return (short)(i2 | i1);
    }
    public void skip(int p0){
       this.byteIndex = this.byteIndex + p0;
    }
}
