package com.kuaishou.livestream.message.nano.SCLiveEncourageTreasureBoxWidget;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveEncourageTreasureBoxWidget extends MessageNano	// class@00141c
{
    public boolean isTimerTaskProcessing;
    public String kuaishouLinkUrl;
    public String nebulaLinkUrl;
    public boolean showGuideToast;
    public String text;
    public String timerTaskStageId;
    public int timerTaskStageIndex;
    public String timerTaskStageReportId;
    public int timerTaskStageSeconds;
    public int timerTaskStageStatus;
    public int widgetStatus;
    public static SCLiveEncourageTreasureBoxWidget[] _emptyArray;

    public void SCLiveEncourageTreasureBoxWidget(){
       super();
       this.clear();
    }
    public static SCLiveEncourageTreasureBoxWidget[] emptyArray(){
       if (SCLiveEncourageTreasureBoxWidget._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveEncourageTreasureBoxWidget._emptyArray == null) {
             SCLiveEncourageTreasureBoxWidget[] sCLiveEncour = new SCLiveEncourageTreasureBoxWidget[0];
             SCLiveEncourageTreasureBoxWidget._emptyArray = sCLiveEncour;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveEncourageTreasureBoxWidget._emptyArray;
    }
    public static SCLiveEncourageTreasureBoxWidget parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveEncourageTreasureBoxWidget().mergeFrom(p0);
    }
    public static SCLiveEncourageTreasureBoxWidget parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveEncourageTreasureBoxWidget(), p0);
    }
    public SCLiveEncourageTreasureBoxWidget clear(){
       this.isTimerTaskProcessing = false;
       this.timerTaskStageId = "";
       this.timerTaskStageIndex = 0;
       this.timerTaskStageSeconds = 0;
       this.timerTaskStageStatus = 0;
       this.text = "";
       this.kuaishouLinkUrl = "";
       this.widgetStatus = 0;
       this.showGuideToast = false;
       this.timerTaskStageReportId = "";
       this.nebulaLinkUrl = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       SCLiveEncourageTreasureBoxWidget tisTimerTask = this.isTimerTaskProcessing;
       if (tisTimerTask != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tisTimerTask);
       }
       String str = "";
       if (!(this.timerTaskStageId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.timerTaskStageId);
       }
       tisTimerTask = this.timerTaskStageIndex;
       if (tisTimerTask != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(3, tisTimerTask);
       }
       tisTimerTask = this.timerTaskStageSeconds;
       if (tisTimerTask != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tisTimerTask);
       }
       tisTimerTask = this.timerTaskStageStatus;
       if (tisTimerTask != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tisTimerTask);
       }
       if (!(this.text).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.text);
       }
       if (!(this.kuaishouLinkUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(7, this.kuaishouLinkUrl);
       }
       tisTimerTask = this.widgetStatus;
       if (tisTimerTask != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(8, tisTimerTask);
       }
       tisTimerTask = this.showGuideToast;
       if (tisTimerTask != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(9, tisTimerTask);
       }
       if (!(this.timerTaskStageReportId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.timerTaskStageReportId);
       }
       if (!(this.nebulaLinkUrl).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(11, this.nebulaLinkUrl);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveEncourageTreasureBoxWidget mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          int i1 = 2;
          switch (i){
              case 0:
                return this;
              case 8:
                this.isTimerTaskProcessing = p0.readBool();
                break;
              case 18:
                this.timerTaskStageId = p0.readString();
                break;
              case 24:
                this.timerTaskStageIndex = p0.readUInt32();
                break;
              case 32:
                this.timerTaskStageSeconds = p0.readUInt32();
                break;
              case '(':
                i = p0.readInt32();
                if (i && (i != 1 && (i != i1 && (i != 3 && i != 4)))) {
                   continue ;
                }else {
                   this.timerTaskStageStatus = i;
                }
                break;
              case '2':
                this.text = p0.readString();
                break;
              case ':':
                this.kuaishouLinkUrl = p0.readString();
                break;
              case '@':
                i = p0.readInt32();
                if (i && (i != 1 && i != i1)) {
                   continue ;
                }else {
                   this.widgetStatus = i;
                }
                break;
              case 'H':
                this.showGuideToast = p0.readBool();
                break;
              case 'R':
                this.timerTaskStageReportId = p0.readString();
                break;
              case 'Z':
                this.nebulaLinkUrl = p0.readString();
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
       SCLiveEncourageTreasureBoxWidget tisTimerTask = this.isTimerTaskProcessing;
       if (tisTimerTask != null) {
          p0.writeBool(1, tisTimerTask);
       }
       String str = "";
       if (!(this.timerTaskStageId).equals(str)) {
          p0.writeString(2, this.timerTaskStageId);
       }
       tisTimerTask = this.timerTaskStageIndex;
       if (tisTimerTask != null) {
          p0.writeUInt32(3, tisTimerTask);
       }
       tisTimerTask = this.timerTaskStageSeconds;
       if (tisTimerTask != null) {
          p0.writeUInt32(4, tisTimerTask);
       }
       tisTimerTask = this.timerTaskStageStatus;
       if (tisTimerTask != null) {
          p0.writeInt32(5, tisTimerTask);
       }
       if (!(this.text).equals(str)) {
          p0.writeString(6, this.text);
       }
       if (!(this.kuaishouLinkUrl).equals(str)) {
          p0.writeString(7, this.kuaishouLinkUrl);
       }
       tisTimerTask = this.widgetStatus;
       if (tisTimerTask != null) {
          p0.writeInt32(8, tisTimerTask);
       }
       tisTimerTask = this.showGuideToast;
       if (tisTimerTask != null) {
          p0.writeBool(9, tisTimerTask);
       }
       if (!(this.timerTaskStageReportId).equals(str)) {
          p0.writeString(10, this.timerTaskStageReportId);
       }
       if (!(this.nebulaLinkUrl).equals(str)) {
          p0.writeString(11, this.nebulaLinkUrl);
       }
       super.writeTo(p0);
       return;
    }
}
