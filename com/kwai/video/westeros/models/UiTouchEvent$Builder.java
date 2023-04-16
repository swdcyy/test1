package com.kwai.video.westeros.models.UiTouchEvent$Builder;
import com.kwai.video.westeros.models.UiTouchEventOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.UiTouchEvent;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.UiTouchEvent$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.Point2d$Builder;
import com.kwai.video.westeros.models.Point2d;
import java.util.List;
import java.util.Collections;
import com.kwai.video.westeros.models.UiTouchEventType;

public final class UiTouchEvent$Builder extends GeneratedMessageLite$Builder implements UiTouchEventOrBuilder	// class@001076
{

    public void UiTouchEvent$Builder(){
       super(UiTouchEvent.DEFAULT_INSTANCE);
    }
    public void UiTouchEvent$Builder(UiTouchEvent$1 p0){
       super();
    }
    public UiTouchEvent$Builder addAllPoints(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPoints(p0);
       return this;
    }
    public UiTouchEvent$Builder addPoints(int p0,Point2d$Builder p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public UiTouchEvent$Builder addPoints(int p0,Point2d p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public UiTouchEvent$Builder addPoints(Point2d$Builder p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public UiTouchEvent$Builder addPoints(Point2d p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public UiTouchEvent$Builder clearPoints(){
       this.copyOnWrite();
       this.instance.clearPoints();
       return this;
    }
    public UiTouchEvent$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public Point2d getPoints(int p0){
       return this.instance.getPoints(p0);
    }
    public int getPointsCount(){
       return this.instance.getPointsCount();
    }
    public List getPointsList(){
       return Collections.unmodifiableList(this.instance.getPointsList());
    }
    public UiTouchEventType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public UiTouchEvent$Builder removePoints(int p0){
       this.copyOnWrite();
       this.instance.removePoints(p0);
       return this;
    }
    public UiTouchEvent$Builder setPoints(int p0,Point2d$Builder p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public UiTouchEvent$Builder setPoints(int p0,Point2d p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public UiTouchEvent$Builder setType(UiTouchEventType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public UiTouchEvent$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
