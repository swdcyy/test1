package com.kwai.video.westeros.models.TransFaceIndex$Builder;
import com.kwai.video.westeros.models.TransFaceIndexOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TransFaceIndex;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TransFaceIndex$1;
import java.lang.Iterable;
import java.util.List;
import java.util.Collections;

public final class TransFaceIndex$Builder extends GeneratedMessageLite$Builder implements TransFaceIndexOrBuilder	// class@00105a
{

    public void TransFaceIndex$Builder(){
       super(TransFaceIndex.DEFAULT_INSTANCE);
    }
    public void TransFaceIndex$Builder(TransFaceIndex$1 p0){
       super();
    }
    public TransFaceIndex$Builder addAllIndex(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllIndex(p0);
       return this;
    }
    public TransFaceIndex$Builder addIndex(int p0){
       this.copyOnWrite();
       this.instance.addIndex(p0);
       return this;
    }
    public TransFaceIndex$Builder clearIndex(){
       this.copyOnWrite();
       this.instance.clearIndex();
       return this;
    }
    public int getIndex(int p0){
       return this.instance.getIndex(p0);
    }
    public int getIndexCount(){
       return this.instance.getIndexCount();
    }
    public List getIndexList(){
       return Collections.unmodifiableList(this.instance.getIndexList());
    }
    public TransFaceIndex$Builder setIndex(int p0,int p1){
       this.copyOnWrite();
       this.instance.setIndex(p0, p1);
       return this;
    }
}
