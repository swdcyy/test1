package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$UserInfoSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamRichTextFeed$UserInfoSegment extends MessageNano	// class@001398
{
    public String color;
    public UserInfos$UserInfo user;
    public static LiveStreamRichTextFeed$UserInfoSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$UserInfoSegment(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$UserInfoSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$UserInfoSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$UserInfoSegment._emptyArray == null) {
             LiveStreamRichTextFeed$UserInfoSegment[] userInfoSegm = new LiveStreamRichTextFeed$UserInfoSegment[0];
             LiveStreamRichTextFeed$UserInfoSegment._emptyArray = userInfoSegm;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$UserInfoSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$UserInfoSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$UserInfoSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$UserInfoSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$UserInfoSegment(), p0);
    }
    public LiveStreamRichTextFeed$UserInfoSegment clear(){
       this.user = null;
       this.color = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamRichTextFeed$UserInfoSegment tuser = this.user;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuser);
       }
       if (!(this.color).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.color);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$UserInfoSegment mergeFrom(CodedInputByteBufferNano p0){
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
             }else {
                this.color = p0.readString();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamRichTextFeed$UserInfoSegment tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       if (!(this.color).equals("")) {
          p0.writeString(2, this.color);
       }
       super.writeTo(p0);
       return;
    }
}
