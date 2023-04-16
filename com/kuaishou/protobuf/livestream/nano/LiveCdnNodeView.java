package com.kuaishou.protobuf.livestream.nano.LiveCdnNodeView;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCdnNodeView extends MessageNano	// class@000c42
{
    public String cdn;
    public boolean freeTraffic;
    public String url;
    public static LiveCdnNodeView[] _emptyArray;

    public void LiveCdnNodeView(){
       super();
       this.clear();
    }
    public static LiveCdnNodeView[] emptyArray(){
       if (LiveCdnNodeView._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCdnNodeView._emptyArray == null) {
             LiveCdnNodeView[] liveCdnNodeV = new LiveCdnNodeView[0];
             LiveCdnNodeView._emptyArray = liveCdnNodeV;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCdnNodeView._emptyArray;
    }
    public static LiveCdnNodeView parseFrom(CodedInputByteBufferNano p0){
       return new LiveCdnNodeView().mergeFrom(p0);
    }
    public static LiveCdnNodeView parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCdnNodeView(), p0);
    }
    public LiveCdnNodeView clear(){
       this.cdn = "";
       this.url = "";
       this.freeTraffic = false;
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
       LiveCdnNodeView tfreeTraffic = this.freeTraffic;
       if (tfreeTraffic != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tfreeTraffic);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCdnNodeView mergeFrom(CodedInputByteBufferNano p0){
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
                   this.freeTraffic = p0.readBool();
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
       LiveCdnNodeView tfreeTraffic = this.freeTraffic;
       if (tfreeTraffic != null) {
          p0.writeBool(3, tfreeTraffic);
       }
       super.writeTo(p0);
       return;
    }
}
