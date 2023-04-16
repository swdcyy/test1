package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerEndInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkPlayerEndInfo extends MessageNano	// class@001316
{
    public long authorId;
    public String bottomDisplayText;
    public long displayMs;
    public static LiveStreamMessages$PkPlayerEndInfo[] _emptyArray;

    public void LiveStreamMessages$PkPlayerEndInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkPlayerEndInfo[] emptyArray(){
       if (LiveStreamMessages$PkPlayerEndInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkPlayerEndInfo._emptyArray == null) {
             LiveStreamMessages$PkPlayerEndInfo[] pkPlayerEndI = new LiveStreamMessages$PkPlayerEndInfo[0];
             LiveStreamMessages$PkPlayerEndInfo._emptyArray = pkPlayerEndI;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkPlayerEndInfo._emptyArray;
    }
    public static LiveStreamMessages$PkPlayerEndInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkPlayerEndInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkPlayerEndInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkPlayerEndInfo(), p0);
    }
    public LiveStreamMessages$PkPlayerEndInfo clear(){
       this.authorId = 0;
       this.bottomDisplayText = "";
       this.displayMs = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkPlayerEndInfo tauthorId = this.authorId;
       int i1 = 0;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tauthorId);
       }
       if (!(this.bottomDisplayText).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.bottomDisplayText);
       }
       tauthorId = this.displayMs;
       if (tauthorId - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkPlayerEndInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.displayMs = p0.readUInt64();
                }
             }else {
                this.bottomDisplayText = p0.readString();
             }
          }else {
             this.authorId = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PkPlayerEndInfo tauthorId = this.authorId;
       int i = 0;
       if (tauthorId - i) {
          p0.writeUInt64(1, tauthorId);
       }
       if (!(this.bottomDisplayText).equals("")) {
          p0.writeString(2, this.bottomDisplayText);
       }
       tauthorId = this.displayMs;
       if (tauthorId - i) {
          p0.writeUInt64(3, tauthorId);
       }
       super.writeTo(p0);
       return;
    }
}
