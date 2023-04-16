package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$LiveTreasureBoxGrabPage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveTreasureBoxMessage$LiveTreasureBoxGrabPage extends MessageNano	// class@0013ad
{
    public UserInfos$PicUrl[] followHintPopPict;
    public String jumpUrl;
    public boolean needFollow;
    public long popDeadline;
    public long popTime;
    public static LiveTreasureBoxMessage$LiveTreasureBoxGrabPage[] _emptyArray;

    public void LiveTreasureBoxMessage$LiveTreasureBoxGrabPage(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxGrabPage[] emptyArray(){
       if (LiveTreasureBoxMessage$LiveTreasureBoxGrabPage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$LiveTreasureBoxGrabPage._emptyArray == null) {
             LiveTreasureBoxMessage$LiveTreasureBoxGrabPage[] liveTreasure = new LiveTreasureBoxMessage$LiveTreasureBoxGrabPage[0];
             LiveTreasureBoxMessage$LiveTreasureBoxGrabPage._emptyArray = liveTreasure;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$LiveTreasureBoxGrabPage._emptyArray;
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxGrabPage parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$LiveTreasureBoxGrabPage().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$LiveTreasureBoxGrabPage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$LiveTreasureBoxGrabPage(), p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxGrabPage clear(){
       this.popTime = 0;
       this.popDeadline = 0;
       this.jumpUrl = "";
       this.followHintPopPict = UserInfos$PicUrl.emptyArray();
       this.needFollow = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTreasureBoxMessage$LiveTreasureBoxGrabPage tpopTime = this.popTime;
       int i1 = 0;
       if (tpopTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tpopTime);
       }
       tpopTime = this.popDeadline;
       if (tpopTime - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tpopTime);
       }
       if (!(this.jumpUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.jumpUrl);
       }
       tpopTime = this.followHintPopPict;
       if (tpopTime != null && tpopTime.length > 0) {
          int i2 = 0;
          LiveTreasureBoxMessage$LiveTreasureBoxGrabPage tfollowHintP = this.followHintPopPict;
          while (i2 < tfollowHintP.length) {
             object oobject = tfollowHintP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tpopTime = this.needFollow;
       if (tpopTime != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tpopTime);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$LiveTreasureBoxGrabPage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   int i1 = 34;
                   if (i != i1) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.needFollow = p0.readBool();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      LiveTreasureBoxMessage$LiveTreasureBoxGrabPage tfollowHintP = this.followHintPopPict;
                      int i2 = (tfollowHintP == null)? 0: tfollowHintP.length;
                      i = i + i2;
                      UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                      if (i2) {
                         System.arraycopy(tfollowHintP, 0, picUrlArray, 0, i2);
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
                      this.followHintPopPict = picUrlArray;
                   }
                }else {
                   this.jumpUrl = p0.readString();
                }
             }else {
                this.popDeadline = p0.readUInt64();
             }
          }else {
             this.popTime = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTreasureBoxMessage$LiveTreasureBoxGrabPage tpopTime = this.popTime;
       int i = 0;
       if (tpopTime - i) {
          p0.writeUInt64(1, tpopTime);
       }
       tpopTime = this.popDeadline;
       if (tpopTime - i) {
          p0.writeUInt64(2, tpopTime);
       }
       if (!(this.jumpUrl).equals("")) {
          p0.writeString(3, this.jumpUrl);
       }
       tpopTime = this.followHintPopPict;
       if (tpopTime != null && tpopTime.length > 0) {
          int i1 = 0;
          LiveTreasureBoxMessage$LiveTreasureBoxGrabPage tfollowHintP = this.followHintPopPict;
          while (i1 < tfollowHintP.length) {
             object oobject = tfollowHintP[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tpopTime = this.needFollow;
       if (tpopTime != null) {
          p0.writeBool(5, tpopTime);
       }
       super.writeTo(p0);
       return;
    }
}
