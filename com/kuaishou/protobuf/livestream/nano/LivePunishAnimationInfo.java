package com.kuaishou.protobuf.livestream.nano.LivePunishAnimationInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePunishAnimationInfo extends MessageNano	// class@000cd3
{
    public int maxPercent;
    public int minPercent;
    public String punishAnimationResource;
    public String punishDefaultResource;
    public static LivePunishAnimationInfo[] _emptyArray;

    public void LivePunishAnimationInfo(){
       super();
       this.clear();
    }
    public static LivePunishAnimationInfo[] emptyArray(){
       if (LivePunishAnimationInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePunishAnimationInfo._emptyArray == null) {
             LivePunishAnimationInfo[] livePunishAn = new LivePunishAnimationInfo[0];
             LivePunishAnimationInfo._emptyArray = livePunishAn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePunishAnimationInfo._emptyArray;
    }
    public static LivePunishAnimationInfo parseFrom(CodedInputByteBufferNano p0){
       return new LivePunishAnimationInfo().mergeFrom(p0);
    }
    public static LivePunishAnimationInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePunishAnimationInfo(), p0);
    }
    public LivePunishAnimationInfo clear(){
       this.minPercent = 0;
       this.maxPercent = 0;
       this.punishAnimationResource = "";
       this.punishDefaultResource = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePunishAnimationInfo tminPercent = this.minPercent;
       if (tminPercent != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(1, tminPercent);
       }
       tminPercent = this.maxPercent;
       if (tminPercent != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(2, tminPercent);
       }
       String str = "";
       if (!(this.punishAnimationResource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.punishAnimationResource);
       }
       if (!(this.punishDefaultResource).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.punishDefaultResource);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePunishAnimationInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.punishDefaultResource = p0.readString();
                   }
                }else {
                   this.punishAnimationResource = p0.readString();
                }
             }else {
                this.maxPercent = p0.readUInt32();
             }
          }else {
             this.minPercent = p0.readUInt32();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePunishAnimationInfo tminPercent = this.minPercent;
       if (tminPercent != null) {
          p0.writeUInt32(1, tminPercent);
       }
       tminPercent = this.maxPercent;
       if (tminPercent != null) {
          p0.writeUInt32(2, tminPercent);
       }
       String str = "";
       if (!(this.punishAnimationResource).equals(str)) {
          p0.writeString(3, this.punishAnimationResource);
       }
       if (!(this.punishDefaultResource).equals(str)) {
          p0.writeString(4, this.punishDefaultResource);
       }
       super.writeTo(p0);
       return;
    }
}
