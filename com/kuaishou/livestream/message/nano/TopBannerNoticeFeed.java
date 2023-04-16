package com.kuaishou.livestream.message.nano.TopBannerNoticeFeed;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class TopBannerNoticeFeed extends MessageNano	// class@00147c
{
    public String backgroundColor;
    public String backgroundColorBegin;
    public String backgroundColorEnd;
    public String textColor;
    public String textContent;
    public int type;
    public static TopBannerNoticeFeed[] _emptyArray;

    public void TopBannerNoticeFeed(){
       super();
       this.clear();
    }
    public static TopBannerNoticeFeed[] emptyArray(){
       if (TopBannerNoticeFeed._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TopBannerNoticeFeed._emptyArray == null) {
             TopBannerNoticeFeed[] topBannerNot = new TopBannerNoticeFeed[0];
             TopBannerNoticeFeed._emptyArray = topBannerNot;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TopBannerNoticeFeed._emptyArray;
    }
    public static TopBannerNoticeFeed parseFrom(CodedInputByteBufferNano p0){
       return new TopBannerNoticeFeed().mergeFrom(p0);
    }
    public static TopBannerNoticeFeed parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TopBannerNoticeFeed(), p0);
    }
    public TopBannerNoticeFeed clear(){
       this.textColor = "";
       this.textContent = "";
       this.type = 0;
       this.backgroundColor = "";
       this.backgroundColorBegin = "";
       this.backgroundColorEnd = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.textColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.textColor);
       }
       if (!(this.textContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.textContent);
       }
       TopBannerNoticeFeed ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, ttype);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.backgroundColor);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.backgroundColorEnd);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TopBannerNoticeFeed mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.backgroundColorEnd = p0.readString();
                         }
                      }else {
                         this.backgroundColorBegin = p0.readString();
                      }
                   }else {
                      this.backgroundColor = p0.readString();
                   }
                }else {
                   this.type = p0.readUInt32();
                }
             }else {
                this.textContent = p0.readString();
             }
          }else {
             this.textColor = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.textColor).equals(str)) {
          p0.writeString(1, this.textColor);
       }
       if (!(this.textContent).equals(str)) {
          p0.writeString(2, this.textContent);
       }
       TopBannerNoticeFeed ttype = this.type;
       if (ttype != null) {
          p0.writeUInt32(3, ttype);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(4, this.backgroundColor);
       }
       if (!(this.backgroundColorBegin).equals(str)) {
          p0.writeString(5, this.backgroundColorBegin);
       }
       if (!(this.backgroundColorEnd).equals(str)) {
          p0.writeString(6, this.backgroundColorEnd);
       }
       super.writeTo(p0);
       return;
    }
}
