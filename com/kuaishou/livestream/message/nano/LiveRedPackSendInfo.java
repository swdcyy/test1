package com.kuaishou.livestream.message.nano.LiveRedPackSendInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveRedPackSendInfo extends MessageNano	// class@001278
{
    public String id;
    public long ksCoin;
    public String liveStreamId;
    public String redPackId;
    public int redPackType;
    public int sendType;
    public UserInfos$UserInfo sendUserInfo;
    public LiveAudienceState sendUserState;
    public static LiveRedPackSendInfo[] _emptyArray;

    public void LiveRedPackSendInfo(){
       super();
       this.clear();
    }
    public static LiveRedPackSendInfo[] emptyArray(){
       if (LiveRedPackSendInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRedPackSendInfo._emptyArray == null) {
             LiveRedPackSendInfo[] liveRedPackS = new LiveRedPackSendInfo[0];
             LiveRedPackSendInfo._emptyArray = liveRedPackS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRedPackSendInfo._emptyArray;
    }
    public static LiveRedPackSendInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRedPackSendInfo().mergeFrom(p0);
    }
    public static LiveRedPackSendInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRedPackSendInfo(), p0);
    }
    public LiveRedPackSendInfo clear(){
       this.liveStreamId = "";
       this.redPackId = "";
       this.redPackType = 0;
       this.ksCoin = 0;
       this.sendUserInfo = null;
       this.sendType = 0;
       this.id = "";
       this.sendUserState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.redPackId);
       }
       LiveRedPackSendInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tredPackType);
       }
       LiveRedPackSendInfo tksCoin = this.ksCoin;
       if (tksCoin) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tksCoin);
       }
       tredPackType = this.sendUserInfo;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tredPackType);
       }
       tredPackType = this.sendType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tredPackType);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.id);
       }
       tredPackType = this.sendUserState;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tredPackType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRedPackSendInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else if(this.sendUserState == null){
                                  this.sendUserState = new LiveAudienceState();
                               }
                               p0.readMessage(this.sendUserState);
                            }else {
                               this.id = p0.readString();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.sendType = i;
                            }
                         }
                      }else if(this.sendUserInfo == null){
                         this.sendUserInfo = new UserInfos$UserInfo();
                      }
                      p0.readMessage(this.sendUserInfo);
                   }else {
                      this.ksCoin = p0.readUInt64();
                   }
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
                this.redPackId = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(2, this.redPackId);
       }
       LiveRedPackSendInfo tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(3, tredPackType);
       }
       LiveRedPackSendInfo tksCoin = this.ksCoin;
       if (tksCoin) {
          p0.writeUInt64(4, tksCoin);
       }
       tredPackType = this.sendUserInfo;
       if (tredPackType != null) {
          p0.writeMessage(5, tredPackType);
       }
       tredPackType = this.sendType;
       if (tredPackType != null) {
          p0.writeInt32(6, tredPackType);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(7, this.id);
       }
       tredPackType = this.sendUserState;
       if (tredPackType != null) {
          p0.writeMessage(8, tredPackType);
       }
       super.writeTo(p0);
       return;
    }
}
