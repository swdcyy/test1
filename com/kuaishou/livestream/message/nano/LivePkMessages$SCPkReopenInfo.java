package com.kuaishou.livestream.message.nano.LivePkMessages$SCPkReopenInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePkMessages$SCPkReopenInfo extends MessageNano	// class@00122d
{
    public String pkId;
    public static LivePkMessages$SCPkReopenInfo[] _emptyArray;

    public void LivePkMessages$SCPkReopenInfo(){
       super();
       this.clear();
    }
    public static LivePkMessages$SCPkReopenInfo[] emptyArray(){
       if (LivePkMessages$SCPkReopenInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePkMessages$SCPkReopenInfo._emptyArray == null) {
             LivePkMessages$SCPkReopenInfo[] sCPkReopenIn = new LivePkMessages$SCPkReopenInfo[0];
             LivePkMessages$SCPkReopenInfo._emptyArray = sCPkReopenIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePkMessages$SCPkReopenInfo._emptyArray;
    }
    public static LivePkMessages$SCPkReopenInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePkMessages$SCPkReopenInfo().mergeFrom(p0);
    }
    public static LivePkMessages$SCPkReopenInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePkMessages$SCPkReopenInfo(), p0);
    }
    public LivePkMessages$SCPkReopenInfo clear(){
       this.pkId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.pkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.pkId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePkMessages$SCPkReopenInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.pkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.pkId).equals("")) {
          p0.writeString(1, this.pkId);
       }
       super.writeTo(p0);
       return;
    }
}
