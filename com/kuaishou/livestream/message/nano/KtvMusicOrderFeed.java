package com.kuaishou.livestream.message.nano.KtvMusicOrderFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class KtvMusicOrderFeed extends MessageNano	// class@0010bc
{
    public String deviceHash;
    public String id;
    public String musicName;
    public long sortRank;
    public long time;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public static KtvMusicOrderFeed[] _emptyArray;

    public void KtvMusicOrderFeed(){
       super();
       this.clear();
    }
    public static KtvMusicOrderFeed[] emptyArray(){
       if (KtvMusicOrderFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (KtvMusicOrderFeed._emptyArray == null) {
             KtvMusicOrderFeed[] ktvMusicOrde = new KtvMusicOrderFeed[0];
             KtvMusicOrderFeed._emptyArray = ktvMusicOrde;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return KtvMusicOrderFeed._emptyArray;
    }
    public static KtvMusicOrderFeed parseFrom(CodedInputByteBufferNano p0){
       return new KtvMusicOrderFeed().mergeFrom(p0);
    }
    public static KtvMusicOrderFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new KtvMusicOrderFeed(), p0);
    }
    public KtvMusicOrderFeed clear(){
       this.id = "";
       this.user = null;
       this.deviceHash = "";
       this.userState = null;
       this.musicName = "";
       this.sortRank = 0;
       this.time = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       KtvMusicOrderFeed tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.deviceHash);
       }
       tuser = this.userState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tuser);
       }
       if (!(this.musicName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.musicName);
       }
       tuser = this.sortRank;
       int i1 = 0;
       if (tuser - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tuser);
       }
       tuser = this.time;
       if (tuser - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public KtvMusicOrderFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.time = p0.readUInt64();
                            }
                         }else {
                            this.sortRank = p0.readUInt64();
                         }
                      }else {
                         this.musicName = p0.readString();
                      }
                   }else if(this.userState == null){
                      this.userState = new LiveAudienceState();
                   }
                   p0.readMessage(this.userState);
                }else {
                   this.deviceHash = p0.readString();
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
       KtvMusicOrderFeed tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(2, tuser);
       }
       if (!(this.deviceHash).equals(str)) {
          p0.writeString(3, this.deviceHash);
       }
       tuser = this.userState;
       if (tuser != null) {
          p0.writeMessage(4, tuser);
       }
       if (!(this.musicName).equals(str)) {
          p0.writeString(5, this.musicName);
       }
       tuser = this.sortRank;
       int i = 0;
       if (tuser - i) {
          p0.writeUInt64(6, tuser);
       }
       tuser = this.time;
       if (tuser - i) {
          p0.writeUInt64(7, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
