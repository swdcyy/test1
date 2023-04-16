package com.kwai.video.westeros.models.MmuFaces$Builder;
import com.kwai.video.westeros.models.MmuFacesOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MmuFaces;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MmuFaces$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.MmuFace$Builder;
import com.kwai.video.westeros.models.MmuFace;
import java.util.List;
import java.util.Collections;

public final class MmuFaces$Builder extends GeneratedMessageLite$Builder implements MmuFacesOrBuilder	// class@000fce
{

    public void MmuFaces$Builder(){
       super(MmuFaces.DEFAULT_INSTANCE);
    }
    public void MmuFaces$Builder(MmuFaces$1 p0){
       super();
    }
    public MmuFaces$Builder addAllFace(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFace(p0);
       return this;
    }
    public MmuFaces$Builder addFace(int p0,MmuFace$Builder p1){
       this.copyOnWrite();
       this.instance.addFace(p0, p1);
       return this;
    }
    public MmuFaces$Builder addFace(int p0,MmuFace p1){
       this.copyOnWrite();
       this.instance.addFace(p0, p1);
       return this;
    }
    public MmuFaces$Builder addFace(MmuFace$Builder p0){
       this.copyOnWrite();
       this.instance.addFace(p0);
       return this;
    }
    public MmuFaces$Builder addFace(MmuFace p0){
       this.copyOnWrite();
       this.instance.addFace(p0);
       return this;
    }
    public MmuFaces$Builder clearFace(){
       this.copyOnWrite();
       this.instance.clearFace();
       return this;
    }
    public MmuFace getFace(int p0){
       return this.instance.getFace(p0);
    }
    public int getFaceCount(){
       return this.instance.getFaceCount();
    }
    public List getFaceList(){
       return Collections.unmodifiableList(this.instance.getFaceList());
    }
    public MmuFaces$Builder removeFace(int p0){
       this.copyOnWrite();
       this.instance.removeFace(p0);
       return this;
    }
    public MmuFaces$Builder setFace(int p0,MmuFace$Builder p1){
       this.copyOnWrite();
       this.instance.setFace(p0, p1);
       return this;
    }
    public MmuFaces$Builder setFace(int p0,MmuFace p1){
       this.copyOnWrite();
       this.instance.setFace(p0, p1);
       return this;
    }
}
