package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$MicSeatInfo extends MessageNano	// class@0012fa
{
    public LiveAudienceState audienceState;
    public boolean isForceMuted;
    public boolean isMuted;
    public int liveAssistantType;
    public UserInfos$UserInfo user;
    public int[] userType;
    public static LiveStreamMessages$MicSeatInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatInfo[] micSeatInfoA = new LiveStreamMessages$MicSeatInfo[0];
             LiveStreamMessages$MicSeatInfo._emptyArray = micSeatInfoA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatInfo(), p0);
    }
    public LiveStreamMessages$MicSeatInfo clear(){
       this.user = null;
       this.isMuted = false;
       this.liveAssistantType = 0;
       this.isForceMuted = false;
       this.userType = WireFormatNano.EMPTY_INT_ARRAY;
       this.audienceState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatInfo tuser = this.user;
       int i1 = 1;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, tuser);
       }
       tuser = this.isMuted;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuser);
       }
       tuser = this.isForceMuted;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tuser);
       }
       tuser = this.userType;
       if (tuser != null && tuser.length > 0) {
          int i2 = 0;
          int i3 = 0;
          LiveStreamMessages$MicSeatInfo tuserType = this.userType;
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
    public LiveStreamMessages$MicSeatInfo mergeFrom(CodedInputByteBufferNano p0){
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                LiveStreamMessages$MicSeatInfo micSeatInfo = 2;
                int i1 = 1;
                if (i != 24) {
                   if (i != 32) {
                      int i2 = 40;
                      int i3 = 0;
                      if (i != i2) {
                         if (i != 42) {
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
                               if (i5 && (i5 != i1 && (i5 != micSeatInfo && (i5 != 3 && (i5 != 4 && i5 != 5))))) {
                                  continue ;
                               }
                               i4 = i4 + 1;
                            }
                            if (i4) {
                               p0.rewindToPosition(i2);
                               LiveStreamMessages$MicSeatInfo tuserType = this.userType;
                               i5 = (tuserType == null)? 0: tuserType.length;
                               i4 = i4 + i5;
                               int[] ointArray = new int[i4];
                               if (i5) {
                                  System.arraycopy(tuserType, i3, ointArray, i3, i5);
                               }
                               while (p0.getBytesUntilLimit() > 0) {
                                  i2 = p0.readInt32();
                                  if (i2 && (i2 != i1 && (i2 != micSeatInfo && (i2 != 3 && (i2 != 4 && i2 != 5))))) {
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
                            if (!i6 || (i6 == i1 || (i6 == micSeatInfo || (i6 == 3 || (i6 == 4 || i6 == 5))))) {
                               int i7 = i5 + 1;
                               ointArray1[i5] = i6;
                               i5 = i7;
                            }
                            i4 = i4 + 1;
                         }
                         if (i5) {
                            micSeatInfo = this.userType;
                            i1 = (micSeatInfo == null)? 0: micSeatInfo.length;
                            if (!i1 && i5 == i) {
                               this.userType = ointArray1;
                            }else {
                               i = i1 + i5;
                               int[] ointArray2 = new int[i];
                               if (i1) {
                                  System.arraycopy(micSeatInfo, i3, ointArray2, i3, i1);
                               }
                               System.arraycopy(ointArray1, i3, ointArray2, i1, i5);
                               this.userType = ointArray2;
                            }
                         }
                      }
                   }else {
                      this.isForceMuted = p0.readBool();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != i1 && i != micSeatInfo)) {
                      continue ;
                   }else {
                      this.liveAssistantType = i;
                   }
                }
             }else {
                this.isMuted = p0.readBool();
             }
          }else if(this.user == null){
             this.user = new UserInfos$UserInfo();
          }
          p0.readMessage(this.user);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$MicSeatInfo tuser = this.user;
       if (tuser != null) {
          p0.writeMessage(1, tuser);
       }
       tuser = this.isMuted;
       if (tuser != null) {
          p0.writeBool(2, tuser);
       }
       tuser = this.liveAssistantType;
       if (tuser != null) {
          p0.writeInt32(3, tuser);
       }
       tuser = this.isForceMuted;
       if (tuser != null) {
          p0.writeBool(4, tuser);
       }
       tuser = this.userType;
       if (tuser != null && tuser.length > 0) {
          int i = 0;
          LiveStreamMessages$MicSeatInfo tuserType = this.userType;
          while (i < tuserType.length) {
             p0.writeInt32(5, tuserType[i]);
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
