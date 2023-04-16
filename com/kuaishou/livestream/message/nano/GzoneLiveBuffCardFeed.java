package com.kuaishou.livestream.message.nano.GzoneLiveBuffCardFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class GzoneLiveBuffCardFeed extends MessageNano	// class@0010b2
{
    public String color;
    public String leftIconUrl;
    public String leftText;
    public String rightIconUrl;
    public String rightText;
    public static GzoneLiveBuffCardFeed[] _emptyArray;

    public void GzoneLiveBuffCardFeed(){
       super();
       this.clear();
    }
    public static GzoneLiveBuffCardFeed[] emptyArray(){
       if (GzoneLiveBuffCardFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GzoneLiveBuffCardFeed._emptyArray == null) {
             GzoneLiveBuffCardFeed[] gzoneLiveBuf = new GzoneLiveBuffCardFeed[0];
             GzoneLiveBuffCardFeed._emptyArray = gzoneLiveBuf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GzoneLiveBuffCardFeed._emptyArray;
    }
    public static GzoneLiveBuffCardFeed parseFrom(CodedInputByteBufferNano p0){
       return new GzoneLiveBuffCardFeed().mergeFrom(p0);
    }
    public static GzoneLiveBuffCardFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GzoneLiveBuffCardFeed(), p0);
    }
    public GzoneLiveBuffCardFeed clear(){
       this.leftIconUrl = "";
       this.rightIconUrl = "";
       this.leftText = "";
       this.rightText = "";
       this.color = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.leftIconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.leftIconUrl);
       }
       if (!(this.rightIconUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.rightIconUrl);
       }
       if (!(this.leftText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.leftText);
       }
       if (!(this.rightText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.rightText);
       }
       if (!(this.color).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.color);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GzoneLiveBuffCardFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.color = p0.readString();
                      }
                   }else {
                      this.rightText = p0.readString();
                   }
                }else {
                   this.leftText = p0.readString();
                }
             }else {
                this.rightIconUrl = p0.readString();
             }
          }else {
             this.leftIconUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.leftIconUrl).equals(str)) {
          p0.writeString(1, this.leftIconUrl);
       }
       if (!(this.rightIconUrl).equals(str)) {
          p0.writeString(2, this.rightIconUrl);
       }
       if (!(this.leftText).equals(str)) {
          p0.writeString(3, this.leftText);
       }
       if (!(this.rightText).equals(str)) {
          p0.writeString(4, this.rightText);
       }
       if (!(this.color).equals(str)) {
          p0.writeString(5, this.color);
       }
       super.writeTo(p0);
       return;
    }
}
