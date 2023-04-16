package com.kuaishou.edit.draft.AICutTheme$b;
import com.kuaishou.edit.draft.b;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.AICutTheme;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.AICutTheme$a;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.AICutTheme$DpiType;
import com.kuaishou.edit.draft.Music;
import java.util.List;
import java.util.Collections;
import com.kuaishou.edit.draft.RecommendStyle;

public final class AICutTheme$b extends GeneratedMessageLite$Builder implements b	// class@0016fb
{

    public void AICutTheme$b(){
       super(AICutTheme.DEFAULT_INSTANCE);
    }
    public void AICutTheme$b(AICutTheme$a p0){
       super(AICutTheme.DEFAULT_INSTANCE);
    }
    public AICutTheme$b a(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public AICutTheme$b b(FeatureId p0){
       this.copyOnWrite();
       this.instance.setFeatureId(p0);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public String getChecksum(){
       return this.instance.getChecksum();
    }
    public ByteString getChecksumBytes(){
       return this.instance.getChecksumBytes();
    }
    public String getColor(){
       return this.instance.getColor();
    }
    public ByteString getColorBytes(){
       return this.instance.getColorBytes();
    }
    public String getCoverFile(){
       return this.instance.getCoverFile();
    }
    public ByteString getCoverFileBytes(){
       return this.instance.getCoverFileBytes();
    }
    public String getDirectory(){
       return this.instance.getDirectory();
    }
    public ByteString getDirectoryBytes(){
       return this.instance.getDirectoryBytes();
    }
    public AICutTheme$DpiType getDpi(){
       return this.instance.getDpi();
    }
    public int getDpiValue(){
       return this.instance.getDpiValue();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public boolean getIsRecommend(){
       return this.instance.getIsRecommend();
    }
    public Music getMusics(int p0){
       return this.instance.getMusics(p0);
    }
    public int getMusicsCount(){
       return this.instance.getMusicsCount();
    }
    public List getMusicsList(){
       return Collections.unmodifiableList(this.instance.getMusicsList());
    }
    public String getName(){
       return this.instance.getName();
    }
    public ByteString getNameBytes(){
       return this.instance.getNameBytes();
    }
    public RecommendStyle getNewRecommendStyle(int p0){
       return this.instance.getNewRecommendStyle(p0);
    }
    public int getNewRecommendStyleCount(){
       return this.instance.getNewRecommendStyleCount();
    }
    public List getNewRecommendStyleList(){
       return Collections.unmodifiableList(this.instance.getNewRecommendStyleList());
    }
    public RecommendStyle getRecommendStyle(int p0){
       return this.instance.getRecommendStyle(p0);
    }
    public int getRecommendStyleCount(){
       return this.instance.getRecommendStyleCount();
    }
    public List getRecommendStyleList(){
       return Collections.unmodifiableList(this.instance.getRecommendStyleList());
    }
    public String getSceneResult(){
       return this.instance.getSceneResult();
    }
    public ByteString getSceneResultBytes(){
       return this.instance.getSceneResultBytes();
    }
    public long getSeed(){
       return this.instance.getSeed();
    }
    public Music getSelectedMusic(){
       return this.instance.getSelectedMusic();
    }
    public String getVisionEngineResult(int p0){
       return this.instance.getVisionEngineResult(p0);
    }
    public ByteString getVisionEngineResultBytes(int p0){
       return this.instance.getVisionEngineResultBytes(p0);
    }
    public int getVisionEngineResultCount(){
       return this.instance.getVisionEngineResultCount();
    }
    public List getVisionEngineResultList(){
       return Collections.unmodifiableList(this.instance.getVisionEngineResultList());
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
    public boolean hasSelectedMusic(){
       return this.instance.hasSelectedMusic();
    }
}
