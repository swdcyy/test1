package com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveLineChatMessages$SCLiveLineChatEnd extends MessageNano	// class@0011de
{
    public int endType;
    public long inviterId;
    public String lineChatId;
    public String liveStreamId;
    public int matchType;
    public static LiveLineChatMessages$SCLiveLineChatEnd[] _emptyArray;

    public void LiveLineChatMessages$SCLiveLineChatEnd(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$SCLiveLineChatEnd[] emptyArray(){
       if (LiveLineChatMessages$SCLiveLineChatEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$SCLiveLineChatEnd._emptyArray == null) {
             LiveLineChatMessages$SCLiveLineChatEnd[] sCLiveLineCh = new LiveLineChatMessages$SCLiveLineChatEnd[0];
             LiveLineChatMessages$SCLiveLineChatEnd._emptyArray = sCLiveLineCh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$SCLiveLineChatEnd._emptyArray;
    }
    public static LiveLineChatMessages$SCLiveLineChatEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$SCLiveLineChatEnd().mergeFrom(p0);
    }
    public static LiveLineChatMessages$SCLiveLineChatEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$SCLiveLineChatEnd(), p0);
    }
    public LiveLineChatMessages$SCLiveLineChatEnd clear(){
       this.lineChatId = "";
       this.liveStreamId = "";
       this.endType = 0;
       this.matchType = 0;
       this.inviterId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.lineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.lineChatId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       LiveLineChatMessages$SCLiveLineChatEnd tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tendType);
       }
       tendType = this.matchType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tendType);
       }
       tendType = this.inviterId;
       if (tendType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tendType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$SCLiveLineChatEnd mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.inviterId = p0.readUInt64();
                      }
                   }else {
                      i = p0.readInt32();
                      switch (i){
                          case 0:
                          case 2:
                          case 3:
                          case 4:
                          case 5:
                          case 6:
                          case 7:
                          case 1:
                            break;
                          default:
                      }
                      this.matchType = i;
                   }
                }else {
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 8:
                       case 9:
                       case 10:
                       case 1:
                         break;
                       default:
                   }
                   this.endType = i;
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.lineChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.lineChatId).equals(str)) {
          p0.writeString(1, this.lineChatId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       LiveLineChatMessages$SCLiveLineChatEnd tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(3, tendType);
       }
       tendType = this.matchType;
       if (tendType != null) {
          p0.writeInt32(4, tendType);
       }
       tendType = this.inviterId;
       if (tendType) {
          p0.writeUInt64(5, tendType);
       }
       super.writeTo(p0);
       return;
    }
}
