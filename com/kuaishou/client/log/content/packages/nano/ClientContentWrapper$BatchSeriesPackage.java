package com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$BatchSeriesPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$SeriesPackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContentWrapper$BatchSeriesPackage extends MessageNano	// class@001309
{
    public ClientContentWrapper$SeriesPackage[] seriesPackage;
    public static ClientContentWrapper$BatchSeriesPackage[] _emptyArray;

    public void ClientContentWrapper$BatchSeriesPackage(){
       super();
       this.clear();
    }
    public static ClientContentWrapper$BatchSeriesPackage[] emptyArray(){
       if (ClientContentWrapper$BatchSeriesPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContentWrapper$BatchSeriesPackage._emptyArray == null) {
             ClientContentWrapper$BatchSeriesPackage[] uBatchSeries = new ClientContentWrapper$BatchSeriesPackage[0];
             ClientContentWrapper$BatchSeriesPackage._emptyArray = uBatchSeries;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContentWrapper$BatchSeriesPackage._emptyArray;
    }
    public static ClientContentWrapper$BatchSeriesPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContentWrapper$BatchSeriesPackage().mergeFrom(p0);
    }
    public static ClientContentWrapper$BatchSeriesPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContentWrapper$BatchSeriesPackage(), p0);
    }
    public ClientContentWrapper$BatchSeriesPackage clear(){
       this.seriesPackage = ClientContentWrapper$SeriesPackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContentWrapper$BatchSeriesPackage tseriesPacka = this.seriesPackage;
       if (tseriesPacka != null && tseriesPacka.length > 0) {
          int i1 = 0;
          ClientContentWrapper$BatchSeriesPackage tseriesPacka1 = this.seriesPackage;
          while (i1 < tseriesPacka1.length) {
             object oobject = tseriesPacka1[i1];
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
    public ClientContentWrapper$BatchSeriesPackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContentWrapper$BatchSeriesPackage tseriesPacka = this.seriesPackage;
             int i2 = (tseriesPacka == null)? 0: tseriesPacka.length;
             i = i + i2;
             ClientContentWrapper$SeriesPackage[] seriesPackag = new ClientContentWrapper$SeriesPackage[i];
             if (i2) {
                System.arraycopy(tseriesPacka, 0, seriesPackag, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                seriesPackag[i2] = new ClientContentWrapper$SeriesPackage();
                p0.readMessage(seriesPackag[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             seriesPackag[i2] = new ClientContentWrapper$SeriesPackage();
             p0.readMessage(seriesPackag[i2]);
             this.seriesPackage = seriesPackag;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContentWrapper$BatchSeriesPackage tseriesPacka = this.seriesPackage;
       if (tseriesPacka != null && tseriesPacka.length > 0) {
          int i = 0;
          ClientContentWrapper$BatchSeriesPackage tseriesPacka1 = this.seriesPackage;
          while (i < tseriesPacka1.length) {
             object oobject = tseriesPacka1[i];
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
