package com.kuaishou.livestream.message.nano.SCLiveLiteLeeeShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCLiveLiteLeeeShow extends MessageNano	// class@001429
{
    public UserInfos$PicUrl[] authorInfoAreaIconUrl;
    public long endTime;
    public UserInfos$PicUrl[] iconUrl;
    public String leeeId;
    public int leeeType;
    public String routerUrl;
    public UserInfos$PicUrl[] senderHeadUrl;
    public String showText;
    public static SCLiveLiteLeeeShow[] _emptyArray;

    public void SCLiveLiteLeeeShow(){
       super();
       this.clear();
    }
    public static SCLiveLiteLeeeShow[] emptyArray(){
       if (SCLiveLiteLeeeShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveLiteLeeeShow._emptyArray == null) {
             SCLiveLiteLeeeShow[] sCLiveLiteLe = new SCLiveLiteLeeeShow[0];
             SCLiveLiteLeeeShow._emptyArray = sCLiveLiteLe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveLiteLeeeShow._emptyArray;
    }
    public static SCLiveLiteLeeeShow parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveLiteLeeeShow().mergeFrom(p0);
    }
    public static SCLiveLiteLeeeShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveLiteLeeeShow(), p0);
    }
    public SCLiveLiteLeeeShow clear(){
       this.leeeId = "";
       this.leeeType = 0;
       this.iconUrl = UserInfos$PicUrl.emptyArray();
       this.showText = "";
       this.routerUrl = "";
       this.endTime = 0;
       this.senderHeadUrl = UserInfos$PicUrl.emptyArray();
       this.authorInfoAreaIconUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.leeeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.leeeId);
       }
       SCLiveLiteLeeeShow tleeeType = this.leeeType;
       if (tleeeType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tleeeType);
       }
       tleeeType = this.iconUrl;
       int i1 = 0;
       if (tleeeType != null && tleeeType.length > 0) {
          i2 = 0;
          SCLiveLiteLeeeShow ticonUrl = this.iconUrl;
          while (i2 < ticonUrl.length) {
             object oobject = ticonUrl[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.showText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.showText);
       }
       if (!(this.routerUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.routerUrl);
       }
       tleeeType = this.endTime;
       if (tleeeType) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, tleeeType);
       }
       tleeeType = this.senderHeadUrl;
       if (tleeeType != null && tleeeType.length > 0) {
          i2 = 0;
          SCLiveLiteLeeeShow tsenderHeadU = this.senderHeadUrl;
          while (i2 < tsenderHeadU.length) {
             object oobject1 = tsenderHeadU[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       tleeeType = this.authorInfoAreaIconUrl;
       if (tleeeType != null && tleeeType.length > 0) {
          tleeeType = this.authorInfoAreaIconUrl;
          while (i1 < tleeeType.length) {
             object oobject2 = tleeeType[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(8, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveLiteLeeeShow mergeFrom(CodedInputByteBufferNano p0){
       SCLiveLiteLeeeShow tauthorInfoA;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            i1 = 58;
                            if (i != i1) {
                               i1 = 66;
                               if (i != i1) {
                                  if (!WireFormatNano.parseUnknownField(p0, i)) {
                                     break ;
                                  }
                               }else {
                                  i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                                  tauthorInfoA = this.authorInfoAreaIconUrl;
                                  i2 = (tauthorInfoA == null)? 0: tauthorInfoA.length;
                                  i = i + i2;
                                  picUrlArray = new UserInfos$PicUrl[i];
                                  if (i2) {
                                     System.arraycopy(tauthorInfoA, 0, picUrlArray, 0, i2);
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
                                  this.authorInfoAreaIconUrl = picUrlArray;
                               }
                            }else {
                               i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                               tauthorInfoA = this.senderHeadUrl;
                               i2 = (tauthorInfoA == null)? 0: tauthorInfoA.length;
                               i = i + i2;
                               picUrlArray = new UserInfos$PicUrl[i];
                               if (i2) {
                                  System.arraycopy(tauthorInfoA, 0, picUrlArray, 0, i2);
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
                               this.senderHeadUrl = picUrlArray;
                            }
                         }else {
                            this.endTime = p0.readInt64();
                         }
                      }else {
                         this.routerUrl = p0.readString();
                      }
                   }else {
                      this.showText = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tauthorInfoA = this.iconUrl;
                   i2 = (tauthorInfoA == null)? 0: tauthorInfoA.length;
                   i = i + i2;
                   picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tauthorInfoA, 0, picUrlArray, 0, i2);
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
                this.leeeType = p0.readInt32();
             }
          }else {
             this.leeeId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       String str = "";
       if (!(this.leeeId).equals(str)) {
          p0.writeString(1, this.leeeId);
       }
       SCLiveLiteLeeeShow tleeeType = this.leeeType;
       if (tleeeType != null) {
          p0.writeInt32(2, tleeeType);
       }
       tleeeType = this.iconUrl;
       int i = 0;
       if (tleeeType != null && tleeeType.length > 0) {
          i1 = 0;
          SCLiveLiteLeeeShow ticonUrl = this.iconUrl;
          while (i1 < ticonUrl.length) {
             object oobject = ticonUrl[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.showText).equals(str)) {
          p0.writeString(4, this.showText);
       }
       if (!(this.routerUrl).equals(str)) {
          p0.writeString(5, this.routerUrl);
       }
       tleeeType = this.endTime;
       if (tleeeType) {
          p0.writeInt64(6, tleeeType);
       }
       tleeeType = this.senderHeadUrl;
       if (tleeeType != null && tleeeType.length > 0) {
          i1 = 0;
          SCLiveLiteLeeeShow tsenderHeadU = this.senderHeadUrl;
          while (i1 < tsenderHeadU.length) {
             object oobject1 = tsenderHeadU[i1];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tleeeType = this.authorInfoAreaIconUrl;
       if (tleeeType != null && tleeeType.length > 0) {
          tleeeType = this.authorInfoAreaIconUrl;
          while (i < tleeeType.length) {
             object oobject2 = tleeeType[i];
             if (oobject2 != null) {
                p0.writeMessage(8, oobject2);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
