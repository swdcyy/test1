package com.kuaishou.client.log.content.packages.nano.ClientContent$MessagePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$MessagePackage extends MessageNano	// class@0012ad
{
    public boolean aggregation;
    public int aggregationType;
    public String authorId;
    public String hasRelationshipName;
    public String identity;
    public String messageSubtype;
    public String messageType;
    public String relationshipType;
    public int status;
    public String storyId;
    public int type;
    public static ClientContent$MessagePackage[] _emptyArray;

    public void ClientContent$MessagePackage(){
       super();
       this.clear();
    }
    public static ClientContent$MessagePackage[] emptyArray(){
       if (ClientContent$MessagePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MessagePackage._emptyArray == null) {
             ClientContent$MessagePackage[] messagePacka = new ClientContent$MessagePackage[0];
             ClientContent$MessagePackage._emptyArray = messagePacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MessagePackage._emptyArray;
    }
    public static ClientContent$MessagePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MessagePackage().mergeFrom(p0);
    }
    public static ClientContent$MessagePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MessagePackage(), p0);
    }
    public ClientContent$MessagePackage clear(){
       this.type = 0;
       this.identity = "";
       this.aggregation = false;
       this.aggregationType = 0;
       this.status = 0;
       this.messageType = "";
       this.messageSubtype = "";
       this.relationshipType = "";
       this.hasRelationshipName = "";
       this.storyId = "";
       this.authorId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$MessagePackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.identity);
       }
       ttype = this.aggregation;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, ttype);
       }
       ttype = this.aggregationType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, ttype);
       }
       ttype = this.status;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, ttype);
       }
       if (!(this.messageType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.messageType);
       }
       if (!(this.messageSubtype).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.messageSubtype);
       }
       if (!(this.relationshipType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.relationshipType);
       }
       if (!(this.hasRelationshipName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.hasRelationshipName);
       }
       if (!(this.storyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.storyId);
       }
       if (!(this.authorId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.authorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MessagePackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && i != i1) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case 18:
                this.identity = p0.readString();
                break;
              case 24:
                this.aggregation = p0.readBool();
                break;
              case 32:
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
                    case 1:
                      break;
                    default:
                }
                this.aggregationType = i;
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != i1 && i != 2)) {
                   continue ;
                }else {
                   this.status = i;
                }
                break;
              case '2':
                this.messageType = p0.readString();
                break;
              case ':':
                this.messageSubtype = p0.readString();
                break;
              case 'B':
                this.relationshipType = p0.readString();
                break;
              case 'J':
                this.hasRelationshipName = p0.readString();
                break;
              case 'R':
                this.storyId = p0.readString();
                break;
              case 'Z':
                this.authorId = p0.readString();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$MessagePackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(2, this.identity);
       }
       ttype = this.aggregation;
       if (ttype != null) {
          p0.writeBool(3, ttype);
       }
       ttype = this.aggregationType;
       if (ttype != null) {
          p0.writeInt32(4, ttype);
       }
       ttype = this.status;
       if (ttype != null) {
          p0.writeInt32(5, ttype);
       }
       if (!(this.messageType).equals(str)) {
          p0.writeString(6, this.messageType);
       }
       if (!(this.messageSubtype).equals(str)) {
          p0.writeString(7, this.messageSubtype);
       }
       if (!(this.relationshipType).equals(str)) {
          p0.writeString(8, this.relationshipType);
       }
       if (!(this.hasRelationshipName).equals(str)) {
          p0.writeString(9, this.hasRelationshipName);
       }
       if (!(this.storyId).equals(str)) {
          p0.writeString(10, this.storyId);
       }
       if (!(this.authorId).equals(str)) {
          p0.writeString(11, this.authorId);
       }
       super.writeTo(p0);
       return;
    }
}
