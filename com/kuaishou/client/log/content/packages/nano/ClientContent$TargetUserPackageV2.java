package com.kuaishou.client.log.content.packages.nano.ClientContent$TargetUserPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$TargetUserPackageV2 extends MessageNano	// class@0012e7
{
    public String identity;
    public boolean isFriend;
    public int relationshipType;
    public static ClientContent$TargetUserPackageV2[] _emptyArray;

    public void ClientContent$TargetUserPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$TargetUserPackageV2[] emptyArray(){
       if (ClientContent$TargetUserPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$TargetUserPackageV2._emptyArray == null) {
             ClientContent$TargetUserPackageV2[] targetUserPa = new ClientContent$TargetUserPackageV2[0];
             ClientContent$TargetUserPackageV2._emptyArray = targetUserPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$TargetUserPackageV2._emptyArray;
    }
    public static ClientContent$TargetUserPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$TargetUserPackageV2().mergeFrom(p0);
    }
    public static ClientContent$TargetUserPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$TargetUserPackageV2(), p0);
    }
    public ClientContent$TargetUserPackageV2 clear(){
       this.identity = "";
       this.isFriend = false;
       this.relationshipType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.identity).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.identity);
       }
       ClientContent$TargetUserPackageV2 tisFriend = this.isFriend;
       if (tisFriend != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tisFriend);
       }
       tisFriend = this.relationshipType;
       if (tisFriend != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tisFriend);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$TargetUserPackageV2 mergeFrom(CodedInputByteBufferNano p0){
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
                       case 1:
                         break;
                       default:
                   }
                   this.relationshipType = i;
                }
             }else {
                this.isFriend = p0.readBool();
             }
          }else {
             this.identity = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.identity).equals("")) {
          p0.writeString(1, this.identity);
       }
       ClientContent$TargetUserPackageV2 tisFriend = this.isFriend;
       if (tisFriend != null) {
          p0.writeBool(2, tisFriend);
       }
       tisFriend = this.relationshipType;
       if (tisFriend != null) {
          p0.writeInt32(3, tisFriend);
       }
       super.writeTo(p0);
       return;
    }
}
