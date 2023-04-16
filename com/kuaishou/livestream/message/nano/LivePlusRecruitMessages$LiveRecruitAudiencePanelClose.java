package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitAudiencePanelClose;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$LiveRecruitAudiencePanelClose extends MessageNano	// class@00123e
{
    public String liveStreamId;
    public static LivePlusRecruitMessages$LiveRecruitAudiencePanelClose[] _emptyArray;

    public void LivePlusRecruitMessages$LiveRecruitAudiencePanelClose(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LiveRecruitAudiencePanelClose[] emptyArray(){
       if (LivePlusRecruitMessages$LiveRecruitAudiencePanelClose._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LiveRecruitAudiencePanelClose._emptyArray == null) {
             LivePlusRecruitMessages$LiveRecruitAudiencePanelClose[] liveRecruitA = new LivePlusRecruitMessages$LiveRecruitAudiencePanelClose[0];
             LivePlusRecruitMessages$LiveRecruitAudiencePanelClose._emptyArray = liveRecruitA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LiveRecruitAudiencePanelClose._emptyArray;
    }
    public static LivePlusRecruitMessages$LiveRecruitAudiencePanelClose parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LiveRecruitAudiencePanelClose().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LiveRecruitAudiencePanelClose parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LiveRecruitAudiencePanelClose(), p0);
    }
    public LivePlusRecruitMessages$LiveRecruitAudiencePanelClose clear(){
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
    public LivePlusRecruitMessages$LiveRecruitAudiencePanelClose mergeFrom(CodedInputByteBufferNano p0){
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
