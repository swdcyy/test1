package com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel$b;
import nwc.k;
import com.yxcorp.gifshow.v3.editor.reorder.vm.ReorderViewModel;
import java.lang.Object;
import com.yxcorp.gifshow.util.MultiplePhotosWorkManager$CropPhotoWorkEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nwc.j;
import java.util.Objects;
import atc.a;
import java.util.ArrayList;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import java.util.Collection;
import java.lang.Integer;
import di0.b;

public final class ReorderViewModel$b implements k	// class@0011b9
{
    public final ReorderViewModel a;

    public void ReorderViewModel$b(ReorderViewModel p0){
       this.a = p0;
       super();
    }
    public void a(MultiplePhotosWorkManager$CropPhotoWorkEvent p0){
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderViewModel$b.class, "1")) {
          return;
       }
       j.b(this, p0);
       ReorderViewModel m = this.a.m;
       Objects.requireNonNull(m);
       if (!PatchProxy.applyVoid(null, m, a.class, "2")) {
          a b = m.b;
          ListHolder value = m.b.getValue();
          if (value != null) {
             list = value.c();
             if (list != null) {
             label_003b :
                b.s(new ArrayList(list), Integer.valueOf(2));
             }
          }
          list = new ArrayList();
          goto label_003b ;
       }
       return;
    }
    public void b(MultiplePhotosWorkManager$CropPhotoWorkEvent p0){
       j.a(this, p0);
    }
}
