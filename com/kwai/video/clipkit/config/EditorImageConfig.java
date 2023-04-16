package com.kwai.video.clipkit.config.EditorImageConfig;
import java.lang.Object;

public class EditorImageConfig	// class@001a77
{
    public int atlasExportSize;
    public int atlasPreviewSize;
    public int singleExportSize;
    public int singleImageQuality;
    public int singlePreviewSize;

    public void EditorImageConfig(){
       super();
       this.singleImageQuality = 0;
       this.singlePreviewSize = 0;
       this.singleExportSize = 0;
       this.atlasPreviewSize = 0;
       this.atlasExportSize = 0;
    }
}
