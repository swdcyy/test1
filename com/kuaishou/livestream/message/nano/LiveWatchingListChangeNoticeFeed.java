package com.kuaishou.livestream.message.nano.LiveWatchingListChangeNoticeFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveWatchingListChangeNoticeFeed extends MessageNano	// class@0013d5
{
    public String displayUserName;
    public String id;
    public boolean needFold;
    public String noticeText;
    public static LiveWatchingListChangeNoticeFeed[] _emptyArray;

    public void LiveWatchingListChangeNoticeFeed(){
       super();
       this.clear();
    }
    public static LiveWatchingListChangeNoticeFeed[] emptyArray(){
       if (LiveWatchingListChangeNoticeFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveWatchingListChangeNoticeFeed._emptyArray == null) {
             LiveWatchingListChangeNoticeFeed[] liveWatching = new LiveWatchingListChangeNoticeFeed[0];
             LiveWatchingListChangeNoticeFeed._emptyArray = liveWatching;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveWatchingListChangeNoticeFeed._emptyArray;
    }
    public static LiveWatchingListChangeNoticeFeed parseFrom(CodedInputByteBufferNano p0){
       return new LiveWatchingListChangeNoticeFeed().mergeFrom(p0);
    }
    public static LiveWatchingListChangeNoticeFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveWatchingListChangeNoticeFeed(), p0);
    }
    public LiveWatchingListChangeNoticeFeed clear(){
       this.noticeText = "";
       this.needFold = false;
       this.id = "";
       this.displayUserName = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.noticeText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.noticeText);
       }
       LiveWatchingListChangeNoticeFeed tneedFold = this.needFold;
       if (tneedFold != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tneedFold);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.id);
       }
       if (!(this.displayUserName).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.displayUserName);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveWatchingListChangeNoticeFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.displayUserName = p0.readString();
                   }
                }else {
                   this.id = p0.readString();
                }
             }else {
                this.needFold = p0.readBool();
             }
          }else {
             this.noticeText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.noticeText).equals(str)) {
          p0.writeString(1, this.noticeText);
       }
       LiveWatchingListChangeNoticeFeed tneedFold = this.needFold;
       if (tneedFold != null) {
          p0.writeBool(2, tneedFold);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(3, this.id);
       }
       if (!(this.displayUserName).equals(str)) {
          p0.writeString(4, this.displayUserName);
       }
       super.writeTo(p0);
       return;
    }
}
