package com.kuaishou.protobuf.livestream.nano.LiveGuardNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveGuardNotice extends MessageNano	// class@000c95
{
    public UserInfos$PicUrl[] backgroundPict;
    public int bizValue;
    public UserInfos$PicUrl[] buttonPict;
    public String contentInCurRoom;
    public String contentInOtherRoom;
    public UserInfos$PicUrl[] leftIcon;
    public String liveStreamId;
    public int noticeType;
    public static LiveGuardNotice[] _emptyArray;

    public void LiveGuardNotice(){
       super();
       this.clear();
    }
    public static LiveGuardNotice[] emptyArray(){
       if (LiveGuardNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveGuardNotice._emptyArray == null) {
             LiveGuardNotice[] liveGuardNot = new LiveGuardNotice[0];
             LiveGuardNotice._emptyArray = liveGuardNot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveGuardNotice._emptyArray;
    }
    public static LiveGuardNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveGuardNotice().mergeFrom(p0);
    }
    public static LiveGuardNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveGuardNotice(), p0);
    }
    public LiveGuardNotice clear(){
       this.noticeType = 0;
       this.contentInCurRoom = "";
       this.contentInOtherRoom = "";
       this.liveStreamId = "";
       this.buttonPict = UserInfos$PicUrl.emptyArray();
       this.leftIcon = UserInfos$PicUrl.emptyArray();
       this.backgroundPict = UserInfos$PicUrl.emptyArray();
       this.bizValue = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveGuardNotice tbuttonPict;
       object oobject;
       int i = super.computeSerializedSize();
       LiveGuardNotice tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tnoticeType);
       }
       String str = "";
       if (!(this.contentInCurRoom).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.contentInCurRoom);
       }
       if (!(this.contentInOtherRoom).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.contentInOtherRoom);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       tnoticeType = this.buttonPict;
       int i1 = 0;
       if (tnoticeType != null && tnoticeType.length > 0) {
          i2 = 0;
          tbuttonPict = this.buttonPict;
          while (i2 < tbuttonPict.length) {
             oobject = tbuttonPict[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tnoticeType = this.leftIcon;
       if (tnoticeType != null && tnoticeType.length > 0) {
          i2 = 0;
          tbuttonPict = this.leftIcon;
          while (i2 < tbuttonPict.length) {
             oobject = tbuttonPict[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(6, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tnoticeType = this.backgroundPict;
       if (tnoticeType != null && tnoticeType.length > 0) {
          tnoticeType = this.backgroundPict;
          while (i1 < tnoticeType.length) {
             object oobject1 = tnoticeType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tnoticeType = this.bizValue;
       if (tnoticeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tnoticeType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveGuardNotice mergeFrom(CodedInputByteBufferNano p0){
       LiveGuardNotice tbackgroundP;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      int i1 = 42;
                      if (i != i1) {
                         i1 = 50;
                         if (i != i1) {
                            i1 = 58;
                            if (i != i1) {
                               if (i != 64) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  this.bizValue = p0.readInt32();
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tbackgroundP = this.backgroundPict;
                               i2 = (tbackgroundP == null)? 0: tbackgroundP.length;
                               i = i + i2;
                               picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(tbackgroundP, 0, picUrlArray, 0, i2);
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
                               this.backgroundPict = picUrlArray;
                            }
                         }else {
                            i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                            tbackgroundP = this.leftIcon;
                            i2 = (tbackgroundP == null)? 0: tbackgroundP.length;
                            i = i + i2;
                            picUrlArray = new UserInfos$PicUrl[i];
                            if (i2) {
                               System.arraycopy(tbackgroundP, 0, picUrlArray, 0, i2);
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
                            this.leftIcon = picUrlArray;
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                         tbackgroundP = this.buttonPict;
                         i2 = (tbackgroundP == null)? 0: tbackgroundP.length;
                         i = i + i2;
                         picUrlArray = new UserInfos$PicUrl[i];
                         if (i2) {
                            System.arraycopy(tbackgroundP, 0, picUrlArray, 0, i2);
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
                         this.buttonPict = picUrlArray;
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.contentInOtherRoom = p0.readString();
                }
             }else {
                this.contentInCurRoom = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.noticeType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       LiveGuardNotice tbuttonPict;
       object oobject;
       LiveGuardNotice tnoticeType = this.noticeType;
       if (tnoticeType != null) {
          p0.writeInt32(1, tnoticeType);
       }
       String str = "";
       if (!(this.contentInCurRoom).equals(str)) {
          p0.writeString(2, this.contentInCurRoom);
       }
       if (!(this.contentInOtherRoom).equals(str)) {
          p0.writeString(3, this.contentInOtherRoom);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       tnoticeType = this.buttonPict;
       int i = 0;
       if (tnoticeType != null && tnoticeType.length > 0) {
          i1 = 0;
          tbuttonPict = this.buttonPict;
          while (i1 < tbuttonPict.length) {
             oobject = tbuttonPict[i1];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnoticeType = this.leftIcon;
       if (tnoticeType != null && tnoticeType.length > 0) {
          i1 = 0;
          tbuttonPict = this.leftIcon;
          while (i1 < tbuttonPict.length) {
             oobject = tbuttonPict[i1];
             if (oobject != null) {
                p0.writeMessage(6, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tnoticeType = this.backgroundPict;
       if (tnoticeType != null && tnoticeType.length > 0) {
          tnoticeType = this.backgroundPict;
          while (i < tnoticeType.length) {
             object oobject1 = tnoticeType[i];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i = i + 1;
          }
       }
       tnoticeType = this.bizValue;
       if (tnoticeType != null) {
          p0.writeInt32(8, tnoticeType);
       }
       super.writeTo(p0);
       return;
    }
}
