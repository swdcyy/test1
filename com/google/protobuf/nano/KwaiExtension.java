package com.google.protobuf.nano.KwaiExtension;
import java.lang.Class;
import java.lang.Object;
import com.google.protobuf.nano.KwaiExtension$1;
import com.google.protobuf.nano.KwaiExtension$PrimitiveExtension;
import java.lang.reflect.Array;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.List;
import java.util.ArrayList;
import com.google.protobuf.nano.KwaiUnknownFieldData;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Throwable;
import java.lang.IllegalStateException;

public class KwaiExtension	// class@000511
{
    public final Class clazz;
    public final boolean repeated;
    public final int tag;
    public final int type;

    public void KwaiExtension(int p0,Class p1,int p2,boolean p3){
       super();
       this.type = p0;
       this.clazz = p1;
       this.tag = p2;
       this.repeated = p3;
    }
    public void KwaiExtension(int p0,Class p1,int p2,boolean p3,KwaiExtension$1 p4){
       super(p0, p1, p2, p3);
    }
    public static KwaiExtension createMessageTyped(int p0,Class p1,int p2){
       return new KwaiExtension(p0, p1, p2, false);
    }
    public static KwaiExtension createMessageTyped(int p0,Class p1,long p2){
       return new KwaiExtension(p0, p1, (int)p2, false);
    }
    public static KwaiExtension createPrimitiveTyped(int p0,Class p1,long p2){
       KwaiExtension$PrimitiveExtension primitiveExt = new KwaiExtension$PrimitiveExtension(p0, p1, (int)p2, false, 0, 0);
       return v7;
    }
    public static KwaiExtension createRepeatedMessageTyped(int p0,Class p1,long p2){
       return new KwaiExtension(p0, p1, (int)p2, true);
    }
    public static KwaiExtension createRepeatedPrimitiveTyped(int p0,Class p1,long p2,long p3,long p4){
       KwaiExtension$PrimitiveExtension primitiveExt = new KwaiExtension$PrimitiveExtension(p0, p1, (int)p2, true, (int)p3, (int)p4);
       return v7;
    }
    public int computeRepeatedSerializedSize(Object p0){
       int length = Array.getLength(p0);
       int i = 0;
       int i1 = 0;
       while (i < length) {
          if (Array.get(p0, i) != null) {
             i1 = i1 + this.computeSingularSerializedSize(Array.get(p0, i));
          }
          i = i + 1;
       }
       return i1;
    }
    public int computeSerializedSize(Object p0){
       if (this.repeated != null) {
          return this.computeRepeatedSerializedSize(p0);
       }
       return this.computeSingularSerializedSize(p0);
    }
    public int computeSingularSerializedSize(Object p0){
       int tagFieldNumb = WireFormatNano.getTagFieldNumber(this.tag);
       KwaiExtension ttype = this.type;
       if (ttype == 10) {
          return CodedOutputByteBufferNano.computeGroupSize(tagFieldNumb, p0);
       }
       if (ttype == 11) {
          return CodedOutputByteBufferNano.computeMessageSize(tagFieldNumb, p0);
       }
       throw new IllegalArgumentException("Unknown type "+this.type);
    }
    public final Object getRepeatedValueFrom(List p0){
       ArrayList uArrayList = new ArrayList();
       int i = 0;
       int i1 = 0;
       while (i1 < p0.size()) {
          KwaiUnknownFieldData kwaiUnknownF = p0.get(i1);
          if (kwaiUnknownF.bytes.length) {
             this.readDataInto(kwaiUnknownF, uArrayList);
          }
          i1 = i1 + 1;
       }
       int i2 = uArrayList.size();
       if (!i2) {
          return null;
       }
       KwaiExtension tclazz = this.clazz;
       Object obj = tclazz.cast(Array.newInstance(tclazz.getComponentType(), i2));
       for (; i < i2; i = i + 1) {
          Array.set(obj, i, uArrayList.get(i));
       }
       return obj;
    }
    public final Object getSingularValueFrom(List p0){
       if (p0.isEmpty()) {
          return null;
       }
       return this.clazz.cast(this.readData(CodedInputByteBufferNano.newInstance(p0.get((p0.size() - 1)).bytes)));
    }
    public final Object getValueFrom(List p0){
       if (p0 == null) {
          return null;
       }
       p0 = (this.repeated != null)? this.getRepeatedValueFrom(p0): this.getSingularValueFrom(p0);
       return p0;
    }
    public Object readData(CodedInputByteBufferNano p0){
       MessageNano messageNano;
       Class componentTyp = (this.repeated != null)? this.clazz.getComponentType(): this.clazz;
       try{
          KwaiExtension ttype = this.type;
          if (ttype != 10) {
             if (ttype == 11) {
                messageNano = componentTyp.newInstance();
                p0.readMessage(messageNano);
                return messageNano;
             }else {
                throw new IllegalArgumentException("Unknown type "+this.type);
             }
          }else {
             messageNano = componentTyp.newInstance();
             p0.readGroup(messageNano, WireFormatNano.getTagFieldNumber(this.tag));
             return messageNano;
          }
       }catch(java.lang.InstantiationException e5){
          throw new IllegalArgumentException("Error creating instance of class "+componentTyp, e5);
       }catch(java.lang.IllegalAccessException e5){
          throw new IllegalArgumentException("Error creating instance of class "+componentTyp, e5);
       }catch(java.io.IOException e5){
          throw new IllegalArgumentException("Error reading extension field", e5);
       }
    }
    public void readDataInto(KwaiUnknownFieldData p0,List p1){
       p1.add(this.readData(CodedInputByteBufferNano.newInstance(p0.bytes)));
    }
    public void writeRepeatedData(Object p0,CodedOutputByteBufferNano p1){
       int length = Array.getLength(p0);
       int i = 0;
       while (i < length) {
          Object obj = Array.get(p0, i);
          if (obj != null) {
             this.writeSingularData(obj, p1);
          }
          i = i + 1;
       }
       return;
    }
    public void writeSingularData(Object p0,CodedOutputByteBufferNano p1){
       try{
          p1.writeRawVarint32(this.tag);
          KwaiExtension ttype = this.type;
          if (ttype != 10) {
             if (ttype == 11) {
                p1.writeMessageNoTag(p0);
             }else {
                throw new IllegalArgumentException("Unknown type "+this.type);
             }
          }else {
             p1.writeGroupNoTag(p0);
             p1.writeTag(WireFormatNano.getTagFieldNumber(this.tag), 4);
          }
          return;
       }catch(java.io.IOException e3){
          throw new IllegalStateException(e3);
       }
    }
    public void writeTo(Object p0,CodedOutputByteBufferNano p1){
       if (this.repeated != null) {
          this.writeRepeatedData(p0, p1);
       }else {
          this.writeSingularData(p0, p1);
       }
       return;
    }
}
