package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchSeriesPackageV2;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SeriesPackageV2;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchSeriesPackageV2 extends MessageNano	// class@001216
{
    public ClientContent$SeriesPackageV2[] seriesPackage;
    public static ClientContent$BatchSeriesPackageV2[] _emptyArray;

    public void ClientContent$BatchSeriesPackageV2(){
       super();
       this.clear();
    }
    public static ClientContent$BatchSeriesPackageV2[] emptyArray(){
       if (ClientContent$BatchSeriesPackageV2._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchSeriesPackageV2._emptyArray == null) {
             ClientContent$BatchSeriesPackageV2[] uBatchSeries = new ClientContent$BatchSeriesPackageV2[0];
             ClientContent$BatchSeriesPackageV2._emptyArray = uBatchSeries;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchSeriesPackageV2._emptyArray;
    }
    public static ClientContent$BatchSeriesPackageV2 parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchSeriesPackageV2().mergeFrom(p0);
    }
    public static ClientContent$BatchSeriesPackageV2 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchSeriesPackageV2(), p0);
    }
    public ClientContent$BatchSeriesPackageV2 clear(){
       this.seriesPackage = ClientContent$SeriesPackageV2.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchSeriesPackageV2 tseriesPacka = this.seriesPackage;
       if (tseriesPacka != null && tseriesPacka.length > 0) {
          int i1 = 0;
          ClientContent$BatchSeriesPackageV2 tseriesPacka1 = this.seriesPackage;
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
    public ClientContent$BatchSeriesPackageV2 mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchSeriesPackageV2 tseriesPacka = this.seriesPackage;
             int i2 = (tseriesPacka == null)? 0: tseriesPacka.length;
             i = i + i2;
             ClientContent$SeriesPackageV2[] seriesPackag = new ClientContent$SeriesPackageV2[i];
             if (i2) {
                System.arraycopy(tseriesPacka, 0, seriesPackag, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                seriesPackag[i2] = new ClientContent$SeriesPackageV2();
                p0.readMessage(seriesPackag[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             seriesPackag[i2] = new ClientContent$SeriesPackageV2();
             p0.readMessage(seriesPackag[i2]);
             this.seriesPackage = seriesPackag;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchSeriesPackageV2 tseriesPacka = this.seriesPackage;
       if (tseriesPacka != null && tseriesPacka.length > 0) {
          int i = 0;
          ClientContent$BatchSeriesPackageV2 tseriesPacka1 = this.seriesPackage;
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
