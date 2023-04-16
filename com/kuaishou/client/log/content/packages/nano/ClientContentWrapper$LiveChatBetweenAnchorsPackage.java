package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$LiveChatBetweenAnchorsPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$LiveChatBetweenAnchorsPackage extends MessageNano	// class@00131d
{
    public String chatId;
    public long connectedTimestamp;
    public int endReason;
    public long establishedTimestamp;
    public int invitationRole;
    public boolean isInvitationForbidden;
    public String peerLiveStreamId;
    public int peerType;
    public String peerUserId;
    public long startConnectingTimestamp;
    public static ClientContentWrapper$LiveChatBetweenAnchorsPackage[] _emptyArray;

    public void ClientContentWrapper$LiveChatBetweenAnchorsPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$LiveChatBetweenAnchorsPackage[] emptyArray(){
       if (ClientContentWrapper$LiveChatBetweenAnchorsPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$LiveChatBetweenAnchorsPackage._emptyArray == null) {
             ClientContentWrapper$LiveChatBetweenAnchorsPackage[] liveChatBetw = new ClientContentWrapper$LiveChatBetweenAnchorsPackage[0];
             ClientContentWrapper$LiveChatBetweenAnchorsPackage._emptyArray = liveChatBetw;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$LiveChatBetweenAnchorsPackage._emptyArray;
    }
    public static ClientContentWrapper$LiveChatBetweenAnchorsPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$LiveChatBetweenAnchorsPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$LiveChatBetweenAnchorsPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$LiveChatBetweenAnchorsPackage(), p0);
    }
    public ClientContentWrapper$LiveChatBetweenAnchorsPackage clear(){
       this.chatId = "";
       this.peerUserId = "";
       this.peerLiveStreamId = "";
       this.startConnectingTimestamp = 0;
       this.establishedTimestamp = 0;
       this.connectedTimestamp = 0;
       this.isInvitationForbidden = false;
       this.peerType = 0;
       this.invitationRole = 0;
       this.endReason = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.chatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.chatId);
       }
       if (!(this.peerUserId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.peerUserId);
       }
       if (!(this.peerLiveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.peerLiveStreamId);
       }
       ClientContentWrapper$LiveChatBetweenAnchorsPackage tstartConnec = this.startConnectingTimestamp;
       int i1 = 0;
       if (tstartConnec - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tstartConnec);
       }
       tstartConnec = this.establishedTimestamp;
       if (tstartConnec - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tstartConnec);
       }
       tstartConnec = this.connectedTimestamp;
       if (tstartConnec - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tstartConnec);
       }
       tstartConnec = this.isInvitationForbidden;
       if (tstartConnec != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tstartConnec);
       }
       tstartConnec = this.peerType;
       if (tstartConnec != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tstartConnec);
       }
       tstartConnec = this.invitationRole;
       if (tstartConnec != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tstartConnec);
       }
       tstartConnec = this.endReason;
       if (tstartConnec != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, tstartConnec);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$LiveChatBetweenAnchorsPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.chatId = p0.readString();
                break;
              case 18:
                this.peerUserId = p0.readString();
                break;
              case 26:
                this.peerLiveStreamId = p0.readString();
                break;
              case 32:
                this.startConnectingTimestamp = p0.readUInt64();
                break;
              case '(':
                this.establishedTimestamp = p0.readUInt64();
                break;
              case '0':
                this.connectedTimestamp = p0.readUInt64();
                break;
              case '8':
                this.isInvitationForbidden = p0.readBool();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.peerType = i;
                }
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.invitationRole = i;
                }
                break;
              case 'P':
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
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 1:
                      break;
                    default:
                }
                this.endReason = i;
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.chatId).equals(str)) {
          p0.writeString(1, this.chatId);
       }
       if (!(this.peerUserId).equals(str)) {
          p0.writeString(2, this.peerUserId);
       }
       if (!(this.peerLiveStreamId).equals(str)) {
          p0.writeString(3, this.peerLiveStreamId);
       }
       ClientContentWrapper$LiveChatBetweenAnchorsPackage tstartConnec = this.startConnectingTimestamp;
       int i = 0;
       if (tstartConnec - i) {
          p0.writeUInt64(4, tstartConnec);
       }
       tstartConnec = this.establishedTimestamp;
       if (tstartConnec - i) {
          p0.writeUInt64(5, tstartConnec);
       }
       tstartConnec = this.connectedTimestamp;
       if (tstartConnec - i) {
          p0.writeUInt64(6, tstartConnec);
       }
       tstartConnec = this.isInvitationForbidden;
       if (tstartConnec != null) {
          p0.writeBool(7, tstartConnec);
       }
       tstartConnec = this.peerType;
       if (tstartConnec != null) {
          p0.writeInt32(8, tstartConnec);
       }
       tstartConnec = this.invitationRole;
       if (tstartConnec != null) {
          p0.writeInt32(9, tstartConnec);
       }
       tstartConnec = this.endReason;
       if (tstartConnec != null) {
          p0.writeInt32(10, tstartConnec);
       }
       super.writeTo(p0);
       return;
    }
}
