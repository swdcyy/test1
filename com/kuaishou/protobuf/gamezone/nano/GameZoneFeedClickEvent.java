package com.kuaishou.protobuf.gamezone.nano.GameZoneFeedClickEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.gamezone.nano.GameZoneClickFeed;

public final class GameZoneFeedClickEvent extends MessageNano	// class@000bc4
{
    public GameZoneClickFeed clickFeed;
    public GameZoneClickFeed sourceFeed;
    public String sourcePage;
    public static GameZoneFeedClickEvent[] _emptyArray;

    public void GameZoneFeedClickEvent(){
       super();
       this.clear();
    }
    public static GameZoneFeedClickEvent[] emptyArray(){
       if (GameZoneFeedClickEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (GameZoneFeedClickEvent._emptyArray == null) {
             GameZoneFeedClickEvent[] gameZoneFeed = new GameZoneFeedClickEvent[0];
             GameZoneFeedClickEvent._emptyArray = gameZoneFeed;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return GameZoneFeedClickEvent._emptyArray;
    }
    public static GameZoneFeedClickEvent parseFrom(CodedInputByteBufferNano p0){
       return new GameZoneFeedClickEvent().mergeFrom(p0);
    }
    public static GameZoneFeedClickEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new GameZoneFeedClickEvent(), p0);
    }
    public GameZoneFeedClickEvent clear(){
       this.clickFeed = null;
       this.sourceFeed = null;
       this.sourcePage = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       GameZoneFeedClickEvent tclickFeed = this.clickFeed;
       if (tclickFeed != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(1, tclickFeed);
       }
       tclickFeed = this.sourceFeed;
       if (tclickFeed != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(2, tclickFeed);
       }
       if (!(this.sourcePage).equals("")) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.sourcePage);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public GameZoneFeedClickEvent mergeFrom(CodedInputByteBufferNano p0){
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
                   this.sourcePage = p0.readString();
                }
             }else if(this.sourceFeed == null){
                this.sourceFeed = new GameZoneClickFeed();
             }
             p0.readMessage(this.sourceFeed);
          }else if(this.clickFeed == null){
             this.clickFeed = new GameZoneClickFeed();
          }
          p0.readMessage(this.clickFeed);
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       GameZoneFeedClickEvent tclickFeed = this.clickFeed;
       if (tclickFeed != null) {
          p0.writeMessage(1, tclickFeed);
       }
       tclickFeed = this.sourceFeed;
       if (tclickFeed != null) {
          p0.writeMessage(2, tclickFeed);
       }
       if (!(this.sourcePage).equals("")) {
          p0.writeString(3, this.sourcePage);
       }
       super.writeTo(p0);
       return;
    }
}
