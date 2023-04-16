package com.kuaishou.livestream.message.nano.LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo extends MessageNano	// class@00110b
{
    public int animStyle;
    public String biz;
    public long delayDurationMs;
    public long id;
    public UserInfos$PicUrl[] imageUrl;
    public UserInfos$PicUrl[] imageUrlNew;
    public int priority;
    public String routerUrl;
    public long showDurationMs;
    public static LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[] _emptyArray;

    public void LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo(){
       super();
       this.clear();
    }
    public static LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[] emptyArray(){
       if (LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo._emptyArray == null) {
             LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[] sCLiveAuthor = new LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo[0];
             LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo._emptyArray = sCLiveAuthor;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo._emptyArray;
    }
    public static LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo().mergeFrom(p0);
    }
    public static LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo(), p0);
    }
    public LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo clear(){
       this.id = 0;
       this.biz = "";
       this.priority = 0;
       this.delayDurationMs = 0;
       this.showDurationMs = 0;
       this.animStyle = 0;
       this.imageUrl = UserInfos$PicUrl.emptyArray();
       this.routerUrl = "";
       this.imageUrlNew = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo tid = this.id;
       int i1 = 0;
       if (tid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tid);
       }
       String str = "";
       if (!(this.biz).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.biz);
       }
       tid = this.priority;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tid);
       }
       LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo tdelayDurati = this.delayDurationMs;
       if (tdelayDurati - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tdelayDurati);
       }
       tdelayDurati = this.showDurationMs;
       if (tdelayDurati - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tdelayDurati);
       }
       tid = this.animStyle;
       if (tid != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tid);
       }
       tid = this.imageUrl;
       i1 = 0;
       if (tid != null && tid.length > 0) {
          int i2 = 0;
          LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo timageUrl = this.imageUrl;
          while (i2 < timageUrl.length) {
             object oobject = timageUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.routerUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.routerUrl);
       }
       tid = this.imageUrlNew;
       if (tid != null && tid.length > 0) {
          tid = this.imageUrlNew;
          while (i1 < tid.length) {
             object oobject1 = tid[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo mergeFrom(CodedInputByteBufferNano p0){
       LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo timageUrlNew;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            int i1 = 58;
                            if (i != i1) {
                               if (i != 66) {
                                  i1 = 74;
                                  if (i != i1) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                     timageUrlNew = this.imageUrlNew;
                                     i2 = (timageUrlNew == null)? 0: timageUrlNew.length;
                                     i = i + i2;
                                     picUrlArray = new UserInfos$PicUrl[i];
                                     if (i2) {
                                        System.arraycopy(timageUrlNew, 0, picUrlArray, 0, i2);
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
                                     this.imageUrlNew = picUrlArray;
                                  }
                               }else {
                                  this.routerUrl = p0.readString();
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               timageUrlNew = this.imageUrl;
                               i2 = (timageUrlNew == null)? 0: timageUrlNew.length;
                               i = i + i2;
                               picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(timageUrlNew, 0, picUrlArray, 0, i2);
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
                               this.imageUrl = picUrlArray;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && i != 1) {
                               continue ;
                            }else {
                               this.animStyle = i;
                            }
                         }
                      }else {
                         this.showDurationMs = p0.readUInt64();
                      }
                   }else {
                      this.delayDurationMs = p0.readUInt64();
                   }
                }else {
                   this.priority = p0.readUInt32();
                }
             }else {
                this.biz = p0.readString();
             }
          }else {
             this.id = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo tid = this.id;
       int i = 0;
       if (tid - i) {
          p0.writeUInt64(1, tid);
       }
       String str = "";
       if (!(this.biz).equals(str)) {
          p0.writeString(2, this.biz);
       }
       tid = this.priority;
       if (tid != null) {
          p0.writeUInt32(3, tid);
       }
       LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo tdelayDurati = this.delayDurationMs;
       if (tdelayDurati - i) {
          p0.writeUInt64(4, tdelayDurati);
       }
       tdelayDurati = this.showDurationMs;
       if (tdelayDurati - i) {
          p0.writeUInt64(5, tdelayDurati);
       }
       tid = this.animStyle;
       if (tid != null) {
          p0.writeInt32(6, tid);
       }
       tid = this.imageUrl;
       i = 0;
       if (tid != null && tid.length > 0) {
          int i1 = 0;
          LiveAuthorReinforceInfoProto$SCLiveAuthorReinforceInfo timageUrl = this.imageUrl;
          while (i1 < timageUrl.length) {
             object oobject = timageUrl[i1];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.routerUrl).equals(str)) {
          p0.writeString(8, this.routerUrl);
       }
       tid = this.imageUrlNew;
       if (tid != null && tid.length > 0) {
          tid = this.imageUrlNew;
          while (i < tid.length) {
             object oobject1 = tid[i];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
