package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$FansGroupPush;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.livestream.message.nano.LiveFansGroupMessages$FansGroupToastProto;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LiveFansGroupMessages$FansGroupPush extends MessageNano	// class@0011a7
{
    public int dataOneOfCase_;
    public Object dataOneOf_;
    public int type;
    public static LiveFansGroupMessages$FansGroupPush[] _emptyArray;

    public void LiveFansGroupMessages$FansGroupPush(){
       super();
       this.dataOneOfCase_ = 0;
       this.clear();
    }
    public static LiveFansGroupMessages$FansGroupPush[] emptyArray(){
       if (LiveFansGroupMessages$FansGroupPush._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$FansGroupPush._emptyArray == null) {
             LiveFansGroupMessages$FansGroupPush[] uFansGroupPu = new LiveFansGroupMessages$FansGroupPush[0];
             LiveFansGroupMessages$FansGroupPush._emptyArray = uFansGroupPu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$FansGroupPush._emptyArray;
    }
    public static LiveFansGroupMessages$FansGroupPush parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$FansGroupPush().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$FansGroupPush parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$FansGroupPush(), p0);
    }
    public LiveFansGroupMessages$FansGroupPush clear(){
       this.type = 0;
       this.clearDataOneOf();
       this.cachedSize = -1;
       return this;
    }
    public LiveFansGroupMessages$FansGroupPush clearDataOneOf(){
       this.dataOneOfCase_ = 0;
       this.dataOneOf_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$FansGroupPush ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       if (this.dataOneOfCase_ == 2) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, this.dataOneOf_);
       }
       return i;
    }
    public int getDataOneOfCase(){
       return this.dataOneOfCase_;
    }
    public LiveFansGroupMessages$FansGroupToastProto getToast(){
       if (this.dataOneOfCase_ == 2) {
          return this.dataOneOf_;
       }
       return null;
    }
    public boolean hasToast(){
       boolean b = (this.dataOneOfCase_ == 2)? true: false;
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansGroupMessages$FansGroupPush mergeFrom(CodedInputByteBufferNano p0){
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
                int i1 = 2;
                if (this.dataOneOfCase_ != i1) {
                   this.dataOneOf_ = new LiveFansGroupMessages$FansGroupToastProto();
                }
                p0.readMessage(this.dataOneOf_);
                this.dataOneOfCase_ = i1;
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public LiveFansGroupMessages$FansGroupPush setToast(LiveFansGroupMessages$FansGroupToastProto p0){
       Objects.requireNonNull(p0);
       this.dataOneOfCase_ = 2;
       this.dataOneOf_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$FansGroupPush ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       if (this.dataOneOfCase_ == 2) {
          p0.writeMessage(2, this.dataOneOf_);
       }
       super.writeTo(p0);
       return;
    }
}
