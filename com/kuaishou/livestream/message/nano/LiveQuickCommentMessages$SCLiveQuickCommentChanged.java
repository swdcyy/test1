package com.kuaishou.livestream.message.nano.LiveQuickCommentMessages$SCLiveQuickCommentChanged;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class LiveQuickCommentMessages$SCLiveQuickCommentChanged extends MessageNano	// class@001259
{
    public String[] comment;
    public static LiveQuickCommentMessages$SCLiveQuickCommentChanged[] _emptyArray;

    public void LiveQuickCommentMessages$SCLiveQuickCommentChanged(){
       super();
       this.clear();
    }
    public static LiveQuickCommentMessages$SCLiveQuickCommentChanged[] emptyArray(){
       if (LiveQuickCommentMessages$SCLiveQuickCommentChanged._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuickCommentMessages$SCLiveQuickCommentChanged._emptyArray == null) {
             LiveQuickCommentMessages$SCLiveQuickCommentChanged[] sCLiveQuickC = new LiveQuickCommentMessages$SCLiveQuickCommentChanged[0];
             LiveQuickCommentMessages$SCLiveQuickCommentChanged._emptyArray = sCLiveQuickC;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuickCommentMessages$SCLiveQuickCommentChanged._emptyArray;
    }
    public static LiveQuickCommentMessages$SCLiveQuickCommentChanged parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuickCommentMessages$SCLiveQuickCommentChanged().mergeFrom(p0);
    }
    public static LiveQuickCommentMessages$SCLiveQuickCommentChanged parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuickCommentMessages$SCLiveQuickCommentChanged(), p0);
    }
    public LiveQuickCommentMessages$SCLiveQuickCommentChanged clear(){
       this.comment = WireFormatNano.EMPTY_STRING_ARRAY;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveQuickCommentMessages$SCLiveQuickCommentChanged tcomment = this.comment;
       if (tcomment != null && tcomment.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          LiveQuickCommentMessages$SCLiveQuickCommentChanged tcomment1 = this.comment;
          while (i1 < tcomment1.length) {
             object oobject = tcomment1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuickCommentMessages$SCLiveQuickCommentChanged mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveQuickCommentMessages$SCLiveQuickCommentChanged tcomment = this.comment;
             int i2 = (tcomment == null)? 0: tcomment.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(tcomment, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.comment = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveQuickCommentMessages$SCLiveQuickCommentChanged tcomment = this.comment;
       if (tcomment != null && tcomment.length > 0) {
          int i = 0;
          LiveQuickCommentMessages$SCLiveQuickCommentChanged tcomment1 = this.comment;
          while (i < tcomment1.length) {
             object oobject = tcomment1[i];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
