package com.kuaishou.livestream.message.nano.LiveActivityWidgetProto$LiveActivityWidgetTextModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Long;
import java.lang.Object;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActivityWidgetProto$LiveActivityWidgetTextModel extends MessageNano	// class@0010dd
{
    public String textColor;
    public int textContentCase_;
    public Object textContent_;
    public int textType;
    public static LiveActivityWidgetProto$LiveActivityWidgetTextModel[] _emptyArray;

    public void LiveActivityWidgetProto$LiveActivityWidgetTextModel(){
       super();
       this.textContentCase_ = 0;
       this.clear();
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetTextModel[] emptyArray(){
       if (LiveActivityWidgetProto$LiveActivityWidgetTextModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActivityWidgetProto$LiveActivityWidgetTextModel._emptyArray == null) {
             LiveActivityWidgetProto$LiveActivityWidgetTextModel[] liveActivity = new LiveActivityWidgetProto$LiveActivityWidgetTextModel[0];
             LiveActivityWidgetProto$LiveActivityWidgetTextModel._emptyArray = liveActivity;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActivityWidgetProto$LiveActivityWidgetTextModel._emptyArray;
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetTextModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveActivityWidgetProto$LiveActivityWidgetTextModel().mergeFrom(p0);
    }
    public static LiveActivityWidgetProto$LiveActivityWidgetTextModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActivityWidgetProto$LiveActivityWidgetTextModel(), p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel clear(){
       this.textColor = "";
       this.textType = 0;
       this.clearTextContent();
       this.cachedSize = -1;
       return this;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel clearTextContent(){
       this.textContentCase_ = 0;
       this.textContent_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (this.textContentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.textContent_);
       }
       i1 = 2;
       if (this.textContentCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(i1, this.textContent_.longValue());
       }
       if (!(this.textColor).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(20, this.textColor);
       }
       LiveActivityWidgetProto$LiveActivityWidgetTextModel ttextType = this.textType;
       if (ttextType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(21, ttextType);
       }
       return i;
    }
    public String getText(){
       if (this.textContentCase_ == 1) {
          return this.textContent_;
       }
       return "";
    }
    public int getTextContentCase(){
       return this.textContentCase_;
    }
    public long getTimestamp(){
       if (this.textContentCase_ == 2) {
          return this.textContent_.longValue();
       }
       return 0;
    }
    public boolean hasText(){
       boolean b = true;
       if (this.textContentCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean hasTimestamp(){
       boolean b = (this.textContentCase_ == 2)? true: false;
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 162) {
                   if (i != 168) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.textType = i;
                      }
                   }
                }else {
                   this.textColor = p0.readString();
                }
             }else {
                this.textContent_ = Long.valueOf(p0.readUInt64());
                this.textContentCase_ = 2;
             }
          }else {
             this.textContent_ = p0.readString();
             this.textContentCase_ = 1;
          }
       }
       return this;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel setText(String p0){
       this.textContentCase_ = 1;
       this.textContent_ = p0;
       return this;
    }
    public LiveActivityWidgetProto$LiveActivityWidgetTextModel setTimestamp(long p0){
       this.textContentCase_ = 2;
       this.textContent_ = Long.valueOf(p0);
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i = 1;
       if (this.textContentCase_ == i) {
          p0.writeString(i, this.textContent_);
       }
       i = 2;
       if (this.textContentCase_ == i) {
          p0.writeUInt64(i, this.textContent_.longValue());
       }
       if (!(this.textColor).equals("")) {
          p0.writeString(20, this.textColor);
       }
       LiveActivityWidgetProto$LiveActivityWidgetTextModel ttextType = this.textType;
       if (ttextType != null) {
          p0.writeInt32(21, ttextType);
       }
       super.writeTo(p0);
       return;
    }
}
