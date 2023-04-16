package com.kuaishou.livestream.message.nano.LiveDistrictRankFinalBattle$ContentWithStyle;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveDistrictRankFinalBattle$ContentWithStyle extends MessageNano	// class@001183
{
    public String color;
    public String content;
    public static LiveDistrictRankFinalBattle$ContentWithStyle[] _emptyArray;

    public void LiveDistrictRankFinalBattle$ContentWithStyle(){
       super();
       this.clear();
    }
    public static LiveDistrictRankFinalBattle$ContentWithStyle[] emptyArray(){
       if (LiveDistrictRankFinalBattle$ContentWithStyle._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankFinalBattle$ContentWithStyle._emptyArray == null) {
             LiveDistrictRankFinalBattle$ContentWithStyle[] uContentWith = new LiveDistrictRankFinalBattle$ContentWithStyle[0];
             LiveDistrictRankFinalBattle$ContentWithStyle._emptyArray = uContentWith;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankFinalBattle$ContentWithStyle._emptyArray;
    }
    public static LiveDistrictRankFinalBattle$ContentWithStyle parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankFinalBattle$ContentWithStyle().mergeFrom(p0);
    }
    public static LiveDistrictRankFinalBattle$ContentWithStyle parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankFinalBattle$ContentWithStyle(), p0);
    }
    public LiveDistrictRankFinalBattle$ContentWithStyle clear(){
       this.content = "";
       this.color = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.content);
       }
       if (!(this.color).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.color);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankFinalBattle$ContentWithStyle mergeFrom(CodedInputByteBufferNano p0){
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
                this.color = p0.readString();
             }
          }else {
             this.content = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.content).equals(str)) {
          p0.writeString(1, this.content);
       }
       if (!(this.color).equals(str)) {
          p0.writeString(2, this.color);
       }
       super.writeTo(p0);
       return;
    }
}
