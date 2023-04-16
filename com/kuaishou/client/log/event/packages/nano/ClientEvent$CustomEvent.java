package com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$CustomEvent extends MessageNano	// class@000746
{
    public int biz;
    public String key;
    public String page;
    public String value;
    public static ClientEvent$CustomEvent[] _emptyArray;

    public void ClientEvent$CustomEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$CustomEvent[] emptyArray(){
       if (ClientEvent$CustomEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$CustomEvent._emptyArray == null) {
             ClientEvent$CustomEvent[] uCustomEvent = new ClientEvent$CustomEvent[0];
             ClientEvent$CustomEvent._emptyArray = uCustomEvent;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$CustomEvent._emptyArray;
    }
    public static ClientEvent$CustomEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$CustomEvent().mergeFrom(p0);
    }
    public static ClientEvent$CustomEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$CustomEvent(), p0);
    }
    public ClientEvent$CustomEvent clear(){
       this.key = "";
       this.value = "";
       this.biz = 0;
       this.page = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.key).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.key);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.value);
       }
       ClientEvent$CustomEvent tbiz = this.biz;
       if (tbiz != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tbiz);
       }
       if (!(this.page).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.page);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$CustomEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.page = p0.readString();
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
                       case 10:
                       case 11:
                       case 12:
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
                       case 1:
                         break;
                       default:
                   }
                   this.biz = i;
                }
             }else {
                this.value = p0.readString();
             }
          }else {
             this.key = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.key).equals(str)) {
          p0.writeString(1, this.key);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(2, this.value);
       }
       ClientEvent$CustomEvent tbiz = this.biz;
       if (tbiz != null) {
          p0.writeInt32(3, tbiz);
       }
       if (!(this.page).equals(str)) {
          p0.writeString(4, this.page);
       }
       super.writeTo(p0);
       return;
    }
}
