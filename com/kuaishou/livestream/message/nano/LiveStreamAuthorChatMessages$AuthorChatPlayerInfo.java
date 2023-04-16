package com.kuaishou.livestream.message.nano.LiveStreamAuthorChatMessages$AuthorChatPlayerInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.Double;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamAuthorChatMessages$AuthorChatPlayerInfo extends MessageNano	// class@0012b8
{
    public String displayDistance;
    public double distance;
    public String liveStreamId;
    public UserInfos$UserInfo player;
    public static LiveStreamAuthorChatMessages$AuthorChatPlayerInfo[] _emptyArray;

    public void LiveStreamAuthorChatMessages$AuthorChatPlayerInfo(){
       super();
       this.clear();
    }
    public static LiveStreamAuthorChatMessages$AuthorChatPlayerInfo[] emptyArray(){
       if (LiveStreamAuthorChatMessages$AuthorChatPlayerInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamAuthorChatMessages$AuthorChatPlayerInfo._emptyArray == null) {
             LiveStreamAuthorChatMessages$AuthorChatPlayerInfo[] uAuthorChatP = new LiveStreamAuthorChatMessages$AuthorChatPlayerInfo[0];
             LiveStreamAuthorChatMessages$AuthorChatPlayerInfo._emptyArray = uAuthorChatP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamAuthorChatMessages$AuthorChatPlayerInfo._emptyArray;
    }
    public static LiveStreamAuthorChatMessages$AuthorChatPlayerInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamAuthorChatMessages$AuthorChatPlayerInfo().mergeFrom(p0);
    }
    public static LiveStreamAuthorChatMessages$AuthorChatPlayerInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamAuthorChatMessages$AuthorChatPlayerInfo(), p0);
    }
    public LiveStreamAuthorChatMessages$AuthorChatPlayerInfo clear(){
       this.player = null;
       this.liveStreamId = "";
       this.distance = 0;
       this.displayDistance = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamAuthorChatMessages$AuthorChatPlayerInfo tplayer = this.player;
       if (tplayer != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       if (Double.doubleToLongBits(this.distance) - Double.doubleToLongBits(0)) {
          i = i + CodedOutputByteBufferNano.computeDoubleSize(3, this.distance);
       }
       if (!(this.displayDistance).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayDistance);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamAuthorChatMessages$AuthorChatPlayerInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 25) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.displayDistance = p0.readString();
                   }
                }else {
                   this.distance = p0.readDouble();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else if(this.player == null){
             this.player = new UserInfos$UserInfo();
          }
          p0.readMessage(this.player);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamAuthorChatMessages$AuthorChatPlayerInfo tplayer = this.player;
       if (tplayer != null) {
          p0.writeMessage(1, tplayer);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       if (Double.doubleToLongBits(this.distance) - Double.doubleToLongBits(0)) {
          p0.writeDouble(3, this.distance);
       }
       if (!(this.displayDistance).equals(str)) {
          p0.writeString(4, this.displayDistance);
       }
       super.writeTo(p0);
       return;
    }
}
