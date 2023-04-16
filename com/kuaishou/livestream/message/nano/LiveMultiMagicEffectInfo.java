package com.kuaishou.livestream.message.nano.LiveMultiMagicEffectInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.socket.nano.UserInfos$UserInfo;

public final class LiveMultiMagicEffectInfo extends MessageNano	// class@001203
{
    public int bizType;
    public String content;
    public String extraInfo;
    public UserInfos$UserInfo fromUserInfo;
    public int liveStreamType;
    public long magicFaceId;
    public int magicSubType;
    public static LiveMultiMagicEffectInfo[] _emptyArray;

    public void LiveMultiMagicEffectInfo(){
       super();
       this.clear();
    }
    public static LiveMultiMagicEffectInfo[] emptyArray(){
       if (LiveMultiMagicEffectInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiMagicEffectInfo._emptyArray == null) {
             LiveMultiMagicEffectInfo[] liveMultiMag = new LiveMultiMagicEffectInfo[0];
             LiveMultiMagicEffectInfo._emptyArray = liveMultiMag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiMagicEffectInfo._emptyArray;
    }
    public static LiveMultiMagicEffectInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiMagicEffectInfo().mergeFrom(p0);
    }
    public static LiveMultiMagicEffectInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiMagicEffectInfo(), p0);
    }
    public LiveMultiMagicEffectInfo clear(){
       this.bizType = 0;
       this.magicFaceId = 0;
       this.magicSubType = 0;
       this.fromUserInfo = null;
       this.content = "";
       this.liveStreamType = 0;
       this.extraInfo = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiMagicEffectInfo tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       tbizType = this.magicFaceId;
       if (tbizType - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tbizType);
       }
       tbizType = this.magicSubType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tbizType);
       }
       tbizType = this.fromUserInfo;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tbizType);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.content);
       }
       tbizType = this.liveStreamType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tbizType);
       }
       if (!(this.extraInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.extraInfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiMagicEffectInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.extraInfo = p0.readString();
                            }
                         }else {
                            i = p0.readInt32();
                            if (i && (i != 1 && i != 2)) {
                               continue ;
                            }else {
                               this.liveStreamType = i;
                            }
                         }
                      }else {
                         this.content = p0.readString();
                      }
                   }else if(this.fromUserInfo == null){
                      this.fromUserInfo = new UserInfos$UserInfo();
                   }
                   p0.readMessage(this.fromUserInfo);
                }else {
                   this.magicSubType = p0.readInt32();
                }
             }else {
                this.magicFaceId = p0.readInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiMagicEffectInfo tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       tbizType = this.magicFaceId;
       if (tbizType - null) {
          p0.writeInt64(2, tbizType);
       }
       tbizType = this.magicSubType;
       if (tbizType != null) {
          p0.writeInt32(3, tbizType);
       }
       tbizType = this.fromUserInfo;
       if (tbizType != null) {
          p0.writeMessage(4, tbizType);
       }
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(5, this.content);
       }
       tbizType = this.liveStreamType;
       if (tbizType != null) {
          p0.writeInt32(6, tbizType);
       }
       if (!(this.extraInfo).equals(str)) {
          p0.writeString(7, this.extraInfo);
       }
       super.writeTo(p0);
       return;
    }
}
