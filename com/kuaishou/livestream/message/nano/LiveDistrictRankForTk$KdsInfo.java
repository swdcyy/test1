package com.kuaishou.livestream.message.nano.LiveDistrictRankForTk$KdsInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveDistrictRankForTk$KdsInfo extends MessageNano	// class@001190
{
    public String bundleId;
    public String data;
    public static LiveDistrictRankForTk$KdsInfo[] _emptyArray;

    public void LiveDistrictRankForTk$KdsInfo(){
       super();
       this.clear();
    }
    public static LiveDistrictRankForTk$KdsInfo[] emptyArray(){
       if (LiveDistrictRankForTk$KdsInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveDistrictRankForTk$KdsInfo._emptyArray == null) {
             LiveDistrictRankForTk$KdsInfo[] kdsInfoArray = new LiveDistrictRankForTk$KdsInfo[0];
             LiveDistrictRankForTk$KdsInfo._emptyArray = kdsInfoArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveDistrictRankForTk$KdsInfo._emptyArray;
    }
    public static LiveDistrictRankForTk$KdsInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveDistrictRankForTk$KdsInfo().mergeFrom(p0);
    }
    public static LiveDistrictRankForTk$KdsInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveDistrictRankForTk$KdsInfo(), p0);
    }
    public LiveDistrictRankForTk$KdsInfo clear(){
       this.bundleId = "";
       this.data = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.bundleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.data);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveDistrictRankForTk$KdsInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.data = p0.readString();
             }
          }else {
             this.bundleId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.bundleId).equals(str)) {
          p0.writeString(1, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(2, this.data);
       }
       super.writeTo(p0);
       return;
    }
}
