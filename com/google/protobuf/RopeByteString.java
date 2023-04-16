package com.google.protobuf.RopeByteString;
import com.google.protobuf.ByteString;
import java.lang.Math;
import com.google.protobuf.RopeByteString$1;
import com.google.protobuf.RopeByteString$Balancer;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.ArrayList;
import com.google.protobuf.RopeByteString$PieceIterator;
import com.google.protobuf.ByteString$LeafByteString;
import java.lang.Object;
import java.util.Iterator;
import java.lang.IllegalStateException;
import com.google.protobuf.ByteString$ByteIterator;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.RopeByteString$RopeInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.InvalidObjectException;
import java.lang.String;
import java.nio.charset.Charset;
import com.google.protobuf.ByteOutput;
import java.io.OutputStream;

public final class RopeByteString extends ByteString	// class@0004a5
{
    public final ByteString left;
    public final int leftLength;
    public final ByteString right;
    public final int totalLength;
    public final int treeDepth;
    public static final int[] minLengthByDepth;
    public static final long serialVersionUID;

    static {
       RopeByteString.minLengthByDepth = new int[47]{1,1,2,3,5,8,13,21,'"','7','Y',144,233,377,610,987,1597,2584,4181,6765,0x2ac2,0x452f,0x6ff1,0xb520,0x12511,0x1da31,0x2ff42,0x4d973,0x7d8b5,0xcb228,0x148add,0x213d05,0x35c7e2,0x5704e7,0x8cccc9,0xe3d1b0,0x1709e79,0x2547029,0x3c50ea2,0x6197ecb,0x9de8d6d,0xff80c38,0x19d699a5,0x29cea5dd,0x43a53f82,0x6d73e55f,0x7fffffff};
    }
    public void RopeByteString(ByteString p0,ByteString p1){
       super();
       this.left = p0;
       this.right = p1;
       int i = p0.size();
       this.leftLength = i;
       this.totalLength = i + p1.size();
       this.treeDepth = Math.max(p0.getTreeDepth(), p1.getTreeDepth()) + 1;
    }
    public void RopeByteString(ByteString p0,ByteString p1,RopeByteString$1 p2){
       super(p0, p1);
    }
    public static ByteString concatenate(ByteString p0,ByteString p1){
       if (!p1.size()) {
          return p0;
       }
       if (!p0.size()) {
          return p1;
       }
       int i = p0.size() + p1.size();
       RopeByteString ropeByteStri = 128;
       if (i < ropeByteStri) {
          return RopeByteString.concatenateBytes(p0, p1);
       }
       if (p0 instanceof RopeByteString) {
          RopeByteString ropeByteStri1 = p0;
          if ((ropeByteStri1.right.size() + p1.size()) < ropeByteStri) {
             return new RopeByteString(ropeByteStri1.left, RopeByteString.concatenateBytes(ropeByteStri1.right, p1));
          }else if(ropeByteStri1.left.getTreeDepth() > ropeByteStri1.right.getTreeDepth() && ropeByteStri1.getTreeDepth() > p1.getTreeDepth()){
             return new RopeByteString(ropeByteStri1.left, new RopeByteString(ropeByteStri1.right, p1));
          }
       }
       if (i >= RopeByteString.minLength((Math.max(p0.getTreeDepth(), p1.getTreeDepth()) + 1))) {
          return new RopeByteString(p0, p1);
       }else {
          return new RopeByteString$Balancer(null).balance(p0, p1);
       }
    }
    public static ByteString concatenateBytes(ByteString p0,ByteString p1){
       int i = p0.size();
       int i1 = p1.size();
       byte[] uobyteArray = new byte[(i + i1)];
       p0.copyTo(uobyteArray, 0, 0, i);
       p1.copyTo(uobyteArray, 0, i, i1);
       return ByteString.wrap(uobyteArray);
    }
    public static int minLength(int p0){
       int[] minLengthByD = RopeByteString.minLengthByDepth;
       if (p0 >= minLengthByD.length) {
          return Integer.MAX_VALUE;
       }
       return minLengthByD[p0];
    }
    public static RopeByteString newInstanceForTest(ByteString p0,ByteString p1){
       return new RopeByteString(p0, p1);
    }
    public ByteBuffer asReadOnlyByteBuffer(){
       return ByteBuffer.wrap(this.toByteArray()).asReadOnlyBuffer();
    }
    public List asReadOnlyByteBufferList(){
       ArrayList uArrayList = new ArrayList();
       RopeByteString$PieceIterator pieceIterato = new RopeByteString$PieceIterator(this, null);
       while (pieceIterato.hasNext()) {
          uArrayList.add(pieceIterato.next().asReadOnlyByteBuffer());
       }
       return uArrayList;
    }
    public byte byteAt(int p0){
       ByteString.checkIndex(p0, this.totalLength);
       return this.internalByteAt(p0);
    }
    public void copyTo(ByteBuffer p0){
       this.left.copyTo(p0);
       this.right.copyTo(p0);
    }
    public void copyToInternal(byte[] p0,int p1,int p2,int p3){
       RopeByteString tleftLength = this.leftLength;
       if ((p1 + p3) <= tleftLength) {
          this.left.copyToInternal(p0, p1, p2, p3);
       }else if(p1 >= tleftLength){
          this.right.copyToInternal(p0, (p1 - tleftLength), p2, p3);
       }else {
          int i = tleftLength - p1;
          this.left.copyToInternal(p0, p1, p2, i);
          this.right.copyToInternal(p0, 0, (p2 + i), (p3 - i));
       }
       return;
    }
    public boolean equals(Object p0){
       int b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ByteString) {
          return false;
       }
       if (this.totalLength != p0.size()) {
          return false;
       }
       if (this.totalLength == null) {
          return b;
       }
       b = this.peekCachedHashCode();
       int i = p0.peekCachedHashCode();
       if (b && (i && b != i)) {
          return false;
       }
       return this.equalsFragments(p0);
    }
    public final boolean equalsFragments(ByteString p0){
       boolean b;
       RopeByteString$PieceIterator pieceIterato = new RopeByteString$PieceIterator(this, null);
       ByteString$LeafByteString leafByteStri = pieceIterato.next();
       RopeByteString$PieceIterator pieceIterato1 = new RopeByteString$PieceIterator(p0, null);
       ByteString$LeafByteString leafByteStri1 = pieceIterato1.next();
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          int i3 = leafByteStri.size() - i;
          int i4 = leafByteStri1.size() - i1;
          int i5 = Math.min(i3, i4);
          if (!i) {
             b = leafByteStri.equalsRange(leafByteStri1, i1, i5);
          label_0034 :
             if (!b) {
                break ;
             }else {
                i2 = i2 + i5;
                RopeByteString ttotalLength = this.totalLength;
                if (i2 >= ttotalLength) {
                   if (i2 == ttotalLength) {
                      return true;
                   }else {
                      throw new IllegalStateException();
                   }
                }else if(i5 == i3){
                   leafByteStri = pieceIterato.next();
                   i = 0;
                }else {
                   i = i + i5;
                }
                if (i5 == i4) {
                   leafByteStri1 = pieceIterato1.next();
                   i1 = 0;
                }else {
                   i1 = i1 + i5;
                }
             }
          }else {
             b = leafByteStri1.equalsRange(leafByteStri, i, i5);
             goto label_0034 ;
          }
       }
       return false;
    }
    public int getTreeDepth(){
       return this.treeDepth;
    }
    public byte internalByteAt(int p0){
       RopeByteString tleftLength = this.leftLength;
       if (p0 < tleftLength) {
          return this.left.internalByteAt(p0);
       }
       return this.right.internalByteAt((p0 - tleftLength));
    }
    public boolean isBalanced(){
       boolean b = (this.totalLength >= RopeByteString.minLength(this.treeDepth))? true: false;
       return b;
    }
    public boolean isValidUtf8(){
       int i = 0;
       RopeByteString tright = this.right;
       if (!tright.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i, this.leftLength), i, tright.size())) {
          i = true;
       }
       return i;
    }
    public ByteString$ByteIterator iterator(){
       return new RopeByteString$1(this);
    }
    public Iterator iterator(){
       return this.iterator();
    }
    public CodedInputStream newCodedInput(){
       return CodedInputStream.newInstance(new RopeByteString$RopeInputStream(this));
    }
    public InputStream newInput(){
       return new RopeByteString$RopeInputStream(this);
    }
    public int partialHash(int p0,int p1,int p2){
       RopeByteString tleftLength = this.leftLength;
       if ((p1 + p2) <= tleftLength) {
          return this.left.partialHash(p0, p1, p2);
       }
       if (p1 >= tleftLength) {
          return this.right.partialHash(p0, (p1 - tleftLength), p2);
       }
       int i = tleftLength - p1;
       return this.right.partialHash(this.left.partialHash(p0, p1, i), 0, (p2 - i));
    }
    public int partialIsValidUtf8(int p0,int p1,int p2){
       RopeByteString tleftLength = this.leftLength;
       if ((p1 + p2) <= tleftLength) {
          return this.left.partialIsValidUtf8(p0, p1, p2);
       }
       if (p1 >= tleftLength) {
          return this.right.partialIsValidUtf8(p0, (p1 - tleftLength), p2);
       }
       int i = tleftLength - p1;
       return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(p0, p1, i), 0, (p2 - i));
    }
    public final void readObject(ObjectInputStream p0){
       throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }
    public int size(){
       return this.totalLength;
    }
    public ByteString substring(int p0,int p1){
       int i = ByteString.checkRange(p0, p1, this.totalLength);
       if (!i) {
          return ByteString.EMPTY;
       }
       if (i == this.totalLength) {
          return this;
       }
       RopeByteString tleftLength = this.leftLength;
       if (p1 <= tleftLength) {
          return this.left.substring(p0, p1);
       }
       if (p0 >= tleftLength) {
          return this.right.substring((p0 - tleftLength), (p1 - tleftLength));
       }
       return new RopeByteString(this.left.substring(p0), this.right.substring(0, (p1 - this.leftLength)));
    }
    public String toStringInternal(Charset p0){
       return new String(this.toByteArray(), p0);
    }
    public Object writeReplace(){
       return ByteString.wrap(this.toByteArray());
    }
    public void writeTo(ByteOutput p0){
       this.left.writeTo(p0);
       this.right.writeTo(p0);
    }
    public void writeTo(OutputStream p0){
       this.left.writeTo(p0);
       this.right.writeTo(p0);
    }
    public void writeToInternal(OutputStream p0,int p1,int p2){
       RopeByteString tleftLength = this.leftLength;
       if ((p1 + p2) <= tleftLength) {
          this.left.writeToInternal(p0, p1, p2);
       }else if(p1 >= tleftLength){
          this.right.writeToInternal(p0, (p1 - tleftLength), p2);
       }else {
          int i = tleftLength - p1;
          this.left.writeToInternal(p0, p1, i);
          this.right.writeToInternal(p0, 0, (p2 - i));
       }
       return;
    }
    public void writeToReverse(ByteOutput p0){
       this.right.writeToReverse(p0);
       this.left.writeToReverse(p0);
    }
}
