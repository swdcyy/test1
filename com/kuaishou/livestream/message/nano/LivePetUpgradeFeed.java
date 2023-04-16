package com.kuaishou.livestream.message.nano.LivePetUpgradeFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePetUpgradeFeed extends MessageNano	// class@001209
{
    public int level;
    public String petId;
    public int size;
    public String tips;
    public static LivePetUpgradeFeed[] _emptyArray;

    public void LivePetUpgradeFeed(){
       super();
       this.clear();
    }
    public static LivePetUpgradeFeed[] emptyArray(){
       if (LivePetUpgradeFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePetUpgradeFeed._emptyArray == null) {
             LivePetUpgradeFeed[] livePetUpgra = new LivePetUpgradeFeed[0];
             LivePetUpgradeFeed._emptyArray = livePetUpgra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePetUpgradeFeed._emptyArray;
    }
    public static LivePetUpgradeFeed parseFrom(CodedInputByteBufferNano p0){
       return new LivePetUpgradeFeed().mergeFrom(p0);
    }
    public static LivePetUpgradeFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePetUpgradeFeed(), p0);
    }
    public LivePetUpgradeFeed clear(){
       this.petId = "";
       this.level = 0;
       this.tips = "";
       this.size = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.petId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.petId);
       }
       LivePetUpgradeFeed tlevel = this.level;
       if (tlevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tlevel);
       }
       if (!(this.tips).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tips);
       }
       tlevel = this.size;
       if (tlevel != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tlevel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePetUpgradeFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.size = p0.readUInt32();
                   }
                }else {
                   this.tips = p0.readString();
                }
             }else {
                this.level = p0.readUInt32();
             }
          }else {
             this.petId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.petId).equals(str)) {
          p0.writeString(1, this.petId);
       }
       LivePetUpgradeFeed tlevel = this.level;
       if (tlevel != null) {
          p0.writeUInt32(2, tlevel);
       }
       if (!(this.tips).equals(str)) {
          p0.writeString(3, this.tips);
       }
       tlevel = this.size;
       if (tlevel != null) {
          p0.writeUInt32(4, tlevel);
       }
       super.writeTo(p0);
       return;
    }
}
