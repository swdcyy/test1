package com.kuaishou.client.log.content.packages.nano.ClientContent$SoundEffectPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$SoundEffectPackage extends MessageNano	// class@0012df
{
    public String name;
    public int reverbLevel;
    public int type;
    public static ClientContent$SoundEffectPackage[] _emptyArray;

    public void ClientContent$SoundEffectPackage(){
       super();
       this.clear();
    }
    public static ClientContent$SoundEffectPackage[] emptyArray(){
       if (ClientContent$SoundEffectPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$SoundEffectPackage._emptyArray == null) {
             ClientContent$SoundEffectPackage[] soundEffectP = new ClientContent$SoundEffectPackage[0];
             ClientContent$SoundEffectPackage._emptyArray = soundEffectP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$SoundEffectPackage._emptyArray;
    }
    public static ClientContent$SoundEffectPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$SoundEffectPackage().mergeFrom(p0);
    }
    public static ClientContent$SoundEffectPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$SoundEffectPackage(), p0);
    }
    public ClientContent$SoundEffectPackage clear(){
       this.name = "";
       this.reverbLevel = 0;
       this.type = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.name).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       ClientContent$SoundEffectPackage treverbLevel = this.reverbLevel;
       if (treverbLevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, treverbLevel);
       }
       treverbLevel = this.type;
       if (treverbLevel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, treverbLevel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$SoundEffectPackage mergeFrom(CodedInputByteBufferNano p0){
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
                   i = p0.readInt32();
                   switch (i){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 8:
                       case 9:
                       case 10:
                       case 11:
                       case 12:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 1:
                         break;
                       default:
                   }
                   this.type = i;
                }
             }else {
                this.reverbLevel = p0.readUInt32();
             }
          }else {
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.name).equals("")) {
          p0.writeString(1, this.name);
       }
       ClientContent$SoundEffectPackage treverbLevel = this.reverbLevel;
       if (treverbLevel != null) {
          p0.writeUInt32(2, treverbLevel);
       }
       treverbLevel = this.type;
       if (treverbLevel != null) {
          p0.writeInt32(3, treverbLevel);
       }
       super.writeTo(p0);
       return;
    }
}
