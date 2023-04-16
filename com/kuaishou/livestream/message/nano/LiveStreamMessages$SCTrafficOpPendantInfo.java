package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCTrafficOpPendantInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$SCTrafficOpPendantInfo extends MessageNano	// class@00136f
{
    public int infoType;
    public UserInfos$PicUrl[] pendantIcon;
    public String shrinkTextContent;
    public String textContent;
    public String webUrl;
    public static LiveStreamMessages$SCTrafficOpPendantInfo[] _emptyArray;

    public void LiveStreamMessages$SCTrafficOpPendantInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCTrafficOpPendantInfo[] emptyArray(){
       if (LiveStreamMessages$SCTrafficOpPendantInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCTrafficOpPendantInfo._emptyArray == null) {
             LiveStreamMessages$SCTrafficOpPendantInfo[] sCTrafficOpP = new LiveStreamMessages$SCTrafficOpPendantInfo[0];
             LiveStreamMessages$SCTrafficOpPendantInfo._emptyArray = sCTrafficOpP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCTrafficOpPendantInfo._emptyArray;
    }
    public static LiveStreamMessages$SCTrafficOpPendantInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCTrafficOpPendantInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCTrafficOpPendantInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCTrafficOpPendantInfo(), p0);
    }
    public LiveStreamMessages$SCTrafficOpPendantInfo clear(){
       this.infoType = 0;
       this.textContent = "";
       this.pendantIcon = UserInfos$PicUrl.emptyArray();
       this.webUrl = "";
       this.shrinkTextContent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCTrafficOpPendantInfo tinfoType = this.infoType;
       if (tinfoType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tinfoType);
       }
       String str = "";
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textContent);
       }
       tinfoType = this.pendantIcon;
       if (tinfoType != null && tinfoType.length > 0) {
          int i1 = 0;
          LiveStreamMessages$SCTrafficOpPendantInfo tpendantIcon = this.pendantIcon;
          while (i1 < tpendantIcon.length) {
             object oobject = tpendantIcon[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.webUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.webUrl);
       }
       if (!(this.shrinkTextContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.shrinkTextContent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCTrafficOpPendantInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.shrinkTextContent = p0.readString();
                      }
                   }else {
                      this.webUrl = p0.readString();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveStreamMessages$SCTrafficOpPendantInfo tpendantIcon = this.pendantIcon;
                   int i2 = (tpendantIcon == null)? 0: tpendantIcon.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tpendantIcon, 0, picUrlArray, 0, i2);
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
                   this.pendantIcon = picUrlArray;
                }
             }else {
                this.textContent = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                continue ;
             }else {
                this.infoType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCTrafficOpPendantInfo tinfoType = this.infoType;
       if (tinfoType != null) {
          p0.writeInt32(1, tinfoType);
       }
       String str = "";
       if (!(this.textContent).equals(str)) {
          p0.writeString(2, this.textContent);
       }
       tinfoType = this.pendantIcon;
       if (tinfoType != null && tinfoType.length > 0) {
          int i = 0;
          LiveStreamMessages$SCTrafficOpPendantInfo tpendantIcon = this.pendantIcon;
          while (i < tpendantIcon.length) {
             object oobject = tpendantIcon[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.webUrl).equals(str)) {
          p0.writeString(4, this.webUrl);
       }
       if (!(this.shrinkTextContent).equals(str)) {
          p0.writeString(5, this.shrinkTextContent);
       }
       super.writeTo(p0);
       return;
    }
}
