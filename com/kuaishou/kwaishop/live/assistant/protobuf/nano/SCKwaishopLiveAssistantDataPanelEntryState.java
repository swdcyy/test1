package com.kuaishou.kwaishop.live.assistant.protobuf.nano.SCKwaishopLiveAssistantDataPanelEntryState;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCKwaishopLiveAssistantDataPanelEntryState extends MessageNano	// class@00092e
{
    public String dataEntryTitle;
    public String dataPanelUrl;
    public boolean isShowDataEntry;
    public long orderGmv;
    public static SCKwaishopLiveAssistantDataPanelEntryState[] _emptyArray;

    public void SCKwaishopLiveAssistantDataPanelEntryState(){
       super();
       this.clear();
    }
    public static SCKwaishopLiveAssistantDataPanelEntryState[] emptyArray(){
       if (SCKwaishopLiveAssistantDataPanelEntryState._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCKwaishopLiveAssistantDataPanelEntryState._emptyArray == null) {
             SCKwaishopLiveAssistantDataPanelEntryState[] sCKwaishopLi = new SCKwaishopLiveAssistantDataPanelEntryState[0];
             SCKwaishopLiveAssistantDataPanelEntryState._emptyArray = sCKwaishopLi;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCKwaishopLiveAssistantDataPanelEntryState._emptyArray;
    }
    public static SCKwaishopLiveAssistantDataPanelEntryState parseFrom(CodedInputByteBufferNano p0){
       return new SCKwaishopLiveAssistantDataPanelEntryState().mergeFrom(p0);
    }
    public static SCKwaishopLiveAssistantDataPanelEntryState parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCKwaishopLiveAssistantDataPanelEntryState(), p0);
    }
    public SCKwaishopLiveAssistantDataPanelEntryState clear(){
       this.isShowDataEntry = false;
       this.orderGmv = 0;
       this.dataPanelUrl = "";
       this.dataEntryTitle = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCKwaishopLiveAssistantDataPanelEntryState tisShowDataE = this.isShowDataEntry;
       if (tisShowDataE != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisShowDataE);
       }
       tisShowDataE = this.orderGmv;
       if (tisShowDataE - null) {
          i = i + CodedOutputByteBufferNano.computeInt64Size(2, tisShowDataE);
       }
       String str = "";
       if (!(this.dataPanelUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.dataPanelUrl);
       }
       if (!(this.dataEntryTitle).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.dataEntryTitle);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCKwaishopLiveAssistantDataPanelEntryState mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 26) {
                   if (i != 34) {
                      if (!WireFormatNano.parseUnknownField(p0, i)) {
                         break ;
                      }
                   }else {
                      this.dataEntryTitle = p0.readString();
                   }
                }else {
                   this.dataPanelUrl = p0.readString();
                }
             }else {
                this.orderGmv = p0.readInt64();
             }
          }else {
             this.isShowDataEntry = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       SCKwaishopLiveAssistantDataPanelEntryState tisShowDataE = this.isShowDataEntry;
       if (tisShowDataE != null) {
          p0.writeBool(1, tisShowDataE);
       }
       tisShowDataE = this.orderGmv;
       if (tisShowDataE - null) {
          p0.writeInt64(2, tisShowDataE);
       }
       String str = "";
       if (!(this.dataPanelUrl).equals(str)) {
          p0.writeString(3, this.dataPanelUrl);
       }
       if (!(this.dataEntryTitle).equals(str)) {
          p0.writeString(4, this.dataEntryTitle);
       }
       super.writeTo(p0);
       return;
    }
}
