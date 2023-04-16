package com.kuaishou.protobuf.livestream.nano.LiveMultiPkScoreRuleInfo;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class LiveMultiPkScoreRuleInfo extends MessageNano	// class@000cc7
{
    public String scoreRuleRoute;
    public boolean showRuleEntrance;
    public static LiveMultiPkScoreRuleInfo[] _emptyArray;

    public void LiveMultiPkScoreRuleInfo(){
       super();
       this.clear();
    }
    public static LiveMultiPkScoreRuleInfo[] emptyArray(){
       if (LiveMultiPkScoreRuleInfo._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveMultiPkScoreRuleInfo._emptyArray == null) {
             LiveMultiPkScoreRuleInfo[] liveMultiPkS = new LiveMultiPkScoreRuleInfo[0];
             LiveMultiPkScoreRuleInfo._emptyArray = liveMultiPkS;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveMultiPkScoreRuleInfo._emptyArray;
    }
    public static LiveMultiPkScoreRuleInfo parseFrom(CodedInputByteBufferNano p0){
       return new LiveMultiPkScoreRuleInfo().mergeFrom(p0);
    }
    public static LiveMultiPkScoreRuleInfo parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveMultiPkScoreRuleInfo(), p0);
    }
    public LiveMultiPkScoreRuleInfo clear(){
       this.scoreRuleRoute = "";
       this.showRuleEntrance = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.scoreRuleRoute).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.scoreRuleRoute);
       }
       LiveMultiPkScoreRuleInfo tshowRuleEnt = this.showRuleEntrance;
       if (tshowRuleEnt != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tshowRuleEnt);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveMultiPkScoreRuleInfo mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (!WireFormatNano.parseUnknownField(p0, i)) {
                   break ;
                }
             }else {
                this.showRuleEntrance = p0.readBool();
             }
          }else {
             this.scoreRuleRoute = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.scoreRuleRoute).equals("")) {
          p0.writeString(1, this.scoreRuleRoute);
       }
       LiveMultiPkScoreRuleInfo tshowRuleEnt = this.showRuleEntrance;
       if (tshowRuleEnt != null) {
          p0.writeBool(2, tshowRuleEnt);
       }
       super.writeTo(p0);
       return;
    }
}
