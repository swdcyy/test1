package com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialNoticeCard;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;

public final class LiveAdSocialMessages$LiveAdSocialConversionState extends MessageNano	// class@0010e8
{
    public LiveAdSocialMessages$LiveAdSocialConversionTask conversionTask;
    public LiveAdSocialMessages$LiveAdSocialNoticeCard noticeCard;
    public String popMsg;
    public static LiveAdSocialMessages$LiveAdSocialConversionState[] _emptyArray;

    public void LiveAdSocialMessages$LiveAdSocialConversionState(){
       super();
       this.clear();
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionState[] emptyArray(){
       if (LiveAdSocialMessages$LiveAdSocialConversionState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdSocialMessages$LiveAdSocialConversionState._emptyArray == null) {
             LiveAdSocialMessages$LiveAdSocialConversionState[] liveAdSocial = new LiveAdSocialMessages$LiveAdSocialConversionState[0];
             LiveAdSocialMessages$LiveAdSocialConversionState._emptyArray = liveAdSocial;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdSocialMessages$LiveAdSocialConversionState._emptyArray;
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionState parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdSocialMessages$LiveAdSocialConversionState().mergeFrom(p0);
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdSocialMessages$LiveAdSocialConversionState(), p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionState clear(){
       this.popMsg = "";
       this.conversionTask = null;
       this.noticeCard = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.popMsg).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.popMsg);
       }
       LiveAdSocialMessages$LiveAdSocialConversionState tconversionT = this.conversionTask;
       if (tconversionT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tconversionT);
       }
       tconversionT = this.noticeCard;
       if (tconversionT != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tconversionT);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 18) {
             if (i != 26) {
                if (i != 34) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.noticeCard == null){
                   this.noticeCard = new LiveAdSocialMessages$LiveAdSocialNoticeCard();
                }
                p0.readMessage(this.noticeCard);
             }else if(this.conversionTask == null){
                this.conversionTask = new LiveAdSocialMessages$LiveAdSocialConversionTask();
             }
             p0.readMessage(this.conversionTask);
          }else {
             this.popMsg = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.popMsg).equals("")) {
          p0.writeString(2, this.popMsg);
       }
       LiveAdSocialMessages$LiveAdSocialConversionState tconversionT = this.conversionTask;
       if (tconversionT != null) {
          p0.writeMessage(3, tconversionT);
       }
       tconversionT = this.noticeCard;
       if (tconversionT != null) {
          p0.writeMessage(4, tconversionT);
       }
       super.writeTo(p0);
       return;
    }
}
