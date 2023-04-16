package com.kwai.video.ksmemorykit.EditorSmartClipTheme;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.ksmemorykit.EditorSmartClipResourceRule;
import com.kwai.video.ksmemorykit.EditorSmartClipTransitionRule;

public class EditorSmartClipTheme	// class@000901
{
    public String[] mMusicPaths;
    public EditorSmartClipResourceRule mResourceRule;
    public EditorSmartClipTransitionRule mTransitionRule;

    public void EditorSmartClipTheme(){
       super();
    }
    public String[] getMusicPaths(){
       return this.mMusicPaths;
    }
    public EditorSmartClipResourceRule getResourceRule(){
       return this.mResourceRule;
    }
    public EditorSmartClipTransitionRule getTransitionRule(){
       return this.mTransitionRule;
    }
    public void setMusicPaths(String[] p0){
       this.mMusicPaths = p0;
    }
    public void setResourceRule(EditorSmartClipResourceRule p0){
       this.mResourceRule = p0;
    }
    public void setTransitionRule(EditorSmartClipTransitionRule p0){
       this.mTransitionRule = p0;
    }
}
