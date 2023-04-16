package com.kuaishou.client.log.content.packages.nano.ClientContent$ProfilePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$ProfilePackage extends MessageNano	// class@0012cb
{
    public int style;
    public int tab;
    public String visitedUid;
    public static ClientContent$ProfilePackage[] _emptyArray;

    public void ClientContent$ProfilePackage(){
       super();
       this.clear();
    }
    public static ClientContent$ProfilePackage[] emptyArray(){
       if (ClientContent$ProfilePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$ProfilePackage._emptyArray == null) {
             ClientContent$ProfilePackage[] profilePacka = new ClientContent$ProfilePackage[0];
             ClientContent$ProfilePackage._emptyArray = profilePacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$ProfilePackage._emptyArray;
    }
    public static ClientContent$ProfilePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$ProfilePackage().mergeFrom(p0);
    }
    public static ClientContent$ProfilePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$ProfilePackage(), p0);
    }
    public ClientContent$ProfilePackage clear(){
       this.visitedUid = "";
       this.style = 0;
       this.tab = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.visitedUid).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.visitedUid);
       }
       ClientContent$ProfilePackage tstyle = this.style;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstyle);
       }
       tstyle = this.tab;
       if (tstyle != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tstyle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$ProfilePackage mergeFrom(CodedInputByteBufferNano p0){
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
                       case 1:
                         break;
                       default:
                   }
                   this.tab = i;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.style = i;
                }
             }
          }else {
             this.visitedUid = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.visitedUid).equals("")) {
          p0.writeString(1, this.visitedUid);
       }
       ClientContent$ProfilePackage tstyle = this.style;
       if (tstyle != null) {
          p0.writeInt32(2, tstyle);
       }
       tstyle = this.tab;
       if (tstyle != null) {
          p0.writeInt32(3, tstyle);
       }
       super.writeTo(p0);
       return;
    }
}
