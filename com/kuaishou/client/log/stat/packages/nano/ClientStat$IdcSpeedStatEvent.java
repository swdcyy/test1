package com.kuaishou.client.log.stat.packages.nano.ClientStat$IdcSpeedStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$IdcSpeedPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class ClientStat$IdcSpeedStatEvent extends MessageNano	// class@0007d1
{
    public ClientStat$IdcSpeedPackage bestResult;
    public long cost;
    public String exception;
    public long goodIdcThreshold;
    public ClientStat$IdcSpeedPackage[] idcSpeed;
    public int scheme;
    public int strategy;
    public long testSpeedTimeout;
    public int type;
    public static ClientStat$IdcSpeedStatEvent[] _emptyArray;

    public void ClientStat$IdcSpeedStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$IdcSpeedStatEvent[] emptyArray(){
       if (ClientStat$IdcSpeedStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$IdcSpeedStatEvent._emptyArray == null) {
             ClientStat$IdcSpeedStatEvent[] idcSpeedStat = new ClientStat$IdcSpeedStatEvent[0];
             ClientStat$IdcSpeedStatEvent._emptyArray = idcSpeedStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$IdcSpeedStatEvent._emptyArray;
    }
    public static ClientStat$IdcSpeedStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$IdcSpeedStatEvent().mergeFrom(p0);
    }
    public static ClientStat$IdcSpeedStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$IdcSpeedStatEvent(), p0);
    }
    public ClientStat$IdcSpeedStatEvent clear(){
       this.type = 0;
       this.idcSpeed = ClientStat$IdcSpeedPackage.emptyArray();
       this.cost = 0;
       this.exception = "";
       this.goodIdcThreshold = 0;
       this.testSpeedTimeout = 0;
       this.bestResult = null;
       this.strategy = 0;
       this.scheme = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$IdcSpeedStatEvent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.idcSpeed;
       if (ttype != null && ttype.length > 0) {
          int i1 = 0;
          ClientStat$IdcSpeedStatEvent tidcSpeed = this.idcSpeed;
          while (i1 < tidcSpeed.length) {
             object oobject = tidcSpeed[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.cost;
       int i2 = 0;
       if (ttype - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, ttype);
       }
       if (!(this.exception).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.exception);
       }
       ttype = this.goodIdcThreshold;
       if (ttype - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ttype);
       }
       ttype = this.testSpeedTimeout;
       if (ttype - i2) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ttype);
       }
       ttype = this.bestResult;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, ttype);
       }
       ttype = this.strategy;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, ttype);
       }
       ttype = this.scheme;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(9, ttype);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$IdcSpeedStatEvent mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       int i3;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               i2 = 2;
                               i3 = 1;
                               if (i != 64) {
                                  if (i != 72) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = p0.readInt32();
                                     if (i && (i != i3 && i != i2)) {
                                        continue ;
                                     }else {
                                        this.scheme = i;
                                     }
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != i3 && i != i2)) {
                                     continue ;
                                  }else {
                                     this.strategy = i;
                                  }
                               }
                            }else if(this.bestResult == null){
                               this.bestResult = new ClientStat$IdcSpeedPackage();
                            }
                            p0.readMessage(this.bestResult);
                         }else {
                            this.testSpeedTimeout = p0.readUInt64();
                         }
                      }else {
                         this.goodIdcThreshold = p0.readUInt64();
                      }
                   }else {
                      this.exception = p0.readString();
                   }
                }else {
                   this.cost = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                ClientStat$IdcSpeedStatEvent tidcSpeed = this.idcSpeed;
                i2 = 0;
                i3 = (tidcSpeed == null)? 0: tidcSpeed.length;
                i = i + i3;
                ClientStat$IdcSpeedPackage[] idcSpeedPack = new ClientStat$IdcSpeedPackage[i];
                if (i3) {
                   System.arraycopy(tidcSpeed, i2, idcSpeedPack, i2, i3);
                }
                i1 = i - 1;
                while (i3 < i1) {
                   idcSpeedPack[i3] = new ClientStat$IdcSpeedPackage();
                   p0.readMessage(idcSpeedPack[i3]);
                   p0.readTag();
                   i3 = i3 + 1;
                }
                idcSpeedPack[i3] = new ClientStat$IdcSpeedPackage();
                p0.readMessage(idcSpeedPack[i3]);
                this.idcSpeed = idcSpeedPack;
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
                 case 1:
                   break;
                 default:
             }
             this.type = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$IdcSpeedStatEvent ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.idcSpeed;
       if (ttype != null && ttype.length > 0) {
          int i = 0;
          ClientStat$IdcSpeedStatEvent tidcSpeed = this.idcSpeed;
          while (i < tidcSpeed.length) {
             object oobject = tidcSpeed[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       ttype = this.cost;
       int i1 = 0;
       if (ttype - i1) {
          p0.writeUInt64(3, ttype);
       }
       if (!(this.exception).equals("")) {
          p0.writeString(4, this.exception);
       }
       ttype = this.goodIdcThreshold;
       if (ttype - i1) {
          p0.writeUInt64(5, ttype);
       }
       ttype = this.testSpeedTimeout;
       if (ttype - i1) {
          p0.writeUInt64(6, ttype);
       }
       ttype = this.bestResult;
       if (ttype != null) {
          p0.writeMessage(7, ttype);
       }
       ttype = this.strategy;
       if (ttype != null) {
          p0.writeInt32(8, ttype);
       }
       ttype = this.scheme;
       if (ttype != null) {
          p0.writeInt32(9, ttype);
       }
       super.writeTo(p0);
       return;
    }
}
