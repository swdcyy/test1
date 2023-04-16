package com.kuaishou.livestream.message.nano.LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice extends MessageNano	// class@0011e6
{
    public long maxShowDurationMs;
    public String subBizId;
    public String subBizType;
    public static LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice[] _emptyArray;

    public void LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice(){
       super();
       this.clear();
    }
    public static LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice[] emptyArray(){
       if (LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice._emptyArray == null) {
             LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice[] sCLiveLiteEn = new LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice[0];
             LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice._emptyArray = sCLiveLiteEn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice._emptyArray;
    }
    public static LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice().mergeFrom(p0);
    }
    public static LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice(), p0);
    }
    public LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice clear(){
       this.subBizType = "";
       this.subBizId = "";
       this.maxShowDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.subBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.subBizType);
       }
       if (!(this.subBizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.subBizId);
       }
       LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice tmaxShowDura = this.maxShowDurationMs;
       if (tmaxShowDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmaxShowDura);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice mergeFrom(CodedInputByteBufferNano p0){
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
                   this.maxShowDurationMs = p0.readUInt64();
                }
             }else {
                this.subBizId = p0.readString();
             }
          }else {
             this.subBizType = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.subBizType).equals(str)) {
          p0.writeString(1, this.subBizType);
       }
       if (!(this.subBizId).equals(str)) {
          p0.writeString(2, this.subBizId);
       }
       LiveLiteEnterRoomGuideMessages$SCLiveLiteEnterRoomGuideNotice tmaxShowDura = this.maxShowDurationMs;
       if (tmaxShowDura) {
          p0.writeUInt64(3, tmaxShowDura);
       }
       super.writeTo(p0);
       return;
    }
}
