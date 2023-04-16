package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import com.yxcorp.gifshow.recycler.fragment.RecyclerDialogFragment;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$b;
import y8c.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$d;
import com.kwai.library.widget.refresh.RefreshLayout;
import g9c.d;
import c9c.c;
import qvb.i;
import java.util.Map;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import qrd.l1;
import java.util.HashMap;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$e;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$f;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$g;
import com.kwai.feature.post.api.music.widget.DragScrollContainerLayout$b;
import y8c.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$c;

public final class SelectFriendsDialog extends RecyclerDialogFragment	// class@000ab0
{
    public View A;
    public final RelayInputPageList B;
    public a C;
    public final SelectFriendsDialog$a D;
    public HashMap E;
    public int z;

    public void SelectFriendsDialog(SelectFriendsDialog$a p0){
       a.p(p0, "callBack");
       super();
       this.D = p0;
       this.B = new RelayInputPageList(false);
       this.C = new SelectFriendsDialog$b(this);
    }
    public t Ah(){
       Object obj = PatchProxy.apply(null, this, SelectFriendsDialog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       RecyclerDialogFragment tq = this.q;
       a.o(tq, "mRecyclerHandler");
       d uod = tq.a();
       SelectFriendsDialog$d uod1 = new SelectFriendsDialog$d(this, this.Ac(), uod, this.q(), false);
       return obj;
    }
    public boolean S1(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d14ac;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SelectFriendsDialog.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(SelectFriendsDialog.class, null);
       return objectsByTag;
    }
    public d ia(){
       RecyclerDialogFragment obj = PatchProxy.apply(null, this, SelectFriendsDialog.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       a.o(obj, "mRecyclerHandler");
       d uod = obj.a();
       a.o(uod, "mRecyclerHandler.headerFooterAdapter");
       return uod;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendsDialog.class, "1")) {
          return;
       }
       super.onActivityCreated(p0);
       Dialog dialog = this.getDialog();
       if (dialog != null) {
          Window window = dialog.getWindow();
          if (window != null) {
             a.o(window, "it");
             WindowManager$LayoutParams attributes = window.getAttributes();
             attributes.width = -1;
             attributes.height = this.z;
             attributes.windowAnimations = 0x7f11000c;
             window.setAttributes(attributes);
             window.setFlags(0x20000, 0x20000);
             window.setGravity(80);
          }
       }
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, SelectFriendsDialog.class, "10")) {
       }else {
          SelectFriendsDialog tE = this.E;
          if (tE != null) {
             tE.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SelectFriendsDialog.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       p0.findViewById(R.id.btn_close).setOnClickListener(new SelectFriendsDialog$e(this));
       view = p0.findViewById(R.id.btn_selected);
       this.A = view;
       if (view != null) {
          view.setOnClickListener(new SelectFriendsDialog$f(this));
       }
       DragScrollContainerLayout uDragScrollC = p0.findViewById(R.id.root_layout);
       uDragScrollC.setOnDragListener(new SelectFriendsDialog$g(this));
       uDragScrollC.setMaxDragSlop((this.z / 2));
       return;
    }
    public boolean th(){
       return true;
    }
    public g xh(){
       Object obj = PatchProxy.apply(null, this, SelectFriendsDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new SelectFriendsDialog$c(this);
    }
    public i zh(){
       return this.B;
    }
}
