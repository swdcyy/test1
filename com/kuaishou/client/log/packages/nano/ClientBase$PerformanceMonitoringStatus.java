package com.kuaishou.client.log.packages.nano.ClientBase$PerformanceMonitoringStatus;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientBase$PerformanceMonitoringStatus extends MessageNano	// class@000781
{
    public boolean activityLaunchMonitoringEnabled;
    public boolean batteryMonitoringEnabled;
    public boolean blockMonitoringEnabled;
    public boolean fdCountMonitoringEnabled;
    public boolean frameRateMonitoringEnabled;
    public boolean ioMonitoringEnabled;
    public boolean jvmHeapMonitoringEnabled;
    public boolean nativeHeapMonitoringEnabled;
    public boolean networkMonitoringEnabled;
    public String process;
    public boolean sharedPreferencesMonitoringEnabled;
    public boolean threadCountMonitoringEnabled;
    public static ClientBase$PerformanceMonitoringStatus[] _emptyArray;

    public void ClientBase$PerformanceMonitoringStatus(){
       super();
       this.clear();
    }
    public static ClientBase$PerformanceMonitoringStatus[] emptyArray(){
       if (ClientBase$PerformanceMonitoringStatus._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientBase$PerformanceMonitoringStatus._emptyArray == null) {
             ClientBase$PerformanceMonitoringStatus[] performanceM = new ClientBase$PerformanceMonitoringStatus[0];
             ClientBase$PerformanceMonitoringStatus._emptyArray = performanceM;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientBase$PerformanceMonitoringStatus._emptyArray;
    }
    public static ClientBase$PerformanceMonitoringStatus parseFrom(CodedInputByteBufferNano p0){
       return new ClientBase$PerformanceMonitoringStatus().mergeFrom(p0);
    }
    public static ClientBase$PerformanceMonitoringStatus parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientBase$PerformanceMonitoringStatus(), p0);
    }
    public ClientBase$PerformanceMonitoringStatus clear(){
       this.activityLaunchMonitoringEnabled = false;
       this.blockMonitoringEnabled = false;
       this.threadCountMonitoringEnabled = false;
       this.fdCountMonitoringEnabled = false;
       this.jvmHeapMonitoringEnabled = false;
       this.nativeHeapMonitoringEnabled = false;
       this.batteryMonitoringEnabled = false;
       this.networkMonitoringEnabled = false;
       this.sharedPreferencesMonitoringEnabled = false;
       this.frameRateMonitoringEnabled = false;
       this.process = "";
       this.ioMonitoringEnabled = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientBase$PerformanceMonitoringStatus tactivityLau = this.activityLaunchMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tactivityLau);
       }
       tactivityLau = this.blockMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tactivityLau);
       }
       tactivityLau = this.threadCountMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tactivityLau);
       }
       tactivityLau = this.fdCountMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(4, tactivityLau);
       }
       tactivityLau = this.jvmHeapMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(5, tactivityLau);
       }
       tactivityLau = this.nativeHeapMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(6, tactivityLau);
       }
       tactivityLau = this.batteryMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(7, tactivityLau);
       }
       tactivityLau = this.networkMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(8, tactivityLau);
       }
       tactivityLau = this.sharedPreferencesMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tactivityLau);
       }
       tactivityLau = this.frameRateMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(10, tactivityLau);
       }
       if (!(this.process).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.process);
       }
       tactivityLau = this.ioMonitoringEnabled;
       if (tactivityLau != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(12, tactivityLau);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientBase$PerformanceMonitoringStatus mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 8:
                this.activityLaunchMonitoringEnabled = p0.readBool();
                break;
              case 16:
                this.blockMonitoringEnabled = p0.readBool();
                break;
              case 24:
                this.threadCountMonitoringEnabled = p0.readBool();
                break;
              case 32:
                this.fdCountMonitoringEnabled = p0.readBool();
                break;
              case '(':
                this.jvmHeapMonitoringEnabled = p0.readBool();
                break;
              case '0':
                this.nativeHeapMonitoringEnabled = p0.readBool();
                break;
              case '8':
                this.batteryMonitoringEnabled = p0.readBool();
                break;
              case '@':
                this.networkMonitoringEnabled = p0.readBool();
                break;
              case 'H':
                this.sharedPreferencesMonitoringEnabled = p0.readBool();
                break;
              case 'P':
                this.frameRateMonitoringEnabled = p0.readBool();
                break;
              case 'Z':
                this.process = p0.readString();
                break;
              case '`':
                this.ioMonitoringEnabled = p0.readBool();
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
       ClientBase$PerformanceMonitoringStatus tactivityLau = this.activityLaunchMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(1, tactivityLau);
       }
       tactivityLau = this.blockMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(2, tactivityLau);
       }
       tactivityLau = this.threadCountMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(3, tactivityLau);
       }
       tactivityLau = this.fdCountMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(4, tactivityLau);
       }
       tactivityLau = this.jvmHeapMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(5, tactivityLau);
       }
       tactivityLau = this.nativeHeapMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(6, tactivityLau);
       }
       tactivityLau = this.batteryMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(7, tactivityLau);
       }
       tactivityLau = this.networkMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(8, tactivityLau);
       }
       tactivityLau = this.sharedPreferencesMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(9, tactivityLau);
       }
       tactivityLau = this.frameRateMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(10, tactivityLau);
       }
       if (!(this.process).equals("")) {
          p0.writeString(11, this.process);
       }
       tactivityLau = this.ioMonitoringEnabled;
       if (tactivityLau != null) {
          p0.writeBool(12, tactivityLau);
       }
       super.writeTo(p0);
       return;
    }
}
