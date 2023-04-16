package com.yxcorp.gifshow.v3.bubble.i;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.bubble.d;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import faa.a;
import q87.c;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import zyc.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.bubble.h;
import java.lang.Runnable;
import ekd.k1;

public class i extends RecyclerView$r	// class@000d38
{
    public final List a;
    public final d b;

    public void i(d p0,List p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(RecyclerView p0,int p1){
       int i;
       Object[] objArray;
       int i3;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oi, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       Iterator iterator = this.b.F.iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          EditorItemFunc editorItemFu = obj.getEditorItemFunc();
          i = this.a.indexOf(editorItemFu);
          String str = "BubbleTipPresenter";
          int i1 = 0;
          if (i == -1) {
             objArray = new Object[i1];
             a.D().w(str, "initScrollListener itemModelList.indexOf\(itemModel\) == -1", objArray);
             return;
          }else if(obj.couldShow()){
             EditBubbleItem rELAY_VIDEO_ = EditBubbleItem.RELAY_VIDEO_NEW;
             if (obj == rELAY_VIDEO_ || obj == EditBubbleItem.RELAY_PHOTO_NEW) {
                int i2 = (obj == rELAY_VIDEO_)? 0x7f103d68: 0x7f103d69;
                f.o(this.b.getActivity(), i2, i1, 4, null);
                i3 = i2;
             label_006e :
                if (p0.getLayoutManager() == null) {
                   objArray = new Object[i1];
                   a.D().s(str, "initScrollListener recyclerView.getLayoutManager\(\) is null", objArray);
                   return;
                }else {
                   View view = p0.getLayoutManager().findViewByPosition(i);
                   if (view == null || view.getVisibility()) {
                      objArray = new Object[i1];
                      a.D().s(str, "initScrollListener anchorView is null or not visible", objArray);
                      break ;
                   }else {
                      Rect rect = new Rect();
                      view.getGlobalVisibleRect(rect);
                      int i4 = rect.right - rect.left;
                      if (i4 >= view.getWidth()) {
                         h oh = new h(this, editorItemFu, obj, i3, view);
                         k1.o(v7);
                      }
                   }
                }
             }
          }
          i3 = null;
          goto label_006e ;
       }
       return;
    }
}
