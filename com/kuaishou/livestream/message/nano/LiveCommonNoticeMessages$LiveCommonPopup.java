package com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveCommonPopup;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveCommonNoticeMessages$LiveCommonPopup extends MessageNano	// class@001155
{
    public String buttonContent;
    public long buttonCountdownSecond;
    public String detail;
    public LiveCdnNodeView[] iconCdnNodeView;
    public String title;
    public static LiveCommonNoticeMessages$LiveCommonPopup[] _emptyArray;

    public void LiveCommonNoticeMessages$LiveCommonPopup(){
       super();
       this.clear();
    }
    public static LiveCommonNoticeMessages$LiveCommonPopup[] emptyArray(){
       if (LiveCommonNoticeMessages$LiveCommonPopup._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonNoticeMessages$LiveCommonPopup._emptyArray == null) {
             LiveCommonNoticeMessages$LiveCommonPopup[] liveCommonPo = new LiveCommonNoticeMessages$LiveCommonPopup[0];
             LiveCommonNoticeMessages$LiveCommonPopup._emptyArray = liveCommonPo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonNoticeMessages$LiveCommonPopup._emptyArray;
    }
    public static LiveCommonNoticeMessages$LiveCommonPopup parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonNoticeMessages$LiveCommonPopup().mergeFrom(p0);
    }
    public static LiveCommonNoticeMessages$LiveCommonPopup parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonNoticeMessages$LiveCommonPopup(), p0);
    }
    public LiveCommonNoticeMessages$LiveCommonPopup clear(){
       this.iconCdnNodeView = LiveCdnNodeView.emptyArray();
       this.title = "";
       this.detail = "";
       this.buttonContent = "";
       this.buttonCountdownSecond = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonNoticeMessages$LiveCommonPopup ticonCdnNode = this.iconCdnNodeView;
       if (ticonCdnNode != null && ticonCdnNode.length > 0) {
          int i1 = 0;
          LiveCommonNoticeMessages$LiveCommonPopup ticonCdnNode1 = this.iconCdnNodeView;
          while (i1 < ticonCdnNode1.length) {
             object oobject = ticonCdnNode1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.title);
       }
       if (!(this.detail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.detail);
       }
       if (!(this.buttonContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.buttonContent);
       }
       ticonCdnNode = this.buttonCountdownSecond;
       if (ticonCdnNode) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, ticonCdnNode);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonNoticeMessages$LiveCommonPopup mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.buttonCountdownSecond = p0.readUInt64();
                      }
                   }else {
                      this.buttonContent = p0.readString();
                   }
                }else {
                   this.detail = p0.readString();
                }
             }else {
                this.title = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCommonNoticeMessages$LiveCommonPopup ticonCdnNode = this.iconCdnNodeView;
             int i2 = (ticonCdnNode == null)? 0: ticonCdnNode.length;
             i = i + i2;
             LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
             if (i2) {
                System.arraycopy(ticonCdnNode, 0, liveCdnNodeV, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveCdnNodeV[i2] = new LiveCdnNodeView();
             p0.readMessage(liveCdnNodeV[i2]);
             this.iconCdnNodeView = liveCdnNodeV;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonNoticeMessages$LiveCommonPopup ticonCdnNode = this.iconCdnNodeView;
       if (ticonCdnNode != null && ticonCdnNode.length > 0) {
          int i = 0;
          LiveCommonNoticeMessages$LiveCommonPopup ticonCdnNode1 = this.iconCdnNodeView;
          while (i < ticonCdnNode1.length) {
             object oobject = ticonCdnNode1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       String str = "";
       if (!(this.title).equals(str)) {
          p0.writeString(2, this.title);
       }
       if (!(this.detail).equals(str)) {
          p0.writeString(3, this.detail);
       }
       if (!(this.buttonContent).equals(str)) {
          p0.writeString(4, this.buttonContent);
       }
       ticonCdnNode = this.buttonCountdownSecond;
       if (ticonCdnNode) {
          p0.writeUInt64(5, ticonCdnNode);
       }
       super.writeTo(p0);
       return;
    }
}
