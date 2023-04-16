package com.google.protobuf.AbstractMessageLite$Builder;
import com.google.protobuf.MessageLite$Builder;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Collection;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.LazyStringList;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.NullPointerException;
import com.google.protobuf.ByteString;
import com.google.protobuf.PrimitiveNonBoxingCollection;
import java.util.ArrayList;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UninitializedMessageException;
import java.lang.Class;
import com.google.protobuf.AbstractMessageLite;
import java.io.InputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.AbstractMessageLite$Builder$LimitedInputStream;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.google.protobuf.MessageLiteOrBuilder;
import java.lang.IllegalArgumentException;

public abstract class AbstractMessageLite$Builder implements MessageLite$Builder	// class@0003a2
{

    public void AbstractMessageLite$Builder(){
       super();
    }
    public static void addAll(Iterable p0,Collection p1){
       AbstractMessageLite$Builder.addAll(p0, p1);
    }
    public static void addAll(Iterable p0,List p1){
       Internal.checkNotNull(p0);
       if (p0 instanceof LazyStringList) {
          List list = p1;
          int i = p1.size();
          Iterator iterator = p0.getUnderlyingElements().iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj == null) {
                String str = "Element at index "+(list.size() - i)+" is null.";
                int i1 = list.size() - 1;
             label_0045 :
                if (i1 >= i) {
                   list.remove(i1);
                   i1 = i1 - 1;
                   goto label_0045 ;
                }else {
                   throw new NullPointerException(str);
                }
             }else if(obj instanceof ByteString){
                list.add(obj);
             }else {
                list.add(obj);
             }
          }
       }else if(p0 instanceof PrimitiveNonBoxingCollection){
          p1.addAll(p0);
       }else {
          AbstractMessageLite$Builder.addAllCheckingNulls(p0, p1);
       }
       return;
    }
    public static void addAllCheckingNulls(Iterable p0,List p1){
       if (p1 instanceof ArrayList && p0 instanceof Collection) {
          p1.ensureCapacity((p1.size() + p0.size()));
       }
       int i = p1.size();
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return;
          }
          Object obj = iterator.next();
          if (obj == null) {
             String str = "Element at index "+(p1.size() - i)+" is null.";
             for (int i1 = p1.size() - 1; i1 >= i; i1 = i1 - 1) {
                p1.remove(i1);
             }
             throw new NullPointerException(str);
          }else {
             p1.add(obj);
          }
       }
    }
    public static UninitializedMessageException newUninitializedMessageException(MessageLite p0){
       return new UninitializedMessageException(p0);
    }
    public abstract AbstractMessageLite$Builder clone();
    public MessageLite$Builder clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public final String getReadingExceptionMessage(String p0){
       return "Reading "+this.getClass().getName()+" from a "+p0+" threw an IOException \(should never happen\).";
    }
    public abstract AbstractMessageLite$Builder internalMergeFrom(AbstractMessageLite p0);
    public boolean mergeDelimitedFrom(InputStream p0){
       return this.mergeDelimitedFrom(p0, ExtensionRegistryLite.getEmptyRegistry());
    }
    public boolean mergeDelimitedFrom(InputStream p0,ExtensionRegistryLite p1){
       int i = p0.read();
       if (i == -1) {
          return false;
       }
       this.mergeFrom(new AbstractMessageLite$Builder$LimitedInputStream(p0, CodedInputStream.readRawVarint32(i, p0)), p1);
       return true;
    }
    public AbstractMessageLite$Builder mergeFrom(ByteString p0){
       try{
          CodedInputStream uCodedInputS = p0.newCodedInput();
          this.mergeFrom(uCodedInputS);
          uCodedInputS.checkLastTagWas(0);
          return this;
       }catch(com.google.protobuf.InvalidProtocolBufferException e3){
          throw e3;
       }catch(java.io.IOException e3){
          throw new RuntimeException(this.getReadingExceptionMessage("ByteString"), e3);
       }
    }
    public AbstractMessageLite$Builder mergeFrom(ByteString p0,ExtensionRegistryLite p1){
       try{
          CodedInputStream uCodedInputS = p0.newCodedInput();
          this.mergeFrom(uCodedInputS, p1);
          uCodedInputS.checkLastTagWas(0);
          return this;
       }catch(com.google.protobuf.InvalidProtocolBufferException e2){
          throw e2;
       }catch(java.io.IOException e2){
          throw new RuntimeException(this.getReadingExceptionMessage("ByteString"), e2);
       }
    }
    public AbstractMessageLite$Builder mergeFrom(CodedInputStream p0){
       return this.mergeFrom(p0, ExtensionRegistryLite.getEmptyRegistry());
    }
    public abstract AbstractMessageLite$Builder mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1);
    public AbstractMessageLite$Builder mergeFrom(MessageLite p0){
       if (this.getDefaultInstanceForType().getClass().isInstance(p0)) {
          return this.internalMergeFrom(p0);
       }
       throw new IllegalArgumentException("mergeFrom\(MessageLite\) can only merge messages of the same type.");
    }
    public AbstractMessageLite$Builder mergeFrom(InputStream p0){
       CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0);
       this.mergeFrom(uCodedInputS);
       uCodedInputS.checkLastTagWas(0);
       return this;
    }
    public AbstractMessageLite$Builder mergeFrom(InputStream p0,ExtensionRegistryLite p1){
       CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0);
       this.mergeFrom(uCodedInputS, p1);
       uCodedInputS.checkLastTagWas(0);
       return this;
    }
    public AbstractMessageLite$Builder mergeFrom(byte[] p0){
       return this.mergeFrom(p0, 0, p0.length);
    }
    public AbstractMessageLite$Builder mergeFrom(byte[] p0,int p1,int p2){
       try{
          CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0, p1, p2);
          this.mergeFrom(uCodedInputS);
          uCodedInputS.checkLastTagWas(0);
          return this;
       }catch(com.google.protobuf.InvalidProtocolBufferException e1){
          throw e1;
       }catch(java.io.IOException e1){
          throw new RuntimeException(this.getReadingExceptionMessage("byte array"), e1);
       }
    }
    public AbstractMessageLite$Builder mergeFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       try{
          CodedInputStream uCodedInputS = CodedInputStream.newInstance(p0, p1, p2);
          this.mergeFrom(uCodedInputS, p3);
          uCodedInputS.checkLastTagWas(0);
          return this;
       }catch(com.google.protobuf.InvalidProtocolBufferException e1){
          throw e1;
       }catch(java.io.IOException e1){
          throw new RuntimeException(this.getReadingExceptionMessage("byte array"), e1);
       }
    }
    public AbstractMessageLite$Builder mergeFrom(byte[] p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, 0, p0.length, p1);
    }
    public MessageLite$Builder mergeFrom(ByteString p0){
       return this.mergeFrom(p0);
    }
    public MessageLite$Builder mergeFrom(ByteString p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, p1);
    }
    public MessageLite$Builder mergeFrom(CodedInputStream p0){
       return this.mergeFrom(p0);
    }
    public MessageLite$Builder mergeFrom(CodedInputStream p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, p1);
    }
    public MessageLite$Builder mergeFrom(MessageLite p0){
       return this.mergeFrom(p0);
    }
    public MessageLite$Builder mergeFrom(InputStream p0){
       return this.mergeFrom(p0);
    }
    public MessageLite$Builder mergeFrom(InputStream p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, p1);
    }
    public MessageLite$Builder mergeFrom(byte[] p0){
       return this.mergeFrom(p0);
    }
    public MessageLite$Builder mergeFrom(byte[] p0,int p1,int p2){
       return this.mergeFrom(p0, p1, p2);
    }
    public MessageLite$Builder mergeFrom(byte[] p0,int p1,int p2,ExtensionRegistryLite p3){
       return this.mergeFrom(p0, p1, p2, p3);
    }
    public MessageLite$Builder mergeFrom(byte[] p0,ExtensionRegistryLite p1){
       return this.mergeFrom(p0, p1);
    }
}
