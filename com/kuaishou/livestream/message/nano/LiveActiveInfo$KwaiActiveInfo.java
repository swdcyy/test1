package com.kuaishou.livestream.message.nano.LiveActiveInfo$KwaiActiveInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveActiveInfo$KwaiActiveInfo extends MessageNano	// class@0010c1
{
    public String activityId;
    public String matchStage;
    public String matchType;
    public int status;
    public static LiveActiveInfo$KwaiActiveInfo[] _emptyArray;

    public void LiveActiveInfo$KwaiActiveInfo(){
       super();
       this.clear();
    }
    public static LiveActiveInfo$KwaiActiveInfo[] emptyArray(){
       if (LiveActiveInfo$KwaiActiveInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveActiveInfo$KwaiActiveInfo._emptyArray == null) {
             LiveActiveInfo$KwaiActiveInfo[] kwaiActiveIn = new LiveActiveInfo$KwaiActiveInfo[0];
             LiveActiveInfo$KwaiActiveInfo._emptyArray = kwaiActiveIn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveActiveInfo$KwaiActiveInfo._emptyArray;
    }
    public static LiveActiveInfo$KwaiActiveInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveActiveInfo$KwaiActiveInfo().mergeFrom(p0);
    }
    public static LiveActiveInfo$KwaiActiveInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveActiveInfo$KwaiActiveInfo(), p0);
    }
    public LiveActiveInfo$KwaiActiveInfo clear(){
       this.status = 0;
       this.matchType = "";
       this.matchStage = "";
       this.activityId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveActiveInfo$KwaiActiveInfo tstatus = this.status;
       if (tstatus != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tstatus);
       }
       String str = "";
       if (!(this.matchType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.matchType);
       }
       if (!(this.matchStage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.matchStage);
       }
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.activityId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveActiveInfo$KwaiActiveInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.activityId = p0.readString();
                   }
                }else {
                   this.matchStage = p0.readString();
                }
             }else {
                this.matchType = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && (i != 2 && i != 3))) {
                continue ;
             }else {
                this.status = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveActiveInfo$KwaiActiveInfo tstatus = this.status;
       if (tstatus != null) {
          p0.writeInt32(1, tstatus);
       }
       String str = "";
       if (!(this.matchType).equals(str)) {
          p0.writeString(2, this.matchType);
       }
       if (!(this.matchStage).equals(str)) {
          p0.writeString(3, this.matchStage);
       }
       if (!(this.activityId).equals(str)) {
          p0.writeString(4, this.activityId);
       }
       super.writeTo(p0);
       return;
    }
}
