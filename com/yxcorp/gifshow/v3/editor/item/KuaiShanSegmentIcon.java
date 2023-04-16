package com.yxcorp.gifshow.v3.editor.item.KuaiShanSegmentIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ooc.g;
import yvc.a;
import soc.j$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.widget.TextView;

public final class KuaiShanSegmentIcon extends EditIcon	// class@000fb3
{
    public final String title;

    public void KuaiShanSegmentIcon(EditorItemFunc p0,int p1,int p2,String p3){
       a.p(p0, "model");
       super(p0, p1, p2);
       this.title = p3;
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       j$b a;
       if (PatchProxy.isSupport(KuaiShanSegmentIcon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, KuaiShanSegmentIcon.class, "1")) {
             return;
          }
       }
       a.p(p0, "item");
       a.p(p1, "model");
       a.p(p2, "holder");
       a.p(p3, "editorDelegate");
       a.p(p4, "context");
       super.bindIconView(p0, p1, p2, p3, p4);
       if (!TextUtils.x(this.title)) {
          a = p2.a;
          a.o(a, "holder.textView");
          a.setText(this.title);
       }
       return;
    }
}
