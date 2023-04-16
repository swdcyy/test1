package com.google.protobuf.nano.MessageNano;
import java.lang.Object;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Class;
import java.util.Arrays;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Throwable;
import com.google.protobuf.nano.MessageNanoPrinter;

public abstract class MessageNano	// class@0005cb
{
    public int cachedSize;

    public void MessageNano(){
       super();
       this.cachedSize = -1;
    }
    public static final MessageNano mergeFrom(MessageNano p0,byte[] p1){
       return MessageNano.mergeFrom(p0, p1, 0, p1.length);
    }
    public static final MessageNano mergeFrom(MessageNano p0,byte[] p1,int p2,int p3){
       try{
          CodedInputByteBufferNano uCodedInputB = CodedInputByteBufferNano.newInstance(p1, p2, p3);
          p0.mergeFrom(uCodedInputB);
          uCodedInputB.checkLastTagWas(0);
          return p0;
       }catch(com.google.protobuf.nano.InvalidProtocolBufferNanoException e0){
          throw e0;
       }catch(java.io.IOException e0){
          throw new RuntimeException("Reading from a byte array threw an IOException \(should never happen\).");
       }
    }
    public static final boolean messageNanoEquals(MessageNano p0,MessageNano p1){
       if (p0 == p1) {
          return true;
       }
       if (p0 == null || p1 == null) {
          return false;
       }
       if (p0.getClass() != p1.getClass()) {
          return false;
       }
       int serializedSi = p0.getSerializedSize();
       if (p1.getSerializedSize() != serializedSi) {
          return false;
       }
       byte[] uobyteArray = new byte[serializedSi];
       byte[] uobyteArray1 = new byte[serializedSi];
       MessageNano.toByteArray(p0, uobyteArray, false, serializedSi);
       MessageNano.toByteArray(p1, uobyteArray1, false, serializedSi);
       return Arrays.equals(uobyteArray, uobyteArray1);
    }
    public static final void toByteArray(MessageNano p0,byte[] p1,int p2,int p3){
       try{
          CodedOutputByteBufferNano uCodedOutput = CodedOutputByteBufferNano.newInstance(p1, p2, p3);
          p0.writeTo(uCodedOutput);
          uCodedOutput.checkNoSpaceLeft();
          return;
       }catch(java.io.IOException e0){
          throw new RuntimeException("Serializing to a byte array threw an IOException \(should never happen\).", e0);
       }
    }
    public static final byte[] toByteArray(MessageNano p0){
       int serializedSi = p0.getSerializedSize();
       byte[] uobyteArray = new byte[serializedSi];
       MessageNano.toByteArray(p0, uobyteArray, 0, serializedSi);
       return uobyteArray;
    }
    public MessageNano clone(){
       return super.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public int computeSerializedSize(){
       return 0;
    }
    public int getCachedSize(){
       if (this.cachedSize < null) {
          this.getSerializedSize();
       }
       return this.cachedSize;
    }
    public int getSerializedSize(){
       int i = this.computeSerializedSize();
       this.cachedSize = i;
       return i;
    }
    public abstract MessageNano mergeFrom(CodedInputByteBufferNano p0);
    public String toString(){
       return MessageNanoPrinter.print(this);
    }
    public void writeTo(CodedOutputByteBufferNano p0){
    }
}
