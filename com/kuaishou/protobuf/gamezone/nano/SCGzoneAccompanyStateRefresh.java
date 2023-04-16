package com.kuaishou.protobuf.gamezone.nano.SCGzoneAccompanyStateRefresh;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzoneAccompanyStateRefresh extends MessageNano	// class@000bcd
{
    public String accompanyId;
    public long refreshMaxDelayMillis;
    public String roundId;
    public static SCGzoneAccompanyStateRefresh[] _emptyArray;

    public void SCGzoneAccompanyStateRefresh(){
       super();
       this.clear();
    }
    public static SCGzoneAccompanyStateRefresh[] emptyArray(){
       if (SCGzoneAccompanyStateRefresh._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneAccompanyStateRefresh._emptyArray == null) {
             SCGzoneAccompanyStateRefresh[] sCGzoneAccom = new SCGzoneAccompanyStateRefresh[0];
             SCGzoneAccompanyStateRefresh._emptyArray = sCGzoneAccom;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneAccompanyStateRefresh._emptyArray;
    }
    public static SCGzoneAccompanyStateRefresh parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneAccompanyStateRefresh().mergeFrom(p0);
    }
    public static SCGzoneAccompanyStateRefresh parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneAccompanyStateRefresh(), p0);
    }
    public SCGzoneAccompanyStateRefresh clear(){
       this.refreshMaxDelayMillis = 0;
       this.accompanyId = "";
       this.roundId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneAccompanyStateRefresh trefreshMaxD = this.refreshMaxDelayMillis;
       if (trefreshMaxD - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, trefreshMaxD);
       }
       String str = "";
       if (!(this.accompanyId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.accompanyId);
       }
       if (!(this.roundId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.roundId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneAccompanyStateRefresh mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.roundId = p0.readString();
                }
             }else {
                this.accompanyId = p0.readString();
             }
          }else {
             this.refreshMaxDelayMillis = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneAccompanyStateRefresh trefreshMaxD = this.refreshMaxDelayMillis;
       if (trefreshMaxD - null) {
          p0.writeUInt64(1, trefreshMaxD);
       }
       String str = "";
       if (!(this.accompanyId).equals(str)) {
          p0.writeString(2, this.accompanyId);
       }
       if (!(this.roundId).equals(str)) {
          p0.writeString(3, this.roundId);
       }
       super.writeTo(p0);
       return;
    }
}
