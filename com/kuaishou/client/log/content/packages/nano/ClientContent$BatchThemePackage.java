package com.kuaishou.client.log.content.packages.nano.ClientContent$BatchThemePackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ThemePackage;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.System;

public final class ClientContent$BatchThemePackage extends MessageNano	// class@001218
{
    public ClientContent$ThemePackage[] themePackage;
    public static ClientContent$BatchThemePackage[] _emptyArray;

    public void ClientContent$BatchThemePackage(){
       super();
       this.clear();
    }
    public static ClientContent$BatchThemePackage[] emptyArray(){
       if (ClientContent$BatchThemePackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$BatchThemePackage._emptyArray == null) {
             ClientContent$BatchThemePackage[] uBatchThemeP = new ClientContent$BatchThemePackage[0];
             ClientContent$BatchThemePackage._emptyArray = uBatchThemeP;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$BatchThemePackage._emptyArray;
    }
    public static ClientContent$BatchThemePackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$BatchThemePackage().mergeFrom(p0);
    }
    public static ClientContent$BatchThemePackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$BatchThemePackage(), p0);
    }
    public ClientContent$BatchThemePackage clear(){
       this.themePackage = ClientContent$ThemePackage.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$BatchThemePackage tthemePackag = this.themePackage;
       if (tthemePackag != null && tthemePackag.length > 0) {
          int i1 = 0;
          ClientContent$BatchThemePackage tthemePackag1 = this.themePackage;
          while (i1 < tthemePackag1.length) {
             object oobject = tthemePackag1[i1];
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
    public ClientContent$BatchThemePackage mergeFrom(CodedInputByteBufferNano p0){
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
             ClientContent$BatchThemePackage tthemePackag = this.themePackage;
             int i2 = (tthemePackag == null)? 0: tthemePackag.length;
             i = i + i2;
             ClientContent$ThemePackage[] themePackage = new ClientContent$ThemePackage[i];
             if (i2) {
                System.arraycopy(tthemePackag, 0, themePackage, 0, i2);
             }
             i1 = i - 1;
             while (i2 < i1) {
                themePackage[i2] = new ClientContent$ThemePackage();
                p0.readMessage(themePackage[i2]);
                p0.readTag();
                i2 = i2 + 1;
             }
             themePackage[i2] = new ClientContent$ThemePackage();
             p0.readMessage(themePackage[i2]);
             this.themePackage = themePackage;
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$BatchThemePackage tthemePackag = this.themePackage;
       if (tthemePackag != null && tthemePackag.length > 0) {
          int i = 0;
          ClientContent$BatchThemePackage tthemePackag1 = this.themePackage;
          while (i < tthemePackag1.length) {
             object oobject = tthemePackag1[i];
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
