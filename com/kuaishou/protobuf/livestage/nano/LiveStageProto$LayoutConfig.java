package com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$Window;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$Size;

public final class LiveStageProto$LayoutConfig extends MessageNano	// class@000bfc
{
    public String bizId;
    public int bizType;
    public LiveStageProto$Size canvasSize;
    public int layoutType;
    public int verion;
    public LiveStageProto$Window[] windowInfo;
    public static LiveStageProto$LayoutConfig[] _emptyArray;

    public void LiveStageProto$LayoutConfig(){
       super();
       this.clear();
    }
    public static LiveStageProto$LayoutConfig[] emptyArray(){
       if (LiveStageProto$LayoutConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStageProto$LayoutConfig._emptyArray == null) {
             LiveStageProto$LayoutConfig[] layoutConfig = new LiveStageProto$LayoutConfig[0];
             LiveStageProto$LayoutConfig._emptyArray = layoutConfig;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStageProto$LayoutConfig._emptyArray;
    }
    public static LiveStageProto$LayoutConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveStageProto$LayoutConfig().mergeFrom(p0);
    }
    public static LiveStageProto$LayoutConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStageProto$LayoutConfig(), p0);
    }
    public LiveStageProto$LayoutConfig clear(){
       this.verion = 0;
       this.bizType = 0;
       this.bizId = "";
       this.canvasSize = null;
       this.windowInfo = LiveStageProto$Window.emptyArray();
       this.layoutType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStageProto$LayoutConfig tverion = this.verion;
       if (tverion != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tverion);
       }
       tverion = this.bizType;
       if (tverion != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tverion);
       }
       if (!(this.bizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bizId);
       }
       tverion = this.canvasSize;
       if (tverion != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tverion);
       }
       tverion = this.windowInfo;
       if (tverion != null && tverion.length > 0) {
          int i1 = 0;
          LiveStageProto$LayoutConfig twindowInfo = this.windowInfo;
          while (i1 < twindowInfo.length) {
             object oobject = twindowInfo[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(5, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tverion = this.layoutType;
       if (tverion != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tverion);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStageProto$LayoutConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 1;
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      int i2 = 42;
                      if (i != i2) {
                         if (i != 48) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.layoutType = p0.readUInt32();
                         }
                      }else {
                         i = WireFormatNano.getRepeatedFieldArrayLength(p0, i2);
                         LiveStageProto$LayoutConfig twindowInfo = this.windowInfo;
                         i1 = 0;
                         int i3 = (twindowInfo == null)? 0: twindowInfo.length;
                         i = i + i3;
                         LiveStageProto$Window[] windowArray = new LiveStageProto$Window[i];
                         if (i3) {
                            System.arraycopy(twindowInfo, i1, windowArray, i1, i3);
                         }
                         i2 = i - 1;
                         while (i3 < i2) {
                            windowArray[i3] = new LiveStageProto$Window();
                            p0.readMessage(windowArray[i3]);
                            p0.readTag();
                            i3 = i3 + 1;
                         }
                         windowArray[i3] = new LiveStageProto$Window();
                         p0.readMessage(windowArray[i3]);
                         this.windowInfo = windowArray;
                      }
                   }else if(this.canvasSize == null){
                      this.canvasSize = new LiveStageProto$Size();
                   }
                   p0.readMessage(this.canvasSize);
                }else {
                   this.bizId = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != i1 && (i != 2 && (i != 3 && (i != 4 && i != 5))))) {
                   continue ;
                }else {
                   this.bizType = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && i != i1) {
                continue ;
             }else {
                this.verion = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStageProto$LayoutConfig tverion = this.verion;
       if (tverion != null) {
          p0.writeInt32(1, tverion);
       }
       tverion = this.bizType;
       if (tverion != null) {
          p0.writeInt32(2, tverion);
       }
       if (!(this.bizId).equals("")) {
          p0.writeString(3, this.bizId);
       }
       tverion = this.canvasSize;
       if (tverion != null) {
          p0.writeMessage(4, tverion);
       }
       tverion = this.windowInfo;
       if (tverion != null && tverion.length > 0) {
          int i = 0;
          LiveStageProto$LayoutConfig twindowInfo = this.windowInfo;
          while (i < twindowInfo.length) {
             object oobject = twindowInfo[i];
             if (oobject != null) {
                p0.writeMessage(5, oobject);
             }
             i = i + 1;
          }
       }
       tverion = this.layoutType;
       if (tverion != null) {
          p0.writeUInt32(6, tverion);
       }
       super.writeTo(p0);
       return;
    }
}
