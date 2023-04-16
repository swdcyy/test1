package com.kuaishou.protobuf.gamezone.nano.SCGzoneRevenuePK;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.gamezone.nano.GzoneRevenuePKPlayer;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;

public final class SCGzoneRevenuePK extends MessageNano	// class@000bdd
{
    public long displayDurationMillis;
    public String lottieUrl;
    public GzoneRevenuePKPlayer[] player;
    public static SCGzoneRevenuePK[] _emptyArray;

    public void SCGzoneRevenuePK(){
       super();
       this.clear();
    }
    public static SCGzoneRevenuePK[] emptyArray(){
       if (SCGzoneRevenuePK._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCGzoneRevenuePK._emptyArray == null) {
             SCGzoneRevenuePK[] sCGzoneReven = new SCGzoneRevenuePK[0];
             SCGzoneRevenuePK._emptyArray = sCGzoneReven;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCGzoneRevenuePK._emptyArray;
    }
    public static SCGzoneRevenuePK parseFrom(CodedInputByteBufferNano p0){
       return new SCGzoneRevenuePK().mergeFrom(p0);
    }
    public static SCGzoneRevenuePK parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCGzoneRevenuePK(), p0);
    }
    public SCGzoneRevenuePK clear(){
       this.player = GzoneRevenuePKPlayer.emptyArray();
       this.displayDurationMillis = 0;
       this.lottieUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCGzoneRevenuePK tplayer = this.player;
       if (tplayer != null && tplayer.length > 0) {
          int i1 = 0;
          SCGzoneRevenuePK tplayer1 = this.player;
          while (i1 < tplayer1.length) {
             object oobject = tplayer1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tplayer = this.displayDurationMillis;
       if (tplayer) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(2, tplayer);
       }
       if (!(this.lottieUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.lottieUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCGzoneRevenuePK mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 16) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.lottieUrl = p0.readString();
                }
             }else {
                this.displayDurationMillis = p0.readUInt64();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             SCGzoneRevenuePK tplayer = this.player;
             int i2 = (tplayer == null)? 0: tplayer.length;
             i = i + i2;
             GzoneRevenuePKPlayer[] gzoneRevenue = new GzoneRevenuePKPlayer[i];
             if (i2) {
                System.arraycopy(tplayer, 0, gzoneRevenue, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                gzoneRevenue[i2] = new GzoneRevenuePKPlayer();
                p0.readMessage(gzoneRevenue[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             gzoneRevenue[i2] = new GzoneRevenuePKPlayer();
             p0.readMessage(gzoneRevenue[i2]);
             this.player = gzoneRevenue;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCGzoneRevenuePK tplayer = this.player;
       if (tplayer != null && tplayer.length > 0) {
          int i = 0;
          SCGzoneRevenuePK tplayer1 = this.player;
          while (i < tplayer1.length) {
             object oobject = tplayer1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       tplayer = this.displayDurationMillis;
       if (tplayer) {
          p0.writeUInt64(2, tplayer);
       }
       if (!(this.lottieUrl).equals("")) {
          p0.writeString(3, this.lottieUrl);
       }
       super.writeTo(p0);
       return;
    }
}
