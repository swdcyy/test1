package com.kuaishou.client.log.content.packages.nano.ClientContent$FilterDetailPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Float;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$FilterDetailPackage extends MessageNano	// class@001240
{
    public String id;
    public int index;
    public boolean isAdjusted;
    public boolean isCommonlyUsed;
    public String name;
    public int segmentIndex;
    public int tabId;
    public String tabName;
    public float value;
    public static ClientContent$FilterDetailPackage[] _emptyArray;

    public void ClientContent$FilterDetailPackage(){
       super();
       this.clear();
    }
    public static ClientContent$FilterDetailPackage[] emptyArray(){
       if (ClientContent$FilterDetailPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$FilterDetailPackage._emptyArray == null) {
             ClientContent$FilterDetailPackage[] uFilterDetai = new ClientContent$FilterDetailPackage[0];
             ClientContent$FilterDetailPackage._emptyArray = uFilterDetai;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$FilterDetailPackage._emptyArray;
    }
    public static ClientContent$FilterDetailPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$FilterDetailPackage().mergeFrom(p0);
    }
    public static ClientContent$FilterDetailPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$FilterDetailPackage(), p0);
    }
    public ClientContent$FilterDetailPackage clear(){
       this.id = "";
       this.name = "";
       this.index = 0;
       this.segmentIndex = 0;
       this.isAdjusted = false;
       this.value = 0;
       this.isCommonlyUsed = false;
       this.tabId = 0;
       this.tabName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       ClientContent$FilterDetailPackage tindex = this.index;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tindex);
       }
       tindex = this.segmentIndex;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tindex);
       }
       tindex = this.isAdjusted;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tindex);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          i = i + CodedOutputByteBufferNano.computeFloatSize(6, this.value);
       }
       tindex = this.isCommonlyUsed;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tindex);
       }
       tindex = this.tabId;
       if (tindex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tindex);
       }
       if (!(this.tabName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.tabName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$FilterDetailPackage mergeFrom(CodedInputByteBufferNano p0){
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
                         if (i != 53) {
                            if (i != 56) {
                               if (i != 64) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.tabName = p0.readString();
                                  }
                               }else {
                                  this.tabId = p0.readInt32();
                               }
                            }else {
                               this.isCommonlyUsed = p0.readBool();
                            }
                         }else {
                            this.value = p0.readFloat();
                         }
                      }else {
                         this.isAdjusted = p0.readBool();
                      }
                   }else {
                      this.segmentIndex = p0.readUInt32();
                   }
                }else {
                   this.index = p0.readUInt32();
                }
             }else {
                this.name = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       ClientContent$FilterDetailPackage tindex = this.index;
       if (tindex != null) {
          p0.writeUInt32(3, tindex);
       }
       tindex = this.segmentIndex;
       if (tindex != null) {
          p0.writeUInt32(4, tindex);
       }
       tindex = this.isAdjusted;
       if (tindex != null) {
          p0.writeBool(5, tindex);
       }
       if (Float.floatToIntBits(this.value) != Float.floatToIntBits(0)) {
          p0.writeFloat(6, this.value);
       }
       tindex = this.isCommonlyUsed;
       if (tindex != null) {
          p0.writeBool(7, tindex);
       }
       tindex = this.tabId;
       if (tindex != null) {
          p0.writeInt32(8, tindex);
       }
       if (!(this.tabName).equals(str)) {
          p0.writeString(9, this.tabName);
       }
       super.writeTo(p0);
       return;
    }
}
