package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantDisplayInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantDisplayKv;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveActivityPendantBizMessage;
import java.lang.System;

public final class LiveStreamMessages$LiveActivityPendantDisplayInfo extends MessageNano	// class@0012e8
{
    public LiveStreamMessages$LiveActivityPendantBizMessage bizMessage;
    public String frontStyle;
    public LiveStreamMessages$LiveActivityPendantDisplayKv[] info;
    public static LiveStreamMessages$LiveActivityPendantDisplayInfo[] _emptyArray;

    public void LiveStreamMessages$LiveActivityPendantDisplayInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayInfo[] emptyArray(){
       if (LiveStreamMessages$LiveActivityPendantDisplayInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveActivityPendantDisplayInfo._emptyArray == null) {
             LiveStreamMessages$LiveActivityPendantDisplayInfo[] liveActivity = new LiveStreamMessages$LiveActivityPendantDisplayInfo[0];
             LiveStreamMessages$LiveActivityPendantDisplayInfo._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveActivityPendantDisplayInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveActivityPendantDisplayInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveActivityPendantDisplayInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveActivityPendantDisplayInfo(), p0);
    }
    public LiveStreamMessages$LiveActivityPendantDisplayInfo clear(){
       this.frontStyle = "";
       this.info = LiveStreamMessages$LiveActivityPendantDisplayKv.emptyArray();
       this.bizMessage = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.frontStyle).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.frontStyle);
       }
       LiveStreamMessages$LiveActivityPendantDisplayInfo tinfo = this.info;
       if (tinfo != null && tinfo.length > 0) {
          int i1 = 0;
          LiveStreamMessages$LiveActivityPendantDisplayInfo tinfo1 = this.info;
          while (i1 < tinfo1.length) {
             object oobject = tinfo1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tinfo = this.bizMessage;
       if (tinfo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tinfo);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveActivityPendantDisplayInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.bizMessage == null){
                   this.bizMessage = new LiveStreamMessages$LiveActivityPendantBizMessage();
                }
                p0.readMessage(this.bizMessage);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveStreamMessages$LiveActivityPendantDisplayInfo tinfo = this.info;
                int i2 = (tinfo == null)? 0: tinfo.length;
                i = i + i2;
                LiveStreamMessages$LiveActivityPendantDisplayKv[] liveActivity = new LiveStreamMessages$LiveActivityPendantDisplayKv[i];
                if (i2) {
                   System.arraycopy(tinfo, 0, liveActivity, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveActivity[i2] = new LiveStreamMessages$LiveActivityPendantDisplayKv();
                   p0.readMessage(liveActivity[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveActivity[i2] = new LiveStreamMessages$LiveActivityPendantDisplayKv();
                p0.readMessage(liveActivity[i2]);
                this.info = liveActivity;
             }
          }else {
             this.frontStyle = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.frontStyle).equals("")) {
          p0.writeString(1, this.frontStyle);
       }
       LiveStreamMessages$LiveActivityPendantDisplayInfo tinfo = this.info;
       if (tinfo != null && tinfo.length > 0) {
          int i = 0;
          LiveStreamMessages$LiveActivityPendantDisplayInfo tinfo1 = this.info;
          while (i < tinfo1.length) {
             object oobject = tinfo1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       tinfo = this.bizMessage;
       if (tinfo != null) {
          p0.writeMessage(3, tinfo);
       }
       super.writeTo(p0);
       return;
    }
}
