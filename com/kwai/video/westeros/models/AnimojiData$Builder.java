package com.kwai.video.westeros.models.AnimojiData$Builder;
import com.kwai.video.westeros.models.AnimojiDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.AnimojiData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.AnimojiData$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.AnimojiOutFace$Builder;
import com.kwai.video.westeros.models.AnimojiOutFace;
import java.util.List;
import java.util.Collections;

public final class AnimojiData$Builder extends GeneratedMessageLite$Builder implements AnimojiDataOrBuilder	// class@000e9c
{

    public void AnimojiData$Builder(){
       super(AnimojiData.DEFAULT_INSTANCE);
    }
    public void AnimojiData$Builder(AnimojiData$1 p0){
       super();
    }
    public AnimojiData$Builder addAllDatas(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllDatas(p0);
       return this;
    }
    public AnimojiData$Builder addDatas(int p0,AnimojiOutFace$Builder p1){
       this.copyOnWrite();
       this.instance.addDatas(p0, p1);
       return this;
    }
    public AnimojiData$Builder addDatas(int p0,AnimojiOutFace p1){
       this.copyOnWrite();
       this.instance.addDatas(p0, p1);
       return this;
    }
    public AnimojiData$Builder addDatas(AnimojiOutFace$Builder p0){
       this.copyOnWrite();
       this.instance.addDatas(p0);
       return this;
    }
    public AnimojiData$Builder addDatas(AnimojiOutFace p0){
       this.copyOnWrite();
       this.instance.addDatas(p0);
       return this;
    }
    public AnimojiData$Builder clearDatas(){
       this.copyOnWrite();
       this.instance.clearDatas();
       return this;
    }
    public AnimojiOutFace getDatas(int p0){
       return this.instance.getDatas(p0);
    }
    public int getDatasCount(){
       return this.instance.getDatasCount();
    }
    public List getDatasList(){
       return Collections.unmodifiableList(this.instance.getDatasList());
    }
    public AnimojiData$Builder removeDatas(int p0){
       this.copyOnWrite();
       this.instance.removeDatas(p0);
       return this;
    }
    public AnimojiData$Builder setDatas(int p0,AnimojiOutFace$Builder p1){
       this.copyOnWrite();
       this.instance.setDatas(p0, p1);
       return this;
    }
    public AnimojiData$Builder setDatas(int p0,AnimojiOutFace p1){
       this.copyOnWrite();
       this.instance.setDatas(p0, p1);
       return this;
    }
}
