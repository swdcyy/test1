package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantTreasureBoxMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveStreamMessages$LiveActivityPendantTreasureBoxMessage extends MessageNano	// class@0012ee
{
    public String boxId;
    public Map extraMessage;
    public UserInfos$PicUrl[] followHintPopPict;
    public String jumpUrl;
    public boolean needFollow;
    public static LiveStreamMessages$LiveActivityPendantTreasureBoxMessage[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantTreasureBoxMessage(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantTreasureBoxMessage[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantTreasureBoxMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantTreasureBoxMessage._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantTreasureBoxMessage[] liveActivity = new LiveStreamMessages$LiveActivityPendantTreasureBoxMessage[0];
             LiveStreamMessages$LiveActivityPendantTreasureBoxMessage._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantTreasureBoxMessage._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantTreasureBoxMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantTreasureBoxMessage().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantTreasureBoxMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantTreasureBoxMessage(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantTreasureBoxMessage clear(){
       this.boxId = "";
       this.followHintPopPict = UserInfos$PicUrl.emptyArray();
       this.jumpUrl = "";
       this.extraMessage = null;
       this.needFollow = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.boxId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.boxId);
       }
       LiveStreamMessages$LiveActivityPendantTreasureBoxMessage tfollowHintP = this.followHintPopPict;
       if (tfollowHintP != null && tfollowHintP.length > 0) {
          int i1 = 0;
          LiveStreamMessages$LiveActivityPendantTreasureBoxMessage tfollowHintP1 = this.followHintPopPict;
          while (i1 < tfollowHintP1.length) {
             object oobject = tfollowHintP1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       tfollowHintP = this.extraMessage;
       if (tfollowHintP != null) {
          i = i + InternalNano.computeMapFieldSize(tfollowHintP, 4, 9, 9);
       }
       tfollowHintP = this.needFollow;
       if (tfollowHintP != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tfollowHintP);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantTreasureBoxMessage mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.needFollow = p0.readBool();
                      }
                   }else {
                      this.extraMessage = InternalNano.mergeMapEntry(p0, this.extraMessage, mapFactory, 9, 9, null, 10, 18);
                   }
                }else {
                   this.jumpUrl = p0.readString();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$LiveActivityPendantTreasureBoxMessage tfollowHintP = this.followHintPopPict;
                int i2 = 0;
                int i3 = (tfollowHintP == null)? 0: tfollowHintP.length;
                i = i + i3;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i3) {
                   System.arraycopy(tfollowHintP, i2, picUrlArray, i2, i3);
                }
                i1 = i - 1;
                while (i3 < i1) {
                   picUrlArray[i3] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i3]);
                   p0.readTag();
                   i3 = i3 + 1;
                }
                picUrlArray[i3] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i3]);
                this.followHintPopPict = picUrlArray;
             }
          }else {
             this.boxId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.boxId).equals(str)) {
          p0.writeString(1, this.boxId);
       }
       LiveStreamMessages$LiveActivityPendantTreasureBoxMessage tfollowHintP = this.followHintPopPict;
       if (tfollowHintP != null && tfollowHintP.length > 0) {
          int i = 0;
          LiveStreamMessages$LiveActivityPendantTreasureBoxMessage tfollowHintP1 = this.followHintPopPict;
          while (i < tfollowHintP1.length) {
             object oobject = tfollowHintP1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(3, this.jumpUrl);
       }
       tfollowHintP = this.extraMessage;
       if (tfollowHintP != null) {
          InternalNano.serializeMapField(p0, tfollowHintP, 4, 9, 9);
       }
       tfollowHintP = this.needFollow;
       if (tfollowHintP != null) {
          p0.writeBool(5, tfollowHintP);
       }
       super.writeTo(p0);
       return;
    }
}
