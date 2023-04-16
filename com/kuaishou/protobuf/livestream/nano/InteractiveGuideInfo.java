package com.kuaishou.protobuf.livestream.nano.InteractiveGuideInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuideButton;
import java.lang.System;

public final class InteractiveGuideInfo extends MessageNano	// class@000c28
{
    public InteractiveGuideButton button;
    public String[] subTitles;
    public String title;
    public static InteractiveGuideInfo[] _emptyArray;

    public void InteractiveGuideInfo(){
       super();
       this.clear();
    }
    public static InteractiveGuideInfo[] emptyArray(){
       if (InteractiveGuideInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuideInfo._emptyArray == null) {
             InteractiveGuideInfo[] interactiveG = new InteractiveGuideInfo[0];
             InteractiveGuideInfo._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuideInfo._emptyArray;
    }
    public static InteractiveGuideInfo parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuideInfo().mergeFrom(p0);
    }
    public static InteractiveGuideInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuideInfo(), p0);
    }
    public InteractiveGuideInfo clear(){
       this.title = "";
       this.subTitles = WireFormatNano.EMPTY_STRING_ARRAY;
       this.button = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (!(this.title).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.title);
       }
       InteractiveGuideInfo tsubTitles = this.subTitles;
       if (tsubTitles != null && tsubTitles.length > 0) {
          int i2 = 0;
          int i3 = 0;
          int i4 = 0;
          InteractiveGuideInfo tsubTitles1 = this.subTitles;
          while (i2 < tsubTitles1.length) {
             object oobject = tsubTitles1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tsubTitles = this.button;
       if (tsubTitles != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tsubTitles);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuideInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else if(this.button == null){
                   this.button = new InteractiveGuideButton();
                }
                p0.readMessage(this.button);
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                InteractiveGuideInfo tsubTitles = this.subTitles;
                int i2 = (tsubTitles == null)? 0: tsubTitles.length;
                i = i + i2;
                String[] stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tsubTitles, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.subTitles = stringArray;
             }
          }else {
             this.title = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.title).equals("")) {
          p0.writeString(1, this.title);
       }
       InteractiveGuideInfo tsubTitles = this.subTitles;
       if (tsubTitles != null && tsubTitles.length > 0) {
          int i = 0;
          InteractiveGuideInfo tsubTitles1 = this.subTitles;
          while (i < tsubTitles1.length) {
             object oobject = tsubTitles1[i];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i = i + 1;
          }
       }
       tsubTitles = this.button;
       if (tsubTitles != null) {
          p0.writeMessage(3, tsubTitles);
       }
       super.writeTo(p0);
       return;
    }
}
