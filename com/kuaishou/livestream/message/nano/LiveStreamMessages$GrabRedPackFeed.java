package com.kuaishou.livestream.message.nano.LiveStreamMessages$GrabRedPackFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$GrabRedPackFeed extends MessageNano	// class@0012db
{
    public UserInfos$UserInfo fromUser;
    public int getKsCoin;
    public String id;
    public int liveAssistantType;
    public int redPackType;
    public LiveAudienceState senderState;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$GrabRedPackFeed[] _emptyArray;

    public void LiveStreamMessages$GrabRedPackFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$GrabRedPackFeed[] emptyArray(){
       if (LiveStreamMessages$GrabRedPackFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$GrabRedPackFeed._emptyArray == null) {
             LiveStreamMessages$GrabRedPackFeed[] grabRedPackF = new LiveStreamMessages$GrabRedPackFeed[0];
             LiveStreamMessages$GrabRedPackFeed._emptyArray = grabRedPackF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$GrabRedPackFeed._emptyArray;
    }
    public static LiveStreamMessages$GrabRedPackFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$GrabRedPackFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$GrabRedPackFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$GrabRedPackFeed(), p0);
    }
    public LiveStreamMessages$GrabRedPackFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.sortRank = 0;
       this.liveAssistantType = 0;
       this.redPackType = 0;
       this.fromUser = null;
       this.getKsCoin = 0;
       this.senderState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$GrabRedPackFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       tuser = this.time;
       int i1 = 0;
       if (tuser - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuser);
       }
       tuser = this.sortRank;
       if (tuser - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tuser);
       }
       tuser = this.redPackType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuser);
       }
       tuser = this.fromUser;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuser);
       }
       tuser = this.getKsCoin;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(8, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$GrabRedPackFeed mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else if(this.senderState == null){
                                     this.senderState = new LiveAudienceState();
                                  }
                                  p0.readMessage(this.senderState);
                               }else {
                                  this.getKsCoin = p0.readUInt32();
                               }
                            }else if(this.fromUser == null){
                               this.fromUser = new UserInfos$UserInfo();
                            }
                            p0.readMessage(this.fromUser);
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               switch (i){
                                   case 11:
                                   case 13:
                                   case 14:
                                   case 15:
                                   case 16:
                                   case 17:
                                   case 18:
                                   case 19:
                                   case 20:
                                   case 21:
                                   case 22:
                                   case 23:
                                   case 24:
                                   case 25:
                                   case 26:
                                   case 27:
                                   case 28:
                                   case 29:
                                   case 30:
                                   case 31:
                                   case 32:
                                   case '!':
                                   case '"':
                                   case '#':
                                   case '$':
                                   case '%':
                                   case '&':
                                   case 39:
                                   case '(':
                                   case ')':
                                   case '*':
                                   case '+':
                                   case ',':
                                   case '-':
                                   case '.':
                                   case '/':
                                   case '0':
                                   case 12:
                                     break;
                                   default:
                               }
                            }
                            this.redPackType = i;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.liveAssistantType = i;
                         }
                      }
                   }else {
                      this.sortRank = p0.readUInt64();
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else if(this.user == null){
                this.user = new UserInfos$UserInfo();
             }
             p0.readMessage(this.user);
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$GrabRedPackFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       tuser = this.time;
       int i = 0;
       if (tuser - i) {
          p0.writeUInt64(3, tuser);
       }
       tuser = this.sortRank;
       if (tuser - i) {
          p0.writeUInt64(4, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(5, tuser);
       }
       tuser = this.redPackType;
       if (tuser != null) {
          p0.writeInt32(6, tuser);
       }
       tuser = this.fromUser;
       if (tuser != null) {
          p0.writeMessage(7, tuser);
       }
       tuser = this.getKsCoin;
       if (tuser != null) {
          p0.writeUInt32(8, tuser);
       }
       tuser = this.senderState;
       if (tuser != null) {
          p0.writeMessage(9, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
