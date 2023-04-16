package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$a;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import faa.a;
import q87.c;
import tpc.e0;
import java.util.Objects;
import androidx.lifecycle.LiveData;
import com.kuaishou.kotlin.livedata.ListHolder;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import tpc.v$b;
import tpc.e0$a;

public final class VideoCoverProportionViewBinder$a implements Observer	// class@000e9f
{
    public final VideoCoverProportionViewBinder b;

    public void VideoCoverProportionViewBinder$a(VideoCoverProportionViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverProportionViewBinder$a.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             Object[] objArray = new Object[0];
             a.D().w("VideoCoverProportionViewBinder", "mProportionViewModel.mNeedReload is true", objArray);
             p0 = this.b;
             p0.w = false;
             p0.B();
             this.b.E(0);
             p0 = this.b.G();
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, e0.class, "12")) {
                Object[] objArray1 = new Object[0];
                a.D().w("VideoCoverProportionVM", "reloadSelectedRatio", objArray1);
                ListHolder value = p0.a.getValue();
                if (value != null) {
                   List list = value.c();
                   if (list != null) {
                      Iterator iterator = list.iterator();
                      int i = 0;
                      while (iterator.hasNext()) {
                         Object obj = iterator.next();
                         int i1 = i + 1;
                         if (i < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         e0$a value1 = p0.c.getValue();
                         if (value1 != null) {
                            str = value1.c();
                            if (str != null) {
                            label_0090 :
                               if (a.g(obj.a(), str)) {
                                  p0.C0(i, 0);
                               }
                               i = i1;
                            }
                         }
                         str = "";
                         goto label_0090 ;
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
