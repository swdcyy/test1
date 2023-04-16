package com.yxcorp.gifshow.v3.editor.item.RelayIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ooc.g;
import yvc.a;
import soc.j$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.ViewGroup;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.image.KwaiImageView;
import wsc.h;
import k2b.v1$d;
import k2b.v1$f;

public final class RelayIcon extends EditIcon	// class@000fb5
{

    public void RelayIcon(EditorItemFunc p0){
       a.p(p0, "func");
       super(p0, 0, 0);
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       j$b a;
       int b;
       int i = 0;
       if (PatchProxy.isSupport(RelayIcon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, RelayIcon.class, "1")) {
             return;
          }
       }
       a.p(p0, "item");
       a.p(p1, "model");
       a.p(p2, "holder");
       a.p(p3, "editorDelegate");
       a.p(p4, "context");
       RecyclerView$ViewHolder itemView = p2.itemView;
       a.o(itemView, "holder.itemView");
       itemView.setActivated(1);
       a = p2.a;
       a.o(a, "holder.textView");
       a.setActivated(1);
       a = p2.b;
       a.o(a, "holder.iconView");
       a.setActivated(1);
       a = p2.d;
       if (a != null) {
          a.o(a, "holder.progressLayout");
          a.setVisibility(8);
       }
       a = p2.c;
       if (a != null) {
          a.o(a, "holder.newIndicator");
          if (!p0.d()) {
             i = 8;
          }
          a.setVisibility(i);
       }
       int i1 = 0x7f103d71;
       if (f.E(p3.getType())) {
          if (!PatchProxy.applyVoidOneRefs(p2, this, RelayIcon.class, "2")) {
             b = PostExperimentUtils.T();
             j$b a1 = p2.a;
             if (!b) {
                i1 = 0x7f103d72;
             }
             a1.setText(i1);
             a = p2.b;
             b = (b)? 0x7f081c91: 0x7f080903;
             a.setImageResource(b);
             h.a.c("yitian").show();
          }
       }else if(PatchProxy.applyVoidOneRefs(p2, this, RelayIcon.class, "3")){
          p2.a.setText(i1);
          a = p2.b;
          b = (PostExperimentUtils.S())? 0x7f081c8f: 0x7f08087b;
          a.setImageResource(b);
          h.a.c("kuaiying").show();
       }
       return;
    }
}
