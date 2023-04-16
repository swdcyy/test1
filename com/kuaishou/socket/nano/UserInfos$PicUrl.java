package com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class UserInfos$PicUrl extends MessageNano	// class@000f53
{
    public String cdn;
    public String ip;
    public String url;
    public String urlPattern;
    public static UserInfos$PicUrl[] _emptyArray;

    public void UserInfos$PicUrl(){
       super();
       this.clear();
    }
    public static UserInfos$PicUrl[] emptyArray(){
       if (UserInfos$PicUrl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (UserInfos$PicUrl._emptyArray == null) {
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[0];
             UserInfos$PicUrl._emptyArray = picUrlArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return UserInfos$PicUrl._emptyArray;
    }
    public static UserInfos$PicUrl parseFrom(CodedInputByteBufferNano p0){
       return new UserInfos$PicUrl().mergeFrom(p0);
    }
    public static UserInfos$PicUrl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new UserInfos$PicUrl(), p0);
    }
    public UserInfos$PicUrl clear(){
       this.cdn = "";
       this.url = "";
       this.urlPattern = "";
       this.ip = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cdn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       if (!(this.urlPattern).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.urlPattern);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.ip);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public UserInfos$PicUrl mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.ip = p0.readString();
                   }
                }else {
                   this.urlPattern = p0.readString();
                }
             }else {
                this.url = p0.readString();
             }
          }else {
             this.cdn = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.cdn).equals(str)) {
          p0.writeString(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       if (!(this.urlPattern).equals(str)) {
          p0.writeString(3, this.urlPattern);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(4, this.ip);
       }
       super.writeTo(p0);
       return;
    }
}
