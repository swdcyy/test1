package com.kuaishou.livestream.message.nano.LiveCommonTopRightTkWidgetProto$TkWidgetConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonTopRightTkWidgetProto$TkWidgetConfig extends MessageNano	// class@00116c
{
    public String activityId;
    public String arrangeMode;
    public String bizId;
    public int bizPriority;
    public String bundleId;
    public String data;
    public long layoutArea;
    public long layoutOrder;
    public long minBundleVer;
    public String viewKey;
    public static LiveCommonTopRightTkWidgetProto$TkWidgetConfig[] _emptyArray;

    public void LiveCommonTopRightTkWidgetProto$TkWidgetConfig(){
       super();
       this.clear();
    }
    public static LiveCommonTopRightTkWidgetProto$TkWidgetConfig[] emptyArray(){
       if (LiveCommonTopRightTkWidgetProto$TkWidgetConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonTopRightTkWidgetProto$TkWidgetConfig._emptyArray == null) {
             LiveCommonTopRightTkWidgetProto$TkWidgetConfig[] tkWidgetConf = new LiveCommonTopRightTkWidgetProto$TkWidgetConfig[0];
             LiveCommonTopRightTkWidgetProto$TkWidgetConfig._emptyArray = tkWidgetConf;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonTopRightTkWidgetProto$TkWidgetConfig._emptyArray;
    }
    public static LiveCommonTopRightTkWidgetProto$TkWidgetConfig parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonTopRightTkWidgetProto$TkWidgetConfig().mergeFrom(p0);
    }
    public static LiveCommonTopRightTkWidgetProto$TkWidgetConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonTopRightTkWidgetProto$TkWidgetConfig(), p0);
    }
    public LiveCommonTopRightTkWidgetProto$TkWidgetConfig clear(){
       this.activityId = "";
       this.arrangeMode = "";
       this.bizId = "";
       this.bizPriority = 0;
       this.bundleId = "";
       this.data = "";
       this.layoutArea = 0;
       this.layoutOrder = 0;
       this.minBundleVer = 0;
       this.viewKey = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.activityId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.activityId);
       }
       if (!(this.arrangeMode).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.arrangeMode);
       }
       if (!(this.bizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.bizId);
       }
       LiveCommonTopRightTkWidgetProto$TkWidgetConfig tbizPriority = this.bizPriority;
       if (tbizPriority != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tbizPriority);
       }
       if (!(this.bundleId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.data);
       }
       LiveCommonTopRightTkWidgetProto$TkWidgetConfig tlayoutArea = this.layoutArea;
       if (tlayoutArea) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(7, tlayoutArea);
       }
       tlayoutArea = this.layoutOrder;
       if (tlayoutArea) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(8, tlayoutArea);
       }
       tlayoutArea = this.minBundleVer;
       if (tlayoutArea) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(9, tlayoutArea);
       }
       if (!(this.viewKey).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.viewKey);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonTopRightTkWidgetProto$TkWidgetConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.activityId = p0.readString();
                break;
              case 18:
                this.arrangeMode = p0.readString();
                break;
              case 26:
                this.bizId = p0.readString();
                break;
              case 32:
                i = p0.readInt32();
                if (i && i != 1) {
                   continue ;
                }else {
                   this.bizPriority = i;
                }
                break;
              case '*':
                this.bundleId = p0.readString();
                break;
              case '2':
                this.data = p0.readString();
                break;
              case '8':
                this.layoutArea = p0.readUInt64();
                break;
              case '@':
                this.layoutOrder = p0.readUInt64();
                break;
              case 'H':
                this.minBundleVer = p0.readUInt64();
                break;
              case 'R':
                this.viewKey = p0.readString();
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
       String str = "";
       if (!(this.activityId).equals(str)) {
          p0.writeString(1, this.activityId);
       }
       if (!(this.arrangeMode).equals(str)) {
          p0.writeString(2, this.arrangeMode);
       }
       if (!(this.bizId).equals(str)) {
          p0.writeString(3, this.bizId);
       }
       LiveCommonTopRightTkWidgetProto$TkWidgetConfig tbizPriority = this.bizPriority;
       if (tbizPriority != null) {
          p0.writeInt32(4, tbizPriority);
       }
       if (!(this.bundleId).equals(str)) {
          p0.writeString(5, this.bundleId);
       }
       if (!(this.data).equals(str)) {
          p0.writeString(6, this.data);
       }
       LiveCommonTopRightTkWidgetProto$TkWidgetConfig tlayoutArea = this.layoutArea;
       if (tlayoutArea) {
          p0.writeUInt64(7, tlayoutArea);
       }
       tlayoutArea = this.layoutOrder;
       if (tlayoutArea) {
          p0.writeUInt64(8, tlayoutArea);
       }
       tlayoutArea = this.minBundleVer;
       if (tlayoutArea) {
          p0.writeUInt64(9, tlayoutArea);
       }
       if (!(this.viewKey).equals(str)) {
          p0.writeString(10, this.viewKey);
       }
       super.writeTo(p0);
       return;
    }
}
