package com.kuaishou.livestream.message.nano.SCLiveStickerWarningInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveStickerWarningInfo extends MessageNano	// class@001446
{
    public String content;
    public String liveStreamId;
    public String title;
    public static SCLiveStickerWarningInfo[] _emptyArray;

    public void SCLiveStickerWarningInfo(){
       super();
       this.clear();
    }
    public static SCLiveStickerWarningInfo[] emptyArray(){
       if (SCLiveStickerWarningInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveStickerWarningInfo._emptyArray == null) {
             SCLiveStickerWarningInfo[] sCLiveSticke = new SCLiveStickerWarningInfo[0];
             SCLiveStickerWarningInfo._emptyArray = sCLiveSticke;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveStickerWarningInfo._emptyArray;
    }
    public static SCLiveStickerWarningInfo parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveStickerWarningInfo().mergeFrom(p0);
    }
    public static SCLiveStickerWarningInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveStickerWarningInfo(), p0);
    }
    public SCLiveStickerWarningInfo clear(){
       this.title = "";
       this.content = "";
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.title);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveStickerWarningInfo mergeFrom(CodedInputByteBufferNano p0){
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
                   this.liveStreamId = p0.readString();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(1, this.title);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(3, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
