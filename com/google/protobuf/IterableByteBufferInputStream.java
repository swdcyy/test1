package com.google.protobuf.IterableByteBufferInputStream;
import java.io.InputStream;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.Object;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
import com.google.protobuf.UnsafeUtil;
import java.lang.System;
import java.nio.Buffer;

public class IterableByteBufferInputStream extends InputStream	// class@00045a
{
    public long currentAddress;
    public byte[] currentArray;
    public int currentArrayOffset;
    public ByteBuffer currentByteBuffer;
    public int currentByteBufferPos;
    public int currentIndex;
    public int dataSize;
    public boolean hasArray;
    public Iterator iterator;

    public void IterableByteBufferInputStream(Iterable p0){
       super();
       this.iterator = p0.iterator();
       int i = 0;
       this.dataSize = i;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          ByteBuffer uByteBuffer = iterator.next();
          int i1 = this.dataSize + 1;
          this.dataSize = i1;
       }
       this.currentIndex = -1;
       if (!this.getNextByteBuffer()) {
          this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
          this.currentIndex = i;
          this.currentByteBufferPos = i;
          this.currentAddress = 0;
       }
       return;
    }
    public final boolean getNextByteBuffer(){
       this.currentIndex = this.currentIndex + 1;
       boolean b = false;
       if (!this.iterator.hasNext()) {
          return b;
       }
       ByteBuffer uByteBuffer = this.iterator.next();
       this.currentByteBuffer = uByteBuffer;
       this.currentByteBufferPos = uByteBuffer.position();
       if (this.currentByteBuffer.hasArray()) {
          this.hasArray = true;
          this.currentArray = this.currentByteBuffer.array();
          this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
       }else {
          this.hasArray = b;
          this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
          this.currentArray = null;
       }
       return 1;
    }
    public int read(){
       if (this.currentIndex == this.dataSize) {
          return -1;
       }
       if (this.hasArray != null) {
          this.updateCurrentByteBufferPos(1);
          return (this.currentArray[(this.currentByteBufferPos + this.currentArrayOffset)] & 0x00ff);
       }else {
          this.updateCurrentByteBufferPos(1);
          return (UnsafeUtil.getByte(((long)this.currentByteBufferPos + this.currentAddress)) & 0x00ff);
       }
    }
    public int read(byte[] p0,int p1,int p2){
       if (this.currentIndex == this.dataSize) {
          return -1;
       }
       IterableByteBufferInputStream tcurrentByte = this.currentByteBufferPos;
       int i = this.currentByteBuffer.limit() - tcurrentByte;
       if (p2 > i) {
          p2 = i;
       }
       if (this.hasArray != null) {
          System.arraycopy(this.currentArray, (tcurrentByte + this.currentArrayOffset), p0, p1, p2);
          this.updateCurrentByteBufferPos(p2);
       }else {
          this.currentByteBuffer.position(this.currentByteBufferPos);
          this.currentByteBuffer.get(p0, p1, p2);
          this.currentByteBuffer.position(this.currentByteBuffer.position());
          this.updateCurrentByteBufferPos(p2);
       }
       return p2;
    }
    public final void updateCurrentByteBufferPos(int p0){
       int i = this.currentByteBufferPos + p0;
       this.currentByteBufferPos = i;
       if (i == this.currentByteBuffer.limit()) {
          this.getNextByteBuffer();
       }
       return;
    }
}
