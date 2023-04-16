package com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveBsStateMessages$SCLiveCurrentBsState$Button;

public final class LiveBsStateMessages$SCLiveCurrentBsState extends MessageNano	// class@00112f
{
    public String actionUrl;
    public LiveBsStateMessages$SCLiveCurrentBsState$Button activeButton;
    public long appId;
    public String bizType;
    public String exposureId;
    public int floatLiveType;
    public String formId;
    public String ksOrderId;
    public int openFloatLive;
    public String statisticsInfo;
    public int supportType;
    public String tunaDownloadPackageName;
    public String tunaDownloadUrl;
    public static LiveBsStateMessages$SCLiveCurrentBsState[] _emptyArray;

    public void LiveBsStateMessages$SCLiveCurrentBsState(){
       super();
       this.clear();
    }
    public static LiveBsStateMessages$SCLiveCurrentBsState[] emptyArray(){
       if (LiveBsStateMessages$SCLiveCurrentBsState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBsStateMessages$SCLiveCurrentBsState._emptyArray == null) {
             LiveBsStateMessages$SCLiveCurrentBsState[] sCLiveCurren = new LiveBsStateMessages$SCLiveCurrentBsState[0];
             LiveBsStateMessages$SCLiveCurrentBsState._emptyArray = sCLiveCurren;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBsStateMessages$SCLiveCurrentBsState._emptyArray;
    }
    public static LiveBsStateMessages$SCLiveCurrentBsState parseFrom(CodedInputByteBufferNano p0){
       return new LiveBsStateMessages$SCLiveCurrentBsState().mergeFrom(p0);
    }
    public static LiveBsStateMessages$SCLiveCurrentBsState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBsStateMessages$SCLiveCurrentBsState(), p0);
    }
    public LiveBsStateMessages$SCLiveCurrentBsState clear(){
       this.activeButton = null;
       this.formId = "";
       this.ksOrderId = "";
       this.tunaDownloadUrl = "";
       this.tunaDownloadPackageName = "";
       this.appId = 0;
       this.actionUrl = "";
       this.supportType = 0;
       this.openFloatLive = 0;
       this.statisticsInfo = "";
       this.floatLiveType = 0;
       this.bizType = "";
       this.exposureId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBsStateMessages$SCLiveCurrentBsState tactiveButto = this.activeButton;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tactiveButto);
       }
       String str = "";
       if (!(this.formId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.formId);
       }
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ksOrderId);
       }
       if (!(this.tunaDownloadUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.tunaDownloadUrl);
       }
       if (!(this.tunaDownloadPackageName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.tunaDownloadPackageName);
       }
       LiveBsStateMessages$SCLiveCurrentBsState tappId = this.appId;
       if (tappId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tappId);
       }
       if (!(this.actionUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.actionUrl);
       }
       tactiveButto = this.supportType;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, tactiveButto);
       }
       tactiveButto = this.openFloatLive;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tactiveButto);
       }
       if (!(this.statisticsInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.statisticsInfo);
       }
       tactiveButto = this.floatLiveType;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tactiveButto);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.bizType);
       }
       if (!(this.exposureId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(14, this.exposureId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBsStateMessages$SCLiveCurrentBsState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.activeButton == null) {
                   this.activeButton = new LiveBsStateMessages$SCLiveCurrentBsState$Button();
                }
                p0.readMessage(this.activeButton);
                break;
              case 18:
                this.formId = p0.readString();
                break;
              case 26:
                this.ksOrderId = p0.readString();
                break;
              case '"':
                this.tunaDownloadUrl = p0.readString();
                break;
              case '*':
                this.tunaDownloadPackageName = p0.readString();
                break;
              case '0':
                this.appId = p0.readUInt64();
                break;
              case ':':
                this.actionUrl = p0.readString();
                break;
              case 'H':
                i = p0.readInt32();
                if (i && (i != i1 && i != 2)) {
                   continue ;
                }else {
                   this.supportType = i;
                }
                break;
              case 'P':
                this.openFloatLive = p0.readUInt32();
                break;
              case 'Z':
                this.statisticsInfo = p0.readString();
                break;
              case '`':
                i = p0.readInt32();
                if (i && i != i1) {
                   continue ;
                }else {
                   this.floatLiveType = i;
                }
                break;
              case 'j':
                this.bizType = p0.readString();
                break;
              case 'r':
                this.exposureId = p0.readString();
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
       LiveBsStateMessages$SCLiveCurrentBsState tactiveButto = this.activeButton;
       if (tactiveButto != null) {
          p0.writeMessage(1, tactiveButto);
       }
       String str = "";
       if (!(this.formId).equals(str)) {
          p0.writeString(2, this.formId);
       }
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(3, this.ksOrderId);
       }
       if (!(this.tunaDownloadUrl).equals(str)) {
          p0.writeString(4, this.tunaDownloadUrl);
       }
       if (!(this.tunaDownloadPackageName).equals(str)) {
          p0.writeString(5, this.tunaDownloadPackageName);
       }
       LiveBsStateMessages$SCLiveCurrentBsState tappId = this.appId;
       if (tappId) {
          p0.writeUInt64(6, tappId);
       }
       if (!(this.actionUrl).equals(str)) {
          p0.writeString(7, this.actionUrl);
       }
       tactiveButto = this.supportType;
       if (tactiveButto != null) {
          p0.writeInt32(9, tactiveButto);
       }
       tactiveButto = this.openFloatLive;
       if (tactiveButto != null) {
          p0.writeUInt32(10, tactiveButto);
       }
       if (!(this.statisticsInfo).equals(str)) {
          p0.writeString(11, this.statisticsInfo);
       }
       tactiveButto = this.floatLiveType;
       if (tactiveButto != null) {
          p0.writeInt32(12, tactiveButto);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(13, this.bizType);
       }
       if (!(this.exposureId).equals(str)) {
          p0.writeString(14, this.exposureId);
       }
       super.writeTo(p0);
       return;
    }
}
