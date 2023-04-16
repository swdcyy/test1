package com.kuaishou.client.log.content.packages.nano.ClientContent$LiveRobotPackage;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.WireFormatNano;

public final class ClientContent$LiveRobotPackage extends MessageNano	// class@00127a
{
    public int earnTaskStatus;
    public int earnTaskType;
    public int motorSkillId;
    public int motorSkillStatus;
    public int petSex;
    public int robotStatus;
    public int robotType;
    public static ClientContent$LiveRobotPackage[] _emptyArray;

    public void ClientContent$LiveRobotPackage(){
       super();
       this.clear();
    }
    public static ClientContent$LiveRobotPackage[] emptyArray(){
       if (ClientContent$LiveRobotPackage._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (ClientContent$LiveRobotPackage._emptyArray == null) {
             ClientContent$LiveRobotPackage[] liveRobotPac = new ClientContent$LiveRobotPackage[0];
             ClientContent$LiveRobotPackage._emptyArray = liveRobotPac;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return ClientContent$LiveRobotPackage._emptyArray;
    }
    public static ClientContent$LiveRobotPackage parseFrom(CodedInputByteBufferNano p0){
       return new ClientContent$LiveRobotPackage().mergeFrom(p0);
    }
    public static ClientContent$LiveRobotPackage parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new ClientContent$LiveRobotPackage(), p0);
    }
    public ClientContent$LiveRobotPackage clear(){
       this.petSex = 0;
       this.robotType = 0;
       this.robotStatus = 0;
       this.motorSkillId = 0;
       this.motorSkillStatus = 0;
       this.earnTaskType = 0;
       this.earnTaskStatus = 0;
       this.cachedSize = -1;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       ClientContent$LiveRobotPackage tpetSex = this.petSex;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(1, tpetSex);
       }
       tpetSex = this.robotType;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(2, tpetSex);
       }
       tpetSex = this.robotStatus;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(3, tpetSex);
       }
       tpetSex = this.motorSkillId;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(4, tpetSex);
       }
       tpetSex = this.motorSkillStatus;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(5, tpetSex);
       }
       tpetSex = this.earnTaskType;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeUInt32Size(6, tpetSex);
       }
       tpetSex = this.earnTaskStatus;
       if (tpetSex != null) {
          i = i + CodedOutputByteBufferNano.computeInt32Size(7, tpetSex);
       }
       return i;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public ClientContent$LiveRobotPackage mergeFrom(CodedInputByteBufferNano p0){
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 8) {
             if (i != 16) {
                if (i != 24) {
                   if (i != 32) {
                      if (i != 40) {
                         if (i != 48) {
                            if (i != 56) {
                               if (!WireFormatNano.parseUnknownField(p0, i)) {
                                  break ;
                               }
                            }else {
                               i = p0.readInt32();
                               if (i && (i != 1 && i != 2)) {
                                  continue ;
                               }else {
                                  this.earnTaskStatus = i;
                               }
                            }
                         }else {
                            this.earnTaskType = p0.readUInt32();
                         }
                      }else {
                         i = p0.readInt32();
                         if (i && (i != 1 && i != 2)) {
                            continue ;
                         }else {
                            this.motorSkillStatus = i;
                         }
                      }
                   }else {
                      this.motorSkillId = p0.readUInt32();
                   }
                }else {
                   i = p0.readInt32();
                   if (i && (i != 1 && (i != 2 && i != 3))) {
                      continue ;
                   }else {
                      this.robotStatus = i;
                   }
                }
             }else {
                i = p0.readInt32();
                if (i && (i != 1 && i != 2)) {
                   continue ;
                }else {
                   this.robotType = i;
                }
             }
          }else {
             i = p0.readInt32();
             if (i && (i != 1 && i != 2)) {
                continue ;
             }else {
                this.petSex = i;
             }
          }
       }
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       ClientContent$LiveRobotPackage tpetSex = this.petSex;
       if (tpetSex != null) {
          p0.writeInt32(1, tpetSex);
       }
       tpetSex = this.robotType;
       if (tpetSex != null) {
          p0.writeInt32(2, tpetSex);
       }
       tpetSex = this.robotStatus;
       if (tpetSex != null) {
          p0.writeInt32(3, tpetSex);
       }
       tpetSex = this.motorSkillId;
       if (tpetSex != null) {
          p0.writeUInt32(4, tpetSex);
       }
       tpetSex = this.motorSkillStatus;
       if (tpetSex != null) {
          p0.writeInt32(5, tpetSex);
       }
       tpetSex = this.earnTaskType;
       if (tpetSex != null) {
          p0.writeUInt32(6, tpetSex);
       }
       tpetSex = this.earnTaskStatus;
       if (tpetSex != null) {
          p0.writeInt32(7, tpetSex);
       }
       super.writeTo(p0);
       return;
    }
}
