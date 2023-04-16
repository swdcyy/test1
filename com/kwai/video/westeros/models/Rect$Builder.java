package com.kwai.video.westeros.models.Rect$Builder;
import com.kwai.video.westeros.models.RectOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.Rect;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.Rect$1;

public final class Rect$Builder extends GeneratedMessageLite$Builder implements RectOrBuilder	// class@001023
{

    public void Rect$Builder(){
       super(Rect.DEFAULT_INSTANCE);
    }
    public void Rect$Builder(Rect$1 p0){
       super();
    }
    public Rect$Builder clearBottom(){
       this.copyOnWrite();
       this.instance.clearBottom();
       return this;
    }
    public Rect$Builder clearLeft(){
       this.copyOnWrite();
       this.instance.clearLeft();
       return this;
    }
    public Rect$Builder clearRight(){
       this.copyOnWrite();
       this.instance.clearRight();
       return this;
    }
    public Rect$Builder clearTop(){
       this.copyOnWrite();
       this.instance.clearTop();
       return this;
    }
    public float getBottom(){
       return this.instance.getBottom();
    }
    public float getLeft(){
       return this.instance.getLeft();
    }
    public float getRight(){
       return this.instance.getRight();
    }
    public float getTop(){
       return this.instance.getTop();
    }
    public Rect$Builder setBottom(float p0){
       this.copyOnWrite();
       this.instance.setBottom(p0);
       return this;
    }
    public Rect$Builder setLeft(float p0){
       this.copyOnWrite();
       this.instance.setLeft(p0);
       return this;
    }
    public Rect$Builder setRight(float p0){
       this.copyOnWrite();
       this.instance.setRight(p0);
       return this;
    }
    public Rect$Builder setTop(float p0){
       this.copyOnWrite();
       this.instance.setTop(p0);
       return this;
    }
}
