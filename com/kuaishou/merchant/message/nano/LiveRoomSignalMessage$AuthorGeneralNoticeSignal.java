package com.kuaishou.merchant.message.nano.LiveRoomSignalMessage$AuthorGeneralNoticeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveRoomSignalMessage$AuthorGeneralNoticeSignal extends MessageNano	// class@001c41
{
    public String buttonText;
    public String description;
    public UserInfos$PicUrl[] iconUrl;
    public String liveStreamId;
    public String title;
    public static LiveRoomSignalMessage$AuthorGeneralNoticeSignal[] _emptyArray;

    public void LiveRoomSignalMessage$AuthorGeneralNoticeSignal(){
       super();
       this.clear();
    }
    public static LiveRoomSignalMessage$AuthorGeneralNoticeSignal[] emptyArray(){
       if (LiveRoomSignalMessage$AuthorGeneralNoticeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRoomSignalMessage$AuthorGeneralNoticeSignal._emptyArray == null) {
             LiveRoomSignalMessage$AuthorGeneralNoticeSignal[] uAuthorGener = new LiveRoomSignalMessage$AuthorGeneralNoticeSignal[0];
             LiveRoomSignalMessage$AuthorGeneralNoticeSignal._emptyArray = uAuthorGener;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRoomSignalMessage$AuthorGeneralNoticeSignal._emptyArray;
    }
    public static LiveRoomSignalMessage$AuthorGeneralNoticeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveRoomSignalMessage$AuthorGeneralNoticeSignal().mergeFrom(p0);
    }
    public static LiveRoomSignalMessage$AuthorGeneralNoticeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRoomSignalMessage$AuthorGeneralNoticeSignal(), p0);
    }
    public LiveRoomSignalMessage$AuthorGeneralNoticeSignal clear(){
       this.liveStreamId = "";
       this.title = "";
       this.description = "";
       this.buttonText = "";
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.description).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.description);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonText);
       }
       LiveRoomSignalMessage$AuthorGeneralNoticeSignal ticonUrl = this.iconUrl;
       if (ticonUrl != null && ticonUrl.length > 0) {
          int i1 = 0;
          LiveRoomSignalMessage$AuthorGeneralNoticeSignal ticonUrl1 = this.iconUrl;
          while (i1 < ticonUrl1.length) {
             object oobject = ticonUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRoomSignalMessage$AuthorGeneralNoticeSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         LiveRoomSignalMessage$AuthorGeneralNoticeSignal ticonUrl = this.iconUrl;
                         int i2 = (ticonUrl == null)? 0: ticonUrl.length;
                         i = i + i2;
                         UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(ticonUrl, 0, picUrlArray, 0, i2);
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
                      }
                   }else {
                      this.buttonText = p0.readString();
                   }
                }else {
                   this.description = p0.readString();
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.description).equals(str)) {
          p0.writeString(3, this.description);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(4, this.buttonText);
       }
       LiveRoomSignalMessage$AuthorGeneralNoticeSignal ticonUrl = this.iconUrl;
       if (ticonUrl != null && ticonUrl.length > 0) {
          int i = 0;
          LiveRoomSignalMessage$AuthorGeneralNoticeSignal ticonUrl1 = this.iconUrl;
          while (i < ticonUrl1.length) {
             object oobject = ticonUrl1[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
