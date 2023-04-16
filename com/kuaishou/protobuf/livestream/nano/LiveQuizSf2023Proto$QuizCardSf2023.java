package com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$QuizCardSf2023;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveQuizSf2023Proto$QuizCardSf2023$QuizOption;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichTextMessage$CommentRichTextSegment;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.System;
import com.kuaishou.cny2023.message.nano.CnyCdnDegradeProto$DegradablePicUrl;

public final class LiveQuizSf2023Proto$QuizCardSf2023 extends MessageNano	// class@000d01
{
    public String backgroundColor;
    public LiveCommentRichTextMessage$CommentRichTextSegment[] bigCardDescription;
    public String placeholder;
    public String question;
    public String quizId;
    public LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[] quizOptions;
    public LiveCommentRichTextMessage$CommentRichTextSegment[] smallCardDescriptionAnswered;
    public LiveCommentRichTextMessage$CommentRichTextSegment[] smallCardDescriptionAnswering;
    public CnyCdnDegradeProto$DegradablePicUrl sponsorIcon;
    public int type;
    public static LiveQuizSf2023Proto$QuizCardSf2023[] _emptyArray;

    public void LiveQuizSf2023Proto$QuizCardSf2023(){
       super();
       this.clear();
    }
    public static LiveQuizSf2023Proto$QuizCardSf2023[] emptyArray(){
       if (LiveQuizSf2023Proto$QuizCardSf2023._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveQuizSf2023Proto$QuizCardSf2023._emptyArray == null) {
             LiveQuizSf2023Proto$QuizCardSf2023[] quizCardSf20 = new LiveQuizSf2023Proto$QuizCardSf2023[0];
             LiveQuizSf2023Proto$QuizCardSf2023._emptyArray = quizCardSf20;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveQuizSf2023Proto$QuizCardSf2023._emptyArray;
    }
    public static LiveQuizSf2023Proto$QuizCardSf2023 parseFrom(CodedInputByteBufferNano p0){
       return new LiveQuizSf2023Proto$QuizCardSf2023().mergeFrom(p0);
    }
    public static LiveQuizSf2023Proto$QuizCardSf2023 parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveQuizSf2023Proto$QuizCardSf2023(), p0);
    }
    public LiveQuizSf2023Proto$QuizCardSf2023 clear(){
       this.quizId = "";
       this.type = 0;
       this.question = "";
       this.quizOptions = LiveQuizSf2023Proto$QuizCardSf2023$QuizOption.emptyArray();
       this.placeholder = "";
       this.backgroundColor = "";
       this.bigCardDescription = LiveCommentRichTextMessage$CommentRichTextSegment.emptyArray();
       this.sponsorIcon = null;
       this.smallCardDescriptionAnswering = LiveCommentRichTextMessage$CommentRichTextSegment.emptyArray();
       this.smallCardDescriptionAnswered = LiveCommentRichTextMessage$CommentRichTextSegment.emptyArray();
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i2;
       LiveQuizSf2023Proto$QuizCardSf2023 tbigCardDesc;
       object oobject1;
       int i = super.computeSerializedSize();
       String str = "";
       if (!(this.quizId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(1, this.quizId);
       }
       LiveQuizSf2023Proto$QuizCardSf2023 ttype = this.type;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, ttype);
       }
       if (!(this.question).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(3, this.question);
       }
       ttype = this.quizOptions;
       int i1 = 0;
       if (ttype != null && ttype.length > 0) {
          i2 = 0;
          LiveQuizSf2023Proto$QuizCardSf2023 tquizOptions = this.quizOptions;
          while (i2 < tquizOptions.length) {
             object oobject = tquizOptions[i2];
             if (oobject != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(4, oobject);
             }
             i2 = i2 + 1;
          }
       }
       if (!(this.placeholder).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.placeholder);
       }
       if (!(this.backgroundColor).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(6, this.backgroundColor);
       }
       ttype = this.bigCardDescription;
       if (ttype != null && ttype.length > 0) {
          i2 = 0;
          tbigCardDesc = this.bigCardDescription;
          while (i2 < tbigCardDesc.length) {
             oobject1 = tbigCardDesc[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(7, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.sponsorIcon;
       if (ttype != null) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(8, ttype);
       }
       ttype = this.smallCardDescriptionAnswering;
       if (ttype != null && ttype.length > 0) {
          i2 = 0;
          tbigCardDesc = this.smallCardDescriptionAnswering;
          while (i2 < tbigCardDesc.length) {
             oobject1 = tbigCardDesc[i2];
             if (oobject1 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(9, oobject1);
             }
             i2 = i2 + 1;
          }
       }
       ttype = this.smallCardDescriptionAnswered;
       if (ttype != null && ttype.length > 0) {
          ttype = this.smallCardDescriptionAnswered;
          while (i1 < ttype.length) {
             object oobject2 = ttype[i1];
             if (oobject2 != null) {
                i = i + CodedOutputByteBufferNano.computeMessageSize(10, oobject2);
             }
             i1 = i1 + 1;
          }
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveQuizSf2023Proto$QuizCardSf2023 mergeFrom(CodedInputByteBufferNano p0){
       LiveQuizSf2023Proto$QuizCardSf2023 tquizOptions;
       int i2;
       LiveCommentRichTextMessage$CommentRichTextSegment[] uCommentRich;
       while (true) {
          int i = p0.readTag();
          int i1 = 0;
          switch (i){
              case 0:
                return this;
              case 10:
                this.quizId = p0.readString();
                break;
              case 16:
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.type = i;
                }
                break;
              case 26:
                this.question = p0.readString();
                break;
              case '"':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 34);
                tquizOptions = this.quizOptions;
                i2 = (tquizOptions == null)? 0: tquizOptions.length;
                i = i + i2;
                LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[] quizCardSf20 = new LiveQuizSf2023Proto$QuizCardSf2023$QuizOption[i];
                if (i2) {
                   System.arraycopy(tquizOptions, i1, quizCardSf20, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   quizCardSf20[i2] = new LiveQuizSf2023Proto$QuizCardSf2023$QuizOption();
                   p0.readMessage(quizCardSf20[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                quizCardSf20[i2] = new LiveQuizSf2023Proto$QuizCardSf2023$QuizOption();
                p0.readMessage(quizCardSf20[i2]);
                this.quizOptions = quizCardSf20;
                break;
              case '*':
                this.placeholder = p0.readString();
                break;
              case '2':
                this.backgroundColor = p0.readString();
                break;
              case ':':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 58);
                tquizOptions = this.bigCardDescription;
                i2 = (tquizOptions == null)? 0: tquizOptions.length;
                i = i + i2;
                uCommentRich = new LiveCommentRichTextMessage$CommentRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tquizOptions, i1, uCommentRich, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                   p0.readMessage(uCommentRich[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                p0.readMessage(uCommentRich[i2]);
                this.bigCardDescription = uCommentRich;
                break;
              case 'B':
                if (this.sponsorIcon == null) {
                   this.sponsorIcon = new CnyCdnDegradeProto$DegradablePicUrl();
                }
                p0.readMessage(this.sponsorIcon);
                break;
              case 'J':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 74);
                tquizOptions = this.smallCardDescriptionAnswering;
                i2 = (tquizOptions == null)? 0: tquizOptions.length;
                i = i + i2;
                uCommentRich = new LiveCommentRichTextMessage$CommentRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tquizOptions, i1, uCommentRich, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                   p0.readMessage(uCommentRich[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                p0.readMessage(uCommentRich[i2]);
                this.smallCardDescriptionAnswering = uCommentRich;
                break;
              case 'R':
                i = WireFormatNano.getRepeatedFieldArrayLength(p0, 82);
                tquizOptions = this.smallCardDescriptionAnswered;
                i2 = (tquizOptions == null)? 0: tquizOptions.length;
                i = i + i2;
                uCommentRich = new LiveCommentRichTextMessage$CommentRichTextSegment[i];
                if (i2) {
                   System.arraycopy(tquizOptions, i1, uCommentRich, i1, i2);
                }
                i1 = i - 1;
                while (i2 < i1) {
                   uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                   p0.readMessage(uCommentRich[i2]);
                   p0.readTag();
                   i2 = i2 + 1;
                }
                uCommentRich[i2] = new LiveCommentRichTextMessage$CommentRichTextSegment();
                p0.readMessage(uCommentRich[i2]);
                this.smallCardDescriptionAnswered = uCommentRich;
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
       int i1;
       LiveQuizSf2023Proto$QuizCardSf2023 tbigCardDesc;
       object oobject1;
       String str = "";
       if (!(this.quizId).equals(str)) {
          p0.writeString(1, this.quizId);
       }
       LiveQuizSf2023Proto$QuizCardSf2023 ttype = this.type;
       if (ttype != null) {
          p0.writeInt32(2, ttype);
       }
       if (!(this.question).equals(str)) {
          p0.writeString(3, this.question);
       }
       ttype = this.quizOptions;
       int i = 0;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          LiveQuizSf2023Proto$QuizCardSf2023 tquizOptions = this.quizOptions;
          while (i1 < tquizOptions.length) {
             object oobject = tquizOptions[i1];
             if (oobject != null) {
                p0.writeMessage(4, oobject);
             }
             i1 = i1 + 1;
          }
       }
       if (!(this.placeholder).equals(str)) {
          p0.writeString(5, this.placeholder);
       }
       if (!(this.backgroundColor).equals(str)) {
          p0.writeString(6, this.backgroundColor);
       }
       ttype = this.bigCardDescription;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tbigCardDesc = this.bigCardDescription;
          while (i1 < tbigCardDesc.length) {
             oobject1 = tbigCardDesc[i1];
             if (oobject1 != null) {
                p0.writeMessage(7, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.sponsorIcon;
       if (ttype != null) {
          p0.writeMessage(8, ttype);
       }
       ttype = this.smallCardDescriptionAnswering;
       if (ttype != null && ttype.length > 0) {
          i1 = 0;
          tbigCardDesc = this.smallCardDescriptionAnswering;
          while (i1 < tbigCardDesc.length) {
             oobject1 = tbigCardDesc[i1];
             if (oobject1 != null) {
                p0.writeMessage(9, oobject1);
             }
             i1 = i1 + 1;
          }
       }
       ttype = this.smallCardDescriptionAnswered;
       if (ttype != null && ttype.length > 0) {
          ttype = this.smallCardDescriptionAnswered;
          while (i < ttype.length) {
             object oobject2 = ttype[i];
             if (oobject2 != null) {
                p0.writeMessage(10, oobject2);
             }
             i = i + 1;
          }
       }
       super.writeTo(p0);
       return;
    }
}
