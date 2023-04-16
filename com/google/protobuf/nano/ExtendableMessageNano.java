package com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import java.lang.Object;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.FieldData;
import com.google.protobuf.nano.Extension;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.UnknownFieldData;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public abstract class ExtendableMessageNano extends MessageNano	// class@000506
{
    public FieldArray unknownFieldData;

    public void ExtendableMessageNano(){
       super();
    }
    public ExtendableMessageNano clone(){
       ExtendableMessageNano uExtendableM = super.clone();
       InternalNano.cloneUnknownFieldData(this, uExtendableM);
       return uExtendableM;
    }
    public MessageNano clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public int computeSerializedSize(){
       int i = 0;
       if (this.unknownFieldData != null) {
          int i1 = 0;
          for (; i < this.unknownFieldData.size(); i = i + 1) {
             i1 = i1 + this.unknownFieldData.dataAt(i).computeSerializedSize();
          }
          i = i1;
       }
       return i;
    }
    public final Object getExtension(Extension p0){
       ExtendableMessageNano tunknownFiel = this.unknownFieldData;
       Object obj = null;
       if (tunknownFiel == null) {
          return obj;
       }
       FieldData uFieldData = tunknownFiel.get(WireFormatNano.getTagFieldNumber(p0.tag));
       if (uFieldData != null) {
          obj = uFieldData.getValue(p0);
       }
       return obj;
    }
    public final boolean hasExtension(Extension p0){
       ExtendableMessageNano tunknownFiel = this.unknownFieldData;
       boolean b = false;
       if (tunknownFiel == null) {
          return b;
       }
       if (tunknownFiel.get(WireFormatNano.getTagFieldNumber(p0.tag)) != null) {
          b = true;
       }
       return b;
    }
    public final ExtendableMessageNano setExtension(Extension p0,Object p1){
       int tagFieldNumb = WireFormatNano.getTagFieldNumber(p0.tag);
       FieldArray uFieldArray = null;
       if (p1 == null) {
          ExtendableMessageNano tunknownFiel = this.unknownFieldData;
          if (tunknownFiel != null) {
             tunknownFiel.remove(tagFieldNumb);
             if (this.unknownFieldData.isEmpty()) {
                this.unknownFieldData = uFieldArray;
             }
          }
       }else {
          ExtendableMessageNano tunknownFiel1 = this.unknownFieldData;
          if (tunknownFiel1 == null) {
             this.unknownFieldData = new FieldArray();
          }else {
             uFieldArray = tunknownFiel1.get(tagFieldNumb);
          }
          if (uFieldArray == null) {
             this.unknownFieldData.put(tagFieldNumb, new FieldData(p0, p1));
          }else {
             uFieldArray.setValue(p0, p1);
          }
       }
       return this;
    }
    public final boolean storeUnknownField(CodedInputByteBufferNano p0,int p1){
       int position = p0.getPosition();
       if (!p0.skipField(p1)) {
          return false;
       }
       int tagFieldNumb = WireFormatNano.getTagFieldNumber(p1);
       UnknownFieldData unknownField = new UnknownFieldData(p1, p0.getData(position, (p0.getPosition() - position)));
       FieldData uFieldData = null;
       ExtendableMessageNano tunknownFiel = this.unknownFieldData;
       if (tunknownFiel == null) {
          this.unknownFieldData = new FieldArray();
       }else {
          uFieldData = tunknownFiel.get(tagFieldNumb);
       }
       if (uFieldData == null) {
          uFieldData = new FieldData();
          this.unknownFieldData.put(tagFieldNumb, uFieldData);
       }
       uFieldData.addUnknownField(unknownField);
       return true;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (this.unknownFieldData == null) {
          return;
       }
       for (int i = 0; i < this.unknownFieldData.size(); i = i + 1) {
          this.unknownFieldData.dataAt(i).writeTo(p0);
       }
       return;
    }
}
