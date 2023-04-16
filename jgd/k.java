package jgd.k;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import yfd.b;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.plugin.setting.helper.j;

public class k implements SlipSwitchButton$b	// class@0016e7
{
    public GifshowActivity a;
    public j b;

    public void k(){
       super();
    }
    public void a(SlipSwitchButton p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "1")) {
          return;
       }
       if (PatchProxy.isSupport(ok) && (!PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "2") && p1 != (QCurrentUser.ME.isWifiPreloadDeny() ^ 0x01))) {
          Object[] objArray = new Object[0];
          b.C().w("EntryHolderFactory", "newWifiPreUpload value:"+p1, objArray);
          this.b.k(p0, "wifi_preupload_deny", (p1 ^ 0x01));
       }
       return;
    }
}
