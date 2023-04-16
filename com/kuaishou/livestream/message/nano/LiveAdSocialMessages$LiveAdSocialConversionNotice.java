package com.kuaishou.livestream.message.nano.LiveAdSocialMessages$LiveAdSocialConversionNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveAdSocialMessages$LiveAdSocialConversionNotice extends MessageNano	// class@0010e7
{
    public String content;
    public long displayDuration;
    public int displayType;
    public String id;
    public static LiveAdSocialMessages$LiveAdSocialConversionNotice[] _emptyArray;

    public void LiveAdSocialMessages$LiveAdSocialConversionNotice(){
       super();
       this.clear();
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionNotice[] emptyArray(){
       if (LiveAdSocialMessages$LiveAdSocialConversionNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveAdSocialMessages$LiveAdSocialConversionNotice._emptyArray == null) {
             LiveAdSocialMessages$LiveAdSocialConversionNotice[] liveAdSocial = new LiveAdSocialMessages$LiveAdSocialConversionNotice[0];
             LiveAdSocialMessages$LiveAdSocialConversionNotice._emptyArray = liveAdSocial;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveAdSocialMessages$LiveAdSocialConversionNotice._emptyArray;
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveAdSocialMessages$LiveAdSocialConversionNotice().mergeFrom(p0);
    }
    public static LiveAdSocialMessages$LiveAdSocialConversionNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveAdSocialMessages$LiveAdSocialConversionNotice(), p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionNotice clear(){
       this.id = "";
       this.content = "";
       this.displayDuration = 0;
       this.displayType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.content).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.content);
       }
       LiveAdSocialMessages$LiveAdSocialConversionNotice tdisplayDura = this.displayDuration;
       if (tdisplayDura) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tdisplayDura);
       }
       tdisplayDura = this.displayType;
       if (tdisplayDura != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tdisplayDura);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveAdSocialMessages$LiveAdSocialConversionNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.displayType = i;
                      }
                   }
                }else {
                   this.displayDuration = p0.readUInt64();
                }
             }else {
                this.content = p0.readString();
             }
          }else {
             this.id = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.content).equals(str)) {
          p0.writeString(2, this.content);
       }
       LiveAdSocialMessages$LiveAdSocialConversionNotice tdisplayDura = this.displayDuration;
       if (tdisplayDura) {
          p0.writeUInt64(3, tdisplayDura);
       }
       tdisplayDura = this.displayType;
       if (tdisplayDura != null) {
          p0.writeInt32(4, tdisplayDura);
       }
       super.writeTo(p0);
       return;
    }
}
