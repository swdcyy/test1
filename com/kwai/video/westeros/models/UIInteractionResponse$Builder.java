package com.kwai.video.westeros.models.UIInteractionResponse$Builder;
import com.kwai.video.westeros.models.UIInteractionResponseOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.UIInteractionResponse;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.UIInteractionResponse$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.Point$Builder;
import com.kwai.video.westeros.models.Point;
import java.util.List;
import java.util.Collections;
import com.kwai.video.westeros.models.UIInteractionResponseType;

public final class UIInteractionResponse$Builder extends GeneratedMessageLite$Builder implements UIInteractionResponseOrBuilder	// class@00106f
{

    public void UIInteractionResponse$Builder(){
       super(UIInteractionResponse.DEFAULT_INSTANCE);
    }
    public void UIInteractionResponse$Builder(UIInteractionResponse$1 p0){
       super();
    }
    public UIInteractionResponse$Builder addAllPoints(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllPoints(p0);
       return this;
    }
    public UIInteractionResponse$Builder addPoints(int p0,Point$Builder p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public UIInteractionResponse$Builder addPoints(int p0,Point p1){
       this.copyOnWrite();
       this.instance.addPoints(p0, p1);
       return this;
    }
    public UIInteractionResponse$Builder addPoints(Point$Builder p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public UIInteractionResponse$Builder addPoints(Point p0){
       this.copyOnWrite();
       this.instance.addPoints(p0);
       return this;
    }
    public UIInteractionResponse$Builder clearPoints(){
       this.copyOnWrite();
       this.instance.clearPoints();
       return this;
    }
    public UIInteractionResponse$Builder clearType(){
       this.copyOnWrite();
       this.instance.clearType();
       return this;
    }
    public Point getPoints(int p0){
       return this.instance.getPoints(p0);
    }
    public int getPointsCount(){
       return this.instance.getPointsCount();
    }
    public List getPointsList(){
       return Collections.unmodifiableList(this.instance.getPointsList());
    }
    public UIInteractionResponseType getType(){
       return this.instance.getType();
    }
    public int getTypeValue(){
       return this.instance.getTypeValue();
    }
    public UIInteractionResponse$Builder removePoints(int p0){
       this.copyOnWrite();
       this.instance.removePoints(p0);
       return this;
    }
    public UIInteractionResponse$Builder setPoints(int p0,Point$Builder p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public UIInteractionResponse$Builder setPoints(int p0,Point p1){
       this.copyOnWrite();
       this.instance.setPoints(p0, p1);
       return this;
    }
    public UIInteractionResponse$Builder setType(UIInteractionResponseType p0){
       this.copyOnWrite();
       this.instance.setType(p0);
       return this;
    }
    public UIInteractionResponse$Builder setTypeValue(int p0){
       this.copyOnWrite();
       this.instance.setTypeValue(p0);
       return this;
    }
}
