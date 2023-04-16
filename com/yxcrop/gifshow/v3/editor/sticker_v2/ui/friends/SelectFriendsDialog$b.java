package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog$b;
import z1.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.friends.SelectFriendsDialog;
import java.lang.Object;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.RelayDataItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.relay.RelayInputPageList;
import com.yxcrop.gifshow.v3.editor.sticker_v2.data.relay.Friend;
import faa.a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import w46.b;
import com.yxcorp.gifshow.record.interactive.RelayUserInfo;
import java.util.ArrayList;

public final class SelectFriendsDialog$b implements a	// class@000aaa
{
    public final SelectFriendsDialog a;

    public void SelectFriendsDialog$b(SelectFriendsDialog p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SelectFriendsDialog$b.class, "1")) {
       }else {
          SelectFriendsDialog b = this.a.B;
          String str = "it";
          a.o(p0, str);
          Objects.requireNonNull(b);
          if (!PatchProxy.applyVoidOneRefs(p0, b, RelayInputPageList.class, "2")) {
             a.p(p0, str);
             if (p0.getFriend() == null) {
                a.D().e("RelayInputPageList", "updateSelect: ", new IllegalArgumentException("friend is null"));
             }else {
                RelayUserInfo relayUserInf = new RelayUserInfo(p0.getFriend().getUserId(), p0.getFriend().getLocalFile(), p0.getFriend().getUserAvatar());
                if (b.p.contains(relayUserInf) && !p0.isSelected()) {
                   b.p.remove(relayUserInf);
                }else if(p0.isSelected()){
                   b.p.add(relayUserInf);
                }
             }
          }
       }
       return;
    }
}
