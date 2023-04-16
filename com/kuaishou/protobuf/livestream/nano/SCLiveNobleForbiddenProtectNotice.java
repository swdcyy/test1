package com.kuaishou.protobuf.livestream.nano.SCLiveNobleForbiddenProtectNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveNobleForbiddenProtectNotice extends MessageNano	// class@000d67
{
    public long authorId;
    public String liveStreamId;
    public String protectText;
    public int protectType;
    public String userId;
    public static SCLiveNobleForbiddenProtectNotice[] _emptyArray;

    public void SCLiveNobleForbiddenProtectNotice(){
       super();
       this.clear();
    }
    public static SCLiveNobleForbiddenProtectNotice[] emptyArray(){
       if (SCLiveNobleForbiddenProtectNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveNobleForbiddenProtectNotice._emptyArray == null) {
             SCLiveNobleForbiddenProtectNotice[] sCLiveNobleF = new SCLiveNobleForbiddenProtectNotice[0];
             SCLiveNobleForbiddenProtectNotice._emptyArray = sCLiveNobleF;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveNobleForbiddenProtectNotice._emptyArray;
    }
    public static SCLiveNobleForbiddenProtectNotice parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveNobleForbiddenProtectNotice().mergeFrom(p0);
    }
    public static SCLiveNobleForbiddenProtectNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveNobleForbiddenProtectNotice(), p0);
    }
    public SCLiveNobleForbiddenProtectNotice clear(){
       this.protectType = 0;
       this.protectText = "";
       this.authorId = 0;
       this.liveStreamId = "";
       this.userId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveNobleForbiddenProtectNotice tprotectType = this.protectType;
       if (tprotectType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tprotectType);
       }
       String str = "";
       if (!(this.protectText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.protectText);
       }
       SCLiveNobleForbiddenProtectNotice tauthorId = this.authorId;
       if (tauthorId) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tauthorId);
       }
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.liveStreamId);
       }
       if (!(this.userId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.userId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveNobleForbiddenProtectNotice mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.userId = p0.readString();
                      }
                   }else {
                      this.liveStreamId = p0.readString();
                   }
                }else {
                   this.authorId = p0.readUInt64();
                }
             }else {
                this.protectText = p0.readString();
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.protectType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCLiveNobleForbiddenProtectNotice tprotectType = this.protectType;
       if (tprotectType != null) {
          p0.writeInt32(1, tprotectType);
       }
       String str = "";
       if (!(this.protectText).equals(str)) {
          p0.writeString(2, this.protectText);
       }
       SCLiveNobleForbiddenProtectNotice tauthorId = this.authorId;
       if (tauthorId) {
          p0.writeUInt64(3, tauthorId);
       }
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(4, this.liveStreamId);
       }
       if (!(this.userId).equals(str)) {
          p0.writeString(5, this.userId);
       }
       super.writeTo(p0);
       return;
    }
}
