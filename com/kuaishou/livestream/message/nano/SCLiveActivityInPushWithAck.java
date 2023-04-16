package com.kuaishou.livestream.message.nano.SCLiveActivityInPushWithAck;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveActivityInPushWithAck extends MessageNano	// class@0013fd
{
    public String ackUri;
    public long biz;
    public String body;
    public String buttonText;
    public String buttonUri;
    public String iconUri;
    public String liveStreamId;
    public String messageId;
    public String title;
    public static SCLiveActivityInPushWithAck[] _emptyArray;

    public void SCLiveActivityInPushWithAck(){
       super();
       this.clear();
    }
    public static SCLiveActivityInPushWithAck[] emptyArray(){
       if (SCLiveActivityInPushWithAck._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveActivityInPushWithAck._emptyArray == null) {
             SCLiveActivityInPushWithAck[] sCLiveActivi = new SCLiveActivityInPushWithAck[0];
             SCLiveActivityInPushWithAck._emptyArray = sCLiveActivi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveActivityInPushWithAck._emptyArray;
    }
    public static SCLiveActivityInPushWithAck parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveActivityInPushWithAck().mergeFrom(p0);
    }
    public static SCLiveActivityInPushWithAck parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveActivityInPushWithAck(), p0);
    }
    public SCLiveActivityInPushWithAck clear(){
       this.messageId = "";
       this.liveStreamId = "";
       this.biz = 0;
       this.title = "";
       this.body = "";
       this.iconUri = "";
       this.buttonText = "";
       this.buttonUri = "";
       this.ackUri = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.messageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.messageId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       SCLiveActivityInPushWithAck tbiz = this.biz;
       if (tbiz) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tbiz);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.title);
       }
       if (!(this.body).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.body);
       }
       if (!(this.iconUri).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.iconUri);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.buttonText);
       }
       if (!(this.buttonUri).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.buttonUri);
       }
       if (!(this.ackUri).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.ackUri);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveActivityInPushWithAck mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.ackUri = p0.readString();
                                  }
                               }else {
                                  this.buttonUri = p0.readString();
                               }
                            }else {
                               this.buttonText = p0.readString();
                            }
                         }else {
                            this.iconUri = p0.readString();
                         }
                      }else {
                         this.body = p0.readString();
                      }
                   }else {
                      this.title = p0.readString();
                   }
                }else {
                   this.biz = p0.readUInt64();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.messageId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.messageId).equals(str)) {
          p0.writeString(1, this.messageId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       SCLiveActivityInPushWithAck tbiz = this.biz;
       if (tbiz) {
          p0.writeUInt64(3, tbiz);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(4, this.title);
       }
       if (!(this.body).equals(str)) {
          p0.writeString(5, this.body);
       }
       if (!(this.iconUri).equals(str)) {
          p0.writeString(6, this.iconUri);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(7, this.buttonText);
       }
       if (!(this.buttonUri).equals(str)) {
          p0.writeString(8, this.buttonUri);
       }
       if (!(this.ackUri).equals(str)) {
          p0.writeString(9, this.ackUri);
       }
       super.writeTo(p0);
       return;
    }
}
