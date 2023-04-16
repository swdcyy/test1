package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent extends MessageNano	// class@001141
{
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[] pageContent;
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent[] _emptyArray;

    public void LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent[] emptyArray(){
       if (LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent._emptyArray == null) {
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent[] liveCommonAc = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent[0];
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent._emptyArray = liveCommonAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent(), p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent clear(){
       this.pageContent = LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent tpageContent = this.pageContent;
       if (tpageContent != null && tpageContent.length > 0) {
          int i1 = 0;
          LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent tpageContent1 = this.pageContent;
          while (i1 < tpageContent1.length) {
             object oobject = tpageContent1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent tpageContent = this.pageContent;
             int i2 = (tpageContent == null)? 0: tpageContent.length;
             i = i + i2;
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[] liveCommonAc = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[i];
             if (i2) {
                System.arraycopy(tpageContent, 0, liveCommonAc, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                liveCommonAc[i2] = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent();
                p0.readMessage(liveCommonAc[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             liveCommonAc[i2] = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent();
             p0.readMessage(liveCommonAc[i2]);
             this.pageContent = liveCommonAc;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent tpageContent = this.pageContent;
       if (tpageContent != null && tpageContent.length > 0) {
          int i = 0;
          LiveCommonActivityWidgetProto$LiveCommonActivityWidgetContent tpageContent1 = this.pageContent;
          while (i < tpageContent1.length) {
             object oobject = tpageContent1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
