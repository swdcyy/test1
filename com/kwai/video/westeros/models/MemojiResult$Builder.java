package com.kwai.video.westeros.models.MemojiResult$Builder;
import com.kwai.video.westeros.models.MemojiResultOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MemojiResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MemojiResult$1;
import java.lang.Iterable;
import com.kwai.video.westeros.models.MemojiResultSingleFace$Builder;
import com.kwai.video.westeros.models.MemojiResultSingleFace;
import java.util.List;
import java.util.Collections;

public final class MemojiResult$Builder extends GeneratedMessageLite$Builder implements MemojiResultOrBuilder	// class@000fb5
{

    public void MemojiResult$Builder(){
       super(MemojiResult.DEFAULT_INSTANCE);
    }
    public void MemojiResult$Builder(MemojiResult$1 p0){
       super();
    }
    public MemojiResult$Builder addAllMemojiResultSingleFace(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllMemojiResultSingleFace(p0);
       return this;
    }
    public MemojiResult$Builder addMemojiResultSingleFace(int p0,MemojiResultSingleFace$Builder p1){
       this.copyOnWrite();
       this.instance.addMemojiResultSingleFace(p0, p1);
       return this;
    }
    public MemojiResult$Builder addMemojiResultSingleFace(int p0,MemojiResultSingleFace p1){
       this.copyOnWrite();
       this.instance.addMemojiResultSingleFace(p0, p1);
       return this;
    }
    public MemojiResult$Builder addMemojiResultSingleFace(MemojiResultSingleFace$Builder p0){
       this.copyOnWrite();
       this.instance.addMemojiResultSingleFace(p0);
       return this;
    }
    public MemojiResult$Builder addMemojiResultSingleFace(MemojiResultSingleFace p0){
       this.copyOnWrite();
       this.instance.addMemojiResultSingleFace(p0);
       return this;
    }
    public MemojiResult$Builder clearMemojiResultSingleFace(){
       this.copyOnWrite();
       this.instance.clearMemojiResultSingleFace();
       return this;
    }
    public MemojiResultSingleFace getMemojiResultSingleFace(int p0){
       return this.instance.getMemojiResultSingleFace(p0);
    }
    public int getMemojiResultSingleFaceCount(){
       return this.instance.getMemojiResultSingleFaceCount();
    }
    public List getMemojiResultSingleFaceList(){
       return Collections.unmodifiableList(this.instance.getMemojiResultSingleFaceList());
    }
    public MemojiResult$Builder removeMemojiResultSingleFace(int p0){
       this.copyOnWrite();
       this.instance.removeMemojiResultSingleFace(p0);
       return this;
    }
    public MemojiResult$Builder setMemojiResultSingleFace(int p0,MemojiResultSingleFace$Builder p1){
       this.copyOnWrite();
       this.instance.setMemojiResultSingleFace(p0, p1);
       return this;
    }
    public MemojiResult$Builder setMemojiResultSingleFace(int p0,MemojiResultSingleFace p1){
       this.copyOnWrite();
       this.instance.setMemojiResultSingleFace(p0, p1);
       return this;
    }
}
