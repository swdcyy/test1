package com.kuaishou.livestream.message.nano.GzoneAuthorTaskProgressNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class GzoneAuthorTaskProgressNotice extends MessageNano	// class@0010ab
{
    public long displayDurationMs;
    public String noticeText;
    public int noticeType;
    public static GzoneAuthorTaskProgressNotice[] _emptyArray;

    public void GzoneAuthorTaskProgressNotice(){
       super();
       this.clear();
    }
    public static GzoneAuthorTaskProgressNotice[] emptyArray(){
       if (GzoneAuthorTaskProgressNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneAuthorTaskProgressNotice._emptyArray == null) {
             GzoneAuthorTaskProgressNotice[] gzoneAuthorT = new GzoneAuthorTaskProgressNotice[0];
             GzoneAuthorTaskProgressNotice._emptyArray = gzoneAuthorT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneAuthorTaskProgressNotice._emptyArray;
    }
    public static GzoneAuthorTaskProgressNotice parseFrom(CodedInputByteBufferNano p0){
       return new GzoneAuthorTaskProgressNotice().mergeFrom(p0);
    }
    public static GzoneAuthorTaskProgressNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneAuthorTaskProgressNotice(), p0);
    }
    public GzoneAuthorTaskProgressNotice clear(){
       this.noticeType = 0;
       this.noticeText = "";
       this.displayDurationMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneAuthorTaskProgressNotice tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tnoticeType);
       }
       if (!(this.noticeText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.noticeText);
       }
       tnoticeType = this.displayDurationMs;
       if (tnoticeType) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tnoticeType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneAuthorTaskProgressNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.displayDurationMs = p0.readUInt64();
                }
             }else {
                this.noticeText = p0.readString();
             }
          }else {
             this.noticeType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneAuthorTaskProgressNotice tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          p0.writeUInt32(1, tnoticeType);
       }
       if (!(this.noticeText).equals("")) {
          p0.writeString(2, this.noticeText);
       }
       tnoticeType = this.displayDurationMs;
       if (tnoticeType) {
          p0.writeUInt64(3, tnoticeType);
       }
       super.writeTo(p0);
       return;
    }
}
