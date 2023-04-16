package com.kuaishou.livestream.message.nano.LiveLineChatMessages$SCLiveLineChatReady;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveLineChatMessages$SCLiveLineChatReady extends MessageNano	// class@0011e2
{
    public UserInfos$UserInfo counterpartAuthor;
    public long inviterId;
    public String lineChatId;
    public String liveStreamId;
    public int matchType;
    public String socialTips;
    public static LiveLineChatMessages$SCLiveLineChatReady[] _emptyArray;

    public void LiveLineChatMessages$SCLiveLineChatReady(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$SCLiveLineChatReady[] emptyArray(){
       if (LiveLineChatMessages$SCLiveLineChatReady._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$SCLiveLineChatReady._emptyArray == null) {
             LiveLineChatMessages$SCLiveLineChatReady[] sCLiveLineCh = new LiveLineChatMessages$SCLiveLineChatReady[0];
             LiveLineChatMessages$SCLiveLineChatReady._emptyArray = sCLiveLineCh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$SCLiveLineChatReady._emptyArray;
    }
    public static LiveLineChatMessages$SCLiveLineChatReady parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$SCLiveLineChatReady().mergeFrom(p0);
    }
    public static LiveLineChatMessages$SCLiveLineChatReady parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$SCLiveLineChatReady(), p0);
    }
    public LiveLineChatMessages$SCLiveLineChatReady clear(){
       this.lineChatId = "";
       this.counterpartAuthor = null;
       this.socialTips = "";
       this.liveStreamId = "";
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
       LiveLineChatMessages$SCLiveLineChatReady tcounterpart = this.counterpartAuthor;
       if (tcounterpart != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tcounterpart);
       }
       if (!(this.socialTips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.socialTips);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       tcounterpart = this.matchType;
       if (tcounterpart != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tcounterpart);
       }
       tcounterpart = this.inviterId;
       if (tcounterpart) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tcounterpart);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$SCLiveLineChatReady mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
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
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.socialTips = p0.readString();
                }
             }else if(this.counterpartAuthor == null){
                this.counterpartAuthor = new UserInfos$UserInfo();
             }
             p0.readMessage(this.counterpartAuthor);
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
       LiveLineChatMessages$SCLiveLineChatReady tcounterpart = this.counterpartAuthor;
       if (tcounterpart != null) {
          p0.writeMessage(2, tcounterpart);
       }
       if (!(this.socialTips).equals(str)) {
          p0.writeString(3, this.socialTips);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       tcounterpart = this.matchType;
       if (tcounterpart != null) {
          p0.writeInt32(5, tcounterpart);
       }
       tcounterpart = this.inviterId;
       if (tcounterpart) {
          p0.writeUInt64(6, tcounterpart);
       }
       super.writeTo(p0);
       return;
    }
}
