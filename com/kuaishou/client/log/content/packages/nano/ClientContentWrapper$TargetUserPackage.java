package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$TargetUserPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$TargetUserPackage extends MessageNano	// class@00133f
{
    public String identity;
    public boolean isFriend;
    public int relationshipType;
    public static ClientContentWrapper$TargetUserPackage[] _emptyArray;

    public void ClientContentWrapper$TargetUserPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$TargetUserPackage[] emptyArray(){
       if (ClientContentWrapper$TargetUserPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$TargetUserPackage._emptyArray == null) {
             ClientContentWrapper$TargetUserPackage[] targetUserPa = new ClientContentWrapper$TargetUserPackage[0];
             ClientContentWrapper$TargetUserPackage._emptyArray = targetUserPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$TargetUserPackage._emptyArray;
    }
    public static ClientContentWrapper$TargetUserPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$TargetUserPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$TargetUserPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$TargetUserPackage(), p0);
    }
    public ClientContentWrapper$TargetUserPackage clear(){
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
       ClientContentWrapper$TargetUserPackage tisFriend = this.isFriend;
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
    public ClientContentWrapper$TargetUserPackage mergeFrom(CodedInputByteBufferNano p0){
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
       ClientContentWrapper$TargetUserPackage tisFriend = this.isFriend;
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
