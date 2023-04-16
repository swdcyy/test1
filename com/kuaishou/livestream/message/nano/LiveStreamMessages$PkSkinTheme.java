package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkSkinTheme;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkSkinTheme extends MessageNano	// class@00131b
{
    public boolean enableAuthorSkinTheme;
    public boolean enableOverallSkinTheme;
    public boolean enableRivalSkinTheme;
    public String honorSkinThemeId;
    public String overallSkinThemeId;
    public static LiveStreamMessages$PkSkinTheme[] _emptyArray;

    public void LiveStreamMessages$PkSkinTheme(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkSkinTheme[] emptyArray(){
       if (LiveStreamMessages$PkSkinTheme._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkSkinTheme._emptyArray == null) {
             LiveStreamMessages$PkSkinTheme[] pkSkinThemeA = new LiveStreamMessages$PkSkinTheme[0];
             LiveStreamMessages$PkSkinTheme._emptyArray = pkSkinThemeA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkSkinTheme._emptyArray;
    }
    public static LiveStreamMessages$PkSkinTheme parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkSkinTheme().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkSkinTheme parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkSkinTheme(), p0);
    }
    public LiveStreamMessages$PkSkinTheme clear(){
       this.enableOverallSkinTheme = false;
       this.enableAuthorSkinTheme = false;
       this.enableRivalSkinTheme = false;
       this.overallSkinThemeId = "";
       this.honorSkinThemeId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkSkinTheme tenableOvera = this.enableOverallSkinTheme;
       if (tenableOvera != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableOvera);
       }
       tenableOvera = this.enableAuthorSkinTheme;
       if (tenableOvera != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tenableOvera);
       }
       tenableOvera = this.enableRivalSkinTheme;
       if (tenableOvera != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableOvera);
       }
       String str = "";
       if (!(this.overallSkinThemeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.overallSkinThemeId);
       }
       if (!(this.honorSkinThemeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.honorSkinThemeId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkSkinTheme mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.honorSkinThemeId = p0.readString();
                      }
                   }else {
                      this.overallSkinThemeId = p0.readString();
                   }
                }else {
                   this.enableRivalSkinTheme = p0.readBool();
                }
             }else {
                this.enableAuthorSkinTheme = p0.readBool();
             }
          }else {
             this.enableOverallSkinTheme = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PkSkinTheme tenableOvera = this.enableOverallSkinTheme;
       if (tenableOvera != null) {
          p0.writeBool(1, tenableOvera);
       }
       tenableOvera = this.enableAuthorSkinTheme;
       if (tenableOvera != null) {
          p0.writeBool(2, tenableOvera);
       }
       tenableOvera = this.enableRivalSkinTheme;
       if (tenableOvera != null) {
          p0.writeBool(3, tenableOvera);
       }
       String str = "";
       if (!(this.overallSkinThemeId).equals(str)) {
          p0.writeString(4, this.overallSkinThemeId);
       }
       if (!(this.honorSkinThemeId).equals(str)) {
          p0.writeString(5, this.honorSkinThemeId);
       }
       super.writeTo(p0);
       return;
    }
}
