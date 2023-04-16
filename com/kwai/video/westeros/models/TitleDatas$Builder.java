package com.kwai.video.westeros.models.TitleDatas$Builder;
import com.kwai.video.westeros.models.TitleDatasOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.video.westeros.models.TitleDatas;
import com.google.protobuf.GeneratedMessageLite;
import com.kwai.video.westeros.models.TitleDatas$1;
import java.lang.String;
import com.google.protobuf.ByteString;

public final class TitleDatas$Builder extends GeneratedMessageLite$Builder implements TitleDatasOrBuilder	// class@00104e
{

    public void TitleDatas$Builder(){
       super(TitleDatas.DEFAULT_INSTANCE);
    }
    public void TitleDatas$Builder(TitleDatas$1 p0){
       super();
    }
    public TitleDatas$Builder clearFirstInput(){
       this.copyOnWrite();
       this.instance.clearFirstInput();
       return this;
    }
    public TitleDatas$Builder clearModify(){
       this.copyOnWrite();
       this.instance.clearModify();
       return this;
    }
    public String getFirstInput(){
       return this.instance.getFirstInput();
    }
    public ByteString getFirstInputBytes(){
       return this.instance.getFirstInputBytes();
    }
    public String getModify(){
       return this.instance.getModify();
    }
    public ByteString getModifyBytes(){
       return this.instance.getModifyBytes();
    }
    public TitleDatas$Builder setFirstInput(String p0){
       this.copyOnWrite();
       this.instance.setFirstInput(p0);
       return this;
    }
    public TitleDatas$Builder setFirstInputBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setFirstInputBytes(p0);
       return this;
    }
    public TitleDatas$Builder setModify(String p0){
       this.copyOnWrite();
       this.instance.setModify(p0);
       return this;
    }
    public TitleDatas$Builder setModifyBytes(ByteString p0){
       this.copyOnWrite();
       this.instance.setModifyBytes(p0);
       return this;
    }
}
