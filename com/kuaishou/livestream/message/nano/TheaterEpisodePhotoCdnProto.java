package com.kuaishou.livestream.message.nano.TheaterEpisodePhotoCdnProto;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class TheaterEpisodePhotoCdnProto extends MessageNano	// class@001479
{
    public String cdn;
    public boolean isFreeTrafficCdn;
    public String url;
    public static TheaterEpisodePhotoCdnProto[] _emptyArray;

    public void TheaterEpisodePhotoCdnProto(){
       super();
       this.clear();
    }
    public static TheaterEpisodePhotoCdnProto[] emptyArray(){
       if (TheaterEpisodePhotoCdnProto._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (TheaterEpisodePhotoCdnProto._emptyArray == null) {
             TheaterEpisodePhotoCdnProto[] theaterEpiso = new TheaterEpisodePhotoCdnProto[0];
             TheaterEpisodePhotoCdnProto._emptyArray = theaterEpiso;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return TheaterEpisodePhotoCdnProto._emptyArray;
    }
    public static TheaterEpisodePhotoCdnProto parseFrom(CodedInputByteBufferNano p0){
       return new TheaterEpisodePhotoCdnProto().mergeFrom(p0);
    }
    public static TheaterEpisodePhotoCdnProto parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new TheaterEpisodePhotoCdnProto(), p0);
    }
    public TheaterEpisodePhotoCdnProto clear(){
       this.cdn = "";
       this.url = "";
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
       TheaterEpisodePhotoCdnProto tisFreeTraff = this.isFreeTrafficCdn;
       if (tisFreeTraff != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tisFreeTraff);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public TheaterEpisodePhotoCdnProto mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.isFreeTrafficCdn = p0.readBool();
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
       TheaterEpisodePhotoCdnProto tisFreeTraff = this.isFreeTrafficCdn;
       if (tisFreeTraff != null) {
          p0.writeBool(3, tisFreeTraff);
       }
       super.writeTo(p0);
       return;
    }
}
