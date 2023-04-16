package com.kuaishou.protobuf.livestream.nano.SCLiveMiniProgramAudienceBottomEntrance;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMiniProgramAudienceBottomEntrance extends MessageNano	// class@000d57
{
    public int entranceStatus;
    public static SCLiveMiniProgramAudienceBottomEntrance[] _emptyArray;

    public void SCLiveMiniProgramAudienceBottomEntrance(){
       super();
       this.clear();
    }
    public static SCLiveMiniProgramAudienceBottomEntrance[] emptyArray(){
       if (SCLiveMiniProgramAudienceBottomEntrance._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMiniProgramAudienceBottomEntrance._emptyArray == null) {
             SCLiveMiniProgramAudienceBottomEntrance[] sCLiveMiniPr = new SCLiveMiniProgramAudienceBottomEntrance[0];
             SCLiveMiniProgramAudienceBottomEntrance._emptyArray = sCLiveMiniPr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMiniProgramAudienceBottomEntrance._emptyArray;
    }
    public static SCLiveMiniProgramAudienceBottomEntrance parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMiniProgramAudienceBottomEntrance().mergeFrom(p0);
    }
    public static SCLiveMiniProgramAudienceBottomEntrance parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMiniProgramAudienceBottomEntrance(), p0);
    }
    public SCLiveMiniProgramAudienceBottomEntrance clear(){
       this.entranceStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveMiniProgramAudienceBottomEntrance tentranceSta = this.entranceStatus;
       if (tentranceSta != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tentranceSta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMiniProgramAudienceBottomEntrance mergeFrom(CodedInputByteBufferNano p0){
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
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.entranceStatus = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveMiniProgramAudienceBottomEntrance tentranceSta = this.entranceStatus;
       if (tentranceSta != null) {
          p0.writeInt32(1, tentranceSta);
       }
       super.writeTo(p0);
       return;
    }
}
