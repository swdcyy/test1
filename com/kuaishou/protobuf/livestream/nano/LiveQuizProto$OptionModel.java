package com.kuaishou.protobuf.livestream.nano.LiveQuizProto$OptionModel;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveQuizProto$OptionModel extends MessageNano	// class@000cf4
{
    public String body;
    public String id;
    public static LiveQuizProto$OptionModel[] _emptyArray;

    public void LiveQuizProto$OptionModel(){
       super();
       this.clear();
    }
    public static LiveQuizProto$OptionModel[] emptyArray(){
       if (LiveQuizProto$OptionModel._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizProto$OptionModel._emptyArray == null) {
             LiveQuizProto$OptionModel[] optionModelA = new LiveQuizProto$OptionModel[0];
             LiveQuizProto$OptionModel._emptyArray = optionModelA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizProto$OptionModel._emptyArray;
    }
    public static LiveQuizProto$OptionModel parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizProto$OptionModel().mergeFrom(p0);
    }
    public static LiveQuizProto$OptionModel parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizProto$OptionModel(), p0);
    }
    public LiveQuizProto$OptionModel clear(){
       this.id = "";
       this.body = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.body).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.body);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizProto$OptionModel mergeFrom(CodedInputByteBufferNano p0){
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
                this.body = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.body).equals(str)) {
          p0.writeString(2, this.body);
       }
       super.writeTo(p0);
       return;
    }
}
