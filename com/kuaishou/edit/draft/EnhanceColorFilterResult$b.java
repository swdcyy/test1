package com.kuaishou.edit.draft.EnhanceColorFilterResult$b;
import z30.c0;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.EnhanceColorFilterResult;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.EnhanceColorFilterResult$a;
import java.lang.String;
import com.google.protobuf.ByteString;
import java.util.List;
import java.util.Collections;

public final class EnhanceColorFilterResult$b extends GeneratedMessageLite$Builder implements c0	// class@001786
{

    public void EnhanceColorFilterResult$b(){
       super(EnhanceColorFilterResult.DEFAULT_INSTANCE);
    }
    public void EnhanceColorFilterResult$b(EnhanceColorFilterResult$a p0){
       super(EnhanceColorFilterResult.DEFAULT_INSTANCE);
    }
    public EnhanceColorFilterResult$b a(int p0){
       this.copyOnWrite();
       this.instance.setEnhanceLevel(p0);
       return this;
    }
    public EnhanceColorFilterResult$b b(boolean p0){
       this.copyOnWrite();
       this.instance.setUseResultLut(p0);
       return this;
    }
    public String getAnalysisResultsResources(int p0){
       return this.instance.getAnalysisResultsResources(p0);
    }
    public ByteString getAnalysisResultsResourcesBytes(int p0){
       return this.instance.getAnalysisResultsResourcesBytes(p0);
    }
    public int getAnalysisResultsResourcesCount(){
       return this.instance.getAnalysisResultsResourcesCount();
    }
    public List getAnalysisResultsResourcesList(){
       return Collections.unmodifiableList(this.instance.getAnalysisResultsResourcesList());
    }
    public int getEnhanceLevel(){
       return this.instance.getEnhanceLevel();
    }
    public boolean getUseResultLut(){
       return this.instance.getUseResultLut();
    }
}
