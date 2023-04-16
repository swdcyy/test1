package com.kuaishou.livestream.message.nano.LiveGzoneCommonMessage$GzoneCommonNotificationMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveGzoneCommonMessage$GzoneCommonNotificationMessage extends MessageNano	// class@0011c1
{
    public int bizType;
    public String content;
    public String extra;
    public String liveStreamId;
    public int type;
    public static LiveGzoneCommonMessage$GzoneCommonNotificationMessage[] _emptyArray;

    public void LiveGzoneCommonMessage$GzoneCommonNotificationMessage(){
       super();
       this.clear();
    }
    public static LiveGzoneCommonMessage$GzoneCommonNotificationMessage[] emptyArray(){
       if (LiveGzoneCommonMessage$GzoneCommonNotificationMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGzoneCommonMessage$GzoneCommonNotificationMessage._emptyArray == null) {
             LiveGzoneCommonMessage$GzoneCommonNotificationMessage[] gzoneCommonN = new LiveGzoneCommonMessage$GzoneCommonNotificationMessage[0];
             LiveGzoneCommonMessage$GzoneCommonNotificationMessage._emptyArray = gzoneCommonN;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGzoneCommonMessage$GzoneCommonNotificationMessage._emptyArray;
    }
    public static LiveGzoneCommonMessage$GzoneCommonNotificationMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveGzoneCommonMessage$GzoneCommonNotificationMessage().mergeFrom(p0);
    }
    public static LiveGzoneCommonMessage$GzoneCommonNotificationMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGzoneCommonMessage$GzoneCommonNotificationMessage(), p0);
    }
    public LiveGzoneCommonMessage$GzoneCommonNotificationMessage clear(){
       this.type = 0;
       this.bizType = 0;
       this.liveStreamId = "";
       this.content = "";
       this.extra = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveGzoneCommonMessage$GzoneCommonNotificationMessage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, ttype);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.content);
       }
       if (!(this.extra).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extra);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGzoneCommonMessage$GzoneCommonNotificationMessage mergeFrom(CodedInputByteBufferNano p0){
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
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.extra = p0.readString();
                      }
                   }else {
                      this.content = p0.readString();
                   }
                }else {
                   this.liveStreamId = p0.readString();
                }
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
       LiveGzoneCommonMessage$GzoneCommonNotificationMessage ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(1, ttype);
       }
       ttype = this.bizType;
       if (ttype != null) {
          p0.writeUInt32(2, ttype);
       }
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(4, this.content);
       }
       if (!(this.extra).equals(str)) {
          p0.writeString(5, this.extra);
       }
       super.writeTo(p0);
       return;
    }
}
