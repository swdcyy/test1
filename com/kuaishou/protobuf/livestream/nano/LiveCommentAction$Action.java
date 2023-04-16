package com.kuaishou.protobuf.livestream.nano.LiveCommentAction$Action;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionFollow;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionKwaiUrlJump;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionLiveRouterJump;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionOpenProfile;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionShowMenu;
import com.kuaishou.protobuf.livestream.nano.LiveCommentAction$ActionWebViewJump;
import com.google.protobuf.nano.WireFormatNano;
import java.lang.Object;
import java.util.Objects;

public final class LiveCommentAction$Action extends MessageNano	// class@000c45
{
    public int entryCase_;
    public Object entry_;
    public static LiveCommentAction$Action[] _emptyArray;

    public void LiveCommentAction$Action(){
       super();
       this.entryCase_ = 0;
       this.clear();
    }
    public static LiveCommentAction$Action[] emptyArray(){
       if (LiveCommentAction$Action._emptyArray == null) {
          Object lAZY_INIT_LO = InternalNano.LAZY_INIT_LOCK;
          _monitor_enter(lAZY_INIT_LO);
          if (LiveCommentAction$Action._emptyArray == null) {
             LiveCommentAction$Action[] uActionArray = new LiveCommentAction$Action[0];
             LiveCommentAction$Action._emptyArray = uActionArray;
          }
          _monitor_exit(lAZY_INIT_LO);
       }
       return LiveCommentAction$Action._emptyArray;
    }
    public static LiveCommentAction$Action parseFrom(CodedInputByteBufferNano p0){
       return new LiveCommentAction$Action().mergeFrom(p0);
    }
    public static LiveCommentAction$Action parseFrom(byte[] p0){
       return MessageNano.mergeFrom(new LiveCommentAction$Action(), p0);
    }
    public LiveCommentAction$Action clear(){
       this.clearEntry();
       this.cachedSize = -1;
       return this;
    }
    public LiveCommentAction$Action clearEntry(){
       this.entryCase_ = 0;
       this.entry_ = 0;
       return this;
    }
    public int computeSerializedSize(){
       int i = super.computeSerializedSize();
       int i1 = 1;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       i1 = 2;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       i1 = 3;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       i1 = 4;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       i1 = 5;
       if (this.entryCase_ == i1) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(i1, this.entry_);
       }
       if (this.entryCase_ == 6) {
          i = i + CodedOutputByteBufferNano.computeMessageSize(6, this.entry_);
       }
       return i;
    }
    public int getEntryCase(){
       return this.entryCase_;
    }
    public LiveCommentAction$ActionFollow getFollow(){
       if (this.entryCase_ == 1) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentAction$ActionKwaiUrlJump getKwaiUrlJump(){
       if (this.entryCase_ == 4) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentAction$ActionLiveRouterJump getLiveRouterJump(){
       if (this.entryCase_ == 6) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentAction$ActionOpenProfile getOpenProfile(){
       if (this.entryCase_ == 3) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentAction$ActionShowMenu getShowMenu(){
       if (this.entryCase_ == 2) {
          return this.entry_;
       }
       return null;
    }
    public LiveCommentAction$ActionWebViewJump getWebViewJump(){
       if (this.entryCase_ == 5) {
          return this.entry_;
       }
       return null;
    }
    public boolean hasFollow(){
       boolean b = true;
       if (this.entryCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean hasKwaiUrlJump(){
       boolean b = (this.entryCase_ == 4)? true: false;
       return b;
    }
    public boolean hasLiveRouterJump(){
       boolean b = (this.entryCase_ == 6)? true: false;
       return b;
    }
    public boolean hasOpenProfile(){
       boolean b = (this.entryCase_ == 3)? true: false;
       return b;
    }
    public boolean hasShowMenu(){
       boolean b = (this.entryCase_ == 2)? true: false;
       return b;
    }
    public boolean hasWebViewJump(){
       boolean b = (this.entryCase_ == 5)? true: false;
       return b;
    }
    public MessageNano mergeFrom(CodedInputByteBufferNano p0){
       return this.mergeFrom(p0);
    }
    public LiveCommentAction$Action mergeFrom(CodedInputByteBufferNano p0){
       int i1;
       while (true) {
          int i = p0.readTag();
          if (!i) {
             return this;
          }
          if (i != 10) {
             if (i != 18) {
                if (i != 26) {
                   if (i != 34) {
                      if (i != 42) {
                         if (i != 50) {
                            if (!WireFormatNano.parseUnknownField(p0, i)) {
                               break ;
                            }
                         }else {
                            i1 = 6;
                            if (this.entryCase_ != i1) {
                               this.entry_ = new LiveCommentAction$ActionLiveRouterJump();
                            }
                            p0.readMessage(this.entry_);
                            this.entryCase_ = i1;
                         }
                      }else {
                         i1 = 5;
                         if (this.entryCase_ != i1) {
                            this.entry_ = new LiveCommentAction$ActionWebViewJump();
                         }
                         p0.readMessage(this.entry_);
                         this.entryCase_ = i1;
                      }
                   }else {
                      i1 = 4;
                      if (this.entryCase_ != i1) {
                         this.entry_ = new LiveCommentAction$ActionKwaiUrlJump();
                      }
                      p0.readMessage(this.entry_);
                      this.entryCase_ = i1;
                   }
                }else {
                   i1 = 3;
                   if (this.entryCase_ != i1) {
                      this.entry_ = new LiveCommentAction$ActionOpenProfile();
                   }
                   p0.readMessage(this.entry_);
                   this.entryCase_ = i1;
                }
             }else {
                i1 = 2;
                if (this.entryCase_ != i1) {
                   this.entry_ = new LiveCommentAction$ActionShowMenu();
                }
                p0.readMessage(this.entry_);
                this.entryCase_ = i1;
             }
          }else {
             i1 = 1;
             if (this.entryCase_ != i1) {
                this.entry_ = new LiveCommentAction$ActionFollow();
             }
             p0.readMessage(this.entry_);
             this.entryCase_ = i1;
          }
       }
       return this;
    }
    public LiveCommentAction$Action setFollow(LiveCommentAction$ActionFollow p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 1;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentAction$Action setKwaiUrlJump(LiveCommentAction$ActionKwaiUrlJump p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 4;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentAction$Action setLiveRouterJump(LiveCommentAction$ActionLiveRouterJump p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 6;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentAction$Action setOpenProfile(LiveCommentAction$ActionOpenProfile p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 3;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentAction$Action setShowMenu(LiveCommentAction$ActionShowMenu p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 2;
       this.entry_ = p0;
       return this;
    }
    public LiveCommentAction$Action setWebViewJump(LiveCommentAction$ActionWebViewJump p0){
       Objects.requireNonNull(p0);
       this.entryCase_ = 5;
       this.entry_ = p0;
       return this;
    }
    public void writeTo(CodedOutputByteBufferNano p0){
       int i = 1;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       i = 2;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       i = 3;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       i = 4;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       i = 5;
       if (this.entryCase_ == i) {
          p0.writeMessage(i, this.entry_);
       }
       if (this.entryCase_ == 6) {
          p0.writeMessage(6, this.entry_);
       }
       super.writeTo(p0);
       return;
    }
}
