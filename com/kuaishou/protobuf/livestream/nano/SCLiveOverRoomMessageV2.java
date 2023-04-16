package com.kuaishou.protobuf.livestream.nano.SCLiveOverRoomMessageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.protobuf.livestream.nano.LiveOverRoomMessageDisplayInfoOld;
import com.kuaishou.protobuf.livestream.nano.LiveOverRoomMessageDisplayInfo;
import java.lang.System;

public final class SCLiveOverRoomMessageV2 extends MessageNano	// class@000d6e
{
    public int bizType;
    public long delayTimeMs;
    public long[] disableAuthor;
    public int[] disableLiveStreamType;
    public LiveOverRoomMessageDisplayInfo displayInfo;
    public LiveOverRoomMessageDisplayInfoOld displayInfoOld;
    public String messageId;
    public int messageType;
    public int[] onlyEnableLiveStreamType;
    public static SCLiveOverRoomMessageV2[] _emptyArray;

    public void SCLiveOverRoomMessageV2(){
       super();
       this.clear();
    }
    public static SCLiveOverRoomMessageV2[] emptyArray(){
       if (SCLiveOverRoomMessageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveOverRoomMessageV2._emptyArray == null) {
             SCLiveOverRoomMessageV2[] sCLiveOverRo = new SCLiveOverRoomMessageV2[0];
             SCLiveOverRoomMessageV2._emptyArray = sCLiveOverRo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveOverRoomMessageV2._emptyArray;
    }
    public static SCLiveOverRoomMessageV2 parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveOverRoomMessageV2().mergeFrom(p0);
    }
    public static SCLiveOverRoomMessageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveOverRoomMessageV2(), p0);
    }
    public SCLiveOverRoomMessageV2 clear(){
       int[] eMPTY_INT_AR = WireFormatNano.EMPTY_INT_ARRAY;
       this.disableLiveStreamType = eMPTY_INT_AR;
       this.onlyEnableLiveStreamType = eMPTY_INT_AR;
       this.disableAuthor = WireFormatNano.EMPTY_LONG_ARRAY;
       this.displayInfo = null;
       this.bizType = 0;
       this.displayInfoOld = null;
       this.messageId = "";
       this.messageType = 0;
       this.delayTimeMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i3;
       SCLiveOverRoomMessageV2 tdisableLive1;
       int i = super.computeSerializedSize();
       SCLiveOverRoomMessageV2 tdisableLive = this.disableLiveStreamType;
       int i1 = 0;
       if (tdisableLive != null && tdisableLive.length > 0) {
          i2 = 0;
          i3 = 0;
          tdisableLive1 = this.disableLiveStreamType;
          while (i2 < tdisableLive1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tdisableLive1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tdisableLive1.length * 1);
       }
       tdisableLive = this.onlyEnableLiveStreamType;
       if (tdisableLive != null && tdisableLive.length > 0) {
          i2 = 0;
          i3 = 0;
          tdisableLive1 = this.onlyEnableLiveStreamType;
          while (i2 < tdisableLive1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tdisableLive1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tdisableLive1.length * 1);
       }
       tdisableLive = this.disableAuthor;
       if (tdisableLive != null && tdisableLive.length > 0) {
          i2 = 0;
          SCLiveOverRoomMessageV2 tdisableAuth = this.disableAuthor;
          while (i1 < tdisableAuth.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tdisableAuth[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tdisableAuth.length * 1);
       }
       tdisableLive = this.displayInfo;
       if (tdisableLive != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tdisableLive);
       }
       tdisableLive = this.bizType;
       if (tdisableLive != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tdisableLive);
       }
       tdisableLive = this.displayInfoOld;
       if (tdisableLive != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tdisableLive);
       }
       if (!(this.messageId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.messageId);
       }
       tdisableLive = this.messageType;
       if (tdisableLive != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(12, tdisableLive);
       }
       tdisableLive = this.delayTimeMs;
       if (tdisableLive) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(13, tdisableLive);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveOverRoomMessageV2 mergeFrom(CodedInputByteBufferNano p0){
       SCLiveOverRoomMessageV2 tdisableLive;
       int i2;
       int[] ointArray;
       int position;
       int i3;
       int[] ointArray1;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 8:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 8);
                tdisableLive = this.disableLiveStreamType;
                i2 = (tdisableLive == null)? 0: tdisableLive.length;
                i = i + i2;
                ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tdisableLive, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readUInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readUInt32();
                this.disableLiveStreamType = ointArray;
                break;
              case 10:
                i = p0.pushLimit(p0.readRawVarint32());
                position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tdisableLive = this.disableLiveStreamType;
                i3 = (tdisableLive == null)? 0: tdisableLive.length;
                i2 = i2 + i3;
                ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tdisableLive, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.disableLiveStreamType = ointArray1;
                p0.popLimit(i);
                break;
              case 16:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 16);
                tdisableLive = this.onlyEnableLiveStreamType;
                i2 = (tdisableLive == null)? 0: tdisableLive.length;
                i = i + i2;
                ointArray = new int[i];
                if (i2) {
                   System.arraycopy(tdisableLive, i1, ointArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   ointArray[i2] = p0.readUInt32();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                ointArray[i2] = p0.readUInt32();
                this.onlyEnableLiveStreamType = ointArray;
                break;
              case 18:
                i = p0.pushLimit(p0.readRawVarint32());
                position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt32();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tdisableLive = this.onlyEnableLiveStreamType;
                i3 = (tdisableLive == null)? 0: tdisableLive.length;
                i2 = i2 + i3;
                ointArray1 = new int[i2];
                if (i3) {
                   System.arraycopy(tdisableLive, i1, ointArray1, i1, i3);
                }
                while (i3 < i2) {
                   ointArray1[i3] = p0.readUInt32();
                   i3 = i3 + 1;
                }
                this.onlyEnableLiveStreamType = ointArray1;
                p0.popLimit(i);
                break;
              case 24:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 24);
                tdisableLive = this.disableAuthor;
                i2 = (tdisableLive == null)? 0: tdisableLive.length;
                i = i + i2;
                long[] olongArray = new long[i];
                if (i2) {
                   System.arraycopy(tdisableLive, i1, olongArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   olongArray[i2] = p0.readUInt64();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                olongArray[i2] = p0.readUInt64();
                this.disableAuthor = olongArray;
                break;
              case 26:
                i = p0.pushLimit(p0.readRawVarint32());
                position = p0.getPosition();
                i2 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   p0.readUInt64();
                   i2 = i2 + 1;
                }
                p0.rewindToPosition(position);
                tdisableLive = this.disableAuthor;
                i3 = (tdisableLive == null)? 0: tdisableLive.length;
                i2 = i2 + i3;
                long[] olongArray1 = new long[i2];
                if (i3) {
                   System.arraycopy(tdisableLive, i1, olongArray1, i1, i3);
                }
                while (i3 < i2) {
                   olongArray1[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.disableAuthor = olongArray1;
                p0.popLimit(i);
                break;
              case '"':
                if (this.displayInfo == null) {
                   this.displayInfo = new LiveOverRoomMessageDisplayInfo();
                }
                p0.readMessage(this.displayInfo);
                break;
              case '(':
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
                    case 1:
                      break;
                    default:
                }
                this.bizType = i;
                break;
              case 'R':
                if (this.displayInfoOld == null) {
                   this.displayInfoOld = new LiveOverRoomMessageDisplayInfoOld();
                }
                p0.readMessage(this.displayInfoOld);
                break;
              case 'Z':
                this.messageId = p0.readString();
                break;
              case '`':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != 3))) {
                   continue ;
                }else {
                   this.messageType = i;
                }
                break;
              case 'h':
                this.delayTimeMs = p0.readUInt64();
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
       int i1;
       SCLiveOverRoomMessageV2 tdisableLive1;
       SCLiveOverRoomMessageV2 tdisableLive = this.disableLiveStreamType;
       int i = 0;
       if (tdisableLive != null && tdisableLive.length > 0) {
          i1 = 0;
          tdisableLive1 = this.disableLiveStreamType;
          while (i1 < tdisableLive1.length) {
             p0.writeUInt32(1, tdisableLive1[i1]);
             i1 = i1 + 1;
          }
       }
       tdisableLive = this.onlyEnableLiveStreamType;
       if (tdisableLive != null && tdisableLive.length > 0) {
          i1 = 0;
          tdisableLive1 = this.onlyEnableLiveStreamType;
          while (i1 < tdisableLive1.length) {
             p0.writeUInt32(2, tdisableLive1[i1]);
             i1 = i1 + 1;
          }
       }
       tdisableLive = this.disableAuthor;
       if (tdisableLive != null && tdisableLive.length > 0) {
          tdisableLive = this.disableAuthor;
          while (i < tdisableLive.length) {
             p0.writeUInt64(3, tdisableLive[i]);
             i = i + 1;
          }
       }
       tdisableLive = this.displayInfo;
       if (tdisableLive != null) {
          p0.writeMessage(4, tdisableLive);
       }
       tdisableLive = this.bizType;
       if (tdisableLive != null) {
          p0.writeInt32(5, tdisableLive);
       }
       tdisableLive = this.displayInfoOld;
       if (tdisableLive != null) {
          p0.writeMessage(10, tdisableLive);
       }
       if (!(this.messageId).equals("")) {
          p0.writeString(11, this.messageId);
       }
       tdisableLive = this.messageType;
       if (tdisableLive != null) {
          p0.writeInt32(12, tdisableLive);
       }
       tdisableLive = this.delayTimeMs;
       if (tdisableLive) {
          p0.writeUInt64(13, tdisableLive);
       }
       super.writeTo(p0);
       return;
    }
}
