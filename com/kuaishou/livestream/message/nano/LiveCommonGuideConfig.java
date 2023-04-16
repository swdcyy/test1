package com.kuaishou.livestream.message.nano.LiveCommonGuideConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonGuideConfig extends MessageNano	// class@001150
{
    public String bizFrequencyKey;
    public String commonGuideBizType;
    public String commonGuideSubBizType;
    public boolean disableGlobalFrequency;
    public boolean enableInterrupt;
    public int priority;
    public String subBizFrequencyKey;
    public static LiveCommonGuideConfig[] _emptyArray;

    public void LiveCommonGuideConfig(){
       super();
       this.clear();
    }
    public static LiveCommonGuideConfig[] emptyArray(){
       if (LiveCommonGuideConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonGuideConfig._emptyArray == null) {
             LiveCommonGuideConfig[] liveCommonGu = new LiveCommonGuideConfig[0];
             LiveCommonGuideConfig._emptyArray = liveCommonGu;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonGuideConfig._emptyArray;
    }
    public static LiveCommonGuideConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonGuideConfig().mergeFrom(p0);
    }
    public static LiveCommonGuideConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonGuideConfig(), p0);
    }
    public LiveCommonGuideConfig clear(){
       this.commonGuideBizType = "";
       this.commonGuideSubBizType = "";
       this.priority = 0;
       this.enableInterrupt = false;
       this.subBizFrequencyKey = "";
       this.bizFrequencyKey = "";
       this.disableGlobalFrequency = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.commonGuideBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.commonGuideBizType);
       }
       if (!(this.commonGuideSubBizType).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.commonGuideSubBizType);
       }
       LiveCommonGuideConfig tpriority = this.priority;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tpriority);
       }
       tpriority = this.enableInterrupt;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tpriority);
       }
       if (!(this.subBizFrequencyKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.subBizFrequencyKey);
       }
       if (!(this.bizFrequencyKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.bizFrequencyKey);
       }
       tpriority = this.disableGlobalFrequency;
       if (tpriority != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tpriority);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonGuideConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 50) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.disableGlobalFrequency = p0.readBool();
                            }
                         }else {
                            this.bizFrequencyKey = p0.readString();
                         }
                      }else {
                         this.subBizFrequencyKey = p0.readString();
                      }
                   }else {
                      this.enableInterrupt = p0.readBool();
                   }
                }else {
                   this.priority = p0.readInt32();
                }
             }else {
                this.commonGuideSubBizType = p0.readString();
             }
          }else {
             this.commonGuideBizType = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.commonGuideBizType).equals(str)) {
          p0.writeString(1, this.commonGuideBizType);
       }
       if (!(this.commonGuideSubBizType).equals(str)) {
          p0.writeString(2, this.commonGuideSubBizType);
       }
       LiveCommonGuideConfig tpriority = this.priority;
       if (tpriority != null) {
          p0.writeInt32(3, tpriority);
       }
       tpriority = this.enableInterrupt;
       if (tpriority != null) {
          p0.writeBool(4, tpriority);
       }
       if (!(this.subBizFrequencyKey).equals(str)) {
          p0.writeString(5, this.subBizFrequencyKey);
       }
       if (!(this.bizFrequencyKey).equals(str)) {
          p0.writeString(6, this.bizFrequencyKey);
       }
       tpriority = this.disableGlobalFrequency;
       if (tpriority != null) {
          p0.writeBool(7, tpriority);
       }
       super.writeTo(p0);
       return;
    }
}
