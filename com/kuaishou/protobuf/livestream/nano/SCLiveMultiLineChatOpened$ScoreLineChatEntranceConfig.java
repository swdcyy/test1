package com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig extends MessageNano	// class@000d5b
{
    public boolean enableWishGiftBattleHeaderViewEntrance;
    public boolean enableWishGiftBattlePlayListTopButton;
    public String wishGiftPanelUrl;
    public static SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig[] _emptyArray;

    public void SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig(){
       super();
       this.clear();
    }
    public static SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig[] emptyArray(){
       if (SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig._emptyArray == null) {
             SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig[] scoreLineCha = new SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig[0];
             SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig._emptyArray = scoreLineCha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig._emptyArray;
    }
    public static SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig parseFrom(CodedInputByteBufferNano p0){
       return new SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig().mergeFrom(p0);
    }
    public static SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig(), p0);
    }
    public SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig clear(){
       this.wishGiftPanelUrl = "";
       this.enableWishGiftBattleHeaderViewEntrance = false;
       this.enableWishGiftBattlePlayListTopButton = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       if (!(this.wishGiftPanelUrl).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.wishGiftPanelUrl);
       }
       SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig tenableWishG = this.enableWishGiftBattleHeaderViewEntrance;
       if (tenableWishG != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(2, tenableWishG);
       }
       tenableWishG = this.enableWishGiftBattlePlayListTopButton;
       if (tenableWishG != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(3, tenableWishG);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 16) {
                if (i != 24) {
                   if (!WireFormatNano.parseUnknownField(p0, i)) {
                      break ;
                   }
                }else {
                   this.enableWishGiftBattlePlayListTopButton = p0.readBool();
                }
             }else {
                this.enableWishGiftBattleHeaderViewEntrance = p0.readBool();
             }
          }else {
             this.wishGiftPanelUrl = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       if (!(this.wishGiftPanelUrl).equals("")) {
          p0.writeString(1, this.wishGiftPanelUrl);
       }
       SCLiveMultiLineChatOpened$ScoreLineChatEntranceConfig tenableWishG = this.enableWishGiftBattleHeaderViewEntrance;
       if (tenableWishG != null) {
          p0.writeBool(2, tenableWishG);
       }
       tenableWishG = this.enableWishGiftBattlePlayListTopButton;
       if (tenableWishG != null) {
          p0.writeBool(3, tenableWishG);
       }
       super.writeTo(p0);
       return;
    }
}
