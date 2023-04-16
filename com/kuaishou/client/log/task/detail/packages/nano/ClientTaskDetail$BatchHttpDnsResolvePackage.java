package com.kuaishou.client.log.task.detail.packages.nano.ClientTaskDetail$BatchHttpDnsResolvePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.System;

public final class ClientTaskDetail$BatchHttpDnsResolvePackage extends MessageNano	// class@00144f
{
    public String[] domain;
    public boolean enableCrossPlatform;
    public String[] existedDomain;
    public String[] inputDomain;
    public String networkId;
    public static ClientTaskDetail$BatchHttpDnsResolvePackage[] _emptyArray;

    public void ClientTaskDetail$BatchHttpDnsResolvePackage(){
       super();
       this.clear();
    }
    public static ClientTaskDetail$BatchHttpDnsResolvePackage[] emptyArray(){
       if (ClientTaskDetail$BatchHttpDnsResolvePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientTaskDetail$BatchHttpDnsResolvePackage._emptyArray == null) {
             ClientTaskDetail$BatchHttpDnsResolvePackage[] uBatchHttpDn = new ClientTaskDetail$BatchHttpDnsResolvePackage[0];
             ClientTaskDetail$BatchHttpDnsResolvePackage._emptyArray = uBatchHttpDn;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientTaskDetail$BatchHttpDnsResolvePackage._emptyArray;
    }
    public static ClientTaskDetail$BatchHttpDnsResolvePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientTaskDetail$BatchHttpDnsResolvePackage().mergeFrom(p0);
    }
    public static ClientTaskDetail$BatchHttpDnsResolvePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientTaskDetail$BatchHttpDnsResolvePackage(), p0);
    }
    public ClientTaskDetail$BatchHttpDnsResolvePackage clear(){
       String[] eMPTY_STRING = WireFormatNano.EMPTY_STRING_ARRAY;
       this.inputDomain = eMPTY_STRING;
       this.existedDomain = eMPTY_STRING;
       this.domain = eMPTY_STRING;
       this.enableCrossPlatform = false;
       this.networkId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       int i3;
       int i4;
       ClientTaskDetail$BatchHttpDnsResolvePackage tinputDomain1;
       object oobject;
       int i = super.computeSerializedSize();
       ClientTaskDetail$BatchHttpDnsResolvePackage tinputDomain = this.inputDomain;
       int i1 = 0;
       if (tinputDomain != null && tinputDomain.length > 0) {
          i2 = 0;
          i3 = 0;
          i4 = 0;
          tinputDomain1 = this.inputDomain;
          while (i2 < tinputDomain1.length) {
             oobject = tinputDomain1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tinputDomain = this.existedDomain;
       if (tinputDomain != null && tinputDomain.length > 0) {
          i2 = 0;
          i3 = 0;
          i4 = 0;
          tinputDomain1 = this.existedDomain;
          while (i2 < tinputDomain1.length) {
             oobject = tinputDomain1[i2];
             if (oobject != null) {
                i4 = i4 + 1;
                i3 = i3 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject);
             }
             i2 = i2 + 1;
          }
          i = (i + i3) + (i4 * 1);
       }
       tinputDomain = this.domain;
       if (tinputDomain != null && tinputDomain.length > 0) {
          i2 = 0;
          i3 = 0;
          ClientTaskDetail$BatchHttpDnsResolvePackage tdomain = this.domain;
          while (i1 < tdomain.length) {
             object oobject1 = tdomain[i1];
             if (oobject1 != null) {
                i3 = i3 + 1;
                i2 = i2 + CodedOutputByteBufferNano.computeStringSizeNoTag(oobject1);
             }
             i1 = i1 + 1;
          }
          i = (i + i2) + (i3 * 1);
       }
       tinputDomain = this.enableCrossPlatform;
       if (tinputDomain != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tinputDomain);
       }
       if (!(this.networkId).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.networkId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientTaskDetail$BatchHttpDnsResolvePackage mergeFrom(CodedInputByteBufferNano p0){
       ClientTaskDetail$BatchHttpDnsResolvePackage tdomain;
       int i2;
       String[] stringArray;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          int i1 = 10;
          if (i != i1) {
             i1 = 18;
             if (i != i1) {
                i1 = 26;
                if (i != i1) {
                   if (i != 32) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.networkId = p0.readString();
                      }
                   }else {
                      this.enableCrossPlatform = p0.readBool();
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   tdomain = this.domain;
                   i2 = (tdomain == null)? 0: tdomain.length;
                   i = i + i2;
                   stringArray = new String[i];
                   if (i2) {
                      System.arraycopy(tdomain, 0, stringArray, 0, i2);
                   }
                   i1 = i - 1;
                   while (i2 < i1) {
                      stringArray[i2] = p0.readString();
                      p0.readTag();
                      i2 = i2 + 1;
                   }
                   stringArray[i2] = p0.readString();
                   this.domain = stringArray;
                }
             }else {
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                tdomain = this.existedDomain;
                i2 = (tdomain == null)? 0: tdomain.length;
                i = i + i2;
                stringArray = new String[i];
                if (i2) {
                   System.arraycopy(tdomain, 0, stringArray, 0, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   stringArray[i2] = p0.readString();
                   p0.readTag();
                   i2 = i2 + 1;
                }
                stringArray[i2] = p0.readString();
                this.existedDomain = stringArray;
             }
          }else {
             i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
             tdomain = this.inputDomain;
             i2 = (tdomain == null)? 0: tdomain.length;
             i = i + i2;
             stringArray = new String[i];
             if (i2) {
                System.arraycopy(tdomain, 0, stringArray, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                stringArray[i2] = p0.readString();
                p0.readTag();
                i2 = i2 + 1;
             }
             stringArray[i2] = p0.readString();
             this.inputDomain = stringArray;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i1;
       ClientTaskDetail$BatchHttpDnsResolvePackage tinputDomain1;
       object oobject;
       ClientTaskDetail$BatchHttpDnsResolvePackage tinputDomain = this.inputDomain;
       int i = 0;
       if (tinputDomain != null && tinputDomain.length > 0) {
          i1 = 0;
          tinputDomain1 = this.inputDomain;
          while (i1 < tinputDomain1.length) {
             oobject = tinputDomain1[i1];
             if (oobject != null) {
                p0.writeString(1, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tinputDomain = this.existedDomain;
       if (tinputDomain != null && tinputDomain.length > 0) {
          i1 = 0;
          tinputDomain1 = this.existedDomain;
          while (i1 < tinputDomain1.length) {
             oobject = tinputDomain1[i1];
             if (oobject != null) {
                p0.writeString(2, oobject);
             }
             i1 = i1 + 1;
          }
       }
       tinputDomain = this.domain;
       if (tinputDomain != null && tinputDomain.length > 0) {
          tinputDomain = this.domain;
          while (i < tinputDomain.length) {
             object oobject1 = tinputDomain[i];
             if (oobject1 != null) {
                p0.writeString(3, oobject1);
             }
             i = i + 1;
          }
       }
       tinputDomain = this.enableCrossPlatform;
       if (tinputDomain != null) {
          p0.writeBool(4, tinputDomain);
       }
       if (!(this.networkId).equals("")) {
          p0.writeString(5, this.networkId);
       }
       super.writeTo(p0);
       return;
    }
}
