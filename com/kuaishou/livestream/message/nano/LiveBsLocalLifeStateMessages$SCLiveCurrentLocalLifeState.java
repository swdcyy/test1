package com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button;

public final class LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState extends MessageNano	// class@001129
{
    public String actionUrl;
    public LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button activeButton;
    public String authorRole;
    public int floatLiveType;
    public boolean isDynamicIcon;
    public String ksOrderId;
    public int liteSignalType;
    public int loopCount;
    public String lottieUrl;
    public int openFloatLive;
    public long serverTime;
    public int signalType;
    public String statisticsInfo;
    public int supportType;
    public static LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState[] _emptyArray;

    public void LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState(){
       super();
       this.clear();
    }
    public static LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState[] emptyArray(){
       if (LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState._emptyArray == null) {
             LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState[] sCLiveCurren = new LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState[0];
             LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState._emptyArray = sCLiveCurren;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState._emptyArray;
    }
    public static LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState parseFrom(CodedInputByteBufferNano p0){
       return new LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState().mergeFrom(p0);
    }
    public static LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState(), p0);
    }
    public LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState clear(){
       this.activeButton = null;
       this.ksOrderId = "";
       this.actionUrl = "";
       this.supportType = 0;
       this.openFloatLive = 0;
       this.statisticsInfo = "";
       this.floatLiveType = 0;
       this.isDynamicIcon = false;
       this.loopCount = 0;
       this.lottieUrl = "";
       this.signalType = 0;
       this.serverTime = 0;
       this.authorRole = "";
       this.liteSignalType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState tactiveButto = this.activeButton;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tactiveButto);
       }
       String str = "";
       if (!(this.ksOrderId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ksOrderId);
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
       tactiveButto = this.isDynamicIcon;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tactiveButto);
       }
       tactiveButto = this.loopCount;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(14, tactiveButto);
       }
       if (!(this.lottieUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.lottieUrl);
       }
       tactiveButto = this.signalType;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(16, tactiveButto);
       }
       LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState tserverTime = this.serverTime;
       if (tserverTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(17, tserverTime);
       }
       if (!(this.authorRole).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(18, this.authorRole);
       }
       tactiveButto = this.liteSignalType;
       if (tactiveButto != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(19, tactiveButto);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.activeButton == null) {
                   this.activeButton = new LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState$Button();
                }
                p0.readMessage(this.activeButton);
                break;
              case 26:
                this.ksOrderId = p0.readString();
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
              case 'h':
                this.isDynamicIcon = p0.readBool();
                break;
              case 'p':
                this.loopCount = p0.readInt32();
                break;
              case 'z':
                this.lottieUrl = p0.readString();
                break;
              case 128:
                i = p0.readInt32();
                if (i && i != i1) {
                   continue ;
                }else {
                   this.signalType = i;
                }
                break;
              case 136:
                this.serverTime = p0.readUInt64();
                break;
              case 146:
                this.authorRole = p0.readString();
                break;
              case 152:
                i = p0.readInt32();
                if (i && i != i1) {
                   continue ;
                }else {
                   this.liteSignalType = i;
                }
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
       LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState tactiveButto = this.activeButton;
       if (tactiveButto != null) {
          p0.writeMessage(1, tactiveButto);
       }
       String str = "";
       if (!(this.ksOrderId).equals(str)) {
          p0.writeString(3, this.ksOrderId);
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
       tactiveButto = this.isDynamicIcon;
       if (tactiveButto != null) {
          p0.writeBool(13, tactiveButto);
       }
       tactiveButto = this.loopCount;
       if (tactiveButto != null) {
          p0.writeInt32(14, tactiveButto);
       }
       if (!(this.lottieUrl).equals(str)) {
          p0.writeString(15, this.lottieUrl);
       }
       tactiveButto = this.signalType;
       if (tactiveButto != null) {
          p0.writeInt32(16, tactiveButto);
       }
       LiveBsLocalLifeStateMessages$SCLiveCurrentLocalLifeState tserverTime = this.serverTime;
       if (tserverTime) {
          p0.writeUInt64(17, tserverTime);
       }
       if (!(this.authorRole).equals(str)) {
          p0.writeString(18, this.authorRole);
       }
       tactiveButto = this.liteSignalType;
       if (tactiveButto != null) {
          p0.writeInt32(19, tactiveButto);
       }
       super.writeTo(p0);
       return;
    }
}
