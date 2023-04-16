package com.kuaishou.livestream.message.nano.LiveStreamMessages$LiveDistrictDisplayRankHintInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$LiveDistrictDisplayRankHintInfo extends MessageNano	// class@0012f4
{
    public String displayRankHintContent;
    public String displayRankHintTitle;
    public static LiveStreamMessages$LiveDistrictDisplayRankHintInfo[] _emptyArray;

    public void LiveStreamMessages$LiveDistrictDisplayRankHintInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$LiveDistrictDisplayRankHintInfo[] emptyArray(){
       if (LiveStreamMessages$LiveDistrictDisplayRankHintInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$LiveDistrictDisplayRankHintInfo._emptyArray == null) {
             LiveStreamMessages$LiveDistrictDisplayRankHintInfo[] liveDistrict = new LiveStreamMessages$LiveDistrictDisplayRankHintInfo[0];
             LiveStreamMessages$LiveDistrictDisplayRankHintInfo._emptyArray = liveDistrict;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$LiveDistrictDisplayRankHintInfo._emptyArray;
    }
    public static LiveStreamMessages$LiveDistrictDisplayRankHintInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$LiveDistrictDisplayRankHintInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$LiveDistrictDisplayRankHintInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$LiveDistrictDisplayRankHintInfo(), p0);
    }
    public LiveStreamMessages$LiveDistrictDisplayRankHintInfo clear(){
       this.displayRankHintTitle = "";
       this.displayRankHintContent = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.displayRankHintTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.displayRankHintTitle);
       }
       if (!(this.displayRankHintContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayRankHintContent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$LiveDistrictDisplayRankHintInfo mergeFrom(CodedInputByteBufferNano p0){
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
                this.displayRankHintContent = p0.readString();
             }
          }else {
             this.displayRankHintTitle = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.displayRankHintTitle).equals(str)) {
          p0.writeString(1, this.displayRankHintTitle);
       }
       if (!(this.displayRankHintContent).equals(str)) {
          p0.writeString(2, this.displayRankHintContent);
       }
       super.writeTo(p0);
       return;
    }
}
