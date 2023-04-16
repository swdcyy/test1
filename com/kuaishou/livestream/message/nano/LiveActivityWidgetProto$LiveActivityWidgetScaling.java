package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetScaling;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveActivityWidgetProto$LiveActivityWidgetScaling extends MessageNano	// class@0010da
{
    public String backgroundColor;
    public int scalingColorType;
    public UserInfos$PicUrl[] shrinkBarImg;
    public String shrinkBarImgTitle;
    public String title;
    public static LiveActivityWidgetProto$LiveActivityWidgetScaling[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetScaling(){
       super();
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetScaling[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetScaling._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetScaling._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetScaling[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetScaling[0];
             LiveActivityWidgetProto$LiveActivityWidgetScaling._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetScaling._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetScaling parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetScaling().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetScaling parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetScaling(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetScaling clear(){
       this.backgroundColor = "";
       this.title = "";
       this.scalingColorType = 0;
       this.shrinkBarImg = UserInfos$PicUrl.emptyArray();
       this.shrinkBarImgTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.backgroundColor);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       LiveActivityWidgetProto$LiveActivityWidgetScaling tscalingColo = this.scalingColorType;
       if (tscalingColo != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tscalingColo);
       }
       tscalingColo = this.shrinkBarImg;
       if (tscalingColo != null && tscalingColo.length > 0) {
          int i1 = 0;
          LiveActivityWidgetProto$LiveActivityWidgetScaling tshrinkBarIm = this.shrinkBarImg;
          while (i1 < tshrinkBarIm.length) {
             object oobject = tshrinkBarIm[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.shrinkBarImgTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.shrinkBarImgTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetScaling mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.shrinkBarImgTitle = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LiveActivityWidgetProto$LiveActivityWidgetScaling tshrinkBarIm = this.shrinkBarImg;
                      int i2 = (tshrinkBarIm == null)? 0: tshrinkBarIm.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tshrinkBarIm, 0, picUrlArray, 0, i2);
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
                      this.shrinkBarImg = picUrlArray;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && i != 2)) {
                      continue ;
                   }else {
                      this.scalingColorType = i;
                   }
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             this.backgroundColor = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(1, this.backgroundColor);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       LiveActivityWidgetProto$LiveActivityWidgetScaling tscalingColo = this.scalingColorType;
       if (tscalingColo != null) {
          p0.writeInt32(3, tscalingColo);
       }
       tscalingColo = this.shrinkBarImg;
       if (tscalingColo != null && tscalingColo.length > 0) {
          int i = 0;
          LiveActivityWidgetProto$LiveActivityWidgetScaling tshrinkBarIm = this.shrinkBarImg;
          while (i < tshrinkBarIm.length) {
             object oobject = tshrinkBarIm[i];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.shrinkBarImgTitle).equals(str)) {
          p0.writeString(5, this.shrinkBarImgTitle);
       }
       super.writeTo(p0);
       return;
    }
}
