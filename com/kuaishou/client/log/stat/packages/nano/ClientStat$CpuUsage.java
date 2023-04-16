package com.kuaishou.client.log.stat.packages.nano.ClientStat$CpuUsage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class ClientStat$CpuUsage extends MessageNano	// class@0013c5
{
    public String process;
    public String[] usage;
    public static ClientStat$CpuUsage[] _emptyArray;

    public void ClientStat$CpuUsage(){
       super();
       this.clear();
    }
    public static ClientStat$CpuUsage[] emptyArray(){
       if (ClientStat$CpuUsage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$CpuUsage._emptyArray == null) {
             ClientStat$CpuUsage[] uCpuUsageArr = new ClientStat$CpuUsage[0];
             ClientStat$CpuUsage._emptyArray = uCpuUsageArr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$CpuUsage._emptyArray;
    }
    public static ClientStat$CpuUsage parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$CpuUsage().mergeFrom(p0);
    }
    public static ClientStat$CpuUsage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$CpuUsage(), p0);
    }
    public ClientStat$CpuUsage clear(){
       this.usage = WireFormatNano.EMPTY_STRING_ARRAY;
       this.process = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientStat$CpuUsage tusage = this.usage;
       if (tusage != null && tusage.length > 0) {
          int i1 = 0;
          int i2 = 0;
          int i3 = 0;
          ClientStat$CpuUsage tusage1 = this.usage;
          while (i1 < tusage1.length) {
             object oobject = tusage1[i1];
             if (oobject != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       if (!(this.process).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.process);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$CpuUsage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.process = p0.readString();
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             ClientStat$CpuUsage tusage = this.usage;
             int i2 = (tusage == null)? 0: tusage.length;
             i = i + i2;
             String[] stringArray = new String[i];
             if (i2) {
                System.arraycopy(tusage, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.usage = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientStat$CpuUsage tusage = this.usage;
       if (tusage != null && tusage.length > 0) {
          int i = 0;
          ClientStat$CpuUsage tusage1 = this.usage;
          while (i < tusage1.length) {
             object oobject = tusage1[i];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.process).equals("")) {
          p0.writeString(2, this.process);
       }
       super.writeTo(p0);
       return;
    }
}
