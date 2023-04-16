package com.kuaishou.livestream.message.nano.SCAuthorMusicClosed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCAuthorMusicClosed extends MessageNano	// class@0013ec
{
    public String liveStreamId;
    public int sequence;
    public static SCAuthorMusicClosed[] _emptyArray;

    public void SCAuthorMusicClosed(){
       super();
       this.clear();
    }
    public static SCAuthorMusicClosed[] emptyArray(){
       if (SCAuthorMusicClosed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCAuthorMusicClosed._emptyArray == null) {
             SCAuthorMusicClosed[] sCAuthorMusi = new SCAuthorMusicClosed[0];
             SCAuthorMusicClosed._emptyArray = sCAuthorMusi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCAuthorMusicClosed._emptyArray;
    }
    public static SCAuthorMusicClosed parseFrom(CodedInputByteBufferNano p0){
       return new SCAuthorMusicClosed().mergeFrom(p0);
    }
    public static SCAuthorMusicClosed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCAuthorMusicClosed(), p0);
    }
    public SCAuthorMusicClosed clear(){
       this.liveStreamId = "";
       this.sequence = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCAuthorMusicClosed tsequence = this.sequence;
       if (tsequence != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tsequence);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCAuthorMusicClosed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.sequence = p0.readUInt32();
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
       SCAuthorMusicClosed tsequence = this.sequence;
       if (tsequence != null) {
          p0.writeUInt32(2, tsequence);
       }
       super.writeTo(p0);
       return;
    }
}
