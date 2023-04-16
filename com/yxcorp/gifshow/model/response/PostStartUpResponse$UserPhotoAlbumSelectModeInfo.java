package com.yxcorp.gifshow.model.response.PostStartUpResponse$UserPhotoAlbumSelectModeInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class PostStartUpResponse$UserPhotoAlbumSelectModeInfo	// class@001f57
{
    public boolean isLastPhotoMultiSelectMode;
    public boolean isLastPhotoSingleSelectMode;
    public boolean isLowActiveUser;

    public void PostStartUpResponse$UserPhotoAlbumSelectModeInfo(){
       super();
       this.isLastPhotoSingleSelectMode = false;
       this.isLastPhotoMultiSelectMode = false;
       this.isLowActiveUser = false;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof PostStartUpResponse$UserPhotoAlbumSelectModeInfo && (this.isLastPhotoSingleSelectMode == p0.isLastPhotoSingleSelectMode && (this.isLastPhotoMultiSelectMode == p0.isLastPhotoMultiSelectMode && this.isLowActiveUser == p0.isLowActiveUser)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       PostStartUpResponse$UserPhotoAlbumSelectModeInfo tisLastPhoto = this.isLastPhotoSingleSelectMode;
       int i = 1;
       if (tisLastPhoto != null) {
          tisLastPhoto = 1;
       }
       int i1 = tisLastPhoto * 31;
       PostStartUpResponse$UserPhotoAlbumSelectModeInfo tisLastPhoto1 = this.isLastPhotoMultiSelectMode;
       if (tisLastPhoto1 != null) {
          tisLastPhoto1 = 1;
       }
       i1 = (i1 + tisLastPhoto1) * 31;
       tisLastPhoto1 = this.isLowActiveUser;
       if (tisLastPhoto1 == null) {
          i = tisLastPhoto1;
       }
       return (i1 + i);
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, PostStartUpResponse$UserPhotoAlbumSelectModeInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "UserPhotoAlbumSelectModeInfo\(isLastPhotoSingleSelectMode="+this.isLastPhotoSingleSelectMode+", isLastPhotoMultiSelectMode="+this.isLastPhotoMultiSelectMode+", isLowActiveUser="+this.isLowActiveUser+"\)";
    }
}
