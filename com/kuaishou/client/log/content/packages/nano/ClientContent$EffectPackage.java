package com.kuaishou.client.log.content.packages.nano.ClientContent$EffectPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$EffectPackage extends MessageNano	// class@00123a
{
    public String duration;
    public String groupName;
    public long id;
    public String location;
    public String name;
    public static ClientContent$EffectPackage[] _emptyArray;

    public void ClientContent$EffectPackage(){
       super();
       this.clear();
    }
    public static ClientContent$EffectPackage[] emptyArray(){
       if (ClientContent$EffectPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$EffectPackage._emptyArray == null) {
             ClientContent$EffectPackage[] uEffectPacka = new ClientContent$EffectPackage[0];
             ClientContent$EffectPackage._emptyArray = uEffectPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$EffectPackage._emptyArray;
    }
    public static ClientContent$EffectPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$EffectPackage().mergeFrom(p0);
    }
    public static ClientContent$EffectPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$EffectPackage(), p0);
    }
    public ClientContent$EffectPackage clear(){
       this.name = "";
       this.location = "";
       this.duration = "";
       this.id = 0;
       this.groupName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.name);
       }
       if (!(this.location).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.location);
       }
       if (!(this.duration).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.duration);
       }
       ClientContent$EffectPackage tid = this.id;
       if (tid) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(4, tid);
       }
       if (!(this.groupName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.groupName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$EffectPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.groupName = p0.readString();
                      }
                   }else {
                      this.id = p0.readInt64();
                   }
                }else {
                   this.duration = p0.readString();
                }
             }else {
                this.location = p0.readString();
             }
          }else {
             this.name = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.name).equals(str)) {
          p0.writeString(1, this.name);
       }
       if (!(this.location).equals(str)) {
          p0.writeString(2, this.location);
       }
       if (!(this.duration).equals(str)) {
          p0.writeString(3, this.duration);
       }
       ClientContent$EffectPackage tid = this.id;
       if (tid) {
          p0.writeInt64(4, tid);
       }
       if (!(this.groupName).equals(str)) {
          p0.writeString(5, this.groupName);
       }
       super.writeTo(p0);
       return;
    }
}
