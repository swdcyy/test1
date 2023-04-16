package com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle;

public final class LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice extends MessageNano	// class@00128f
{
    public String liveStreamId;
    public LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle noticeTextCaption;
    public LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle noticeTextSubline;
    public int taskType;
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice[] _emptyArray;

    public void LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice(){
       super();
       this.clear();
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice[] emptyArray(){
       if (LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice._emptyArray == null) {
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice[] sCLiveRevenu = new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice[0];
             LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice._emptyArray = sCLiveRevenu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice._emptyArray;
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice().mergeFrom(p0);
    }
    public static LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice(), p0);
    }
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice clear(){
       this.noticeTextCaption = null;
       this.noticeTextSubline = null;
       this.taskType = 0;
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice tnoticeTextC = this.noticeTextCaption;
       if (tnoticeTextC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tnoticeTextC);
       }
       tnoticeTextC = this.noticeTextSubline;
       if (tnoticeTextC != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tnoticeTextC);
       }
       tnoticeTextC = this.taskType;
       if (tnoticeTextC != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tnoticeTextC);
       }
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.taskType = p0.readUInt32();
                }
             }else if(this.noticeTextSubline == null){
                this.noticeTextSubline = new LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle();
             }
             p0.readMessage(this.noticeTextSubline);
          }else if(this.noticeTextCaption == null){
             this.noticeTextCaption = new LiveRevenueBlessgingBagProto$BlessingBagWidgeContentWithStyle();
          }
          p0.readMessage(this.noticeTextCaption);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRevenueBlessgingBagProto$SCLiveRevenueBlessingBagNotice tnoticeTextC = this.noticeTextCaption;
       if (tnoticeTextC != null) {
          p0.writeMessage(1, tnoticeTextC);
       }
       tnoticeTextC = this.noticeTextSubline;
       if (tnoticeTextC != null) {
          p0.writeMessage(2, tnoticeTextC);
       }
       tnoticeTextC = this.taskType;
       if (tnoticeTextC != null) {
          p0.writeUInt32(3, tnoticeTextC);
       }
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(4, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
