package com.kwai.video.westeros.models.MemojiResultSingleFace$Builder;
import com.kwai.video.westeros.models.MemojiResultSingleFaceOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.MemojiResultSingleFace;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.MemojiResultSingleFace$1;
import com.kwai.video.westeros.models.MemojiHint;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class MemojiResultSingleFace$Builder extends GeneratedMessageLite$Builder implements MemojiResultSingleFaceOrBuilder	// class@000fb9
{

    public void MemojiResultSingleFace$Builder(){
       super(MemojiResultSingleFace.DEFAULT_INSTANCE);
    }
    public void MemojiResultSingleFace$Builder(MemojiResultSingleFace$1 p0){
       super();
    }
    public MemojiResultSingleFace$Builder clearHint(){
       this.copyOnWrite();
       this.instance.clearHint();
       return this;
    }
    public MemojiResultSingleFace$Builder clearResultJson(){
       this.copyOnWrite();
       this.instance.clearResultJson();
       return this;
    }
    public MemojiResultSingleFace$Builder clearSuccess(){
       this.copyOnWrite();
       this.instance.clearSuccess();
       return this;
    }
    public MemojiHint getHint(){
       return this.instance.getHint();
    }
    public int getHintValue(){
       return this.instance.getHintValue();
    }
    public String getResultJson(){
       return this.instance.getResultJson();
    }
    public ByteString getResultJsonBytes(){
       return this.instance.getResultJsonBytes();
    }
    public boolean getSuccess(){
       return this.instance.getSuccess();
    }
    public MemojiResultSingleFace$Builder setHint(MemojiHint p0){
       this.copyOnWrite();
       this.instance.setHint(p0);
       return this;
    }
    public MemojiResultSingleFace$Builder setHintValue(int p0){
       this.copyOnWrite();
       this.instance.setHintValue(p0);
       return this;
    }
    public MemojiResultSingleFace$Builder setResultJson(String p0){
       this.copyOnWrite();
       this.instance.setResultJson(p0);
       return this;
    }
    public MemojiResultSingleFace$Builder setResultJsonBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setResultJsonBytes(p0);
       return this;
    }
    public MemojiResultSingleFace$Builder setSuccess(boolean p0){
       this.copyOnWrite();
       this.instance.setSuccess(p0);
       return this;
    }
}
