package com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition extends MessageNano	// class@00123f
{
    public boolean enableExplainPanel;
    public String errorMsg;
    public static LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition[] _emptyArray;

    public void LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition(){
       super();
       this.clear();
    }
    public static LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition[] emptyArray(){
       if (LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition._emptyArray == null) {
             LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition[] liveRecruitA = new LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition[0];
             LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition._emptyArray = liveRecruitA;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition._emptyArray;
    }
    public static LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition parseFrom(CodedInputByteBufferNano p0){
       return new LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition().mergeFrom(p0);
    }
    public static LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition(), p0);
    }
    public LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition clear(){
       this.enableExplainPanel = false;
       this.errorMsg = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition tenableExpla = this.enableExplainPanel;
       if (tenableExpla != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(1, tenableExpla);
       }
       if (!(this.errorMsg).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.errorMsg);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 18) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.errorMsg = p0.readString();
             }
          }else {
             this.enableExplainPanel = p0.readBool();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       LivePlusRecruitMessages$LiveRecruitAuthorPanelCondition tenableExpla = this.enableExplainPanel;
       if (tenableExpla != null) {
          p0.writeBool(1, tenableExpla);
       }
       if (!(this.errorMsg).equals("")) {
          p0.writeString(2, this.errorMsg);
       }
       super.writeTo(p0);
       return;
    }
}
