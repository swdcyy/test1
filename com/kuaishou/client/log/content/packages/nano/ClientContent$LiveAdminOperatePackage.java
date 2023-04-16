package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveAdminOperatePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$LiveAdminOperatePackage extends MessageNano	// class@001264
{
    public int[] operateType;
    public int pageSourceType;
    public int recordType;
    public int switchTabType;
    public static ClientContent$LiveAdminOperatePackage[] _emptyArray;

    public void ClientContent$LiveAdminOperatePackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveAdminOperatePackage[] emptyArray(){
       if (ClientContent$LiveAdminOperatePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveAdminOperatePackage._emptyArray == null) {
             ClientContent$LiveAdminOperatePackage[] liveAdminOpe = new ClientContent$LiveAdminOperatePackage[0];
             ClientContent$LiveAdminOperatePackage._emptyArray = liveAdminOpe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveAdminOperatePackage._emptyArray;
    }
    public static ClientContent$LiveAdminOperatePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveAdminOperatePackage().mergeFrom(p0);
    }
    public static ClientContent$LiveAdminOperatePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveAdminOperatePackage(), p0);
    }
    public ClientContent$LiveAdminOperatePackage clear(){
       this.operateType = WireFormatNano.EMPTY_INT_ARRAY;
       this.recordType = 0;
       this.switchTabType = 0;
       this.pageSourceType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LiveAdminOperatePackage toperateType = this.operateType;
       if (toperateType != null && toperateType.length > 0) {
          int i1 = 0;
          int i2 = 0;
          ClientContent$LiveAdminOperatePackage toperateType1 = this.operateType;
          while (i1 < toperateType1.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeInt32SizeNoTag(toperateType1[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (toperateType1.length * 1);
       }
       toperateType = this.recordType;
       if (toperateType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, toperateType);
       }
       toperateType = this.switchTabType;
       if (toperateType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, toperateType);
       }
       toperateType = this.pageSourceType;
       if (toperateType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, toperateType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveAdminOperatePackage mergeFrom(CodedInputByteBufferNano p0){
       int i3;
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          int i2 = 0;
          if (i != i1) {
             if (i != 10) {
                if (i != 16) {
                   i2 = 2;
                   i3 = 1;
                   if (i != 24) {
                      if (i != 32) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != i3 && i != i2)) {
                            continue ;
                         }else {
                            this.pageSourceType = i;
                         }
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != i3 && i != i2)) {
                         continue ;
                      }else {
                         this.switchTabType = i;
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
                       case 1:
                         break;
                       default:
                   }
                   this.recordType = i;
                }
             }else {
                i = p0.pushLimit(p0.readRawVarint32());
                i1 = p0.getPosition();
                i3 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   switch (p0.readInt32()){
                       case 0:
                       case 2:
                       case 3:
                       case 4:
                       case 5:
                       case 6:
                       case 7:
                       case 1:
                         break;
                       default:
                         continue ;
                   }
                   i3 = i3 + 1;
                }
                if (i3) {
                   p0.rewindToPosition(i1);
                   ClientContent$LiveAdminOperatePackage toperateType = this.operateType;
                   i4 = (toperateType == null)? 0: toperateType.length;
                   i3 = i3 + i4;
                   int[] ointArray = new int[i3];
                   if (i4) {
                      System.arraycopy(toperateType, i2, ointArray, i2, i4);
                   }
                   while (p0.getBytesUntilLimit() > 0) {
                      i1 = p0.readInt32();
                      switch (i1){
                          case 0:
                          case 2:
                          case 3:
                          case 4:
                          case 5:
                          case 6:
                          case 7:
                          case 1:
                            break;
                          default:
                            continue ;
                      }
                      i2 = i4 + 1;
                      ointArray[i4] = i1;
                      i4 = i2;
                   }
                   this.operateType = ointArray;
                }
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             int[] ointArray1 = new int[i];
             i3 = 0;
             i4 = 0;
             while (i3 < i) {
                if (i3) {
                   p0.readTag();
                }
                i5 = p0.readInt32();
                switch (i5){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 1:
                      int i6 = i4 + 1;
                      ointArray1[i4] = i5;
                      i4 = i6;
                      break;
                    default:
                }
                i3 = i3 + 1;
             }
             if (i4) {
                ClientContent$LiveAdminOperatePackage toperateType1 = this.operateType;
                i5 = (toperateType1 == null)? 0: toperateType1.length;
                if (!i5 && i4 == i) {
                   this.operateType = ointArray1;
                }else {
                   i = i5 + i4;
                   int[] ointArray2 = new int[i];
                   if (i5) {
                      System.arraycopy(toperateType1, i2, ointArray2, i2, i5);
                   }
                   System.arraycopy(ointArray1, i2, ointArray2, i5, i4);
                   this.operateType = ointArray2;
                }
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$LiveAdminOperatePackage toperateType = this.operateType;
       if (toperateType != null && toperateType.length > 0) {
          int i = 0;
          ClientContent$LiveAdminOperatePackage toperateType1 = this.operateType;
          while (i < toperateType1.length) {
             p0.writeInt32(1, toperateType1[i]);
             i = i + 1;
          }
       }
       toperateType = this.recordType;
       if (toperateType != null) {
          p0.writeInt32(2, toperateType);
       }
       toperateType = this.switchTabType;
       if (toperateType != null) {
          p0.writeInt32(3, toperateType);
       }
       toperateType = this.pageSourceType;
       if (toperateType != null) {
          p0.writeInt32(4, toperateType);
       }
       super.writeTo(p0);
       return;
    }
}
