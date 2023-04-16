package com.kuaishou.protobuf.livestream.nano.LiveUserStateDisplaySegments;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class LiveUserStateDisplaySegments extends MessageNano	// class@000d21
{
    public UserStateRichTextSegment[] userStateSegment;
    public static LiveUserStateDisplaySegments[] _emptyArray;

    public void LiveUserStateDisplaySegments(){
       super();
       this.clear();
    }
    public static LiveUserStateDisplaySegments[] emptyArray(){
       if (LiveUserStateDisplaySegments._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveUserStateDisplaySegments._emptyArray == null) {
             LiveUserStateDisplaySegments[] liveUserStat = new LiveUserStateDisplaySegments[0];
             LiveUserStateDisplaySegments._emptyArray = liveUserStat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveUserStateDisplaySegments._emptyArray;
    }
    public static LiveUserStateDisplaySegments parseFrom(CodedInputByteBufferNano p0){
       return new LiveUserStateDisplaySegments().mergeFrom(p0);
    }
    public static LiveUserStateDisplaySegments parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveUserStateDisplaySegments(), p0);
    }
    public LiveUserStateDisplaySegments clear(){
       this.userStateSegment = UserStateRichTextSegment.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveUserStateDisplaySegments tuserStateSe = this.userStateSegment;
       if (tuserStateSe != null && tuserStateSe.length > 0) {
          int i1 = 0;
          LiveUserStateDisplaySegments tuserStateSe1 = this.userStateSegment;
          while (i1 < tuserStateSe1.length) {
             object oobject = tuserStateSe1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveUserStateDisplaySegments mergeFrom(CodedInputByteBufferNano p0){
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
             LiveUserStateDisplaySegments tuserStateSe = this.userStateSegment;
             int i2 = (tuserStateSe == null)? 0: tuserStateSe.length;
             i = i + i2;
             UserStateRichTextSegment[] userStateRic = new UserStateRichTextSegment[i];
             if (i2) {
                System.arraycopy(tuserStateSe, 0, userStateRic, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                userStateRic[i2] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             userStateRic[i2] = new UserStateRichTextSegment();
             p0.readMessage(userStateRic[i2]);
             this.userStateSegment = userStateRic;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveUserStateDisplaySegments tuserStateSe = this.userStateSegment;
       if (tuserStateSe != null && tuserStateSe.length > 0) {
          int i = 0;
          LiveUserStateDisplaySegments tuserStateSe1 = this.userStateSegment;
          while (i < tuserStateSe1.length) {
             object oobject = tuserStateSe1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
