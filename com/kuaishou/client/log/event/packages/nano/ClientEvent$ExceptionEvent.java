package com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientEvent$ExceptionEvent extends MessageNano	// class@00074c
{
    public String androidPatchBaseVersion;
    public String androidPatchVersion;
    public ClientEvent$ElementPackage elementpackage;
    public String exceptionMetrics;
    public String extraMessage;
    public String flag;
    public String iosPatchBaseVersion;
    public String iosPatchVersion;
    public String message;
    public String page;
    public int type;
    public ClientEvent$UrlPackage urlPackage;
    public String userActionTrace;
    public static ClientEvent$ExceptionEvent[] _emptyArray;

    public void ClientEvent$ExceptionEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$ExceptionEvent[] emptyArray(){
       if (ClientEvent$ExceptionEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$ExceptionEvent._emptyArray == null) {
             ClientEvent$ExceptionEvent[] uExceptionEv = new ClientEvent$ExceptionEvent[0];
             ClientEvent$ExceptionEvent._emptyArray = uExceptionEv;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$ExceptionEvent._emptyArray;
    }
    public static ClientEvent$ExceptionEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$ExceptionEvent().mergeFrom(p0);
    }
    public static ClientEvent$ExceptionEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$ExceptionEvent(), p0);
    }
    public ClientEvent$ExceptionEvent clear(){
       this.type = 0;
       this.message = "";
       this.urlPackage = null;
       this.flag = "";
       this.elementpackage = null;
       this.androidPatchBaseVersion = "";
       this.androidPatchVersion = "";
       this.extraMessage = "";
       this.iosPatchBaseVersion = "";
       this.iosPatchVersion = "";
       this.page = "";
       this.exceptionMetrics = "";
       this.userActionTrace = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$ExceptionEvent ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, ttype);
       }
       String str = "";
       if (!(this.message).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.message);
       }
       ttype = this.urlPackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, ttype);
       }
       if (!(this.flag).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.flag);
       }
       ttype = this.elementpackage;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, ttype);
       }
       if (!(this.androidPatchBaseVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.androidPatchBaseVersion);
       }
       if (!(this.androidPatchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.androidPatchVersion);
       }
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.extraMessage);
       }
       if (!(this.iosPatchBaseVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(9, this.iosPatchBaseVersion);
       }
       if (!(this.iosPatchVersion).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.iosPatchVersion);
       }
       if (!(this.page).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.page);
       }
       if (!(this.exceptionMetrics).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.exceptionMetrics);
       }
       if (!(this.userActionTrace).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(13, this.userActionTrace);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$ExceptionEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                i = p0.readInt32();
                switch (i){
                    case 0:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 1:
                      break;
                    default:
                }
                this.type = i;
                break;
              case 18:
                this.message = p0.readString();
                break;
              case 26:
                if (this.urlPackage == null) {
                   this.urlPackage = new ClientEvent$UrlPackage();
                }
                p0.readMessage(this.urlPackage);
                break;
              case '"':
                this.flag = p0.readString();
                break;
              case '*':
                if (this.elementpackage == null) {
                   this.elementpackage = new ClientEvent$ElementPackage();
                }
                p0.readMessage(this.elementpackage);
                break;
              case '2':
                this.androidPatchBaseVersion = p0.readString();
                break;
              case ':':
                this.androidPatchVersion = p0.readString();
                break;
              case 'B':
                this.extraMessage = p0.readString();
                break;
              case 'J':
                this.iosPatchBaseVersion = p0.readString();
                break;
              case 'R':
                this.iosPatchVersion = p0.readString();
                break;
              case 'Z':
                this.page = p0.readString();
                break;
              case 'b':
                this.exceptionMetrics = p0.readString();
                break;
              case 'j':
                this.userActionTrace = p0.readString();
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
       ClientEvent$ExceptionEvent ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(1, ttype);
       }
       String str = "";
       if (!(this.message).equals(str)) {
          p0.writeString(2, this.message);
       }
       ttype = this.urlPackage;
       if (ttype != null) {
          p0.writeMessage(3, ttype);
       }
       if (!(this.flag).equals(str)) {
          p0.writeString(4, this.flag);
       }
       ttype = this.elementpackage;
       if (ttype != null) {
          p0.writeMessage(5, ttype);
       }
       if (!(this.androidPatchBaseVersion).equals(str)) {
          p0.writeString(6, this.androidPatchBaseVersion);
       }
       if (!(this.androidPatchVersion).equals(str)) {
          p0.writeString(7, this.androidPatchVersion);
       }
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(8, this.extraMessage);
       }
       if (!(this.iosPatchBaseVersion).equals(str)) {
          p0.writeString(9, this.iosPatchBaseVersion);
       }
       if (!(this.iosPatchVersion).equals(str)) {
          p0.writeString(10, this.iosPatchVersion);
       }
       if (!(this.page).equals(str)) {
          p0.writeString(11, this.page);
       }
       if (!(this.exceptionMetrics).equals(str)) {
          p0.writeString(12, this.exceptionMetrics);
       }
       if (!(this.userActionTrace).equals(str)) {
          p0.writeString(13, this.userActionTrace);
       }
       super.writeTo(p0);
       return;
    }
}
