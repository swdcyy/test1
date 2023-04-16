package com.google.protobuf.nano.FieldData;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import com.google.protobuf.nano.Extension;
import com.google.protobuf.nano.UnknownFieldData;
import java.util.List;
import java.util.Collection;
import com.google.protobuf.nano.MessageNano;
import java.lang.AssertionError;
import java.util.Iterator;
import java.lang.Class;
import java.util.Arrays;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public class FieldData implements Cloneable	// class@00050b
{
    public Extension cachedExtension;
    public List unknownFieldData;
    public Object value;

    public void FieldData(){
       super();
       this.unknownFieldData = new ArrayList();
    }
    public void FieldData(Extension p0,Object p1){
       super();
       this.cachedExtension = p0;
       this.value = p1;
    }
    public void addUnknownField(UnknownFieldData p0){
       this.unknownFieldData.add(p0);
    }
    public final FieldData clone(){
       try{
          FieldData uFieldData = new FieldData();
          uFieldData.cachedExtension = this.cachedExtension;
          FieldData tunknownFiel = this.unknownFieldData;
          if (tunknownFiel == null) {
             uFieldData.unknownFieldData = null;
          }else {
             uFieldData.unknownFieldData.addAll(tunknownFiel);
          }
          tunknownFiel = this.value;
          if (tunknownFiel != null) {
             if (tunknownFiel instanceof MessageNano) {
                uFieldData.value = tunknownFiel.clone();
             }else if(tunknownFiel instanceof byte[]){
                uFieldData.value = tunknownFiel.clone();
             }else {
                int i = 0;
                if (tunknownFiel instanceof byte[][]) {
                   byte[][] uobyteArray = new byte[][tunknownFiel.length];
                   uFieldData.value = uobyteArray;
                   for (; i < tunknownFiel.length; i = i + 1) {
                      uobyteArray[i] = tunknownFiel[i].clone();
                   }
                }else if(tunknownFiel instanceof boolean[]){
                   uFieldData.value = tunknownFiel.clone();
                }else if(tunknownFiel instanceof int[]){
                   uFieldData.value = tunknownFiel.clone();
                }else if(tunknownFiel instanceof long[]){
                   uFieldData.value = tunknownFiel.clone();
                }else if(tunknownFiel instanceof float[]){
                   uFieldData.value = tunknownFiel.clone();
                }else if(tunknownFiel instanceof double[]){
                   uFieldData.value = tunknownFiel.clone();
                }else if(tunknownFiel instanceof MessageNano[]){
                   MessageNano[] messageNanoA = new MessageNano[tunknownFiel.length];
                   uFieldData.value = messageNanoA;
                   for (; i < tunknownFiel.length; i = i + 1) {
                      messageNanoA[i] = tunknownFiel[i].clone();
                   }
                }
             }
          }
          return uFieldData;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public Object clone(){
       return this.clone();
    }
    public int computeSerializedSize(){
       int i;
       FieldData tvalue = this.value;
       if (tvalue != null) {
          i = this.cachedExtension.computeSerializedSize(tvalue);
       }else {
          Iterator iterator = this.unknownFieldData.iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             i1 = i1 + iterator.next().computeSerializedSize();
          }
          i = i1;
       }
       return i;
    }
    public boolean equals(Object p0){
       FieldData tcachedExten;
       if (p0 == this) {
          return true;
       }
       boolean b = false;
       if (!p0 instanceof FieldData) {
          return b;
       }
       if (this.value != null && p0.value != null) {
          tcachedExten = this.cachedExtension;
          if (tcachedExten != p0.cachedExtension) {
             return b;
          }else if(!tcachedExten.clazz.isArray()){
             return this.value.equals(p0.value);
          }else {
             tcachedExten = this.value;
             if (tcachedExten instanceof byte[]) {
                return Arrays.equals(tcachedExten, p0.value);
             }else if(tcachedExten instanceof int[]){
                return Arrays.equals(tcachedExten, p0.value);
             }else if(tcachedExten instanceof long[]){
                return Arrays.equals(tcachedExten, p0.value);
             }else if(tcachedExten instanceof float[]){
                return Arrays.equals(tcachedExten, p0.value);
             }else if(tcachedExten instanceof double[]){
                return Arrays.equals(tcachedExten, p0.value);
             }else if(tcachedExten instanceof boolean[]){
                return Arrays.equals(tcachedExten, p0.value);
             }else {
                return Arrays.deepEquals(tcachedExten, p0.value);
             }
          }
       }else {
          tcachedExten = this.unknownFieldData;
          if (tcachedExten != null) {
             FieldData unknownField = p0.unknownFieldData;
             if (unknownField != null) {
                return tcachedExten.equals(unknownField);
             }
          }
          try{
             return Arrays.equals(this.toByteArray(), p0.toByteArray());
          }catch(java.io.IOException e4){
             throw new IllegalStateException(e4);
          }
       }
    }
    public UnknownFieldData getUnknownField(int p0){
       FieldData tunknownFiel = this.unknownFieldData;
       if (tunknownFiel == null) {
          return null;
       }
       if (p0 < tunknownFiel.size()) {
          return this.unknownFieldData.get(p0);
       }
       return null;
    }
    public int getUnknownFieldSize(){
       FieldData tunknownFiel = this.unknownFieldData;
       if (tunknownFiel == null) {
          return 0;
       }
       return tunknownFiel.size();
    }
    public Object getValue(Extension p0){
       if (this.value != null) {
          if (this.cachedExtension != p0) {
             throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
          }
       }else {
          this.cachedExtension = p0;
          this.value = p0.getValueFrom(this.unknownFieldData);
          this.unknownFieldData = null;
       }
       return this.value;
    }
    public int hashCode(){
       int i = 527;
       try{
          return (i + Arrays.hashCode(this.toByteArray()));
       }catch(java.io.IOException e0){
          throw new IllegalStateException(e0);
       }
    }
    public void setValue(Extension p0,Object p1){
       this.cachedExtension = p0;
       this.value = p1;
       this.unknownFieldData = null;
    }
    public final byte[] toByteArray(){
       byte[] uobyteArray = new byte[this.computeSerializedSize()];
       this.writeTo(CodedOutputByteBufferNano.newInstance(uobyteArray));
       return uobyteArray;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       FieldData tvalue = this.value;
       if (tvalue != null) {
          this.cachedExtension.writeTo(tvalue, p0);
       }else {
          Iterator iterator = this.unknownFieldData.iterator();
          while (iterator.hasNext()) {
             iterator.next().writeTo(p0);
          }
       }
       return;
    }
}
