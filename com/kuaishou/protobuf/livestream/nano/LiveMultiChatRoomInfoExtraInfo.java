package com.kuaishou.protobuf.livestream.nano.LiveMultiChatRoomInfoExtraInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveMultiChatUserLabel;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveMultiChatRoomInfoExtraInfo extends MessageNano	// class@000ca8
{
    public int theme;
    public LiveMultiChatUserLabel[] userLabel;
    public static LiveMultiChatRoomInfoExtraInfo[] _emptyArray;

    public void LiveMultiChatRoomInfoExtraInfo(){
       super();
       this.clear();
    }
    public static LiveMultiChatRoomInfoExtraInfo[] emptyArray(){
       if (LiveMultiChatRoomInfoExtraInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiChatRoomInfoExtraInfo._emptyArray == null) {
             LiveMultiChatRoomInfoExtraInfo[] liveMultiCha = new LiveMultiChatRoomInfoExtraInfo[0];
             LiveMultiChatRoomInfoExtraInfo._emptyArray = liveMultiCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiChatRoomInfoExtraInfo._emptyArray;
    }
    public static LiveMultiChatRoomInfoExtraInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiChatRoomInfoExtraInfo().mergeFrom(p0);
    }
    public static LiveMultiChatRoomInfoExtraInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiChatRoomInfoExtraInfo(), p0);
    }
    public LiveMultiChatRoomInfoExtraInfo clear(){
       this.userLabel = LiveMultiChatUserLabel.emptyArray();
       this.theme = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiChatRoomInfoExtraInfo tuserLabel = this.userLabel;
       if (tuserLabel != null && tuserLabel.length > 0) {
          int i1 = 0;
          LiveMultiChatRoomInfoExtraInfo tuserLabel1 = this.userLabel;
          while (i1 < tuserLabel1.length) {
             object oobject = tuserLabel1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuserLabel = this.theme;
       if (tuserLabel != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tuserLabel);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiChatRoomInfoExtraInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.theme = i;
                }
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveMultiChatRoomInfoExtraInfo tuserLabel = this.userLabel;
             int i2 = (tuserLabel == null)? 0: tuserLabel.length;
             i = i + i2;
             LiveMultiChatUserLabel[] liveMultiCha = new LiveMultiChatUserLabel[i];
             if (i2) {
                System.arraycopy(tuserLabel, 0, liveMultiCha, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveMultiCha[i2] = new LiveMultiChatUserLabel();
                p0.readMessage(liveMultiCha[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveMultiCha[i2] = new LiveMultiChatUserLabel();
             p0.readMessage(liveMultiCha[i2]);
             this.userLabel = liveMultiCha;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiChatRoomInfoExtraInfo tuserLabel = this.userLabel;
       if (tuserLabel != null && tuserLabel.length > 0) {
          int i = 0;
          LiveMultiChatRoomInfoExtraInfo tuserLabel1 = this.userLabel;
          while (i < tuserLabel1.length) {
             object oobject = tuserLabel1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tuserLabel = this.theme;
       if (tuserLabel != null) {
          p0.writeInt32(2, tuserLabel);
       }
       super.writeTo(p0);
       return;
    }
}
