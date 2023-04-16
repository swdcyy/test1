package com.kuaishou.client.log.stat.packages.nano.ClientStat$SoundEffectUsagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SoundEffectPackage;

public final class ClientStat$SoundEffectUsagePackage extends MessageNano	// class@001426
{
    public long duration;
    public ClientContent$SoundEffectPackage soundEffectPackage;
    public boolean usingEarphone;
    public static ClientStat$SoundEffectUsagePackage[] _emptyArray;

    public void ClientStat$SoundEffectUsagePackage(){
       super();
       this.clear();
    }
    public static ClientStat$SoundEffectUsagePackage[] emptyArray(){
       if (ClientStat$SoundEffectUsagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$SoundEffectUsagePackage._emptyArray == null) {
             ClientStat$SoundEffectUsagePackage[] soundEffectU = new ClientStat$SoundEffectUsagePackage[0];
             ClientStat$SoundEffectUsagePackage._emptyArray = soundEffectU;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$SoundEffectUsagePackage._emptyArray;
    }
    public static ClientStat$SoundEffectUsagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$SoundEffectUsagePackage().mergeFrom(p0);
    }
    public static ClientStat$SoundEffectUsagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$SoundEffectUsagePackage(), p0);
    }
    public ClientStat$SoundEffectUsagePackage clear(){
       this.soundEffectPackage = null;
       this.usingEarphone = false;
       this.duration = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$SoundEffectUsagePackage tsoundEffect = this.soundEffectPackage;
       if (tsoundEffect != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tsoundEffect);
       }
       tsoundEffect = this.usingEarphone;
       if (tsoundEffect != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tsoundEffect);
       }
       tsoundEffect = this.duration;
       if (tsoundEffect) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsoundEffect);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$SoundEffectUsagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.duration = p0.readUInt64();
                }
             }else {
                this.usingEarphone = p0.readBool();
             }
          }else if(this.soundEffectPackage == null){
             this.soundEffectPackage = new ClientContent$SoundEffectPackage();
          }
          p0.readMessage(this.soundEffectPackage);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$SoundEffectUsagePackage tsoundEffect = this.soundEffectPackage;
       if (tsoundEffect != null) {
          p0.writeMessage(1, tsoundEffect);
       }
       tsoundEffect = this.usingEarphone;
       if (tsoundEffect != null) {
          p0.writeBool(2, tsoundEffect);
       }
       tsoundEffect = this.duration;
       if (tsoundEffect) {
          p0.writeUInt64(3, tsoundEffect);
       }
       super.writeTo(p0);
       return;
    }
}
