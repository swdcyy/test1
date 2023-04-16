package com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowPage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.log.realshow.nano.CoverShowLogs$CoverShowFeed;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class CoverShowLogs$CoverShowPage extends MessageNano	// class@0014a5
{
    public CoverShowLogs$CoverShowFeed[] feed;
    public long llsid;
    public long llsidFirstPage;
    public static CoverShowLogs$CoverShowPage[] _emptyArray;

    public void CoverShowLogs$CoverShowPage(){
       super();
       this.clear();
    }
    public static CoverShowLogs$CoverShowPage[] emptyArray(){
       if (CoverShowLogs$CoverShowPage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (CoverShowLogs$CoverShowPage._emptyArray == null) {
             CoverShowLogs$CoverShowPage[] uCoverShowPa = new CoverShowLogs$CoverShowPage[0];
             CoverShowLogs$CoverShowPage._emptyArray = uCoverShowPa;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return CoverShowLogs$CoverShowPage._emptyArray;
    }
    public static CoverShowLogs$CoverShowPage parseFrom(CodedInputByteBufferNano p0){
       return new CoverShowLogs$CoverShowPage().mergeFrom(p0);
    }
    public static CoverShowLogs$CoverShowPage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new CoverShowLogs$CoverShowPage(), p0);
    }
    public CoverShowLogs$CoverShowPage clear(){
       this.llsid = 0;
       this.feed = CoverShowLogs$CoverShowFeed.emptyArray();
       this.llsidFirstPage = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       CoverShowLogs$CoverShowPage tllsid = this.llsid;
       int i1 = 0;
       if (tllsid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(1, tllsid);
       }
       tllsid = this.feed;
       if (tllsid != null && tllsid.length > 0) {
          int i2 = 0;
          CoverShowLogs$CoverShowPage tuCoverShowP = this.feed;
          while (i2 < tuCoverShowP.length) {
             object oobject = tuCoverShowP[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(2, oobject);
             }
             i2 = i2 + 1;
          }
       }
       tllsid = this.llsidFirstPage;
       if (tllsid - i1) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(3, tllsid);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public CoverShowLogs$CoverShowPage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             int i1 = 18;
             if (i != i1) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.llsidFirstPage = p0.readUInt64();
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                CoverShowLogs$CoverShowPage tuCoverShowP = this.feed;
                int i2 = (tuCoverShowP == null)? 0: tuCoverShowP.length;
                i = i + i2;
                CoverShowLogs$CoverShowFeed[] uCoverShowFe = new CoverShowLogs$CoverShowFeed[i];
                if (i2) {
                   System.arraycopy(tuCoverShowP, 0, uCoverShowFe, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCoverShowFe[i2] = new CoverShowLogs$CoverShowFeed();
                   p0.readMessage(uCoverShowFe[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCoverShowFe[i2] = new CoverShowLogs$CoverShowFeed();
                p0.readMessage(uCoverShowFe[i2]);
                this.feed = uCoverShowFe;
             }
          }else {
             this.llsid = p0.readUInt64();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       CoverShowLogs$CoverShowPage tllsid = this.llsid;
       int i = 0;
       if (tllsid - i) {
          p0.writeUInt64(1, tllsid);
       }
       tllsid = this.feed;
       if (tllsid != null && tllsid.length > 0) {
          int i1 = 0;
          CoverShowLogs$CoverShowPage tuCoverShowP = this.feed;
          while (i1 < tuCoverShowP.length) {
             object oobject = tuCoverShowP[i1];
             if (oobject != null) {
                p0.writeMessage(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tllsid = this.llsidFirstPage;
       if (tllsid - i) {
          p0.writeUInt64(3, tllsid);
       }
       super.writeTo(p0);
       return;
    }
}
