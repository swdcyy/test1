package com.yxcorp.gifshow.util.z$g;
import com.yxcorp.gifshow.util.z;
import java.lang.String;
import android.graphics.Matrix;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import java.lang.Object;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$b;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.ArrayList;

public class z$g	// class@001fc1
{
    public MultiplePhotosWorkManager$b a;
    public MultiplePhotosWorkManager$b b;
    public List c;
    public List d;
    public final z e;

    public void z$g(z p0,String p1,Matrix p2,Size p3,int p4){
       Matrix matrix;
       int i = this;
       i.e = p0;
       super();
       Object[] objArray = new Object[0];
       a.D().w("MultiplePhotosHelper", "PreloadResult originPhotoPath:"+p1+",matrix:"+p2+",maxSize:"+p3+",quality:"+p4, objArray);
       String str = p1;
       matrix = p2;
       Size size = p3;
       int i1 = p4;
       MultiplePhotosWorkManager$b uob = new MultiplePhotosWorkManager$b(Workspace$Type.LONG_PICTURE, str, matrix, size, i1);
       i.b = v1;
       uob = new MultiplePhotosWorkManager$b(Workspace$Type.ATLAS, str, matrix, size, i1);
       i.a = v1;
       i.c = new ArrayList();
       i.d = new ArrayList();
    }
}
