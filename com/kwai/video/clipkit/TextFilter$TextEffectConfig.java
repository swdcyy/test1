package com.kwai.video.clipkit.TextFilter$TextEffectConfig;
import java.lang.Object;

public class TextFilter$TextEffectConfig	// class@001a4d
{
    public String assetsDir;
    public CGETextEffect$EffectType effectType;
    public String indexFile;
    public boolean needPrelude;
    public int preludeAssetCount;
    public String preludeAssetDir;
    public String preludeAssetPrefix;
    public float preludeEndTime;
    public float preludeStartTime;
    public double startTime;
    public List textLines;
    public double totalDurationTime;

    public void TextFilter$TextEffectConfig(){
       super();
       this.assetsDir = "";
       this.indexFile = "";
       this.needPrelude = false;
       this.preludeAssetCount = 0;
       this.preludeStartTime = 0;
       this.preludeEndTime = 0;
    }
}
