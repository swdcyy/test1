package com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$GiftPackage extends MessageNano	// class@001246
{
    public int giftEntryType;
    public String identity;
    public boolean isComboSend;
    public boolean isDrawingGift;
    public boolean isLocalHasMaterial;
    public boolean isPacketGift;
    public String localHighDefinitionMaterials;
    public long magicFaceId;
    public int position;
    public int sourceType;
    public boolean toAnchor;
    public int totalCount;
    public int type;
    public static ClientContent$GiftPackage[] _emptyArray;

    public void ClientContent$GiftPackage(){
       super();
       this.clear();
    }
    public static ClientContent$GiftPackage[] emptyArray(){
       if (ClientContent$GiftPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$GiftPackage._emptyArray == null) {
             ClientContent$GiftPackage[] giftPackageA = new ClientContent$GiftPackage[0];
             ClientContent$GiftPackage._emptyArray = giftPackageA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$GiftPackage._emptyArray;
    }
    public static ClientContent$GiftPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$GiftPackage().mergeFrom(p0);
    }
    public static ClientContent$GiftPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$GiftPackage(), p0);
    }
    public ClientContent$GiftPackage clear(){
       this.type = 0;
       this.identity = "";
       this.position = 0;
       this.magicFaceId = 0;
       this.totalCount = 0;
       this.isDrawingGift = false;
       this.isPacketGift = false;
       this.isComboSend = false;
       this.toAnchor = false;
       this.sourceType = 0;
       this.isLocalHasMaterial = false;
       this.localHighDefinitionMaterials = "";
       this.giftEntryType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$GiftPackage ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.identity).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.identity);
       }
       ttype = this.position;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttype);
       }
       ClientContent$GiftPackage tmagicFaceId = this.magicFaceId;
       if (tmagicFaceId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmagicFaceId);
       }
       ttype = this.totalCount;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, ttype);
       }
       ttype = this.isDrawingGift;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, ttype);
       }
       ttype = this.isPacketGift;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, ttype);
       }
       ttype = this.isComboSend;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, ttype);
       }
       ttype = this.toAnchor;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, ttype);
       }
       ttype = this.sourceType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(10, ttype);
       }
       ttype = this.isLocalHasMaterial;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, ttype);
       }
       if (!(this.localHighDefinitionMaterials).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.localHighDefinitionMaterials);
       }
       ttype = this.giftEntryType;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$GiftPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case 18:
                this.identity = p0.readString();
                break;
              case 24:
                this.position = p0.readUInt32();
                break;
              case 32:
                this.magicFaceId = p0.readUInt64();
                break;
              case '(':
                this.totalCount = p0.readUInt32();
                break;
              case '0':
                this.isDrawingGift = p0.readBool();
                break;
              case '8':
                this.isPacketGift = p0.readBool();
                break;
              case '@':
                this.isComboSend = p0.readBool();
                break;
              case 'H':
                this.toAnchor = p0.readBool();
                break;
              case 'P':
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
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case 39:
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 1:
                      break;
                    default:
                }
                this.sourceType = i;
                break;
              case 'X':
                this.isLocalHasMaterial = p0.readBool();
                break;
              case 'b':
                this.localHighDefinitionMaterials = p0.readString();
                break;
              case 'h':
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
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case '!':
                    case '"':
                    case '#':
                    case 1:
                      break;
                    default:
                }
                this.giftEntryType = i;
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
       ClientContent$GiftPackage ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.identity).equals(str)) {
          p0.writeString(2, this.identity);
       }
       ttype = this.position;
       if (ttype != null) {
          p0.writeUInt32(3, ttype);
       }
       ClientContent$GiftPackage tmagicFaceId = this.magicFaceId;
       if (tmagicFaceId) {
          p0.writeUInt64(4, tmagicFaceId);
       }
       ttype = this.totalCount;
       if (ttype != null) {
          p0.writeUInt32(5, ttype);
       }
       ttype = this.isDrawingGift;
       if (ttype != null) {
          p0.writeBool(6, ttype);
       }
       ttype = this.isPacketGift;
       if (ttype != null) {
          p0.writeBool(7, ttype);
       }
       ttype = this.isComboSend;
       if (ttype != null) {
          p0.writeBool(8, ttype);
       }
       ttype = this.toAnchor;
       if (ttype != null) {
          p0.writeBool(9, ttype);
       }
       ttype = this.sourceType;
       if (ttype != null) {
          p0.writeInt32(10, ttype);
       }
       ttype = this.isLocalHasMaterial;
       if (ttype != null) {
          p0.writeBool(11, ttype);
       }
       if (!(this.localHighDefinitionMaterials).equals(str)) {
          p0.writeString(12, this.localHighDefinitionMaterials);
       }
       ttype = this.giftEntryType;
       if (ttype != null) {
          p0.writeInt32(13, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
