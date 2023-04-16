package com.kuaishou.client.log.content.packages.nano.ClientContent$MorelistPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MorelistContentPackage;

public final class ClientContent$MorelistPackage extends MessageNano	// class@0012b4
{
    public ClientContent$MorelistContentPackage morelistContentPackage;
    public long morelistShowEndTime;
    public long morelistShowStartTime;
    public int morelistType;
    public static ClientContent$MorelistPackage[] _emptyArray;

    public void ClientContent$MorelistPackage(){
       super();
       this.clear();
    }
    public static ClientContent$MorelistPackage[] emptyArray(){
       if (ClientContent$MorelistPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$MorelistPackage._emptyArray == null) {
             ClientContent$MorelistPackage[] morelistPack = new ClientContent$MorelistPackage[0];
             ClientContent$MorelistPackage._emptyArray = morelistPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$MorelistPackage._emptyArray;
    }
    public static ClientContent$MorelistPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$MorelistPackage().mergeFrom(p0);
    }
    public static ClientContent$MorelistPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$MorelistPackage(), p0);
    }
    public ClientContent$MorelistPackage clear(){
       this.morelistType = 0;
       this.morelistContentPackage = null;
       this.morelistShowStartTime = 0;
       this.morelistShowEndTime = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$MorelistPackage tmorelistTyp = this.morelistType;
       if (tmorelistTyp != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmorelistTyp);
       }
       tmorelistTyp = this.morelistContentPackage;
       if (tmorelistTyp != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tmorelistTyp);
       }
       tmorelistTyp = this.morelistShowStartTime;
       int i1 = 0;
       if (tmorelistTyp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmorelistTyp);
       }
       tmorelistTyp = this.morelistShowEndTime;
       if (tmorelistTyp - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmorelistTyp);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$MorelistPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.morelistShowEndTime = p0.readUInt64();
                   }
                }else {
                   this.morelistShowStartTime = p0.readUInt64();
                }
             }else if(this.morelistContentPackage == null){
                this.morelistContentPackage = new ClientContent$MorelistContentPackage();
             }
             p0.readMessage(this.morelistContentPackage);
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
                 case 1:
                   break;
                 default:
             }
             this.morelistType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$MorelistPackage tmorelistTyp = this.morelistType;
       if (tmorelistTyp != null) {
          p0.writeInt32(1, tmorelistTyp);
       }
       tmorelistTyp = this.morelistContentPackage;
       if (tmorelistTyp != null) {
          p0.writeMessage(2, tmorelistTyp);
       }
       tmorelistTyp = this.morelistShowStartTime;
       int i = 0;
       if (tmorelistTyp - i) {
          p0.writeUInt64(3, tmorelistTyp);
       }
       tmorelistTyp = this.morelistShowEndTime;
       if (tmorelistTyp - i) {
          p0.writeUInt64(4, tmorelistTyp);
       }
       super.writeTo(p0);
       return;
    }
}
