package com.kuaishou.edit.draft.Frame$b;
import z30.i0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Frame;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Frame$a;

public final class Frame$b extends GeneratedMessageLite$Builder implements i0	// class@0017a7
{

    public void Frame$b(){
       super(Frame.DEFAULT_INSTANCE);
    }
    public void Frame$b(Frame$a p0){
       super(Frame.DEFAULT_INSTANCE);
    }
    public Frame$b a(int p0){
       this.copyOnWrite();
       this.instance.setHeight(p0);
       return this;
    }
    public Frame$b b(int p0){
       this.copyOnWrite();
       this.instance.setWidth(p0);
       return this;
    }
    public Frame$b c(int p0){
       this.copyOnWrite();
       this.instance.setX(p0);
       return this;
    }
    public Frame$b d(int p0){
       this.copyOnWrite();
       this.instance.setY(p0);
       return this;
    }
    public int getHeight(){
       return this.instance.getHeight();
    }
    public int getWidth(){
       return this.instance.getWidth();
    }
    public int getX(){
       return this.instance.getX();
    }
    public int getY(){
       return this.instance.getY();
    }
}
