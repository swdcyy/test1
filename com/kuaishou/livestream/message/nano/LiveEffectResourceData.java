package com.kuaishou.livestream.message.nano.LiveEffectResourceData;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveEffectImageConfig;
import java.lang.System;

public final class LiveEffectResourceData extends MessageNano	// class@00119b
{
    public UserInfos$PicUrl[] cdnUrl;
    public int downloadSource;
    public LiveEffectImageConfig imageConfig;
    public String position;
    public int resType;
    public String resourceId;
    public static LiveEffectResourceData[] _emptyArray;

    public void LiveEffectResourceData(){
       super();
       this.clear();
    }
    public static LiveEffectResourceData[] emptyArray(){
       if (LiveEffectResourceData._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveEffectResourceData._emptyArray == null) {
             LiveEffectResourceData[] liveEffectRe = new LiveEffectResourceData[0];
             LiveEffectResourceData._emptyArray = liveEffectRe;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveEffectResourceData._emptyArray;
    }
    public static LiveEffectResourceData parseFrom(CodedInputByteBufferNano p0){
       return new LiveEffectResourceData().mergeFrom(p0);
    }
    public static LiveEffectResourceData parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveEffectResourceData(), p0);
    }
    public LiveEffectResourceData clear(){
       this.position = "";
       this.resType = 0;
       this.cdnUrl = UserInfos$PicUrl.emptyArray();
       this.imageConfig = null;
       this.resourceId = "";
       this.downloadSource = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.position).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.position);
       }
       LiveEffectResourceData tresType = this.resType;
       if (tresType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tresType);
       }
       tresType = this.cdnUrl;
       if (tresType != null && tresType.length > 0) {
          int i1 = 0;
          LiveEffectResourceData tcdnUrl = this.cdnUrl;
          while (i1 < tcdnUrl.length) {
             object oobject = tcdnUrl[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tresType = this.imageConfig;
       if (tresType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tresType);
       }
       if (!(this.resourceId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.resourceId);
       }
       tresType = this.downloadSource;
       if (tresType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tresType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveEffectResourceData mergeFrom(CodedInputByteBufferNano p0){
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
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && (i != 2 && i != 3))) {
                               continue ;
                            }else {
                               this.downloadSource = i;
                            }
                         }
                      }else {
                         this.resourceId = p0.readString();
                      }
                   }else if(this.imageConfig == null){
                      this.imageConfig = new LiveEffectImageConfig();
                   }
                   p0.readMessage(this.imageConfig);
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   LiveEffectResourceData tcdnUrl = this.cdnUrl;
                   int i2 = (tcdnUrl == null)? 0: tcdnUrl.length;
                   i = i + i2;
                   UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                   if (i2) {
                      System.arraycopy(tcdnUrl, 0, picUrlArray, 0, i2);
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
                   this.cdnUrl = picUrlArray;
                }
             }else {
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 1:
                      break;
                    default:
                }
                this.resType = i;
             }
          }else {
             this.position = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.position).equals(str)) {
          p0.writeString(1, this.position);
       }
       LiveEffectResourceData tresType = this.resType;
       if (tresType != null) {
          p0.writeInt32(2, tresType);
       }
       tresType = this.cdnUrl;
       if (tresType != null && tresType.length > 0) {
          int i = 0;
          LiveEffectResourceData tcdnUrl = this.cdnUrl;
          while (i < tcdnUrl.length) {
             object oobject = tcdnUrl[i];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i = i + 1;
          }
       }
       tresType = this.imageConfig;
       if (tresType != null) {
          p0.writeMessage(4, tresType);
       }
       if (!(this.resourceId).equals(str)) {
          p0.writeString(5, this.resourceId);
       }
       tresType = this.downloadSource;
       if (tresType != null) {
          p0.writeInt32(6, tresType);
       }
       super.writeTo(p0);
       return;
    }
}
