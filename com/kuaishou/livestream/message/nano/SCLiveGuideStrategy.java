package com.kuaishou.livestream.message.nano.SCLiveGuideStrategy;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveGuideNotice;

public final class SCLiveGuideStrategy extends MessageNano	// class@001425
{
    public String frequencyConfigBizId;
    public int guideFeatureType;
    public int guidePriority;
    public LiveGuideNotice liveGuideNotice;
    public static SCLiveGuideStrategy[] _emptyArray;

    public void SCLiveGuideStrategy(){
       super();
       this.clear();
    }
    public static SCLiveGuideStrategy[] emptyArray(){
       if (SCLiveGuideStrategy._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveGuideStrategy._emptyArray == null) {
             SCLiveGuideStrategy[] sCLiveGuideS = new SCLiveGuideStrategy[0];
             SCLiveGuideStrategy._emptyArray = sCLiveGuideS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveGuideStrategy._emptyArray;
    }
    public static SCLiveGuideStrategy parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveGuideStrategy().mergeFrom(p0);
    }
    public static SCLiveGuideStrategy parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveGuideStrategy(), p0);
    }
    public SCLiveGuideStrategy clear(){
       this.guideFeatureType = 0;
       this.guidePriority = 0;
       this.frequencyConfigBizId = "";
       this.liveGuideNotice = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveGuideStrategy tguideFeatur = this.guideFeatureType;
       if (tguideFeatur != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tguideFeatur);
       }
       tguideFeatur = this.guidePriority;
       if (tguideFeatur != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tguideFeatur);
       }
       if (!(this.frequencyConfigBizId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.frequencyConfigBizId);
       }
       tguideFeatur = this.liveGuideNotice;
       if (tguideFeatur != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tguideFeatur);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveGuideStrategy mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else if(this.liveGuideNotice == null){
                      this.liveGuideNotice = new LiveGuideNotice();
                   }
                   p0.readMessage(this.liveGuideNotice);
                }else {
                   this.frequencyConfigBizId = p0.readString();
                }
             }else {
                this.guidePriority = p0.readUInt32();
             }
          }else {
             this.guideFeatureType = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveGuideStrategy tguideFeatur = this.guideFeatureType;
       if (tguideFeatur != null) {
          p0.writeUInt32(1, tguideFeatur);
       }
       tguideFeatur = this.guidePriority;
       if (tguideFeatur != null) {
          p0.writeUInt32(2, tguideFeatur);
       }
       if (!(this.frequencyConfigBizId).equals("")) {
          p0.writeString(3, this.frequencyConfigBizId);
       }
       tguideFeatur = this.liveGuideNotice;
       if (tguideFeatur != null) {
          p0.writeMessage(4, tguideFeatur);
       }
       super.writeTo(p0);
       return;
    }
}
