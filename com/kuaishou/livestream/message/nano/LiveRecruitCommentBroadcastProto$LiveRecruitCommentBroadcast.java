package com.kuaishou.livestream.message.nano.LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import java.lang.System;

public final class LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast extends MessageNano	// class@001268
{
    public UserInfos$PicUrl[] backgroundUrl;
    public String bizType;
    public int count;
    public String[] disableUserIds;
    public Map hometownUserCount;
    public UserInfos$PicUrl[] iconUrl;
    public String jobId;
    public String nickName;
    public long serverTimeStamp;
    public String text;
    public static LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast[] _emptyArray;

    public void LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast(){
       super();
       this.clear();
    }
    public static LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast[] emptyArray(){
       if (LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast._emptyArray == null) {
             LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast[] liveRecruitC = new LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast[0];
             LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast._emptyArray = liveRecruitC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast._emptyArray;
    }
    public static LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast parseFrom(CodedInputByteBufferNano p0){
       return new LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast().mergeFrom(p0);
    }
    public static LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast(), p0);
    }
    public LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast clear(){
       this.nickName = "";
       this.text = "";
       this.count = 0;
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.backgroundUrl = UserInfos$PicUrl.emptyArray();
       this.serverTimeStamp = 0;
       this.bizType = "";
       this.jobId = "";
       this.hometownUserCount = null;
       this.disableUserIds = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast ticonUrl;
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.nickName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.nickName);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.text);
       }
       LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast tcount = this.count;
       if (tcount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tcount);
       }
       tcount = this.iconUrl;
       int i1 = 0;
       if (tcount != null && tcount.length > 0) {
          i2 = 0;
          ticonUrl = this.iconUrl;
          while (i2 < ticonUrl.length) {
             oobject = ticonUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tcount = this.backgroundUrl;
       if (tcount != null && tcount.length > 0) {
          i2 = 0;
          ticonUrl = this.backgroundUrl;
          while (i2 < ticonUrl.length) {
             oobject = ticonUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       ticonUrl = this.serverTimeStamp;
       if (ticonUrl) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, ticonUrl);
       }
       if (!(this.bizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.bizType);
       }
       if (!(this.jobId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.jobId);
       }
       tcount = this.hometownUserCount;
       if (tcount != null) {
          i = i + InternalNano.computeMapFieldSize(tcount, 9, 9, 13);
       }
       tcount = this.disableUserIds;
       if (tcount != null && tcount.length > 0) {
          i2 = 0;
          int i3 = 0;
          ticonUrl = this.disableUserIds;
          while (i1 < ticonUrl.length) {
             oobject = ticonUrl[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast mergeFrom(CodedInputByteBufferNano p0){
       LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast ticonUrl;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.nickName = p0.readString();
                break;
              case 18:
                this.text = p0.readString();
                break;
              case 24:
                this.count = p0.readUInt32();
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                ticonUrl = this.iconUrl;
                i2 = (ticonUrl == null)? 0: ticonUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticonUrl, i1, picUrlArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.iconUrl = picUrlArray;
                break;
              case '*':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 42);
                ticonUrl = this.backgroundUrl;
                i2 = (ticonUrl == null)? 0: ticonUrl.length;
                i = i + i2;
                picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(ticonUrl, i1, picUrlArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.backgroundUrl = picUrlArray;
                break;
              case '0':
                this.serverTimeStamp = p0.readUInt64();
                break;
              case ':':
                this.bizType = p0.readString();
                break;
              case 'B':
                this.jobId = p0.readString();
                break;
              case 'J':
                this.hometownUserCount = InternalNano.mergeMapEntry(p0, this.hometownUserCount, mapFactory, 9, 13, null, 10, 16);
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                ticonUrl = this.disableUserIds;
                i2 = (ticonUrl == null)? 0: ticonUrl.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(ticonUrl, i1, stringArray, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.disableUserIds = stringArray;
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
       LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast ticonUrl;
       object oobject;
       String str = "";
       if (!(this.nickName).equals(str)) {
          p0.writeString(1, this.nickName);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(2, this.text);
       }
       LiveRecruitCommentBroadcastProto$LiveRecruitCommentBroadcast tcount = this.count;
       if (tcount != null) {
          p0.writeUInt32(3, tcount);
       }
       tcount = this.iconUrl;
       int i = 0;
       if (tcount != null && tcount.length > 0) {
          i1 = 0;
          ticonUrl = this.iconUrl;
          while (i1 < ticonUrl.length) {
             oobject = ticonUrl[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcount = this.backgroundUrl;
       if (tcount != null && tcount.length > 0) {
          i1 = 0;
          ticonUrl = this.backgroundUrl;
          while (i1 < ticonUrl.length) {
             oobject = ticonUrl[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       ticonUrl = this.serverTimeStamp;
       if (ticonUrl) {
          p0.writeUInt64(6, ticonUrl);
       }
       if (!(this.bizType).equals(str)) {
          p0.writeString(7, this.bizType);
       }
       if (!(this.jobId).equals(str)) {
          p0.writeString(8, this.jobId);
       }
       tcount = this.hometownUserCount;
       if (tcount != null) {
          InternalNano.serializeMapField(p0, tcount, 9, 9, 13);
       }
       tcount = this.disableUserIds;
       if (tcount != null && tcount.length > 0) {
          tcount = this.disableUserIds;
          while (i < tcount.length) {
             object oobject1 = tcount[i];
             if (oobject1 != null) {
                p0.writeString(10, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
