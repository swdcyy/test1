package com.kuaishou.protobuf.livestream.nano.LivePuzzleLineChatResourceInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePuzzleLineChatResourceInfo extends MessageNano	// class@000cd7
{
    public String versionResourcePath;
    public static LivePuzzleLineChatResourceInfo[] _emptyArray;

    public void LivePuzzleLineChatResourceInfo(){
       super();
       this.clear();
    }
    public static LivePuzzleLineChatResourceInfo[] emptyArray(){
       if (LivePuzzleLineChatResourceInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePuzzleLineChatResourceInfo._emptyArray == null) {
             LivePuzzleLineChatResourceInfo[] livePuzzleLi = new LivePuzzleLineChatResourceInfo[0];
             LivePuzzleLineChatResourceInfo._emptyArray = livePuzzleLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePuzzleLineChatResourceInfo._emptyArray;
    }
    public static LivePuzzleLineChatResourceInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePuzzleLineChatResourceInfo().mergeFrom(p0);
    }
    public static LivePuzzleLineChatResourceInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePuzzleLineChatResourceInfo(), p0);
    }
    public LivePuzzleLineChatResourceInfo clear(){
       this.versionResourcePath = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.versionResourcePath).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.versionResourcePath);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePuzzleLineChatResourceInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             this.versionResourcePath = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.versionResourcePath).equals("")) {
          p0.writeString(1, this.versionResourcePath);
       }
       super.writeTo(p0);
       return;
    }
}
