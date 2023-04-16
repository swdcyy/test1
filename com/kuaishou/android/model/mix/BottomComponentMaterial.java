package com.kuaishou.android.model.mix.BottomComponentMaterial;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.android.model.mix.KMovieTemplate;
import com.kuaishou.android.model.mix.FlashPhotoTemplate;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;

public final class BottomComponentMaterial implements Serializable	// class@000bce
{
    public KMovieTemplate kmovieTemplate;
    public FlashPhotoTemplate mFlashPhotoTemplate;
    public MagicEmoji$MagicFace mMagicFace;
    public int materialType;

    public void BottomComponentMaterial(){
       super();
    }
    public static void getMaterialType$annotations(){
    }
    public final KMovieTemplate getKmovieTemplate(){
       return this.kmovieTemplate;
    }
    public final FlashPhotoTemplate getMFlashPhotoTemplate(){
       return this.mFlashPhotoTemplate;
    }
    public final MagicEmoji$MagicFace getMMagicFace(){
       return this.mMagicFace;
    }
    public final int getMaterialType(){
       return this.materialType;
    }
    public final void setKmovieTemplate(KMovieTemplate p0){
       this.kmovieTemplate = p0;
    }
    public final void setMFlashPhotoTemplate(FlashPhotoTemplate p0){
       this.mFlashPhotoTemplate = p0;
    }
    public final void setMMagicFace(MagicEmoji$MagicFace p0){
       this.mMagicFace = p0;
    }
    public final void setMaterialType(int p0){
       this.materialType = p0;
    }
}
