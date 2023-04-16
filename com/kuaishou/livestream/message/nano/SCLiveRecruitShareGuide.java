package com.kuaishou.livestream.message.nano.SCLiveRecruitShareGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveRecruitShareGuide extends MessageNano	// class@00143d
{
    public String liveStreamId;
    public static SCLiveRecruitShareGuide[] _emptyArray;

    public void SCLiveRecruitShareGuide(){
       super();
       this.clear();
    }
    public static SCLiveRecruitShareGuide[] emptyArray(){
       if (SCLiveRecruitShareGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveRecruitShareGuide._emptyArray == null) {
             SCLiveRecruitShareGuide[] sCLiveRecrui = new SCLiveRecruitShareGuide[0];
             SCLiveRecruitShareGuide._emptyArray = sCLiveRecrui;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveRecruitShareGuide._emptyArray;
    }
    public static SCLiveRecruitShareGuide parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveRecruitShareGuide().mergeFrom(p0);
    }
    public static SCLiveRecruitShareGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveRecruitShareGuide(), p0);
    }
    public SCLiveRecruitShareGuide clear(){
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
    public SCLiveRecruitShareGuide mergeFrom(CodedInputByteBufferNano p0){
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
