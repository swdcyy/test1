package com.kuaishou.protobuf.livestream.nano.SCLiveOverRoomMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import java.lang.Object;
import java.lang.System;

public final class SCLiveOverRoomMessage extends MessageNano	// class@000d6d
{
    public long[] disableAuthor;
    public int[] disableLiveStreamType;
    public byte[] messagePayload;
    public int messageType;
    public int[] onlyEnableLiveStreamType;
    public static SCLiveOverRoomMessage[] _emptyArray;

    public void SCLiveOverRoomMessage(){
       super();
       this.clear();
    }
    public static SCLiveOverRoomMessage[] emptyArray(){
       if (SCLiveOverRoomMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveOverRoomMessage._emptyArray == null) {
             SCLiveOverRoomMessage[] sCLiveOverRo = new SCLiveOverRoomMessage[0];
             SCLiveOverRoomMessage._emptyArray = sCLiveOverRo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveOverRoomMessage._emptyArray;
    }
    public static SCLiveOverRoomMessage parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveOverRoomMessage().mergeFrom(p0);
    }
    public static SCLiveOverRoomMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveOverRoomMessage(), p0);
    }
    public SCLiveOverRoomMessage clear(){
       this.messageType = 0;
       this.messagePayload = WireFormatNano.EMPTY_BYTES;
       int[] eMPTY_INT_AR = WireFormatNano.EMPTY_INT_ARRAY;
       this.disableLiveStreamType = eMPTY_INT_AR;
       this.onlyEnableLiveStreamType = eMPTY_INT_AR;
       this.disableAuthor = WireFormatNano.EMPTY_LONG_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i3;
       SCLiveOverRoomMessage tdisableLive;
       int i = super.computeSerializedSize();
       SCLiveOverRoomMessage tmessageType = this.messageType;
       if (tmessageType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tmessageType);
       }
       if (!Arrays.equals(this.messagePayload, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.messagePayload);
       }
       tmessageType = this.disableLiveStreamType;
       int i1 = 0;
       if (tmessageType != null && tmessageType.length > 0) {
          i2 = 0;
          i3 = 0;
          tdisableLive = this.disableLiveStreamType;
          while (i2 < tdisableLive.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tdisableLive[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tdisableLive.length * 1);
       }
       tmessageType = this.onlyEnableLiveStreamType;
       if (tmessageType != null && tmessageType.length > 0) {
          i2 = 0;
          i3 = 0;
          tdisableLive = this.onlyEnableLiveStreamType;
          while (i2 < tdisableLive.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt32SizeNoTag(tdisableLive[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tdisableLive.length * 1);
       }
       tmessageType = this.disableAuthor;
       if (tmessageType != null && tmessageType.length > 0) {
          i2 = 0;
          SCLiveOverRoomMessage tdisableAuth = this.disableAuthor;
          while (i1 < tdisableAuth.length) {
             i2 = i2 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tdisableAuth[i1]);
             i1 = i1 + 1;
          }
          i = (i + i2) + (tdisableAuth.length * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveOverRoomMessage mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       SCLiveOverRoomMessage tdisableAuth;
       int i3;
       int[] ointArray;
       int[] ointArray1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 24;
                if (i != i1) {
                   if (i != 26) {
                      i1 = 32;
                      if (i != i1) {
                         if (i != 34) {
                            i1 = 40;
                            if (i != i1) {
                               if (i != 42) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = p0.pushLimit(p0.readRawVarint32());
                                  i1 = p0.getPosition();
                                  i2 = 0;
                                  while (p0.getBytesUntilLimit() > 0) {
                                     p0.readUInt64();
                                     i2 = i2 + 1;
                                  }
                                  p0.rewindToPosition(i1);
                                  tdisableAuth = this.disableAuthor;
                                  i3 = (tdisableAuth == null)? 0: tdisableAuth.length;
                                  i2 = i2 + i3;
                                  long[] olongArray = new long[i2];
                                  if (i3) {
                                     System.arraycopy(tdisableAuth, 0, olongArray, 0, i3);
                                  }
                                  while (i3 < i2) {
                                     olongArray[i3] = p0.readUInt64();
                                     i3 = i3 + 1;
                                  }
                                  this.disableAuthor = olongArray;
                                  p0.popLimit(i);
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tdisableAuth = this.disableAuthor;
                               i2 = (tdisableAuth == null)? 0: tdisableAuth.length;
                               i = i + i2;
                               long[] olongArray1 = new long[i];
                               if (i2) {
                                  System.arraycopy(tdisableAuth, 0, olongArray1, 0, i2);
                               }
                               i1 = i - 1;
                               while (i2 < i1) {
                                  olongArray1[i2] = p0.readUInt64();
                                  p0.readTag();
                                  i2 = i2 + 1;
                               }
                               olongArray1[i2] = p0.readUInt64();
                               this.disableAuthor = olongArray1;
                            }
                         }else {
                            i = p0.pushLimit(p0.readRawVarint32());
                            i1 = p0.getPosition();
                            i2 = 0;
                            while (p0.getBytesUntilLimit() > 0) {
                               p0.readUInt32();
                               i2 = i2 + 1;
                            }
                            p0.rewindToPosition(i1);
                            tdisableAuth = this.onlyEnableLiveStreamType;
                            i3 = (tdisableAuth == null)? 0: tdisableAuth.length;
                            i2 = i2 + i3;
                            ointArray = new int[i2];
                            if (i3) {
                               System.arraycopy(tdisableAuth, 0, ointArray, 0, i3);
                            }
                            while (i3 < i2) {
                               ointArray[i3] = p0.readUInt32();
                               i3 = i3 + 1;
                            }
                            this.onlyEnableLiveStreamType = ointArray;
                            p0.popLimit(i);
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         tdisableAuth = this.onlyEnableLiveStreamType;
                         i2 = (tdisableAuth == null)? 0: tdisableAuth.length;
                         i = i + i2;
                         ointArray1 = new int[i];
                         if (i2) {
                            System.arraycopy(tdisableAuth, 0, ointArray1, 0, i2);
                         }
                         i1 = i - 1;
                         while (i2 < i1) {
                            ointArray1[i2] = p0.readUInt32();
                            p0.readTag();
                            i2 = i2 + 1;
                         }
                         ointArray1[i2] = p0.readUInt32();
                         this.onlyEnableLiveStreamType = ointArray1;
                      }
                   }else {
                      i = p0.pushLimit(p0.readRawVarint32());
                      i1 = p0.getPosition();
                      i2 = 0;
                      while (p0.getBytesUntilLimit() > 0) {
                         p0.readUInt32();
                         i2 = i2 + 1;
                      }
                      p0.rewindToPosition(i1);
                      tdisableAuth = this.disableLiveStreamType;
                      i3 = (tdisableAuth == null)? 0: tdisableAuth.length;
                      i2 = i2 + i3;
                      ointArray = new int[i2];
                      if (i3) {
                         System.arraycopy(tdisableAuth, 0, ointArray, 0, i3);
                      }
                      while (i3 < i2) {
                         ointArray[i3] = p0.readUInt32();
                         i3 = i3 + 1;
                      }
                      this.disableLiveStreamType = ointArray;
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tdisableAuth = this.disableLiveStreamType;
                   i2 = (tdisableAuth == null)? 0: tdisableAuth.length;
                   i = i + i2;
                   ointArray1 = new int[i];
                   if (i2) {
                      System.arraycopy(tdisableAuth, 0, ointArray1, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      ointArray1[i2] = p0.readUInt32();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   ointArray1[i2] = p0.readUInt32();
                   this.disableLiveStreamType = ointArray1;
                }
             }else {
                this.messagePayload = p0.readBytes();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.messageType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       SCLiveOverRoomMessage tdisableLive;
       SCLiveOverRoomMessage tmessageType = this.messageType;
       if (tmessageType != null) {
          p0.writeInt32(1, tmessageType);
       }
       if (!Arrays.equals(this.messagePayload, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.messagePayload);
       }
       tmessageType = this.disableLiveStreamType;
       int i = 0;
       if (tmessageType != null && tmessageType.length > 0) {
          i1 = 0;
          tdisableLive = this.disableLiveStreamType;
          while (i1 < tdisableLive.length) {
             p0.writeUInt32(3, tdisableLive[i1]);
             i1 = i1 + 1;
          }
       }
       tmessageType = this.onlyEnableLiveStreamType;
       if (tmessageType != null && tmessageType.length > 0) {
          i1 = 0;
          tdisableLive = this.onlyEnableLiveStreamType;
          while (i1 < tdisableLive.length) {
             p0.writeUInt32(4, tdisableLive[i1]);
             i1 = i1 + 1;
          }
       }
       tmessageType = this.disableAuthor;
       if (tmessageType != null && tmessageType.length > 0) {
          tmessageType = this.disableAuthor;
          while (i < tmessageType.length) {
             p0.writeUInt64(5, tmessageType[i]);
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
