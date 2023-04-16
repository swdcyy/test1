package com.kuaishou.livestream.message.nano.LiveCommonEffectInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveEffectExtraResInfo;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveCommonEffectInfo extends MessageNano	// class@00114d
{
    public int banBizType;
    public String bizExtraInfo;
    public String[] blackUser;
    public boolean cannotBebreak;
    public boolean displayImmediately;
    public int effectBiz;
    public String effectiveKey;
    public long expireDurationMs;
    public String extraInfo;
    public LiveEffectExtraResInfo[] extraResInfo;
    public UserInfos$UserInfo fromUser;
    public boolean isControlledByAuthor;
    public boolean isFaceFollowingEffect;
    public String liveStreamId;
    public String mergeKey;
    public int rank;
    public int sendInfoToYtechTime;
    public boolean showNickname;
    public boolean showUserHeadPic;
    public boolean streamMerge;
    public long time;
    public UserInfos$UserInfo toUser;
    public static LiveCommonEffectInfo[] _emptyArray;

    public void LiveCommonEffectInfo(){
       super();
       this.clear();
    }
    public static LiveCommonEffectInfo[] emptyArray(){
       if (LiveCommonEffectInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonEffectInfo._emptyArray == null) {
             LiveCommonEffectInfo[] liveCommonEf = new LiveCommonEffectInfo[0];
             LiveCommonEffectInfo._emptyArray = liveCommonEf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonEffectInfo._emptyArray;
    }
    public static LiveCommonEffectInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonEffectInfo().mergeFrom(p0);
    }
    public static LiveCommonEffectInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonEffectInfo(), p0);
    }
    public LiveCommonEffectInfo clear(){
       this.effectiveKey = "";
       this.mergeKey = "";
       this.rank = 0;
       this.time = 0;
       this.fromUser = null;
       this.toUser = null;
       this.liveStreamId = "";
       this.expireDurationMs = 0;
       this.displayImmediately = false;
       this.isControlledByAuthor = false;
       this.showUserHeadPic = false;
       this.showNickname = false;
       this.effectBiz = 0;
       this.streamMerge = false;
       this.extraInfo = "";
       this.isFaceFollowingEffect = false;
       this.banBizType = 0;
       this.blackUser = WireFormatNano.EMPTY_STRING_ARRAY;
       this.bizExtraInfo = "";
       this.extraResInfo = LiveEffectExtraResInfo.emptyArray();
       this.sendInfoToYtechTime = 0;
       this.cannotBebreak = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.effectiveKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.effectiveKey);
       }
       if (!(this.mergeKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.mergeKey);
       }
       LiveCommonEffectInfo trank = this.rank;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, trank);
       }
       LiveCommonEffectInfo ttime = this.time;
       int i1 = 0;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, ttime);
       }
       trank = this.fromUser;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, trank);
       }
       trank = this.toUser;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, trank);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.liveStreamId);
       }
       ttime = this.expireDurationMs;
       if (ttime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, ttime);
       }
       trank = this.displayImmediately;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, trank);
       }
       trank = this.isControlledByAuthor;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, trank);
       }
       trank = this.showUserHeadPic;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, trank);
       }
       trank = this.showNickname;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, trank);
       }
       trank = this.effectBiz;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(13, trank);
       }
       trank = this.streamMerge;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(14, trank);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(15, this.extraInfo);
       }
       trank = this.isFaceFollowingEffect;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(16, trank);
       }
       trank = this.banBizType;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(17, trank);
       }
       trank = this.blackUser;
       int i2 = 0;
       if (trank != null && trank.length > 0) {
          int i3 = 0;
          int i4 = 0;
          i1 = 0;
          LiveCommonEffectInfo tblackUser = this.blackUser;
          while (i3 < tblackUser.length) {
             object oobject = tblackUser[i3];
             if (oobject != null) {
                i1 = i1 + 1;
                i4 = i4 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i3 = i3 + 1;
          }
          i = (i + i4) + (i1 * 2);
       }
       if (!(this.bizExtraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(19, this.bizExtraInfo);
       }
       trank = this.extraResInfo;
       if (trank != null && trank.length > 0) {
          trank = this.extraResInfo;
          while (i2 < trank.length) {
             object oobject1 = trank[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(20, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       trank = this.sendInfoToYtechTime;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(21, trank);
       }
       trank = this.cannotBebreak;
       if (trank != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(22, trank);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonEffectInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveCommonEffectInfo tblackUser;
       int i2;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.effectiveKey = p0.readString();
                break;
              case 18:
                this.mergeKey = p0.readString();
                break;
              case 24:
                this.rank = p0.readUInt32();
                break;
              case 32:
                this.time = p0.readUInt64();
                break;
              case '*':
                if (this.fromUser == null) {
                   this.fromUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.fromUser);
                break;
              case '2':
                if (this.toUser == null) {
                   this.toUser = new UserInfos$UserInfo();
                }
                p0.readMessage(this.toUser);
                break;
              case ':':
                this.liveStreamId = p0.readString();
                break;
              case '@':
                this.expireDurationMs = p0.readUInt64();
                break;
              case 'H':
                this.displayImmediately = p0.readBool();
                break;
              case 'P':
                this.isControlledByAuthor = p0.readBool();
                break;
              case 'X':
                this.showUserHeadPic = p0.readBool();
                break;
              case '`':
                this.showNickname = p0.readBool();
                break;
              case 'h':
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
                this.effectBiz = i;
                break;
              case 'p':
                this.streamMerge = p0.readBool();
                break;
              case 'z':
                this.extraInfo = p0.readString();
                break;
              case 128:
                this.isFaceFollowingEffect = p0.readBool();
                break;
              case 136:
                this.banBizType = p0.readUInt32();
                break;
              case 146:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 146);
                tblackUser = this.blackUser;
                i2 = (tblackUser == null)? 0: tblackUser.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tblackUser, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.blackUser = stringArray;
                break;
              case 154:
                this.bizExtraInfo = p0.readString();
                break;
              case 162:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 162);
                tblackUser = this.extraResInfo;
                i2 = (tblackUser == null)? 0: tblackUser.length;
                i = i + i2;
                LiveEffectExtraResInfo[] liveEffectEx = new LiveEffectExtraResInfo[i];
                if (i2) {
                   System.arraycopy(tblackUser, i1, liveEffectEx, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveEffectEx[i2] = new LiveEffectExtraResInfo();
                   p0.readMessage(liveEffectEx[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveEffectEx[i2] = new LiveEffectExtraResInfo();
                p0.readMessage(liveEffectEx[i2]);
                this.extraResInfo = liveEffectEx;
                break;
              case 168:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.sendInfoToYtechTime = i;
                }
                break;
              case 176:
                this.cannotBebreak = p0.readBool();
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
       String str = "";
       if (!(this.effectiveKey).equals(str)) {
          p0.writeString(1, this.effectiveKey);
       }
       if (!(this.mergeKey).equals(str)) {
          p0.writeString(2, this.mergeKey);
       }
       LiveCommonEffectInfo trank = this.rank;
       if (trank != null) {
          p0.writeUInt32(3, trank);
       }
       LiveCommonEffectInfo ttime = this.time;
       int i = 0;
       if (ttime - i) {
          p0.writeUInt64(4, ttime);
       }
       trank = this.fromUser;
       if (trank != null) {
          p0.writeMessage(5, trank);
       }
       trank = this.toUser;
       if (trank != null) {
          p0.writeMessage(6, trank);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(7, this.liveStreamId);
       }
       ttime = this.expireDurationMs;
       if (ttime - i) {
          p0.writeUInt64(8, ttime);
       }
       trank = this.displayImmediately;
       if (trank != null) {
          p0.writeBool(9, trank);
       }
       trank = this.isControlledByAuthor;
       if (trank != null) {
          p0.writeBool(10, trank);
       }
       trank = this.showUserHeadPic;
       if (trank != null) {
          p0.writeBool(11, trank);
       }
       trank = this.showNickname;
       if (trank != null) {
          p0.writeBool(12, trank);
       }
       trank = this.effectBiz;
       if (trank != null) {
          p0.writeInt32(13, trank);
       }
       trank = this.streamMerge;
       if (trank != null) {
          p0.writeBool(14, trank);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(15, this.extraInfo);
       }
       trank = this.isFaceFollowingEffect;
       if (trank != null) {
          p0.writeBool(16, trank);
       }
       trank = this.banBizType;
       if (trank != null) {
          p0.writeUInt32(17, trank);
       }
       trank = this.blackUser;
       int i1 = 0;
       if (trank != null && trank.length > 0) {
          int i2 = 0;
          LiveCommonEffectInfo tblackUser = this.blackUser;
          while (i2 < tblackUser.length) {
             object oobject = tblackUser[i2];
             if (oobject != null) {
                p0.writeString(18, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.bizExtraInfo).equals(str)) {
          p0.writeString(19, this.bizExtraInfo);
       }
       trank = this.extraResInfo;
       if (trank != null && trank.length > 0) {
          trank = this.extraResInfo;
          while (i1 < trank.length) {
             object oobject1 = trank[i1];
             if (oobject1 != null) {
                p0.writeMessage(20, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       trank = this.sendInfoToYtechTime;
       if (trank != null) {
          p0.writeInt32(21, trank);
       }
       trank = this.cannotBebreak;
       if (trank != null) {
          p0.writeBool(22, trank);
       }
       super.writeTo(p0);
       return;
    }
}
