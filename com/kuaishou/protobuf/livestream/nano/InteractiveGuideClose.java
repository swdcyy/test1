package com.kuaishou.protobuf.livestream.nano.InteractiveGuideClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class InteractiveGuideClose extends MessageNano	// class@000c24
{
    public String biz;
    public String id;
    public static InteractiveGuideClose[] _emptyArray;

    public void InteractiveGuideClose(){
       super();
       this.clear();
    }
    public static InteractiveGuideClose[] emptyArray(){
       if (InteractiveGuideClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuideClose._emptyArray == null) {
             InteractiveGuideClose[] interactiveG = new InteractiveGuideClose[0];
             InteractiveGuideClose._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuideClose._emptyArray;
    }
    public static InteractiveGuideClose parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuideClose().mergeFrom(p0);
    }
    public static InteractiveGuideClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuideClose(), p0);
    }
    public InteractiveGuideClose clear(){
       this.id = "";
       this.biz = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.biz).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.biz);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuideClose mergeFrom(CodedInputByteBufferNano p0){
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
                this.biz = p0.readString();
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
       if (!(this.biz).equals(str)) {
          p0.writeString(2, this.biz);
       }
       super.writeTo(p0);
       return;
    }
}
