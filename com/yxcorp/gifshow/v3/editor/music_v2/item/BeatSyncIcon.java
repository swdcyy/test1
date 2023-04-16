package com.yxcorp.gifshow.v3.editor.music_v2.item.BeatSyncIcon;
import com.yxcorp.gifshow.v3.editor.item.EditIcon;
import ooc.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import yvc.a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import soc.j$b;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.item.PostBaseIcon;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.robust.PatchProxyResult;

public final class BeatSyncIcon extends EditIcon	// class@001095
{
    public boolean beatSyncApplied;
    public boolean beatSyncEnabled;

    public void BeatSyncIcon(g p0,int p1,int p2){
       a.p(p0, "model");
       super(p0, p1, p2);
    }
    public void bindIconView(a p0,EditorItemFunc p1,j$b p2,EditorDelegate p3,Context p4){
       RecyclerView$ViewHolder itemView;
       if (PatchProxy.isSupport(BeatSyncIcon.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, BeatSyncIcon.class, "2")) {
             return;
          }
       }
       a.p(p1, "model");
       a.p(p2, "holder");
       a.p(p3, "editorDelegate");
       a.p(p4, "context");
       super.bindIconView(p0, p1, p2, p3, p4);
       String str = "holder.itemView";
       if (this.beatSyncEnabled == null) {
          itemView = p2.itemView;
          a.o(itemView, str);
          itemView.setAlpha(0x3f000000);
          p2.b.setImageDrawable(this.getOriginIconDrawable(p4.getResources()));
       }else {
          itemView = p2.itemView;
          a.o(itemView, str);
          itemView.setAlpha(0x3f800000);
          if (this.beatSyncApplied != null) {
             p2.b.setImageDrawable(this.getSuccessIconDrawable(p4));
          }else {
             p2.b.setImageDrawable(this.getOriginIconDrawable(p4.getResources()));
          }
       }
       return;
    }
    public final boolean getBeatSyncApplied(){
       return this.beatSyncApplied;
    }
    public final boolean getBeatSyncEnabled(){
       return this.beatSyncEnabled;
    }
    public final void setBeatSyncApplied(boolean p0){
       this.beatSyncApplied = p0;
    }
    public final void setBeatSyncEnabled(boolean p0){
       this.beatSyncEnabled = p0;
    }
    public PostBaseIcon setEditorDelegate(EditorDelegate p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BeatSyncIcon.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "editorDelegate");
       PostBaseIcon postBaseIcon = super.setEditorDelegate(p0);
       a.o(postBaseIcon, "super.setEditorDelegate\(editorDelegate\)");
       return postBaseIcon;
    }
}
