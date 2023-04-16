package com.kuaishou.protobuf.livestream.nano.MultiPKSignalCommonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class MultiPKSignalCommonInfo extends MessageNano	// class@000d2a
{
    public String chatId;
    public String pkId;
    public long timestamp;
    public static MultiPKSignalCommonInfo[] _emptyArray;

    public void MultiPKSignalCommonInfo(){
       super();
       this.clear();
    }
    public static MultiPKSignalCommonInfo[] emptyArray(){
       if (MultiPKSignalCommonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MultiPKSignalCommonInfo._emptyArray == null) {
             MultiPKSignalCommonInfo[] multiPKSigna = new MultiPKSignalCommonInfo[0];
             MultiPKSignalCommonInfo._emptyArray = multiPKSigna;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MultiPKSignalCommonInfo._emptyArray;
    }
    public static MultiPKSignalCommonInfo parseFrom(CodedInputByteBufferNano p0){
       return new MultiPKSignalCommonInfo().mergeFrom(p0);
    }
    public static MultiPKSignalCommonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MultiPKSignalCommonInfo(), p0);
    }
    public MultiPKSignalCommonInfo clear(){
       this.timestamp = 0;
       this.pkId = "";
       this.chatId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       MultiPKSignalCommonInfo ttimestamp = this.timestamp;
       if (ttimestamp - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, ttimestamp);
       }
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.pkId);
       }
       if (!(this.chatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.chatId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MultiPKSignalCommonInfo mergeFrom(CodedInputByteBufferNano p0){
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
                }else {
                   this.chatId = p0.readString();
                }
             }else {
                this.pkId = p0.readString();
             }
          }else {
             this.timestamp = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       MultiPKSignalCommonInfo ttimestamp = this.timestamp;
       if (ttimestamp - null) {
          p0.writeUInt64(1, ttimestamp);
       }
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(2, this.pkId);
       }
       if (!(this.chatId).equals(str)) {
          p0.writeString(3, this.chatId);
       }
       super.writeTo(p0);
       return;
    }
}
