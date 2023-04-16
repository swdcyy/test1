package com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionTask;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LinkMsg;
import com.kuaishou.livestream.message.nano.LiveAdSocialMessages$NormalMsg;

public final class LiveAdSocialMessages$LiveAdSocialConversionFeed extends MessageNano	// class@0010e5
{
    public LiveAdSocialMessages$LiveAdSocialConversionTask conversionTask;
    public LiveAdSocialMessages$LinkMsg linkMsg;
    public LiveAdSocialMessages$NormalMsg normalMsg;
    public String popMsg;
    public static LiveAdSocialMessages$LiveAdSocialConversionFeed[] _emptyArray;

    public void LiveAdSocialMessages$LiveAdSocialConversionFeed(){
       super();
       this.clear();
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionFeed[] emptyArray(){
       if (LiveAdSocialMessages$LiveAdSocialConversionFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdSocialMessages$LiveAdSocialConversionFeed._emptyArray == null) {
             LiveAdSocialMessages$LiveAdSocialConversionFeed[] liveAdSocial = new LiveAdSocialMessages$LiveAdSocialConversionFeed[0];
             LiveAdSocialMessages$LiveAdSocialConversionFeed._emptyArray = liveAdSocial;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdSocialMessages$LiveAdSocialConversionFeed._emptyArray;
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdSocialMessages$LiveAdSocialConversionFeed().mergeFrom(p0);
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdSocialMessages$LiveAdSocialConversionFeed(), p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionFeed clear(){
       this.normalMsg = null;
       this.linkMsg = null;
       this.conversionTask = null;
       this.popMsg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveAdSocialMessages$LiveAdSocialConversionFeed tnormalMsg = this.normalMsg;
       if (tnormalMsg != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tnormalMsg);
       }
       tnormalMsg = this.linkMsg;
       if (tnormalMsg != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tnormalMsg);
       }
       tnormalMsg = this.conversionTask;
       if (tnormalMsg != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tnormalMsg);
       }
       if (!(this.popMsg).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.popMsg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.popMsg = p0.readString();
                   }
                }else if(this.conversionTask == null){
                   this.conversionTask = new LiveAdSocialMessages$LiveAdSocialConversionTask();
                }
                p0.readMessage(this.conversionTask);
             }else if(this.linkMsg == null){
                this.linkMsg = new LiveAdSocialMessages$LinkMsg();
             }
             p0.readMessage(this.linkMsg);
          }else if(this.normalMsg == null){
             this.normalMsg = new LiveAdSocialMessages$NormalMsg();
          }
          p0.readMessage(this.normalMsg);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveAdSocialMessages$LiveAdSocialConversionFeed tnormalMsg = this.normalMsg;
       if (tnormalMsg != null) {
          p0.writeMessage(1, tnormalMsg);
       }
       tnormalMsg = this.linkMsg;
       if (tnormalMsg != null) {
          p0.writeMessage(2, tnormalMsg);
       }
       tnormalMsg = this.conversionTask;
       if (tnormalMsg != null) {
          p0.writeMessage(3, tnormalMsg);
       }
       if (!(this.popMsg).equals("")) {
          p0.writeString(4, this.popMsg);
       }
       super.writeTo(p0);
       return;
    }
}
