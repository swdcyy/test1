package com.kwai.video.ksmemorykit.EditorMemoryResultImpl;
import com.kwai.video.ksmemorykit.EditorMemoryResult;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;

public class EditorMemoryResultImpl implements EditorMemoryResult	// class@0008f1
{
    public String mAnalyzeResultMessage;
    public String mBgmType;
    public EditorSdk2V2$VideoEditorProject mProject;

    public void EditorMemoryResultImpl(){
       super();
    }
    public String getAnalyzeResultMessage(){
       return this.mAnalyzeResultMessage;
    }
    public String getAnalyzedBgmType(){
       return this.mBgmType;
    }
    public EditorSdk2V2$VideoEditorProject getEditorProject(){
       return this.mProject;
    }
    public void setAnalyzeResultMessage(String p0){
       this.mAnalyzeResultMessage = p0;
    }
    public void setBgmType(String p0){
       this.mBgmType = p0;
    }
    public void setProject(EditorSdk2V2$VideoEditorProject p0){
       this.mProject = p0;
    }
}
