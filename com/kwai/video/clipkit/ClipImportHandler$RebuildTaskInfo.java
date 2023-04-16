package com.kwai.video.clipkit.ClipImportHandler$RebuildTaskInfo;
import java.lang.String;
import com.kwai.video.clipkit.ClipImportHandler$TranscodeParams;
import java.lang.Object;

public class ClipImportHandler$RebuildTaskInfo	// class@001a2b
{
    public String exportPath;
    public boolean finished;
    public String importPath;
    public int index;
    public boolean isExportImage;
    public double lastFrameAtPts;
    public double progressPercent;
    public ClipImportHandler$TranscodeParams transcodeParams;

    public void ClipImportHandler$RebuildTaskInfo(String p0,String p1,int p2,ClipImportHandler$TranscodeParams p3){
       super();
       this.transcodeParams = null;
       this.importPath = p0;
       this.exportPath = p1;
       this.index = p2;
       this.finished = false;
       this.transcodeParams = p3;
    }
}
