package com.kwai.video.westeros.models.FaceArea$Builder;
import com.kwai.video.westeros.models.FaceAreaOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.FaceArea;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.FaceArea$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.FaceRect$Builder;
import com.kwai.video.westeros.models.FaceRect;
import java.util.List;
import java.util.Collections;

public final class FaceArea$Builder extends GeneratedMessageLite$Builder implements FaceAreaOrBuilder	// class@000f5d
{

    public void FaceArea$Builder(){
       super(FaceArea.DEFAULT_INSTANCE);
    }
    public void FaceArea$Builder(FaceArea$1 p0){
       super();
    }
    public FaceArea$Builder addAllRects(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllRects(p0);
       return this;
    }
    public FaceArea$Builder addRects(int p0,FaceRect$Builder p1){
       this.copyOnWrite();
       this.instance.addRects(p0, p1);
       return this;
    }
    public FaceArea$Builder addRects(int p0,FaceRect p1){
       this.copyOnWrite();
       this.instance.addRects(p0, p1);
       return this;
    }
    public FaceArea$Builder addRects(FaceRect$Builder p0){
       this.copyOnWrite();
       this.instance.addRects(p0);
       return this;
    }
    public FaceArea$Builder addRects(FaceRect p0){
       this.copyOnWrite();
       this.instance.addRects(p0);
       return this;
    }
    public FaceArea$Builder clearRects(){
       this.copyOnWrite();
       this.instance.clearRects();
       return this;
    }
    public FaceRect getRects(int p0){
       return this.instance.getRects(p0);
    }
    public int getRectsCount(){
       return this.instance.getRectsCount();
    }
    public List getRectsList(){
       return Collections.unmodifiableList(this.instance.getRectsList());
    }
    public FaceArea$Builder removeRects(int p0){
       this.copyOnWrite();
       this.instance.removeRects(p0);
       return this;
    }
    public FaceArea$Builder setRects(int p0,FaceRect$Builder p1){
       this.copyOnWrite();
       this.instance.setRects(p0, p1);
       return this;
    }
    public FaceArea$Builder setRects(int p0,FaceRect p1){
       this.copyOnWrite();
       this.instance.setRects(p0, p1);
       return this;
    }
}
