package com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.MessageLite;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Collection;
import java.util.List;
import com.google.protobuf.AbstractMessageLite$Builder;
import com.google.protobuf.ByteString;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import com.google.protobuf.Schema;
import java.lang.StringBuilder;
import java.lang.Class;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.CodedOutputStream;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.google.protobuf.ByteString$CodedBuilder;
import java.io.OutputStream;

public abstract class AbstractMessageLite implements MessageLite	// class@0003a4
{
    public int memoizedHashCode;

    public void AbstractMessageLite(){
       super();
       this.memoizedHashCode = 0;
    }
    public static void addAll(Iterable p0,Collection p1){
       AbstractMessageLite$Builder.addAll(p0, p1);
    }
    public static void addAll(Iterable p0,List p1){
       AbstractMessageLite$Builder.addAll(p0, p1);
    }
    public static void checkByteStringIsUtf8(ByteString p0){
       if (p0.isValidUtf8()) {
          return;
       }
       throw new IllegalArgumentException("Byte string is not UTF-8.");
    }
    public int getMemoizedSerializedSize(){
       throw new UnsupportedOperationException();
    }
    public int getSerializedSize(Schema p0){
       int memoizedSeri = this.getMemoizedSerializedSize();
       if (memoizedSeri == -1) {
          memoizedSeri = p0.getSerializedSize(this);
          this.setMemoizedSerializedSize(memoizedSeri);
       }
       return memoizedSeri;
    }
    public final String getSerializingExceptionMessage(String p0){
       return "Serializing "+this.getClass().getName()+" to a "+p0+" threw an IOException \(should never happen\).";
    }
    public UninitializedMessageException newUninitializedMessageException(){
       return new UninitializedMessageException(this);
    }
    public void setMemoizedSerializedSize(int p0){
       throw new UnsupportedOperationException();
    }
    public byte[] toByteArray(){
       try{
          byte[] uobyteArray = new byte[this.getSerializedSize()];
          CodedOutputStream uCodedOutput = CodedOutputStream.newInstance(uobyteArray);
          this.writeTo(uCodedOutput);
          uCodedOutput.checkNoSpaceLeft();
          return uobyteArray;
       }catch(java.io.IOException e0){
          throw new RuntimeException(this.getSerializingExceptionMessage("byte array"), e0);
       }
    }
    public ByteString toByteString(){
       try{
          ByteString$CodedBuilder uCodedBuilde = ByteString.newCodedBuilder(this.getSerializedSize());
          this.writeTo(uCodedBuilde.getCodedOutput());
          return uCodedBuilde.build();
       }catch(java.io.IOException e0){
          throw new RuntimeException(this.getSerializingExceptionMessage("ByteString"), e0);
       }
    }
    public void writeDelimitedTo(OutputStream p0){
       int serializedSi = this.getSerializedSize();
       CodedOutputStream uCodedOutput = CodedOutputStream.newInstance(p0, CodedOutputStream.computePreferredBufferSize((CodedOutputStream.computeRawVarint32Size(serializedSi) + serializedSi)));
       uCodedOutput.writeRawVarint32(serializedSi);
       this.writeTo(uCodedOutput);
       uCodedOutput.flush();
    }
    public void writeTo(OutputStream p0){
       CodedOutputStream uCodedOutput = CodedOutputStream.newInstance(p0, CodedOutputStream.computePreferredBufferSize(this.getSerializedSize()));
       this.writeTo(uCodedOutput);
       uCodedOutput.flush();
    }
}
