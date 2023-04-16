package com.kwai.video.westeros.customplugin.FacePropConfig;
import java.lang.Object;

public class FacePropConfig	// class@000e77
{
    public boolean needAge;
    public boolean needBeauty;
    public boolean needEmotion;
    public boolean needEye;
    public boolean needGender;
    public boolean needGlass;
    public boolean needMouth;
    public boolean needSmile;

    public void FacePropConfig(){
       super();
       this.needBeauty = false;
       this.needAge = false;
       this.needGlass = false;
       this.needGender = false;
       this.needSmile = false;
       this.needMouth = false;
       this.needEye = false;
       this.needEmotion = false;
    }
}
