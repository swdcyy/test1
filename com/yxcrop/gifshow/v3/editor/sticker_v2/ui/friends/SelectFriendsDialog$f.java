package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$f;
import com.yxcorp.gifshow.widget.m;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList;
import java.util.List;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$a;
import androidx.fragment.app.KwaiDialogFragment;

public final class SelectFriendsDialog$f extends m	// class@000aae
{
    public final SelectFriendsDialog c;

    public void SelectFriendsDialog$f(SelectFriendsDialog p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendsDialog$f.class, "1")) {
          return;
       }
       this.c.D.a(this.c.B.i2());
       this.c.dismissAllowingStateLoss();
       return;
    }
}
