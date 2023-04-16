package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$f;
import qwc.i$a;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import qwc.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$f$a;
import erd.r;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.view.View$OnTouchListener;
import com.yxcrop.gifshow.v3.editor.decoration_v2.ui.pic.PictureFakeView;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public final class AtlasOrSinglePictureSubViewBinder$f implements i$a	// class@000b3c
{
    public final AtlasOrSinglePictureSubViewBinder a;

    public void AtlasOrSinglePictureSubViewBinder$f(AtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public void a(h p0,int p1){
       AtlasOrSinglePictureSubViewBinder$f uof = AtlasOrSinglePictureSubViewBinder$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "1")) {
          return;
       }
       a.p(p0, "holder");
       ViewGroup viewGroup = p0.itemView.findViewById(R.id.text_fake_view_container);
       if (viewGroup != null) {
          List list = this.a.h.o0(new AtlasOrSinglePictureSubViewBinder$f$a(CollectionsKt___CollectionsKt.F2(this.a.G(), p1)));
          viewGroup.setVisibility(0);
          viewGroup.setOnTouchListener(this.a.r);
          int childCount = viewGroup.getChildCount();
          int i = 0;
          while (i < childCount) {
             View childAt = viewGroup.getChildAt(i);
             int i1 = 0;
             if (!childAt instanceof PictureFakeView) {
                childAt = i1;
             }
             if (childAt != null) {
                a.o(list, "elementList");
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                   Object obj = iterator.next();
                   Object obj1 = obj;
                   a.o(obj1, "it");
                   int layerIndex = obj1.getLayerIndex();
                   Object tag = childAt.getTag();
                   obj1 = (tag instanceof Integer && layerIndex == tag.intValue())? 1: null;
                   if (obj1) {
                      i1 = obj;
                      break ;
                   }
                }
                if (i1 != null) {
                   childAt.setVisibility(0);
                }else {
                   childAt.setVisibility(8);
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
