package com.yxcorp.gifshow.util.MultiplePhotosWorkManager$b;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.String;
import android.graphics.Matrix;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$b$a;
import java.util.List;
import java.lang.StringBuilder;

public class MultiplePhotosWorkManager$b	// class@001f06
{
    public final Workspace$Type a;
    public final String b;
    public final List c;
    public final Matrix d;
    public final Size e;
    public final int f;

    public void MultiplePhotosWorkManager$b(Workspace$Type p0,String p1,Matrix p2,Size p3,int p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ArrayList();
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public void a(MultiplePhotosWorkManager$b$a p0){
       this.c.add(p0);
    }
    public Matrix b(){
       return this.d;
    }
    public String toString(){
       return "SinglePhotoCropTask{mType="+this.a+", mOriginPhotoPath=\'"+this.b+'''+", mMatrix="+this.d+", mMaxSize="+this.e+", mQuality="+this.f+'}';
    }
}
