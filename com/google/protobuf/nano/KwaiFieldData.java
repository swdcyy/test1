package com.google.protobuf.nano.KwaiFieldData;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.ArrayList;
import com.google.protobuf.nano.KwaiExtension;
import com.google.protobuf.nano.KwaiUnknownFieldData;
import java.util.List;
import java.util.Collection;
import com.google.protobuf.nano.MessageNano;
import java.lang.AssertionError;
import java.util.Iterator;
import java.lang.Class;
import java.util.Arrays;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public class KwaiFieldData implements Cloneable	// class@000513
{
    public KwaiExtension cachedExtension;
    public List mKwaiUnknownFieldData;
    public Object value;

    public void KwaiFieldData(){
       super();
       this.mKwaiUnknownFieldData = new ArrayList();
    }
    public void KwaiFieldData(KwaiExtension p0,Object p1){
       super();
       this.cachedExtension = p0;
       this.value = p1;
    }
    public void addUnknownField(KwaiUnknownFieldData p0){
       this.mKwaiUnknownFieldData.add(p0);
    }
    public final KwaiFieldData clone(){
       try{
          KwaiFieldData kwaiFieldDat = new KwaiFieldData();
          kwaiFieldDat.cachedExtension = this.cachedExtension;
          KwaiFieldData tmKwaiUnknow = this.mKwaiUnknownFieldData;
          if (tmKwaiUnknow == null) {
             kwaiFieldDat.mKwaiUnknownFieldData = null;
          }else {
             kwaiFieldDat.mKwaiUnknownFieldData.addAll(tmKwaiUnknow);
          }
          tmKwaiUnknow = this.value;
          if (tmKwaiUnknow != null) {
             if (tmKwaiUnknow instanceof MessageNano) {
                kwaiFieldDat.value = tmKwaiUnknow.clone();
             }else if(tmKwaiUnknow instanceof byte[]){
                kwaiFieldDat.value = tmKwaiUnknow.clone();
             }else {
                int i = 0;
                if (tmKwaiUnknow instanceof byte[][]) {
                   byte[][] uobyteArray = new byte[][tmKwaiUnknow.length];
                   kwaiFieldDat.value = uobyteArray;
                   for (; i < tmKwaiUnknow.length; i = i + 1) {
                      uobyteArray[i] = tmKwaiUnknow[i].clone();
                   }
                }else if(tmKwaiUnknow instanceof boolean[]){
                   kwaiFieldDat.value = tmKwaiUnknow.clone();
                }else if(tmKwaiUnknow instanceof int[]){
                   kwaiFieldDat.value = tmKwaiUnknow.clone();
                }else if(tmKwaiUnknow instanceof long[]){
                   kwaiFieldDat.value = tmKwaiUnknow.clone();
                }else if(tmKwaiUnknow instanceof float[]){
                   kwaiFieldDat.value = tmKwaiUnknow.clone();
                }else if(tmKwaiUnknow instanceof double[]){
                   kwaiFieldDat.value = tmKwaiUnknow.clone();
                }else if(tmKwaiUnknow instanceof MessageNano[]){
                   MessageNano[] messageNanoA = new MessageNano[tmKwaiUnknow.length];
                   kwaiFieldDat.value = messageNanoA;
                   for (; i < tmKwaiUnknow.length; i = i + 1) {
                      messageNanoA[i] = tmKwaiUnknow[i].clone();
                   }
                }
             }
          }
          return kwaiFieldDat;
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public Object clone(){
       return this.clone();
    }
    public int computeSerializedSize(){
       int i;
       KwaiFieldData tvalue = this.value;
       if (tvalue != null) {
          i = this.cachedExtension.computeSerializedSize(tvalue);
       }else {
          Iterator iterator = this.mKwaiUnknownFieldData.iterator();
          int i1 = 0;
          while (iterator.hasNext()) {
             i1 = i1 + iterator.next().computeSerializedSize();
          }
          i = i1;
       }
       return i;
    }
    public boolean equals(Object p0){
       KwaiFieldData tcachedExten;
       if (p0 == this) {
          return true;
       }
       boolean b = false;
       if (!p0 instanceof KwaiFieldData) {
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
          tcachedExten = this.mKwaiUnknownFieldData;
          if (tcachedExten != null) {
             KwaiFieldData mKwaiUnknown = p0.mKwaiUnknownFieldData;
             if (mKwaiUnknown != null) {
                return tcachedExten.equals(mKwaiUnknown);
             }
          }
          try{
             return Arrays.equals(this.toByteArray(), p0.toByteArray());
          }catch(java.io.IOException e4){
             throw new IllegalStateException(e4);
          }
       }
    }
    public KwaiUnknownFieldData getUnknownField(int p0){
       KwaiFieldData tmKwaiUnknow = this.mKwaiUnknownFieldData;
       if (tmKwaiUnknow == null) {
          return null;
       }
       if (p0 < tmKwaiUnknow.size()) {
          return this.mKwaiUnknownFieldData.get(p0);
       }
       return null;
    }
    public int getUnknownFieldSize(){
       KwaiFieldData tmKwaiUnknow = this.mKwaiUnknownFieldData;
       if (tmKwaiUnknow == null) {
          return 0;
       }
       return tmKwaiUnknow.size();
    }
    public Object getValue(KwaiExtension p0){
       if (this.value != null) {
       }else {
          this.cachedExtension = p0;
          this.value = p0.getValueFrom(this.mKwaiUnknownFieldData);
          this.mKwaiUnknownFieldData = null;
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
    public void setValue(KwaiExtension p0,Object p1){
       this.cachedExtension = p0;
       this.value = p1;
       this.mKwaiUnknownFieldData = null;
    }
    public final byte[] toByteArray(){
       byte[] uobyteArray = new byte[this.computeSerializedSize()];
       this.writeTo(CodedOutputByteBufferNano.newInstance(uobyteArray));
       return uobyteArray;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       KwaiFieldData tvalue = this.value;
       if (tvalue != null) {
          this.cachedExtension.writeTo(tvalue, p0);
       }else {
          Iterator iterator = this.mKwaiUnknownFieldData.iterator();
          while (iterator.hasNext()) {
             iterator.next().writeTo(p0);
          }
       }
       return;
    }
}
