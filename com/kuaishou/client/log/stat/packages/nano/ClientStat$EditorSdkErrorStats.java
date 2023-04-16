package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkErrorStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$EditorSdkErrorStats extends MessageNano	// class@0013d5
{
    public int errorCode;
    public String errorMessage;
    public static ClientStat$EditorSdkErrorStats[] _emptyArray;

    public void ClientStat$EditorSdkErrorStats(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkErrorStats[] emptyArray(){
       if (ClientStat$EditorSdkErrorStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkErrorStats._emptyArray == null) {
             ClientStat$EditorSdkErrorStats[] uEditorSdkEr = new ClientStat$EditorSdkErrorStats[0];
             ClientStat$EditorSdkErrorStats._emptyArray = uEditorSdkEr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkErrorStats._emptyArray;
    }
    public static ClientStat$EditorSdkErrorStats parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkErrorStats().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkErrorStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkErrorStats(), p0);
    }
    public ClientStat$EditorSdkErrorStats clear(){
       this.errorCode = 0;
       this.errorMessage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EditorSdkErrorStats terrorCode = this.errorCode;
       if (terrorCode != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, terrorCode);
       }
       if (!(this.errorMessage).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.errorMessage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkErrorStats mergeFrom(CodedInputByteBufferNano p0){
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
                this.errorMessage = p0.readString();
             }
          }else {
             this.errorCode = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EditorSdkErrorStats terrorCode = this.errorCode;
       if (terrorCode != null) {
          p0.writeUInt32(1, terrorCode);
       }
       if (!(this.errorMessage).equals("")) {
          p0.writeString(2, this.errorMessage);
       }
       super.writeTo(p0);
       return;
    }
}
