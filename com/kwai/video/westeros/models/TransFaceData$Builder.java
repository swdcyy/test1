package com.kwai.video.westeros.models.TransFaceData$Builder;
import com.kwai.video.westeros.models.TransFaceDataOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TransFaceData;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TransFaceData$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.TransFacePoint$Builder;
import com.kwai.video.westeros.models.TransFacePoint;
import java.util.List;
import java.util.Collections;

public final class TransFaceData$Builder extends GeneratedMessageLite$Builder implements TransFaceDataOrBuilder	// class@001056
{

    public void TransFaceData$Builder(){
       super(TransFaceData.DEFAULT_INSTANCE);
    }
    public void TransFaceData$Builder(TransFaceData$1 p0){
       super();
    }
    public TransFaceData$Builder addAllData(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllData(p0);
       return this;
    }
    public TransFaceData$Builder addData(int p0,TransFacePoint$Builder p1){
       this.copyOnWrite();
       this.instance.addData(p0, p1);
       return this;
    }
    public TransFaceData$Builder addData(int p0,TransFacePoint p1){
       this.copyOnWrite();
       this.instance.addData(p0, p1);
       return this;
    }
    public TransFaceData$Builder addData(TransFacePoint$Builder p0){
       this.copyOnWrite();
       this.instance.addData(p0);
       return this;
    }
    public TransFaceData$Builder addData(TransFacePoint p0){
       this.copyOnWrite();
       this.instance.addData(p0);
       return this;
    }
    public TransFaceData$Builder clearData(){
       this.copyOnWrite();
       this.instance.clearData();
       return this;
    }
    public TransFaceData$Builder clearIsMirror(){
       this.copyOnWrite();
       this.instance.clearIsMirror();
       return this;
    }
    public TransFacePoint getData(int p0){
       return this.instance.getData(p0);
    }
    public int getDataCount(){
       return this.instance.getDataCount();
    }
    public List getDataList(){
       return Collections.unmodifiableList(this.instance.getDataList());
    }
    public boolean getIsMirror(){
       return this.instance.getIsMirror();
    }
    public TransFaceData$Builder removeData(int p0){
       this.copyOnWrite();
       this.instance.removeData(p0);
       return this;
    }
    public TransFaceData$Builder setData(int p0,TransFacePoint$Builder p1){
       this.copyOnWrite();
       this.instance.setData(p0, p1);
       return this;
    }
    public TransFaceData$Builder setData(int p0,TransFacePoint p1){
       this.copyOnWrite();
       this.instance.setData(p0, p1);
       return this;
    }
    public TransFaceData$Builder setIsMirror(boolean p0){
       this.copyOnWrite();
       this.instance.setIsMirror(p0);
       return this;
    }
}
