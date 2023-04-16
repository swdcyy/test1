package com.kuaishou.livestream.message.nano.LiveStreamMessages$SCPkSkinThemeSignal;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$PkSkinTheme;

public final class LiveStreamMessages$SCPkSkinThemeSignal extends MessageNano	// class@00135e
{
    public LiveStreamMessages$PkSkinTheme customPkSkinTheme;
    public static LiveStreamMessages$SCPkSkinThemeSignal[] _emptyArray;

    public void LiveStreamMessages$SCPkSkinThemeSignal(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$SCPkSkinThemeSignal[] emptyArray(){
       if (LiveStreamMessages$SCPkSkinThemeSignal._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$SCPkSkinThemeSignal._emptyArray == null) {
             LiveStreamMessages$SCPkSkinThemeSignal[] sCPkSkinThem = new LiveStreamMessages$SCPkSkinThemeSignal[0];
             LiveStreamMessages$SCPkSkinThemeSignal._emptyArray = sCPkSkinThem;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$SCPkSkinThemeSignal._emptyArray;
    }
    public static LiveStreamMessages$SCPkSkinThemeSignal parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$SCPkSkinThemeSignal().mergeFrom(p0);
    }
    public static LiveStreamMessages$SCPkSkinThemeSignal parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$SCPkSkinThemeSignal(), p0);
    }
    public LiveStreamMessages$SCPkSkinThemeSignal clear(){
       this.customPkSkinTheme = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$SCPkSkinThemeSignal tcustomPkSki = this.customPkSkinTheme;
       if (tcustomPkSki != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tcustomPkSki);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$SCPkSkinThemeSignal mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else if(this.customPkSkinTheme == null){
             this.customPkSkinTheme = new LiveStreamMessages$PkSkinTheme();
          }
          p0.readMessage(this.customPkSkinTheme);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$SCPkSkinThemeSignal tcustomPkSki = this.customPkSkinTheme;
       if (tcustomPkSki != null) {
          p0.writeMessage(1, tcustomPkSki);
       }
       super.writeTo(p0);
       return;
    }
}
