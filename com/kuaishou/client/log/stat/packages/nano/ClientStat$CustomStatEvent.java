package com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientStat$CustomStatEvent extends MessageNano	// class@0007b7
{
    public int biz;
    public String detail;
    public String key;
    public int name;
    public String page;
    public String value;
    public static ClientStat$CustomStatEvent[] _emptyArray;

    public void ClientStat$CustomStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$CustomStatEvent[] emptyArray(){
       if (ClientStat$CustomStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CustomStatEvent._emptyArray == null) {
             ClientStat$CustomStatEvent[] uCustomStatE = new ClientStat$CustomStatEvent[0];
             ClientStat$CustomStatEvent._emptyArray = uCustomStatE;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CustomStatEvent._emptyArray;
    }
    public static ClientStat$CustomStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CustomStatEvent().mergeFrom(p0);
    }
    public static ClientStat$CustomStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CustomStatEvent(), p0);
    }
    public ClientStat$CustomStatEvent clear(){
       this.name = 0;
       this.detail = "";
       this.key = "";
       this.value = "";
       this.biz = 0;
       this.page = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$CustomStatEvent tname = this.name;
       if (tname != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tname);
       }
       String str = "";
       if (!(this.detail).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.detail);
       }
       if (!(this.key).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.key);
       }
       if (!(this.value).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.value);
       }
       tname = this.biz;
       if (tname != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tname);
       }
       if (!(this.page).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.page);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$CustomStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 50) {
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
             }else {
                this.detail = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.name = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$CustomStatEvent tname = this.name;
       if (tname != null) {
          p0.writeInt32(1, tname);
       }
       String str = "";
       if (!(this.detail).equals(str)) {
          p0.writeString(2, this.detail);
       }
       if (!(this.key).equals(str)) {
          p0.writeString(3, this.key);
       }
       if (!(this.value).equals(str)) {
          p0.writeString(4, this.value);
       }
       tname = this.biz;
       if (tname != null) {
          p0.writeInt32(5, tname);
       }
       if (!(this.page).equals(str)) {
          p0.writeString(6, this.page);
       }
       super.writeTo(p0);
       return;
    }
}
