package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLineContent;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveActivityWidgetProto$LiveActivityWidgetMessage extends MessageNano	// class@0010d8
{
    public UserInfos$PicUrl[] backgroundPic;
    public LiveActivityWidgetProto$LiveActivityWidgetLineContent[] line;
    public int template;
    public static LiveActivityWidgetProto$LiveActivityWidgetMessage[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetMessage(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetMessage[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetMessage._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetMessage[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetMessage[0];
             LiveActivityWidgetProto$LiveActivityWidgetMessage._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetMessage._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetMessage().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetMessage(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetMessage clear(){
       this.backgroundPic = UserInfos$PicUrl.emptyArray();
       this.template = 0;
       this.line = LiveActivityWidgetProto$LiveActivityWidgetLineContent.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActivityWidgetProto$LiveActivityWidgetMessage tbackgroundP = this.backgroundPic;
       int i1 = 0;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i2 = 0;
          LiveActivityWidgetProto$LiveActivityWidgetMessage tbackgroundP1 = this.backgroundPic;
          while (i2 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbackgroundP = this.template;
       if (tbackgroundP != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tbackgroundP);
       }
       tbackgroundP = this.line;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.line;
          while (i1 < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetMessage mergeFrom(CodedInputByteBufferNano p0){
       LiveActivityWidgetProto$LiveActivityWidgetMessage tline;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                i1 = 26;
                if (i != i1) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tline = this.line;
                   i2 = (tline == null)? 0: tline.length;
                   i = i + i2;
                   LiveActivityWidgetProto$LiveActivityWidgetLineContent[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetLineContent[i];
                   if (i2) {
                      System.arraycopy(tline, 0, liveActivity, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      liveActivity[i2] = new LiveActivityWidgetProto$LiveActivityWidgetLineContent();
                      p0.readMessage(liveActivity[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   liveActivity[i2] = new LiveActivityWidgetProto$LiveActivityWidgetLineContent();
                   p0.readMessage(liveActivity[i2]);
                   this.line = liveActivity;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.template = i;
                }
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tline = this.backgroundPic;
             i2 = (tline == null)? 0: tline.length;
             i = i + i2;
             UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(tline, 0, picUrlArray, 0, i2);
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
             this.backgroundPic = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActivityWidgetProto$LiveActivityWidgetMessage tbackgroundP = this.backgroundPic;
       int i = 0;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          int i1 = 0;
          LiveActivityWidgetProto$LiveActivityWidgetMessage tbackgroundP1 = this.backgroundPic;
          while (i1 < tbackgroundP1.length) {
             object oobject = tbackgroundP1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbackgroundP = this.template;
       if (tbackgroundP != null) {
          p0.writeInt32(2, tbackgroundP);
       }
       tbackgroundP = this.line;
       if (tbackgroundP != null && tbackgroundP.length > 0) {
          tbackgroundP = this.line;
          while (i < tbackgroundP.length) {
             object oobject1 = tbackgroundP[i];
             if (oobject1 != null) {
                p0.writeMessage(3, oobject1);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
