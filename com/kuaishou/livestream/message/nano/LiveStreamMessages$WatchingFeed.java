package com.kuaishou.livestream.message.nano.LiveStreamMessages$WatchingFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$WatchingFeed extends MessageNano	// class@00138c
{
    public String id;
    public boolean isAnonymous;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public static LiveStreamMessages$WatchingFeed[] _emptyArray;

    public void LiveStreamMessages$WatchingFeed(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$WatchingFeed[] emptyArray(){
       if (LiveStreamMessages$WatchingFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$WatchingFeed._emptyArray == null) {
             LiveStreamMessages$WatchingFeed[] watchingFeed = new LiveStreamMessages$WatchingFeed[0];
             LiveStreamMessages$WatchingFeed._emptyArray = watchingFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$WatchingFeed._emptyArray;
    }
    public static LiveStreamMessages$WatchingFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$WatchingFeed().mergeFrom(p0);
    }
    public static LiveStreamMessages$WatchingFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$WatchingFeed(), p0);
    }
    public LiveStreamMessages$WatchingFeed clear(){
       this.id = "";
       this.user = null;
       this.time = 0;
       this.sortRank = 0;
       this.isAnonymous = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       LiveStreamMessages$WatchingFeed tuser = this.user;
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
       tuser = this.isAnonymous;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$WatchingFeed mergeFrom(CodedInputByteBufferNano p0){
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
                         this.isAnonymous = p0.readBool();
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
       LiveStreamMessages$WatchingFeed tuser = this.user;
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
       tuser = this.isAnonymous;
       if (tuser != null) {
          p0.writeBool(5, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
