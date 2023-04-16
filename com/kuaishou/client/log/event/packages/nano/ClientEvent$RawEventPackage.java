package com.kuaishou.client.log.event.packages.nano.ClientEvent$RawEventPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.util.Arrays;
import com.google.protobuf.nano.CodedOutputByteBufferNano;

public final class ClientEvent$RawEventPackage extends MessageNano	// class@001365
{
    public byte[] clickEvent;
    public byte[] customEvent;
    public byte[] exceptionEvent;
    public byte[] firstLaunchEvent;
    public byte[] fixAppEvent;
    public byte[] launchEvent;
    public byte[] loginEvent;
    public byte[] odotEvent;
    public byte[] searchEvent;
    public byte[] shareEvent;
    public byte[] showEvent;
    public byte[] taskEvent;
    public static ClientEvent$RawEventPackage[] _emptyArray;

    public void ClientEvent$RawEventPackage(){
       super();
       this.clear();
    }
    public static ClientEvent$RawEventPackage[] emptyArray(){
       if (ClientEvent$RawEventPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$RawEventPackage._emptyArray == null) {
             ClientEvent$RawEventPackage[] rawEventPack = new ClientEvent$RawEventPackage[0];
             ClientEvent$RawEventPackage._emptyArray = rawEventPack;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$RawEventPackage._emptyArray;
    }
    public static ClientEvent$RawEventPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$RawEventPackage().mergeFrom(p0);
    }
    public static ClientEvent$RawEventPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$RawEventPackage(), p0);
    }
    public ClientEvent$RawEventPackage clear(){
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       this.launchEvent = eMPTY_BYTES;
       this.showEvent = eMPTY_BYTES;
       this.clickEvent = eMPTY_BYTES;
       this.taskEvent = eMPTY_BYTES;
       this.exceptionEvent = eMPTY_BYTES;
       this.searchEvent = eMPTY_BYTES;
       this.loginEvent = eMPTY_BYTES;
       this.shareEvent = eMPTY_BYTES;
       this.fixAppEvent = eMPTY_BYTES;
       this.customEvent = eMPTY_BYTES;
       this.odotEvent = eMPTY_BYTES;
       this.firstLaunchEvent = eMPTY_BYTES;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       if (!Arrays.equals(this.launchEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(1, this.launchEvent);
       }
       if (!Arrays.equals(this.showEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(2, this.showEvent);
       }
       if (!Arrays.equals(this.clickEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(3, this.clickEvent);
       }
       if (!Arrays.equals(this.taskEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(4, this.taskEvent);
       }
       if (!Arrays.equals(this.exceptionEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(5, this.exceptionEvent);
       }
       if (!Arrays.equals(this.searchEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(6, this.searchEvent);
       }
       if (!Arrays.equals(this.loginEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(7, this.loginEvent);
       }
       if (!Arrays.equals(this.shareEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(8, this.shareEvent);
       }
       if (!Arrays.equals(this.fixAppEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(9, this.fixAppEvent);
       }
       if (!Arrays.equals(this.customEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(10, this.customEvent);
       }
       if (!Arrays.equals(this.odotEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(12, this.odotEvent);
       }
       if (!Arrays.equals(this.firstLaunchEvent, eMPTY_BYTES)) {
          i = i + CodedOutputByteBufferNano.computeBytesSize(13, this.firstLaunchEvent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$RawEventPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.launchEvent = p0.readBytes();
                break;
              case 18:
                this.showEvent = p0.readBytes();
                break;
              case 26:
                this.clickEvent = p0.readBytes();
                break;
              case '"':
                this.taskEvent = p0.readBytes();
                break;
              case '*':
                this.exceptionEvent = p0.readBytes();
                break;
              case '2':
                this.searchEvent = p0.readBytes();
                break;
              case ':':
                this.loginEvent = p0.readBytes();
                break;
              case 'B':
                this.shareEvent = p0.readBytes();
                break;
              case 'J':
                this.fixAppEvent = p0.readBytes();
                break;
              case 'R':
                this.customEvent = p0.readBytes();
                break;
              case 'b':
                this.odotEvent = p0.readBytes();
                break;
              case 'j':
                this.firstLaunchEvent = p0.readBytes();
                break;
              default:
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   return this;
                }
                continue ;
          }
       }
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       byte[] eMPTY_BYTES = WireFormatNano.EMPTY_BYTES;
       if (!Arrays.equals(this.launchEvent, eMPTY_BYTES)) {
          p0.writeBytes(1, this.launchEvent);
       }
       if (!Arrays.equals(this.showEvent, eMPTY_BYTES)) {
          p0.writeBytes(2, this.showEvent);
       }
       if (!Arrays.equals(this.clickEvent, eMPTY_BYTES)) {
          p0.writeBytes(3, this.clickEvent);
       }
       if (!Arrays.equals(this.taskEvent, eMPTY_BYTES)) {
          p0.writeBytes(4, this.taskEvent);
       }
       if (!Arrays.equals(this.exceptionEvent, eMPTY_BYTES)) {
          p0.writeBytes(5, this.exceptionEvent);
       }
       if (!Arrays.equals(this.searchEvent, eMPTY_BYTES)) {
          p0.writeBytes(6, this.searchEvent);
       }
       if (!Arrays.equals(this.loginEvent, eMPTY_BYTES)) {
          p0.writeBytes(7, this.loginEvent);
       }
       if (!Arrays.equals(this.shareEvent, eMPTY_BYTES)) {
          p0.writeBytes(8, this.shareEvent);
       }
       if (!Arrays.equals(this.fixAppEvent, eMPTY_BYTES)) {
          p0.writeBytes(9, this.fixAppEvent);
       }
       if (!Arrays.equals(this.customEvent, eMPTY_BYTES)) {
          p0.writeBytes(10, this.customEvent);
       }
       if (!Arrays.equals(this.odotEvent, eMPTY_BYTES)) {
          p0.writeBytes(12, this.odotEvent);
       }
       if (!Arrays.equals(this.firstLaunchEvent, eMPTY_BYTES)) {
          p0.writeBytes(13, this.firstLaunchEvent);
       }
       super.writeTo(p0);
       return;
    }
}
