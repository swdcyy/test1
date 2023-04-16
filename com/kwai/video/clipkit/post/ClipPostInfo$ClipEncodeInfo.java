package com.kwai.video.clipkit.post.ClipPostInfo$ClipEncodeInfo;
import java.lang.Object;
import com.kwai.video.clipkit.post.ClipPostInfo$1;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.editorsdk2.model.nano.EditorSdk2$ExportOptions;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2UtilsV2;

public class ClipPostInfo$ClipEncodeInfo	// class@001add
{
    public String capeSessionId;
    public String comment;
    public EditorSdk2$ExportOptions exportOptions;
    public int exportOptionsFlag;
    public int exportShapeType;
    public ExternalFilterRequestListenerV2 externalFilterRequestListenerV2;
    public boolean forceCloseCape;
    public LocalExportOption localExportOption;
    public EditorSdk2V2$VideoEditorProject project;
    public int remuxFlag;
    public int videoType;

    public void ClipPostInfo$ClipEncodeInfo(){
       super();
       this.capeSessionId = "";
       this.exportOptionsFlag = 0;
       this.exportShapeType = 1;
       this.forceCloseCape = false;
    }
    public void ClipPostInfo$ClipEncodeInfo(ClipPostInfo$1 p0){
       super();
    }
    public void ClipPostInfo$ClipEncodeInfo(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1,int p2){
       super(p0, p1, p2, 0);
    }
    public void ClipPostInfo$ClipEncodeInfo(EditorSdk2V2$VideoEditorProject p0,EditorSdk2$ExportOptions p1,int p2,int p3){
       super();
       this.capeSessionId = "";
       this.exportOptionsFlag = 0;
       this.exportShapeType = 1;
       this.forceCloseCape = false;
       this.project = p0;
       this.exportOptions = p1;
       this.videoType = p2;
       this.remuxFlag = p3;
    }
    public void ClipPostInfo$ClipEncodeInfo(String p0){
       super(EditorSdk2UtilsV2.createProjectWithFile(p0), null, 1);
    }
    public void ClipPostInfo$ClipEncodeInfo(String[] p0){
       super(EditorSdk2UtilsV2.createProjectWithPhotoArray(p0), null, 3);
    }
}
