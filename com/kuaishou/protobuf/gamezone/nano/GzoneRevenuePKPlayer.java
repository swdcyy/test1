package com.kuaishou.protobuf.gamezone.nano.GzoneRevenuePKPlayer;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class GzoneRevenuePKPlayer extends MessageNano	// class@000bca
{
    public String content;
    public Map data;
    public UserInfos$PicUrl[] headUrl;
    public String hint;
    public UserInfos$PicUrl[] icon;
    public String nickName;
    public String tag;
    public static GzoneRevenuePKPlayer[] _emptyArray;

    public void GzoneRevenuePKPlayer(){
       super();
       this.clear();
    }
    public static GzoneRevenuePKPlayer[] emptyArray(){
       if (GzoneRevenuePKPlayer._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneRevenuePKPlayer._emptyArray == null) {
             GzoneRevenuePKPlayer[] gzoneRevenue = new GzoneRevenuePKPlayer[0];
             GzoneRevenuePKPlayer._emptyArray = gzoneRevenue;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneRevenuePKPlayer._emptyArray;
    }
    public static GzoneRevenuePKPlayer parseFrom(CodedInputByteBufferNano p0){
       return new GzoneRevenuePKPlayer().mergeFrom(p0);
    }
    public static GzoneRevenuePKPlayer parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneRevenuePKPlayer(), p0);
    }
    public GzoneRevenuePKPlayer clear(){
       this.headUrl = UserInfos$PicUrl.emptyArray();
       this.nickName = "";
       this.content = "";
       this.icon = UserInfos$PicUrl.emptyArray();
       this.hint = "";
       this.tag = "";
       this.data = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneRevenuePKPlayer theadUrl = this.headUrl;
       int i1 = 0;
       if (theadUrl != null && theadUrl.length > 0) {
          int i2 = 0;
          GzoneRevenuePKPlayer theadUrl1 = this.headUrl;
          while (i2 < theadUrl1.length) {
             object oobject = theadUrl1[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i2 = i2 + 1;
          }
       }
       String str = "";
       if (!(this.nickName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.nickName);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.content);
       }
       theadUrl = this.icon;
       if (theadUrl != null && theadUrl.length > 0) {
          theadUrl = this.icon;
          while (i1 < theadUrl.length) {
             object oobject1 = theadUrl[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.hint).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.hint);
       }
       if (!(this.tag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.tag);
       }
       theadUrl = this.data;
       if (theadUrl != null) {
          i = i + InternalNano.computeMapFieldSize(theadUrl, 7, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneRevenuePKPlayer mergeFrom(CodedInputByteBufferNano p0){
       GzoneRevenuePKPlayer ticon;
       int i2;
       UserInfos$PicUrl[] picUrlArray;
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          MapFactories$MapFactory mapFactory1 = null;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.data = InternalNano.mergeMapEntry(p0, this.data, mapFactory, 9, 9, null, 10, 18);
                            }
                         }else {
                            this.tag = p0.readString();
                         }
                      }else {
                         this.hint = p0.readString();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      ticon = this.icon;
                      i2 = (ticon == null)? 0: ticon.length;
                      i = i + i2;
                      picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(ticon, mapFactory1, picUrlArray, mapFactory1, i2);
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
                   this.content = p0.readString();
                }
             }else {
                this.nickName = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ticon = this.headUrl;
             i2 = (ticon == null)? 0: ticon.length;
             i = i + i2;
             picUrlArray = new UserInfos$PicUrl[i];
             if (i2) {
                System.arraycopy(ticon, mapFactory1, picUrlArray, mapFactory1, i2);
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
             this.headUrl = picUrlArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneRevenuePKPlayer theadUrl = this.headUrl;
       int i = 0;
       if (theadUrl != null && theadUrl.length > 0) {
          int i1 = 0;
          GzoneRevenuePKPlayer theadUrl1 = this.headUrl;
          while (i1 < theadUrl1.length) {
             object oobject = theadUrl1[i1];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.nickName).equals(str)) {
          p0.writeString(2, this.nickName);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(3, this.content);
       }
       theadUrl = this.icon;
       if (theadUrl != null && theadUrl.length > 0) {
          theadUrl = this.icon;
          while (i < theadUrl.length) {
             object oobject1 = theadUrl[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       if (!(this.hint).equals(str)) {
          p0.writeString(5, this.hint);
       }
       if (!(this.tag).equals(str)) {
          p0.writeString(6, this.tag);
       }
       theadUrl = this.data;
       if (theadUrl != null) {
          InternalNano.serializeMapField(p0, theadUrl, 7, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
