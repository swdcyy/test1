package com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCentaurLayoutConfigMessage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;

public final class LiveFlvStream$LiveCentaurLayoutConfigMessage extends MessageNano	// class@000c66
{
    public int bizType;
    public InteractiveChatCanvasSize canvasSize;
    public boolean hasSeiMessage;
    public LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[] userInfo;
    public InteractiveChatWindow[] windowInfo;
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage[] _emptyArray;

    public void LiveFlvStream$LiveCentaurLayoutConfigMessage(){
       super();
       this.clear();
    }
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage[] emptyArray(){
       if (LiveFlvStream$LiveCentaurLayoutConfigMessage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFlvStream$LiveCentaurLayoutConfigMessage._emptyArray == null) {
             LiveFlvStream$LiveCentaurLayoutConfigMessage[] liveCentaurL = new LiveFlvStream$LiveCentaurLayoutConfigMessage[0];
             LiveFlvStream$LiveCentaurLayoutConfigMessage._emptyArray = liveCentaurL;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFlvStream$LiveCentaurLayoutConfigMessage._emptyArray;
    }
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage parseFrom(CodedInputByteBufferNano p0){
       return new LiveFlvStream$LiveCentaurLayoutConfigMessage().mergeFrom(p0);
    }
    public static LiveFlvStream$LiveCentaurLayoutConfigMessage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFlvStream$LiveCentaurLayoutConfigMessage(), p0);
    }
    public LiveFlvStream$LiveCentaurLayoutConfigMessage clear(){
       this.bizType = 0;
       this.canvasSize = null;
       this.windowInfo = InteractiveChatWindow.emptyArray();
       this.userInfo = LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo.emptyArray();
       this.hasSeiMessage = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFlvStream$LiveCentaurLayoutConfigMessage tbizType = this.bizType;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tbizType);
       }
       tbizType = this.canvasSize;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tbizType);
       }
       tbizType = this.windowInfo;
       int i1 = 0;
       if (tbizType != null && tbizType.length > 0) {
          int i2 = 0;
          LiveFlvStream$LiveCentaurLayoutConfigMessage twindowInfo = this.windowInfo;
          while (i2 < twindowInfo.length) {
             object oobject = twindowInfo[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(3, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tbizType = this.userInfo;
       if (tbizType != null && tbizType.length > 0) {
          tbizType = this.userInfo;
          while (i1 < tbizType.length) {
             object oobject1 = tbizType[i1];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       tbizType = this.hasSeiMessage;
       if (tbizType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tbizType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFlvStream$LiveCentaurLayoutConfigMessage mergeFrom(CodedInputByteBufferNano p0){
       LiveFlvStream$LiveCentaurLayoutConfigMessage tuserInfo;
       int i2;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                int i1 = 26;
                if (i != i1) {
                   i1 = 34;
                   if (i != i1) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.hasSeiMessage = p0.readBool();
                      }
                   }else {
                      i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                      tuserInfo = this.userInfo;
                      i2 = (tuserInfo == null)? 0: tuserInfo.length;
                      i = i + i2;
                      LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[] liveCentaurL = new LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo[i];
                      if (i2) {
                         System.arraycopy(tuserInfo, 0, liveCentaurL, 0, i2);
                      }
                      i1 = i - 1;
                      while (i2 < i1) {
                         liveCentaurL[i2] = new LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo();
                         p0.readMessage(liveCentaurL[i2]);
                         p0.readTag();
                         i2 = i2 + 1;
                      }
                      liveCentaurL[i2] = new LiveFlvStream$LiveCentaurLayoutConfigMessage$UserInfo();
                      p0.readMessage(liveCentaurL[i2]);
                      this.userInfo = liveCentaurL;
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tuserInfo = this.windowInfo;
                   i2 = (tuserInfo == null)? 0: tuserInfo.length;
                   i = i + i2;
                   InteractiveChatWindow[] interactiveC = new InteractiveChatWindow[i];
                   if (i2) {
                      System.arraycopy(tuserInfo, 0, interactiveC, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      interactiveC[i2] = new InteractiveChatWindow();
                      p0.readMessage(interactiveC[i2]);
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   interactiveC[i2] = new InteractiveChatWindow();
                   p0.readMessage(interactiveC[i2]);
                   this.windowInfo = interactiveC;
                }
             }else if(this.canvasSize == null){
                this.canvasSize = new InteractiveChatCanvasSize();
             }
             p0.readMessage(this.canvasSize);
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                continue ;
             }else {
                this.bizType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFlvStream$LiveCentaurLayoutConfigMessage tbizType = this.bizType;
       if (tbizType != null) {
          p0.writeInt32(1, tbizType);
       }
       tbizType = this.canvasSize;
       if (tbizType != null) {
          p0.writeMessage(2, tbizType);
       }
       tbizType = this.windowInfo;
       int i = 0;
       if (tbizType != null && tbizType.length > 0) {
          int i1 = 0;
          LiveFlvStream$LiveCentaurLayoutConfigMessage twindowInfo = this.windowInfo;
          while (i1 < twindowInfo.length) {
             object oobject = twindowInfo[i1];
             if (oobject != null) {
                p0.writeMessage(3, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tbizType = this.userInfo;
       if (tbizType != null && tbizType.length > 0) {
          tbizType = this.userInfo;
          while (i < tbizType.length) {
             object oobject1 = tbizType[i];
             if (oobject1 != null) {
                p0.writeMessage(4, oobject1);
             }
             i = i + 1;
          }
       }
       tbizType = this.hasSeiMessage;
       if (tbizType != null) {
          p0.writeBool(5, tbizType);
       }
       super.writeTo(p0);
       return;
    }
}
