package com.kuaishou.protobuf.gamezone.prediction.nano.SCGzonePredictionShow;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCGzonePredictionShow extends MessageNano	// class@000be9
{
    public long displayDuration;
    public String icon;
    public String jumpUrl;
    public String title;
    public int type;
    public static SCGzonePredictionShow[] _emptyArray;

    public void SCGzonePredictionShow(){
       super();
       this.clear();
    }
    public static SCGzonePredictionShow[] emptyArray(){
       if (SCGzonePredictionShow._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzonePredictionShow._emptyArray == null) {
             SCGzonePredictionShow[] sCGzonePredi = new SCGzonePredictionShow[0];
             SCGzonePredictionShow._emptyArray = sCGzonePredi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzonePredictionShow._emptyArray;
    }
    public static SCGzonePredictionShow parseFrom(CodedInputByteBufferNano p0){
       return new SCGzonePredictionShow().mergeFrom(p0);
    }
    public static SCGzonePredictionShow parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzonePredictionShow(), p0);
    }
    public SCGzonePredictionShow clear(){
       this.type = 0;
       this.displayDuration = 0;
       this.icon = "";
       this.jumpUrl = "";
       this.title = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzonePredictionShow ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       ttype = this.displayDuration;
       if (ttype - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, ttype);
       }
       String str = "";
       if (!(this.icon).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.icon);
       }
       if (!(this.jumpUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.jumpUrl);
       }
       if (!(this.title).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.title);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzonePredictionShow mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.title = p0.readString();
                      }
                   }else {
                      this.jumpUrl = p0.readString();
                   }
                }else {
                   this.icon = p0.readString();
                }
             }else {
                this.displayDuration = p0.readUInt64();
             }
          }else {
             i = p0.readInt32();
             if (i && i != 1) {
                continue ;
             }else {
                this.type = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzonePredictionShow ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       ttype = this.displayDuration;
       if (ttype - null) {
          p0.writeUInt64(2, ttype);
       }
       String str = "";
       if (!(this.icon).equals(str)) {
          p0.writeString(3, this.icon);
       }
       if (!(this.jumpUrl).equals(str)) {
          p0.writeString(4, this.jumpUrl);
       }
       if (!(this.title).equals(str)) {
          p0.writeString(5, this.title);
       }
       super.writeTo(p0);
       return;
    }
}
