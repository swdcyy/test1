package com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.lang.System;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$MicSeatUserHatInfo;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveStreamMessages$MicSeatUserInfo extends MessageNano	// class@0012ff
{
    public int avatarFramePreference;
    public String displayKsCoin;
    public boolean isMuted;
    public boolean isOpenVideo;
    public int liveAssistantType;
    public LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[] micSeatDecorationInterests;
    public long readyTime;
    public UserInfos$UserInfo user;
    public LiveStreamMessages$MicSeatUserHatInfo userHat;
    public int userLevel;
    public int[] userType;
    public static LiveStreamMessages$MicSeatUserInfo[] _emptyArray;

    public void LiveStreamMessages$MicSeatUserInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$MicSeatUserInfo[] emptyArray(){
       if (LiveStreamMessages$MicSeatUserInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$MicSeatUserInfo._emptyArray == null) {
             LiveStreamMessages$MicSeatUserInfo[] micSeatUserI = new LiveStreamMessages$MicSeatUserInfo[0];
             LiveStreamMessages$MicSeatUserInfo._emptyArray = micSeatUserI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$MicSeatUserInfo._emptyArray;
    }
    public static LiveStreamMessages$MicSeatUserInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$MicSeatUserInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$MicSeatUserInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$MicSeatUserInfo(), p0);
    }
    public LiveStreamMessages$MicSeatUserInfo clear(){
       this.user = null;
       this.isMuted = false;
       this.liveAssistantType = 0;
       this.userType = WireFormatNano.EMPTY_INT_ARRAY;
       this.displayKsCoin = "";
       this.userLevel = 0;
       this.userHat = null;
       this.isOpenVideo = false;
       this.readyTime = 0;
       this.micSeatDecorationInterests = LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest.emptyArray();
       this.avatarFramePreference = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$MicSeatUserInfo tuser = this.user;
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
       tuser = this.userType;
       int i2 = 0;
       if (tuser != null && tuser.length > 0) {
          int i3 = 0;
          int i4 = 0;
          LiveStreamMessages$MicSeatUserInfo tuserType = this.userType;
          while (i3 < tuserType.length) {
             i4 = i4 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tuserType[i3]);
             i3 = i3 + 1;
          }
          i = (i + i4) + (tuserType.length * 1);
       }
       if (!(this.displayKsCoin).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.displayKsCoin);
       }
       tuser = this.userLevel;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tuser);
       }
       tuser = this.userHat;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tuser);
       }
       tuser = this.isOpenVideo;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tuser);
       }
       tuser = this.readyTime;
       if (tuser) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tuser);
       }
       tuser = this.micSeatDecorationInterests;
       if (tuser != null && tuser.length > 0) {
          tuser = this.micSeatDecorationInterests;
          while (i2 < tuser.length) {
             object oobject = tuser[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tuser = this.avatarFramePreference;
       if (tuser != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(11, tuser);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$MicSeatUserInfo mergeFrom(CodedInputByteBufferNano p0){
       int i3;
       int i4;
       while (true) {
          int i = p0.readTag();
          LiveStreamMessages$MicSeatUserInfo micSeatUserI = 5;
          int i1 = 4;
          LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[] micSeatUserL = 3;
          int i2 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.user == null) {
                   this.user = new UserInfos$UserInfo();
                }
                p0.readMessage(this.user);
                break;
              case 16:
                this.isMuted = p0.readBool();
                break;
              case 24:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.liveAssistantType = i;
                }
                break;
              case 32:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 32);
                int[] ointArray = new int[i];
                i3 = 0;
                i4 = 0;
                while (i3 < i) {
                   if (i3) {
                      p0.readTag();
                   }
                   int i5 = p0.readInt32();
                   if (!i5 || (i5 == 1 || (i5 == 2 || (i5 == micSeatUserL || (i5 == i1 || i5 == micSeatUserI))))) {
                      int i6 = i4 + 1;
                      ointArray[i4] = i5;
                      i4 = i6;
                   }
                   i3 = i3 + 1;
                }
                if (i4) {
                   micSeatUserI = this.userType;
                   i1 = (micSeatUserI == null)? 0: micSeatUserI.length;
                   if (!i1 && i4 == i) {
                      this.userType = ointArray;
                   }else {
                      i = i1 + i4;
                      int[] ointArray1 = new int[i];
                      if (i1) {
                         System.arraycopy(micSeatUserI, i2, ointArray1, i2, i1);
                      }
                      System.arraycopy(ointArray, i2, ointArray1, i1, i4);
                      this.userType = ointArray1;
                   }
                }
                break;
              case '"':
                i = p0.pushLimit(p0.readRawVarint32());
                int position = p0.getPosition();
                i3 = 0;
                while (p0.getBytesUntilLimit() > 0) {
                   i4 = p0.readInt32();
                   if (i4 && (i4 != 1 && (i4 != 2 && (i4 != micSeatUserL && (i4 != i1 && i4 != micSeatUserI))))) {
                      continue ;
                   }
                   i3 = i3 + 1;
                }
                if (i3) {
                   p0.rewindToPosition(position);
                   LiveStreamMessages$MicSeatUserInfo tuserType = this.userType;
                   i4 = (tuserType == null)? 0: tuserType.length;
                   i3 = i3 + i4;
                   int[] ointArray2 = new int[i3];
                   if (i4) {
                      System.arraycopy(tuserType, i2, ointArray2, i2, i4);
                   }
                   while (p0.getBytesUntilLimit() > 0) {
                      i2 = p0.readInt32();
                      if (i2 && (i2 != 1 && (i2 != 2 && (i2 != micSeatUserL && (i2 != i1 && i2 != micSeatUserI))))) {
                         continue ;
                      }
                      position = i4 + 1;
                      ointArray2[i4] = i2;
                      i4 = position;
                   }
                   this.userType = ointArray2;
                }
                p0.popLimit(i);
                break;
              case '*':
                this.displayKsCoin = p0.readString();
                break;
              case '0':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != micSeatUserL))) {
                   continue ;
                }else {
                   this.userLevel = i;
                }
                break;
              case ':':
                if (this.userHat == null) {
                   this.userHat = new LiveStreamMessages$MicSeatUserHatInfo();
                }
                p0.readMessage(this.userHat);
                break;
              case '@':
                this.isOpenVideo = p0.readBool();
                break;
              case 'H':
                this.readyTime = p0.readUInt64();
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                micSeatUserI = this.micSeatDecorationInterests;
                i1 = (micSeatUserI == null)? 0: micSeatUserI.length;
                i = i + i1;
                micSeatUserL = new LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest[i];
                if (i1) {
                   System.arraycopy(micSeatUserI, i2, micSeatUserL, i2, i1);
                }
                int i7 = i - 1;
                while (i1 < i7) {
                   micSeatUserL[i1] = new LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest();
                   p0.readMessage(micSeatUserL[i1]);
                   p0.readTag();
                   i1 = i1 + 1;
                }
                micSeatUserL[i1] = new LiveStreamMessages$MicSeatUserLevelMicSeatDecorationInterest();
                p0.readMessage(micSeatUserL[i1]);
                this.micSeatDecorationInterests = micSeatUserL;
                break;
              case 'X':
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && i != micSeatUserL))) {
                   continue ;
                }else {
                   this.avatarFramePreference = i;
                }
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
       LiveStreamMessages$MicSeatUserInfo tuserType;
       LiveStreamMessages$MicSeatUserInfo tuser = this.user;
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
       tuser = this.userType;
       int i = 0;
       if (tuser != null && tuser.length > 0) {
          int i1 = 0;
          tuserType = this.userType;
          while (i1 < tuserType.length) {
             p0.writeInt32(4, tuserType[i1]);
             i1 = i1 + 1;
          }
       }
       if (!(this.displayKsCoin).equals("")) {
          p0.writeString(5, this.displayKsCoin);
       }
       tuser = this.userLevel;
       if (tuser != null) {
          p0.writeInt32(6, tuser);
       }
       tuser = this.userHat;
       if (tuser != null) {
          p0.writeMessage(7, tuser);
       }
       tuser = this.isOpenVideo;
       if (tuser != null) {
          p0.writeBool(8, tuser);
       }
       tuserType = this.readyTime;
       if (tuserType) {
          p0.writeUInt64(9, tuserType);
       }
       tuser = this.micSeatDecorationInterests;
       if (tuser != null && tuser.length > 0) {
          tuser = this.micSeatDecorationInterests;
          while (i < tuser.length) {
             object oobject = tuser[i];
             if (oobject != null) {
                p0.writeMessage(10, oobject);
             }
             i = i + 1;
          }
       }
       tuser = this.avatarFramePreference;
       if (tuser != null) {
          p0.writeInt32(11, tuser);
       }
       super.writeTo(p0);
       return;
    }
}
