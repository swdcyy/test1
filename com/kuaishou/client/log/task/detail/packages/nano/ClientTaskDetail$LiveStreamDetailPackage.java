package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$LiveStreamDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$LiveStreamDetailPackage extends MessageNano	// class@001462
{
    public boolean beautyEnabled;
    public int cameraType;
    public boolean completed;
    public long cost;
    public long duration;
    public boolean flashlightEnabled;
    public int gifCount;
    public int reconnectCount;
    public boolean soundEffectEnabled;
    public int speedLevel;
    public static ClientTaskDetail$LiveStreamDetailPackage[] _emptyArray;

    public void ClientTaskDetail$LiveStreamDetailPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$LiveStreamDetailPackage[] emptyArray(){
       if (ClientTaskDetail$LiveStreamDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$LiveStreamDetailPackage._emptyArray == null) {
             ClientTaskDetail$LiveStreamDetailPackage[] liveStreamDe = new ClientTaskDetail$LiveStreamDetailPackage[0];
             ClientTaskDetail$LiveStreamDetailPackage._emptyArray = liveStreamDe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$LiveStreamDetailPackage._emptyArray;
    }
    public static ClientTaskDetail$LiveStreamDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$LiveStreamDetailPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$LiveStreamDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$LiveStreamDetailPackage(), p0);
    }
    public ClientTaskDetail$LiveStreamDetailPackage clear(){
       this.speedLevel = 0;
       this.completed = false;
       this.cost = 0;
       this.reconnectCount = 0;
       this.duration = 0;
       this.beautyEnabled = false;
       this.soundEffectEnabled = false;
       this.cameraType = 0;
       this.flashlightEnabled = false;
       this.gifCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$LiveStreamDetailPackage tspeedLevel = this.speedLevel;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tspeedLevel);
       }
       tspeedLevel = this.completed;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tspeedLevel);
       }
       tspeedLevel = this.cost;
       int i1 = 0;
       if (tspeedLevel - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tspeedLevel);
       }
       tspeedLevel = this.reconnectCount;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tspeedLevel);
       }
       tspeedLevel = this.duration;
       if (tspeedLevel - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tspeedLevel);
       }
       tspeedLevel = this.beautyEnabled;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tspeedLevel);
       }
       tspeedLevel = this.soundEffectEnabled;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tspeedLevel);
       }
       tspeedLevel = this.cameraType;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tspeedLevel);
       }
       tspeedLevel = this.flashlightEnabled;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tspeedLevel);
       }
       tspeedLevel = this.gifCount;
       if (tspeedLevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(10, tspeedLevel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$LiveStreamDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && i != 3))) {
                   continue ;
                }else {
                   this.speedLevel = i;
                }
                break;
              case 16:
                this.completed = p0.readBool();
                break;
              case 24:
                this.cost = p0.readUInt64();
                break;
              case 32:
                this.reconnectCount = p0.readUInt32();
                break;
              case '(':
                this.duration = p0.readUInt64();
                break;
              case '0':
                this.beautyEnabled = p0.readBool();
                break;
              case '8':
                this.soundEffectEnabled = p0.readBool();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.cameraType = i;
                }
                break;
              case 'H':
                this.flashlightEnabled = p0.readBool();
                break;
              case 'P':
                this.gifCount = p0.readUInt32();
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
       ClientTaskDetail$LiveStreamDetailPackage tspeedLevel = this.speedLevel;
       if (tspeedLevel != null) {
          p0.writeInt32(1, tspeedLevel);
       }
       tspeedLevel = this.completed;
       if (tspeedLevel != null) {
          p0.writeBool(2, tspeedLevel);
       }
       tspeedLevel = this.cost;
       int i = 0;
       if (tspeedLevel - i) {
          p0.writeUInt64(3, tspeedLevel);
       }
       tspeedLevel = this.reconnectCount;
       if (tspeedLevel != null) {
          p0.writeUInt32(4, tspeedLevel);
       }
       tspeedLevel = this.duration;
       if (tspeedLevel - i) {
          p0.writeUInt64(5, tspeedLevel);
       }
       tspeedLevel = this.beautyEnabled;
       if (tspeedLevel != null) {
          p0.writeBool(6, tspeedLevel);
       }
       tspeedLevel = this.soundEffectEnabled;
       if (tspeedLevel != null) {
          p0.writeBool(7, tspeedLevel);
       }
       tspeedLevel = this.cameraType;
       if (tspeedLevel != null) {
          p0.writeInt32(8, tspeedLevel);
       }
       tspeedLevel = this.flashlightEnabled;
       if (tspeedLevel != null) {
          p0.writeBool(9, tspeedLevel);
       }
       tspeedLevel = this.gifCount;
       if (tspeedLevel != null) {
          p0.writeUInt32(10, tspeedLevel);
       }
       super.writeTo(p0);
       return;
    }
}
