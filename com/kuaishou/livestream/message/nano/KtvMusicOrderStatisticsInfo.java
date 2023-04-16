package com.kuaishou.livestream.message.nano.KtvMusicOrderStatisticsInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class KtvMusicOrderStatisticsInfo extends MessageNano	// class@0010be
{
    public String displayMusicOrderUserCount;
    public long musicOrderCount;
    public long musicOrderUserCount;
    public static KtvMusicOrderStatisticsInfo[] _emptyArray;

    public void KtvMusicOrderStatisticsInfo(){
       super();
       this.clear();
    }
    public static KtvMusicOrderStatisticsInfo[] emptyArray(){
       if (KtvMusicOrderStatisticsInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (KtvMusicOrderStatisticsInfo._emptyArray == null) {
             KtvMusicOrderStatisticsInfo[] ktvMusicOrde = new KtvMusicOrderStatisticsInfo[0];
             KtvMusicOrderStatisticsInfo._emptyArray = ktvMusicOrde;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return KtvMusicOrderStatisticsInfo._emptyArray;
    }
    public static KtvMusicOrderStatisticsInfo parseFrom(CodedInputByteBufferNano p0){
       return new KtvMusicOrderStatisticsInfo().mergeFrom(p0);
    }
    public static KtvMusicOrderStatisticsInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new KtvMusicOrderStatisticsInfo(), p0);
    }
    public KtvMusicOrderStatisticsInfo clear(){
       this.musicOrderUserCount = 0;
       this.displayMusicOrderUserCount = "";
       this.musicOrderCount = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       KtvMusicOrderStatisticsInfo tmusicOrderU = this.musicOrderUserCount;
       int i1 = 0;
       if (tmusicOrderU - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tmusicOrderU);
       }
       if (!(this.displayMusicOrderUserCount).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.displayMusicOrderUserCount);
       }
       tmusicOrderU = this.musicOrderCount;
       if (tmusicOrderU - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tmusicOrderU);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public KtvMusicOrderStatisticsInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.musicOrderCount = p0.readUInt64();
                }
             }else {
                this.displayMusicOrderUserCount = p0.readString();
             }
          }else {
             this.musicOrderUserCount = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       KtvMusicOrderStatisticsInfo tmusicOrderU = this.musicOrderUserCount;
       int i = 0;
       if (tmusicOrderU - i) {
          p0.writeUInt64(1, tmusicOrderU);
       }
       if (!(this.displayMusicOrderUserCount).equals("")) {
          p0.writeString(2, this.displayMusicOrderUserCount);
       }
       tmusicOrderU = this.musicOrderCount;
       if (tmusicOrderU - i) {
          p0.writeUInt64(3, tmusicOrderU);
       }
       super.writeTo(p0);
       return;
    }
}
