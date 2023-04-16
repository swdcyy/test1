package com.kuaishou.livestream.message.nano.LiveVoiceCommentConfigProto$SCVoiceCommentConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveVoiceCommentConfigProto$SCVoiceCommentConfig extends MessageNano	// class@0013c2
{
    public boolean bgmOpened;
    public int closeType;
    public boolean enableVoiceComment;
    public long time;
    public static LiveVoiceCommentConfigProto$SCVoiceCommentConfig[] _emptyArray;

    public void LiveVoiceCommentConfigProto$SCVoiceCommentConfig(){
       super();
       this.clear();
    }
    public static LiveVoiceCommentConfigProto$SCVoiceCommentConfig[] emptyArray(){
       if (LiveVoiceCommentConfigProto$SCVoiceCommentConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveVoiceCommentConfigProto$SCVoiceCommentConfig._emptyArray == null) {
             LiveVoiceCommentConfigProto$SCVoiceCommentConfig[] sCVoiceComme = new LiveVoiceCommentConfigProto$SCVoiceCommentConfig[0];
             LiveVoiceCommentConfigProto$SCVoiceCommentConfig._emptyArray = sCVoiceComme;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveVoiceCommentConfigProto$SCVoiceCommentConfig._emptyArray;
    }
    public static LiveVoiceCommentConfigProto$SCVoiceCommentConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveVoiceCommentConfigProto$SCVoiceCommentConfig().mergeFrom(p0);
    }
    public static LiveVoiceCommentConfigProto$SCVoiceCommentConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveVoiceCommentConfigProto$SCVoiceCommentConfig(), p0);
    }
    public LiveVoiceCommentConfigProto$SCVoiceCommentConfig clear(){
       this.enableVoiceComment = false;
       this.bgmOpened = false;
       this.time = 0;
       this.closeType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveVoiceCommentConfigProto$SCVoiceCommentConfig tenableVoice = this.enableVoiceComment;
       if (tenableVoice != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableVoice);
       }
       tenableVoice = this.bgmOpened;
       if (tenableVoice != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tenableVoice);
       }
       tenableVoice = this.time;
       if (tenableVoice) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tenableVoice);
       }
       tenableVoice = this.closeType;
       if (tenableVoice != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tenableVoice);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveVoiceCommentConfigProto$SCVoiceCommentConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.closeType = i;
                      }
                   }
                }else {
                   this.time = p0.readUInt64();
                }
             }else {
                this.bgmOpened = p0.readBool();
             }
          }else {
             this.enableVoiceComment = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveVoiceCommentConfigProto$SCVoiceCommentConfig tenableVoice = this.enableVoiceComment;
       if (tenableVoice != null) {
          p0.writeBool(1, tenableVoice);
       }
       tenableVoice = this.bgmOpened;
       if (tenableVoice != null) {
          p0.writeBool(2, tenableVoice);
       }
       tenableVoice = this.time;
       if (tenableVoice) {
          p0.writeUInt64(3, tenableVoice);
       }
       tenableVoice = this.closeType;
       if (tenableVoice != null) {
          p0.writeInt32(4, tenableVoice);
       }
       super.writeTo(p0);
       return;
    }
}
