package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$KwaishopResourceLivePendantInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveRoomSignalMessage$KwaishopResourceLivePendantInfo extends MessageNano	// class@001c52
{
    public int action;
    public String areaCode;
    public String callbackApi;
    public String eventData;
    public boolean needBusinessHandle;
    public boolean needRandomCall;
    public boolean needServerProcess;
    public String pendantCode;
    public long pendantResourceId;
    public long randomRangeMillis;
    public Map throughInfo;
    public static LiveRoomSignalMessage$KwaishopResourceLivePendantInfo[] _emptyArray;

    public void LiveRoomSignalMessage$KwaishopResourceLivePendantInfo(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$KwaishopResourceLivePendantInfo[] emptyArray(){
       if (LiveRoomSignalMessage$KwaishopResourceLivePendantInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$KwaishopResourceLivePendantInfo._emptyArray == null) {
             LiveRoomSignalMessage$KwaishopResourceLivePendantInfo[] kwaishopReso = new LiveRoomSignalMessage$KwaishopResourceLivePendantInfo[0];
             LiveRoomSignalMessage$KwaishopResourceLivePendantInfo._emptyArray = kwaishopReso;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$KwaishopResourceLivePendantInfo._emptyArray;
    }
    public static LiveRoomSignalMessage$KwaishopResourceLivePendantInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$KwaishopResourceLivePendantInfo().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$KwaishopResourceLivePendantInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$KwaishopResourceLivePendantInfo(), p0);
    }
    public LiveRoomSignalMessage$KwaishopResourceLivePendantInfo clear(){
       this.areaCode = "";
       this.pendantResourceId = 0;
       this.pendantCode = "";
       this.action = 0;
       this.eventData = "";
       this.throughInfo = null;
       this.needServerProcess = false;
       this.callbackApi = "";
       this.needRandomCall = false;
       this.randomRangeMillis = 0;
       this.needBusinessHandle = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.areaCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.areaCode);
       }
       LiveRoomSignalMessage$KwaishopResourceLivePendantInfo tpendantReso = this.pendantResourceId;
       if (tpendantReso) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpendantReso);
       }
       if (!(this.pendantCode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.pendantCode);
       }
       LiveRoomSignalMessage$KwaishopResourceLivePendantInfo taction = this.action;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, taction);
       }
       if (!(this.eventData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.eventData);
       }
       taction = this.throughInfo;
       int i1 = 9;
       if (taction != null) {
          i = i + InternalNano.computeMapFieldSize(taction, 6, i1, i1);
       }
       taction = this.needServerProcess;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, taction);
       }
       if (!(this.callbackApi).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.callbackApi);
       }
       taction = this.needRandomCall;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(i1, taction);
       }
       taction = this.randomRangeMillis;
       if (taction) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, taction);
       }
       taction = this.needBusinessHandle;
       if (taction != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, taction);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$KwaishopResourceLivePendantInfo mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.areaCode = p0.readString();
                break;
              case 16:
                this.pendantResourceId = p0.readUInt64();
                break;
              case 26:
                this.pendantCode = p0.readString();
                break;
              case 32:
                this.action = p0.readUInt32();
                break;
              case '*':
                this.eventData = p0.readString();
                break;
              case '2':
                this.throughInfo = InternalNano.mergeMapEntry(p0, this.throughInfo, mapFactory, 9, 9, null, 10, 18);
                break;
              case '8':
                this.needServerProcess = p0.readBool();
                break;
              case 'B':
                this.callbackApi = p0.readString();
                break;
              case 'H':
                this.needRandomCall = p0.readBool();
                break;
              case 'P':
                this.randomRangeMillis = p0.readUInt64();
                break;
              case 'X':
                this.needBusinessHandle = p0.readBool();
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
       String str = "";
       if (!(this.areaCode).equals(str)) {
          p0.writeString(1, this.areaCode);
       }
       LiveRoomSignalMessage$KwaishopResourceLivePendantInfo tpendantReso = this.pendantResourceId;
       if (tpendantReso) {
          p0.writeUInt64(2, tpendantReso);
       }
       if (!(this.pendantCode).equals(str)) {
          p0.writeString(3, this.pendantCode);
       }
       LiveRoomSignalMessage$KwaishopResourceLivePendantInfo taction = this.action;
       if (taction != null) {
          p0.writeUInt32(4, taction);
       }
       if (!(this.eventData).equals(str)) {
          p0.writeString(5, this.eventData);
       }
       taction = this.throughInfo;
       int i = 9;
       if (taction != null) {
          InternalNano.serializeMapField(p0, taction, 6, i, i);
       }
       taction = this.needServerProcess;
       if (taction != null) {
          p0.writeBool(7, taction);
       }
       if (!(this.callbackApi).equals(str)) {
          p0.writeString(8, this.callbackApi);
       }
       taction = this.needRandomCall;
       if (taction != null) {
          p0.writeBool(i, taction);
       }
       taction = this.randomRangeMillis;
       if (taction) {
          p0.writeUInt64(10, taction);
       }
       taction = this.needBusinessHandle;
       if (taction != null) {
          p0.writeBool(11, taction);
       }
       super.writeTo(p0);
       return;
    }
}
