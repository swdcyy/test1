package com.kwai.video.westeros.models.YCNNFaces$Builder;
import com.kwai.video.westeros.models.YCNNFacesOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.YCNNFaces;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.YCNNFaces$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.YCNNFace$Builder;
import com.kwai.video.westeros.models.YCNNFace;
import java.util.List;
import java.util.Collections;

public final class YCNNFaces$Builder extends GeneratedMessageLite$Builder implements YCNNFacesOrBuilder	// class@001091
{

    public void YCNNFaces$Builder(){
       super(YCNNFaces.DEFAULT_INSTANCE);
    }
    public void YCNNFaces$Builder(YCNNFaces$1 p0){
       super();
    }
    public YCNNFaces$Builder addAllFace(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllFace(p0);
       return this;
    }
    public YCNNFaces$Builder addFace(int p0,YCNNFace$Builder p1){
       this.copyOnWrite();
       this.instance.addFace(p0, p1);
       return this;
    }
    public YCNNFaces$Builder addFace(int p0,YCNNFace p1){
       this.copyOnWrite();
       this.instance.addFace(p0, p1);
       return this;
    }
    public YCNNFaces$Builder addFace(YCNNFace$Builder p0){
       this.copyOnWrite();
       this.instance.addFace(p0);
       return this;
    }
    public YCNNFaces$Builder addFace(YCNNFace p0){
       this.copyOnWrite();
       this.instance.addFace(p0);
       return this;
    }
    public YCNNFaces$Builder clearFace(){
       this.copyOnWrite();
       this.instance.clearFace();
       return this;
    }
    public YCNNFace getFace(int p0){
       return this.instance.getFace(p0);
    }
    public int getFaceCount(){
       return this.instance.getFaceCount();
    }
    public List getFaceList(){
       return Collections.unmodifiableList(this.instance.getFaceList());
    }
    public YCNNFaces$Builder removeFace(int p0){
       this.copyOnWrite();
       this.instance.removeFace(p0);
       return this;
    }
    public YCNNFaces$Builder setFace(int p0,YCNNFace$Builder p1){
       this.copyOnWrite();
       this.instance.setFace(p0, p1);
       return this;
    }
    public YCNNFaces$Builder setFace(int p0,YCNNFace p1){
       this.copyOnWrite();
       this.instance.setFace(p0, p1);
       return this;
    }
}
