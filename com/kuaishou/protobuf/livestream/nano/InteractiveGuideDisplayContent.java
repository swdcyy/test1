package com.kuaishou.protobuf.livestream.nano.InteractiveGuideDisplayContent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class InteractiveGuideDisplayContent extends MessageNano	// class@000c25
{
    public UserInfos$PicUrl[] picUrl;
    public UserInfos$UserInfo userInfo;
    public static InteractiveGuideDisplayContent[] _emptyArray;

    public void InteractiveGuideDisplayContent(){
       super();
       this.clear();
    }
    public static InteractiveGuideDisplayContent[] emptyArray(){
       if (InteractiveGuideDisplayContent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuideDisplayContent._emptyArray == null) {
             InteractiveGuideDisplayContent[] interactiveG = new InteractiveGuideDisplayContent[0];
             InteractiveGuideDisplayContent._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuideDisplayContent._emptyArray;
    }
    public static InteractiveGuideDisplayContent parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuideDisplayContent().mergeFrom(p0);
    }
    public static InteractiveGuideDisplayContent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuideDisplayContent(), p0);
    }
    public InteractiveGuideDisplayContent clear(){
       this.userInfo = null;
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveGuideDisplayContent tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tuserInfo);
       }
       tuserInfo = this.picUrl;
       if (tuserInfo != null && tuserInfo.length > 0) {
          int i1 = 0;
          InteractiveGuideDisplayContent tpicUrl = this.picUrl;
          while (i1 < tpicUrl.length) {
             object oobject = tpicUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuideDisplayContent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                InteractiveGuideDisplayContent tpicUrl = this.picUrl;
                int i2 = (tpicUrl == null)? 0: tpicUrl.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tpicUrl, 0, picUrlArray, 0, i2);
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
                this.picUrl = picUrlArray;
             }
          }else if(this.userInfo == null){
             this.userInfo = new UserInfos$UserInfo();
          }
          p0.readMessage(this.userInfo);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveGuideDisplayContent tuserInfo = this.userInfo;
       if (tuserInfo != null) {
          p0.writeMessage(1, tuserInfo);
       }
       tuserInfo = this.picUrl;
       if (tuserInfo != null && tuserInfo.length > 0) {
          int i = 0;
          InteractiveGuideDisplayContent tpicUrl = this.picUrl;
          while (i < tpicUrl.length) {
             object oobject = tpicUrl[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
