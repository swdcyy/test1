package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveWatchingListNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCLiveWatchingListNotice extends MessageNano	// class@001352
{
    public String bizDataJson;
    public int bizType;
    public String description;
    public long durationMs;
    public UserInfos$PicUrl[] icon;
    public int noClickCount;
    public long noClickHiddenMs;
    public static LiveStreamMessages$SCLiveWatchingListNotice[] _emptyArray;

    public void LiveStreamMessages$SCLiveWatchingListNotice(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCLiveWatchingListNotice[] emptyArray(){
       if (LiveStreamMessages$SCLiveWatchingListNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCLiveWatchingListNotice._emptyArray == null) {
             LiveStreamMessages$SCLiveWatchingListNotice[] sCLiveWatchi = new LiveStreamMessages$SCLiveWatchingListNotice[0];
             LiveStreamMessages$SCLiveWatchingListNotice._emptyArray = sCLiveWatchi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCLiveWatchingListNotice._emptyArray;
    }
    public static LiveStreamMessages$SCLiveWatchingListNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCLiveWatchingListNotice().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCLiveWatchingListNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCLiveWatchingListNotice(), p0);
    }
    public LiveStreamMessages$SCLiveWatchingListNotice clear(){
       this.bizType = 0;
       this.description = "";
       this.bizDataJson = "";
       this.noClickCount = 0;
       this.noClickHiddenMs = 0;
       this.durationMs = 0;
       this.icon = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCLiveWatchingListNotice tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       String str = "";
       if (!(this.description).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.description);
       }
       if (!(this.bizDataJson).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bizDataJson);
       }
       tbizType = this.noClickCount;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tbizType);
       }
       tbizType = this.noClickHiddenMs;
       int i1 = 0;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tbizType);
       }
       tbizType = this.durationMs;
       if (tbizType - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tbizType);
       }
       tbizType = this.icon;
       if (tbizType != null && tbizType.length > 0) {
          int i2 = 0;
          LiveStreamMessages$SCLiveWatchingListNotice ticon = this.icon;
          while (i2 < ticon.length) {
             object oobject = ticon[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCLiveWatchingListNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            int i1 = 58;
                            if (i != i1) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               LiveStreamMessages$SCLiveWatchingListNotice ticon = this.icon;
                               int i2 = (ticon == null)? 0: ticon.length;
                               i = i + i2;
                               UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(ticon, 0, picUrlArray, 0, i2);
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
                               this.icon = picUrlArray;
                            }
                         }else {
                            this.durationMs = p0.readUInt64();
                         }
                      }else {
                         this.noClickHiddenMs = p0.readUInt64();
                      }
                   }else {
                      this.noClickCount = p0.readUInt32();
                   }
                }else {
                   this.bizDataJson = p0.readString();
                }
             }else {
                this.description = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCLiveWatchingListNotice tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       String str = "";
       if (!(this.description).equals(str)) {
          p0.writeString(2, this.description);
       }
       if (!(this.bizDataJson).equals(str)) {
          p0.writeString(3, this.bizDataJson);
       }
       tbizType = this.noClickCount;
       if (tbizType != null) {
          p0.writeUInt32(4, tbizType);
       }
       tbizType = this.noClickHiddenMs;
       int i = 0;
       if (tbizType - i) {
          p0.writeUInt64(5, tbizType);
       }
       tbizType = this.durationMs;
       if (tbizType - i) {
          p0.writeUInt64(6, tbizType);
       }
       tbizType = this.icon;
       if (tbizType != null && tbizType.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCLiveWatchingListNotice ticon = this.icon;
          while (i1 < ticon.length) {
             object oobject = ticon[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
