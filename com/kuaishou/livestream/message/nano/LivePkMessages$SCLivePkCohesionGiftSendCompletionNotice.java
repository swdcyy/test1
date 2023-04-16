package com.kuaishou.livestream.message.nano.LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice extends MessageNano	// class@001223
{
    public long authorId;
    public int giftId;
    public String pkId;
    public long timestamp;
    public long userId;
    public static LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice[] _emptyArray;

    public void LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice[] emptyArray(){
       if (LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice._emptyArray == null) {
             LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice[] sCLivePkCohe = new LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice[0];
             LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice._emptyArray = sCLivePkCohe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice._emptyArray;
    }
    public static LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice().mergeFrom(p0);
    }
    public static LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice(), p0);
    }
    public LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice clear(){
       this.pkId = "";
       this.authorId = 0;
       this.userId = 0;
       this.giftId = 0;
       this.timestamp = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice tauthorId = this.authorId;
       int i1 = 0;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tauthorId);
       }
       tauthorId = this.userId;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       tauthorId = this.giftId;
       if (tauthorId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tauthorId);
       }
       tauthorId = this.timestamp;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tauthorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.timestamp = p0.readUInt64();
                      }
                   }else {
                      this.giftId = p0.readUInt32();
                   }
                }else {
                   this.userId = p0.readUInt64();
                }
             }else {
                this.authorId = p0.readUInt64();
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LivePkMessages$SCLivePkCohesionGiftSendCompletionNotice tauthorId = this.authorId;
       int i = 0;
       if (tauthorId - i) {
          p0.writeUInt64(2, tauthorId);
       }
       tauthorId = this.userId;
       if (tauthorId - i) {
          p0.writeUInt64(3, tauthorId);
       }
       tauthorId = this.giftId;
       if (tauthorId != null) {
          p0.writeUInt32(4, tauthorId);
       }
       tauthorId = this.timestamp;
       if (tauthorId - i) {
          p0.writeUInt64(5, tauthorId);
       }
       super.writeTo(p0);
       return;
    }
}
