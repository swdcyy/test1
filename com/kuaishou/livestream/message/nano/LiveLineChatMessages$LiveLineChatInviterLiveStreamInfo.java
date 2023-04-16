package com.kuaishou.livestream.message.nano.LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo extends MessageNano	// class@0011da
{
    public String caption;
    public LiveCdnNodeView[] cover;
    public static LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo[] _emptyArray;

    public void LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo(){
       super();
       this.clear();
    }
    public static LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo[] emptyArray(){
       if (LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo._emptyArray == null) {
             LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo[] liveLineChat = new LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo[0];
             LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo._emptyArray = liveLineChat;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo._emptyArray;
    }
    public static LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo().mergeFrom(p0);
    }
    public static LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo(), p0);
    }
    public LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo clear(){
       this.caption = "";
       this.cover = LiveCdnNodeView.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.caption).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.caption);
       }
       LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo tcover = this.cover;
       if (tcover != null && tcover.length > 0) {
          int i1 = 0;
          LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo tcover1 = this.cover;
          while (i1 < tcover1.length) {
             object oobject = tcover1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo tcover = this.cover;
                int i2 = (tcover == null)? 0: tcover.length;
                i = i + i2;
                LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[i];
                if (i2) {
                   System.arraycopy(tcover, 0, liveCdnNodeV, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   liveCdnNodeV[i2] = new LiveCdnNodeView();
                   p0.readMessage(liveCdnNodeV[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                liveCdnNodeV[i2] = new LiveCdnNodeView();
                p0.readMessage(liveCdnNodeV[i2]);
                this.cover = liveCdnNodeV;
             }
          }else {
             this.caption = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.caption).equals("")) {
          p0.writeString(1, this.caption);
       }
       LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo tcover = this.cover;
       if (tcover != null && tcover.length > 0) {
          int i = 0;
          LiveLineChatMessages$LiveLineChatInviterLiveStreamInfo tcover1 = this.cover;
          while (i < tcover1.length) {
             object oobject = tcover1[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
