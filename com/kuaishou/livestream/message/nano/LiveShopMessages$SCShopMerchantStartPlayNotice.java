package com.kuaishou.livestream.message.nano.LiveShopMessages$SCShopMerchantStartPlayNotice;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.System;

public final class LiveShopMessages$SCShopMerchantStartPlayNotice extends MessageNano	// class@0012a8
{
    public int[] allowSourceType;
    public String confirmText;
    public String liveStreamId;
    public String popWindowText;
    public String titleText;
    public static LiveShopMessages$SCShopMerchantStartPlayNotice[] _emptyArray;

    public void LiveShopMessages$SCShopMerchantStartPlayNotice(){
       super();
       this.clear();
    }
    public static LiveShopMessages$SCShopMerchantStartPlayNotice[] emptyArray(){
       if (LiveShopMessages$SCShopMerchantStartPlayNotice._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveShopMessages$SCShopMerchantStartPlayNotice._emptyArray == null) {
             LiveShopMessages$SCShopMerchantStartPlayNotice[] sCShopMercha = new LiveShopMessages$SCShopMerchantStartPlayNotice[0];
             LiveShopMessages$SCShopMerchantStartPlayNotice._emptyArray = sCShopMercha;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveShopMessages$SCShopMerchantStartPlayNotice._emptyArray;
    }
    public static LiveShopMessages$SCShopMerchantStartPlayNotice parseFrom(CodedInputByteBufferNano p0){
       return new LiveShopMessages$SCShopMerchantStartPlayNotice().mergeFrom(p0);
    }
    public static LiveShopMessages$SCShopMerchantStartPlayNotice parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveShopMessages$SCShopMerchantStartPlayNotice(), p0);
    }
    public LiveShopMessages$SCShopMerchantStartPlayNotice clear(){
       this.liveStreamId = "";
       this.popWindowText = "";
       this.allowSourceType = WireFormatNano.EMPTY_INT_ARRAY;
       this.confirmText = "";
       this.titleText = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       String str = "";
       int i1 = 1;
       if (!(this.liveStreamId).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(i1, this.liveStreamId);
       }
       if (!(this.popWindowText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(2, this.popWindowText);
       }
       LiveShopMessages$SCShopMerchantStartPlayNotice tallowSource = this.allowSourceType;
       if (tallowSource != null && tallowSource.length > 0) {
          int i2 = 0;
          int i3 = 0;
          LiveShopMessages$SCShopMerchantStartPlayNotice tallowSource1 = this.allowSourceType;
          while (i2 < tallowSource1.length) {
             i3 = i3 + CodedOutputByteBufferNano.computeInt32SizeNoTag(tallowSource1[i2]);
             i2 = i2 + 1;
          }
          i = (i + i3) + (tallowSource1.length * 1);
       }
       if (!(this.confirmText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(4, this.confirmText);
       }
       if (!(this.titleText).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.titleText);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveShopMessages$SCShopMerchantStartPlayNotice mergeFrom(CodedInputByteBufferNano p0){
       int i3;
       int i4;
       int i5;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                int i1 = 24;
                int i2 = 0;
                if (i != i1) {
                   if (i != 26) {
                      if (i != 34) {
                         if (i != 42) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            this.titleText = p0.readString();
                         }
                      }else {
                         this.confirmText = p0.readString();
                      }
                   }else {
                      i = p0.pushLimit(p0.readRawVarint32());
                      i1 = p0.getPosition();
                      i3 = 0;
                      while (p0.getBytesUntilLimit() > 0) {
                         switch (p0.readInt32()){
                             case 0:
                             case 2:
                             case 3:
                             case 4:
                             case 5:
                             case 6:
                             case 7:
                             case 8:
                             case 9:
                             case 10:
                             case 11:
                             case 12:
                             case 13:
                             case 14:
                             case 15:
                             case 16:
                             case 17:
                             case 18:
                             case 19:
                             case 20:
                             case 21:
                             case 22:
                             case 23:
                             case 24:
                             case 25:
                             case 26:
                             case 27:
                             case 28:
                             case 29:
                             case 30:
                             case 31:
                             case 32:
                             case '!':
                             case '"':
                             case '#':
                             case '$':
                             case '%':
                             case '&':
                             case 39:
                             case '(':
                             case ')':
                             case '*':
                             case '+':
                             case ',':
                             case '-':
                             case '.':
                             case '/':
                             case '0':
                             case '1':
                             case '3':
                             case '4':
                             case '5':
                             case '6':
                             case '7':
                             case '8':
                             case '9':
                             case ':':
                             case ';':
                             case '<':
                             case '=':
                             case '>':
                             case '?':
                             case '@':
                             case 'A':
                             case 'B':
                             case 'C':
                             case 'D':
                             case 'E':
                             case 'F':
                             case 'G':
                             case 'H':
                             case 'I':
                             case 'J':
                             case 'K':
                             case 'L':
                             case 'M':
                             case 'N':
                             case 'O':
                             case 'P':
                             case 'Q':
                             case 'R':
                             case 'S':
                             case 'T':
                             case 'U':
                             case 'V':
                             case 'W':
                             case 'X':
                             case 'Y':
                             case 'Z':
                             case '[':
                             case 92:
                             case ']':
                             case '^':
                             case '_':
                             case '`':
                             case 'a':
                             case 'b':
                             case 'c':
                             case 'd':
                             case 'e':
                             case 'f':
                             case 'g':
                             case 'h':
                             case 'i':
                             case 'j':
                             case 'k':
                             case 'l':
                             case 'm':
                             case 'n':
                             case 'o':
                             case 'p':
                             case 'q':
                             case 'r':
                             case 's':
                             case 't':
                             case 'u':
                             case 'v':
                             case 'w':
                             case 'x':
                             case 'y':
                             case 'z':
                             case '{':
                             case '|':
                             case '}':
                             case '~':
                             case 1:
                               break;
                             default:
                               continue ;
                         }
                         i3 = i3 + 1;
                      }
                      if (i3) {
                         p0.rewindToPosition(i1);
                         LiveShopMessages$SCShopMerchantStartPlayNotice tallowSource = this.allowSourceType;
                         i4 = (tallowSource == null)? 0: tallowSource.length;
                         i3 = i3 + i4;
                         int[] ointArray = new int[i3];
                         if (i4) {
                            System.arraycopy(tallowSource, i2, ointArray, i2, i4);
                         }
                         while (p0.getBytesUntilLimit() > 0) {
                            i1 = p0.readInt32();
                            switch (i1){
                                case 0:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case '!':
                                case '"':
                                case '#':
                                case '$':
                                case '%':
                                case '&':
                                case 39:
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case '-':
                                case '.':
                                case '/':
                                case '0':
                                case '1':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                case ':':
                                case ';':
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                case 'A':
                                case 'B':
                                case 'C':
                                case 'D':
                                case 'E':
                                case 'F':
                                case 'G':
                                case 'H':
                                case 'I':
                                case 'J':
                                case 'K':
                                case 'L':
                                case 'M':
                                case 'N':
                                case 'O':
                                case 'P':
                                case 'Q':
                                case 'R':
                                case 'S':
                                case 'T':
                                case 'U':
                                case 'V':
                                case 'W':
                                case 'X':
                                case 'Y':
                                case 'Z':
                                case '[':
                                case 92:
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                case 'a':
                                case 'b':
                                case 'c':
                                case 'd':
                                case 'e':
                                case 'f':
                                case 'g':
                                case 'h':
                                case 'i':
                                case 'j':
                                case 'k':
                                case 'l':
                                case 'm':
                                case 'n':
                                case 'o':
                                case 'p':
                                case 'q':
                                case 'r':
                                case 's':
                                case 't':
                                case 'u':
                                case 'v':
                                case 'w':
                                case 'x':
                                case 'y':
                                case 'z':
                                case '{':
                                case '|':
                                case '}':
                                case '~':
                                case 1:
                                  break;
                                default:
                                  continue ;
                            }
                            i2 = i4 + 1;
                            ointArray[i4] = i1;
                            i4 = i2;
                         }
                         this.allowSourceType = ointArray;
                      }
                      p0.popLimit(i);
                   }
                }else {
                   i = WireFormatNano.getRepeatedFieldArrayLength(p0, i1);
                   int[] ointArray1 = new int[i];
                   i3 = 0;
                   i4 = 0;
                   while (i3 < i) {
                      if (i3) {
                         p0.readTag();
                      }
                      i5 = p0.readInt32();
                      switch (i5){
                          case 0:
                          case 2:
                          case 3:
                          case 4:
                          case 5:
                          case 6:
                          case 7:
                          case 8:
                          case 9:
                          case 10:
                          case 11:
                          case 12:
                          case 13:
                          case 14:
                          case 15:
                          case 16:
                          case 17:
                          case 18:
                          case 19:
                          case 20:
                          case 21:
                          case 22:
                          case 23:
                          case 24:
                          case 25:
                          case 26:
                          case 27:
                          case 28:
                          case 29:
                          case 30:
                          case 31:
                          case 32:
                          case '!':
                          case '"':
                          case '#':
                          case '$':
                          case '%':
                          case '&':
                          case 39:
                          case '(':
                          case ')':
                          case '*':
                          case '+':
                          case ',':
                          case '-':
                          case '.':
                          case '/':
                          case '0':
                          case '1':
                          case '3':
                          case '4':
                          case '5':
                          case '6':
                          case '7':
                          case '8':
                          case '9':
                          case ':':
                          case ';':
                          case '<':
                          case '=':
                          case '>':
                          case '?':
                          case '@':
                          case 'A':
                          case 'B':
                          case 'C':
                          case 'D':
                          case 'E':
                          case 'F':
                          case 'G':
                          case 'H':
                          case 'I':
                          case 'J':
                          case 'K':
                          case 'L':
                          case 'M':
                          case 'N':
                          case 'O':
                          case 'P':
                          case 'Q':
                          case 'R':
                          case 'S':
                          case 'T':
                          case 'U':
                          case 'V':
                          case 'W':
                          case 'X':
                          case 'Y':
                          case 'Z':
                          case '[':
                          case 92:
                          case ']':
                          case '^':
                          case '_':
                          case '`':
                          case 'a':
                          case 'b':
                          case 'c':
                          case 'd':
                          case 'e':
                          case 'f':
                          case 'g':
                          case 'h':
                          case 'i':
                          case 'j':
                          case 'k':
                          case 'l':
                          case 'm':
                          case 'n':
                          case 'o':
                          case 'p':
                          case 'q':
                          case 'r':
                          case 's':
                          case 't':
                          case 'u':
                          case 'v':
                          case 'w':
                          case 'x':
                          case 'y':
                          case 'z':
                          case '{':
                          case '|':
                          case '}':
                          case '~':
                          case 1:
                            int i6 = i4 + 1;
                            ointArray1[i4] = i5;
                            i4 = i6;
                            break;
                          default:
                      }
                      i3 = i3 + 1;
                   }
                   if (i4) {
                      LiveShopMessages$SCShopMerchantStartPlayNotice tallowSource1 = this.allowSourceType;
                      i5 = (tallowSource1 == null)? 0: tallowSource1.length;
                      if (!i5 && i4 == i) {
                         this.allowSourceType = ointArray1;
                      }else {
                         i = i5 + i4;
                         int[] ointArray2 = new int[i];
                         if (i5) {
                            System.arraycopy(tallowSource1, i2, ointArray2, i2, i5);
                         }
                         System.arraycopy(ointArray1, i2, ointArray2, i5, i4);
                         this.allowSourceType = ointArray2;
                      }
                   }
                }
             }else {
                this.popWindowText = p0.readString();
             }
          }else {
             this.liveStreamId = p0.readString();
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       String str = "";
       if (!(this.liveStreamId).equals(str)) {
          p0.writeString(1, this.liveStreamId);
       }
       if (!(this.popWindowText).equals(str)) {
          p0.writeString(2, this.popWindowText);
       }
       LiveShopMessages$SCShopMerchantStartPlayNotice tallowSource = this.allowSourceType;
       if (tallowSource != null && tallowSource.length > 0) {
          int i = 0;
          LiveShopMessages$SCShopMerchantStartPlayNotice tallowSource1 = this.allowSourceType;
          while (i < tallowSource1.length) {
             p0.writeInt32(3, tallowSource1[i]);
             i = i + 1;
          }
       }
       if (!(this.confirmText).equals(str)) {
          p0.writeString(4, this.confirmText);
       }
       if (!(this.titleText).equals(str)) {
          p0.writeString(5, this.titleText);
       }
       super.writeTo(p0);
       return;
    }
}
