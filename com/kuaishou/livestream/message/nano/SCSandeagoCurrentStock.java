package com.kuaishou.livestream.message.nano.SCSandeagoCurrentStock;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCSandeagoCurrentStock extends MessageNano	// class@001460
{
    public long currentStock;
    public String itemId;
    public String liveStreamId;
    public long totalStock;
    public static SCSandeagoCurrentStock[] _emptyArray;

    public void SCSandeagoCurrentStock(){
       super();
       this.clear();
    }
    public static SCSandeagoCurrentStock[] emptyArray(){
       if (SCSandeagoCurrentStock._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCSandeagoCurrentStock._emptyArray == null) {
             SCSandeagoCurrentStock[] sCSandeagoCu = new SCSandeagoCurrentStock[0];
             SCSandeagoCurrentStock._emptyArray = sCSandeagoCu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCSandeagoCurrentStock._emptyArray;
    }
    public static SCSandeagoCurrentStock parseFrom(CodedInputByteBufferNano p0){
       return new SCSandeagoCurrentStock().mergeFrom(p0);
    }
    public static SCSandeagoCurrentStock parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCSandeagoCurrentStock(), p0);
    }
    public SCSandeagoCurrentStock clear(){
       this.liveStreamId = "";
       this.itemId = "";
       this.currentStock = 0;
       this.totalStock = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.itemId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.itemId);
       }
       SCSandeagoCurrentStock tcurrentStoc = this.currentStock;
       int i1 = 0;
       if (tcurrentStoc - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tcurrentStoc);
       }
       tcurrentStoc = this.totalStock;
       if (tcurrentStoc - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tcurrentStoc);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCSandeagoCurrentStock mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.totalStock = p0.readUInt64();
                   }
                }else {
                   this.currentStock = p0.readUInt64();
                }
             }else {
                this.itemId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.itemId).equals(str)) {
          p0.writeString(2, this.itemId);
       }
       SCSandeagoCurrentStock tcurrentStoc = this.currentStock;
       int i = 0;
       if (tcurrentStoc - i) {
          p0.writeUInt64(3, tcurrentStoc);
       }
       tcurrentStoc = this.totalStock;
       if (tcurrentStoc - i) {
          p0.writeUInt64(4, tcurrentStoc);
       }
       super.writeTo(p0);
       return;
    }
}
