package com.kuaishou.livestream.message.nano.LiveRedPackMessage$AudienceRedPackGift;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRedPackMessage$AudienceRedPackGift extends MessageNano	// class@00126c
{
    public int count;
    public int giftId;
    public static LiveRedPackMessage$AudienceRedPackGift[] _emptyArray;

    public void LiveRedPackMessage$AudienceRedPackGift(){
       super();
       this.clear();
    }
    public static LiveRedPackMessage$AudienceRedPackGift[] emptyArray(){
       if (LiveRedPackMessage$AudienceRedPackGift._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackMessage$AudienceRedPackGift._emptyArray == null) {
             LiveRedPackMessage$AudienceRedPackGift[] uAudienceRed = new LiveRedPackMessage$AudienceRedPackGift[0];
             LiveRedPackMessage$AudienceRedPackGift._emptyArray = uAudienceRed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackMessage$AudienceRedPackGift._emptyArray;
    }
    public static LiveRedPackMessage$AudienceRedPackGift parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackMessage$AudienceRedPackGift().mergeFrom(p0);
    }
    public static LiveRedPackMessage$AudienceRedPackGift parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackMessage$AudienceRedPackGift(), p0);
    }
    public LiveRedPackMessage$AudienceRedPackGift clear(){
       this.giftId = 0;
       this.count = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRedPackMessage$AudienceRedPackGift tgiftId = this.giftId;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tgiftId);
       }
       tgiftId = this.count;
       if (tgiftId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tgiftId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackMessage$AudienceRedPackGift mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.count = p0.readUInt32();
             }
          }else {
             this.giftId = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRedPackMessage$AudienceRedPackGift tgiftId = this.giftId;
       if (tgiftId != null) {
          p0.writeUInt32(1, tgiftId);
       }
       tgiftId = this.count;
       if (tgiftId != null) {
          p0.writeUInt32(2, tgiftId);
       }
       super.writeTo(p0);
       return;
    }
}
