package com.kuaishou.livestream.message.nano.FansGroupJoinFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class FansGroupJoinFeed extends MessageNano	// class@0010a7
{
    public String deviceHash;
    public String id;
    public int joinSource;
    public long time;
    public UserInfos$UserInfo user;
    public LiveAudienceState userState;
    public static FansGroupJoinFeed[] _emptyArray;

    public void FansGroupJoinFeed(){
       super();
       this.clear();
    }
    public static FansGroupJoinFeed[] emptyArray(){
       if (FansGroupJoinFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (FansGroupJoinFeed._emptyArray == null) {
             FansGroupJoinFeed[] uFansGroupJo = new FansGroupJoinFeed[0];
             FansGroupJoinFeed._emptyArray = uFansGroupJo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return FansGroupJoinFeed._emptyArray;
    }
    public static FansGroupJoinFeed parseFrom(CodedInputByteBufferNano p0){
       return new FansGroupJoinFeed().mergeFrom(p0);
    }
    public static FansGroupJoinFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new FansGroupJoinFeed(), p0);
    }
    public FansGroupJoinFeed clear(){
       this.id = "";
       this.user = null;
       this.deviceHash = "";
       this.userState = null;
       this.time = 0;
       this.joinSource = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       FansGroupJoinFeed tuser = this.user;
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
       tuser = this.time;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tuser);
       }
       tuser = this.joinSource;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public FansGroupJoinFeed mergeFrom(CodedInputByteBufferNano p0){
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
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.joinSource = i;
                            }
                         }
                      }else {
                         this.time = p0.readUInt64();
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
       FansGroupJoinFeed tuser = this.user;
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
       tuser = this.time;
       if (tuser) {
          p0.writeUInt64(5, tuser);
       }
       tuser = this.joinSource;
       if (tuser != null) {
          p0.writeInt32(6, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
