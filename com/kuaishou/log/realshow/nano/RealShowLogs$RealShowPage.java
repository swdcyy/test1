package com.kuaishou.log.realshow.nano.RealShowLogs$RealShowPage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.RealShowLogs$RealShowFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class RealShowLogs$RealShowPage extends MessageNano	// class@0014b4
{
    public RealShowLogs$RealShowFeed[] feed;
    public long llsid;
    public static RealShowLogs$RealShowPage[] _emptyArray;

    public void RealShowLogs$RealShowPage(){
       super();
       this.clear();
    }
    public static RealShowLogs$RealShowPage[] emptyArray(){
       if (RealShowLogs$RealShowPage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (RealShowLogs$RealShowPage._emptyArray == null) {
             RealShowLogs$RealShowPage[] realShowPage = new RealShowLogs$RealShowPage[0];
             RealShowLogs$RealShowPage._emptyArray = realShowPage;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return RealShowLogs$RealShowPage._emptyArray;
    }
    public static RealShowLogs$RealShowPage parseFrom(CodedInputByteBufferNano p0){
       return new RealShowLogs$RealShowPage().mergeFrom(p0);
    }
    public static RealShowLogs$RealShowPage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new RealShowLogs$RealShowPage(), p0);
    }
    public RealShowLogs$RealShowPage clear(){
       this.llsid = 0;
       this.feed = RealShowLogs$RealShowFeed.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       RealShowLogs$RealShowPage tllsid = this.llsid;
       if (tllsid) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tllsid);
       }
       tllsid = this.feed;
       if (tllsid != null && tllsid.length > 0) {
          int i1 = 0;
          RealShowLogs$RealShowPage tRealShowPag = this.feed;
          while (i1 < tRealShowPag.length) {
             object oobject = tRealShowPag[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public RealShowLogs$RealShowPage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                RealShowLogs$RealShowPage tRealShowPag = this.feed;
                int i2 = (tRealShowPag == null)? 0: tRealShowPag.length;
                i = i + i2;
                RealShowLogs$RealShowFeed[] realShowFeed = new RealShowLogs$RealShowFeed[i];
                if (i2) {
                   System.arraycopy(tRealShowPag, 0, realShowFeed, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   realShowFeed[i2] = new RealShowLogs$RealShowFeed();
                   p0.readMessage(realShowFeed[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                realShowFeed[i2] = new RealShowLogs$RealShowFeed();
                p0.readMessage(realShowFeed[i2]);
                this.feed = realShowFeed;
             }
          }else {
             this.llsid = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       RealShowLogs$RealShowPage tllsid = this.llsid;
       if (tllsid) {
          p0.writeUInt64(1, tllsid);
       }
       tllsid = this.feed;
       if (tllsid != null && tllsid.length > 0) {
          int i = 0;
          RealShowLogs$RealShowPage tRealShowPag = this.feed;
          while (i < tRealShowPag.length) {
             object oobject = tRealShowPag[i];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
