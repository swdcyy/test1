package com.kuaishou.livestream.message.nano.Question;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class Question extends MessageNano	// class@0013e5
{
    public String content;
    public String id;
    public long userId;
    public static Question[] _emptyArray;

    public void Question(){
       super();
       this.clear();
    }
    public static Question[] emptyArray(){
       if (Question._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (Question._emptyArray == null) {
             Question[] questionArra = new Question[0];
             Question._emptyArray = questionArra;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return Question._emptyArray;
    }
    public static Question parseFrom(CodedInputByteBufferNano p0){
       return new Question().mergeFrom(p0);
    }
    public static Question parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new Question(), p0);
    }
    public Question clear(){
       this.id = "";
       this.content = "";
       this.userId = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       Question tuserId = this.userId;
       if (tuserId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tuserId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public Question mergeFrom(CodedInputByteBufferNano p0){
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
                   this.userId = p0.readUInt64();
                }
             }else {
                this.content = p0.readString();
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
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       Question tuserId = this.userId;
       if (tuserId) {
          p0.writeUInt64(3, tuserId);
       }
       super.writeTo(p0);
       return;
    }
}
