package com.kuaishou.client.log.content.packages.nano.ClientContent$RedPackPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$RedPackPackage extends MessageNano	// class@0012d5
{
    public int drawPrizePage;
    public int errorCode;
    public String errorMsg;
    public int redPackCount;
    public String redPackId;
    public String redPackMoneyCount;
    public long redPackTime;
    public int redPackType;
    public static ClientContent$RedPackPackage[] _emptyArray;

    public void ClientContent$RedPackPackage(){
       super();
       this.clear();
    }
    public static ClientContent$RedPackPackage[] emptyArray(){
       if (ClientContent$RedPackPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$RedPackPackage._emptyArray == null) {
             ClientContent$RedPackPackage[] redPackPacka = new ClientContent$RedPackPackage[0];
             ClientContent$RedPackPackage._emptyArray = redPackPacka;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$RedPackPackage._emptyArray;
    }
    public static ClientContent$RedPackPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$RedPackPackage().mergeFrom(p0);
    }
    public static ClientContent$RedPackPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$RedPackPackage(), p0);
    }
    public ClientContent$RedPackPackage clear(){
       this.redPackId = "";
       this.redPackCount = 0;
       this.redPackTime = 0;
       this.redPackType = 0;
       this.drawPrizePage = 0;
       this.errorCode = 0;
       this.errorMsg = "";
       this.redPackMoneyCount = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.redPackId);
       }
       ClientContent$RedPackPackage tredPackCoun = this.redPackCount;
       if (tredPackCoun != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tredPackCoun);
       }
       ClientContent$RedPackPackage tredPackTime = this.redPackTime;
       if (tredPackTime) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tredPackTime);
       }
       tredPackCoun = this.redPackType;
       if (tredPackCoun != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tredPackCoun);
       }
       tredPackCoun = this.drawPrizePage;
       if (tredPackCoun != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tredPackCoun);
       }
       tredPackCoun = this.errorCode;
       if (tredPackCoun != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tredPackCoun);
       }
       if (!(this.errorMsg).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.errorMsg);
       }
       if (!(this.redPackMoneyCount).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.redPackMoneyCount);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$RedPackPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.redPackMoneyCount = p0.readString();
                               }
                            }else {
                               this.errorMsg = p0.readString();
                            }
                         }else {
                            this.errorCode = p0.readUInt32();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && (i != 2 && i != 3))) {
                            continue ;
                         }else {
                            this.drawPrizePage = i;
                         }
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
                          case 1:
                            break;
                          default:
                      }
                      this.redPackType = i;
                   }
                }else {
                   this.redPackTime = p0.readUInt64();
                }
             }else {
                this.redPackCount = p0.readUInt32();
             }
          }else {
             this.redPackId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.redPackId).equals(str)) {
          p0.writeString(1, this.redPackId);
       }
       ClientContent$RedPackPackage tredPackCoun = this.redPackCount;
       if (tredPackCoun != null) {
          p0.writeUInt32(2, tredPackCoun);
       }
       ClientContent$RedPackPackage tredPackTime = this.redPackTime;
       if (tredPackTime) {
          p0.writeUInt64(3, tredPackTime);
       }
       tredPackCoun = this.redPackType;
       if (tredPackCoun != null) {
          p0.writeInt32(4, tredPackCoun);
       }
       tredPackCoun = this.drawPrizePage;
       if (tredPackCoun != null) {
          p0.writeInt32(5, tredPackCoun);
       }
       tredPackCoun = this.errorCode;
       if (tredPackCoun != null) {
          p0.writeUInt32(6, tredPackCoun);
       }
       if (!(this.errorMsg).equals(str)) {
          p0.writeString(7, this.errorMsg);
       }
       if (!(this.redPackMoneyCount).equals(str)) {
          p0.writeString(8, this.redPackMoneyCount);
       }
       super.writeTo(p0);
       return;
    }
}
