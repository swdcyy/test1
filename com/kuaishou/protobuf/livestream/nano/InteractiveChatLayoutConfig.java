package com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatWindow;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatResolutionConfig;
import java.lang.Object;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatCanvasSize;

public final class InteractiveChatLayoutConfig extends MessageNano	// class@000c14
{
    public InteractiveChatCanvasSize canvasSize;
    public InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig captureResolutionConfig;
    public int layoutType;
    public InteractiveChatResolutionConfig resolutionConfig;
    public InteractiveChatWindow[] windowInfo;
    public static InteractiveChatLayoutConfig[] _emptyArray;

    public void InteractiveChatLayoutConfig(){
       super();
       this.clear();
    }
    public static InteractiveChatLayoutConfig[] emptyArray(){
       if (InteractiveChatLayoutConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveChatLayoutConfig._emptyArray == null) {
             InteractiveChatLayoutConfig[] interactiveC = new InteractiveChatLayoutConfig[0];
             InteractiveChatLayoutConfig._emptyArray = interactiveC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveChatLayoutConfig._emptyArray;
    }
    public static InteractiveChatLayoutConfig parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveChatLayoutConfig().mergeFrom(p0);
    }
    public static InteractiveChatLayoutConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveChatLayoutConfig(), p0);
    }
    public InteractiveChatLayoutConfig clear(){
       this.canvasSize = null;
       this.windowInfo = InteractiveChatWindow.emptyArray();
       this.resolutionConfig = null;
       this.layoutType = 0;
       this.captureResolutionConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       InteractiveChatLayoutConfig tcanvasSize = this.canvasSize;
       if (tcanvasSize != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tcanvasSize);
       }
       tcanvasSize = this.windowInfo;
       if (tcanvasSize != null && tcanvasSize.length > 0) {
          int i1 = 0;
          InteractiveChatLayoutConfig twindowInfo = this.windowInfo;
          while (i1 < twindowInfo.length) {
             object oobject = twindowInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tcanvasSize = this.resolutionConfig;
       if (tcanvasSize != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tcanvasSize);
       }
       tcanvasSize = this.layoutType;
       if (tcanvasSize != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tcanvasSize);
       }
       tcanvasSize = this.captureResolutionConfig;
       if (tcanvasSize != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tcanvasSize);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveChatLayoutConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else if(this.captureResolutionConfig == null){
                         this.captureResolutionConfig = new InteractiveChatLayoutConfig$InteractiveChatCaptureResolutionConfig();
                      }
                      p0.readMessage(this.captureResolutionConfig);
                   }else {
                      this.layoutType = p0.readUInt32();
                   }
                }else if(this.resolutionConfig == null){
                   this.resolutionConfig = new InteractiveChatResolutionConfig();
                }
                p0.readMessage(this.resolutionConfig);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                InteractiveChatLayoutConfig twindowInfo = this.windowInfo;
                int i2 = (twindowInfo == null)? 0: twindowInfo.length;
                i = i + i2;
                InteractiveChatWindow[] interactiveC = new InteractiveChatWindow[i];
                if (i2) {
                   System.arraycopy(twindowInfo, 0, interactiveC, 0, i2);
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
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       InteractiveChatLayoutConfig tcanvasSize = this.canvasSize;
       if (tcanvasSize != null) {
          p0.writeMessage(1, tcanvasSize);
       }
       tcanvasSize = this.windowInfo;
       if (tcanvasSize != null && tcanvasSize.length > 0) {
          int i = 0;
          InteractiveChatLayoutConfig twindowInfo = this.windowInfo;
          while (i < twindowInfo.length) {
             object oobject = twindowInfo[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tcanvasSize = this.resolutionConfig;
       if (tcanvasSize != null) {
          p0.writeMessage(3, tcanvasSize);
       }
       tcanvasSize = this.layoutType;
       if (tcanvasSize != null) {
          p0.writeUInt32(4, tcanvasSize);
       }
       tcanvasSize = this.captureResolutionConfig;
       if (tcanvasSize != null) {
          p0.writeMessage(5, tcanvasSize);
       }
       super.writeTo(p0);
       return;
    }
}
