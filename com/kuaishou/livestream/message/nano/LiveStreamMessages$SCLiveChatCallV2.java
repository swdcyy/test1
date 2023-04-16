package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatCallV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$SCLiveChatCallV2 extends MessageNano	// class@00133c
{
    public long guestAcceptDeadline;
    public String liveChatId;
    public int mediaType;
    public int sourceType;
    public long time;
    public static LiveStreamMessages$SCLiveChatCallV2[] _emptyArray;

    public void LiveStreamMessages$SCLiveChatCallV2(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveChatCallV2[] emptyArray(){
       if (LiveStreamMessages$SCLiveChatCallV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveChatCallV2._emptyArray == null) {
             LiveStreamMessages$SCLiveChatCallV2[] sCLiveChatCa = new LiveStreamMessages$SCLiveChatCallV2[0];
             LiveStreamMessages$SCLiveChatCallV2._emptyArray = sCLiveChatCa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveChatCallV2._emptyArray;
    }
    public static LiveStreamMessages$SCLiveChatCallV2 parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveChatCallV2().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveChatCallV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveChatCallV2(), p0);
    }
    public LiveStreamMessages$SCLiveChatCallV2 clear(){
       this.liveChatId = "";
       this.mediaType = 0;
       this.guestAcceptDeadline = 0;
       this.time = 0;
       this.sourceType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveChatId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveChatId);
       }
       LiveStreamMessages$SCLiveChatCallV2 tmediaType = this.mediaType;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tmediaType);
       }
       tmediaType = this.guestAcceptDeadline;
       int i1 = 0;
       if (tmediaType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmediaType);
       }
       tmediaType = this.time;
       if (tmediaType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmediaType);
       }
       tmediaType = this.sourceType;
       if (tmediaType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tmediaType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveChatCallV2 mergeFrom(CodedInputByteBufferNano p0){
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
                         i = p0.readInt32();
                         if (i && i != 1) {
                            continue ;
                         }else {
                            this.sourceType = i;
                         }
                      }
                   }else {
                      this.time = p0.readUInt64();
                   }
                }else {
                   this.guestAcceptDeadline = p0.readUInt64();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.mediaType = i;
                }
             }
          }else {
             this.liveChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveChatId).equals("")) {
          p0.writeString(1, this.liveChatId);
       }
       LiveStreamMessages$SCLiveChatCallV2 tmediaType = this.mediaType;
       if (tmediaType != null) {
          p0.writeInt32(2, tmediaType);
       }
       tmediaType = this.guestAcceptDeadline;
       int i = 0;
       if (tmediaType - i) {
          p0.writeUInt64(3, tmediaType);
       }
       tmediaType = this.time;
       if (tmediaType - i) {
          p0.writeUInt64(4, tmediaType);
       }
       tmediaType = this.sourceType;
       if (tmediaType != null) {
          p0.writeInt32(5, tmediaType);
       }
       super.writeTo(p0);
       return;
    }
}
