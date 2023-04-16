package com.google.protobuf.nano.KwaiExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.google.protobuf.nano.KwaiExtension;
import java.lang.Object;
import java.lang.Class;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import java.lang.Double;
import com.google.protobuf.nano.KwaiFieldArray;
import com.google.protobuf.nano.KwaiFieldData;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.KwaiUnknownFieldData;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public abstract class KwaiExtendableMessageNano extends MessageNano	// class@00050e
{
    public KwaiFieldArray unknownFieldData;
    public static final boolean disable;

    static {
       KwaiExtendableMessageNano.disable = a.t().d("disablePbExtension", false);
    }
    public void KwaiExtendableMessageNano(){
       super();
    }
    public static Object defaultValue(KwaiExtension p0){
       if (p0.clazz.isArray()) {
          return null;
       }
       switch (p0.type){
           case 1:
             return Double.valueOf(0);
           case 2:
             return Float.valueOf(0);
           case 3:
           case 6:
           case 16:
           case 18:
           case 4:
             return Long.valueOf(0);
           case 5:
           case 13:
           case 14:
           case 15:
           case 17:
           case 7:
             return Integer.valueOf(0);
           case 8:
             return Boolean.FALSE;
           default:
          label_000f :
             return null;
       }
    }
    public KwaiExtendableMessageNano clone(){
       if (KwaiExtendableMessageNano.disable) {
          return super.clone();
       }
       KwaiExtendableMessageNano kwaiExtendab = super.clone();
       if (this.unknownFieldData != null) {
          kwaiExtendab.unknownFieldData = this.unknownFieldData.clone();
       }
       return kwaiExtendab;
    }
    public MessageNano clone(){
       return this.clone();
    }
    public Object clone(){
       return this.clone();
    }
    public int computeSerializedSize(){
       if (KwaiExtendableMessageNano.disable) {
          return super.computeSerializedSize();
       }
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
    public final Object getExtension(KwaiExtension p0){
       if (KwaiExtendableMessageNano.disable) {
          return KwaiExtendableMessageNano.defaultValue(p0);
       }
       if (this.unknownFieldData == null) {
          return KwaiExtendableMessageNano.defaultValue(p0);
       }
       KwaiFieldData kwaiFieldDat = this.unknownFieldData.get(WireFormatNano.getTagFieldNumber(p0.tag));
       Object obj = (kwaiFieldDat == null)? null: kwaiFieldDat.getValue(p0);
       if (obj == null) {
          return KwaiExtendableMessageNano.defaultValue(p0);
       }else {
          return obj;
       }
    }
    public final boolean hasExtension(KwaiExtension p0){
       boolean b = false;
       if (KwaiExtendableMessageNano.disable) {
          return b;
       }
       if (this.unknownFieldData == null) {
          return b;
       }
       if (this.unknownFieldData.get(WireFormatNano.getTagFieldNumber(p0.tag)) != null) {
          b = true;
       }
       return b;
    }
    public final KwaiFieldArray newUnknownFieldData(){
       if (this.unknownFieldData == null) {
          _monitor_enter(this);
          if (this.unknownFieldData == null) {
             this.unknownFieldData = new KwaiFieldArray();
          }
          _monitor_exit(this);
       }
       return this.unknownFieldData;
    }
    public final KwaiExtendableMessageNano setExtension(Object p0,KwaiExtension p1){
       if (KwaiExtendableMessageNano.disable) {
          return this;
       }
       int tagFieldNumb = WireFormatNano.getTagFieldNumber(p1.tag);
       KwaiFieldArray kwaiFieldArr = null;
       if (p0 == null) {
          if (this.unknownFieldData != null) {
             this.unknownFieldData.remove(tagFieldNumb);
             if (this.unknownFieldData.isEmpty()) {
                this.unknownFieldData = kwaiFieldArr;
             }
          }
       }else if(this.unknownFieldData == null){
          this.unknownFieldData = this.newUnknownFieldData();
       }else {
          kwaiFieldArr = this.unknownFieldData.get(tagFieldNumb);
       }
       if (kwaiFieldArr == null) {
          this.unknownFieldData.put(tagFieldNumb, new KwaiFieldData(p1, p0));
       }else {
          kwaiFieldArr.setValue(p1, p0);
       }
       return this;
    }
    public final boolean storeUnknownField(CodedInputByteBufferNano p0,int p1){
       if (KwaiExtendableMessageNano.disable) {
          return WireFormatNano.parseUnknownField(p0, p1);
       }
       int position = p0.getPosition();
       if (!p0.skipField(p1)) {
          return false;
       }
       int tagFieldNumb = WireFormatNano.getTagFieldNumber(p1);
       KwaiUnknownFieldData kwaiUnknownF = new KwaiUnknownFieldData(p1, p0.getData(position, (p0.getPosition() - position)));
       KwaiFieldData kwaiFieldDat = null;
       if (this.unknownFieldData == null) {
          this.unknownFieldData = this.newUnknownFieldData();
       }else {
          kwaiFieldDat = this.unknownFieldData.get(tagFieldNumb);
       }
       if (kwaiFieldDat == null) {
          kwaiFieldDat = new KwaiFieldData();
          this.unknownFieldData.put(tagFieldNumb, kwaiFieldDat);
       }
       kwaiFieldDat.addUnknownField(kwaiUnknownF);
       return true;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (KwaiExtendableMessageNano.disable) {
          super.writeTo(p0);
          return;
       }else if(this.unknownFieldData == null){
          return;
       }else {
          for (int i = 0; i < this.unknownFieldData.size(); i = i + 1) {
             this.unknownFieldData.dataAt(i).writeTo(p0);
          }
          return;
       }
    }
}
