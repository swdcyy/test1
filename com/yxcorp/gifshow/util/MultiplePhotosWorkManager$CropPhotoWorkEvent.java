package com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropWorkInfo;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType;
import java.lang.String;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import com.kuaishou.edit.draft.Workspace$Type;

public class MultiplePhotosWorkManager$CropPhotoWorkEvent	// class@001f01
{
    public final MultiplePhotosWorkManager$CropWorkInfo a;
    public final MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType b;
    public Workspace$Type c;
    public MultiplePhotosProject d;
    public final String e;
    public String f;
    public Size g;

    public void MultiplePhotosWorkManager$CropPhotoWorkEvent(MultiplePhotosWorkManager$CropWorkInfo p0,MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType p1,String p2){
       super();
       this.a = p0;
       this.b = p1;
       this.e = p2;
    }
    public void MultiplePhotosWorkManager$CropPhotoWorkEvent(MultiplePhotosWorkManager$CropWorkInfo p0,MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType p1,String p2,String p3,Size p4){
       super();
       this.a = p0;
       this.b = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
    }
    public MultiplePhotosWorkManager$CropWorkInfo a(){
       return this.a;
    }
    public MultiplePhotosWorkManager$CropPhotoWorkEvent$EventType b(){
       return this.b;
    }
    public String c(){
       return this.e;
    }
    public Workspace$Type d(){
       return this.c;
    }
    public MultiplePhotosWorkManager$CropPhotoWorkEvent e(Workspace$Type p0){
       this.c = p0;
       return this;
    }
}
