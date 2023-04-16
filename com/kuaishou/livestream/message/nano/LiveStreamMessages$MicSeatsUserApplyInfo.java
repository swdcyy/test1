package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatsUserApplyInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$MicSeatsUserApplyInfo extends MessageNano	// class@001307
{
    public LiveAudienceState audienceState;
    public int liveAssistantType;
    public UserInfos$UserInfo user;
    public int[] userType;
    public static LiveStreamMessages$MicSeatsUserApplyInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatsUserApplyInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatsUserApplyInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatsUserApplyInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatsUserApplyInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatsUserApplyInfo[] micSeatsUser = new LiveStreamMessages$MicSeatsUserApplyInfo[0];
             LiveStreamMessages$MicSeatsUserApplyInfo._emptyArray = micSeatsUser;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatsUserApplyInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatsUserApplyInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatsUserApplyInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatsUserApplyInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatsUserApplyInfo(), p0);
    }
    public LiveStreamMessages$MicSeatsUserApplyInfo clear(){
       this.user = null;
       this.liveAssistantType = 0;
       this.userType = WireFormatNano.EMPTY_INT_ARRAY;
       this.audienceState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatsUserApplyInfo tuser = this.user;
       int i1 = 1;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuser);
       }
       tuser = this.userType;
       if (tuser != null && tuser.length > 0) {
          int i2 = 0;
          int i3 = 0;
          LiveStreamMessages$MicSeatsUserApplyInfo tuserType = this.userType;
          while (i2 < tuserType.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tuserType[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tuserType.length * 1);
       }
       tuser = this.audienceState;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatsUserApplyInfo mergeFrom(CodedInputByteBufferNano p0){
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             LiveStreamMessages$MicSeatsUserApplyInfo micSeatsUser = 2;
             int i1 = 1;
             if (i != 16) {
                int i2 = 24;
                int i3 = 0;
                if (i != i2) {
                   if (i != 26) {
                      if (i != 50) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else if(this.audienceState == null){
                         this.audienceState = new LiveAudienceState();
                      }
                      p0.readMessage(this.audienceState);
                   }else {
                      i = p0.pushLimit(p0.readRawVarint32());
                      i2 = p0.getPosition();
                      i4 = 0;
                      while (p0.getBytesUntilLimit() > 0) {
                         i5 = p0.readInt32();
                         if (i5 && (i5 != i1 && (i5 != micSeatsUser && (i5 != 3 && (i5 != 4 && i5 != 5))))) {
                            continue ;
                         }
                         i4 = i4 + 1;
                      }
                      if (i4) {
                         p0.rewindToPosition(i2);
                         LiveStreamMessages$MicSeatsUserApplyInfo tuserType = this.userType;
                         i5 = (tuserType == null)? 0: tuserType.length;
                         i4 = i4 + i5;
                         int[] ointArray = new int[i4];
                         if (i5) {
                            System.arraycopy(tuserType, i3, ointArray, i3, i5);
                         }
                         while (p0.getBytesUntilLimit() > 0) {
                            i2 = p0.readInt32();
                            if (i2 && (i2 != i1 && (i2 != micSeatsUser && (i2 != 3 && (i2 != 4 && i2 != 5))))) {
                               continue ;
                            }
                            i3 = i5 + 1;
                            ointArray[i5] = i2;
                            i5 = i3;
                         }
                         this.userType = ointArray;
                      }
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i2);
                   int[] ointArray1 = new int[i];
                   i4 = 0;
                   i5 = 0;
                   while (i4 < i) {
                      if (i4) {
                         p0.readTag();
                      }
                      int i6 = p0.readInt32();
                      if (!i6 || (i6 == i1 || (i6 == micSeatsUser || (i6 == 3 || (i6 == 4 || i6 == 5))))) {
                         int i7 = i5 + 1;
                         ointArray1[i5] = i6;
                         i5 = i7;
                      }
                      i4 = i4 + 1;
                   }
                   if (i5) {
                      micSeatsUser = this.userType;
                      i1 = (micSeatsUser == null)? 0: micSeatsUser.length;
                      if (!i1 && i5 == i) {
                         this.userType = ointArray1;
                      }else {
                         i = i1 + i5;
                         int[] ointArray2 = new int[i];
                         if (i1) {
                            System.arraycopy(micSeatsUser, i3, ointArray2, i3, i1);
                         }
                         System.arraycopy(ointArray1, i3, ointArray2, i1, i5);
                         this.userType = ointArray2;
                      }
                   }
                }
             }else {
                i = p0.readInt32();
                if (i && (i != i1 && i != micSeatsUser)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$MicSeatsUserApplyInfo tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(2, tuser);
       }
       tuser = this.userType;
       if (tuser != null && tuser.length > 0) {
          int i = 0;
          LiveStreamMessages$MicSeatsUserApplyInfo tuserType = this.userType;
          while (i < tuserType.length) {
             p0.writeInt32(3, tuserType[i]);
             i = i + 1;
          }
       }
       tuser = this.audienceState;
       if (tuser != null) {
          p0.writeMessage(6, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
