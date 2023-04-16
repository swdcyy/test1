package com.kuaishou.livestream.message.nano.LiveStreamMessages$SystemNoticeFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$SystemNoticeFeed extends MessageNano	// class@001380
{
    public String content;
    public long displayDuration;
    public int displayType;
    public String id;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$SystemNoticeFeed[] _emptyArray;

    public void LiveStreamMessages$SystemNoticeFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SystemNoticeFeed[] emptyArray(){
       if (LiveStreamMessages$SystemNoticeFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SystemNoticeFeed._emptyArray == null) {
             LiveStreamMessages$SystemNoticeFeed[] systemNotice = new LiveStreamMessages$SystemNoticeFeed[0];
             LiveStreamMessages$SystemNoticeFeed._emptyArray = systemNotice;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SystemNoticeFeed._emptyArray;
    }
    public static LiveStreamMessages$SystemNoticeFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SystemNoticeFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$SystemNoticeFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SystemNoticeFeed(), p0);
    }
    public LiveStreamMessages$SystemNoticeFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.content = "";
       this.displayDuration = 0;
       this.sortRank = 0;
       this.displayType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$SystemNoticeFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       LiveStreamMessages$SystemNoticeFeed ttime = this.time;
       if (ttime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttime);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.content);
       }
       tuser = this.displayDuration;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tuser);
       }
       tuser = this.sortRank;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tuser);
       }
       tuser = this.displayType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SystemNoticeFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && (i != 2 && i != 3))) {
                                  continue ;
                               }else {
                                  this.displayType = i;
                               }
                            }
                         }else {
                            this.sortRank = p0.readUInt64();
                         }
                      }else {
                         this.displayDuration = p0.readUInt64();
                      }
                   }else {
                      this.content = p0.readString();
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
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       LiveStreamMessages$SystemNoticeFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       LiveStreamMessages$SystemNoticeFeed ttime = this.time;
       if (ttime) {
          p0.writeUInt64(3, ttime);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(4, this.content);
       }
       tuser = this.displayDuration;
       if (tuser) {
          p0.writeUInt64(5, tuser);
       }
       tuser = this.sortRank;
       if (tuser) {
          p0.writeUInt64(6, tuser);
       }
       tuser = this.displayType;
       if (tuser != null) {
          p0.writeInt32(7, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
