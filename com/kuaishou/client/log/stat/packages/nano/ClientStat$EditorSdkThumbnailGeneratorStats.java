package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkThumbnailGeneratorStats;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkThumbnailGeneratorUnitStats;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$EditorSdkThumbnailGeneratorStats extends MessageNano	// class@0013dc
{
    public ClientStat$EditorSdkThumbnailGeneratorUnitStats[] thumbnailUnitStats;
    public static ClientStat$EditorSdkThumbnailGeneratorStats[] _emptyArray;

    public void ClientStat$EditorSdkThumbnailGeneratorStats(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkThumbnailGeneratorStats[] emptyArray(){
       if (ClientStat$EditorSdkThumbnailGeneratorStats._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkThumbnailGeneratorStats._emptyArray == null) {
             ClientStat$EditorSdkThumbnailGeneratorStats[] uEditorSdkTh = new ClientStat$EditorSdkThumbnailGeneratorStats[0];
             ClientStat$EditorSdkThumbnailGeneratorStats._emptyArray = uEditorSdkTh;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkThumbnailGeneratorStats._emptyArray;
    }
    public static ClientStat$EditorSdkThumbnailGeneratorStats parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkThumbnailGeneratorStats().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkThumbnailGeneratorStats parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkThumbnailGeneratorStats(), p0);
    }
    public ClientStat$EditorSdkThumbnailGeneratorStats clear(){
       this.thumbnailUnitStats = ClientStat$EditorSdkThumbnailGeneratorUnitStats.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$EditorSdkThumbnailGeneratorStats tthumbnailUn = this.thumbnailUnitStats;
       if (tthumbnailUn != null && tthumbnailUn.length > 0) {
          int i1 = 0;
          ClientStat$EditorSdkThumbnailGeneratorStats tthumbnailUn1 = this.thumbnailUnitStats;
          while (i1 < tthumbnailUn1.length) {
             object oobject = tthumbnailUn1[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkThumbnailGeneratorStats mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (!WireFormatNano.parseUnknownField(p0, i)) {
                break ;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientStat$EditorSdkThumbnailGeneratorStats tthumbnailUn = this.thumbnailUnitStats;
             int i2 = (tthumbnailUn == null)? 0: tthumbnailUn.length;
             i = i + i2;
             ClientStat$EditorSdkThumbnailGeneratorUnitStats[] uEditorSdkTh = new ClientStat$EditorSdkThumbnailGeneratorUnitStats[i];
             if (i2) {
                System.arraycopy(tthumbnailUn, 0, uEditorSdkTh, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                uEditorSdkTh[i2] = new ClientStat$EditorSdkThumbnailGeneratorUnitStats();
                p0.readMessage(uEditorSdkTh[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             uEditorSdkTh[i2] = new ClientStat$EditorSdkThumbnailGeneratorUnitStats();
             p0.readMessage(uEditorSdkTh[i2]);
             this.thumbnailUnitStats = uEditorSdkTh;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$EditorSdkThumbnailGeneratorStats tthumbnailUn = this.thumbnailUnitStats;
       if (tthumbnailUn != null && tthumbnailUn.length > 0) {
          int i = 0;
          ClientStat$EditorSdkThumbnailGeneratorStats tthumbnailUn1 = this.thumbnailUnitStats;
          while (i < tthumbnailUn1.length) {
             object oobject = tthumbnailUn1[i];
             if (oobject != null) {
                p0.writeMessage(1, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
