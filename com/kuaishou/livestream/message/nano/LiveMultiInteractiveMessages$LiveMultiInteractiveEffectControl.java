package com.kuaishou.livestream.message.nano.LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.String;
import java.lang.Object;
import java.lang.System;

public final class LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl extends MessageNano	// class@0011fd
{
    public String interactiveSceneId;
    public int interactiveType;
    public String oldMultiLineChatId;
    public int userType;
    public String[] whiteUser;
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl[] _emptyArray;

    public void LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl(){
       super();
       this.clear();
    }
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl[] emptyArray(){
       if (LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl._emptyArray == null) {
             LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl[] liveMultiInt = new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl[0];
             LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl._emptyArray = liveMultiInt;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl._emptyArray;
    }
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl().mergeFrom(p0);
    }
    public static LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl(), p0);
    }
    public LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl clear(){
       this.userType = 0;
       this.whiteUser = WireFormatNano.EMPTY_STRING_ARRAY;
       this.interactiveType = 0;
       this.interactiveSceneId = "";
       this.oldMultiLineChatId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl tuserType = this.userType;
       int i1 = 1;
       if (tuserType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(i1, tuserType);
       }
       tuserType = this.whiteUser;
       if (tuserType != null && tuserType.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl twhiteUser = this.whiteUser;
          while (i2 < twhiteUser.length) {
             object oobject = twhiteUser[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tuserType = this.interactiveType;
       if (tuserType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tuserType);
       }
       String str = "";
       if (!(this.interactiveSceneId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.interactiveSceneId);
       }
       if (!(this.oldMultiLineChatId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.oldMultiLineChatId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 3;
          int i2 = 2;
          String[] stringArray = 1;
          if (i != 8) {
             int i3 = 18;
             if (i != i3) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.oldMultiLineChatId = p0.readString();
                      }
                   }else {
                      this.interactiveSceneId = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != stringArray && (i != i2 && (i != i1 && i != 4)))) {
                      continue ;
                   }else {
                      this.interactiveType = i;
                   }
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i3);
                LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl twhiteUser = this.whiteUser;
                i1 = 0;
                i2 = (twhiteUser == null)? 0: twhiteUser.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(twhiteUser, i1, stringArray, i1, i2);
                }
                i3 = i - 1;
                while (i2 < i3) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.whiteUser = stringArray;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != stringArray && (i != i2 && i != i1))) {
                continue ;
             }else {
                this.userType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl tuserType = this.userType;
       if (tuserType != null) {
          p0.writeInt32(1, tuserType);
       }
       tuserType = this.whiteUser;
       if (tuserType != null && tuserType.length > 0) {
          int i = 0;
          LiveMultiInteractiveMessages$LiveMultiInteractiveEffectControl twhiteUser = this.whiteUser;
          while (i < twhiteUser.length) {
             object oobject = twhiteUser[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       tuserType = this.interactiveType;
       if (tuserType != null) {
          p0.writeInt32(3, tuserType);
       }
       String str = "";
       if (!(this.interactiveSceneId).equals(str)) {
          p0.writeString(4, this.interactiveSceneId);
       }
       if (!(this.oldMultiLineChatId).equals(str)) {
          p0.writeString(5, this.oldMultiLineChatId);
       }
       super.writeTo(p0);
       return;
    }
}
