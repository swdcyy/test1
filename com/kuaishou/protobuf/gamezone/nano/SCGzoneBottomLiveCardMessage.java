package com.kuaishou.protobuf.gamezone.nano.SCGzoneBottomLiveCardMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneBottomLiveCardMessage extends MessageNano	// class@000bd0
{
    public String bizId;
    public boolean checkUserStatus;
    public boolean forcePortrait;
    public String frequencyKey;
    public boolean ignoreLandscape;
    public String krnContent;
    public String krnUrl;
    public int maxCheckDelayMillis;
    public int showDelayMillis;
    public int showDurationMillis;
    public long showExpiredTime;
    public int widgetId;
    public static SCGzoneBottomLiveCardMessage[] _emptyArray;

    public void SCGzoneBottomLiveCardMessage(){
       super();
       this.clear();
    }
    public static SCGzoneBottomLiveCardMessage[] emptyArray(){
       if (SCGzoneBottomLiveCardMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneBottomLiveCardMessage._emptyArray == null) {
             SCGzoneBottomLiveCardMessage[] sCGzoneBotto = new SCGzoneBottomLiveCardMessage[0];
             SCGzoneBottomLiveCardMessage._emptyArray = sCGzoneBotto;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneBottomLiveCardMessage._emptyArray;
    }
    public static SCGzoneBottomLiveCardMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneBottomLiveCardMessage().mergeFrom(p0);
    }
    public static SCGzoneBottomLiveCardMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneBottomLiveCardMessage(), p0);
    }
    public SCGzoneBottomLiveCardMessage clear(){
       this.widgetId = 0;
       this.bizId = "";
       this.checkUserStatus = false;
       this.maxCheckDelayMillis = 0;
       this.frequencyKey = "";
       this.showDelayMillis = 0;
       this.showDurationMillis = 0;
       this.showExpiredTime = 0;
       this.krnUrl = "";
       this.krnContent = "";
       this.ignoreLandscape = false;
       this.forcePortrait = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneBottomLiveCardMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, twidgetId);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bizId);
       }
       twidgetId = this.checkUserStatus;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, twidgetId);
       }
       twidgetId = this.maxCheckDelayMillis;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, twidgetId);
       }
       if (!(this.frequencyKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.frequencyKey);
       }
       twidgetId = this.showDelayMillis;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, twidgetId);
       }
       twidgetId = this.showDurationMillis;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, twidgetId);
       }
       SCGzoneBottomLiveCardMessage tshowExpired = this.showExpiredTime;
       if (tshowExpired) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tshowExpired);
       }
       if (!(this.krnUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.krnUrl);
       }
       if (!(this.krnContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.krnContent);
       }
       twidgetId = this.ignoreLandscape;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, twidgetId);
       }
       twidgetId = this.forcePortrait;
       if (twidgetId != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, twidgetId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneBottomLiveCardMessage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.widgetId = p0.readUInt32();
                break;
              case 18:
                this.bizId = p0.readString();
                break;
              case 24:
                this.checkUserStatus = p0.readBool();
                break;
              case 32:
                this.maxCheckDelayMillis = p0.readUInt32();
                break;
              case '*':
                this.frequencyKey = p0.readString();
                break;
              case '0':
                this.showDelayMillis = p0.readUInt32();
                break;
              case '8':
                this.showDurationMillis = p0.readUInt32();
                break;
              case '@':
                this.showExpiredTime = p0.readUInt64();
                break;
              case 'J':
                this.krnUrl = p0.readString();
                break;
              case 'R':
                this.krnContent = p0.readString();
                break;
              case 'X':
                this.ignoreLandscape = p0.readBool();
                break;
              case '`':
                this.forcePortrait = p0.readBool();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneBottomLiveCardMessage twidgetId = this.widgetId;
       if (twidgetId != null) {
          p0.writeUInt32(1, twidgetId);
       }
       String str = "";
       if (!(this.bizId).equals(str)) {
          p0.writeString(2, this.bizId);
       }
       twidgetId = this.checkUserStatus;
       if (twidgetId != null) {
          p0.writeBool(3, twidgetId);
       }
       twidgetId = this.maxCheckDelayMillis;
       if (twidgetId != null) {
          p0.writeUInt32(4, twidgetId);
       }
       if (!(this.frequencyKey).equals(str)) {
          p0.writeString(5, this.frequencyKey);
       }
       twidgetId = this.showDelayMillis;
       if (twidgetId != null) {
          p0.writeUInt32(6, twidgetId);
       }
       twidgetId = this.showDurationMillis;
       if (twidgetId != null) {
          p0.writeUInt32(7, twidgetId);
       }
       SCGzoneBottomLiveCardMessage tshowExpired = this.showExpiredTime;
       if (tshowExpired) {
          p0.writeUInt64(8, tshowExpired);
       }
       if (!(this.krnUrl).equals(str)) {
          p0.writeString(9, this.krnUrl);
       }
       if (!(this.krnContent).equals(str)) {
          p0.writeString(10, this.krnContent);
       }
       twidgetId = this.ignoreLandscape;
       if (twidgetId != null) {
          p0.writeBool(11, twidgetId);
       }
       twidgetId = this.forcePortrait;
       if (twidgetId != null) {
          p0.writeBool(12, twidgetId);
       }
       super.writeTo(p0);
       return;
    }
}
