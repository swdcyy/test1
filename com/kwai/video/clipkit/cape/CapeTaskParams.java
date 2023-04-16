package com.kwai.video.clipkit.cape.CapeTaskParams;
import java.lang.Object;

public class CapeTaskParams	// class@001a5b
{
    public boolean canSkipTranscode;
    public String exportDir;
    public EditorSdk2$ExportOptions exportOptions;
    public String exportPath;
    public EditorSdk2V2$VideoEditorProject project;
    public int videoType;

    public void CapeTaskParams(){
       super();
       this.canSkipTranscode = false;
       this.exportDir = "";
       this.exportPath = "";
       this.exportOptions = null;
       this.project = null;
       this.videoType = 0;
    }
}
