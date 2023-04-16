package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveKdsWidgetContent;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty;
import java.lang.System;

public final class LiveCommonActivityWidgetProto$LiveCommonActivityWidget extends MessageNano	// class@001140
{
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent content;
    public long duration;
    public String id;
    public int itemType;
    public String jumpUrl;
    public LiveCommonActivityWidgetProto$LiveKdsWidgetContent kdsContent;
    public long maxDelayMillis;
    public String name;
    public UserInfos$PicUrl[] picUrl;
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty property;
    public int type;
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidget[] _emptyArray;

    public void LiveCommonActivityWidgetProto$LiveCommonActivityWidget(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidget[] emptyArray(){
       if (LiveCommonActivityWidgetProto$LiveCommonActivityWidget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$LiveCommonActivityWidget._emptyArray == null) {
             LiveCommonActivityWidgetProto$LiveCommonActivityWidget[] liveCommonAc = new LiveCommonActivityWidgetProto$LiveCommonActivityWidget[0];
             LiveCommonActivityWidgetProto$LiveCommonActivityWidget._emptyArray = liveCommonAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$LiveCommonActivityWidget._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidget parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$LiveCommonActivityWidget().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$LiveCommonActivityWidget(), p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidget clear(){
       this.id = "";
       this.name = "";
       this.picUrl = UserInfos$PicUrl.emptyArray();
       this.jumpUrl = "";
       this.property = null;
       this.content = null;
       this.type = 0;
       this.itemType = 0;
       this.kdsContent = null;
       this.duration = 0;
       this.maxDelayMillis = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       object oobject;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.name).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.name);
       }
       LiveCommonActivityWidgetProto$LiveCommonActivityWidget tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i1 = 0;
          LiveCommonActivityWidgetProto$LiveCommonActivityWidget tpicUrl1 = this.picUrl;
          while (i1 < tpicUrl1.length) {
             oobject = tpicUrl1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.jumpUrl);
       }
       tpicUrl = this.property;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tpicUrl);
       }
       tpicUrl = this.content;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tpicUrl);
       }
       tpicUrl = this.type;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tpicUrl);
       }
       tpicUrl = this.itemType;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tpicUrl);
       }
       tpicUrl = this.kdsContent;
       if (tpicUrl != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tpicUrl);
       }
       tpicUrl = this.duration;
       oobject = 0;
       if (tpicUrl - oobject) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(10, tpicUrl);
       }
       tpicUrl = this.maxDelayMillis;
       if (tpicUrl - oobject) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(11, tpicUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidget mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          LiveCommonActivityWidgetProto$LiveCommonActivityWidget liveCommonAc = 2;
          int i1 = 1;
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                this.name = p0.readString();
                break;
              case 26:
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 26);
                liveCommonAc = this.picUrl;
                i1 = 0;
                int i2 = (liveCommonAc == null)? 0: liveCommonAc.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(liveCommonAc, i1, picUrlArray, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.picUrl = picUrlArray;
                break;
              case '"':
                this.jumpUrl = p0.readString();
                break;
              case '*':
                if (this.property == null) {
                   this.property = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetProperty();
                }
                p0.readMessage(this.property);
                break;
              case '2':
                if (this.content == null) {
                   this.content = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent();
                }
                p0.readMessage(this.content);
                break;
              case '8':
                i = p0.readInt32();
                if (i && (i != i1 && (i != liveCommonAc && i != 3))) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != i1 && i != liveCommonAc)) {
                   continue ;
                }else {
                   this.itemType = i;
                }
                break;
              case 'J':
                if (this.kdsContent == null) {
                   this.kdsContent = new LiveCommonActivityWidgetProto$LiveKdsWidgetContent();
                }
                p0.readMessage(this.kdsContent);
                break;
              case 'P':
                this.duration = p0.readUInt64();
                break;
              case 'X':
                this.maxDelayMillis = p0.readUInt64();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       object oobject;
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.name).equals(str)) {
          p0.writeString(2, this.name);
       }
       LiveCommonActivityWidgetProto$LiveCommonActivityWidget tpicUrl = this.picUrl;
       if (tpicUrl != null && tpicUrl.length > 0) {
          int i = 0;
          LiveCommonActivityWidgetProto$LiveCommonActivityWidget tpicUrl1 = this.picUrl;
          while (i < tpicUrl1.length) {
             oobject = tpicUrl1[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(4, this.jumpUrl);
       }
       tpicUrl = this.property;
       if (tpicUrl != null) {
          p0.writeMessage(5, tpicUrl);
       }
       tpicUrl = this.content;
       if (tpicUrl != null) {
          p0.writeMessage(6, tpicUrl);
       }
       tpicUrl = this.type;
       if (tpicUrl != null) {
          p0.writeInt32(7, tpicUrl);
       }
       tpicUrl = this.itemType;
       if (tpicUrl != null) {
          p0.writeInt32(8, tpicUrl);
       }
       tpicUrl = this.kdsContent;
       if (tpicUrl != null) {
          p0.writeMessage(9, tpicUrl);
       }
       tpicUrl = this.duration;
       oobject = 0;
       if (tpicUrl - oobject) {
          p0.writeUInt64(10, tpicUrl);
       }
       tpicUrl = this.maxDelayMillis;
       if (tpicUrl - oobject) {
          p0.writeUInt64(11, tpicUrl);
       }
       super.writeTo(p0);
       return;
    }
}
