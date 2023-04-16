package com.kuaishou.protobuf.livestream.nano.MultiPkSkinTheme;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;

public final class MultiPkSkinTheme extends MessageNano	// class@000d2b
{
    public Map activitySkinBgConfig;
    public String activitySkinThemeId;
    public Map honorSkinBgConfig;
    public String honorSkinThemeId;
    public static MultiPkSkinTheme[] _emptyArray;

    public void MultiPkSkinTheme(){
       super();
       this.clear();
    }
    public static MultiPkSkinTheme[] emptyArray(){
       if (MultiPkSkinTheme._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MultiPkSkinTheme._emptyArray == null) {
             MultiPkSkinTheme[] multiPkSkinT = new MultiPkSkinTheme[0];
             MultiPkSkinTheme._emptyArray = multiPkSkinT;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MultiPkSkinTheme._emptyArray;
    }
    public static MultiPkSkinTheme parseFrom(CodedInputByteBufferNano p0){
       return new MultiPkSkinTheme().mergeFrom(p0);
    }
    public static MultiPkSkinTheme parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MultiPkSkinTheme(), p0);
    }
    public MultiPkSkinTheme clear(){
       this.activitySkinThemeId = "";
       this.honorSkinThemeId = "";
       this.activitySkinBgConfig = null;
       this.honorSkinBgConfig = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activitySkinThemeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activitySkinThemeId);
       }
       if (!(this.honorSkinThemeId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.honorSkinThemeId);
       }
       MultiPkSkinTheme tactivitySki = this.activitySkinBgConfig;
       if (tactivitySki != null) {
          i = i + InternalNano.computeMapFieldSize(tactivitySki, 3, 9, 9);
       }
       tactivitySki = this.honorSkinBgConfig;
       if (tactivitySki != null) {
          i = i + InternalNano.computeMapFieldSize(tactivitySki, 4, 9, 9);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MultiPkSkinTheme mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
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
                      this.honorSkinBgConfig = InternalNano.mergeMapEntry(p0, this.honorSkinBgConfig, mapFactory, 9, 9, null, 10, 18);
                   }
                }else {
                   this.activitySkinBgConfig = InternalNano.mergeMapEntry(p0, this.activitySkinBgConfig, mapFactory, 9, 9, null, 10, 18);
                }
             }else {
                this.honorSkinThemeId = p0.readString();
             }
          }else {
             this.activitySkinThemeId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.activitySkinThemeId).equals(str)) {
          p0.writeString(1, this.activitySkinThemeId);
       }
       if (!(this.honorSkinThemeId).equals(str)) {
          p0.writeString(2, this.honorSkinThemeId);
       }
       MultiPkSkinTheme tactivitySki = this.activitySkinBgConfig;
       if (tactivitySki != null) {
          InternalNano.serializeMapField(p0, tactivitySki, 3, 9, 9);
       }
       tactivitySki = this.honorSkinBgConfig;
       if (tactivitySki != null) {
          InternalNano.serializeMapField(p0, tactivitySki, 4, 9, 9);
       }
       super.writeTo(p0);
       return;
    }
}
