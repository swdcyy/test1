package com.kuaishou.protobuf.livestream.nano.SCLiveMultiPkLoggingGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMultiPkLoggingGuide extends MessageNano	// class@000d61
{
    public long authorId;
    public String buttonClickAction;
    public String buttonText;
    public String liveStreamId;
    public long loggingGuideEndTime;
    public long loggingGuideStartTime;
    public String multiPkId;
    public String scorePrefixText;
    public long timestamp;
    public static SCLiveMultiPkLoggingGuide[] _emptyArray;

    public void SCLiveMultiPkLoggingGuide(){
       super();
       this.clear();
    }
    public static SCLiveMultiPkLoggingGuide[] emptyArray(){
       if (SCLiveMultiPkLoggingGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiPkLoggingGuide._emptyArray == null) {
             SCLiveMultiPkLoggingGuide[] sCLiveMultiP = new SCLiveMultiPkLoggingGuide[0];
             SCLiveMultiPkLoggingGuide._emptyArray = sCLiveMultiP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiPkLoggingGuide._emptyArray;
    }
    public static SCLiveMultiPkLoggingGuide parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiPkLoggingGuide().mergeFrom(p0);
    }
    public static SCLiveMultiPkLoggingGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiPkLoggingGuide(), p0);
    }
    public SCLiveMultiPkLoggingGuide clear(){
       this.multiPkId = "";
       this.liveStreamId = "";
       this.authorId = 0;
       this.loggingGuideStartTime = 0;
       this.loggingGuideEndTime = 0;
       this.timestamp = 0;
       this.buttonText = "";
       this.buttonClickAction = "";
       this.scorePrefixText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.multiPkId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.multiPkId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.liveStreamId);
       }
       SCLiveMultiPkLoggingGuide tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       tauthorId = this.loggingGuideStartTime;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(4, tauthorId);
       }
       tauthorId = this.loggingGuideEndTime;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(5, tauthorId);
       }
       tauthorId = this.timestamp;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tauthorId);
       }
       if (!(this.buttonText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.buttonText);
       }
       if (!(this.buttonClickAction).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.buttonClickAction);
       }
       if (!(this.scorePrefixText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.scorePrefixText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiPkLoggingGuide mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 58) {
                               if (i != 66) {
                                  if (i != 74) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.scorePrefixText = p0.readString();
                                  }
                               }else {
                                  this.buttonClickAction = p0.readString();
                               }
                            }else {
                               this.buttonText = p0.readString();
                            }
                         }else {
                            this.timestamp = p0.readUInt64();
                         }
                      }else {
                         this.loggingGuideEndTime = p0.readUInt64();
                      }
                   }else {
                      this.loggingGuideStartTime = p0.readUInt64();
                   }
                }else {
                   this.authorId = p0.readUInt64();
                }
             }else {
                this.liveStreamId = p0.readString();
             }
          }else {
             this.multiPkId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.multiPkId).equals(str)) {
          p0.writeString(1, this.multiPkId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(2, this.liveStreamId);
       }
       SCLiveMultiPkLoggingGuide tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       tauthorId = this.loggingGuideStartTime;
       if (tauthorId) {
          p0.writeUInt64(4, tauthorId);
       }
       tauthorId = this.loggingGuideEndTime;
       if (tauthorId) {
          p0.writeUInt64(5, tauthorId);
       }
       tauthorId = this.timestamp;
       if (tauthorId) {
          p0.writeUInt64(6, tauthorId);
       }
       if (!(this.buttonText).equals(str)) {
          p0.writeString(7, this.buttonText);
       }
       if (!(this.buttonClickAction).equals(str)) {
          p0.writeString(8, this.buttonClickAction);
       }
       if (!(this.scorePrefixText).equals(str)) {
          p0.writeString(9, this.scorePrefixText);
       }
       super.writeTo(p0);
       return;
    }
}
