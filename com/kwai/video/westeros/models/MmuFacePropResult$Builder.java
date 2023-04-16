package com.kwai.video.westeros.models.MmuFacePropResult$Builder;
import com.kwai.video.westeros.models.MmuFacePropResultOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuFacePropResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuFacePropResult$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.MmuFacePropSingleFace$Builder;
import com.kwai.video.westeros.models.MmuFacePropSingleFace;
import java.util.List;
import java.util.Collections;

public final class MmuFacePropResult$Builder extends GeneratedMessageLite$Builder implements MmuFacePropResultOrBuilder	// class@000fc6
{

    public void MmuFacePropResult$Builder(){
       super(MmuFacePropResult.DEFAULT_INSTANCE);
    }
    public void MmuFacePropResult$Builder(MmuFacePropResult$1 p0){
       super();
    }
    public MmuFacePropResult$Builder addAllFaceProps(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFaceProps(p0);
       return this;
    }
    public MmuFacePropResult$Builder addFaceProps(int p0,MmuFacePropSingleFace$Builder p1){
       this.copyOnWrite();
       this.instance.addFaceProps(p0, p1);
       return this;
    }
    public MmuFacePropResult$Builder addFaceProps(int p0,MmuFacePropSingleFace p1){
       this.copyOnWrite();
       this.instance.addFaceProps(p0, p1);
       return this;
    }
    public MmuFacePropResult$Builder addFaceProps(MmuFacePropSingleFace$Builder p0){
       this.copyOnWrite();
       this.instance.addFaceProps(p0);
       return this;
    }
    public MmuFacePropResult$Builder addFaceProps(MmuFacePropSingleFace p0){
       this.copyOnWrite();
       this.instance.addFaceProps(p0);
       return this;
    }
    public MmuFacePropResult$Builder clearFaceProps(){
       this.copyOnWrite();
       this.instance.clearFaceProps();
       return this;
    }
    public MmuFacePropSingleFace getFaceProps(int p0){
       return this.instance.getFaceProps(p0);
    }
    public int getFacePropsCount(){
       return this.instance.getFacePropsCount();
    }
    public List getFacePropsList(){
       return Collections.unmodifiableList(this.instance.getFacePropsList());
    }
    public MmuFacePropResult$Builder removeFaceProps(int p0){
       this.copyOnWrite();
       this.instance.removeFaceProps(p0);
       return this;
    }
    public MmuFacePropResult$Builder setFaceProps(int p0,MmuFacePropSingleFace$Builder p1){
       this.copyOnWrite();
       this.instance.setFaceProps(p0, p1);
       return this;
    }
    public MmuFacePropResult$Builder setFaceProps(int p0,MmuFacePropSingleFace p1){
       this.copyOnWrite();
       this.instance.setFaceProps(p0, p1);
       return this;
    }
}
