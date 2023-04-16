package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$FanstopH5JumpPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContentWrapper$FanstopH5JumpPackage extends MessageNano	// class@00130f
{
    public String from;
    public String openFrom;
    public String position;
    public static ClientContentWrapper$FanstopH5JumpPackage[] _emptyArray;

    public void ClientContentWrapper$FanstopH5JumpPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$FanstopH5JumpPackage[] emptyArray(){
       if (ClientContentWrapper$FanstopH5JumpPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$FanstopH5JumpPackage._emptyArray == null) {
             ClientContentWrapper$FanstopH5JumpPackage[] uFanstopH5Ju = new ClientContentWrapper$FanstopH5JumpPackage[0];
             ClientContentWrapper$FanstopH5JumpPackage._emptyArray = uFanstopH5Ju;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$FanstopH5JumpPackage._emptyArray;
    }
    public static ClientContentWrapper$FanstopH5JumpPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$FanstopH5JumpPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$FanstopH5JumpPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$FanstopH5JumpPackage(), p0);
    }
    public ClientContentWrapper$FanstopH5JumpPackage clear(){
       this.openFrom = "";
       this.from = "";
       this.position = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.openFrom).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.openFrom);
       }
       if (!(this.from).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.from);
       }
       if (!(this.position).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.position);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContentWrapper$FanstopH5JumpPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.position = p0.readString();
                }
             }else {
                this.from = p0.readString();
             }
          }else {
             this.openFrom = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.openFrom).equals(str)) {
          p0.writeString(1, this.openFrom);
       }
       if (!(this.from).equals(str)) {
          p0.writeString(2, this.from);
       }
       if (!(this.position).equals(str)) {
          p0.writeString(3, this.position);
       }
       super.writeTo(p0);
       return;
    }
}
