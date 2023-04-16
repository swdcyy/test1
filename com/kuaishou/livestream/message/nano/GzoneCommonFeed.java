package com.kuaishou.livestream.message.nano.GzoneCommonFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.GzoneCommonFeed$CommentFeedButton;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class GzoneCommonFeed extends MessageNano	// class@0010ae
{
    public int bizType;
    public GzoneCommonFeed$CommentFeedButton button;
    public String content;
    public String extra;
    public String id;
    public LiveAudienceState senderState;
    public int type;
    public UserInfos$UserInfo user;
    public static GzoneCommonFeed[] _emptyArray;

    public void GzoneCommonFeed(){
       super();
       this.clear();
    }
    public static GzoneCommonFeed[] emptyArray(){
       if (GzoneCommonFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneCommonFeed._emptyArray == null) {
             GzoneCommonFeed[] gzoneCommonF = new GzoneCommonFeed[0];
             GzoneCommonFeed._emptyArray = gzoneCommonF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneCommonFeed._emptyArray;
    }
    public static GzoneCommonFeed parseFrom(CodedInputByteBufferNano p0){
       return new GzoneCommonFeed().mergeFrom(p0);
    }
    public static GzoneCommonFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneCommonFeed(), p0);
    }
    public GzoneCommonFeed clear(){
       this.type = 0;
       this.bizType = 0;
       this.user = null;
       this.senderState = null;
       this.button = null;
       this.content = "";
       this.extra = "";
       this.id = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneCommonFeed ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttype);
       }
       ttype = this.user;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       ttype = this.senderState;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, ttype);
       }
       ttype = this.button;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, ttype);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.content);
       }
       if (!(this.extra).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.extra);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneCommonFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.id = p0.readString();
                               }
                            }else {
                               this.extra = p0.readString();
                            }
                         }else {
                            this.content = p0.readString();
                         }
                      }else if(this.button == null){
                         this.button = new GzoneCommonFeed$CommentFeedButton();
                      }
                      p0.readMessage(this.button);
                   }else if(this.senderState == null){
                      this.senderState = new LiveAudienceState();
                   }
                   p0.readMessage(this.senderState);
                }else if(this.user == null){
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
             }else {
                this.bizType = p0.readUInt32();
             }
          }else {
             this.type = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneCommonFeed ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          p0.writeUInt32(2, ttype);
       }
       ttype = this.user;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       ttype = this.senderState;
       if (ttype != null) {
          p0.writeMessage(4, ttype);
       }
       ttype = this.button;
       if (ttype != null) {
          p0.writeMessage(5, ttype);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(6, this.content);
       }
       if (!(this.extra).equals(str)) {
          p0.writeString(7, this.extra);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(8, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
