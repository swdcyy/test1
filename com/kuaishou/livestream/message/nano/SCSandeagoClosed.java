package com.kuaishou.livestream.message.nano.SCSandeagoClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCSandeagoClosed extends MessageNano	// class@00145f
{
    public String itemId;
    public String liveStreamId;
    public long remainProductCount;
    public static SCSandeagoClosed[] _emptyArray;

    public void SCSandeagoClosed(){
       super();
       this.clear();
    }
    public static SCSandeagoClosed[] emptyArray(){
       if (SCSandeagoClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCSandeagoClosed._emptyArray == null) {
             SCSandeagoClosed[] sCSandeagoCl = new SCSandeagoClosed[0];
             SCSandeagoClosed._emptyArray = sCSandeagoCl;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCSandeagoClosed._emptyArray;
    }
    public static SCSandeagoClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCSandeagoClosed().mergeFrom(p0);
    }
    public static SCSandeagoClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCSandeagoClosed(), p0);
    }
    public SCSandeagoClosed clear(){
       this.liveStreamId = "";
       this.itemId = "";
       this.remainProductCount = 0;
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
       SCSandeagoClosed tremainProdu = this.remainProductCount;
       if (tremainProdu) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tremainProdu);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCSandeagoClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.remainProductCount = p0.readUInt64();
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
       SCSandeagoClosed tremainProdu = this.remainProductCount;
       if (tremainProdu) {
          p0.writeUInt64(3, tremainProdu);
       }
       super.writeTo(p0);
       return;
    }
}
