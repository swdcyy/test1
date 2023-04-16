package com.kuaishou.livestream.message.nano.LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent extends MessageNano	// class@001144
{
    public String layoutData;
    public String layoutId;
    public String layoutMd5;
    public int layoutType;
    public String widgetData;
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[] _emptyArray;

    public void LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent(){
       super();
       this.clear();
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[] emptyArray(){
       if (LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent._emptyArray == null) {
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[] liveCommonAc = new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent[0];
             LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent._emptyArray = liveCommonAc;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent._emptyArray;
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent().mergeFrom(p0);
    }
    public static LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent(), p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent clear(){
       this.layoutData = "";
       this.widgetData = "";
       this.layoutType = 0;
       this.layoutMd5 = "";
       this.layoutId = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.layoutData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.layoutData);
       }
       if (!(this.widgetData).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.widgetData);
       }
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent tlayoutType = this.layoutType;
       if (tlayoutType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tlayoutType);
       }
       if (!(this.layoutMd5).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.layoutMd5);
       }
       if (!(this.layoutId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.layoutId);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 24) {
                   if (i != 34) {
                      if (i != 42) {
                         if (!WireFormatNano.parseUnknownField(p0, i)) {
                            break ;
                         }
                      }else {
                         this.layoutId = p0.readString();
                      }
                   }else {
                      this.layoutMd5 = p0.readString();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && i != 1) {
                      continue ;
                   }else {
                      this.layoutType = i;
                   }
                }
             }else {
                this.widgetData = p0.readString();
             }
          }else {
             this.layoutData = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.layoutData).equals(str)) {
          p0.writeString(1, this.layoutData);
       }
       if (!(this.widgetData).equals(str)) {
          p0.writeString(2, this.widgetData);
       }
       LiveCommonActivityWidgetProto$LiveCommonActivityWidgetPageContent tlayoutType = this.layoutType;
       if (tlayoutType != null) {
          p0.writeInt32(3, tlayoutType);
       }
       if (!(this.layoutMd5).equals(str)) {
          p0.writeString(4, this.layoutMd5);
       }
       if (!(this.layoutId).equals(str)) {
          p0.writeString(5, this.layoutId);
       }
       super.writeTo(p0);
       return;
    }
}
