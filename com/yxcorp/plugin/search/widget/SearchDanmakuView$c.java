package com.yxcorp.plugin.search.widget.SearchDanmakuView$c;
import android.os.Handler;
import com.yxcorp.plugin.search.widget.SearchDanmakuView;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.View;
import ufd.i;
import android.content.Context;

public class SearchDanmakuView$c extends Handler	// class@0007d7
{
    public WeakReference a;

    public void SearchDanmakuView$c(SearchDanmakuView p0){
       super();
       this.a = new WeakReference(p0);
    }
    public void handleMessage(Message p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchDanmakuView$c.class, str)) {
          return;
       }
       SearchDanmakuView$c ta = this.a;
       if (ta != null) {
          SearchDanmakuView searchDanmak = ta.get();
          if (searchDanmak != null) {
             Objects.requireNonNull(searchDanmak);
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, searchDanmak, SearchDanmakuView.class, str) && searchDanmak.g != null) {
                if (searchDanmak.getChildCount() > 0) {
                   if (!PatchProxy.applyVoid(objArray, searchDanmak, SearchDanmakuView.class, "3")) {
                      int i = 0;
                      while (i < searchDanmak.getChildCount()) {
                         View childAt = searchDanmak.getChildAt(i);
                         int i1 = (int)childAt.getY();
                         if (!i) {
                            int i2 = childAt.getHeight() + i1;
                            if (i2 < 0) {
                               searchDanmak.e.c(childAt);
                               searchDanmak.removeView(childAt);
                               i = i - 1;
                            }else {
                               searchDanmak.i(childAt, 0);
                               childAt.getHeight();
                            }
                         }else {
                            searchDanmak.i(childAt, 0);
                            childAt.getHeight();
                         }
                         int i3 = searchDanmak.getChildCount() - 1;
                         if (i == i3 && i1 < searchDanmak.n) {
                            i3 = searchDanmak.f + 1;
                            if (i3 >= searchDanmak.e.e()) {
                               if (searchDanmak.l != null && searchDanmak.f >= searchDanmak.getChildCount()) {
                                  searchDanmak.f = 0;
                               }
                            }else {
                               i3 = searchDanmak.f + 1;
                               searchDanmak.f = i3;
                            }
                            searchDanmak.b(searchDanmak.e.f(searchDanmak.getContext(), searchDanmak.f, searchDanmak.e.h()));
                            i = i + 1;
                         }
                      label_00b4 :
                         i = i + 1;
                      }
                   }
                }else if(searchDanmak.k != null){
                   searchDanmak.g();
                }else {
                   searchDanmak.d();
                }
             }
          }
       }
       return;
    }
}
