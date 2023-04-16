package com.kuaishou.client.log.content.packages.nano.ClientContent$ThirdPartyRecommendUserListItemPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ThirdPartyRecommendUserListItemPackage extends MessageNano	// class@0012ec
{
    public long position;
    public int source;
    public String userId;
    public static ClientContent$ThirdPartyRecommendUserListItemPackage[] _emptyArray;

    public void ClientContent$ThirdPartyRecommendUserListItemPackage(){
       super();
       this.clear();
    }
    public static ClientContent$ThirdPartyRecommendUserListItemPackage[] emptyArray(){
       if (ClientContent$ThirdPartyRecommendUserListItemPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ThirdPartyRecommendUserListItemPackage._emptyArray == null) {
             ClientContent$ThirdPartyRecommendUserListItemPackage[] thirdPartyRe = new ClientContent$ThirdPartyRecommendUserListItemPackage[0];
             ClientContent$ThirdPartyRecommendUserListItemPackage._emptyArray = thirdPartyRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ThirdPartyRecommendUserListItemPackage._emptyArray;
    }
    public static ClientContent$ThirdPartyRecommendUserListItemPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ThirdPartyRecommendUserListItemPackage().mergeFrom(p0);
    }
    public static ClientContent$ThirdPartyRecommendUserListItemPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ThirdPartyRecommendUserListItemPackage(), p0);
    }
    public ClientContent$ThirdPartyRecommendUserListItemPackage clear(){
       this.source = 0;
       this.userId = "";
       this.position = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$ThirdPartyRecommendUserListItemPackage tsource = this.source;
       if (tsource != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tsource);
       }
       if (!(this.userId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.userId);
       }
       tsource = this.position;
       if (tsource) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tsource);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ThirdPartyRecommendUserListItemPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.position = p0.readUInt64();
                }
             }else {
                this.userId = p0.readString();
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
             this.source = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$ThirdPartyRecommendUserListItemPackage tsource = this.source;
       if (tsource != null) {
          p0.writeInt32(1, tsource);
       }
       if (!(this.userId).equals("")) {
          p0.writeString(2, this.userId);
       }
       tsource = this.position;
       if (tsource) {
          p0.writeUInt64(3, tsource);
       }
       super.writeTo(p0);
       return;
    }
}
