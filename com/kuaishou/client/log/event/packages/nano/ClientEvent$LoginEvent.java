package com.kuaishou.client.log.event.packages.nano.ClientEvent$LoginEvent;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.lang.Object;
import java.lang.String;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientEvent$LoginEvent extends MessageNano	// class@00075c
{
    public int actionType;
    public String extraMessage;
    public String id;
    public int platform;
    public int source;
    public int status;
    public int stayTime;
    public int step;
    public boolean stepBack;
    public static ClientEvent$LoginEvent[] _emptyArray;

    public void ClientEvent$LoginEvent(){
       super();
       this.clear();
    }
    public static ClientEvent$LoginEvent[] emptyArray(){
       if (ClientEvent$LoginEvent._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientEvent$LoginEvent._emptyArray == null) {
             ClientEvent$LoginEvent[] loginEventAr = new ClientEvent$LoginEvent[0];
             ClientEvent$LoginEvent._emptyArray = loginEventAr;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientEvent$LoginEvent._emptyArray;
    }
    public static ClientEvent$LoginEvent parseFrom(CodedInputByteBufferNano p0){
       return new ClientEvent$LoginEvent().mergeFrom(p0);
    }
    public static ClientEvent$LoginEvent parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientEvent$LoginEvent(), p0);
    }
    public ClientEvent$LoginEvent clear(){
       this.actionType = 0;
       this.platform = 0;
       this.status = 0;
       this.source = 0;
       this.extraMessage = "";
       this.step = 0;
       this.stayTime = 0;
       this.stepBack = false;
       this.id = "";
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientEvent$LoginEvent tactionType = this.actionType;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tactionType);
       }
       tactionType = this.platform;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tactionType);
       }
       tactionType = this.status;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tactionType);
       }
       tactionType = this.source;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(4, tactionType);
       }
       String str = "";
       if (!(this.extraMessage).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(5, this.extraMessage);
       }
       tactionType = this.step;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(6, tactionType);
       }
       tactionType = this.stayTime;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(7, tactionType);
       }
       tactionType = this.stepBack;
       if (tactionType != null) {
          i = i + CodedOutputByteBufferNano.computeBoolSize(11, tactionType);
       }
       if (!(this.id).equals(str)) {
          i = i + CodedOutputByteBufferNano.computeStringSize(12, this.id);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientEvent$LoginEvent mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 42) {
                         if (i != 48) {
                            if (i != 56) {
                               if (i != 88) {
                                  if (i != 98) {
                                     if (!WireFormatNano.parseUnknownField(p0, i)) {
                                        break ;
                                     }
                                  }else {
                                     this.id = p0.readString();
                                  }
                               }else {
                                  this.stepBack = p0.readBool();
                               }
                            }else {
                               this.stayTime = p0.readUInt32();
                            }
                         }else {
                            i = p0.readInt32();
                            switch (i){
                                case 0:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 1:
                                  break;
                                default:
                            }
                            this.step = i;
                         }
                      }else {
                         this.extraMessage = p0.readString();
                      }
                   }else {
                      i = p0.readInt32();
                      switch (i){
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
                          case '2':
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
                          case 1:
                            break;
                          default:
                      }
                      this.source = i;
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && (i != 3 && i != 4)))) {
                      continue ;
                   }else {
                      this.status = i;
                   }
                }
             }else {
                i = p0.readInt32();
                switch (i){
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
                    case '2':
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
                    case 1:
                      break;
                    default:
                }
                this.platform = i;
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.actionType = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientEvent$LoginEvent tactionType = this.actionType;
       if (tactionType != null) {
          p0.writeInt32(1, tactionType);
       }
       tactionType = this.platform;
       if (tactionType != null) {
          p0.writeInt32(2, tactionType);
       }
       tactionType = this.status;
       if (tactionType != null) {
          p0.writeInt32(3, tactionType);
       }
       tactionType = this.source;
       if (tactionType != null) {
          p0.writeInt32(4, tactionType);
       }
       String str = "";
       if (!(this.extraMessage).equals(str)) {
          p0.writeString(5, this.extraMessage);
       }
       tactionType = this.step;
       if (tactionType != null) {
          p0.writeInt32(6, tactionType);
       }
       tactionType = this.stayTime;
       if (tactionType != null) {
          p0.writeUInt32(7, tactionType);
       }
       tactionType = this.stepBack;
       if (tactionType != null) {
          p0.writeBool(11, tactionType);
       }
       if (!(this.id).equals(str)) {
          p0.writeString(12, this.id);
       }
       super.writeTo(p0);
       return;
    }
}
