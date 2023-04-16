package com.kuaishou.protobuf.livestream.nano.SCMultiPkReopenRespond;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCMultiPkReopenRespond extends MessageNano	// class@000d78
{
    public String chatId;
    public String pkId;
    public int pkReopenType;
    public int status;
    public String tip;
    public static SCMultiPkReopenRespond[] _emptyArray;

    public void SCMultiPkReopenRespond(){
       super();
       this.clear();
    }
    public static SCMultiPkReopenRespond[] emptyArray(){
       if (SCMultiPkReopenRespond._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCMultiPkReopenRespond._emptyArray == null) {
             SCMultiPkReopenRespond[] sCMultiPkReo = new SCMultiPkReopenRespond[0];
             SCMultiPkReopenRespond._emptyArray = sCMultiPkReo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCMultiPkReopenRespond._emptyArray;
    }
    public static SCMultiPkReopenRespond parseFrom(CodedInputByteBufferNano p0){
       return new SCMultiPkReopenRespond().mergeFrom(p0);
    }
    public static SCMultiPkReopenRespond parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCMultiPkReopenRespond(), p0);
    }
    public SCMultiPkReopenRespond clear(){
       this.pkId = "";
       this.status = 0;
       this.tip = "";
       this.chatId = "";
       this.pkReopenType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.pkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       SCMultiPkReopenRespond tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tstatus);
       }
       if (!(this.tip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tip);
       }
       if (!(this.chatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.chatId);
       }
       tstatus = this.pkReopenType;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(5, tstatus);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCMultiPkReopenRespond mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.pkReopenType = p0.readUInt32();
                      }
                   }else {
                      this.chatId = p0.readString();
                   }
                }else {
                   this.tip = p0.readString();
                }
             }else {
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.status = i;
                }
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.pkId).equals(str)) {
          p0.writeString(1, this.pkId);
       }
       SCMultiPkReopenRespond tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(2, tstatus);
       }
       if (!(this.tip).equals(str)) {
          p0.writeString(3, this.tip);
       }
       if (!(this.chatId).equals(str)) {
          p0.writeString(4, this.chatId);
       }
       tstatus = this.pkReopenType;
       if (tstatus != null) {
          p0.writeUInt32(5, tstatus);
       }
       super.writeTo(p0);
       return;
    }
}
