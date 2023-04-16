package com.kuaishou.protobuf.livestream.nano.LiveFeedBackground;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveFeedBackground extends MessageNano	// class@000c5f
{
    public String iconPath;
    public String resPackId;
    public static LiveFeedBackground[] _emptyArray;

    public void LiveFeedBackground(){
       super();
       this.clear();
    }
    public static LiveFeedBackground[] emptyArray(){
       if (LiveFeedBackground._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveFeedBackground._emptyArray == null) {
             LiveFeedBackground[] liveFeedBack = new LiveFeedBackground[0];
             LiveFeedBackground._emptyArray = liveFeedBack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveFeedBackground._emptyArray;
    }
    public static LiveFeedBackground parseFrom(CodedInputByteBufferNano p0){
       return new LiveFeedBackground().mergeFrom(p0);
    }
    public static LiveFeedBackground parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveFeedBackground(), p0);
    }
    public LiveFeedBackground clear(){
       this.resPackId = "";
       this.iconPath = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.resPackId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.resPackId);
       }
       if (!(this.iconPath).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.iconPath);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveFeedBackground mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.iconPath = p0.readString();
             }
          }else {
             this.resPackId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.resPackId).equals(str)) {
          p0.writeString(1, this.resPackId);
       }
       if (!(this.iconPath).equals(str)) {
          p0.writeString(2, this.iconPath);
       }
       super.writeTo(p0);
       return;
    }
}
