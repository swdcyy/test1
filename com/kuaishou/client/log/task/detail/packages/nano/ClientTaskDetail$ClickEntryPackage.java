package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$ClickEntryPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientTaskDetail$ClickEntryPackage extends MessageNano	// class@001451
{
    public int clickType;
    public static ClientTaskDetail$ClickEntryPackage[] _emptyArray;

    public void ClientTaskDetail$ClickEntryPackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$ClickEntryPackage[] emptyArray(){
       if (ClientTaskDetail$ClickEntryPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$ClickEntryPackage._emptyArray == null) {
             ClientTaskDetail$ClickEntryPackage[] uClickEntryP = new ClientTaskDetail$ClickEntryPackage[0];
             ClientTaskDetail$ClickEntryPackage._emptyArray = uClickEntryP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$ClickEntryPackage._emptyArray;
    }
    public static ClientTaskDetail$ClickEntryPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$ClickEntryPackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$ClickEntryPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$ClickEntryPackage(), p0);
    }
    public ClientTaskDetail$ClickEntryPackage clear(){
       this.clickType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientTaskDetail$ClickEntryPackage tclickType = this.clickType;
       if (tclickType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tclickType);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$ClickEntryPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = p0.readInt32();
             switch (i){
                 case 0:
                 case 2:
                 case 3:
                 case 4:
                 case 5:
                 case 6:
                 case 7:
                 case 8:
                 case 9:
                 case 1:
                   break;
                 default:
             }
             this.clickType = i;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientTaskDetail$ClickEntryPackage tclickType = this.clickType;
       if (tclickType != null) {
          p0.writeInt32(1, tclickType);
       }
       super.writeTo(p0);
       return;
    }
}
