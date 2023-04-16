package com.kwai.video.westeros.models.YcnnFaceAttributeResult$Builder;
import com.kwai.video.westeros.models.YcnnFaceAttributeResultOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YcnnFaceAttributeResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YcnnFaceAttributeResult$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo$Builder;
import com.kwai.video.westeros.models.YcnnFaceAttributeInfo;
import java.util.List;
import java.util.Collections;

public final class YcnnFaceAttributeResult$Builder extends GeneratedMessageLite$Builder implements YcnnFaceAttributeResultOrBuilder	// class@0010a9
{

    public void YcnnFaceAttributeResult$Builder(){
       super(YcnnFaceAttributeResult.DEFAULT_INSTANCE);
    }
    public void YcnnFaceAttributeResult$Builder(YcnnFaceAttributeResult$1 p0){
       super();
    }
    public YcnnFaceAttributeResult$Builder addAllFaceAttributes(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFaceAttributes(p0);
       return this;
    }
    public YcnnFaceAttributeResult$Builder addFaceAttributes(int p0,YcnnFaceAttributeInfo$Builder p1){
       this.copyOnWrite();
       this.instance.addFaceAttributes(p0, p1);
       return this;
    }
    public YcnnFaceAttributeResult$Builder addFaceAttributes(int p0,YcnnFaceAttributeInfo p1){
       this.copyOnWrite();
       this.instance.addFaceAttributes(p0, p1);
       return this;
    }
    public YcnnFaceAttributeResult$Builder addFaceAttributes(YcnnFaceAttributeInfo$Builder p0){
       this.copyOnWrite();
       this.instance.addFaceAttributes(p0);
       return this;
    }
    public YcnnFaceAttributeResult$Builder addFaceAttributes(YcnnFaceAttributeInfo p0){
       this.copyOnWrite();
       this.instance.addFaceAttributes(p0);
       return this;
    }
    public YcnnFaceAttributeResult$Builder clearFaceAttributes(){
       this.copyOnWrite();
       this.instance.clearFaceAttributes();
       return this;
    }
    public YcnnFaceAttributeInfo getFaceAttributes(int p0){
       return this.instance.getFaceAttributes(p0);
    }
    public int getFaceAttributesCount(){
       return this.instance.getFaceAttributesCount();
    }
    public List getFaceAttributesList(){
       return Collections.unmodifiableList(this.instance.getFaceAttributesList());
    }
    public YcnnFaceAttributeResult$Builder removeFaceAttributes(int p0){
       this.copyOnWrite();
       this.instance.removeFaceAttributes(p0);
       return this;
    }
    public YcnnFaceAttributeResult$Builder setFaceAttributes(int p0,YcnnFaceAttributeInfo$Builder p1){
       this.copyOnWrite();
       this.instance.setFaceAttributes(p0, p1);
       return this;
    }
    public YcnnFaceAttributeResult$Builder setFaceAttributes(int p0,YcnnFaceAttributeInfo p1){
       this.copyOnWrite();
       this.instance.setFaceAttributes(p0, p1);
       return this;
    }
}
