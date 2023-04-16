package com.kwai.video.westeros.models.SalientData$Builder;
import com.kwai.video.westeros.models.SalientDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.SalientData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.SalientData$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.SalientInfo$Builder;
import com.kwai.video.westeros.models.SalientInfo;
import java.util.List;
import java.util.Collections;

public final class SalientData$Builder extends GeneratedMessageLite$Builder implements SalientDataOrBuilder	// class@001032
{

    public void SalientData$Builder(){
       super(SalientData.DEFAULT_INSTANCE);
    }
    public void SalientData$Builder(SalientData$1 p0){
       super();
    }
    public SalientData$Builder addAllInfos(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllInfos(p0);
       return this;
    }
    public SalientData$Builder addInfos(int p0,SalientInfo$Builder p1){
       this.copyOnWrite();
       this.instance.addInfos(p0, p1);
       return this;
    }
    public SalientData$Builder addInfos(int p0,SalientInfo p1){
       this.copyOnWrite();
       this.instance.addInfos(p0, p1);
       return this;
    }
    public SalientData$Builder addInfos(SalientInfo$Builder p0){
       this.copyOnWrite();
       this.instance.addInfos(p0);
       return this;
    }
    public SalientData$Builder addInfos(SalientInfo p0){
       this.copyOnWrite();
       this.instance.addInfos(p0);
       return this;
    }
    public SalientData$Builder clearFarScene(){
       this.copyOnWrite();
       this.instance.clearFarScene();
       return this;
    }
    public SalientData$Builder clearInfos(){
       this.copyOnWrite();
       this.instance.clearInfos();
       return this;
    }
    public int getFarScene(){
       return this.instance.getFarScene();
    }
    public SalientInfo getInfos(int p0){
       return this.instance.getInfos(p0);
    }
    public int getInfosCount(){
       return this.instance.getInfosCount();
    }
    public List getInfosList(){
       return Collections.unmodifiableList(this.instance.getInfosList());
    }
    public SalientData$Builder removeInfos(int p0){
       this.copyOnWrite();
       this.instance.removeInfos(p0);
       return this;
    }
    public SalientData$Builder setFarScene(int p0){
       this.copyOnWrite();
       this.instance.setFarScene(p0);
       return this;
    }
    public SalientData$Builder setInfos(int p0,SalientInfo$Builder p1){
       this.copyOnWrite();
       this.instance.setInfos(p0, p1);
       return this;
    }
    public SalientData$Builder setInfos(int p0,SalientInfo p1){
       this.copyOnWrite();
       this.instance.setInfos(p0, p1);
       return this;
    }
}
