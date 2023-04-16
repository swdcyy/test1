package com.kuaishou.livestream.message.nano.LiveStreamWebMessages$SimpleUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamWebMessages$SimpleUserInfo extends MessageNano	// class@00139a
{
    public String headUrl;
    public String principalId;
    public String userName;
    public static LiveStreamWebMessages$SimpleUserInfo[] _emptyArray;

    public void LiveStreamWebMessages$SimpleUserInfo(){
       super();
       this.clear();
    }
    public static LiveStreamWebMessages$SimpleUserInfo[] emptyArray(){
       if (LiveStreamWebMessages$SimpleUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamWebMessages$SimpleUserInfo._emptyArray == null) {
             LiveStreamWebMessages$SimpleUserInfo[] simpleUserIn = new LiveStreamWebMessages$SimpleUserInfo[0];
             LiveStreamWebMessages$SimpleUserInfo._emptyArray = simpleUserIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamWebMessages$SimpleUserInfo._emptyArray;
    }
    public static LiveStreamWebMessages$SimpleUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamWebMessages$SimpleUserInfo().mergeFrom(p0);
    }
    public static LiveStreamWebMessages$SimpleUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamWebMessages$SimpleUserInfo(), p0);
    }
    public LiveStreamWebMessages$SimpleUserInfo clear(){
       this.principalId = "";
       this.userName = "";
       this.headUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.principalId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.principalId);
       }
       if (!(this.userName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.userName);
       }
       if (!(this.headUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.headUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamWebMessages$SimpleUserInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.headUrl = p0.readString();
                }
             }else {
                this.userName = p0.readString();
             }
          }else {
             this.principalId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.principalId).equals(str)) {
          p0.writeString(1, this.principalId);
       }
       if (!(this.userName).equals(str)) {
          p0.writeString(2, this.userName);
       }
       if (!(this.headUrl).equals(str)) {
          p0.writeString(3, this.headUrl);
       }
       super.writeTo(p0);
       return;
    }
}
