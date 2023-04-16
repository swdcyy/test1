package com.kuaishou.client.log.content.packages.nano.ClientContent$UserStatusPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$UserStatusPackageV2 extends MessageNano	// class@0012ef
{
    public boolean followed;
    public String id;
    public static ClientContent$UserStatusPackageV2[] _emptyArray;

    public void ClientContent$UserStatusPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$UserStatusPackageV2[] emptyArray(){
       if (ClientContent$UserStatusPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$UserStatusPackageV2._emptyArray == null) {
             ClientContent$UserStatusPackageV2[] userStatusPa = new ClientContent$UserStatusPackageV2[0];
             ClientContent$UserStatusPackageV2._emptyArray = userStatusPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$UserStatusPackageV2._emptyArray;
    }
    public static ClientContent$UserStatusPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$UserStatusPackageV2().mergeFrom(p0);
    }
    public static ClientContent$UserStatusPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$UserStatusPackageV2(), p0);
    }
    public ClientContent$UserStatusPackageV2 clear(){
       this.id = "";
       this.followed = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.id).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       ClientContent$UserStatusPackageV2 tfollowed = this.followed;
       if (tfollowed != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tfollowed);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$UserStatusPackageV2 mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.followed = p0.readBool();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.id).equals("")) {
          p0.writeString(1, this.id);
       }
       ClientContent$UserStatusPackageV2 tfollowed = this.followed;
       if (tfollowed != null) {
          p0.writeBool(2, tfollowed);
       }
       super.writeTo(p0);
       return;
    }
}
