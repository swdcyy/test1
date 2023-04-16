package com.kuaishou.livestream.message.nano.LiveStreamMessages$PkPlayerSeasonInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveStreamMessages$PkPlayerSeasonInfo extends MessageNano	// class@001318
{
    public int continueWin;
    public int level;
    public String levelDesc;
    public String levelKey;
    public String nextLevelKey;
    public String nextLevelText;
    public long starCount;
    public static LiveStreamMessages$PkPlayerSeasonInfo[] _emptyArray;

    public void LiveStreamMessages$PkPlayerSeasonInfo(){
       super();
       this.clear();
    }
    public static LiveStreamMessages$PkPlayerSeasonInfo[] emptyArray(){
       if (LiveStreamMessages$PkPlayerSeasonInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveStreamMessages$PkPlayerSeasonInfo._emptyArray == null) {
             LiveStreamMessages$PkPlayerSeasonInfo[] pkPlayerSeas = new LiveStreamMessages$PkPlayerSeasonInfo[0];
             LiveStreamMessages$PkPlayerSeasonInfo._emptyArray = pkPlayerSeas;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveStreamMessages$PkPlayerSeasonInfo._emptyArray;
    }
    public static LiveStreamMessages$PkPlayerSeasonInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveStreamMessages$PkPlayerSeasonInfo().mergeFrom(p0);
    }
    public static LiveStreamMessages$PkPlayerSeasonInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveStreamMessages$PkPlayerSeasonInfo(), p0);
    }
    public LiveStreamMessages$PkPlayerSeasonInfo clear(){
       this.starCount = 0;
       this.levelKey = "";
       this.nextLevelText = "";
       this.continueWin = 0;
       this.levelDesc = "";
       this.level = 0;
       this.nextLevelKey = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LiveStreamMessages$PkPlayerSeasonInfo tstarCount = this.starCount;
       if (tstarCount - null) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tstarCount);
       }
       String str = "";
       if (!(this.levelKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.levelKey);
       }
       if (!(this.nextLevelText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.nextLevelText);
       }
       tstarCount = this.continueWin;
       if (tstarCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tstarCount);
       }
       if (!(this.levelDesc).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.levelDesc);
       }
       tstarCount = this.level;
       if (tstarCount != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tstarCount);
       }
       if (!(this.nextLevelKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.nextLevelKey);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveStreamMessages$PkPlayerSeasonInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 58) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               this.nextLevelKey = p0.readString();
                            }
                         }else {
                            this.level = p0.readUInt32();
                         }
                      }else {
                         this.levelDesc = p0.readString();
                      }
                   }else {
                      this.continueWin = p0.readUInt32();
                   }
                }else {
                   this.nextLevelText = p0.readString();
                }
             }else {
                this.levelKey = p0.readString();
             }
          }else {
             this.starCount = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LiveStreamMessages$PkPlayerSeasonInfo tstarCount = this.starCount;
       if (tstarCount - null) {
          p0.writeUInt64(1, tstarCount);
       }
       String str = "";
       if (!(this.levelKey).equals(str)) {
          p0.writeString(2, this.levelKey);
       }
       if (!(this.nextLevelText).equals(str)) {
          p0.writeString(3, this.nextLevelText);
       }
       tstarCount = this.continueWin;
       if (tstarCount != null) {
          p0.writeUInt32(4, tstarCount);
       }
       if (!(this.levelDesc).equals(str)) {
          p0.writeString(5, this.levelDesc);
       }
       tstarCount = this.level;
       if (tstarCount != null) {
          p0.writeUInt32(6, tstarCount);
       }
       if (!(this.nextLevelKey).equals(str)) {
          p0.writeString(7, this.nextLevelKey);
       }
       super.writeTo(p0);
       return;
    }
}
