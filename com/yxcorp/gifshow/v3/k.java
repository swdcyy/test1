package com.yxcorp.gifshow.v3.k;
import erd.g;
import com.yxcorp.gifshow.v3.EditorActivity;
import java.util.List;
import java.lang.Object;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.b$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.EditorActivity$PreviewTabInfo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ooc.y;
import java.lang.Runnable;
import t45.c;

public final class k implements g	// class@00153f
{
    public final EditorActivity b;
    public final List c;

    public void k(EditorActivity p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       if (tb.m1 != null) {
          boolean b = false;
          tb.m1 = b;
          EditorActivity uEditorActiv = EditorActivity.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, uEditorActiv, "45")) {
             if (!PatchProxy.applyVoid(objArray, tb, uEditorActiv, "46")) {
                EditorActivity$PreviewTabInfo vIDEO = EditorActivity$PreviewTabInfo.VIDEO;
                Fragment uFragment = tb.getSupportFragmentManager().findFragmentByTag(vIDEO.mPageKey);
                if (uFragment != null) {
                   tb.getSupportFragmentManager().beginTransaction().u(uFragment).o();
                }
                tb.V[tb.K3(vIDEO)] = objArray;
             }
             tb.T3();
             tb.S3();
             tb.y3();
             uEditorActiv = tb.f1;
             if (uEditorActiv != null) {
                objArray = new Object[]{tb};
                uEditorActiv.i(objArray);
             }
          }
          c.a(new y(tc));
       }
       return;
    }
}
