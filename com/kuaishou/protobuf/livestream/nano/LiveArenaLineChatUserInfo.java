package com.kuaishou.protobuf.livestream.nano.LiveArenaLineChatUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindowFrameColor;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveArenaLineChatUserInfo extends MessageNano	// class@000c31
{
    public String displayScore;
    public long endTime;
    public InteractiveChatWindowFrameColor frameColor;
    public String orderLabel;
    public int rank;
    public long score;
    public long startTime;
    public int status;
    public long userId;
    public UserInfos$UserInfo userInfo;
    public static LiveArenaLineChatUserInfo[] _emptyArray;

    public void LiveArenaLineChatUserInfo(){
       super();
       this.clear();
    }
    public static LiveArenaLineChatUserInfo[] emptyArray(){
       if (LiveArenaLineChatUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveArenaLineChatUserInfo._emptyArray == null) {
             LiveArenaLineChatUserInfo[] liveArenaLin = new LiveArenaLineChatUserInfo[0];
             LiveArenaLineChatUserInfo._emptyArray = liveArenaLin;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveArenaLineChatUserInfo._emptyArray;
    }
    public static LiveArenaLineChatUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveArenaLineChatUserInfo().mergeFrom(p0);
    }
    public static LiveArenaLineChatUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveArenaLineChatUserInfo(), p0);
    }
    public LiveArenaLineChatUserInfo clear(){
       this.userId = 0;
       this.status = 0;
       this.score = 0;
       this.displayScore = "";
       this.orderLabel = "";
       this.userInfo = null;
       this.startTime = 0;
       this.endTime = 0;
       this.rank = 0;
       this.frameColor = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveArenaLineChatUserInfo tuserId = this.userId;
       int i1 = 0;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tuserId);
       }
       tuserId = this.status;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuserId);
       }
       tuserId = this.score;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       String str = "";
       if (!(this.displayScore).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayScore);
       }
       if (!(this.orderLabel).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.orderLabel);
       }
       tuserId = this.userInfo;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tuserId);
       }
       tuserId = this.startTime;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tuserId);
       }
       tuserId = this.endTime;
       if (tuserId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tuserId);
       }
       tuserId = this.rank;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tuserId);
       }
       tuserId = this.frameColor;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveArenaLineChatUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.userId = p0.readUInt64();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case 24:
                this.score = p0.readUInt64();
                break;
              case '"':
                this.displayScore = p0.readString();
                break;
              case '*':
                this.orderLabel = p0.readString();
                break;
              case '2':
                if (this.userInfo == null) {
                   this.userInfo = new UserInfos$UserInfo();
                }
                p0.readMessage(this.userInfo);
                break;
              case '8':
                this.startTime = p0.readUInt64();
                break;
              case '@':
                this.endTime = p0.readUInt64();
                break;
              case 'H':
                this.rank = p0.readUInt32();
                break;
              case 'R':
                if (this.frameColor == null) {
                   this.frameColor = new InteractiveChatWindowFrameColor();
                }
                p0.readMessage(this.frameColor);
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
       LiveArenaLineChatUserInfo tuserId = this.userId;
       int i = 0;
       if (tuserId - i) {
          p0.writeUInt64(1, tuserId);
       }
       tuserId = this.status;
       if (tuserId != null) {
          p0.writeInt32(2, tuserId);
       }
       tuserId = this.score;
       if (tuserId - i) {
          p0.writeUInt64(3, tuserId);
       }
       String str = "";
       if (!(this.displayScore).equals(str)) {
          p0.writeString(4, this.displayScore);
       }
       if (!(this.orderLabel).equals(str)) {
          p0.writeString(5, this.orderLabel);
       }
       tuserId = this.userInfo;
       if (tuserId != null) {
          p0.writeMessage(6, tuserId);
       }
       tuserId = this.startTime;
       if (tuserId - i) {
          p0.writeUInt64(7, tuserId);
       }
       tuserId = this.endTime;
       if (tuserId - i) {
          p0.writeUInt64(8, tuserId);
       }
       tuserId = this.rank;
       if (tuserId != null) {
          p0.writeUInt32(9, tuserId);
       }
       tuserId = this.frameColor;
       if (tuserId != null) {
          p0.writeMessage(10, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
