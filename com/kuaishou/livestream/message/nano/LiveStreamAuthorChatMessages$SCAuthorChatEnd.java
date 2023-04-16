package com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$SCAuthorChatEnd;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamAuthorChatMessages$SCAuthorChatEnd extends MessageNano	// class@0012ba
{
    public String authorChatId;
    public String endLiveStreamId;
    public int endType;
    public static LiveStreamAuthorChatMessages$SCAuthorChatEnd[] _emptyArray;

    public void LiveStreamAuthorChatMessages$SCAuthorChatEnd(){
       super();
       this.clear();
    }
    public static LiveStreamAuthorChatMessages$SCAuthorChatEnd[] emptyArray(){
       if (LiveStreamAuthorChatMessages$SCAuthorChatEnd._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamAuthorChatMessages$SCAuthorChatEnd._emptyArray == null) {
             LiveStreamAuthorChatMessages$SCAuthorChatEnd[] sCAuthorChat = new LiveStreamAuthorChatMessages$SCAuthorChatEnd[0];
             LiveStreamAuthorChatMessages$SCAuthorChatEnd._emptyArray = sCAuthorChat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamAuthorChatMessages$SCAuthorChatEnd._emptyArray;
    }
    public static LiveStreamAuthorChatMessages$SCAuthorChatEnd parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamAuthorChatMessages$SCAuthorChatEnd().mergeFrom(p0);
    }
    public static LiveStreamAuthorChatMessages$SCAuthorChatEnd parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamAuthorChatMessages$SCAuthorChatEnd(), p0);
    }
    public LiveStreamAuthorChatMessages$SCAuthorChatEnd clear(){
       this.authorChatId = "";
       this.endType = 0;
       this.endLiveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.authorChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.authorChatId);
       }
       LiveStreamAuthorChatMessages$SCAuthorChatEnd tendType = this.endType;
       if (tendType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tendType);
       }
       if (!(this.endLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.endLiveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamAuthorChatMessages$SCAuthorChatEnd mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.endLiveStreamId = p0.readString();
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
                    case 1:
                      break;
                    default:
                }
                this.endType = i;
             }
          }else {
             this.authorChatId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.authorChatId).equals(str)) {
          p0.writeString(1, this.authorChatId);
       }
       LiveStreamAuthorChatMessages$SCAuthorChatEnd tendType = this.endType;
       if (tendType != null) {
          p0.writeInt32(2, tendType);
       }
       if (!(this.endLiveStreamId).equals(str)) {
          p0.writeString(3, this.endLiveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
