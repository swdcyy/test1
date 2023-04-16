package com.kuaishou.edit.draft.b;
import com.google.protobuf.MessageLiteOrBuilder;
import com.kuaishou.edit.draft.Attributes;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.AICutTheme$DpiType;
import com.kuaishou.edit.draft.FeatureId;
import com.kuaishou.edit.draft.Music;
import java.util.List;
import com.kuaishou.edit.draft.RecommendStyle;

public interface abstract b implements MessageLiteOrBuilder	// class@001927
{

    Attributes getAttributes();
    String getChecksum();
    ByteString getChecksumBytes();
    String getColor();
    ByteString getColorBytes();
    String getCoverFile();
    ByteString getCoverFileBytes();
    String getDirectory();
    ByteString getDirectoryBytes();
    AICutTheme$DpiType getDpi();
    int getDpiValue();
    FeatureId getFeatureId();
    boolean getIsRecommend();
    Music getMusics(int p0);
    int getMusicsCount();
    List getMusicsList();
    String getName();
    ByteString getNameBytes();
    RecommendStyle getNewRecommendStyle(int p0);
    int getNewRecommendStyleCount();
    List getNewRecommendStyleList();
    RecommendStyle getRecommendStyle(int p0);
    int getRecommendStyleCount();
    List getRecommendStyleList();
    String getSceneResult();
    ByteString getSceneResultBytes();
    long getSeed();
    Music getSelectedMusic();
    String getVisionEngineResult(int p0);
    ByteString getVisionEngineResultBytes(int p0);
    int getVisionEngineResultCount();
    List getVisionEngineResultList();
    boolean hasAttributes();
    boolean hasFeatureId();
    boolean hasSelectedMusic();
}
