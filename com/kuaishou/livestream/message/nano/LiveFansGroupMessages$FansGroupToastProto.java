package com.kuaishou.livestream.message.nano.LiveFansGroupMessages$FansGroupToastProto;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFansGroupMessages$FansGroupToastProto extends MessageNano	// class@0011a8
{
    public String content;
    public int scene;
    public static LiveFansGroupMessages$FansGroupToastProto[] _emptyArray;

    public void LiveFansGroupMessages$FansGroupToastProto(){
       super();
       this.clear();
    }
    public static LiveFansGroupMessages$FansGroupToastProto[] emptyArray(){
       if (LiveFansGroupMessages$FansGroupToastProto._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFansGroupMessages$FansGroupToastProto._emptyArray == null) {
             LiveFansGroupMessages$FansGroupToastProto[] uFansGroupTo = new LiveFansGroupMessages$FansGroupToastProto[0];
             LiveFansGroupMessages$FansGroupToastProto._emptyArray = uFansGroupTo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFansGroupMessages$FansGroupToastProto._emptyArray;
    }
    public static LiveFansGroupMessages$FansGroupToastProto parseFrom(CodedInputByteBufferNano p0){
       return new LiveFansGroupMessages$FansGroupToastProto().mergeFrom(p0);
    }
    public static LiveFansGroupMessages$FansGroupToastProto parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFansGroupMessages$FansGroupToastProto(), p0);
    }
    public LiveFansGroupMessages$FansGroupToastProto clear(){
       this.scene = 0;
       this.content = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveFansGroupMessages$FansGroupToastProto tscene = this.scene;
       if (tscene != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tscene);
       }
       if (!(this.content).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFansGroupMessages$FansGroupToastProto mergeFrom(CodedInputByteBufferNano p0){
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
                this.content = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.scene = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveFansGroupMessages$FansGroupToastProto tscene = this.scene;
       if (tscene != null) {
          p0.writeInt32(1, tscene);
       }
       if (!(this.content).equals("")) {
          p0.writeString(2, this.content);
       }
       super.writeTo(p0);
       return;
    }
}
