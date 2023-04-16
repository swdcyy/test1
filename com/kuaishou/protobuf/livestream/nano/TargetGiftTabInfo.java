package com.kuaishou.protobuf.livestream.nano.TargetGiftTabInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class TargetGiftTabInfo extends MessageNano	// class@000d7d
{
    public String liteTargetGiftTab;
    public String targetGiftTab;
    public static TargetGiftTabInfo[] _emptyArray;

    public void TargetGiftTabInfo(){
       super();
       this.clear();
    }
    public static TargetGiftTabInfo[] emptyArray(){
       if (TargetGiftTabInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TargetGiftTabInfo._emptyArray == null) {
             TargetGiftTabInfo[] targetGiftTa = new TargetGiftTabInfo[0];
             TargetGiftTabInfo._emptyArray = targetGiftTa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TargetGiftTabInfo._emptyArray;
    }
    public static TargetGiftTabInfo parseFrom(CodedInputByteBufferNano p0){
       return new TargetGiftTabInfo().mergeFrom(p0);
    }
    public static TargetGiftTabInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TargetGiftTabInfo(), p0);
    }
    public TargetGiftTabInfo clear(){
       this.targetGiftTab = "";
       this.liteTargetGiftTab = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.targetGiftTab).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.targetGiftTab);
       }
       if (!(this.liteTargetGiftTab).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liteTargetGiftTab);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TargetGiftTabInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.liteTargetGiftTab = p0.readString();
             }
          }else {
             this.targetGiftTab = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.targetGiftTab).equals(str)) {
          p0.writeString(1, this.targetGiftTab);
       }
       if (!(this.liteTargetGiftTab).equals(str)) {
          p0.writeString(2, this.liteTargetGiftTab);
       }
       super.writeTo(p0);
       return;
    }
}
