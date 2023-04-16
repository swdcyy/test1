package com.kuaishou.livestream.message.nano.LiveCny23CreatorWishReeeInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveCny23CreatorWishReeeInfo extends MessageNano	// class@00113d
{
    public String buttonKwailink;
    public String buttonText;
    public long count;
    public String desc;
    public UserInfos$PicUrl[] icon;
    public long reeFen;
    public int reeeType;
    public String tip;
    public String tipKwailink;
    public static LiveCny23CreatorWishReeeInfo[] _emptyArray;

    public void LiveCny23CreatorWishReeeInfo(){
       super();
       this.clear();
    }
    public static LiveCny23CreatorWishReeeInfo[] emptyArray(){
       if (LiveCny23CreatorWishReeeInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCny23CreatorWishReeeInfo._emptyArray == null) {
             LiveCny23CreatorWishReeeInfo[] liveCny23Cre = new LiveCny23CreatorWishReeeInfo[0];
             LiveCny23CreatorWishReeeInfo._emptyArray = liveCny23Cre;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCny23CreatorWishReeeInfo._emptyArray;
    }
    public static LiveCny23CreatorWishReeeInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveCny23CreatorWishReeeInfo().mergeFrom(p0);
    }
    public static LiveCny23CreatorWishReeeInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCny23CreatorWishReeeInfo(), p0);
    }
    public LiveCny23CreatorWishReeeInfo clear(){
       this.reeeType = 0;
       this.icon = UserInfos$PicUrl.emptyArray();
       this.reeFen = 0;
       this.desc = "";
       this.count = 0;
       this.tip = "";
       this.tipKwailink = "";
       this.buttonText = "";
       this.buttonKwailink = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCny23CreatorWishReeeInfo treeeType = this.reeeType;
       if (treeeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, treeeType);
       }
       treeeType = this.icon;
       if (treeeType != null && treeeType.length > 0) {
          int i1 = 0;
          LiveCny23CreatorWishReeeInfo ticon = this.icon;
          while (i1 < ticon.length) {
             object oobject = ticon[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       treeeType = this.reeFen;
       LiveCny23CreatorWishReeeInfo liveCny23Cre = null;
       if (treeeType - liveCny23Cre) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, treeeType);
       }
       String str = "";
       if (!(this.desc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.desc);
       }
       LiveCny23CreatorWishReeeInfo tcount = this.count;
       if (tcount - liveCny23Cre) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tcount);
       }
       if (!(this.tip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.tip);
       }
       if (!(this.tipKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.tipKwailink);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.buttonText);
       }
       if (!(this.buttonKwailink).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.buttonKwailink);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCny23CreatorWishReeeInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.buttonKwailink = p0.readString();
                                  }
                               }else {
                                  this.buttonText = p0.readString();
                               }
                            }else {
                               this.tipKwailink = p0.readString();
                            }
                         }else {
                            this.tip = p0.readString();
                         }
                      }else {
                         this.count = p0.readUInt64();
                      }
                   }else {
                      this.desc = p0.readString();
                   }
                }else {
                   this.reeFen = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveCny23CreatorWishReeeInfo ticon = this.icon;
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
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.reeeType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCny23CreatorWishReeeInfo treeeType = this.reeeType;
       if (treeeType != null) {
          p0.writeInt32(1, treeeType);
       }
       treeeType = this.icon;
       if (treeeType != null && treeeType.length > 0) {
          int i = 0;
          LiveCny23CreatorWishReeeInfo ticon = this.icon;
          while (i < ticon.length) {
             object oobject = ticon[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       treeeType = this.reeFen;
       LiveCny23CreatorWishReeeInfo liveCny23Cre = null;
       if (treeeType - liveCny23Cre) {
          p0.writeUInt64(3, treeeType);
       }
       String str = "";
       if (!(this.desc).equals(str)) {
          p0.writeString(4, this.desc);
       }
       LiveCny23CreatorWishReeeInfo tcount = this.count;
       if (tcount - liveCny23Cre) {
          p0.writeUInt64(5, tcount);
       }
       if (!(this.tip).equals(str)) {
          p0.writeString(6, this.tip);
       }
       if (!(this.tipKwailink).equals(str)) {
          p0.writeString(7, this.tipKwailink);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(8, this.buttonText);
       }
       if (!(this.buttonKwailink).equals(str)) {
          p0.writeString(9, this.buttonKwailink);
       }
       super.writeTo(p0);
       return;
    }
}
