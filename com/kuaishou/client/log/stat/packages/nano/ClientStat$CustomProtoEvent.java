package com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomProtoEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;
import com.kuaishou.protobuf.log.nano.StidContainerProto$StidContainer;

public final class ClientStat$CustomProtoEvent extends MessageNano	// class@0007b4
{
    public String interStExParams;
    public StidContainerProto$StidContainer interStidContainer;
    public byte[] payload;
    public String type;
    public static ClientStat$CustomProtoEvent[] _emptyArray;

    public void ClientStat$CustomProtoEvent(){
       super();
       this.clear();
    }
    public static ClientStat$CustomProtoEvent[] emptyArray(){
       if (ClientStat$CustomProtoEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CustomProtoEvent._emptyArray == null) {
             ClientStat$CustomProtoEvent[] uCustomProto = new ClientStat$CustomProtoEvent[0];
             ClientStat$CustomProtoEvent._emptyArray = uCustomProto;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CustomProtoEvent._emptyArray;
    }
    public static ClientStat$CustomProtoEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CustomProtoEvent().mergeFrom(p0);
    }
    public static ClientStat$CustomProtoEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CustomProtoEvent(), p0);
    }
    public ClientStat$CustomProtoEvent clear(){
       this.type = "";
       this.payload = WireFormatNano.EMPTY_BYTES;
       this.interStidContainer = null;
       this.interStExParams = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.type).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.type);
       }
       if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.payload);
       }
       ClientStat$CustomProtoEvent tinterStidCo = this.interStidContainer;
       if (tinterStidCo != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tinterStidCo);
       }
       if (!(this.interStExParams).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.interStExParams);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$CustomProtoEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.interStExParams = p0.readString();
                   }
                }else if(this.interStidContainer == null){
                   this.interStidContainer = new StidContainerProto$StidContainer();
                }
                p0.readMessage(this.interStidContainer);
             }else {
                this.payload = p0.readBytes();
             }
          }else {
             this.type = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.type).equals(str)) {
          p0.writeString(1, this.type);
       }
       if (!Arrays.equals(this.payload, WireFormatNano.EMPTY_BYTES)) {
          p0.writeBytes(2, this.payload);
       }
       ClientStat$CustomProtoEvent tinterStidCo = this.interStidContainer;
       if (tinterStidCo != null) {
          p0.writeMessage(3, tinterStidCo);
       }
       if (!(this.interStExParams).equals(str)) {
          p0.writeString(4, this.interStExParams);
       }
       super.writeTo(p0);
       return;
    }
}
