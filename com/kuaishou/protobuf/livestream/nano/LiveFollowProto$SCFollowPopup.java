package com.kuaishou.protobuf.livestream.nano.LiveFollowProto$SCFollowPopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveFollowProto$FollowPopupUserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveFollowProto$SCFollowPopup extends MessageNano	// class@000c8d
{
    public int activityType;
    public long displayDuration;
    public long followRequestMaxDelayMs;
    public long maxWaitAacSignalTimeMs;
    public int popupStyle;
    public long sequenceId;
    public long[] userId;
    public LiveFollowProto$FollowPopupUserInfo[] userInfo;
    public static LiveFollowProto$SCFollowPopup[] _emptyArray;

    public void LiveFollowProto$SCFollowPopup(){
       super();
       this.clear();
    }
    public static LiveFollowProto$SCFollowPopup[] emptyArray(){
       if (LiveFollowProto$SCFollowPopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFollowProto$SCFollowPopup._emptyArray == null) {
             LiveFollowProto$SCFollowPopup[] sCFollowPopu = new LiveFollowProto$SCFollowPopup[0];
             LiveFollowProto$SCFollowPopup._emptyArray = sCFollowPopu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFollowProto$SCFollowPopup._emptyArray;
    }
    public static LiveFollowProto$SCFollowPopup parseFrom(CodedInputByteBufferNano p0){
       return new LiveFollowProto$SCFollowPopup().mergeFrom(p0);
    }
    public static LiveFollowProto$SCFollowPopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFollowProto$SCFollowPopup(), p0);
    }
    public LiveFollowProto$SCFollowPopup clear(){
       this.userId = WireFormatNano.EMPTY_LONG_ARRAY;
       this.maxWaitAacSignalTimeMs = 0;
       this.displayDuration = 0;
       this.sequenceId = 0;
       this.followRequestMaxDelayMs = 0;
       this.popupStyle = 0;
       this.activityType = 0;
       this.userInfo = LiveFollowProto$FollowPopupUserInfo.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFollowProto$SCFollowPopup tuserId = this.userId;
       int i1 = 0;
       if (tuserId != null && tuserId.length > 0) {
          int i2 = 0;
          int i3 = 0;
          LiveFollowProto$SCFollowPopup tuserId1 = this.userId;
          while (i2 < tuserId1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeUInt64SizeNoTag(tuserId1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tuserId1.length * 1);
       }
       LiveFollowProto$SCFollowPopup tmaxWaitAacS = this.maxWaitAacSignalTimeMs;
       if (tmaxWaitAacS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tmaxWaitAacS);
       }
       tmaxWaitAacS = this.displayDuration;
       if (tmaxWaitAacS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmaxWaitAacS);
       }
       tmaxWaitAacS = this.sequenceId;
       if (tmaxWaitAacS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tmaxWaitAacS);
       }
       tmaxWaitAacS = this.followRequestMaxDelayMs;
       if (tmaxWaitAacS) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tmaxWaitAacS);
       }
       tuserId = this.popupStyle;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuserId);
       }
       tuserId = this.activityType;
       if (tuserId != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tuserId);
       }
       tuserId = this.userInfo;
       if (tuserId != null && tuserId.length > 0) {
          tuserId = this.userInfo;
          while (i1 < tuserId.length) {
             object oobject = tuserId[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFollowProto$SCFollowPopup mergeFrom(CodedInputByteBufferNano p0){
       int i2;
       LiveFollowProto$SCFollowPopup tuserInfo;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 8;
          if (i != i1) {
             if (i != 10) {
                if (i != 16) {
                   if (i != 24) {
                      if (i != 32) {
                         if (i != 40) {
                            i2 = 1;
                            if (i != 48) {
                               if (i != 56) {
                                  i1 = 66;
                                  if (i != i1) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                     tuserInfo = this.userInfo;
                                     i2 = (tuserInfo == null)? 0: tuserInfo.length;
                                     i = i + i2;
                                     LiveFollowProto$FollowPopupUserInfo[] uFollowPopup = new LiveFollowProto$FollowPopupUserInfo[i];
                                     if (i2) {
                                        System.arraycopy(tuserInfo, 0, uFollowPopup, 0, i2);
                                     }
                                     i1 = i - 1;
                                     while (i2 < i1) {
                                        uFollowPopup[i2] = new LiveFollowProto$FollowPopupUserInfo();
                                        p0.readMessage(uFollowPopup[i2]);
                                        p0.readTag();
                                        i2 = i2 + 1;
                                     }
                                     uFollowPopup[i2] = new LiveFollowProto$FollowPopupUserInfo();
                                     p0.readMessage(uFollowPopup[i2]);
                                     this.userInfo = uFollowPopup;
                                  }
                               }else {
                                  i = p0.readInt32();
                                  if (i && (i != i2 && i != 2)) {
                                     continue ;
                                  }else {
                                     this.activityType = i;
                                  }
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && i != i2) {
                                  continue ;
                               }else {
                                  this.popupStyle = i;
                               }
                            }
                         }else {
                            this.followRequestMaxDelayMs = p0.readUInt64();
                         }
                      }else {
                         this.sequenceId = p0.readUInt64();
                      }
                   }else {
                      this.displayDuration = p0.readUInt64();
                   }
                }else {
                   this.maxWaitAacSignalTimeMs = p0.readUInt64();
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
                tuserInfo = this.userId;
                int i3 = (tuserInfo == null)? 0: tuserInfo.length;
                i2 = i2 + i3;
                long[] olongArray = new long[i2];
                if (i3) {
                   System.arraycopy(tuserInfo, 0, olongArray, 0, i3);
                }
                while (i3 < i2) {
                   olongArray[i3] = p0.readUInt64();
                   i3 = i3 + 1;
                }
                this.userId = olongArray;
                p0.popLimit(i);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tuserInfo = this.userId;
             i2 = (tuserInfo == null)? 0: tuserInfo.length;
             i = i + i2;
             long[] olongArray1 = new long[i];
             if (i2) {
                System.arraycopy(tuserInfo, 0, olongArray1, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                olongArray1[i2] = p0.readUInt64();
                p0.readTag();
                i2 = i2 + 1;
             }
             olongArray1[i2] = p0.readUInt64();
             this.userId = olongArray1;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFollowProto$SCFollowPopup tuserId1;
       LiveFollowProto$SCFollowPopup tuserId = this.userId;
       int i = 0;
       if (tuserId != null && tuserId.length > 0) {
          int i1 = 0;
          tuserId1 = this.userId;
          while (i1 < tuserId1.length) {
             p0.writeUInt64(1, tuserId1[i1]);
             i1 = i1 + 1;
          }
       }
       tuserId1 = this.maxWaitAacSignalTimeMs;
       if (tuserId1) {
          p0.writeUInt64(2, tuserId1);
       }
       tuserId1 = this.displayDuration;
       if (tuserId1) {
          p0.writeUInt64(3, tuserId1);
       }
       tuserId1 = this.sequenceId;
       if (tuserId1) {
          p0.writeUInt64(4, tuserId1);
       }
       tuserId1 = this.followRequestMaxDelayMs;
       if (tuserId1) {
          p0.writeUInt64(5, tuserId1);
       }
       tuserId = this.popupStyle;
       if (tuserId != null) {
          p0.writeInt32(6, tuserId);
       }
       tuserId = this.activityType;
       if (tuserId != null) {
          p0.writeInt32(7, tuserId);
       }
       tuserId = this.userInfo;
       if (tuserId != null && tuserId.length > 0) {
          tuserId = this.userInfo;
          while (i < tuserId.length) {
             object oobject = tuserId[i];
             if (oobject != null) {
                p0.writeMessage(8, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
