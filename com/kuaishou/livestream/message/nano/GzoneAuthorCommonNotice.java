package com.kuaishou.livestream.message.nano.GzoneAuthorCommonNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.GzoneCommonNoticeButton;

public final class GzoneAuthorCommonNotice extends MessageNano	// class@0010aa
{
    public GzoneCommonNoticeButton button;
    public String content;
    public long displayDurationMs;
    public String extraInfo;
    public int type;
    public static GzoneAuthorCommonNotice[] _emptyArray;

    public void GzoneAuthorCommonNotice(){
       super();
       this.clear();
    }
    public static GzoneAuthorCommonNotice[] emptyArray(){
       if (GzoneAuthorCommonNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneAuthorCommonNotice._emptyArray == null) {
             GzoneAuthorCommonNotice[] gzoneAuthorC = new GzoneAuthorCommonNotice[0];
             GzoneAuthorCommonNotice._emptyArray = gzoneAuthorC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneAuthorCommonNotice._emptyArray;
    }
    public static GzoneAuthorCommonNotice parseFrom(CodedInputByteBufferNano p0){
       return new GzoneAuthorCommonNotice().mergeFrom(p0);
    }
    public static GzoneAuthorCommonNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneAuthorCommonNotice(), p0);
    }
    public GzoneAuthorCommonNotice clear(){
       this.type = 0;
       this.content = "";
       this.button = null;
       this.displayDurationMs = 0;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneAuthorCommonNotice ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       ttype = this.button;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       GzoneAuthorCommonNotice tdisplayDura = this.displayDurationMs;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tdisplayDura);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneAuthorCommonNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.extraInfo = p0.readString();
                      }
                   }else {
                      this.displayDurationMs = p0.readUInt64();
                   }
                }else if(this.button == null){
                   this.button = new GzoneCommonNoticeButton();
                }
                p0.readMessage(this.button);
             }else {
                this.content = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneAuthorCommonNotice ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       ttype = this.button;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       GzoneAuthorCommonNotice tdisplayDura = this.displayDurationMs;
       if (tdisplayDura) {
          p0.writeUInt64(4, tdisplayDura);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(5, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
