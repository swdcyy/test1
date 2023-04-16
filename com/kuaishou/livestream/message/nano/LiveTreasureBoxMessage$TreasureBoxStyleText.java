package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxStyleText;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveTreasureBoxMessage$TreasureBoxStyleText extends MessageNano	// class@0013b8
{
    public int fontSize;
    public String text;
    public String textColor;
    public static LiveTreasureBoxMessage$TreasureBoxStyleText[] _emptyArray;

    public void LiveTreasureBoxMessage$TreasureBoxStyleText(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$TreasureBoxStyleText[] emptyArray(){
       if (LiveTreasureBoxMessage$TreasureBoxStyleText._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$TreasureBoxStyleText._emptyArray == null) {
             LiveTreasureBoxMessage$TreasureBoxStyleText[] treasureBoxS = new LiveTreasureBoxMessage$TreasureBoxStyleText[0];
             LiveTreasureBoxMessage$TreasureBoxStyleText._emptyArray = treasureBoxS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$TreasureBoxStyleText._emptyArray;
    }
    public static LiveTreasureBoxMessage$TreasureBoxStyleText parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$TreasureBoxStyleText().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$TreasureBoxStyleText parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$TreasureBoxStyleText(), p0);
    }
    public LiveTreasureBoxMessage$TreasureBoxStyleText clear(){
       this.text = "";
       this.fontSize = 0;
       this.textColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.text);
       }
       LiveTreasureBoxMessage$TreasureBoxStyleText tfontSize = this.fontSize;
       if (tfontSize != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tfontSize);
       }
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.textColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$TreasureBoxStyleText mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.textColor = p0.readString();
                }
             }else {
                this.fontSize = p0.readUInt32();
             }
          }else {
             this.text = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.text).equals(str)) {
          p0.writeString(1, this.text);
       }
       LiveTreasureBoxMessage$TreasureBoxStyleText tfontSize = this.fontSize;
       if (tfontSize != null) {
          p0.writeUInt32(2, tfontSize);
       }
       if (!(this.textColor).equals(str)) {
          p0.writeString(3, this.textColor);
       }
       super.writeTo(p0);
       return;
    }
}
