package com.kuaishou.protobuf.gamezone.nano.GzoneLiveWidgetJumpAction;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class GzoneLiveWidgetJumpAction extends MessageNano	// class@000bc8
{
    public String payload;
    public int type;
    public static GzoneLiveWidgetJumpAction[] _emptyArray;

    public void GzoneLiveWidgetJumpAction(){
       super();
       this.clear();
    }
    public static GzoneLiveWidgetJumpAction[] emptyArray(){
       if (GzoneLiveWidgetJumpAction._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneLiveWidgetJumpAction._emptyArray == null) {
             GzoneLiveWidgetJumpAction[] gzoneLiveWid = new GzoneLiveWidgetJumpAction[0];
             GzoneLiveWidgetJumpAction._emptyArray = gzoneLiveWid;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneLiveWidgetJumpAction._emptyArray;
    }
    public static GzoneLiveWidgetJumpAction parseFrom(CodedInputByteBufferNano p0){
       return new GzoneLiveWidgetJumpAction().mergeFrom(p0);
    }
    public static GzoneLiveWidgetJumpAction parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneLiveWidgetJumpAction(), p0);
    }
    public GzoneLiveWidgetJumpAction clear(){
       this.type = 0;
       this.payload = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GzoneLiveWidgetJumpAction ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       if (!(this.payload).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.payload);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneLiveWidgetJumpAction mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.payload = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GzoneLiveWidgetJumpAction ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       if (!(this.payload).equals("")) {
          p0.writeString(2, this.payload);
       }
       super.writeTo(p0);
       return;
    }
}
