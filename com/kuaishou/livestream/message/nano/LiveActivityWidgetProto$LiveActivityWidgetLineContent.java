package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLineContent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLinePic;
import com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetLineText;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LiveActivityWidgetProto$LiveActivityWidgetLineContent extends MessageNano	// class@0010d5
{
    public int lineContentCase_;
    public Object lineContent_;
    public static LiveActivityWidgetProto$LiveActivityWidgetLineContent[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetLineContent(){
       super();
       this.lineContentCase_ = 0;
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLineContent[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetLineContent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetLineContent._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetLineContent[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetLineContent[0];
             LiveActivityWidgetProto$LiveActivityWidgetLineContent._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetLineContent._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLineContent parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetLineContent().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetLineContent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetLineContent(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineContent clear(){
       this.clearLineContent();
       this.cachedSize = -1;
       return this;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineContent clearLineContent(){
       this.lineContentCase_ = 0;
       this.lineContent_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (this.lineContentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.lineContent_);
       }
       if (this.lineContentCase_ == 2) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, this.lineContent_);
       }
       return i;
    }
    public int getLineContentCase(){
       return this.lineContentCase_;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLinePic getLinePic(){
       if (this.lineContentCase_ == 2) {
          return this.lineContent_;
       }
       return null;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineText getLineText(){
       if (this.lineContentCase_ == 1) {
          return this.lineContent_;
       }
       return null;
    }
    public boolean hasLinePic(){
       boolean b = (this.lineContentCase_ == 2)? true: false;
       return b;
    }
    public boolean hasLineText(){
       boolean b = true;
       if (this.lineContentCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineContent mergeFrom(CodedInputByteBufferNano p0){
       int i1;
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
                i1 = 2;
                if (this.lineContentCase_ != i1) {
                   this.lineContent_ = new LiveActivityWidgetProto$LiveActivityWidgetLinePic();
                }
                p0.readMessage(this.lineContent_);
                this.lineContentCase_ = i1;
             }
          }else {
             i1 = 1;
             if (this.lineContentCase_ != i1) {
                this.lineContent_ = new LiveActivityWidgetProto$LiveActivityWidgetLineText();
             }
             p0.readMessage(this.lineContent_);
             this.lineContentCase_ = i1;
          }
       }
       return this;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineContent setLinePic(LiveActivityWidgetProto$LiveActivityWidgetLinePic p0){
       Objects.requireNonNull(p0);
       this.lineContentCase_ = 2;
       this.lineContent_ = p0;
       return this;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetLineContent setLineText(LiveActivityWidgetProto$LiveActivityWidgetLineText p0){
       Objects.requireNonNull(p0);
       this.lineContentCase_ = 1;
       this.lineContent_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i = 1;
       if (this.lineContentCase_ == i) {
          p0.writeMessage(i, this.lineContent_);
       }
       if (this.lineContentCase_ == 2) {
          p0.writeMessage(2, this.lineContent_);
       }
       super.writeTo(p0);
       return;
    }
}
