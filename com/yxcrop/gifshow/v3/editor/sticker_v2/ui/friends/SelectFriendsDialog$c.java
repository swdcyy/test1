package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$c;
import y8c.g;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import omd.a;
import z1.a;
import ml8.c;

public final class SelectFriendsDialog$c extends g	// class@000aab
{
    public final SelectFriendsDialog w;

    public void SelectFriendsDialog$c(SelectFriendsDialog p0){
       this.w = p0;
       super();
    }
    public f h1(ViewGroup p0,int p1){
       SelectFriendsDialog$c uoc = SelectFriendsDialog$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d14a9), new a(this.w.C));
    }
}
