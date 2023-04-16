package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$e;
import android.view.View$OnClickListener;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public final class SelectFriendsDialog$e implements View$OnClickListener	// class@000aad
{
    public final SelectFriendsDialog b;

    public void SelectFriendsDialog$e(SelectFriendsDialog p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendsDialog$e.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
