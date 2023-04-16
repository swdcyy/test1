package com.kuaishou.client.log.content.packages.nano.ClientContent$MusicAdjustDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MusicAdjustDetailPackage extends MessageNano	// class@0012b5
{
    public int accompanimentVolume;
    public boolean headsetReturnOn;
    public String humanVoiceAdjustDefault;
    public String humanVoiceAdjustOffset;
    public int humanVoiceVolume;
    public boolean noiseReductionOn;
    public String reverberationEffect;
    public static ClientContent$MusicAdjustDetailPackage[] _emptyArray;

    public void ClientContent$MusicAdjustDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$MusicAdjustDetailPackage[] emptyArray(){
       if (ClientContent$MusicAdjustDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MusicAdjustDetailPackage._emptyArray == null) {
             ClientContent$MusicAdjustDetailPackage[] musicAdjustD = new ClientContent$MusicAdjustDetailPackage[0];
             ClientContent$MusicAdjustDetailPackage._emptyArray = musicAdjustD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MusicAdjustDetailPackage._emptyArray;
    }
    public static ClientContent$MusicAdjustDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MusicAdjustDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$MusicAdjustDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MusicAdjustDetailPackage(), p0);
    }
    public ClientContent$MusicAdjustDetailPackage clear(){
       this.humanVoiceAdjustDefault = "";
       this.humanVoiceAdjustOffset = "";
       this.humanVoiceVolume = 0;
       this.accompanimentVolume = 0;
       this.noiseReductionOn = false;
       this.headsetReturnOn = false;
       this.reverberationEffect = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.humanVoiceAdjustDefault).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.humanVoiceAdjustDefault);
       }
       if (!(this.humanVoiceAdjustOffset).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.humanVoiceAdjustOffset);
       }
       ClientContent$MusicAdjustDetailPackage thumanVoiceV = this.humanVoiceVolume;
       if (thumanVoiceV != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, thumanVoiceV);
       }
       thumanVoiceV = this.accompanimentVolume;
       if (thumanVoiceV != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, thumanVoiceV);
       }
       thumanVoiceV = this.noiseReductionOn;
       if (thumanVoiceV != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, thumanVoiceV);
       }
       thumanVoiceV = this.headsetReturnOn;
       if (thumanVoiceV != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, thumanVoiceV);
       }
       if (!(this.reverberationEffect).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.reverberationEffect);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MusicAdjustDetailPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.reverberationEffect = p0.readString();
                            }
                         }else {
                            this.headsetReturnOn = p0.readBool();
                         }
                      }else {
                         this.noiseReductionOn = p0.readBool();
                      }
                   }else {
                      this.accompanimentVolume = p0.readUInt32();
                   }
                }else {
                   this.humanVoiceVolume = p0.readUInt32();
                }
             }else {
                this.humanVoiceAdjustOffset = p0.readString();
             }
          }else {
             this.humanVoiceAdjustDefault = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.humanVoiceAdjustDefault).equals(str)) {
          p0.writeString(1, this.humanVoiceAdjustDefault);
       }
       if (!(this.humanVoiceAdjustOffset).equals(str)) {
          p0.writeString(2, this.humanVoiceAdjustOffset);
       }
       ClientContent$MusicAdjustDetailPackage thumanVoiceV = this.humanVoiceVolume;
       if (thumanVoiceV != null) {
          p0.writeUInt32(3, thumanVoiceV);
       }
       thumanVoiceV = this.accompanimentVolume;
       if (thumanVoiceV != null) {
          p0.writeUInt32(4, thumanVoiceV);
       }
       thumanVoiceV = this.noiseReductionOn;
       if (thumanVoiceV != null) {
          p0.writeBool(5, thumanVoiceV);
       }
       thumanVoiceV = this.headsetReturnOn;
       if (thumanVoiceV != null) {
          p0.writeBool(6, thumanVoiceV);
       }
       if (!(this.reverberationEffect).equals(str)) {
          p0.writeString(7, this.reverberationEffect);
       }
       super.writeTo(p0);
       return;
    }
}
