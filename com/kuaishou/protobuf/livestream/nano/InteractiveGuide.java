package com.kuaishou.protobuf.livestream.nano.InteractiveGuide;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Map;
import com.google.protobuf.nano.MapFactories$MapFactory;
import com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.WireFormatNano;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuideInfo;
import java.lang.System;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuideDisplayInfo;
import com.kuaishou.protobuf.livestream.nano.InteractiveGuideIntroductionInfo;

public final class InteractiveGuide extends MessageNano	// class@000c21
{
    public UserInfos$PicUrl[] background;
    public String biz;
    public String clickAction;
    public Map customUserGuideInfo;
    public boolean displayImmediately;
    public InteractiveGuideDisplayInfo displayInfo;
    public long displayMs;
    public String extParam;
    public InteractiveGuideInfo guideInfo;
    public int guideOccurrences;
    public String id;
    public boolean infiniteShowTimes;
    public InteractiveGuideIntroductionInfo introductionInfo;
    public int priority;
    public static InteractiveGuide[] _emptyArray;

    public void InteractiveGuide(){
       super();
       this.clear();
    }
    public static InteractiveGuide[] emptyArray(){
       if (InteractiveGuide._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (InteractiveGuide._emptyArray == null) {
             InteractiveGuide[] interactiveG = new InteractiveGuide[0];
             InteractiveGuide._emptyArray = interactiveG;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return InteractiveGuide._emptyArray;
    }
    public static InteractiveGuide parseFrom(CodedInputByteBufferNano p0){
       return new InteractiveGuide().mergeFrom(p0);
    }
    public static InteractiveGuide parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new InteractiveGuide(), p0);
    }
    public InteractiveGuide clear(){
       this.id = "";
       this.biz = "";
       this.introductionInfo = null;
       this.displayInfo = null;
       this.guideInfo = null;
       this.displayMs = 0;
       this.background = UserInfos$PicUrl.emptyArray();
       this.clickAction = "";
       this.priority = 0;
       this.extParam = "";
       this.guideOccurrences = 0;
       this.customUserGuideInfo = null;
       this.displayImmediately = false;
       this.infiniteShowTimes = false;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.id);
       }
       if (!(this.biz).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.biz);
       }
       InteractiveGuide tintroductio = this.introductionInfo;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(3, tintroductio);
       }
       tintroductio = this.displayInfo;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(4, tintroductio);
       }
       tintroductio = this.guideInfo;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(5, tintroductio);
       }
       InteractiveGuide tdisplayMs = this.displayMs;
       if (tdisplayMs) {
          i = i + CodedOutputByteBufferNano.computeUInt64Size(6, tdisplayMs);
       }
       tintroductio = this.background;
       if (tintroductio != null && tintroductio.length > 0) {
          int i1 = 0;
          tdisplayMs = this.background;
          while (i1 < tdisplayMs.length) {
             object oobject = tdisplayMs[i1];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.clickAction).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(8, this.clickAction);
       }
       tintroductio = this.priority;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(9, tintroductio);
       }
       if (!(this.extParam).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(10, this.extParam);
       }
       tintroductio = this.guideOccurrences;
       int i2 = 11;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(i2, tintroductio);
       }
       tintroductio = this.customUserGuideInfo;
       if (tintroductio != null) {
          i = i + InternalNano.computeMapFieldSize(tintroductio, 12, 9, i2);
       }
       tintroductio = this.displayImmediately;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(13, tintroductio);
       }
       tintroductio = this.infiniteShowTimes;
       if (tintroductio != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(15, tintroductio);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public InteractiveGuide mergeFrom(CodedInputByteBufferNano p0){
       MapFactories$MapFactory mapFactory = MapFactories.getMapFactory();
       while (true) {
          int i = p0.readTag();
          switch (i){
              case 0:
                return this;
              case 10:
                this.id = p0.readString();
                break;
              case 18:
                this.biz = p0.readString();
                break;
              case 26:
                if (this.introductionInfo == null) {
                   this.introductionInfo = new InteractiveGuideIntroductionInfo();
                }
                p0.readMessage(this.introductionInfo);
                break;
              case '"':
                if (this.displayInfo == null) {
                   this.displayInfo = new InteractiveGuideDisplayInfo();
                }
                p0.readMessage(this.displayInfo);
                break;
              case '*':
                if (this.guideInfo == null) {
                   this.guideInfo = new InteractiveGuideInfo();
                }
                p0.readMessage(this.guideInfo);
                break;
              case '0':
                this.displayMs = p0.readUInt64();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                InteractiveGuide tbackground = this.background;
                int i1 = 0;
                int i2 = (tbackground == null)? 0: tbackground.length;
                i = i + i2;
                UserInfos$PicUrl[] picUrlArray = new UserInfos$PicUrl[i];
                if (i2) {
                   System.arraycopy(tbackground, i1, picUrlArray, i1, i2);
                }
                int i3 = i - 1;
                while (i2 < i3) {
                   picUrlArray[i2] = new UserInfos$PicUrl();
                   p0.readMessage(picUrlArray[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                picUrlArray[i2] = new UserInfos$PicUrl();
                p0.readMessage(picUrlArray[i2]);
                this.background = picUrlArray;
                break;
              case 'B':
                this.clickAction = p0.readString();
                break;
              case 'H':
                this.priority = p0.readUInt32();
                break;
              case 'R':
                this.extParam = p0.readString();
                break;
              case 'X':
                this.guideOccurrences = p0.readUInt32();
                break;
              case 'b':
                this.customUserGuideInfo = InternalNano.mergeMapEntry(p0, this.customUserGuideInfo, mapFactory, 9, 11, new InteractiveGuideInfo(), 10, 18);
                break;
              case 'h':
                this.displayImmediately = p0.readBool();
                break;
              case 'x':
                this.infiniteShowTimes = p0.readBool();
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
       if (!(this.id).equals(str)) {
          p0.writeString(1, this.id);
       }
       if (!(this.biz).equals(str)) {
          p0.writeString(2, this.biz);
       }
       InteractiveGuide tintroductio = this.introductionInfo;
       if (tintroductio != null) {
          p0.writeMessage(3, tintroductio);
       }
       tintroductio = this.displayInfo;
       if (tintroductio != null) {
          p0.writeMessage(4, tintroductio);
       }
       tintroductio = this.guideInfo;
       if (tintroductio != null) {
          p0.writeMessage(5, tintroductio);
       }
       InteractiveGuide tdisplayMs = this.displayMs;
       if (tdisplayMs) {
          p0.writeUInt64(6, tdisplayMs);
       }
       tintroductio = this.background;
       if (tintroductio != null && tintroductio.length > 0) {
          int i = 0;
          tdisplayMs = this.background;
          while (i < tdisplayMs.length) {
             object oobject = tdisplayMs[i];
             if (oobject != null) {
                p0.writeMessage(7, oobject);
             }
             i = i + 1;
          }
       }
       if (!(this.clickAction).equals(str)) {
          p0.writeString(8, this.clickAction);
       }
       tintroductio = this.priority;
       if (tintroductio != null) {
          p0.writeUInt32(9, tintroductio);
       }
       if (!(this.extParam).equals(str)) {
          p0.writeString(10, this.extParam);
       }
       tintroductio = this.guideOccurrences;
       int i1 = 11;
       if (tintroductio != null) {
          p0.writeUInt32(i1, tintroductio);
       }
       tintroductio = this.customUserGuideInfo;
       if (tintroductio != null) {
          InternalNano.serializeMapField(p0, tintroductio, 12, 9, i1);
       }
       tintroductio = this.displayImmediately;
       if (tintroductio != null) {
          p0.writeBool(13, tintroductio);
       }
       tintroductio = this.infiniteShowTimes;
       if (tintroductio != null) {
          p0.writeBool(15, tintroductio);
       }
       super.writeTo(p0);
       return;
    }
}
