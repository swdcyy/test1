package com.kuaishou.protobuf.livestream.nano.BountyGameDivisionInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class BountyGameDivisionInfo extends MessageNano	// class@000c03
{
    public String tagBackgroundColor;
    public String tagText;
    public String tagTextColor;
    public static BountyGameDivisionInfo[] _emptyArray;

    public void BountyGameDivisionInfo(){
       super();
       this.clear();
    }
    public static BountyGameDivisionInfo[] emptyArray(){
       if (BountyGameDivisionInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (BountyGameDivisionInfo._emptyArray == null) {
             BountyGameDivisionInfo[] uBountyGameD = new BountyGameDivisionInfo[0];
             BountyGameDivisionInfo._emptyArray = uBountyGameD;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return BountyGameDivisionInfo._emptyArray;
    }
    public static BountyGameDivisionInfo parseFrom(CodedInputByteBufferNano p0){
       return new BountyGameDivisionInfo().mergeFrom(p0);
    }
    public static BountyGameDivisionInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new BountyGameDivisionInfo(), p0);
    }
    public BountyGameDivisionInfo clear(){
       this.tagText = "";
       this.tagBackgroundColor = "";
       this.tagTextColor = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.tagText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.tagText);
       }
       if (!(this.tagBackgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.tagBackgroundColor);
       }
       if (!(this.tagTextColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.tagTextColor);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public BountyGameDivisionInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.tagTextColor = p0.readString();
                }
             }else {
                this.tagBackgroundColor = p0.readString();
             }
          }else {
             this.tagText = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.tagText).equals(str)) {
          p0.writeString(1, this.tagText);
       }
       if (!(this.tagBackgroundColor).equals(str)) {
          p0.writeString(2, this.tagBackgroundColor);
       }
       if (!(this.tagTextColor).equals(str)) {
          p0.writeString(3, this.tagTextColor);
       }
       super.writeTo(p0);
       return;
    }
}
