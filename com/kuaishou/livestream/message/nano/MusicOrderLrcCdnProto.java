package com.kuaishou.livestream.message.nano.MusicOrderLrcCdnProto;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class MusicOrderLrcCdnProto extends MessageNano	// class@0013de
{
    public String cdn;
    public String ip;
    public boolean isFreeTrafficCdn;
    public String url;
    public String urlPattern;
    public static MusicOrderLrcCdnProto[] _emptyArray;

    public void MusicOrderLrcCdnProto(){
       super();
       this.clear();
    }
    public static MusicOrderLrcCdnProto[] emptyArray(){
       if (MusicOrderLrcCdnProto._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (MusicOrderLrcCdnProto._emptyArray == null) {
             MusicOrderLrcCdnProto[] musicOrderLr = new MusicOrderLrcCdnProto[0];
             MusicOrderLrcCdnProto._emptyArray = musicOrderLr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return MusicOrderLrcCdnProto._emptyArray;
    }
    public static MusicOrderLrcCdnProto parseFrom(CodedInputByteBufferNano p0){
       return new MusicOrderLrcCdnProto().mergeFrom(p0);
    }
    public static MusicOrderLrcCdnProto parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new MusicOrderLrcCdnProto(), p0);
    }
    public MusicOrderLrcCdnProto clear(){
       this.cdn = "";
       this.url = "";
       this.ip = "";
       this.urlPattern = "";
       this.isFreeTrafficCdn = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.cdn).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.url);
       }
       if (!(this.ip).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.ip);
       }
       if (!(this.urlPattern).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.urlPattern);
       }
       MusicOrderLrcCdnProto tisFreeTraff = this.isFreeTrafficCdn;
       if (tisFreeTraff != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tisFreeTraff);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public MusicOrderLrcCdnProto mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 40) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.isFreeTrafficCdn = p0.readBool();
                      }
                   }else {
                      this.urlPattern = p0.readString();
                   }
                }else {
                   this.ip = p0.readString();
                }
             }else {
                this.url = p0.readString();
             }
          }else {
             this.cdn = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.cdn).equals(str)) {
          p0.writeString(1, this.cdn);
       }
       if (!(this.url).equals(str)) {
          p0.writeString(2, this.url);
       }
       if (!(this.ip).equals(str)) {
          p0.writeString(3, this.ip);
       }
       if (!(this.urlPattern).equals(str)) {
          p0.writeString(4, this.urlPattern);
       }
       MusicOrderLrcCdnProto tisFreeTraff = this.isFreeTrafficCdn;
       if (tisFreeTraff != null) {
          p0.writeBool(5, tisFreeTraff);
       }
       super.writeTo(p0);
       return;
    }
}
