package com.kwai.video.ksmemorykit.EditorEnhanceResultImpl;
import com.kwai.video.ksmemorykit.EditorEnhanceResult;
import java.lang.String;
import com.kwai.kve.LutEnhancer$EnhanceLut;
import java.lang.Object;

public class EditorEnhanceResultImpl implements EditorEnhanceResult	// class@0008e4
{
    public LutEnhancer$EnhanceLut mEnhanceLut;
    public String mLutFilePath;

    public void EditorEnhanceResultImpl(String p0,LutEnhancer$EnhanceLut p1){
       super();
       this.mLutFilePath = p0;
       this.mEnhanceLut = p1;
    }
    public LutEnhancer$EnhanceLut getEnhanceLut(){
       return this.mEnhanceLut;
    }
    public String getLutFilePath(){
       return this.mLutFilePath;
    }
}
