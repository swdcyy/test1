package com.kuaishou.protobuf.livestream.nano.LiveMultiChatStart;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiChatStart extends MessageNano	// class@000ca9
{
    public boolean enableGuestGift;
    public boolean enableUpdateLayoutTheme;
    public int theme;
    public static LiveMultiChatStart[] _emptyArray;

    public void LiveMultiChatStart(){
       super();
       this.clear();
    }
    public static LiveMultiChatStart[] emptyArray(){
       if (LiveMultiChatStart._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiChatStart._emptyArray == null) {
             LiveMultiChatStart[] liveMultiCha = new LiveMultiChatStart[0];
             LiveMultiChatStart._emptyArray = liveMultiCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiChatStart._emptyArray;
    }
    public static LiveMultiChatStart parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiChatStart().mergeFrom(p0);
    }
    public static LiveMultiChatStart parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiChatStart(), p0);
    }
    public LiveMultiChatStart clear(){
       this.enableUpdateLayoutTheme = false;
       this.theme = 0;
       this.enableGuestGift = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiChatStart tenableUpdat = this.enableUpdateLayoutTheme;
       if (tenableUpdat != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableUpdat);
       }
       tenableUpdat = this.theme;
       if (tenableUpdat != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tenableUpdat);
       }
       tenableUpdat = this.enableGuestGift;
       if (tenableUpdat != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableUpdat);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiChatStart mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.enableGuestGift = p0.readBool();
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.theme = i;
                }
             }
          }else {
             this.enableUpdateLayoutTheme = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiChatStart tenableUpdat = this.enableUpdateLayoutTheme;
       if (tenableUpdat != null) {
          p0.writeBool(1, tenableUpdat);
       }
       tenableUpdat = this.theme;
       if (tenableUpdat != null) {
          p0.writeInt32(2, tenableUpdat);
       }
       tenableUpdat = this.enableGuestGift;
       if (tenableUpdat != null) {
          p0.writeBool(3, tenableUpdat);
       }
       super.writeTo(p0);
       return;
    }
}
