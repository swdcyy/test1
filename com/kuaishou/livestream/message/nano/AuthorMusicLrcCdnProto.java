package com.kuaishou.livestream.message.nano.AuthorMusicLrcCdnProto;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class AuthorMusicLrcCdnProto extends MessageNano	// class@001097
{
    public String cdn;
    public String ip;
    public boolean isFreeTrafficCdn;
    public String url;
    public String urlPattern;
    public static AuthorMusicLrcCdnProto[] _emptyArray;

    public void AuthorMusicLrcCdnProto(){
       super();
       this.clear();
    }
    public static AuthorMusicLrcCdnProto[] emptyArray(){
       if (AuthorMusicLrcCdnProto._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (AuthorMusicLrcCdnProto._emptyArray == null) {
             AuthorMusicLrcCdnProto[] uAuthorMusic = new AuthorMusicLrcCdnProto[0];
             AuthorMusicLrcCdnProto._emptyArray = uAuthorMusic;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return AuthorMusicLrcCdnProto._emptyArray;
    }
    public static AuthorMusicLrcCdnProto parseFrom(CodedInputByteBufferNano p0){
       return new AuthorMusicLrcCdnProto().mergeFrom(p0);
    }
    public static AuthorMusicLrcCdnProto parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new AuthorMusicLrcCdnProto(), p0);
    }
    public AuthorMusicLrcCdnProto clear(){
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
       AuthorMusicLrcCdnProto tisFreeTraff = this.isFreeTrafficCdn;
       if (tisFreeTraff != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tisFreeTraff);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public AuthorMusicLrcCdnProto mergeFrom(CodedInputByteBufferNano p0){
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
       AuthorMusicLrcCdnProto tisFreeTraff = this.isFreeTrafficCdn;
       if (tisFreeTraff != null) {
          p0.writeBool(5, tisFreeTraff);
       }
       super.writeTo(p0);
       return;
    }
}
