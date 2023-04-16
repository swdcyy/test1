package com.kwai.video.clipkit.config.EditorEncodeConfig$MVImportParams;
import java.lang.Object;
import com.kwai.video.clipkit.config.EditorEncodeConfig$FallBackCondition;

public class EditorEncodeConfig$MVImportParams	// class@001a67
{
    public EditorEncodeConfig$FallBackCondition fallbackCondition;
    public EditorEncodeConfig$MVTranscodeParams transcode1080p;
    public EditorEncodeConfig$MVTranscodeParams transcode576p;
    public EditorEncodeConfig$MVTranscodeParams transcode720p;
    public int version;

    public void EditorEncodeConfig$MVImportParams(){
       super();
       this.fallbackCondition = new EditorEncodeConfig$FallBackCondition();
       this.version = 1;
    }
}
