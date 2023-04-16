package com.kuaishou.client.log.stat.packages.nano.ClientStat$EditorSdkQosStatEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public final class ClientStat$EditorSdkQosStatEvent extends MessageNano	// class@0007c2
{
    public String editorSdkQosInfo;
    public String taskSessionId;
    public ClientEvent$UrlPackage urlPackage;
    public static ClientStat$EditorSdkQosStatEvent[] _emptyArray;

    public void ClientStat$EditorSdkQosStatEvent(){
       super();
       this.clear();
    }
    public static ClientStat$EditorSdkQosStatEvent[] emptyArray(){
       if (ClientStat$EditorSdkQosStatEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientStat$EditorSdkQosStatEvent._emptyArray == null) {
             ClientStat$EditorSdkQosStatEvent[] uEditorSdkQo = new ClientStat$EditorSdkQosStatEvent[0];
             ClientStat$EditorSdkQosStatEvent._emptyArray = uEditorSdkQo;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientStat$EditorSdkQosStatEvent._emptyArray;
    }
    public static ClientStat$EditorSdkQosStatEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientStat$EditorSdkQosStatEvent().mergeFrom(p0);
    }
    public static ClientStat$EditorSdkQosStatEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientStat$EditorSdkQosStatEvent(), p0);
    }
    public ClientStat$EditorSdkQosStatEvent clear(){
       this.editorSdkQosInfo = "";
       this.urlPackage = null;
       this.taskSessionId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.editorSdkQosInfo).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.editorSdkQosInfo);
       }
       ClientStat$EditorSdkQosStatEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, turlPackage);
       }
       if (!(this.taskSessionId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.taskSessionId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientStat$EditorSdkQosStatEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.taskSessionId = p0.readString();
                }
             }else if(this.urlPackage == null){
                this.urlPackage = new ClientEvent$UrlPackage();
             }
             p0.readMessage(this.urlPackage);
          }else {
             this.editorSdkQosInfo = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.editorSdkQosInfo).equals(str)) {
          p0.writeString(1, this.editorSdkQosInfo);
       }
       ClientStat$EditorSdkQosStatEvent turlPackage = this.urlPackage;
       if (turlPackage != null) {
          p0.writeMessage(2, turlPackage);
       }
       if (!(this.taskSessionId).equals(str)) {
          p0.writeString(3, this.taskSessionId);
       }
       super.writeTo(p0);
       return;
    }
}
