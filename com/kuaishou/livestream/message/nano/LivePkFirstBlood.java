package com.kuaishou.livestream.message.nano.LivePkFirstBlood;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LivePkFirstBlood extends MessageNano	// class@00120f
{
    public UserInfos$UserInfo firstBloodUser;
    public String pkId;
    public static LivePkFirstBlood[] _emptyArray;

    public void LivePkFirstBlood(){
       super();
       this.clear();
    }
    public static LivePkFirstBlood[] emptyArray(){
       if (LivePkFirstBlood._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkFirstBlood._emptyArray == null) {
             LivePkFirstBlood[] livePkFirstB = new LivePkFirstBlood[0];
             LivePkFirstBlood._emptyArray = livePkFirstB;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkFirstBlood._emptyArray;
    }
    public static LivePkFirstBlood parseFrom(CodedInputByteBufferNano p0){
       return new LivePkFirstBlood().mergeFrom(p0);
    }
    public static LivePkFirstBlood parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkFirstBlood(), p0);
    }
    public LivePkFirstBlood clear(){
       this.pkId = "";
       this.firstBloodUser = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       LivePkFirstBlood tfirstBloodU = this.firstBloodUser;
       if (tfirstBloodU != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tfirstBloodU);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkFirstBlood mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else if(this.firstBloodUser == null){
                this.firstBloodUser = new UserInfos$UserInfo();
             }
             p0.readMessage(this.firstBloodUser);
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       LivePkFirstBlood tfirstBloodU = this.firstBloodUser;
       if (tfirstBloodU != null) {
          p0.writeMessage(2, tfirstBloodU);
       }
       super.writeTo(p0);
       return;
    }
}
