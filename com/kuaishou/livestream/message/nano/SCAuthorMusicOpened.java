package com.kuaishou.livestream.message.nano.SCAuthorMusicOpened;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.AuthorMusicInfo;

public final class SCAuthorMusicOpened extends MessageNano	// class@0013ed
{
    public String liveStreamId;
    public AuthorMusicInfo musicInfo;
    public int sequence;
    public int source;
    public static SCAuthorMusicOpened[] _emptyArray;

    public void SCAuthorMusicOpened(){
       super();
       this.clear();
    }
    public static SCAuthorMusicOpened[] emptyArray(){
       if (SCAuthorMusicOpened._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCAuthorMusicOpened._emptyArray == null) {
             SCAuthorMusicOpened[] sCAuthorMusi = new SCAuthorMusicOpened[0];
             SCAuthorMusicOpened._emptyArray = sCAuthorMusi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCAuthorMusicOpened._emptyArray;
    }
    public static SCAuthorMusicOpened parseFrom(CodedInputByteBufferNano p0){
       return new SCAuthorMusicOpened().mergeFrom(p0);
    }
    public static SCAuthorMusicOpened parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCAuthorMusicOpened(), p0);
    }
    public SCAuthorMusicOpened clear(){
       this.liveStreamId = "";
       this.sequence = 0;
       this.musicInfo = null;
       this.source = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.liveStreamId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.liveStreamId);
       }
       SCAuthorMusicOpened tsequence = this.sequence;
       if (tsequence != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tsequence);
       }
       tsequence = this.musicInfo;
       if (tsequence != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tsequence);
       }
       tsequence = this.source;
       if (tsequence != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tsequence);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCAuthorMusicOpened mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 32) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      i = p0.readInt32();
                      if (i && (i != 1 && i != 2)) {
                         continue ;
                      }else {
                         this.source = i;
                      }
                   }
                }else if(this.musicInfo == null){
                   this.musicInfo = new AuthorMusicInfo();
                }
                p0.readMessage(this.musicInfo);
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
       SCAuthorMusicOpened tsequence = this.sequence;
       if (tsequence != null) {
          p0.writeUInt32(2, tsequence);
       }
       tsequence = this.musicInfo;
       if (tsequence != null) {
          p0.writeMessage(3, tsequence);
       }
       tsequence = this.source;
       if (tsequence != null) {
          p0.writeInt32(4, tsequence);
       }
       super.writeTo(p0);
       return;
    }
}
