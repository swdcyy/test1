package com.kuaishou.livestream.message.nano.LiveStreamRichTextFeed$AudienceStateSegment;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;

public final class LiveStreamRichTextFeed$AudienceStateSegment extends MessageNano	// class@001390
{
    public LiveAudienceState audienceState;
    public static LiveStreamRichTextFeed$AudienceStateSegment[] _emptyArray;

    public void LiveStreamRichTextFeed$AudienceStateSegment(){
       super();
       this.clear();
    }
    public static LiveStreamRichTextFeed$AudienceStateSegment[] emptyArray(){
       if (LiveStreamRichTextFeed$AudienceStateSegment._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamRichTextFeed$AudienceStateSegment._emptyArray == null) {
             LiveStreamRichTextFeed$AudienceStateSegment[] uAudienceSta = new LiveStreamRichTextFeed$AudienceStateSegment[0];
             LiveStreamRichTextFeed$AudienceStateSegment._emptyArray = uAudienceSta;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamRichTextFeed$AudienceStateSegment._emptyArray;
    }
    public static LiveStreamRichTextFeed$AudienceStateSegment parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamRichTextFeed$AudienceStateSegment().mergeFrom(p0);
    }
    public static LiveStreamRichTextFeed$AudienceStateSegment parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamRichTextFeed$AudienceStateSegment(), p0);
    }
    public LiveStreamRichTextFeed$AudienceStateSegment clear(){
       this.audienceState = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamRichTextFeed$AudienceStateSegment taudienceSta = this.audienceState;
       if (taudienceSta != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, taudienceSta);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamRichTextFeed$AudienceStateSegment mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.audienceState == null){
             this.audienceState = new LiveAudienceState();
          }
          p0.readMessage(this.audienceState);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamRichTextFeed$AudienceStateSegment taudienceSta = this.audienceState;
       if (taudienceSta != null) {
          p0.writeMessage(1, taudienceSta);
       }
       super.writeTo(p0);
       return;
    }
}
