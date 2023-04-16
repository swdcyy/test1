package com.kuaishou.protobuf.livestream.nano.LiveRichTextUserState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import java.lang.Object;
import java.lang.System;

public final class LiveRichTextUserState extends MessageNano	// class@000d07
{
    public Map feedBackground;
    public UserStateRichTextSegment[] userStateSegment;
    public static LiveRichTextUserState[] _emptyArray;

    public void LiveRichTextUserState(){
       super();
       this.clear();
    }
    public static LiveRichTextUserState[] emptyArray(){
       if (LiveRichTextUserState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveRichTextUserState._emptyArray == null) {
             LiveRichTextUserState[] liveRichText = new LiveRichTextUserState[0];
             LiveRichTextUserState._emptyArray = liveRichText;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveRichTextUserState._emptyArray;
    }
    public static LiveRichTextUserState parseFrom(CodedInputByteBufferNano p0){
       return new LiveRichTextUserState().mergeFrom(p0);
    }
    public static LiveRichTextUserState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveRichTextUserState(), p0);
    }
    public LiveRichTextUserState clear(){
       this.userStateSegment = UserStateRichTextSegment.emptyArray();
       this.feedBackground = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveRichTextUserState tuserStateSe = this.userStateSegment;
       if (tuserStateSe != null && tuserStateSe.length > 0) {
          int i1 = 0;
          LiveRichTextUserState tuserStateSe1 = this.userStateSegment;
          while (i1 < tuserStateSe1.length) {
             object oobject = tuserStateSe1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tuserStateSe = this.feedBackground;
       if (tuserStateSe != null) {
          i = i + InternalNano.computeMapFieldSize(tuserStateSe, 2, 5, 11);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveRichTextUserState mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.feedBackground = InternalNano.mergeMapEntry(p0, this.feedBackground, mapFactory, 5, 11, new LiveFeedBackground(), 8, 18);
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             LiveRichTextUserState tuserStateSe = this.userStateSegment;
             int i2 = 0;
             int i3 = (tuserStateSe == null)? 0: tuserStateSe.length;
             i = i + i3;
             UserStateRichTextSegment[] userStateRic = new UserStateRichTextSegment[i];
             if (i3) {
                System.arraycopy(tuserStateSe, i2, userStateRic, i2, i3);
             }
             i1 = i - 1;
             while (i3 < i1) {
                userStateRic[i3] = new UserStateRichTextSegment();
                p0.readMessage(userStateRic[i3]);
                p0.readTag();
                i3 = i3 + 1;
             }
             userStateRic[i3] = new UserStateRichTextSegment();
             p0.readMessage(userStateRic[i3]);
             this.userStateSegment = userStateRic;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveRichTextUserState tuserStateSe = this.userStateSegment;
       if (tuserStateSe != null && tuserStateSe.length > 0) {
          int i = 0;
          LiveRichTextUserState tuserStateSe1 = this.userStateSegment;
          while (i < tuserStateSe1.length) {
             object oobject = tuserStateSe1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tuserStateSe = this.feedBackground;
       if (tuserStateSe != null) {
          InternalNano.serializeMapField(p0, tuserStateSe, 2, 5, 11);
       }
       super.writeTo(p0);
       return;
    }
}
