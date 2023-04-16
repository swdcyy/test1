package com.kuaishou.client.log.event.packages.nano.ClientEvent$EventPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$FirstLaunchEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ODOTEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$FixAppEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShareEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$LoginEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$SearchEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExceptionEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$TaskEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ClickEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$LaunchEvent;

public final class ClientEvent$EventPackage extends MessageNano	// class@00074a
{
    public ClientEvent$ClickEvent clickEvent;
    public ClientEvent$CustomEvent customEvent;
    public ClientEvent$ExceptionEvent exceptionEvent;
    public ClientEvent$FirstLaunchEvent firstLaunchEvent;
    public ClientEvent$FixAppEvent fixAppEvent;
    public ClientEvent$LaunchEvent launchEvent;
    public ClientEvent$LoginEvent loginEvent;
    public ClientEvent$ODOTEvent odotEvent;
    public ClientEvent$SearchEvent searchEvent;
    public ClientEvent$ShareEvent shareEvent;
    public ClientEvent$ShowEvent showEvent;
    public ClientEvent$TaskEvent taskEvent;
    public static ClientEvent$EventPackage[] _emptyArray;

    public void ClientEvent$EventPackage(){
       super();
       this.clear();
    }
    public static ClientEvent$EventPackage[] emptyArray(){
       if (ClientEvent$EventPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$EventPackage._emptyArray == null) {
             ClientEvent$EventPackage[] uEventPackag = new ClientEvent$EventPackage[0];
             ClientEvent$EventPackage._emptyArray = uEventPackag;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$EventPackage._emptyArray;
    }
    public static ClientEvent$EventPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$EventPackage().mergeFrom(p0);
    }
    public static ClientEvent$EventPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$EventPackage(), p0);
    }
    public ClientEvent$EventPackage clear(){
       this.launchEvent = null;
       this.showEvent = null;
       this.clickEvent = null;
       this.taskEvent = null;
       this.exceptionEvent = null;
       this.searchEvent = null;
       this.loginEvent = null;
       this.shareEvent = null;
       this.fixAppEvent = null;
       this.customEvent = null;
       this.odotEvent = null;
       this.firstLaunchEvent = null;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$EventPackage tlaunchEvent = this.launchEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tlaunchEvent);
       }
       tlaunchEvent = this.showEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tlaunchEvent);
       }
       tlaunchEvent = this.clickEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tlaunchEvent);
       }
       tlaunchEvent = this.taskEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tlaunchEvent);
       }
       tlaunchEvent = this.exceptionEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tlaunchEvent);
       }
       tlaunchEvent = this.searchEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, tlaunchEvent);
       }
       tlaunchEvent = this.loginEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(7, tlaunchEvent);
       }
       tlaunchEvent = this.shareEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, tlaunchEvent);
       }
       tlaunchEvent = this.fixAppEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(9, tlaunchEvent);
       }
       tlaunchEvent = this.customEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(10, tlaunchEvent);
       }
       tlaunchEvent = this.odotEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(12, tlaunchEvent);
       }
       tlaunchEvent = this.firstLaunchEvent;
       if (tlaunchEvent != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(13, tlaunchEvent);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$EventPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                if (this.launchEvent == null) {
                   this.launchEvent = new ClientEvent$LaunchEvent();
                }
                p0.readMessage(this.launchEvent);
                break;
              case 18:
                if (this.showEvent == null) {
                   this.showEvent = new ClientEvent$ShowEvent();
                }
                p0.readMessage(this.showEvent);
                break;
              case 26:
                if (this.clickEvent == null) {
                   this.clickEvent = new ClientEvent$ClickEvent();
                }
                p0.readMessage(this.clickEvent);
                break;
              case '"':
                if (this.taskEvent == null) {
                   this.taskEvent = new ClientEvent$TaskEvent();
                }
                p0.readMessage(this.taskEvent);
                break;
              case '*':
                if (this.exceptionEvent == null) {
                   this.exceptionEvent = new ClientEvent$ExceptionEvent();
                }
                p0.readMessage(this.exceptionEvent);
                break;
              case '2':
                if (this.searchEvent == null) {
                   this.searchEvent = new ClientEvent$SearchEvent();
                }
                p0.readMessage(this.searchEvent);
                break;
              case ':':
                if (this.loginEvent == null) {
                   this.loginEvent = new ClientEvent$LoginEvent();
                }
                p0.readMessage(this.loginEvent);
                break;
              case 'B':
                if (this.shareEvent == null) {
                   this.shareEvent = new ClientEvent$ShareEvent();
                }
                p0.readMessage(this.shareEvent);
                break;
              case 'J':
                if (this.fixAppEvent == null) {
                   this.fixAppEvent = new ClientEvent$FixAppEvent();
                }
                p0.readMessage(this.fixAppEvent);
                break;
              case 'R':
                if (this.customEvent == null) {
                   this.customEvent = new ClientEvent$CustomEvent();
                }
                p0.readMessage(this.customEvent);
                break;
              case 'b':
                if (this.odotEvent == null) {
                   this.odotEvent = new ClientEvent$ODOTEvent();
                }
                p0.readMessage(this.odotEvent);
                break;
              case 'j':
                if (this.firstLaunchEvent == null) {
                   this.firstLaunchEvent = new ClientEvent$FirstLaunchEvent();
                }
                p0.readMessage(this.firstLaunchEvent);
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
       ClientEvent$EventPackage tlaunchEvent = this.launchEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(1, tlaunchEvent);
       }
       tlaunchEvent = this.showEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(2, tlaunchEvent);
       }
       tlaunchEvent = this.clickEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(3, tlaunchEvent);
       }
       tlaunchEvent = this.taskEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(4, tlaunchEvent);
       }
       tlaunchEvent = this.exceptionEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(5, tlaunchEvent);
       }
       tlaunchEvent = this.searchEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(6, tlaunchEvent);
       }
       tlaunchEvent = this.loginEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(7, tlaunchEvent);
       }
       tlaunchEvent = this.shareEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(8, tlaunchEvent);
       }
       tlaunchEvent = this.fixAppEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(9, tlaunchEvent);
       }
       tlaunchEvent = this.customEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(10, tlaunchEvent);
       }
       tlaunchEvent = this.odotEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(12, tlaunchEvent);
       }
       tlaunchEvent = this.firstLaunchEvent;
       if (tlaunchEvent != null) {
          p0.writeMessage(13, tlaunchEvent);
       }
       super.writeTo(p0);
       return;
    }
}
