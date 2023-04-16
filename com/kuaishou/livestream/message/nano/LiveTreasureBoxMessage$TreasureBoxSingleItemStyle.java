package com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxSingleItemStyle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveTreasureBoxMessage$TreasureBoxStyleText;

public final class LiveTreasureBoxMessage$TreasureBoxSingleItemStyle extends MessageNano	// class@0013b7
{
    public int displayType;
    public LiveTreasureBoxMessage$TreasureBoxStyleText subText;
    public LiveTreasureBoxMessage$TreasureBoxStyleText text;
    public static LiveTreasureBoxMessage$TreasureBoxSingleItemStyle[] _emptyArray;

    public void LiveTreasureBoxMessage$TreasureBoxSingleItemStyle(){
       super();
       this.clear();
    }
    public static LiveTreasureBoxMessage$TreasureBoxSingleItemStyle[] emptyArray(){
       if (LiveTreasureBoxMessage$TreasureBoxSingleItemStyle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveTreasureBoxMessage$TreasureBoxSingleItemStyle._emptyArray == null) {
             LiveTreasureBoxMessage$TreasureBoxSingleItemStyle[] treasureBoxS = new LiveTreasureBoxMessage$TreasureBoxSingleItemStyle[0];
             LiveTreasureBoxMessage$TreasureBoxSingleItemStyle._emptyArray = treasureBoxS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveTreasureBoxMessage$TreasureBoxSingleItemStyle._emptyArray;
    }
    public static LiveTreasureBoxMessage$TreasureBoxSingleItemStyle parseFrom(CodedInputByteBufferNano p0){
       return new LiveTreasureBoxMessage$TreasureBoxSingleItemStyle().mergeFrom(p0);
    }
    public static LiveTreasureBoxMessage$TreasureBoxSingleItemStyle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveTreasureBoxMessage$TreasureBoxSingleItemStyle(), p0);
    }
    public LiveTreasureBoxMessage$TreasureBoxSingleItemStyle clear(){
       this.displayType = 0;
       this.text = null;
       this.subText = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveTreasureBoxMessage$TreasureBoxSingleItemStyle tdisplayType = this.displayType;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tdisplayType);
       }
       tdisplayType = this.text;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tdisplayType);
       }
       tdisplayType = this.subText;
       if (tdisplayType != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tdisplayType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveTreasureBoxMessage$TreasureBoxSingleItemStyle mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.subText == null){
                   this.subText = new LiveTreasureBoxMessage$TreasureBoxStyleText();
                }
                p0.readMessage(this.subText);
             }else if(this.text == null){
                this.text = new LiveTreasureBoxMessage$TreasureBoxStyleText();
             }
             p0.readMessage(this.text);
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.displayType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveTreasureBoxMessage$TreasureBoxSingleItemStyle tdisplayType = this.displayType;
       if (tdisplayType != null) {
          p0.writeInt32(1, tdisplayType);
       }
       tdisplayType = this.text;
       if (tdisplayType != null) {
          p0.writeMessage(2, tdisplayType);
       }
       tdisplayType = this.subText;
       if (tdisplayType != null) {
          p0.writeMessage(3, tdisplayType);
       }
       super.writeTo(p0);
       return;
    }
}
