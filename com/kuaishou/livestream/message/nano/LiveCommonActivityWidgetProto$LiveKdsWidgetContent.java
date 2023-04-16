package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveKdsWidgetContent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonActivityWidgetProto$LiveKdsWidgetContent extends MessageNano	// class@001147
{
    public String bundleId;
    public String data;
    public int minBundleVer;
    public static LiveCommonActivityWidgetProto$LiveKdsWidgetContent[] _emptyArray;

    public void LiveCommonActivityWidgetProto$LiveKdsWidgetContent(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$LiveKdsWidgetContent[] emptyArray(){
       if (LiveCommonActivityWidgetProto$LiveKdsWidgetContent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$LiveKdsWidgetContent._emptyArray == null) {
             LiveCommonActivityWidgetProto$LiveKdsWidgetContent[] liveKdsWidge = new LiveCommonActivityWidgetProto$LiveKdsWidgetContent[0];
             LiveCommonActivityWidgetProto$LiveKdsWidgetContent._emptyArray = liveKdsWidge;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$LiveKdsWidgetContent._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$LiveKdsWidgetContent parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$LiveKdsWidgetContent().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$LiveKdsWidgetContent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$LiveKdsWidgetContent(), p0);
    }
    public LiveCommonActivityWidgetProto$LiveKdsWidgetContent clear(){
       this.bundleId = "";
       this.data = "";
       this.minBundleVer = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bundleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.data);
       }
       LiveCommonActivityWidgetProto$LiveKdsWidgetContent tminBundleVe = this.minBundleVer;
       if (tminBundleVe != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tminBundleVe);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$LiveKdsWidgetContent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.minBundleVer = p0.readUInt32();
                }
             }else {
                this.data = p0.readString();
             }
          }else {
             this.bundleId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bundleId).equals(str)) {
          p0.writeString(1, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(2, this.data);
       }
       LiveCommonActivityWidgetProto$LiveKdsWidgetContent tminBundleVe = this.minBundleVer;
       if (tminBundleVe != null) {
          p0.writeUInt32(3, tminBundleVe);
       }
       super.writeTo(p0);
       return;
    }
}
