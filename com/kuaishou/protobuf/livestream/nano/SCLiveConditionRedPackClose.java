package com.kuaishou.protobuf.livestream.nano.SCLiveConditionRedPackClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveConditionRedPackClose extends MessageNano	// class@000d48
{
    public String liveStreamId;
    public String redPackId;
    public int redPackType;
    public static SCLiveConditionRedPackClose[] _emptyArray;

    public void SCLiveConditionRedPackClose(){
       super();
       this.clear();
    }
    public static SCLiveConditionRedPackClose[] emptyArray(){
       if (SCLiveConditionRedPackClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveConditionRedPackClose._emptyArray == null) {
             SCLiveConditionRedPackClose[] sCLiveCondit = new SCLiveConditionRedPackClose[0];
             SCLiveConditionRedPackClose._emptyArray = sCLiveCondit;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveConditionRedPackClose._emptyArray;
    }
    public static SCLiveConditionRedPackClose parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveConditionRedPackClose().mergeFrom(p0);
    }
    public static SCLiveConditionRedPackClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveConditionRedPackClose(), p0);
    }
    public SCLiveConditionRedPackClose clear(){
       this.liveStreamId = "";
       this.redPackType = 0;
       this.redPackId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCLiveConditionRedPackClose tredPackType = this.redPackType;
       if (tredPackType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.redPackId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveConditionRedPackClose mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.redPackId = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   switch (i){
                       case 11:
                       case 13:
                       case 14:
                       case 15:
                       case 16:
                       case 17:
                       case 18:
                       case 19:
                       case 20:
                       case 21:
                       case 22:
                       case 23:
                       case 24:
                       case 25:
                       case 26:
                       case 27:
                       case 28:
                       case 29:
                       case 30:
                       case 31:
                       case 32:
                       case '!':
                       case '"':
                       case '#':
                       case '$':
                       case '%':
                       case '&':
                       case 39:
                       case '(':
                       case ')':
                       case '*':
                       case '+':
                       case ',':
                       case '-':
                       case '.':
                       case '/':
                       case '0':
                       case 12:
                         break;
                       default:
                   }
                }
                this.redPackType = i;
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       SCLiveConditionRedPackClose tredPackType = this.redPackType;
       if (tredPackType != null) {
          p0.writeInt32(2, tredPackType);
       }
       if (!(this.redPackId).equals(str)) {
          p0.writeString(3, this.redPackId);
       }
       super.writeTo(p0);
       return;
    }
}
