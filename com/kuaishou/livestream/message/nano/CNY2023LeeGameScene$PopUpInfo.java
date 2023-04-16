package com.kuaishou.livestream.message.nano.CNY2023LeeGameScene$PopUpInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class CNY2023LeeGameScene$PopUpInfo extends MessageNano	// class@00109c
{
    public String fixContent;
    public long rankSize;
    public long rankTotalAward;
    public String routeUrl;
    public long singleRedPacketAssists;
    public long singleRedPacketAward;
    public int taskType;
    public static CNY2023LeeGameScene$PopUpInfo[] _emptyArray;

    public void CNY2023LeeGameScene$PopUpInfo(){
       super();
       this.clear();
    }
    public static CNY2023LeeGameScene$PopUpInfo[] emptyArray(){
       if (CNY2023LeeGameScene$PopUpInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CNY2023LeeGameScene$PopUpInfo._emptyArray == null) {
             CNY2023LeeGameScene$PopUpInfo[] popUpInfoArr = new CNY2023LeeGameScene$PopUpInfo[0];
             CNY2023LeeGameScene$PopUpInfo._emptyArray = popUpInfoArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CNY2023LeeGameScene$PopUpInfo._emptyArray;
    }
    public static CNY2023LeeGameScene$PopUpInfo parseFrom(CodedInputByteBufferNano p0){
       return new CNY2023LeeGameScene$PopUpInfo().mergeFrom(p0);
    }
    public static CNY2023LeeGameScene$PopUpInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CNY2023LeeGameScene$PopUpInfo(), p0);
    }
    public CNY2023LeeGameScene$PopUpInfo clear(){
       this.routeUrl = "";
       this.rankSize = 0;
       this.rankTotalAward = 0;
       this.fixContent = "";
       this.singleRedPacketAssists = 0;
       this.singleRedPacketAward = 0;
       this.taskType = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.routeUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.routeUrl);
       }
       CNY2023LeeGameScene$PopUpInfo trankSize = this.rankSize;
       if (trankSize) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, trankSize);
       }
       trankSize = this.rankTotalAward;
       if (trankSize) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(3, trankSize);
       }
       if (!(this.fixContent).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.fixContent);
       }
       CNY2023LeeGameScene$PopUpInfo tsingleRedPa = this.singleRedPacketAssists;
       if (tsingleRedPa) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(5, tsingleRedPa);
       }
       tsingleRedPa = this.singleRedPacketAward;
       if (tsingleRedPa) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(6, tsingleRedPa);
       }
       tsingleRedPa = this.taskType;
       if (tsingleRedPa != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tsingleRedPa);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CNY2023LeeGameScene$PopUpInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && i != 1) {
                                  continue ;
                               }else {
                                  this.taskType = i;
                               }
                            }
                         }else {
                            this.singleRedPacketAward = p0.readInt64();
                         }
                      }else {
                         this.singleRedPacketAssists = p0.readInt64();
                      }
                   }else {
                      this.fixContent = p0.readString();
                   }
                }else {
                   this.rankTotalAward = p0.readInt64();
                }
             }else {
                this.rankSize = p0.readInt64();
             }
          }else {
             this.routeUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.routeUrl).equals(str)) {
          p0.writeString(1, this.routeUrl);
       }
       CNY2023LeeGameScene$PopUpInfo trankSize = this.rankSize;
       if (trankSize) {
          p0.writeInt64(2, trankSize);
       }
       trankSize = this.rankTotalAward;
       if (trankSize) {
          p0.writeInt64(3, trankSize);
       }
       if (!(this.fixContent).equals(str)) {
          p0.writeString(4, this.fixContent);
       }
       CNY2023LeeGameScene$PopUpInfo tsingleRedPa = this.singleRedPacketAssists;
       if (tsingleRedPa) {
          p0.writeInt64(5, tsingleRedPa);
       }
       tsingleRedPa = this.singleRedPacketAward;
       if (tsingleRedPa) {
          p0.writeInt64(6, tsingleRedPa);
       }
       tsingleRedPa = this.taskType;
       if (tsingleRedPa != null) {
          p0.writeInt32(7, tsingleRedPa);
       }
       super.writeTo(p0);
       return;
    }
}
