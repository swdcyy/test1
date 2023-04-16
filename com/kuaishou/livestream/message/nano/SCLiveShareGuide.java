package com.kuaishou.livestream.message.nano.SCLiveShareGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveShareGuide extends MessageNano	// class@001442
{
    public String liveStreamId;
    public static SCLiveShareGuide[] _emptyArray;

    public void SCLiveShareGuide(){
       super();
       this.clear();
    }
    public static SCLiveShareGuide[] emptyArray(){
       if (SCLiveShareGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveShareGuide._emptyArray == null) {
             SCLiveShareGuide[] sCLiveShareG = new SCLiveShareGuide[0];
             SCLiveShareGuide._emptyArray = sCLiveShareG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveShareGuide._emptyArray;
    }
    public static SCLiveShareGuide parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveShareGuide().mergeFrom(p0);
    }
    public static SCLiveShareGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveShareGuide(), p0);
    }
    public SCLiveShareGuide clear(){
       this.liveStreamId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveShareGuide mergeFrom(CodedInputByteBufferNano p0){
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
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.liveStreamId).equals("")) {
          p0.writeString(1, this.liveStreamId);
       }
       super.writeTo(p0);
       return;
    }
}
